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

public class Categoria {

    private int idCategoria;
    private String nombreCategoria;
    private int idClase;
    private ArrayList<Pregunta> preguntasDecategoria = new ArrayList<>();

    public Categoria() {
    }

    public Categoria(int idCategoria, String nombreCategoria, int idClase) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.idClase = idClase;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public ArrayList<Pregunta> getPreguntasDecategoria() {
        return preguntasDecategoria;
    }

    public void setPreguntasDecategoria(ArrayList<Pregunta> preguntasDecategoria) {
        this.preguntasDecategoria = preguntasDecategoria;
    }

    public void insertCategoria() {

        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));

        try (Session session = driver.session()) {
            String greeting = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("CREATE (c:Categoria) "
                            + "SET c.idCategoria = $idCategoria, c.idClase = $idClase, c.nombreCategoria = $nombre RETURN c.nombreCategoria;",
                            parameters("idCategoria", idCategoria, "idClase", idClase, "nombre", nombreCategoria));
                    return result.single().get(0).asString();
                }
            });
        }
    }

}
