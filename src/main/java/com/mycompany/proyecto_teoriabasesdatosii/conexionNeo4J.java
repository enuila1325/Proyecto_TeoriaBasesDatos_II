package com.mycompany.proyecto_teoriabasesdatosii;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;

public class conexionNeo4J implements AutoCloseable {

    private final Driver driver;

    public conexionNeo4J(String uri, String user, String password) {
        driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
    }

    @Override
    public void close() throws Exception {
        driver.close();
    }

    public void actualizarAdmin() {
        try (Session session = driver.session()) {

            try {
                String greeting = session.writeTransaction(new TransactionWork<String>() {

                    @Override
                    public String execute(Transaction tx) {
                        Result result = tx.run("MATCH (ca:Categoria), (c:Clase) WHERE ca.idClase = c.idClase MERGE (ca)-[:ES_DE]->(c) return c.nombre;");
                        return result.list().get(0).get(0).asString();
                    }
                });
            } catch (Exception ex) {
            }

            try {
                String greeting2 = session.writeTransaction(new TransactionWork<String>() {

                    @Override
                    public String execute(Transaction tx) {
                        Result result = tx.run("MATCH (e:Examen), (c:Clase) WHERE e.idClase = c.idClase MERGE (c)-[:TIENE]->(e) RETURN c.nombre;");
                        return result.list().get(0).get(0).asString();
                    }
                });
            } catch (Exception ex) {
            }
            try {
                String greeting5 = session.writeTransaction(new TransactionWork<String>() {

                    @Override
                    public String execute(Transaction tx) {
                        Result result = tx.run("MATCH (p:Pregunta), (c:Categoria) WHERE p.idCategoria = c.idCategoria MERGE (p)-[:PERTENECE_A]->(c) return p.titulo;");
                        return result.list().get(0).get(0).asString();
                    }
                });
            } catch (Exception ex) {
            }
            try {
                String greeting7 = session.writeTransaction(new TransactionWork<String>() {

                    @Override
                    public String execute(Transaction tx) {
                        Result result = tx.run("MATCH (c:Clase), (m:Matricula) WHERE c.idClase = m.idClaseMatriculada MERGE (c)-[:TIENE_MATRICULADO_A]->(m) RETURN 'funciona';");
                        return result.list().get(0).get(0).asString();
                    }
                });
            } catch (Exception ex) {
            }

        }
    }

    public void actualizarAlumnos() {
        try (Session session = driver.session()) {
            try {
                String greeting3 = session.writeTransaction(new TransactionWork<String>() {
                    @Override
                    public String execute(Transaction tx) {
                        Result result = tx.run("MATCH (a:Alumno), (r:Resultado) WHERE a.id = r.idAlumno MERGE (a)-[:CALIFICO]->(r) RETURN a.nombre;");
                        return result.list().get(0).get(0).asString();
                    }
                });
            } catch (Exception ex) {
            }
            try {
                String greeting4 = session.writeTransaction(new TransactionWork<String>() {

                    @Override
                    public String execute(Transaction tx) {
                        Result result = tx.run("MATCH (e:Examen), (r:Resultado) WHERE e.idExamen = r.idExamen MERGE (e)-[:FUE_EVALUADO]->(r) RETURN 'funciona';");
                        return result.list().get(0).get(0).asString();
                    }
                });

            } catch (Exception ex) {
            }
            try {
                String greeting6 = session.writeTransaction(new TransactionWork<String>() {

                    @Override
                    public String execute(Transaction tx) {
                        Result result = tx.run("MATCH (a:Alumno), (m:Matricula) WHERE a.id = m.idAlumno MERGE (a)-[:MATRICULO_EN]->(m) RETURN 'funciona';");
                        return result.list().get(0).get(0).asString();
                    }
                });
            } catch (Exception ex) {
            }
        }
    }

}
