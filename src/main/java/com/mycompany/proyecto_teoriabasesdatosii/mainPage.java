package com.mycompany.proyecto_teoriabasesdatosii;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class mainPage extends javax.swing.JFrame {

    public mainPage() {
        initComponents();
        setLocationRelativeTo(null);
        clasesEnSistema = ad.cargarClases();
        examenesEnSistema = ad.cargarExamenes();
        alumnosEnSistema = ad.cargarAlumnos();
        categoriasEnSistema = ad.cargarCategorias();
        prefuntaEnSistema = ad.cargarPreguntas();
        registrosEnMatricula = ad.cargarMatricula();
        resultadosAlumnos = ad.cargarResultados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantallaCrearExamen = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        js_cantPreguntas = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jb_crearExamen = new javax.swing.JButton();
        dc_fechaExamen = new com.toedter.calendar.JDateChooser();
        cb_selectorClaseParaExamen = new javax.swing.JComboBox<>();
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
        jb_gotoCrearCategoria = new javax.swing.JButton();
        goto_CentroCalificaciones = new javax.swing.JButton();
        pantallaCrearPregunta = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_tituloNuevPregunta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_descrpNuevaPregunta = new javax.swing.JTextArea();
        rb_vRespNuevaPregunta = new javax.swing.JRadioButton();
        rb_fRespNuevaPregunta = new javax.swing.JRadioButton();
        jb_crearNuevaPregunta = new javax.swing.JButton();
        cb_eleccionClasePregunta = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cb_selectorCategoria = new javax.swing.JComboBox<>();
        respNewPregunta_Grupo = new javax.swing.ButtonGroup();
        seleccionAlumno = new javax.swing.JFrame();
        jb_realizarExamen = new javax.swing.JButton();
        jb_crearCuadroNotas = new javax.swing.JButton();
        jb_cerrarSesion = new javax.swing.JToggleButton();
        jb_goToMatricular = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        pantallaExamen = new javax.swing.JFrame();
        lb_tituloPregunta = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_descrpPregunta = new javax.swing.JTextArea();
        rb_respAlumnoV = new javax.swing.JRadioButton();
        rb_respAlumnoF = new javax.swing.JRadioButton();
        jb_nextQuestion = new javax.swing.JButton();
        comenzarExamen = new javax.swing.JButton();
        jb_terminarExamen = new javax.swing.JButton();
        respuestaAlumno = new javax.swing.ButtonGroup();
        pantallaCrearcategoria = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        tf_NombreCategoria = new javax.swing.JTextField();
        cb_selectorClasesCategoria = new javax.swing.JComboBox<>();
        jb_crearCategoria = new javax.swing.JButton();
        pantalla_matricula = new javax.swing.JFrame();
        jb_matricularClase = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_clasesDisponibles = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        pantalla_comienzExamen = new javax.swing.JDialog();
        cb_selectorExamenRealizar = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jb_comnezarNuevoExamen = new javax.swing.JButton();
        jb_goBackExamen = new javax.swing.JButton();
        tf_claseExamenRealizar = new javax.swing.JTextField();
        jdialog_cuadroNotas = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_notasAlumno = new javax.swing.JTable();
        list_ExamenPorClase = new javax.swing.JFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_listExamenes = new javax.swing.JTable();
        cb_selectClaseListExamen = new javax.swing.JComboBox<>();
        got_verCategorias = new javax.swing.JButton();
        list_Categorias = new javax.swing.JFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        tb_listPReguntasCategoria = new javax.swing.JTable();
        cb_SelectorCategoriaList = new javax.swing.JComboBox<>();
        centroCalificaciones = new javax.swing.JFrame();
        jScrollPane7 = new javax.swing.JScrollPane();
        tb_CentroDeNotas = new javax.swing.JTable();
        cb_filtroClasesNotas = new javax.swing.JComboBox<>();
        frameNotificaciones = new javax.swing.JFrame();
        jScrollPane8 = new javax.swing.JScrollPane();
        table_notificaciones = new javax.swing.JTable();
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

        jb_crearExamen.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_crearExamen.setText("CREAR EXAMEN");
        jb_crearExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearExamenActionPerformed(evt);
            }
        });

        cb_selectorClaseParaExamen.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N

        javax.swing.GroupLayout pantallaCrearExamenLayout = new javax.swing.GroupLayout(pantallaCrearExamen.getContentPane());
        pantallaCrearExamen.getContentPane().setLayout(pantallaCrearExamenLayout);
        pantallaCrearExamenLayout.setHorizontalGroup(
            pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaCrearExamenLayout.createSequentialGroup()
                .addGroup(pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantallaCrearExamenLayout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jb_crearExamen))
                    .addGroup(pantallaCrearExamenLayout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addGroup(pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_selectorClaseParaExamen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(js_cantPreguntas)
                            .addComponent(dc_fechaExamen, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pantallaCrearExamenLayout.setVerticalGroup(
            pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaCrearExamenLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(cb_selectorClaseParaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(js_cantPreguntas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(pantallaCrearExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dc_fechaExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jb_crearExamen)
                .addGap(49, 49, 49))
        );

        labelNewName.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        labelNewName.setText("Nombre completo:");

        labelNewLogin.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        labelNewLogin.setText("Usuario:");

        labelNewPassword.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        labelNewPassword.setText("Contrase??a:");

        label_confirmPassword.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        label_confirmPassword.setText("Confirmar Contrase??a:");

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
        jb_listarClases.setText("VER CLASES");
        jb_listarClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_listarClasesActionPerformed(evt);
            }
        });

        jb_gotoCrearCategoria.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_gotoCrearCategoria.setText("CREAR CATEGOR??A");
        jb_gotoCrearCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_gotoCrearCategoriaActionPerformed(evt);
            }
        });

        goto_CentroCalificaciones.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        goto_CentroCalificaciones.setText("Ir a Centro de Calificaciones");
        goto_CentroCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goto_CentroCalificacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout seleccionAdminLayout = new javax.swing.GroupLayout(seleccionAdmin.getContentPane());
        seleccionAdmin.getContentPane().setLayout(seleccionAdminLayout);
        seleccionAdminLayout.setHorizontalGroup(
            seleccionAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seleccionAdminLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(seleccionAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(seleccionAdminLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(seleccionAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jb_gotoCrearExamen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_gotoCrearClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_gotoCrearCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jb_gotoCrearPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_listarClases, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(goto_CentroCalificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        seleccionAdminLayout.setVerticalGroup(
            seleccionAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seleccionAdminLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jb_gotoCrearExamen)
                .addGap(31, 31, 31)
                .addComponent(jb_gotoCrearClase)
                .addGap(39, 39, 39)
                .addComponent(jb_gotoCrearCategoria)
                .addGap(36, 36, 36)
                .addComponent(jb_gotoCrearPregunta)
                .addGap(43, 43, 43)
                .addComponent(jb_listarClases)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(goto_CentroCalificaciones)
                .addGap(76, 76, 76))
        );

        jLabel6.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jLabel6.setText("T??tulo:");

        jLabel7.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jLabel7.setText("Descripci??n:");

        jLabel8.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jLabel8.setText("ID/Codigo de clase:");

        jLabel9.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jLabel9.setText("Respuesta:");

        tf_tituloNuevPregunta.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 12)); // NOI18N

        ta_descrpNuevaPregunta.setColumns(20);
        ta_descrpNuevaPregunta.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 12)); // NOI18N
        ta_descrpNuevaPregunta.setRows(5);
        jScrollPane1.setViewportView(ta_descrpNuevaPregunta);

        respNewPregunta_Grupo.add(rb_vRespNuevaPregunta);
        rb_vRespNuevaPregunta.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        rb_vRespNuevaPregunta.setText("Verdadero");

        respNewPregunta_Grupo.add(rb_fRespNuevaPregunta);
        rb_fRespNuevaPregunta.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        rb_fRespNuevaPregunta.setText("Falso");

        jb_crearNuevaPregunta.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_crearNuevaPregunta.setText("CREAR");
        jb_crearNuevaPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearNuevaPreguntaActionPerformed(evt);
            }
        });

        cb_eleccionClasePregunta.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        cb_eleccionClasePregunta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_eleccionClasePreguntaItemStateChanged(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jLabel10.setText("Categoria");

        cb_selectorCategoria.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N

        javax.swing.GroupLayout pantallaCrearPreguntaLayout = new javax.swing.GroupLayout(pantallaCrearPregunta.getContentPane());
        pantallaCrearPregunta.getContentPane().setLayout(pantallaCrearPreguntaLayout);
        pantallaCrearPreguntaLayout.setHorizontalGroup(
            pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaCrearPreguntaLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(155, 155, 155)
                .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_tituloNuevPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaCrearPreguntaLayout.createSequentialGroup()
                            .addComponent(rb_vRespNuevaPregunta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rb_fRespNuevaPregunta))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jb_crearNuevaPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cb_selectorCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 173, Short.MAX_VALUE)
                        .addComponent(cb_eleccionClasePregunta, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(79, 79, 79))
        );
        pantallaCrearPreguntaLayout.setVerticalGroup(
            pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaCrearPreguntaLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_tituloNuevPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(46, 46, 46)
                .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cb_eleccionClasePregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cb_selectorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(pantallaCrearPreguntaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rb_vRespNuevaPregunta)
                    .addComponent(rb_fRespNuevaPregunta))
                .addGap(37, 37, 37)
                .addComponent(jb_crearNuevaPregunta)
                .addGap(17, 17, 17))
        );

        jb_realizarExamen.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_realizarExamen.setText("REALIZAR EXAMEN");
        jb_realizarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_realizarExamenActionPerformed(evt);
            }
        });

        jb_crearCuadroNotas.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_crearCuadroNotas.setText("VER NOTAS");
        jb_crearCuadroNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearCuadroNotasActionPerformed(evt);
            }
        });

        jb_cerrarSesion.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_cerrarSesion.setText("Cerrar Sesi??n");
        jb_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cerrarSesionActionPerformed(evt);
            }
        });

        jb_goToMatricular.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_goToMatricular.setText("MATRICULAR");
        jb_goToMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_goToMatricularActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jButton1.setText("Notificaciones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout seleccionAlumnoLayout = new javax.swing.GroupLayout(seleccionAlumno.getContentPane());
        seleccionAlumno.getContentPane().setLayout(seleccionAlumnoLayout);
        seleccionAlumnoLayout.setHorizontalGroup(
            seleccionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seleccionAlumnoLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(seleccionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_crearCuadroNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_realizarExamen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_goToMatricular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seleccionAlumnoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(seleccionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seleccionAlumnoLayout.createSequentialGroup()
                        .addComponent(jb_cerrarSesion)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seleccionAlumnoLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        seleccionAlumnoLayout.setVerticalGroup(
            seleccionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seleccionAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jb_goToMatricular)
                .addGap(104, 104, 104)
                .addComponent(jb_realizarExamen)
                .addGap(46, 46, 46)
                .addComponent(jb_crearCuadroNotas)
                .addGap(93, 93, 93)
                .addComponent(jb_cerrarSesion)
                .addGap(27, 27, 27))
        );

        lb_tituloPregunta.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        lb_tituloPregunta.setText("TITULO");

        ta_descrpPregunta.setEditable(false);
        ta_descrpPregunta.setColumns(20);
        ta_descrpPregunta.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 12)); // NOI18N
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

        jb_terminarExamen.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 14)); // NOI18N
        jb_terminarExamen.setText("Terminar");
        jb_terminarExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_terminarExamenActionPerformed(evt);
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
                .addComponent(jb_terminarExamen)
                .addGap(32, 32, 32))
        );
        pantallaExamenLayout.setVerticalGroup(
            pantallaExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaExamenLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(lb_tituloPregunta)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(pantallaExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_respAlumnoV)
                    .addComponent(rb_respAlumnoF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jb_nextQuestion)
                .addGap(18, 18, 18)
                .addGroup(pantallaExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comenzarExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_terminarExamen))
                .addGap(25, 25, 25))
        );

        jLabel5.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jLabel5.setText("Nombre Categor??a");

        tf_NombreCategoria.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N

        cb_selectorClasesCategoria.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N

        jb_crearCategoria.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_crearCategoria.setText("CREAR");
        jb_crearCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pantallaCrearcategoriaLayout = new javax.swing.GroupLayout(pantallaCrearcategoria.getContentPane());
        pantallaCrearcategoria.getContentPane().setLayout(pantallaCrearcategoriaLayout);
        pantallaCrearcategoriaLayout.setHorizontalGroup(
            pantallaCrearcategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaCrearcategoriaLayout.createSequentialGroup()
                .addGroup(pantallaCrearcategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantallaCrearcategoriaLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel5))
                    .addGroup(pantallaCrearcategoriaLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(tf_NombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pantallaCrearcategoriaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(cb_selectorClasesCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantallaCrearcategoriaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jb_crearCategoria)
                .addGap(144, 144, 144))
        );
        pantallaCrearcategoriaLayout.setVerticalGroup(
            pantallaCrearcategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaCrearcategoriaLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(tf_NombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(cb_selectorClasesCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jb_crearCategoria)
                .addGap(56, 56, 56))
        );

        jb_matricularClase.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_matricularClase.setText("Matricular Clase Seleccionada");
        jb_matricularClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_matricularClaseActionPerformed(evt);
            }
        });

        tb_clasesDisponibles.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 14)); // NOI18N
        tb_clasesDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Clase", "Clase ", "Matricular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tb_clasesDisponibles);

        jLabel11.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 24)); // NOI18N
        jLabel11.setText("CLASES DISPONIBLES EN EL SISTEMA");

        javax.swing.GroupLayout pantalla_matriculaLayout = new javax.swing.GroupLayout(pantalla_matricula.getContentPane());
        pantalla_matricula.getContentPane().setLayout(pantalla_matriculaLayout);
        pantalla_matriculaLayout.setHorizontalGroup(
            pantalla_matriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_matriculaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_matriculaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pantalla_matriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_matriculaLayout.createSequentialGroup()
                        .addComponent(jb_matricularClase)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pantalla_matriculaLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(171, 171, 171))))
        );
        pantalla_matriculaLayout.setVerticalGroup(
            pantalla_matriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_matriculaLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel11)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jb_matricularClase)
                .addGap(26, 26, 26))
        );

        cb_selectorExamenRealizar.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        cb_selectorExamenRealizar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_selectorExamenRealizarItemStateChanged(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 18)); // NOI18N
        jLabel12.setText("Clases con ex??men disponible:");

        jb_comnezarNuevoExamen.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_comnezarNuevoExamen.setText("Comenzar");
        jb_comnezarNuevoExamen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_comnezarNuevoExamenActionPerformed(evt);
            }
        });

        jb_goBackExamen.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        jb_goBackExamen.setText("Regresar");

        tf_claseExamenRealizar.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 14)); // NOI18N

        javax.swing.GroupLayout pantalla_comienzExamenLayout = new javax.swing.GroupLayout(pantalla_comienzExamen.getContentPane());
        pantalla_comienzExamen.getContentPane().setLayout(pantalla_comienzExamenLayout);
        pantalla_comienzExamenLayout.setHorizontalGroup(
            pantalla_comienzExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_comienzExamenLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pantalla_comienzExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pantalla_comienzExamenLayout.createSequentialGroup()
                        .addGroup(pantalla_comienzExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cb_selectorExamenRealizar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jb_goBackExamen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(pantalla_comienzExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_claseExamenRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_comnezarNuevoExamen))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pantalla_comienzExamenLayout.setVerticalGroup(
            pantalla_comienzExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantalla_comienzExamenLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel12)
                .addGap(50, 50, 50)
                .addGroup(pantalla_comienzExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_selectorExamenRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_claseExamenRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(pantalla_comienzExamenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_goBackExamen)
                    .addComponent(jb_comnezarNuevoExamen))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jt_notasAlumno.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 14)); // NOI18N
        jt_notasAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Clase", "Resultado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jt_notasAlumno);

        javax.swing.GroupLayout jdialog_cuadroNotasLayout = new javax.swing.GroupLayout(jdialog_cuadroNotas.getContentPane());
        jdialog_cuadroNotas.getContentPane().setLayout(jdialog_cuadroNotasLayout);
        jdialog_cuadroNotasLayout.setHorizontalGroup(
            jdialog_cuadroNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdialog_cuadroNotasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jdialog_cuadroNotasLayout.setVerticalGroup(
            jdialog_cuadroNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdialog_cuadroNotasLayout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jt_listExamenes.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 12)); // NOI18N
        jt_listExamenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Ex??men", "Cant Preguntas", "Fecha a Realizar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jt_listExamenes);

        cb_selectClaseListExamen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_selectClaseListExamenItemStateChanged(evt);
            }
        });

        got_verCategorias.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 14)); // NOI18N
        got_verCategorias.setText("Ver Categor??as");
        got_verCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                got_verCategoriasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout list_ExamenPorClaseLayout = new javax.swing.GroupLayout(list_ExamenPorClase.getContentPane());
        list_ExamenPorClase.getContentPane().setLayout(list_ExamenPorClaseLayout);
        list_ExamenPorClaseLayout.setHorizontalGroup(
            list_ExamenPorClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list_ExamenPorClaseLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(list_ExamenPorClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(got_verCategorias)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_selectClaseListExamen, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        list_ExamenPorClaseLayout.setVerticalGroup(
            list_ExamenPorClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, list_ExamenPorClaseLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(cb_selectClaseListExamen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(got_verCategorias)
                .addGap(40, 40, 40))
        );

        tb_listPReguntasCategoria.setFont(new java.awt.Font("Liberation Sans Narrow", 0, 14)); // NOI18N
        tb_listPReguntasCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pregunta", "Titulo", "Descripcion", "Respuesta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tb_listPReguntasCategoria);

        cb_SelectorCategoriaList.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 12)); // NOI18N
        cb_SelectorCategoriaList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_SelectorCategoriaListItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout list_CategoriasLayout = new javax.swing.GroupLayout(list_Categorias.getContentPane());
        list_Categorias.getContentPane().setLayout(list_CategoriasLayout);
        list_CategoriasLayout.setHorizontalGroup(
            list_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list_CategoriasLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(list_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_SelectorCategoriaList, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        list_CategoriasLayout.setVerticalGroup(
            list_CategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(list_CategoriasLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(cb_SelectorCategoriaList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tb_CentroDeNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alumno", "Clase", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(tb_CentroDeNotas);

        cb_filtroClasesNotas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_filtroClasesNotasItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout centroCalificacionesLayout = new javax.swing.GroupLayout(centroCalificaciones.getContentPane());
        centroCalificaciones.getContentPane().setLayout(centroCalificacionesLayout);
        centroCalificacionesLayout.setHorizontalGroup(
            centroCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centroCalificacionesLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(centroCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_filtroClasesNotas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        centroCalificacionesLayout.setVerticalGroup(
            centroCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centroCalificacionesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(cb_filtroClasesNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        table_notificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Notificaciones", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(table_notificaciones);

        javax.swing.GroupLayout frameNotificacionesLayout = new javax.swing.GroupLayout(frameNotificaciones.getContentPane());
        frameNotificaciones.getContentPane().setLayout(frameNotificacionesLayout);
        frameNotificacionesLayout.setHorizontalGroup(
            frameNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameNotificacionesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        frameNotificacionesLayout.setVerticalGroup(
            frameNotificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameNotificacionesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
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
        jLabel1.setText("contrase??a");

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
        boolean iniciarSesion = false;
        if (!alumnosEnSistema.isEmpty()) {
            for (int i = 0; i < alumnosEnSistema.size(); i++) {
                if ((user.equals("Admin") && verify.equals("admin1234")) || (alumnosEnSistema.get(i).getLogin().equals(user) && alumnosEnSistema.get(i).getPassword().equals(verify))) {
                    iniciarSesion = true;
                    idAlumnoEnSesion = alumnosEnSistema.get(i).getId();
                    break;
                }
            }
            if (iniciarSesion) {
                if (user.equals("Admin")) {
                    seleccionAdmin.pack();
                    seleccionAdmin.setAlwaysOnTop(true);
                    seleccionAdmin.setLocationRelativeTo(this);
                    seleccionAdmin.setVisible(true);
                } else {
                    seleccionAlumno.pack();
                    seleccionAlumno.setAlwaysOnTop(true);
                    seleccionAlumno.setLocationRelativeTo(this);
                    seleccionAlumno.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario y/o contrase??a incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay alumnos en el sistema, solamente puede acceder el administrador");
            if (user.equals("Admin") && verify.equals("admin1234")) {
                seleccionAdmin.pack();
                seleccionAdmin.setAlwaysOnTop(true);
                seleccionAdmin.setLocationRelativeTo(this);
                seleccionAdmin.setVisible(true);
            }
        }
    }//GEN-LAST:event_jb_iniciarSesionActionPerformed

    private void jb_gotoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_gotoRegistroActionPerformed
        actualizaEstado();
        pantallaRegistro.pack();
        pantallaRegistro.setAlwaysOnTop(true);
        pantallaRegistro.setLocationRelativeTo(this);
        pantallaRegistro.setVisible(true);
    }//GEN-LAST:event_jb_gotoRegistroActionPerformed

    private void jb_gotoCrearExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_gotoCrearExamenActionPerformed
        actualizaEstado();
        pantallaCrearExamen.pack();
        pantallaCrearExamen.setAlwaysOnTop(true);
        pantallaCrearExamen.setLocationRelativeTo(this);
        pantallaCrearExamen.setVisible(true);
        cb_selectorClaseParaExamen.removeAllItems();
        DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_selectorClaseParaExamen.getModel();
        if (clasesEnSistema.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay clases en el sistema a las que asociar un examen. \n\nCree una clase primero.", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            cbm.addElement("NO HAY CLASES EN EL SISTEMA");
            jb_crearExamen.setEnabled(false);
        } else {
            for (int i = 0; i < clasesEnSistema.size(); i++) {
                cbm.addElement(clasesEnSistema.get(i).getNombre());
            }
            jb_crearExamen.setEnabled(true);
        }
    }//GEN-LAST:event_jb_gotoCrearExamenActionPerformed

    private void jb_gotoCrearClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_gotoCrearClaseActionPerformed
        actualizaEstado();
        String nombreClase = JOptionPane.showInputDialog(this, "Ingrese el nombre de la nueva clase: ", "NOMBRE", JOptionPane.INFORMATION_MESSAGE);
        int opc = JOptionPane.showConfirmDialog(this, "Desea a??adir la clase " + nombreClase.toUpperCase() + " al sistema?", "CONFIRMAR", JOptionPane.YES_NO_CANCEL_OPTION);
        switch (opc) {
            case JOptionPane.YES_OPTION:
                Clase c = new Clase(clasesEnSistema.size() + 1, nombreClase);
                c.insertClase();
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(this, "Se cancelo la operacion");
                break;
            default:
                JOptionPane.showMessageDialog(this, "No se a??adio la nueva clase al sistema");
                break;
        }
    }//GEN-LAST:event_jb_gotoCrearClaseActionPerformed

    private void jb_gotoCrearPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_gotoCrearPreguntaActionPerformed
        actualizaEstado();
        DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_eleccionClasePregunta.getModel();
        cbm.removeAllElements();
        System.out.println(clasesEnSistema.size());
        DefaultComboBoxModel cbm2 = (DefaultComboBoxModel) cb_selectorCategoria.getModel();
        if (clasesEnSistema.isEmpty() && categoriasEnSistema.isEmpty()) {
            cbm.addElement("NO HAY CLASES EN EL SISTEMA");
            cbm.addElement("NO HAY CATEGORIAS EN EL SISTEMA");
            jb_crearNuevaPregunta.setEnabled(false);
        } else {
            jb_crearNuevaPregunta.setEnabled(true);
            for (int i = 0; i < clasesEnSistema.size(); i++) {
                cbm.addElement(clasesEnSistema.get(i).getNombre());
            }
            cb_eleccionClasePregunta.setModel(cbm);
        }
        pantallaCrearPregunta.pack();
        pantallaCrearPregunta.setAlwaysOnTop(true);
        pantallaCrearPregunta.setLocationRelativeTo(this);
        pantallaCrearPregunta.setVisible(true);
    }//GEN-LAST:event_jb_gotoCrearPreguntaActionPerformed

    private void jb_realizarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_realizarExamenActionPerformed
        actualizaEstado();
        DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_selectorExamenRealizar.getModel();
        cbm.removeAllElements();
        for (Matricula m : registrosEnMatricula) {
            if (m.getIdAlumno() == idAlumnoEnSesion) {
                cbm.addElement(m.getIdClaseMatriculada());
            }
        }
        jb_nextQuestion.setEnabled(false);
        pantalla_comienzExamen.pack();
        pantalla_comienzExamen.setModal(true);
        pantalla_comienzExamen.setLocationRelativeTo(null);
        pantalla_comienzExamen.setVisible(true);
    }//GEN-LAST:event_jb_realizarExamenActionPerformed

    private void jb_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registroActionPerformed
        int id = alumnosEnSistema.size() + 1;
        String login = tf_newLogin.getText();
        String nombre = tf_newName.getText();
        char[] pass = pf_newPassword.getPassword();
        String aux = "";
        for (int i = 0; i < pass.length; i++) {
            aux += pass[i];
        }
        Alumno a = new Alumno(id, nombre, login, aux);
        a.insertAlumno();
        pantallaRegistro.setVisible(false);
        JOptionPane.showMessageDialog(null, "Registro realizado");
        actualizaEstado();
    }//GEN-LAST:event_jb_registroActionPerformed

    private void jb_crearExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearExamenActionPerformed
        int id = examenesEnSistema.size() + 1;
        int idClase = cb_selectorClaseParaExamen.getSelectedIndex() + 1;
        int cantiPreguntas = Integer.parseInt(js_cantPreguntas.getValue().toString());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaRealizacion = new Date();
        fechaRealizacion = dc_fechaExamen.getDate();
        Examen e = new Examen(id, idClase, cantiPreguntas, format.format(fechaRealizacion));
        e.insertExamen();
        try {
            cn.actualizarAdmin();
        } catch (Exception ex) {
        }
        pantallaCrearExamen.setVisible(false);
        JOptionPane.showMessageDialog(null, "Examen ingresado al sistema");
    }//GEN-LAST:event_jb_crearExamenActionPerformed

    private void comenzarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comenzarExamenActionPerformed
        Random r = new Random();
        codClase = Integer.parseInt(cb_selectorExamenRealizar.getSelectedItem().toString());
        int cantExamenesDeClase = 0;
        for (int i = 0; i < examenesEnSistema.size(); i++) {
            if (codClase == examenesEnSistema.get(i).getIdClase()) {
                cantExamenesDeClase++;
            }
        }
        if (cantExamenesDeClase != 0) {
            examenEnUso = r.nextInt(examenesEnSistema.size());
            while (examenesEnSistema.get(examenEnUso).getIdClase() != codClase) {
                examenEnUso = r.nextInt(examenesEnSistema.size());
            }
            contadorTotalPreguntas = examenesEnSistema.get(examenEnUso).getCantPreguntas();
            contadorPreguntasRespondidas = 0;
            generadorPreguntaAleatoria();
            comenzarExamen.setEnabled(false);
            jb_nextQuestion.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "No hay examanes programados para esta clase");
        }
    }//GEN-LAST:event_comenzarExamenActionPerformed

    private void jb_nextQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_nextQuestionActionPerformed
        contadorPreguntasRespondidas++;
        generadorPreguntaAleatoria();
    }//GEN-LAST:event_jb_nextQuestionActionPerformed

    private void jb_terminarExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_terminarExamenActionPerformed
        System.out.println(idsPreguntasEnExamen.size());
        System.out.println(respsDadas.size());
        System.out.println(examenesEnSistema.get(examenEnUso).getIdExamen());
        System.out.println(idAlumnoEnSesion);

        ResultadoExamen r = new ResultadoExamen(idAlumnoEnSesion, examenesEnSistema.get(examenEnUso).getIdExamen(), nota);
        r.setIdPreguntas(idsPreguntasEnExamen);
        r.setRespuestasDadas(respsDadas);
        r.insertResultado();
        JOptionPane.showMessageDialog(null, "Su nota final es de: " + nota, "EXAMEN TERMINADO", JOptionPane.INFORMATION_MESSAGE);
        cn.actualizarAlumnos();
    }//GEN-LAST:event_jb_terminarExamenActionPerformed

    private void jb_crearNuevaPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearNuevaPreguntaActionPerformed
        String titulo = tf_tituloNuevPregunta.getText();
        String descripcion = ta_descrpNuevaPregunta.getText();
        int nuevoID = prefuntaEnSistema.size() + 1;
        int idClase = cb_eleccionClasePregunta.getSelectedIndex() + 1;
        boolean resp = false;
        if (rb_fRespNuevaPregunta.isSelected()) {
            resp = false;
        } else if (rb_vRespNuevaPregunta.isSelected()) {
            resp = true;
        }
        int idCategoria = 0;
        int selectorClase = cb_eleccionClasePregunta.getSelectedIndex() + 1;
        int selectorCategoria = cb_selectorCategoria.getSelectedIndex();
        String nombreCat = cb_selectorCategoria.getItemAt(selectorCategoria).toString();
        for (int i = 0; i < categoriasEnSistema.size(); i++) {
            if (nombreCat.equals(categoriasEnSistema.get(i).getNombreCategoria()) && selectorClase == categoriasEnSistema.get(i).getIdClase()) {
                idCategoria = categoriasEnSistema.get(i).getIdCategoria();
            }
        }
        Pregunta p = new Pregunta(nuevoID, idCategoria, idClase, titulo, descripcion, resp);
        p.insertPregunta();
        try {
            cn.actualizarAdmin();
        } catch (Exception ex) {
        }
        pantallaCrearPregunta.setVisible(false);
        JOptionPane.showMessageDialog(null, "Pregunta insertada al sistema");
    }//GEN-LAST:event_jb_crearNuevaPreguntaActionPerformed

    private void jb_gotoCrearCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_gotoCrearCategoriaActionPerformed
        actualizaEstado();
        pantallaCrearcategoria.pack();
        pantallaCrearcategoria.setAlwaysOnTop(true);
        pantallaCrearcategoria.setLocationRelativeTo(this);
        pantallaCrearcategoria.setVisible(true);
        if (clasesEnSistema.isEmpty()) {
            jb_crearCategoria.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No hay clases en el sistema a las que asociar una categoria", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else {
            jb_crearCategoria.setEnabled(true);
            DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_selectorClasesCategoria.getModel();
            cbm.removeAllElements();
            for (int i = 0; i < clasesEnSistema.size(); i++) {
                cbm.addElement(clasesEnSistema.get(i).getNombre());
            }
            cb_selectorClasesCategoria.setModel(cbm);
        }
    }//GEN-LAST:event_jb_gotoCrearCategoriaActionPerformed

    private void cb_eleccionClasePreguntaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_eleccionClasePreguntaItemStateChanged
        int selector = cb_eleccionClasePregunta.getSelectedIndex() + 1;
        DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_selectorCategoria.getModel();
        cbm.removeAllElements();
        for (int i = 0; i < categoriasEnSistema.size(); i++) {
            if (categoriasEnSistema.get(i).getIdClase() == selector) {
                cbm.addElement(categoriasEnSistema.get(i).getNombreCategoria());
            }
        }
        cb_selectorCategoria.setModel(cbm);
    }//GEN-LAST:event_cb_eleccionClasePreguntaItemStateChanged

    private void jb_crearCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearCategoriaActionPerformed
        String nombre = tf_NombreCategoria.getText();
        int idClase = cb_selectorClasesCategoria.getSelectedIndex() + 1;
        int idCategoria = categoriasEnSistema.size() + 1;
        Categoria c = new Categoria(idCategoria, nombre, idClase);
        c.insertCategoria();
        try {
            cn.actualizarAdmin();
        } catch (Exception ex) {
        }
        pantallaCrearcategoria.setVisible(false);
        JOptionPane.showMessageDialog(null, "Categoria insertada al sistema");
    }//GEN-LAST:event_jb_crearCategoriaActionPerformed

    private void jb_matriculaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_matriculaAlumnoActionPerformed

    }//GEN-LAST:event_jb_matriculaAlumnoActionPerformed

    private void jb_matricularClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_matricularClaseActionPerformed
        int idClaseMAtricular = clasesEnSistema.get(tb_clasesDisponibles.getSelectedRow()).getIdClase();
        Date fechaMatricula = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        int cantClasesMatriculadas = 0;
        DefaultTableModel tm = (DefaultTableModel) tb_clasesDisponibles.getModel();
        for (int i = 0; i < tb_clasesDisponibles.getRowCount(); i++) {
            if (Boolean.parseBoolean(tb_clasesDisponibles.getValueAt(i, 2).toString()) == true) {
                Matricula m = new Matricula(idAlumnoEnSesion, (Integer) tb_clasesDisponibles.getValueAt(i, 0), format.format(fechaMatricula));
                m.insertMatricula();
                cn.actualizarAdmin();
                cn.actualizarAlumnos();
                cantClasesMatriculadas++;
            }
        }
        if (cantClasesMatriculadas == tm.getRowCount()) {
            while (tm.getRowCount() > 0) {
                tm.removeRow(0);
            }
        } else {
            for (int i = 0; i < tb_clasesDisponibles.getRowCount(); i++) {
                if (Boolean.parseBoolean(tb_clasesDisponibles.getValueAt(i, 2).toString()) == true) {
                    tm.removeRow(i);
                }
            }
        }
        tb_clasesDisponibles.setModel(tm);
        pantalla_matricula.setVisible(false);
        actualizaEstado();
        JOptionPane.showMessageDialog(null, "Clase(s) matriculada(s) con exito.");
    }//GEN-LAST:event_jb_matricularClaseActionPerformed

    private void jb_goToMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_goToMatricularActionPerformed
        actualizaEstado();
        DefaultTableModel tm = (DefaultTableModel) tb_clasesDisponibles.getModel();
        while (tm.getRowCount() > 0) {
            tm.removeRow(0);
        }
        if (clasesEnSistema.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay clases en el sistema disponibles para matricular", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            jb_matricularClase.setEnabled(false);
        } else {
            for (Clase c : clasesEnSistema) {
                Object datos[] = new Object[3];
                datos[0] = c.getIdClase();
                datos[1] = c.getNombre();
                datos[2] = false;
                tm.addRow(datos);
            }
            for (int i = 0; i < tm.getRowCount(); i++) {
                for (Matricula m : registrosEnMatricula) {
                    if (m.getIdAlumno() == idAlumnoEnSesion && m.getIdClaseMatriculada() == (Integer) tm.getValueAt(i, 0)) {
                        tm.removeRow(i);
                    }
                }
            }
            for (Matricula m : registrosEnMatricula) {
                if (tm.getRowCount() == 1 && m.getIdAlumno() == idAlumnoEnSesion && m.getIdClaseMatriculada() == (Integer) tm.getValueAt(0, 0)) {
                    tm.removeRow(0);
                }
            }
            tb_clasesDisponibles.setModel(tm);
        }
        pantalla_matricula.pack();
        pantalla_matricula.setAlwaysOnTop(true);
        pantalla_matricula.setLocationRelativeTo(null);
        pantalla_matricula.setVisible(true);
        jb_matricularClase.setEnabled(true);
        if (tb_clasesDisponibles.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No tienes mas clases disponibles a matricular");
            jb_matricularClase.setEnabled(false);
        }
    }//GEN-LAST:event_jb_goToMatricularActionPerformed

    private void jb_crearCuadroNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearCuadroNotasActionPerformed
        actualizaEstado();
        DefaultTableModel tm = (DefaultTableModel) jt_notasAlumno.getModel();
        String nombre = "";
        while (tm.getRowCount() > 0) {
            tm.removeRow(0);
        }
        for (Alumno a : alumnosEnSistema) {
            if (a.getId() == idAlumnoEnSesion) {
                nombre = a.getNombre();
                break;
            }
        }
        for (ResultadoExamen r : resultadosAlumnos) {
            if (r.getIdAlumno() == idAlumnoEnSesion) {
                Object datos[] = new Object[3];
                datos[0] = nombre;
                int claseAux = 0;
                for (Examen e : examenesEnSistema) {
                    if (e.getIdExamen() == r.getIdExamen()) {
                        claseAux = e.getIdClase();
                    }
                }
                for (Clase c : clasesEnSistema) {
                    if (c.getIdClase() == claseAux) {
                        datos[1] = c.getNombre();
                    }
                }
                datos[2] = r.getNotaFinal();
                tm.addRow(datos);
            }
        }
        jt_notasAlumno.setModel(tm);
        jdialog_cuadroNotas.pack();
        jdialog_cuadroNotas.setModal(true);
        jdialog_cuadroNotas.setLocationRelativeTo(null);
        jdialog_cuadroNotas.setVisible(true);
    }//GEN-LAST:event_jb_crearCuadroNotasActionPerformed

    private void jb_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cerrarSesionActionPerformed
        seleccionAlumno.setVisible(false);
        idAlumnoEnSesion = -1;
    }//GEN-LAST:event_jb_cerrarSesionActionPerformed

    private void cb_selectorExamenRealizarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_selectorExamenRealizarItemStateChanged
        try {
            int identificadorClase = Integer.parseInt(cb_selectorExamenRealizar.getSelectedItem().toString());
            for (int i = 0; i < clasesEnSistema.size(); i++) {
                if (identificadorClase == clasesEnSistema.get(i).getIdClase()) {
                    tf_claseExamenRealizar.setText(clasesEnSistema.get(i).getNombre());
                    break;
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cb_selectorExamenRealizarItemStateChanged

    private void jb_comnezarNuevoExamenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_comnezarNuevoExamenActionPerformed
        comenzarExamen.setEnabled(true);
        boolean yaRealizoExamen = false;
        int auxClase = Integer.parseInt(cb_selectorExamenRealizar.getSelectedItem().toString());
        for (ResultadoExamen r : resultadosAlumnos) {
            for (Examen e : examenesEnSistema) {
                if (r.getIdAlumno() == idAlumnoEnSesion && e.getIdClase() == auxClase && e.getIdExamen() == r.getIdExamen()) {
                    yaRealizoExamen = true;
                }
            }
        }
        if (yaRealizoExamen) {
            JOptionPane.showMessageDialog(null, "Ya ha realizado examen de esta clase. Solamente puede tomar un (1) examen por clase.");
        } else {
            pantalla_comienzExamen.setVisible(false);
            pantallaExamen.pack();
            pantallaExamen.setLocationRelativeTo(null);
            pantallaExamen.setAlwaysOnTop(true);
            pantallaExamen.setVisible(true);
        }
    }//GEN-LAST:event_jb_comnezarNuevoExamenActionPerformed

    private void jb_listarClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_listarClasesActionPerformed
        try {
            DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_selectClaseListExamen.getModel();
            cbm.removeAllElements();
            for (int i = 0; i < clasesEnSistema.size(); i++) {
                cbm.addElement(clasesEnSistema.get(i).getNombre());
            }
            cb_selectClaseListExamen.setModel(cbm);
            list_ExamenPorClase.pack();
            list_ExamenPorClase.setLocationRelativeTo(null);
            list_ExamenPorClase.setAlwaysOnTop(true);
            list_ExamenPorClase.setVisible(true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jb_listarClasesActionPerformed

    private void cb_selectClaseListExamenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_selectClaseListExamenItemStateChanged
        try {
            actualizaEstado();
            String claseNombre = cb_selectClaseListExamen.getSelectedItem().toString();
            DefaultTableModel tm = (DefaultTableModel) jt_listExamenes.getModel();
            while (tm.getRowCount() > 0) {
                tm.removeRow(0);
            }
            int idAux = 0;
            for (Clase c : clasesEnSistema) {
                if (claseNombre.equals(c.getNombre())) {
                    idAux = c.getIdClase();
                }
            }
            for (Examen e : examenesEnSistema) {
                if (e.getIdClase() == idAux) {
                    Object datos[] = new Object[3];
                    datos[0] = e.getIdExamen();
                    datos[1] = e.getCantPreguntas();
                    datos[2] = e.getFechaRealizacion();
                    tm.addRow(datos);
                }
            }
            jt_listExamenes.setModel(tm);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_cb_selectClaseListExamenItemStateChanged

    private void got_verCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_got_verCategoriasActionPerformed
        String id = cb_selectClaseListExamen.getSelectedItem().toString();
        int auxId = 0;
        DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_SelectorCategoriaList.getModel();
        cbm.removeAllElements();
        for (Clase c : clasesEnSistema) {
            if (id.equals(c.getNombre())) {
                auxId = c.getIdClase();
            }
        }
        for (int i = 0; i < categoriasEnSistema.size(); i++) {
            if (categoriasEnSistema.get(i).getIdClase() == auxId) {
                cbm.addElement(categoriasEnSistema.get(i).getNombreCategoria());
            }
        }
        cb_SelectorCategoriaList.setModel(cbm);
        list_Categorias.pack();
        list_Categorias.setLocationRelativeTo(null);
        list_Categorias.setAlwaysOnTop(true);
        list_Categorias.setVisible(true);
    }//GEN-LAST:event_got_verCategoriasActionPerformed

    private void cb_SelectorCategoriaListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_SelectorCategoriaListItemStateChanged
        try {
            String categoria = cb_SelectorCategoriaList.getSelectedItem().toString();
            int idCate = 0;
            DefaultTableModel tm = (DefaultTableModel) tb_listPReguntasCategoria.getModel();
            while (tm.getRowCount() > 0) {
                tm.removeRow(0);
            }
            for (Categoria c : categoriasEnSistema) {
                if (c.getNombreCategoria().equals(categoria)) {
                    idCate = c.getIdCategoria();
                }
            }
            for (int i = 0; i < prefuntaEnSistema.size(); i++) {
                if (prefuntaEnSistema.get(i).getIdCategoria() == idCate) {
                    Object datos[] = new Object[4];
                    datos[0] = prefuntaEnSistema.get(i).getIdPregunta();
                    datos[1] = prefuntaEnSistema.get(i).getTitulo();
                    datos[2] = prefuntaEnSistema.get(i).getDescrpcion();
                    if (prefuntaEnSistema.get(i).isRespuesta()) {
                        datos[3] = "VERDADERO";
                    } else {
                        datos[3] = "FALSO";
                    }
                    tm.addRow(datos);
                }
            }
            tb_listPReguntasCategoria.setModel(tm);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_cb_SelectorCategoriaListItemStateChanged

    private void goto_CentroCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goto_CentroCalificacionesActionPerformed
        DefaultTableModel tm = (DefaultTableModel) tb_CentroDeNotas.getModel();
        while (tm.getRowCount() > 0) {
            tm.removeRow(0);
        }
        for (int i = 0; i < resultadosAlumnos.size(); i++) {
            Object datos[] = new Object[3];
            for (int j = 0; j < alumnosEnSistema.size(); j++) {
                if (resultadosAlumnos.get(i).getIdAlumno() == alumnosEnSistema.get(j).getId()) {
                    datos[0] = alumnosEnSistema.get(j).getNombre();
                }
            }
            int aux = 0;
            for (int j = 0; j < examenesEnSistema.size(); j++) {
                if (resultadosAlumnos.get(i).getIdExamen() == examenesEnSistema.get(j).getIdExamen()) {
                    aux = examenesEnSistema.get(j).getIdClase();
                }
            }
            for (int j = 0; j < clasesEnSistema.size(); j++) {
                if (aux == clasesEnSistema.get(j).getIdClase()) {
                    datos[1] = clasesEnSistema.get(j).getNombre();
                }
            }
            datos[2] = resultadosAlumnos.get(i).getNotaFinal();
            tm.addRow(datos);
        }
        tb_CentroDeNotas.setModel(tm);
        DefaultComboBoxModel cbm = (DefaultComboBoxModel) cb_filtroClasesNotas.getModel();
        cbm.removeAllElements();
        for (int i = 0; i < clasesEnSistema.size(); i++) {
            cbm.addElement(clasesEnSistema.get(i).getNombre());
        }
        cb_filtroClasesNotas.setModel(cbm);
        centroCalificaciones.pack();
        centroCalificaciones.setLocationRelativeTo(null);
        centroCalificaciones.setAlwaysOnTop(true);
        centroCalificaciones.setVisible(true);
    }//GEN-LAST:event_goto_CentroCalificacionesActionPerformed

    private void cb_filtroClasesNotasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_filtroClasesNotasItemStateChanged
        DefaultTableModel tm = (DefaultTableModel) tb_CentroDeNotas.getModel();
        String nombreAux = cb_filtroClasesNotas.getSelectedItem().toString();
        while (tm.getRowCount() > 0) {
            tm.removeRow(0);
        }
        for (int i = 0; i < resultadosAlumnos.size(); i++) {
            Object datos[] = new Object[3];
            for (int j = 0; j < alumnosEnSistema.size(); j++) {
                if (resultadosAlumnos.get(i).getIdAlumno() == alumnosEnSistema.get(j).getId()) {
                    datos[0] = alumnosEnSistema.get(j).getNombre();
                }
            }
            int aux = 0;
            for (int j = 0; j < examenesEnSistema.size(); j++) {
                if (resultadosAlumnos.get(i).getIdExamen() == examenesEnSistema.get(j).getIdExamen()) {
                    aux = examenesEnSistema.get(j).getIdClase();
                }
            }
            for (int j = 0; j < clasesEnSistema.size(); j++) {
                if (aux == clasesEnSistema.get(j).getIdClase()) {
                    datos[1] = clasesEnSistema.get(j).getNombre();
                }
            }
            datos[2] = resultadosAlumnos.get(i).getNotaFinal();
            if (nombreAux.equals(datos[1].toString())) {
                tm.addRow(datos);
            }
        }
        tb_CentroDeNotas.setModel(tm);
    }//GEN-LAST:event_cb_filtroClasesNotasItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tm = (DefaultTableModel) table_notificaciones.getModel();
        while (tm.getRowCount() > 0) {
            tm.removeRow(0);
        }
        for (int i = 0; i < registrosEnMatricula.size(); i++) {
            if (registrosEnMatricula.get(i).getIdAlumno() == idAlumnoEnSesion) {
                Object datos[] = new Object[2];
                String aux = "Usted matriculo la clase de :";
                for (int j = 0; j < clasesEnSistema.size(); j++) {
                    if (registrosEnMatricula.get(i).getIdClaseMatriculada() == clasesEnSistema.get(j).getIdClase()) {
                        aux += clasesEnSistema.get(j).getNombre();
                        datos[0] = aux;
                    }
                }
                datos[1] = new Date().toString();
                tm.addRow(datos);
            }
        }
        table_notificaciones.setModel(tm);
        frameNotificaciones.pack();
        frameNotificaciones.setLocationRelativeTo(null);
        frameNotificaciones.setAlwaysOnTop(true);
        frameNotificaciones.setVisible(true);
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
    private javax.swing.JComboBox<String> cb_SelectorCategoriaList;
    private javax.swing.JComboBox<String> cb_eleccionClasePregunta;
    private javax.swing.JComboBox<String> cb_filtroClasesNotas;
    private javax.swing.JComboBox<String> cb_selectClaseListExamen;
    private javax.swing.JComboBox<String> cb_selectorCategoria;
    private javax.swing.JComboBox<String> cb_selectorClaseParaExamen;
    private javax.swing.JComboBox<String> cb_selectorClasesCategoria;
    private javax.swing.JComboBox<String> cb_selectorExamenRealizar;
    private javax.swing.JFrame centroCalificaciones;
    private javax.swing.JButton comenzarExamen;
    private com.toedter.calendar.JDateChooser dc_fechaExamen;
    private javax.swing.JFrame frameNotificaciones;
    private javax.swing.JButton got_verCategorias;
    private javax.swing.JButton goto_CentroCalificaciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JToggleButton jb_cerrarSesion;
    private javax.swing.JButton jb_comnezarNuevoExamen;
    private javax.swing.JButton jb_crearCategoria;
    private javax.swing.JButton jb_crearCuadroNotas;
    private javax.swing.JButton jb_crearExamen;
    private javax.swing.JButton jb_crearNuevaPregunta;
    private javax.swing.JButton jb_goBackExamen;
    private javax.swing.JButton jb_goToMatricular;
    private javax.swing.JButton jb_gotoCrearCategoria;
    private javax.swing.JButton jb_gotoCrearClase;
    private javax.swing.JButton jb_gotoCrearExamen;
    private javax.swing.JButton jb_gotoCrearPregunta;
    private javax.swing.JButton jb_gotoRegistro;
    private javax.swing.JButton jb_iniciarSesion;
    private javax.swing.JButton jb_listarClases;
    private javax.swing.JButton jb_matricularClase;
    private javax.swing.JButton jb_nextQuestion;
    private javax.swing.JButton jb_realizarExamen;
    private javax.swing.JButton jb_registro;
    private javax.swing.JButton jb_terminarExamen;
    private javax.swing.JDialog jdialog_cuadroNotas;
    private javax.swing.JSpinner js_cantPreguntas;
    private javax.swing.JTable jt_listExamenes;
    private javax.swing.JTable jt_notasAlumno;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNewLogin;
    private javax.swing.JLabel labelNewName;
    private javax.swing.JLabel labelNewPassword;
    private javax.swing.JLabel label_confirmPassword;
    private javax.swing.JLabel lb_tituloPregunta;
    private javax.swing.JFrame list_Categorias;
    private javax.swing.JFrame list_ExamenPorClase;
    private javax.swing.JFrame pantallaCrearExamen;
    private javax.swing.JFrame pantallaCrearPregunta;
    private javax.swing.JFrame pantallaCrearcategoria;
    private javax.swing.JFrame pantallaExamen;
    private javax.swing.JFrame pantallaRegistro;
    private javax.swing.JDialog pantalla_comienzExamen;
    private javax.swing.JFrame pantalla_matricula;
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
    private javax.swing.JTable table_notificaciones;
    private javax.swing.JTable tb_CentroDeNotas;
    private javax.swing.JTable tb_clasesDisponibles;
    private javax.swing.JTable tb_listPReguntasCategoria;
    private javax.swing.JTextField tf_NombreCategoria;
    private javax.swing.JTextField tf_claseExamenRealizar;
    private javax.swing.JTextField tf_login;
    private javax.swing.JTextField tf_newLogin;
    private javax.swing.JTextField tf_newName;
    private javax.swing.JTextField tf_tituloNuevPregunta;
    // End of variables declaration//GEN-END:variables
    private conexionNeo4J cn = new conexionNeo4J("bolt://localhost:7687", "neo4j", "jaguaresac7C");
    private Administrador ad = new Administrador();
    private ArrayList<Clase> clasesEnSistema = new ArrayList<>();
    private ArrayList<Examen> examenesEnSistema = new ArrayList<>();
    private ArrayList<Alumno> alumnosEnSistema = new ArrayList<>();
    private ArrayList<Categoria> categoriasEnSistema = new ArrayList<>();
    private ArrayList<Pregunta> prefuntaEnSistema = new ArrayList<>();
    private ArrayList<ResultadoExamen> resultadosAlumnos = new ArrayList<>();
    private ArrayList<Matricula> registrosEnMatricula = new ArrayList<>();
    private ArrayList<Integer> idsPreguntasEnExamen = new ArrayList<>();
    private ArrayList<Boolean> respsDadas = new ArrayList<>();
    private int idAlumnoEnSesion = 0;
    private int contadorPreguntasRespondidas = 0;
    private int contadorTotalPreguntas = 0;
    private int examenEnUso = 0;
    private int codClase;
    private int nota = 0;

    boolean comenzarTerminar = true;
    boolean flag = false;

    public void actualizaEstado() {
        clasesEnSistema.clear();
        examenesEnSistema.clear();
        alumnosEnSistema.clear();
        categoriasEnSistema.clear();
        prefuntaEnSistema.clear();
        registrosEnMatricula.clear();
        resultadosAlumnos.clear();

        clasesEnSistema = ad.cargarClases();
        examenesEnSistema = ad.cargarExamenes();
        alumnosEnSistema = ad.cargarAlumnos();
        categoriasEnSistema = ad.cargarCategorias();
        prefuntaEnSistema = ad.cargarPreguntas();
        registrosEnMatricula = ad.cargarMatricula();
        resultadosAlumnos = ad.cargarResultados();
    }

    public void generadorPreguntaAleatoria() {
        if (!prefuntaEnSistema.isEmpty()) {
            Random r = new Random();
            int preguntaRandom = r.nextInt(prefuntaEnSistema.size());
            Pregunta p = prefuntaEnSistema.get(preguntaRandom);
            while (p.getIdClase() != codClase) {
                preguntaRandom = r.nextInt(prefuntaEnSistema.size());
                p = prefuntaEnSistema.get(preguntaRandom);
            }
            while (idsPreguntasEnExamen.contains(preguntaRandom)) {
                preguntaRandom = r.nextInt(prefuntaEnSistema.size());
                p = prefuntaEnSistema.get(preguntaRandom);
            }
            if (contadorPreguntasRespondidas == contadorTotalPreguntas) {
                if (rb_respAlumnoV.isSelected()) {
                    respsDadas.add(true);
                    if (p.isRespuesta() == true) {
                        nota += 5;
                    }
                } else if (rb_respAlumnoF.isSelected()) {
                    respsDadas.add(false);
                    if (p.isRespuesta() == false) {
                        nota += 5;
                    }
                } else {
                    respsDadas.add(null);
                }
                idsPreguntasEnExamen.add(p.getIdPregunta());

            } else if (contadorPreguntasRespondidas < contadorTotalPreguntas) {
                lb_tituloPregunta.setText(p.getTitulo());
                ta_descrpPregunta.setText(p.getDescrpcion());
                if (contadorPreguntasRespondidas != 0) {
                    if (rb_respAlumnoV.isSelected()) {
                        respsDadas.add(true);
                        if (p.isRespuesta() == true) {
                            nota += 5;
                        }
                    } else if (rb_respAlumnoF.isSelected()) {
                        respsDadas.add(false);
                        if (p.isRespuesta() == false) {
                            nota += 5;
                        }
                    } else {
                        respsDadas.add(null);
                    }
                    idsPreguntasEnExamen.add(p.getIdPregunta());
                }
            } else {
                jb_nextQuestion.setEnabled(false);
            }
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

}
