package com.mycompany.proyecto_teoriabasesdatosii;

import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.neo4j.driver.AuthToken;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Transaction;
import org.neo4j.driver.TransactionWork;
import static org.neo4j.driver.Values.parameters;
import java.util.Random;

public class mainPage extends javax.swing.JFrame {

    public mainPage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaCrearExamen = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        js_cantPreguntas = new javax.swing.JSpinner();
        tf_idClassExam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_dateNewExam = new javax.swing.JTextField();
        jb_crearExamen = new javax.swing.JButton();
        pantallaRegistro = new javax.swing.JFrame();
        labelNewName = new javax.swing.JLabel();
        labelNewLogin = new javax.swing.JLabel();
        labelNewPassword = new javax.swing.JLabel();
        label_confirmPassword = new javax.swing.JLabel();
        jb_registro = new javax.swing.JButton();
        tf_newName = new javax.swing.JTextField();
        tf_newLogin = new javax.swing.JTextField();
        pf_newPassword = new javax.swing.JPasswordField();
        pf_confirmNewPassword = new javax.swing.JPasswordField();
        seleccionAdmin = new javax.swing.JFrame();
        jb_gotoCrearExamen = new javax.swing.JButton();
        jb_gotoCrearClase = new javax.swing.JButton();
        jb_gotoCrearPregunta = new javax.swing.JButton();
        jb_listarClases = new javax.swing.JButton();
        pantallaCrearPregunta = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_tituloNuevPregunta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descrpNuevaPregunta = new javax.swing.JTextArea();
        tf_codClaseNuevaPregunta = new javax.swing.JTextField();
        rb_vRespNuevaPregunta = new javax.swing.JRadioButton();
        rb_fRespNuevaPregunta = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        respNewPregunta_Grupo = new javax.swing.ButtonGroup();
        seleccionAlumno = new javax.swing.JFrame();
        jb_realizarExamen = new javax.swing.JButton();
        jb_crearCuadroNotas = new javax.swing.JButton();
        pantallaExamen = new javax.swing.JFrame();
        lb_tituloPregunta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_descrpPregunta = new javax.swing.JTextArea();
        rb_respAlumnoV = new javax.swing.JRadioButton();
        rb_respAlumnoF = new javax.swing.JRadioButton();
        jb_nextQuestion = new javax.swing.JButton();
        comenzarExamen = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        respuestaAlumno = new javax.swing.ButtonGroup();
        labelLogin = new javax.swing.JLabel();
        tf_login = new javax.swing.JTextField();
        pf_passLogin = new javax.swing.JPasswordField();
        jb_iniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jb_gotoRegistro = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jLabel2.setText("Codigo/ID Clase:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad de preguntas:");

        jLabel4.setText("Fecha:");

