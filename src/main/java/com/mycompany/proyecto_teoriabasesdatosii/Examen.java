package com.mycompany.proyecto_teoriabasesdatosii;

import java.util.ArrayList;
import java.util.Date;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;
import static org.neo4j.driver.Values.parameters;

public class Examen {

    private int idExamen;
    private int idClase;
    private int cantPreguntas;
    private String fechaRealizacion;
    private ArrayList<Pregunta> preguntasDeExamen = new ArrayList<>();
    private ArrayList<Boolean> respuestasDadas = new ArrayList<>();

    public Examen() {
    }

    public Examen(int idExamen, int idClase, int cantPreguntas, String fechaRealizacion) {
        this.idExamen = idExamen;
        this.idClase = idClase;
        this.cantPreguntas = cantPreguntas;
        this.fechaRealizacion = fechaRealizacion;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public int getCantPreguntas() {
        return cantPreguntas;
    }

    public void setCantPreguntas(int cantPreguntas) {
        this.cantPreguntas = cantPreguntas;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public void insertExamen() {

        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));

        try (Session session = driver.session()) {
            String greeting = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("CREATE (e:Examen) "
                            + "SET e.idExamen = $id, e.idClase = $idClase, e.noPreguntas = $noPreguntas , e.fecha = date($fecha) RETURN 'funciona';",
                            parameters("id", idExamen, "idClase", idClase, "noPreguntas", cantPreguntas, "fecha", fechaRealizacion));
                    return result.single().get(0).asString();
                }
            });
        }
    }

}
