package com.mycompany.proyecto_teoriabasesdatosii;

import java.util.ArrayList;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;
import static org.neo4j.driver.Values.parameters;

public class Clase {

    private int idClase;
    private String nombreClase;
    private ArrayList<Examen> examenes = new ArrayList<>();
    private ArrayList<Pregunta> preguntas = new ArrayList<>();
    private ArrayList<Categoria> categorias = new ArrayList<>();

    public Clase() {
    }

    public Clase(int idClase, String nombre) {
        this.idClase = idClase;
        this.nombreClase = nombre;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombre() {
        return nombreClase;
    }

    public void setNombre(String nombre) {
        this.nombreClase = nombre;
    }

    public ArrayList<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(ArrayList<Examen> examenes) {
        this.examenes = examenes;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

    public void insertClase() {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));

        try (Session session = driver.session()) {
            String greeting = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("CREATE (c:Clase) "
                            + "SET c.idClase = $id, c.nombreClase = $nombreClase RETURN c.nombre;",
                            parameters("id", idClase, "nombreClase", nombreClase));
                    return result.single().get(0).asString();
                }
            });
        }
    }
}
