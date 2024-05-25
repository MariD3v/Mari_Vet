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
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.ImageIcon;
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
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        jBDeleteVeterinario = new javax.swing.JButton();
        jBSelectVeterinario = new javax.swing.JButton();
        jBInsertVeterinario = new javax.swing.JButton();
        jBUpdateVeterinario = new javax.swing.JButton();
        jBDeletePerro = new javax.swing.JButton();
        jBSelectPerro = new javax.swing.JButton();
        jBInsertPerro = new javax.swing.JButton();
        jBUpdatePerro = new javax.swing.JButton();
        id_veterinario = new javax.swing.JTextField();
        nombre_propietario = new javax.swing.JTextField();
        dni_propietario = new javax.swing.JTextField();
        nombre_veterinario = new javax.swing.JTextField();
        edad_veterinario = new javax.swing.JTextField();
        id_propietario = new javax.swing.JTextField();
        id_perro = new javax.swing.JTextField();
        peso_perro = new javax.swing.JTextField();
        nombre_perro = new javax.swing.JTextField();
        id_propietariope = new javax.swing.JTextField();
        id_veterinariope = new javax.swing.JTextField();
        raza_color = new javax.swing.JTextField();

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

        setBackground(new java.awt.Color(242, 170, 203));

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

        label3.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(204, 255, 204));
        label3.setText("PROPIETARIO");

        label4.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(204, 255, 204));
        label4.setText("RESULTADO");

        label5.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        label5.setForeground(new java.awt.Color(204, 255, 204));
        label5.setText("PERRO");

        label6.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(204, 255, 204));
        label6.setText("VETERINARIO");

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

        id_veterinario.setText("ID Veterinario");

        nombre_propietario.setText("Nombre");

        dni_propietario.setText("DNI");

        nombre_veterinario.setText("Nombre");

        edad_veterinario.setText("Edad");

        id_propietario.setText("ID Propietario");
        id_propietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_propietarioActionPerformed(evt);
            }
        });

        id_perro.setText("ID Perro");

        peso_perro.setText("Peso");

        nombre_perro.setText("Nombre");

        id_propietariope.setText("ID Propietario");

        id_veterinariope.setText("ID Veterinario");

        raza_color.setText("Raza y Color");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBDeletePropietario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jBSelectPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jBInsertPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jBUpdatePropietario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre_propietario)
                    .addComponent(dni_propietario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id_propietario))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(148, 148, 148))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBDeleteVeterinario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jBSelectVeterinario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jBInsertVeterinario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jBUpdateVeterinario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_veterinario)
                            .addComponent(nombre_veterinario)
                            .addComponent(edad_veterinario, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_perro, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(id_perro))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jBDeletePerro, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(jBSelectPerro, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(jBInsertPerro, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(jBUpdatePerro, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(id_propietariope)
                                .addComponent(id_veterinariope)
                                .addComponent(peso_perro, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(raza_color, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(166, 166, 166))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_perro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(nombre_perro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombre_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre_veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(raza_color, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(peso_perro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addComponent(id_propietariope, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dni_propietario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edad_veterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_veterinariope, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBDeletePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBSelectPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBInsertPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBUpdatePropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jBDeletePerro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBSelectPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBInsertPerro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBUpdatePerro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBDeleteVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBSelectVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBInsertVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBUpdateVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(411, 411, 411))
        );

        label2.getAccessibleContext().setAccessibleDescription("");
        label5.getAccessibleContext().setAccessibleName("VETERINARIO");
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
            Propietario p = deletePro(getIdPropietario());
            String resultado = " " + p.getNombre() + " eliminado.\n";
            resultado += "==========================";
            jtaResultado.setText(resultado);
        } catch (Exception e) {
            String resultado = " Error al borrar.";
            jtaResultado.setText(resultado);
        }
    }//GEN-LAST:event_jBDeletePropietarioActionPerformed

    private void jBDeleteVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeleteVeterinarioActionPerformed
        try {
            Veterinario v = deleteVe(getIdVeterinario());
            String resultado = " " + v.getNombre() + " eliminado.\n";
            resultado += "==========================";
            jtaResultado.setText(resultado);
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

    private void id_propietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_propietarioActionPerformed

    }//GEN-LAST:event_id_propietarioActionPerformed

    public static void main(String[] args) {
        JPanelVeterinaria jPanelEditor = new JPanelVeterinaria();
        JFrame window = new JFrame("Mi Editor");
        window.setContentPane(jPanelEditor);
        window.setSize(1250, 900);
        window.setLocation(50, 50);
        window.setVisible(true);
        window.setTitle("Veterinario de Mari");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dni_propietario;
    private javax.swing.JTextField edad_veterinario;
    private javax.swing.JTextField id_perro;
    private javax.swing.JTextField id_propietario;
    private javax.swing.JTextField id_propietariope;
    private javax.swing.JTextField id_veterinario;
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
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTextField nombre_perro;
    private javax.swing.JTextField nombre_propietario;
    private javax.swing.JTextField nombre_veterinario;
    private javax.swing.JTextField peso_perro;
    private javax.swing.JTextField raza_color;
    // End of variables declaration//GEN-END:variables
}
