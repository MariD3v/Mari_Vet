package daw.project;

import static daw.project.Perro.deletePe;
import static daw.project.Perro.insertPe;
import static daw.project.Perro.selectPe;
import static daw.project.Perro.updatePe;
import static daw.project.Propietario.deletePro;
import static daw.project.Propietario.insertPro;
import static daw.project.Propietario.selectPro;
import static daw.project.Propietario.updatePro;
import static daw.project.Veterinario.deleteVe;
import static daw.project.Veterinario.insertVe;
import static daw.project.Veterinario.selectVe;
import static daw.project.Veterinario.updateVe;
import java.util.List;
import javax.swing.JFrame;

public class JPanelVeterinaria extends javax.swing.JPanel {

    public JPanelVeterinaria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaResultado = new javax.swing.JTextArea();
        jBSelectPropietario = new javax.swing.JButton();
        jBInsertPropietario = new javax.swing.JButton();
        jBUpdatePropietario = new javax.swing.JButton();
        jBDeletePropietario = new javax.swing.JButton();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jBDeleteVeterinario = new javax.swing.JButton();
        jBSelectVeterinario = new javax.swing.JButton();
        jBInsertVeterinario = new javax.swing.JButton();
        jBUpdateVeterinario = new javax.swing.JButton();
        jBDeletePerro = new javax.swing.JButton();
        jBSelectPerro = new javax.swing.JButton();
        jBInsertPerro = new javax.swing.JButton();
        jBUpdatePerro = new javax.swing.JButton();
        id_veterinario = new javax.swing.JTextField();
        dni_propietario = new javax.swing.JTextField();
        nombre_veterinario = new javax.swing.JTextField();
        id_propietarione = new javax.swing.JTextField();
        id_perro = new javax.swing.JTextField();
        peso_perro = new javax.swing.JTextField();
        nombre_perro = new javax.swing.JTextField();
        id_propietariope = new javax.swing.JTextField();
        id_veterinariope = new javax.swing.JTextField();
        raza_color = new javax.swing.JTextField();
        id_propietario = new javax.swing.JTextField();
        nombre_propietario = new javax.swing.JTextField();
        edad_veterinario = new javax.swing.JTextField();
        nombrene = new javax.swing.JTextField();
        dni_propietario1 = new javax.swing.JTextField();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        id_Veterinarione = new javax.swing.JTextField();
        nombrene2 = new javax.swing.JTextField();
        edad_veterinario2 = new javax.swing.JTextField();
        label9 = new java.awt.Label();
        id_veterinario3 = new javax.swing.JTextField();
        id_propietario3 = new javax.swing.JTextField();
        nombrene3 = new javax.swing.JTextField();
        id_Perrone = new javax.swing.JTextField();
        rycne = new javax.swing.JTextField();
        Pesone = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        label1.setText("label1");

        setBackground(new java.awt.Color(239, 174, 204));

        jtaResultado.setEditable(false);
        jtaResultado.setBackground(new java.awt.Color(255, 255, 204));
        jtaResultado.setColumns(20);
        jtaResultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jtaResultado.setForeground(new java.awt.Color(102, 102, 0));
        jtaResultado.setRows(5);
        jScrollPane1.setViewportView(jtaResultado);

