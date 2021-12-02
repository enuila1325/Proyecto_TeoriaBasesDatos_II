package com.mycompany.proyecto_teoriabasesdatosii;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Record;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;

public class Administrador {

    Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));
    private final ArrayList<Alumno> alumnosEnSistema = new ArrayList<>();
    private final ArrayList<Examen> examenesEnSistema = new ArrayList<>();
    private final ArrayList<Categoria> categoriasEnSistema = new ArrayList<>();
    private final ArrayList<Pregunta> preguntasEnSistema = new ArrayList<>();
    private final ArrayList<Clase> clasesEnSistema = new ArrayList<>();
    private final ArrayList<ResultadoExamen> resultadosEnSistema = new ArrayList<>();

    public ArrayList<Alumno> cargarAlumnos() {

        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                Result result = tx.run("MATCH (a: Alumno) RETURN a.id, a.login, a.nombre, a.password ORDER BY a.id DESC");
                while (result.hasNext()) {
                    int id = Integer.parseInt(result.next().get(0).asObject().toString());
                    String login = result.next().get(1).asObject().toString();
                    String nombre = result.next().get(2).asObject().toString();
                    String password = result.next().get(3).asObject().toString();
                    Alumno a = new Alumno(id, nombre, login, password);
                    alumnosEnSistema.add(a);
                }
                return alumnosEnSistema;
            });
        }
    }

    public ArrayList<Pregunta> cargarPreguntas() {

        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                Result result = tx.run("MATCH (p: Pregunta) RETURN p.idPregunta, p.idClase, p.titulo, p.descripcion, p.respuesta, p.idCategoria ORDER BY p.idPregunta ASC");
                while (result.hasNext()) {
                    Record r = result.next();
                    preguntasEnSistema.add(mapToPregunta(r));
                }
                return preguntasEnSistema;
            });
        }
    }

    public ArrayList<Examen> cargarExamenes() {

        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                Result result = tx.run("MATCH (e: Examen) RETURN e.idExamen, e.idClase, e.noPreguntas, e.fecha ORDER BY e.idExamen ASC");
                while (result.hasNext()) {
                    Record r = result.next();
                    examenesEnSistema.add(mapToExamen(r));
                }
                return examenesEnSistema;
            });
        }
    }

    public ArrayList<Categoria> cargarCategorias() {

        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                Result result = tx.run("MATCH (c: Categoria) RETURN c.idCategoria, c.idClase, c.nombreCategoria ORDER BY c.idCategoria ASC");
                while (result.hasNext()) {
                    Record r = result.next();
                    categoriasEnSistema.add(mapToCategoria(r));
                }
                return categoriasEnSistema;
            });
        }
    }

    public ArrayList<Clase> cargarClases() {

        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                Result result = tx.run("MATCH (c: Clase) RETURN c.idClase, c.nombreClase ORDER BY c.idClase ASC");
                while (result.hasNext()) {
                    Record r = result.next();
                    clasesEnSistema.add(mapToClase(r));
                }

                return clasesEnSistema;
            });
        }

    }

    public ArrayList<ResultadoExamen> cargarResultados() {
        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                Result result = tx.run("MATCH (r: Resultado) RETURN r.idAlumno, r.idExamen, r.idPreguntas, r.nota, r.respuestasDadas");
                while (result.hasNext()) {
                    Record r = result.next();
                    resultadosEnSistema.add(mapToResultado(r));
                }
                return resultadosEnSistema;
            });
        }
    }

    public Clase mapToClase(Record record) {
        Clase c = new Clase();
        c.setIdClase(record.get("c.idClase").asInt());
        c.setNombre(record.get("c.nombreClase").asString());
        return c;
    }

    public ResultadoExamen mapToResultado(Record record) {
        ResultadoExamen re = new ResultadoExamen();
        re.setIdAlumno(record.get("r.idAlumno").asInt());
        re.setIdExamen(record.get("r.idExamen").asInt());
        re.setNotaFinal(record.get("r.nota").asInt());
        List<Object> aux = record.get("r.idPreguntas").asList();
        ArrayList<Integer> preguntas = new ArrayList<>();
        for (int i = 0; i < aux.size(); i++) {
            preguntas.add(Integer.parseInt(aux.get(i).toString()));
        }
        re.setIdPreguntas(preguntas);
        List<Object> aux2 = record.get("r.respuestasDadas").asList();
        ArrayList<Boolean> respDadas = new ArrayList<>();
        for (int i = 0; i < aux2.size(); i++) {
            respDadas.add(Boolean.parseBoolean(aux.get(i).toString()));
        }
        re.setRespuestasDadas(respDadas);
        return re;
    }

    public Examen mapToExamen(Record r) {
        Examen e = new Examen();
        e.setIdExamen(r.get("e.idExamen").asInt());
        e.setIdClase(r.get("e.idClase").asInt());
        e.setCantPreguntas(r.get("e.noPreguntas").asInt());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate date = r.get("e.fecha").asLocalDate();
        Date fecha = Date.from(date.atStartOfDay(defaultZoneId).toInstant());
        String fechaExamen = format.format(fecha);
        e.setFechaRealizacion(fechaExamen);
        return e;
    }

    public Alumno mapToAlumno(Record record) {
        Alumno a = new Alumno();
        a.setId(record.get("a.id").asInt());
        a.setLogin(record.get("a.login").asString());
        a.setNombre(record.get("a.nombre").asString());
        a.setPassword(record.get("a.password").asString());
        return a;
    }

    public Pregunta mapToPregunta(Record record) {
        Pregunta p = new Pregunta();
        p.setIdPregunta(record.get("p.idPregunta").asInt());
        p.setIdCategoria(record.get("p.idCategoria").asInt());
        p.setIdClase(record.get("p.idClase").asInt());
        p.setTitulo(record.get("p.titulo").asString());
        p.setDescrpcion(record.get("p.descripcion").asString());
        p.setRespuesta(record.get("p.respuesta").asBoolean());
        return p;
    }

    public Categoria mapToCategoria(Record record) {
        Categoria c = new Categoria();
        c.setIdCategoria(record.get("c.idCategoria").asInt());
        c.setIdClase(record.get("c.idClase").asInt());
        c.setNombreCategoria(record.get("c.nombreCategoria").asString());
        return c;
    }
}
