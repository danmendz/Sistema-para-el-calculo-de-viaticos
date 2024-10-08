/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interfaz;
import modelo.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ONYX
 */
public class FrmAgregarViaje extends javax.swing.JInternalFrame {
    
    ListaViajes l1 = new ListaViajes(6);
    /**
     * Creates new form Viaje
     */
    public FrmAgregarViaje() {
        initComponents();
    }
  
    public FrmAgregarViaje(ListaViajes l1) {
    initComponents();
    this.l1 = l1;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        txtNomCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumSupervisores = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumOperarios = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrecioH = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtOcupacionH = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDistancia = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txpDetalles = new javax.swing.JTextArea();

        jScrollPane3.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(0, 255, 255));
        setClosable(true);
        setResizable(true);
        setTitle("Agregar viaje");

        jLabel1.setText("Nombre del cliente :");

        txtNomCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomClienteActionPerformed(evt);
            }
        });
        txtNomCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomClienteKeyTyped(evt);
            }
        });

        jLabel3.setText("Numero de supervisores :");

        txtNumSupervisores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumSupervisoresActionPerformed(evt);
            }
        });
        txtNumSupervisores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumSupervisoresKeyTyped(evt);
            }
        });

        jLabel4.setText("Numero de operarios :");

        txtNumOperarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumOperariosActionPerformed(evt);
            }
        });
        txtNumOperarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumOperariosKeyTyped(evt);
            }
        });

        jLabel5.setText("Duracion del servicio en horas :");

        txtDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDuracionActionPerformed(evt);
            }
        });
        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionKeyTyped(evt);
            }
        });

        jLabel2.setText("Precio habitacion :");

        txtPrecioH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioHKeyTyped(evt);
            }
        });

        jLabel6.setText("Ocupacion habitacion :");

        txtOcupacionH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOcupacionHActionPerformed(evt);
            }
        });
        txtOcupacionH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOcupacionHKeyTyped(evt);
            }
        });

        jLabel7.setText("Distancia en KM :");

        txtDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDistanciaActionPerformed(evt);
            }
        });
        txtDistancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDistanciaKeyTyped(evt);
            }
        });

        btnFinalizar.setText("Agregar viaje");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        txpDetalles.setEditable(false);
        txpDetalles.setColumns(20);
        txpDetalles.setRows(5);
        jScrollPane1.setViewportView(txpDetalles);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(17, 17, 17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDuracion)
                                .addComponent(txtNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNumSupervisores)))
                        .addComponent(txtNumOperarios, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFinalizar)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtOcupacionH, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrecioH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumSupervisores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumOperarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtOcupacionH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomClienteActionPerformed
        // TODO add your handling code here:
        String nombre;
        nombre = txtNomCliente.getText();
    }//GEN-LAST:event_txtNomClienteActionPerformed

    
    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        if (txtNomCliente.getText().equals("") || (txtNumSupervisores.getText().equals("")) || (txtNumOperarios.getText().equals("")) || (txtDuracion.getText().equals(""))
           || (txtPrecioH.getText().equals("")) || (txtOcupacionH.getText().equals("")) || (txtDistancia.getText().equals(""))) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txtNomCliente.requestFocus();
        }
        else{
      
        String a = txtNomCliente.getText();
        int b = Integer.parseInt(txtNumSupervisores.getText());
        int c = Integer.parseInt(txtNumOperarios.getText());
        double d = Double.parseDouble(txtDistancia.getText());
        int dur = Integer.parseInt(txtDuracion.getText());
        double f = Double.parseDouble(txtPrecioH.getText());
        int g = Integer.parseInt(txtOcupacionH.getText());
        
        int disponible, posicion;
        disponible = l1.disponibles();
        if (disponible > 0) {
            posicion = l1.primerVacio();
            
            Viaje v1 = new Viaje(a, d, b, c, dur, f, g);
            if(l1.agregar(v1, posicion)==true){
                
                JOptionPane.showMessageDialog(rootPane, "El viaje se agrego correctamente \n" +
                            "\nID: " + v1.idViaje +
                            "\nNombre del cliente: " + a +
                            "\nSupervisores: " + b +
                            "\nOperarios: " + c +
                            "\nDuracion: " + dur + " horas" +
                            "\nDistancia: " + d + " KM");
                txpDetalles.setText("");
                txpDetalles.setText(v1.mostrar());       
                   
                    }else{
                    JOptionPane.showMessageDialog(this, "Error al agregar viaje");
                    }
                }
            
            txtNomCliente.setText("");
            txtNumSupervisores.setText("");
            txtNumOperarios.setText("");
            txtDuracion.setText("");
            txtPrecioH.setText("");
            txtOcupacionH.setText("");
            txtDistancia.setText("");
            
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    
    private void txtDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDuracionActionPerformed
        // TODO add your handling code here:
        int duracion;
        duracion = Integer.parseInt(txtDuracion.getText());
    }//GEN-LAST:event_txtDuracionActionPerformed

    private void txtNumSupervisoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumSupervisoresActionPerformed
        // TODO add your handling code here:
        int supervisores;
        supervisores = Integer.parseInt(txtNumSupervisores.getText());

    }//GEN-LAST:event_txtNumSupervisoresActionPerformed

    private void txtNumOperariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumOperariosActionPerformed
        // TODO add your handling code here:
        int operarios;
        operarios = Integer.parseInt(txtNumOperarios.getText());
    }//GEN-LAST:event_txtNumOperariosActionPerformed

    private void txtDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDistanciaActionPerformed
        // TODO add your handling code here:
        int distancia;
        distancia = Integer.parseInt(txtDistancia.getText());
    }//GEN-LAST:event_txtDistanciaActionPerformed

    private void txtNomClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomClienteKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' '))evt.consume();
    }//GEN-LAST:event_txtNomClienteKeyTyped

    private void txtNumSupervisoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumSupervisoresKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtNumSupervisoresKeyTyped

    private void txtNumOperariosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumOperariosKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtNumOperariosKeyTyped

    private void txtDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtDuracionKeyTyped

    private void txtDistanciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistanciaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtDistanciaKeyTyped

    private void txtOcupacionHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOcupacionHActionPerformed
        // TODO add your handling code here:
        int ocupacion;
        ocupacion = Integer.parseInt(txtOcupacionH.getText());
    }//GEN-LAST:event_txtOcupacionHActionPerformed

    private void txtPrecioHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioHKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtPrecioHKeyTyped

    private void txtOcupacionHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOcupacionHKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_txtOcupacionHKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txpDetalles;
    private javax.swing.JTextField txtDistancia;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtNomCliente;
    private javax.swing.JTextField txtNumOperarios;
    private javax.swing.JTextField txtNumSupervisores;
    private javax.swing.JTextField txtOcupacionH;
    private javax.swing.JTextField txtPrecioH;
    // End of variables declaration//GEN-END:variables
}
