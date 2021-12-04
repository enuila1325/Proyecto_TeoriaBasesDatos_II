package com.mycompany.proyecto_teoriabasesdatosii;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;
import static org.neo4j.driver.Values.parameters;

public class Matricula {

    private int idAlumno;
    private int idClaseMatriculada;
    private String fechaMatricula;

    public Matricula() {
    }

    public Matricula(int idAlumno, int idClaseMatriculada, String fechaMatricula) {
        this.idAlumno = idAlumno;
        this.idClaseMatriculada = idClaseMatriculada;
        this.fechaMatricula = fechaMatricula;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdClaseMatriculada() {
        return idClaseMatriculada;
    }

    public void setIdClaseMatriculada(int idClaseMatriculada) {
        this.idClaseMatriculada = idClaseMatriculada;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public void insertMatricula() {

        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));

        try (Session session = driver.session()) {
            String greeting = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("CREATE (m:Matricula) "
                            + "SET m.idAlumno = $id, m.idClaseMatriculada = $idClase, m.fechaMatricula = date($date) RETURN 'funciona';",
                            parameters("id", idAlumno, "idClase", idClaseMatriculada, "date", fechaMatricula));
                    return result.single().get(0).asString();
                }
            });
        }
    }
}
