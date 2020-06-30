/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author wilson
 */
public class ReportesTexto extends javax.swing.JFrame {

    //estructuras
    TablaHash estructuraClientes;
    ListaConductor estructuraConductores;
    ArbolB estructuraVehiculos;
    ColaAdyacentes estructuraRuta;
    Chain estructuraRegistroViajes;
    
    //ventanas
    MenuGeneral menu;
    
    ResultadoH resultado;
    CompresionH comp;
    /**
     * Creates new form ReportesTexto
     */
    public ReportesTexto() {
        initComponents();
        this.setDefaultCloseOperation(0);
        this.setLocationRelativeTo(null);
        cbReportes.removeAllItems();
        cbReportes.addItem("Seleccionar...");
        cbReportes.addItem("Estructura Completa");
        cbReportes.addItem("Top 10 viajes largos");
        cbReportes.addItem("Top 10 clientes con viajes");
        cbReportes.addItem("Top 10 conductores con viajes");
        cbReportes.addItem("Top 10 vehiculos con viajes");
        cbViajes.removeAllItems();
        cbViajes.addItem("Seleccionar...");
        
        jTextArea2.setLineWrap(true);
        jTextArea2.setWrapStyleWord(true);
    }
    
    public void encrypt() {
        String data = jTextArea1.getText().trim();
        comp = new CompresionH();
        resultado = comp.comprimir(data);
        jTextArea2.append(resultado.encryptedData + "\n");
    }
    
    public void setEstructuras(TablaHash estructuraClientes,ListaConductor estructuraConductores, ArbolB estructuraVehiculos, ColaAdyacentes estructuraRuta,Chain estructuraRegistroViajes){
        this.estructuraClientes=estructuraClientes;
        this.estructuraConductores=estructuraConductores;
        this.estructuraVehiculos=estructuraVehiculos;
        this.estructuraRuta=estructuraRuta;
        this.estructuraRegistroViajes=estructuraRegistroViajes;
    }
    
    public void setVentanas(MenuGeneral menu){
        this.menu=menu;
    }
    
    public void setViajes(){
            Block aux=estructuraRegistroViajes.start;
            while(aux!=null){
                cbViajes.addItem(aux.index+"-"+aux.placa+"; "+aux.horaFechaGenerado);
                aux=aux.next;
            }   
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cbReportes = new javax.swing.JComboBox<String>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cbViajes = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Reportes");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cbReportes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbReportes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbReportesActionPerformed(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton3.setText("Comprimir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Decomprimir");

        jButton5.setText("Limpear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        cbViajes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbViajes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbViajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbViajesActionPerformed(evt);
            }
        });

        jLabel2.setText("Viajes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbViajes, 0, 194, Short.MAX_VALUE)
                            .addComponent(cbReportes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(41, 41, 41)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbViajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton1))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbReportesActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_cbReportesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        if(cbReportes.getSelectedIndex()!=0){
//             encrypt();
//        }else{
//            JOptionPane.showMessageDialog(null, "Opcion no valida!");
//        }
//        cbReportes.addItem("Seleccionar...");
//        cbReportes.addItem("Estructura Completa");
//        cbReportes.addItem("Top 10 viajes largos");
//        cbReportes.addItem("Top 10 clientes con viajes");
//        cbReportes.addItem("Top 10 conductores con viajes");
//        cbReportes.addItem("Top 10 vehiculos con viajes");
        
        if(!String.valueOf(cbReportes.getSelectedItem()).equals("Seleccionar...")){
            if(String.valueOf(cbReportes.getSelectedItem()).equals("Estructura Completa")&&String.valueOf(cbViajes.getSelectedItem()).equals("Seleccionar...")){
                estructuraRegistroViajes.GraficaGeneral();
            }
            else if(String.valueOf(cbReportes.getSelectedItem()).equals("Estructura Completa")&&!String.valueOf(cbViajes.getSelectedItem()).equals("Seleccionar...")){
                System.out.println(cbViajes.getSelectedItem());
                String index[]=String.valueOf(cbViajes.getSelectedItem()).split("-");
                System.out.println("hola");
                System.out.println(index[0]);
                estructuraRegistroViajes.GraficaGeneralPorViaje(index[0]);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione primero que tipo de reporte desea ver!");
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (cbReportes.getSelectedIndex() != 0) {
            encrypt();

            jTextArea2.append(comp.decompress(resultado) + "\n");
            System.out.println(cbReportes.getSelectedItem().toString());
            String archivoGenName = cbReportes.getSelectedItem().toString().trim().replace(" ", "").toLowerCase() + ".edd";
            try {
                File archivo = new File(archivoGenName);

                // Verifcar si escribe y rescribir
                if (archivo.exists()) {
                    archivo.delete();
                    try {
                        archivo.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                FileWriter escribir = new FileWriter(archivo, true);
                escribir.write(resultado.encryptedData);
                //Cerramos la conexion
                escribir.close();
            } //Si existe un problema al escribir cae aqui
            catch (Exception e) {
                System.out.println("Error al escribir");
            }
            JOptionPane.showMessageDialog(null, archivoGenName + " generado correctamente! ");
        }else{
            JOptionPane.showMessageDialog(null, "Opcion no valida!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       menu.setEstructuras(estructuraClientes, estructuraConductores, estructuraVehiculos, estructuraRuta, estructuraRegistroViajes);
       menu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        jTextArea2.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cbViajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbViajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbViajesActionPerformed

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
            java.util.logging.Logger.getLogger(ReportesTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportesTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportesTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportesTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesTexto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbReportes;
    private javax.swing.JComboBox cbViajes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