        jb_crearExamen.setText("CREAR EXAMEN");
        jb_crearExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearExamenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaCrearExamenLayout = new javax.swing.GroupLayout(pantallaCrearExamen.getContentPane());
        pantallaCrearExamen.getContentPane().setLayout(pantallaCrearExamenLayout);
        pantallaCrearExamenLayout.setHorizontalGroup(
            pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaCrearExamenLayout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addGroup(pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_idClassExam)
                    .addComponent(js_cantPreguntas)
                    .addComponent(tf_dateNewExam))
                .addGap(86, 86, 86))
            .addGroup(pantallaCrearExamenLayout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jb_crearExamen)
                .addContainerGap(290, Short.MAX_VALUE))
        );
        pantallaCrearExamenLayout.setVerticalGroup(
            pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaCrearExamenLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(tf_idClassExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(js_cantPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_dateNewExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jb_crearExamen)
                .addGap(49, 49, 49))
        );

        labelNewName.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        labelNewName.setText("Nombre completo:");

        labelNewLogin.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        labelNewLogin.setText("Usuario:");

        labelNewPassword.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        labelNewPassword.setText("Contraseña:");

        label_confirmPassword.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        label_confirmPassword.setText("Confirmar Contraseña:");

        jb_registro.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_registro.setText("Registrarse");
        jb_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_registroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaRegistroLayout = new javax.swing.GroupLayout(pantallaRegistro.getContentPane());
        pantallaRegistro.getContentPane().setLayout(pantallaRegistroLayout);
        pantallaRegistroLayout.setHorizontalGroup(
            pantallaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaRegistroLayout.createSequentialGroup()
                .addGroup(pantallaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantallaRegistroLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(pantallaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNewLogin)
                            .addComponent(labelNewName)
                            .addComponent(labelNewPassword)
                            .addComponent(label_confirmPassword))
                        .addGap(18, 18, 18)
                        .addGroup(pantallaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_newName)
                            .addComponent(tf_newLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(pf_newPassword)
                            .addComponent(pf_confirmNewPassword)))
                    .addGroup(pantallaRegistroLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jb_registro)))
                .addGap(42, 42, 42))
        );
        pantallaRegistroLayout.setVerticalGroup(
            pantallaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaRegistroLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(pantallaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNewName)
                    .addComponent(tf_newName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pantallaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNewLogin)
                    .addComponent(tf_newLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pantallaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNewPassword)
                    .addComponent(pf_newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(pantallaRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_confirmPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pf_confirmNewPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_registro)
                .addGap(28, 28, 28))
        );

        jb_gotoCrearExamen.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_gotoCrearExamen.setText("CREAR NUEVO EXAMEN");
        jb_gotoCrearExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_gotoCrearExamenActionPerformed(evt);
            }
        });

        jb_gotoCrearClase.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_gotoCrearClase.setText("CREAR NUEVA CLASE");
        jb_gotoCrearClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_gotoCrearClaseActionPerformed(evt);
            }
        });

        jb_gotoCrearPregunta.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_gotoCrearPregunta.setText("CREAR NUEVA PREGUNTA");
        jb_gotoCrearPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_gotoCrearPreguntaActionPerformed(evt);
            }
        });

        jb_listarClases.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_listarClases.setText("Listar clases con sus examenes");

        javax.swing.GroupLayout seleccionAdminLayout = new javax.swing.GroupLayout(seleccionAdmin.getContentPane());
        seleccionAdmin.getContentPane().setLayout(seleccionAdminLayout);
        seleccionAdminLayout.setHorizontalGroup(
            seleccionAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seleccionAdminLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(seleccionAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_gotoCrearExamen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_gotoCrearClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(seleccionAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(seleccionAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_gotoCrearPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_listarClases, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        seleccionAdminLayout.setVerticalGroup(
            seleccionAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seleccionAdminLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jb_gotoCrearExamen)
                .addGap(42, 42, 42)
                .addComponent(jb_gotoCrearClase)
                .addGap(42, 42, 42)
                .addComponent(jb_gotoCrearPregunta)
                .addGap(43, 43, 43)
                .addComponent(jb_listarClases)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jLabel6.setText("Título:");

        jLabel7.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jLabel7.setText("Descripción:");

        jLabel8.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jLabel8.setText("ID/Codigo de clase:");

        jLabel9.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jLabel9.setText("Respuesta:");

        ta_descrpNuevaPregunta.setColumns(20);
        ta_descrpNuevaPregunta.setRows(5);
        jScrollPane1.setViewportView(ta_descrpNuevaPregunta);

        respNewPregunta_Grupo.add(rb_vRespNuevaPregunta);
        rb_vRespNuevaPregunta.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        rb_vRespNuevaPregunta.setText("Verdadero");

        respNewPregunta_Grupo.add(rb_fRespNuevaPregunta);
        rb_fRespNuevaPregunta.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        rb_fRespNuevaPregunta.setText("Falso");

        jButton1.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jButton1.setText("CREAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaCrearPreguntaLayout = new javax.swing.GroupLayout(pantallaCrearPregunta.getContentPane());
        pantallaCrearPregunta.getContentPane().setLayout(pantallaCrearPreguntaLayout);
        pantallaCrearPreguntaLayout.setHorizontalGroup(
            pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaCrearPreguntaLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(155, 155, 155)
                .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_tituloNuevPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_codClaseNuevaPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(pantallaCrearPreguntaLayout.createSequentialGroup()
                            .addComponent(rb_vRespNuevaPregunta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_fRespNuevaPregunta))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );
        pantallaCrearPreguntaLayout.setVerticalGroup(
            pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaCrearPreguntaLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_tituloNuevPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_codClaseNuevaPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rb_vRespNuevaPregunta)
                    .addComponent(rb_fRespNuevaPregunta))
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        jb_realizarExamen.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_realizarExamen.setText("Realizar examen");
        jb_realizarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_realizarExamenActionPerformed(evt);
            }
        });

        jb_crearCuadroNotas.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_crearCuadroNotas.setText("Cuadro de notas");

        javax.swing.GroupLayout seleccionAlumnoLayout = new javax.swing.GroupLayout(seleccionAlumno.getContentPane());
        seleccionAlumno.getContentPane().setLayout(seleccionAlumnoLayout);
        seleccionAlumnoLayout.setHorizontalGroup(
            seleccionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seleccionAlumnoLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(seleccionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_crearCuadroNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_realizarExamen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        seleccionAlumnoLayout.setVerticalGroup(
            seleccionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seleccionAlumnoLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jb_realizarExamen)
                .addGap(46, 46, 46)
                .addComponent(jb_crearCuadroNotas)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        lb_tituloPregunta.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        lb_tituloPregunta.setText("TITULO");

        ta_descrpPregunta.setEditable(false);
        ta_descrpPregunta.setColumns(20);
        ta_descrpPregunta.setRows(5);
        jScrollPane2.setViewportView(ta_descrpPregunta);

        respuestaAlumno.add(rb_respAlumnoV);
        rb_respAlumnoV.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        rb_respAlumnoV.setText("Verdadero");

        respuestaAlumno.add(rb_respAlumnoF);
        rb_respAlumnoF.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        rb_respAlumnoF.setText("Falso");

        jb_nextQuestion.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_nextQuestion.setText("Siquiente");
        jb_nextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_nextQuestionActionPerformed(evt);
            }
        });

        comenzarExamen.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 12)); // NOI18N
        comenzarExamen.setText("Comenzar Examen");
        comenzarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comenzarExamenActionPerformed(evt);
            }
        });

        jButton2.setText("Terminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaExamenLayout = new javax.swing.GroupLayout(pantallaExamen.getContentPane());
        pantallaExamen.getContentPane().setLayout(pantallaExamenLayout);
        pantallaExamenLayout.setHorizontalGroup(
            pantallaExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaExamenLayout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jb_nextQuestion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaExamenLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(pantallaExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pantallaExamenLayout.createSequentialGroup()
                        .addComponent(rb_respAlumnoV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb_respAlumnoF))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tituloPregunta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaExamenLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(comenzarExamen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(32, 32, 32))
        );
        pantallaExamenLayout.setVerticalGroup(
            pantallaExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaExamenLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lb_tituloPregunta)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addGroup(pantallaExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_respAlumnoV)
                    .addComponent(rb_respAlumnoF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jb_nextQuestion)
                .addGap(18, 18, 18)
                .addGroup(pantallaExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comenzarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pantallaExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)))
                .addGap(25, 25, 25))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelLogin.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        labelLogin.setText("login:");

        tf_login.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 14)); // NOI18N

        pf_passLogin.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 14)); // NOI18N

        jb_iniciarSesion.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_iniciarSesion.setText("Ingresar");
        jb_iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_iniciarSesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jLabel1.setText("contraseña");

        jb_gotoRegistro.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_gotoRegistro.setText("Registrarse");
        jb_gotoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_gotoRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jb_gotoRegistro)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pf_passLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_login, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(192, 192, 192))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(jb_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogin)
                    .addComponent(tf_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_passLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jb_iniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jb_gotoRegistro)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_iniciarSesionActionPerformed

        char[] pass = pf_passLogin.getPassword();
        String verify = "";
        for (int i = 0; i < pass.length; i++) {
            verify += pass[i];
        }
        String user = tf_login.getText();
        ArrayList<String> users = users();
        ArrayList<String> passwords = passwords();
        if (user.equals("Admin") && verify.equals("admin1234")) {
            seleccionAdmin.pack();
            seleccionAdmin.setLocationRelativeTo(this);
            seleccionAdmin.setVisible(true);
        } else if (users.contains(user) && passwords.contains(verify)) {
            seleccionAlumno.pack();
            seleccionAlumno.setLocationRelativeTo(this);
            seleccionAlumno.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos");
        }
    }//GEN-LAST:event_jb_iniciarSesionActionPerformed

    private void jb_gotoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_gotoRegistroActionPerformed
        pantallaRegistro.pack();
        pantallaRegistro.setLocationRelativeTo(this);
        pantallaRegistro.setVisible(true);
    }//GEN-LAST:event_jb_gotoRegistroActionPerformed

    private void jb_gotoCrearExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_gotoCrearExamenActionPerformed
        pantallaCrearExamen.pack();
        pantallaCrearExamen.setLocationRelativeTo(this);
        pantallaCrearExamen.setVisible(true);
    }//GEN-LAST:event_jb_gotoCrearExamenActionPerformed

    private void jb_gotoCrearClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_gotoCrearClaseActionPerformed
        String nombreClase = JOptionPane.showInputDialog(this, "Ingrese el nombre de la nueva clase: ", "NOMBRE", JOptionPane.INFORMATION_MESSAGE);
        ArrayList<Integer> ids = idsClase();
        int id = ids.get(0) + 1;
        cn.insertClase(nombreClase, id);
    }//GEN-LAST:event_jb_gotoCrearClaseActionPerformed

    private void jb_gotoCrearPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_gotoCrearPreguntaActionPerformed
        pantallaCrearPregunta.pack();
        pantallaCrearPregunta.setLocationRelativeTo(this);
        pantallaCrearPregunta.setVisible(true);
    }//GEN-LAST:event_jb_gotoCrearPreguntaActionPerformed

    private void jb_realizarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_realizarExamenActionPerformed
        codClase = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el codigo de la clase", "CODIGO", JOptionPane.INFORMATION_MESSAGE));
        pantallaExamen.pack();
        pantallaExamen.setLocationRelativeTo(this);
        pantallaExamen.setVisible(true);
        titulos = filtroTitulosPreguntas(codClase);
        descrps = filtroDescripcionesPreguntas(codClase);
        resps = filtroRespuestasPreguntas(codClase);
        idsGeneral = idsPreguntas();
    }//GEN-LAST:event_jb_realizarExamenActionPerformed

    private void jb_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registroActionPerformed
        String[] atributos = new String[4];
        ArrayList<Integer> idsComprobar = ids();
        int id = idsComprobar.get(0) + 1;
        atributos[0] = String.valueOf(id);
        atributos[1] = tf_newLogin.getText();
        atributos[2] = tf_newName.getText();

        char[] pass = pf_newPassword.getPassword();
        String aux = "";
        for (int i = 0; i < pass.length; i++) {
            aux += pass[i];
        }
        atributos[3] = aux;

        cn.insertAlumno(atributos);
    }//GEN-LAST:event_jb_registroActionPerformed

    private void jb_crearExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearExamenActionPerformed
        String[] atributos = new String[4];
        ArrayList<Integer> ids = idsExamen();
        int id = ids.get(0) + 1;

        atributos[0] = String.valueOf(id);
        atributos[1] = tf_idClassExam.getText();
        atributos[2] = js_cantPreguntas.getValue().toString();
        atributos[3] = tf_dateNewExam.getText();
        cn.insertExamen(atributos);
        cn.actualizar();
    }//GEN-LAST:event_jb_crearExamenActionPerformed

    private void comenzarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarExamenActionPerformed
        Random r = new Random();
        ArrayList<Integer> idsExamenClase = filtroExamenes(codClase);
        examenEnUso = 1 + r.nextInt(idsExamenClase.size());
        System.out.println(examenEnUso);
        ArrayList<Integer> aux = cantPreguntasExamen(codClase);
        contadorTotalPreguntas = aux.get(examenEnUso - 1);
        System.out.println(contadorTotalPreguntas);
    }//GEN-LAST:event_comenzarExamenActionPerformed

    private void jb_nextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_nextQuestionActionPerformed
        if (contadorTotalPreguntas <= contadorPreguntasRespondidas) {
            jb_nextQuestion.setEnabled(false);
            contadorPreguntasRespondidas = 0;
        } else {
            resolverPregunta(titulos, descrps, idsPregResp, respsDadas, idsGeneral);
            System.out.println(contadorPreguntasRespondidas);
            contadorPreguntasRespondidas++;
        }
    }//GEN-LAST:event_jb_nextQuestionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int resp = JOptionPane.showConfirmDialog(this, "DESEA TERMINAR?", "Una vez terminado, no podra regresar.", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            for (int i = 0; i < respsDadas.size(); i++) {
                if (Objects.equals(respsDadas.get(i), resps.get(i))) {
                    puntaje += 5;
                }
            }
            String atributos[] = new String[3];
            ArrayList<String> users = users();
            ArrayList<Integer> idUsers = ids();
            int aux = idUsers.get(users.indexOf(tf_login.getText()));
            atributos[0] = String.valueOf(aux);
            ArrayList<Integer> filtro = filtroExamenes(codClase);

            int id = filtro.get(examenEnUso - 1);

            atributos[1] = String.valueOf(id);
            atributos[2] = String.valueOf(puntaje);

            cn.insertResultado(atributos, respsDadas, idsPregResp);
            cn.actualizar();

        } else {
            return;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String titulo = tf_tituloNuevPregunta.getText();
        String descripcion = ta_descrpNuevaPregunta.getText();
        ArrayList<Integer> idsPre = idsPreguntas();
        int nuevoID = idsPre.get(0) + 1;
        String idClase = tf_codClaseNuevaPregunta.getText();
        boolean resp = false;
        if (rb_fRespNuevaPregunta.isSelected()) {
            resp = false;
        } else if (rb_vRespNuevaPregunta.isSelected()) {
            resp = true;
        }
        String atributos[] = new String[5];
        atributos[0] = String.valueOf(nuevoID);
        atributos[1] = idClase;
        atributos[2] = titulo;
        atributos[3] = descripcion;
        atributos[4] = String.valueOf(resp);

        cn.insertPregunta(atributos);

        cn.actualizar();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comenzarExamen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_crearCuadroNotas;
    private javax.swing.JButton jb_crearExamen;
    private javax.swing.JButton jb_gotoCrearClase;
    private javax.swing.JButton jb_gotoCrearExamen;
    private javax.swing.JButton jb_gotoCrearPregunta;
    private javax.swing.JButton jb_gotoRegistro;
    private javax.swing.JButton jb_iniciarSesion;
    private javax.swing.JButton jb_listarClases;
    private javax.swing.JButton jb_nextQuestion;
    private javax.swing.JButton jb_realizarExamen;
    private javax.swing.JButton jb_registro;
    private javax.swing.JSpinner js_cantPreguntas;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNewLogin;
    private javax.swing.JLabel labelNewName;
    private javax.swing.JLabel labelNewPassword;
    private javax.swing.JLabel label_confirmPassword;
    private javax.swing.JLabel lb_tituloPregunta;
    private javax.swing.JFrame pantallaCrearExamen;
    private javax.swing.JFrame pantallaCrearPregunta;
    private javax.swing.JFrame pantallaExamen;
    private javax.swing.JFrame pantallaRegistro;
    private javax.swing.JPasswordField pf_confirmNewPassword;
    private javax.swing.JPasswordField pf_newPassword;
    private javax.swing.JPasswordField pf_passLogin;
    private javax.swing.JRadioButton rb_fRespNuevaPregunta;
    private javax.swing.JRadioButton rb_respAlumnoF;
    private javax.swing.JRadioButton rb_respAlumnoV;
    private javax.swing.JRadioButton rb_vRespNuevaPregunta;
    private javax.swing.ButtonGroup respNewPregunta_Grupo;
    private javax.swing.ButtonGroup respuestaAlumno;
    private javax.swing.JFrame seleccionAdmin;
    private javax.swing.JFrame seleccionAlumno;
    private javax.swing.JTextArea ta_descrpNuevaPregunta;
    private javax.swing.JTextArea ta_descrpPregunta;
    private javax.swing.JTextField tf_codClaseNuevaPregunta;
    private javax.swing.JTextField tf_dateNewExam;
    private javax.swing.JTextField tf_idClassExam;
    private javax.swing.JTextField tf_login;
    private javax.swing.JTextField tf_newLogin;
    private javax.swing.JTextField tf_newName;
    private javax.swing.JTextField tf_tituloNuevPregunta;
    // End of variables declaration//GEN-END:variables
    private conexionNeo4J cn = new conexionNeo4J("bolt://localhost:7687", "neo4j", "jaguaresac7C");
    private ArrayList<String> titulos;
    private ArrayList<String> descrps;
    private ArrayList<Boolean> resps;
    private ArrayList<Integer> idsGeneral;
    private ArrayList<Boolean> respsDadas = new ArrayList<>();
    private ArrayList<Integer> idsPregResp = new ArrayList<>();
    private int codClase;
    private int puntaje = 0;
    boolean comenzarTerminar = true;
    int examenEnUso = 0;
    int contadorPreguntasRespondidas = 0;
    int contadorTotalPreguntas = 0;
    boolean flag = false;

    public void resolverPregunta(ArrayList<String> titulosAux, ArrayList<String> descrpAux, ArrayList<Integer> respDadasID, ArrayList<Boolean> respDadasAux, ArrayList<Integer> idsGeneral) {

        Random r = new Random();
        int electorPregunta = 1 + r.nextInt(titulosAux.size());
        System.out.println("-->" + titulosAux.size());
        lb_tituloPregunta.setText(titulosAux.get(electorPregunta - 1));
        ta_descrpPregunta.setText(descrpAux.get(electorPregunta - 1));

        ArrayList<Integer> aux = filtroIdsPreguntas(codClase);

        boolean respuesta = false;
        if (rb_respAlumnoV.isSelected()) {
            respuesta = true;
        } else if (rb_respAlumnoF.isSelected()) {
            respuesta = false;
        }
        int posIdInsertada = idsGeneral.indexOf(aux.get(electorPregunta - 1));
        respDadasAux.add(respuesta);
        respDadasID.add(idsGeneral.get(posIdInsertada));
        titulosAux.remove(electorPregunta - 1);
        descrpAux.remove(electorPregunta - 1);
    }

    public ArrayList<Integer> idsPreguntas() {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));
        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                ArrayList<Integer> ids = new ArrayList<Integer>();
                Result result = tx.run("MATCH (p: Pregunta) RETURN p.idPregunta ORDER BY p.idPregunta DESC");
                while (result.hasNext()) {
                    ids.add(Integer.parseInt(result.next().get(0).asObject().toString()));
                }
                return ids;
            });
        }
    }

    public ArrayList<String> filtroTitulosPreguntas(int idClase) {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));

        try (Session session = driver.session()) {
            ArrayList<String> titulos = new ArrayList<>();
            return session.readTransaction(tx
                    -> {
                Result result = tx.run("MATCH (p: Pregunta{idClase: " + idClase + " }) RETURN p.titulo ORDER BY p.idPregunta DESC ;");
                while (result.hasNext()) {
                    titulos.add(result.next().get(0).asObject().toString());
                }
                return titulos;
            });
        }
    }

    public ArrayList<String> filtroDescripcionesPreguntas(int idClase) {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));

        try (Session session = driver.session()) {
            ArrayList<String> descripciones = new ArrayList<>();
            return session.readTransaction(tx
                    -> {
                Result result = tx.run("MATCH (p: Pregunta{idClase: " + idClase + " }) RETURN p.descripcion ORDER BY p.idPregunta DESC ;");
                while (result.hasNext()) {
                    descripciones.add(result.next().get(0).asObject().toString());
                }
                return descripciones;
            });
        }
    }

    public ArrayList<Boolean> filtroRespuestasPreguntas(int idClase) {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));

        try (Session session = driver.session()) {
            ArrayList<Boolean> respuestas = new ArrayList<>();
            return session.readTransaction(tx
                    -> {
                Result result = tx.run("MATCH (p: Pregunta{idClase: " + idClase + " }) RETURN p.respuesta ORDER BY p.idPregunta DESC;");
                while (result.hasNext()) {
                    respuestas.add(Boolean.parseBoolean(result.next().get(0).asObject().toString()));
                }
                return respuestas;
            });
        }
    }

    public ArrayList<Integer> filtroIdsPreguntas(int idClase) {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));

        try (Session session = driver.session()) {
            ArrayList<Integer> respuestas = new ArrayList<>();
            return session.readTransaction(tx
                    -> {
                Result result = tx.run("MATCH (p: Pregunta{idClase: " + idClase + " }) RETURN p.idPregunta ORDER BY p.idPregunta DESC;");
                while (result.hasNext()) {
                    respuestas.add(Integer.parseInt(result.next().get(0).asObject().toString()));
                }
                return respuestas;
            });
        }
    }

    public ArrayList<Integer> idsExamen() {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));
        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                ArrayList<Integer> ids = new ArrayList<Integer>();
                Result result = tx.run("MATCH (e: Examen) RETURN e.idExamen ORDER BY e.idExamen DESC");
                while (result.hasNext()) {
                    ids.add(Integer.parseInt(result.next().get(0).asObject().toString()));
                }
                return ids;
            });
        }
    }

    public ArrayList<Integer> filtroExamenes(int idClase) {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));
        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                ArrayList<Integer> ids = new ArrayList<Integer>();
                Result result = tx.run("MATCH (e: Examen{idExamen: " + idClase + " }) RETURN e.idExamen ORDER BY e.idExamen DESC");
                while (result.hasNext()) {
                    ids.add(Integer.parseInt(result.next().get(0).asObject().toString()));
                }
                return ids;
            });
        }
    }

    public ArrayList<Integer> cantPreguntasExamen(int idClase) {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));
        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                ArrayList<Integer> ids = new ArrayList<Integer>();
                Result result = tx.run("MATCH (e: Examen{ idClase: " + idClase + " }) RETURN e.noPreguntas ORDER BY e.idExamen DESC");
                while (result.hasNext()) {
                    ids.add(Integer.parseInt(result.next().get(0).asObject().toString()));
                }
                return ids;
            });
        }
    }

    public ArrayList<Integer> ids() {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));
        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                ArrayList<Integer> ids = new ArrayList<Integer>();
                Result result = tx.run("MATCH (a: Alumno) RETURN a.id ORDER BY a.id DESC");
                while (result.hasNext()) {
                    ids.add(Integer.parseInt(result.next().get(0).asObject().toString()));
                }
                return ids;
            });
        }
    }

    public ArrayList<String> users() {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));
        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                ArrayList<String> ids = new ArrayList<String>();
                Result result = tx.run("MATCH (a: Alumno) RETURN a.login ORDER BY a.id DESC");
                while (result.hasNext()) {
                    ids.add(result.next().get(0).asObject().toString());
                }
                return ids;
            });
        }
    }

    public ArrayList<String> passwords() {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));
        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                ArrayList<String> ids = new ArrayList<String>();
                Result result = tx.run("MATCH (a: Alumno) RETURN a.password ORDER BY a.id DESC");
                while (result.hasNext()) {
                    ids.add(result.next().get(0).asObject().toString());
                }
                return ids;
            });
        }
    }

    public ArrayList<Integer> idsClase() {
        Driver driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "jaguaresac7C"));
        try (Session session = driver.session()) {
            return session.readTransaction(tx
                    -> {
                ArrayList<Integer> ids = new ArrayList<Integer>();
                Result result = tx.run("MATCH (c: Clase) RETURN c.idClase ORDER BY c.idClase DESC");
                while (result.hasNext()) {
                    ids.add(Integer.parseInt(result.next().get(0).asObject().toString()));
                }
                return ids;
            });
        }
    }

}
