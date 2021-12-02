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

public class ResultadoExamen {

    private int idAlumno;
    private int idExamen;
    private ArrayList<Boolean> preguntas = new ArrayList<>();
    private ArrayList<Integer> idPreguntas = new ArrayList<>();
    private ArrayList<Boolean> respuestasDadas = new ArrayList<>();
    private int notaFinal;

    public ResultadoExamen() {
    }

    public ResultadoExamen(int idAlumno, int idExamen, int notaFinal) {
        this.idAlumno = idAlumno;
        this.idExamen = idExamen;
        this.notaFinal = notaFinal;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public ArrayList<Boolean> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Boolean> preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList<Boolean> getRespuestasDadas() {
        return respuestasDadas;
    }

    public void setRespuestasDadas(ArrayList<Boolean> respuestasDadas) {
        this.respuestasDadas = respuestasDadas;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public ArrayList<Integer> getIdPreguntas() {
        return idPreguntas;
    }

    public void setIdPreguntas(ArrayList<Integer> idPreguntas) {
        this.idPreguntas = idPreguntas;
    }

    public void insertResultado() {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));

        try (Session session = driver.session()) {
            String greeting = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("CREATE (r:Resultado) "
                            + "SET r.idAlumno = $id, r.idExamen = $idExamen, r.idPreguntas = $preguntas , r.nota = $nota, r.respuestasDadas = $respuestas RETURN r.idAlumno+', termino';",
                            parameters("id", idAlumno, "idExamen", idExamen, "preguntas", idPreguntas, "nota", notaFinal, "respuestas", respuestasDadas));
                    return result.single().get(0).asString();
                }
            });
        }
    }
}
