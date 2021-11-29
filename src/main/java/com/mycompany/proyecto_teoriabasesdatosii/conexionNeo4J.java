/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_teoriabasesdatosii;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;

import static org.neo4j.driver.Values.parameters;

public class conexionNeo4J implements AutoCloseable {

    private final Driver driver;

    public conexionNeo4J(String uri, String user, String password) {
        driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
    }

    @Override
    public void close() throws Exception {
        driver.close();
    }

    public void insertAlumno(final String[] atributos) {

        int id = Integer.parseInt(atributos[0]);

        try (Session session = driver.session()) {
            String greeting = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("CREATE (a:Alumno) "
                            + "SET a.id = $id, a.login = $login, a.nombre = $nombre, a.password = $password RETURN a.nombre;",
                            parameters("id", id, "login", atributos[1], "nombre", atributos[2], "password", atributos[3]));
                    return result.single().get(0).asString();
                }
            });
        }
    }

    public void insertClase(final String nombreClase, final int idClase) {

        try (Session session = driver.session()) {
            String greeting = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("CREATE (c:Clase) "
                            + "SET c.idClase = $id, c.nombre = $nombre RETURN c.nombre;",
                            parameters("id", idClase, "nombre", nombreClase));
                    return result.single().get(0).asString();
                }
            });
        }
    }

    public void insertExamen(final String[] atributos) {

        int id = Integer.parseInt(atributos[0]);
        int idClase = Integer.parseInt(atributos[1]);
        int noPreguntas = Integer.parseInt(atributos[2]);

        try (Session session = driver.session()) {
            String greeting = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("CREATE (e:Examen) "
                            + "SET e.idExamen = $id, e.idClase = $idClase, e.noPreguntas = $noPreguntas , e.fecha = $fecha RETURN 'funciona';",
                            parameters("id", id, "idClase", idClase, "noPreguntas", noPreguntas, "fecha", atributos[3]));
                    return result.single().get(0).asString();
                }
            });
        }

    }

    public void insertPregunta(final String[] atributos) {
        int id = Integer.parseInt(atributos[0]);
        int idClase = Integer.parseInt(atributos[1]);
        boolean resp = Boolean.parseBoolean(atributos[4]);

        try (Session session = driver.session()) {
            String greeting = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("CREATE (p:Pregunta) "
                            + "SET p.idPregunta = $id, p.idClase = $idClase, p.titulo = $titulo , p.descripcion = $descripcion, p.respuesta = $respuesta RETURN p.titulo;",
                            parameters("id", id, "idClase", idClase, "titulo", atributos[2], "descripcion", atributos[3], "respuesta", resp));
                    return result.single().get(0).asString();
                }
            });
        }
    }

    public void insertResultado(final String[] atributos, ArrayList<Boolean> resp, ArrayList<Integer> idPreguntas) {
        int id = Integer.parseInt(atributos[0]);
        int idExamen = Integer.parseInt(atributos[1]);
        int nota = Integer.parseInt(atributos[2]);

        try (Session session = driver.session()) {
            String greeting = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("CREATE (r:Resultado) "
                            + "SET r.idAlumno = $id, r.idExamen = $idExamen, r.idPreguntas = $preguntas , r.nota = $nota, r.respuestasDadas = $respuestas RETURN r.idAlumno+', termino';",
                            parameters("id", id, "idExamen", idExamen, "preguntas", idPreguntas, "nota", nota, "respuestas", resp));
                    return result.single().get(0).asString();
                }
            });
        }
    }
//Solamente existe una generación de computadoras.

    public void actualizar() {
        try (Session session = driver.session()) {
            String greeting = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("MATCH (p:Pregunta), (c:Clase) WHERE p.idClase = c.idClase MERGE (p)-[:ES_DE]->(c) return p.titulo;");
                    return result.list().get(0).get(0).asString();
                }
            });
            String greeting2 = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("MATCH (e:Examen), (c:Clase) WHERE e.idClase = c.idClase MERGE (c)-[:TIENE]->(e) RETURN c.nombre;");
                    return result.list().get(0).get(0).asString();
                }
            });

            String greeting3 = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("MATCH (a:Alumno), (r:Resultado) WHERE a.id = r.idAlumno MERGE (a)-[:CALIFICO]->(r) RETURN a.nombre;");
                    return result.list().get(0).get(0).asString();
                }
            });

            String greeting4 = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("MATCH (e:Examen), (r:Resultado) WHERE e.idExamen = r.idExamen MERGE (e)-[:FUE_EVALUADO]->(r) RETURN 'funciona';");
                    return result.list().get(0).get(0).asString();
                }
            });

        }
    }

}
