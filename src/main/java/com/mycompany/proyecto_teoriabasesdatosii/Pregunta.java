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

public class Pregunta {

    private int idPregunta;
    private int idCategoria;
    private int idClase;
    private String titulo;
    private String descrpcion;
    private boolean respuesta;

    public Pregunta() {
    }

    public Pregunta(int idPregunta, int idCategoria, int idClase, String titulo, String descrpcion, boolean respuesta) {
        this.idPregunta = idPregunta;
        this.idCategoria = idCategoria;
        this.idClase = idClase;
        this.titulo = titulo;
        this.descrpcion = descrpcion;
        this.respuesta = respuesta;
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    public void insertPregunta() {

        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));

        try (Session session = driver.session()) {
            String greeting = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("CREATE (p:Pregunta) "
                            + "SET p.idPregunta = $id, p.idClase = $idClase, p.titulo = $titulo , p.descripcion = $descripcion, p.respuesta = $respuesta, p.idCategoria = $idCategoria RETURN p.titulo;",
                            parameters("id", idPregunta, "idClase", idClase, "titulo", titulo, "descripcion", descrpcion, "respuesta", respuesta, "idCategoria",idCategoria));
                    return result.single().get(0).asString();
                }
            });
        }
    }


}
