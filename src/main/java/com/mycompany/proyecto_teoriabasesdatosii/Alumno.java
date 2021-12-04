package com.mycompany.proyecto_teoriabasesdatosii;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;
import static org.neo4j.driver.Values.parameters;

public class Alumno {

    private int id;
    private String nombre;
    private String login;
    private String password;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String login, String password) {
        this.id = id;
        this.nombre = nombre;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void insertAlumno() {

        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));

        try (Session session = driver.session()) {
            String greeting = session.writeTransaction(new TransactionWork<String>() {

                @Override
                public String execute(Transaction tx) {
                    Result result = tx.run("CREATE (a:Alumno) "
                            + "SET a.id = $id, a.login = $login, a.nombre = $nombre, a.password = $password RETURN a.nombre;",
                            parameters("id", id, "login", login, "nombre", nombre, "password", password));
                    return result.single().get(0).asString();
                }
            });
        }
    }
}