        jBSelectPropietario.setBackground(new java.awt.Color(204, 204, 255));
        jBSelectPropietario.setForeground(new java.awt.Color(102, 0, 153));
        jBSelectPropietario.setText("SELECT");
        jBSelectPropietario.setMaximumSize(new java.awt.Dimension(100, 23));
        jBSelectPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelectPropietarioActionPerformed(evt);
            }
        });

        jBInsertPropietario.setBackground(new java.awt.Color(204, 204, 255));
        jBInsertPropietario.setForeground(new java.awt.Color(102, 0, 102));
        jBInsertPropietario.setText("INSERT");
        jBInsertPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertPropietarioActionPerformed(evt);
            }
        });

        jBUpdatePropietario.setBackground(new java.awt.Color(204, 204, 255));
        jBUpdatePropietario.setForeground(new java.awt.Color(102, 0, 102));
        jBUpdatePropietario.setText("UPDATE");
        jBUpdatePropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdatePropietarioActionPerformed(evt);
            }
        });

        jBDeletePropietario.setBackground(new java.awt.Color(204, 204, 255));
        jBDeletePropietario.setForeground(new java.awt.Color(102, 0, 102));
        jBDeletePropietario.setText("DELETE");
        jBDeletePropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletePropietarioActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Sitka Text", 3, 48)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 51));
        label2.setPreferredSize(new java.awt.Dimension(100, 20));
        label2.setText("EL  VETERINARIO  DE  MARI");

        label3.setBackground(new java.awt.Color(227, 255, 227));
        label3.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 204, 0));
        label3.setText(" PROPIETARIO");

        jBDeleteVeterinario.setBackground(new java.awt.Color(204, 204, 255));
        jBDeleteVeterinario.setForeground(new java.awt.Color(102, 0, 102));
        jBDeleteVeterinario.setText("DELETE");
        jBDeleteVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeleteVeterinarioActionPerformed(evt);
            }
        });

        jBSelectVeterinario.setBackground(new java.awt.Color(204, 204, 255));
        jBSelectVeterinario.setForeground(new java.awt.Color(102, 0, 153));
        jBSelectVeterinario.setText("SELECT");
        jBSelectVeterinario.setMaximumSize(new java.awt.Dimension(100, 23));
        jBSelectVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelectVeterinarioActionPerformed(evt);
            }
        });

        jBInsertVeterinario.setBackground(new java.awt.Color(204, 204, 255));
        jBInsertVeterinario.setForeground(new java.awt.Color(102, 0, 102));
        jBInsertVeterinario.setText("INSERT");
        jBInsertVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertVeterinarioActionPerformed(evt);
            }
        });

        jBUpdateVeterinario.setBackground(new java.awt.Color(204, 204, 255));
        jBUpdateVeterinario.setForeground(new java.awt.Color(102, 0, 102));
        jBUpdateVeterinario.setText("UPDATE");
        jBUpdateVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateVeterinarioActionPerformed(evt);
            }
        });

        jBDeletePerro.setBackground(new java.awt.Color(204, 204, 255));
        jBDeletePerro.setForeground(new java.awt.Color(102, 0, 102));
        jBDeletePerro.setText("DELETE");
        jBDeletePerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletePerroActionPerformed(evt);
            }
        });

        jBSelectPerro.setBackground(new java.awt.Color(204, 204, 255));
        jBSelectPerro.setForeground(new java.awt.Color(102, 0, 153));
        jBSelectPerro.setText("SELECT");
        jBSelectPerro.setMaximumSize(new java.awt.Dimension(100, 23));
        jBSelectPerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelectPerroActionPerformed(evt);
            }
        });

        jBInsertPerro.setBackground(new java.awt.Color(204, 204, 255));
        jBInsertPerro.setForeground(new java.awt.Color(102, 0, 102));
        jBInsertPerro.setText("INSERT");
        jBInsertPerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertPerroActionPerformed(evt);
            }
        });

        jBUpdatePerro.setBackground(new java.awt.Color(204, 204, 255));
        jBUpdatePerro.setForeground(new java.awt.Color(102, 0, 102));
        jBUpdatePerro.setText("UPDATE");
        jBUpdatePerro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdatePerroActionPerformed(evt);
            }
        });

        id_propietarione.setEditable(false);
        id_propietarione.setBackground(new java.awt.Color(227, 255, 255));
        id_propietarione.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        id_propietarione.setForeground(new java.awt.Color(0, 153, 204));
        id_propietarione.setText(" ID Propietario");
        id_propietarione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_propietarioneActionPerformed(evt);
            }
        });

        id_propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_propietarioActionPerformed(evt);
            }
        });

        nombrene.setEditable(false);
        nombrene.setBackground(new java.awt.Color(227, 255, 255));
        nombrene.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        nombrene.setForeground(new java.awt.Color(0, 153, 204));
        nombrene.setText("     Nombre");
        nombrene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreneActionPerformed(evt);
            }
        });

        dni_propietario1.setEditable(false);
        dni_propietario1.setBackground(new java.awt.Color(227, 255, 255));
        dni_propietario1.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        dni_propietario1.setForeground(new java.awt.Color(0, 153, 204));
        dni_propietario1.setText("      DNI");
        dni_propietario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dni_propietario1ActionPerformed(evt);
            }
        });

        label7.setBackground(new java.awt.Color(220, 255, 220));
        label7.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 204, 0));
        label7.setText(" VETERINARIO");

        label8.setBackground(new java.awt.Color(228, 255, 228));
        label8.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        label8.setForeground(new java.awt.Color(0, 204, 0));
        label8.setText(" PERRO");

        id_Veterinarione.setEditable(false);
        id_Veterinarione.setBackground(new java.awt.Color(227, 255, 255));
        id_Veterinarione.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        id_Veterinarione.setForeground(new java.awt.Color(0, 153, 204));
        id_Veterinarione.setText(" ID Veterinario");
        id_Veterinarione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_VeterinarioneActionPerformed(evt);
            }
        });

        nombrene2.setEditable(false);
        nombrene2.setBackground(new java.awt.Color(227, 255, 255));
        nombrene2.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        nombrene2.setForeground(new java.awt.Color(0, 153, 204));
        nombrene2.setText("     Nombre");
        nombrene2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrene2ActionPerformed(evt);
            }
        });

        edad_veterinario2.setEditable(false);
        edad_veterinario2.setBackground(new java.awt.Color(227, 255, 255));
        edad_veterinario2.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        edad_veterinario2.setForeground(new java.awt.Color(0, 153, 204));
        edad_veterinario2.setText("      Edad");
        edad_veterinario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edad_veterinario2ActionPerformed(evt);
            }
        });

        label9.setBackground(new java.awt.Color(229, 255, 229));
        label9.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        label9.setForeground(new java.awt.Color(0, 204, 0));
        label9.setText(" RESULTADO");

        id_veterinario3.setEditable(false);
        id_veterinario3.setBackground(new java.awt.Color(227, 255, 255));
        id_veterinario3.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        id_veterinario3.setForeground(new java.awt.Color(0, 153, 204));
        id_veterinario3.setText("ID Veterinario");
        id_veterinario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_veterinario3ActionPerformed(evt);
            }
        });

        id_propietario3.setEditable(false);
        id_propietario3.setBackground(new java.awt.Color(227, 255, 255));
        id_propietario3.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        id_propietario3.setForeground(new java.awt.Color(0, 153, 204));
        id_propietario3.setText(" ID Propietario");
        id_propietario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_propietario3ActionPerformed(evt);
            }
        });

        nombrene3.setEditable(false);
        nombrene3.setBackground(new java.awt.Color(227, 255, 255));
        nombrene3.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        nombrene3.setForeground(new java.awt.Color(0, 153, 204));
        nombrene3.setText("    Nombre");
        nombrene3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrene3ActionPerformed(evt);
            }
        });

        id_Perrone.setEditable(false);
        id_Perrone.setBackground(new java.awt.Color(227, 255, 255));
        id_Perrone.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        id_Perrone.setForeground(new java.awt.Color(0, 153, 204));
        id_Perrone.setText("   ID Perro");
        id_Perrone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_PerroneActionPerformed(evt);
            }
        });

        rycne.setEditable(false);
        rycne.setBackground(new java.awt.Color(227, 255, 255));
        rycne.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        rycne.setForeground(new java.awt.Color(0, 153, 204));
        rycne.setText(" Raza y Color");
        rycne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rycneActionPerformed(evt);
            }
        });

        Pesone.setEditable(false);
        Pesone.setBackground(new java.awt.Color(227, 255, 255));
        Pesone.setFont(new java.awt.Font("Lucida Console", 0, 14)); // NOI18N
        Pesone.setForeground(new java.awt.Color(0, 153, 204));
        Pesone.setText("     Peso");
        Pesone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBDeletePropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSelectPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBInsertPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBUpdatePropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dni_propietario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre_propietario)
                    .addComponent(id_propietario)
                    .addComponent(id_propietarione)
                    .addComponent(nombrene)
                    .addComponent(dni_propietario1))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id_Veterinarione)
                            .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_veterinario)
                            .addComponent(nombre_veterinario)
                            .addComponent(jBDeleteVeterinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBSelectVeterinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBInsertVeterinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBUpdateVeterinario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edad_veterinario)
                            .addComponent(edad_veterinario2)
                            .addComponent(nombrene2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(id_propietario3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(id_veterinario3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(id_perro)
                                                .addComponent(id_Perrone)
                                                .addComponent(raza_color)
                                                .addComponent(rycne, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                            .addComponent(id_propietariope, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombrene3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombre_perro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Pesone, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(peso_perro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(id_veterinariope, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBUpdatePerro, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jBInsertPerro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                            .addComponent(jBSelectPerro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBDeletePerro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(252, 252, 252))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_Veterinarione, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_propietarione, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrene3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_Perrone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_perro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_perro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombrene, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrene2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rycne, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pesone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(raza_color, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peso_perro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dni_propietario1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(edad_veterinario2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id_propietario3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id_veterinario3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_propietariope, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_veterinariope, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dni_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edad_veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBDeletePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBDeleteVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBDeletePerro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBSelectPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSelectVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSelectPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBInsertPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBInsertVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBInsertPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBUpdatePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBUpdateVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBUpdatePerro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(495, 495, 495))
        );

        label2.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents
    private int getIdPropietario() {
        int id = Integer.parseInt(id_propietario.getText());
        return id;
    }

    private String getNombrePropietario() {
        String nombre = nombre_propietario.getText();
        return nombre;
    }

    private String getDniPropietario() {
        String dni = dni_propietario.getText();
        return dni;
    }

    private int getIdVeterinario() {
        int id = Integer.parseInt(id_veterinario.getText());
        return id;
    }

    private String getNombreVeterinario() {
        String nombre = nombre_veterinario.getText();
        return nombre;
    }

    private int getEdadVeterinario() {
        int edad = Integer.parseInt(edad_veterinario.getText());
        return edad;
    }

    private int getIdPerro() {
        int id = Integer.parseInt(id_perro.getText());
        return id;
    }

    private String getNombrePerro() {
        String nombre = nombre_perro.getText();
        return nombre;
    }

    private String getRYCPerro() {
        String ryc = raza_color.getText();
        return ryc;
    }

    private int getPesoPerro() {
        int peso = Integer.parseInt(peso_perro.getText());
        return peso;
    }

    private int getIdProPe() {
        int idProPe = Integer.parseInt(id_propietariope.getText());
        return idProPe;
    }

    private int getIdVePe() {
        int idVePe = Integer.parseInt(id_veterinariope.getText());
        return idVePe;
    }

    private void jBSelectPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelectPropietarioActionPerformed
        try {
            Propietario p = selectPro(getIdPropietario());
            nombre_propietario.setText(p.getNombre());
            dni_propietario.setText(p.getDni());
            String resultado = " Perros en propiedad\n==========================\n";
            List<Perro> pe = p.getPerros();
            for (Perro perro : pe) {
                resultado += (perro.getNombre() + " \n");
            }
            jtaResultado.setText(resultado);
        } catch (Exception e) {
            String resultado = " Error al seleccionar.\n Comprueba tus datos.";
            jtaResultado.setText(resultado);
        }

    }//GEN-LAST:event_jBSelectPropietarioActionPerformed

    private void jBUpdatePropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdatePropietarioActionPerformed
        try {
            Propietario p = updatePro(getIdPropietario(), getNombrePropietario(), getDniPropietario());
            String resultado = " " + p.getNombre() + " actualizado.\n";
            resultado += "==========================";
            jtaResultado.setText(resultado);
        } catch (Exception e) {
            String resultado = " Error al actualizar.";
            jtaResultado.setText(resultado);
        }
    }//GEN-LAST:event_jBUpdatePropietarioActionPerformed

    private void jBInsertPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertPropietarioActionPerformed
        try {
            Propietario p = insertPro(getIdPropietario(), getNombrePropietario(), getDniPropietario());
            String resultado = " " + p.getNombre() + " insertado.\n";
            resultado += "==========================";
            jtaResultado.setText(resultado);
        } catch (Exception e) {
            String resultado = " Error al insertar.";
            jtaResultado.setText(resultado);
        }
    }//GEN-LAST:event_jBInsertPropietarioActionPerformed

    private void jBDeletePropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletePropietarioActionPerformed
        try {
            Propietario p = selectPro(getIdPropietario());
            List<Perro> pe = p.getPerros();
            Boolean hayperros = false;
            for (Perro perro : pe) {
                hayperros = true;
            }
            if (!hayperros) {
                deletePro(getIdPropietario());
                String resultado = " " + p.getNombre() + " eliminado.\n";
                resultado += "==========================";
                jtaResultado.setText(resultado);
            } else {
                jtaResultado.setText(" Tienes perros a los que cuidar.\n Para borrar este propietario primero borra sus perros.");
            }
        } catch (Exception e) {
            String resultado = " Error al borrar.";
            jtaResultado.setText(resultado);
        }
    }//GEN-LAST:event_jBDeletePropietarioActionPerformed

    private void jBDeleteVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeleteVeterinarioActionPerformed
        try {
            Veterinario v = selectVe(getIdVeterinario());
            List<Perro> pe = v.getPerros();
            Boolean hayperros = false;
            for (Perro perro : pe) {
                hayperros = true;
            }
            if (!hayperros) {
                deleteVe(getIdVeterinario());
                String resultado = " " + v.getNombre() + " eliminado.\n";
                resultado += "==========================";
                jtaResultado.setText(resultado);
            } else {
                jtaResultado.setText(" Tienes perros a los que cuidar.\n Para borrar este veterinario primero borra los perros a su cargo.");
            }

        } catch (Exception e) {
            String resultado = " Error al borrar.";
            jtaResultado.setText(resultado);
        }
    }//GEN-LAST:event_jBDeleteVeterinarioActionPerformed

    private void jBSelectVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelectVeterinarioActionPerformed
        try {
            Veterinario v = selectVe(getIdVeterinario());
            nombre_veterinario.setText(v.getNombre());
            edad_veterinario.setText(v.getEdad().toString());
            String resultado = " Perros a su cuidado\n==========================\n";
            List<Perro> pe = v.getPerros();
            for (Perro perro : pe) {
                resultado += (perro.getNombre() + " \n");
            }
            jtaResultado.setText(resultado);
        } catch (Exception e) {
            String resultado = " Error al seleccionar.\n Comprueba tus datos";
            jtaResultado.setText(resultado);
        }
    }//GEN-LAST:event_jBSelectVeterinarioActionPerformed

    private void jBInsertVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertVeterinarioActionPerformed
        try {
            Veterinario v = insertVe(getIdVeterinario(), getNombreVeterinario(), getEdadVeterinario());
            String resultado = " " + v.getNombre() + " insertado.\n";
            resultado += "==========================";
            jtaResultado.setText(resultado);

        } catch (Exception e) {
            String resultado = " Error al insertar.";
            jtaResultado.setText(resultado);
        }

    }//GEN-LAST:event_jBInsertVeterinarioActionPerformed

    private void jBUpdateVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateVeterinarioActionPerformed
        try {
            Veterinario v = updateVe(getIdVeterinario(), getNombreVeterinario(), getEdadVeterinario());
            String resultado = " " + v.getNombre() + " actualizado.\n";
            resultado += "==========================";
            jtaResultado.setText(resultado);
        } catch (Exception e) {
            String resultado = " Error al actualizar.";
            jtaResultado.setText(resultado);
        }
    }//GEN-LAST:event_jBUpdateVeterinarioActionPerformed

    private void jBDeletePerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletePerroActionPerformed
        try {
            Perro p = deletePe(getIdPerro());
            String resultado = " " + p.getNombre() + " eliminado.\n";
            resultado += "============================";
            jtaResultado.setText(resultado);
        } catch (Exception e) {
            String resultado = " Error al borrar.";
            jtaResultado.setText(resultado);
        }
    }//GEN-LAST:event_jBDeletePerroActionPerformed

    private void jBSelectPerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelectPerroActionPerformed
        try {
            Perro p = selectPe(getIdPerro());
            nombre_perro.setText(p.getNombre());
            raza_color.setText(p.getRazaYcolor());
            peso_perro.setText(p.getPeso().toString());
            id_propietariope.setText(p.getIdPropietario().toString());
            id_veterinariope.setText(p.getIdVeterinario().toString());
            String resultado = "Selección\n";
            resultado += "==========================\n";
            resultado += ("ID_Perro: " + p.getIdPerro() + "\n");
            resultado += ("Nombre: " + p.getNombre() + "\n");
            resultado += ("Raza y Color: " + p.getRazaYcolor() + "\n");
            resultado += ("Dueño : " + p.getPropietario().getNombre() + "\n");
            resultado += ("Veterinario : " + p.getVeterinario().getNombre());
            jtaResultado.setText(resultado);
        } catch (Exception e) {
            String resultado = " Error al seleccionar.\n Comprueba tus datos";
            jtaResultado.setText(resultado);
        }

    }//GEN-LAST:event_jBSelectPerroActionPerformed

    private void jBInsertPerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertPerroActionPerformed
        try {
            Perro p = insertPe(getIdPerro(), getNombrePerro(), getRYCPerro(), getPesoPerro(), getIdProPe(), getIdVePe());
            String resultado = " " + p.getNombre() + " insertado.\n";
            resultado += "==========================";
            jtaResultado.setText(resultado);
        } catch (Exception e) {
            String resultado = " Error al insertar.";
            jtaResultado.setText(resultado);
        }
    }//GEN-LAST:event_jBInsertPerroActionPerformed

    private void jBUpdatePerroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdatePerroActionPerformed
        try {
            Perro p = updatePe(getIdPerro(), getNombrePerro(), getRYCPerro(), getPesoPerro(), getIdProPe(), getIdVePe());
            String resultado = " " + p.getNombre() + " actualizado.\n";
            resultado += "==========================";
            jtaResultado.setText(resultado);
        } catch (Exception e) {
            String resultado = " Error al actualizar";
            jtaResultado.setText(resultado);
        }
    }//GEN-LAST:event_jBUpdatePerroActionPerformed
    /*  Variables que no se usan */

    private void id_propietarioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_propietarioneActionPerformed

    }//GEN-LAST:event_id_propietarioneActionPerformed

    private void id_propietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_propietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_propietarioActionPerformed

    private void nombreneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreneActionPerformed

    private void dni_propietario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dni_propietario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dni_propietario1ActionPerformed

    private void id_VeterinarioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_VeterinarioneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_VeterinarioneActionPerformed

    private void nombrene2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrene2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrene2ActionPerformed

    private void edad_veterinario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edad_veterinario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edad_veterinario2ActionPerformed

    private void id_veterinario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_veterinario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_veterinario3ActionPerformed

    private void id_propietario3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_propietario3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_propietario3ActionPerformed

    private void nombrene3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrene3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrene3ActionPerformed

    private void id_PerroneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_PerroneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_PerroneActionPerformed

    private void rycneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rycneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rycneActionPerformed

    private void PesoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesoneActionPerformed

    public static void main(String[] args) {
        JPanelVeterinaria jPanelEditor = new JPanelVeterinaria();
        JFrame window = new JFrame("Mi Editor");
        window.setContentPane(jPanelEditor);
        window.setSize(1360, 768);
        window.setLocation(0, 0);
        window.setVisible(true);
        window.setTitle("Veterinario de Mari");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pesone;
    private javax.swing.JTextField dni_propietario;
    private javax.swing.JTextField dni_propietario1;
    private javax.swing.JTextField edad_veterinario;
    private javax.swing.JTextField edad_veterinario2;
    private javax.swing.JTextField id_Perrone;
    private javax.swing.JTextField id_Veterinarione;
    private javax.swing.JTextField id_perro;
    private javax.swing.JTextField id_propietario;
    private javax.swing.JTextField id_propietario3;
    private javax.swing.JTextField id_propietarione;
    private javax.swing.JTextField id_propietariope;
    private javax.swing.JTextField id_veterinario;
    private javax.swing.JTextField id_veterinario3;
    private javax.swing.JTextField id_veterinariope;
    private javax.swing.JButton jBDeletePerro;
    private javax.swing.JButton jBDeletePropietario;
    private javax.swing.JButton jBDeleteVeterinario;
    private javax.swing.JButton jBInsertPerro;
    private javax.swing.JButton jBInsertPropietario;
    private javax.swing.JButton jBInsertVeterinario;
    private javax.swing.JButton jBSelectPerro;
    private javax.swing.JButton jBSelectPropietario;
    private javax.swing.JButton jBSelectVeterinario;
    private javax.swing.JButton jBUpdatePerro;
    private javax.swing.JButton jBUpdatePropietario;
    private javax.swing.JButton jBUpdateVeterinario;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaResultado;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JTextField nombre_perro;
    private javax.swing.JTextField nombre_propietario;
    private javax.swing.JTextField nombre_veterinario;
    private javax.swing.JTextField nombrene;
    private javax.swing.JTextField nombrene2;
    private javax.swing.JTextField nombrene3;
    private javax.swing.JTextField peso_perro;
    private javax.swing.JTextField raza_color;
    private javax.swing.JTextField rycne;
    // End of variables declaration//GEN-END:variables
}
