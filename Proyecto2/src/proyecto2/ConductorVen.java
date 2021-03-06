/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.Color;
import java.awt.FileDialog;
import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author wilson
 */
public class ConductorVen extends javax.swing.JFrame {

    ListaConductor lista;
    MenuConductor menu;
    int opt;
    
    public ConductorVen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(0);
    }
    
    public void clean() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");

    }
    
    public void setDatos(int opt, ListaConductor lista, MenuConductor menu)
    {
        this.opt = opt;
        this.lista = lista;
        this.menu = menu;
        
        switch(opt)
        {
            case 1: 
                jButton1.setText("Agregar");
                jButton1.setVisible(true);
                jLabel1.setVisible(true);
                jLabel2.setVisible(false);
                jTextField1.setVisible(false);
                jButton3.setVisible(false);
                jTextField2.setEditable(true);
                jTextField2.setBackground(Color.WHITE);
                jTextField3.setEditable(true);
                jTextField3.setBackground(Color.WHITE);
                jTextField4.setEditable(true);
                jTextField4.setBackground(Color.WHITE);
                jTextField5.setEditable(true);
                jTextField5.setBackground(Color.WHITE);
                jTextField6.setEditable(true);
                jTextField6.setBackground(Color.WHITE);
                jTextField7.setEditable(true);
                jTextField7.setBackground(Color.WHITE);
                jTextField8.setEditable(true);
                jTextField8.setBackground(Color.WHITE);
                jButton4.setVisible(true);
                clean();
                break;
            case 2:
                jButton3.setVisible(true);
                jLabel1.setText("Modificar Conductor");
                jLabel2.setVisible(true);
                jTextField1.setVisible(true);
                jButton1.setText("Modificar");
                jButton4.setVisible(false);
                clean();
                break;
            case 3:
                jButton3.setVisible(true);
                jLabel1.setText("Eliminar Conductor");
                jLabel2.setVisible(true);
                jTextField1.setVisible(true);
                jButton1.setText("Eliminar");
                jTextField2.setEditable(false);
                jTextField2.setBackground(Color.GRAY);
                jTextField3.setEditable(false);
                jTextField3.setBackground(Color.GRAY);
                jTextField4.setEditable(false);
                jTextField4.setBackground(Color.GRAY);
                jTextField5.setEditable(false);
                jTextField5.setBackground(Color.GRAY);
                jTextField6.setEditable(false);
                jTextField6.setBackground(Color.GRAY);
                jTextField7.setEditable(false);
                jTextField7.setBackground(Color.GRAY);
                jTextField8.setEditable(false);
                jTextField8.setBackground(Color.GRAY);
                jButton4.setVisible(false);
                clean();
                break;
            case 4:
                jButton3.setVisible(true);
                jLabel1.setText("Mostrar Conductor");
                jLabel2.setVisible(true);
                jTextField1.setVisible(true);
                jButton1.setText("Mostrar");
                jButton1.setVisible(false);
                jTextField2.setEditable(false);
                jTextField2.setBackground(Color.GRAY);
                jTextField3.setEditable(false);
                jTextField3.setBackground(Color.GRAY);
                jTextField4.setEditable(false);
                jTextField4.setBackground(Color.GRAY);
                jTextField5.setEditable(false);
                jTextField5.setBackground(Color.GRAY);
                jTextField6.setEditable(false);
                jTextField6.setBackground(Color.GRAY);
                jTextField7.setEditable(false);
                jTextField7.setBackground(Color.GRAY);
                jTextField8.setEditable(false);
                jTextField8.setBackground(Color.GRAY);
                jButton4.setVisible(false);
                clean();
                break;
            case 5:
                break;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Registro de Conductores");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("DPI del conductor a gestionar: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("DPI: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombres: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Apellidos: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tipo Licencia: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Genero: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Telefono: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Direccion: ");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Carga");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(209, 209, 209)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // boton de acciones, agregar, modificar, motrar eliminar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       if(!jTextField2.getText().equals("")&&!jTextField3.getText().equals("")&&!jTextField4.getText().equals("")&&!jTextField5.getText().equals("")&&!jTextField6.getText().equals("")&&!jTextField7.getText().equals("")&&!jTextField8.getText().equals("")){
        
        switch (opt) {

            // Si esta en la opcion agregar
            case 1:
                if (jTextField2.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, jTextField2.getText() + " Ingree un DPI valido!");
                } else {
                    
                    BigInteger verificarDPI = new BigInteger(jTextField2.getText().toUpperCase().trim().replace(" ", ""));
                    // maybe a try cuz of buscar error
                    if (lista.buscar(verificarDPI) != null) {
                        JOptionPane.showMessageDialog(null, jTextField2.getText() + " Ya exite");
                        clean();
                    } else {
                        //Obtener datos de un Objeto Vehiculo y crear nuevo objeto
                        BigInteger dpi = new BigInteger(jTextField2.getText().toUpperCase().trim().replace(" ", ""));
                        String nombres = jTextField3.getText().toUpperCase().trim();
                        String apellidos = jTextField4.getText().toUpperCase().trim();
                        String licencia = jTextField5.getText().toUpperCase().trim().replace(" ", "");
                        String genero = jTextField6.getText().toUpperCase().trim().replace(" ", "");
                        String telefono = jTextField7.getText().toUpperCase().trim().replace(" ", "");
                        String direccion = jTextField8.getText().toUpperCase().trim().replace(" ", "");
                        Conductor insertarC = new Conductor(dpi, nombres, apellidos, licencia, genero, telefono, direccion);
                        lista.insertarFinal(insertarC);
                        JOptionPane.showMessageDialog(null, jTextField2.getText() + " Se agrego con EXITO!");
                        clean();
                    }
                }
                lista.imprimir();
                break;
            // Si esta en la opcion modificar
            case 2:
                if (jTextField1.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, jTextField2.getText() + " Ingree un DPI valido!");
                } else {
                    BigInteger dato = new BigInteger(jTextField1.getText());

                    Conductor auxC = new Conductor();

                    if (lista.buscar(dato) != null) {

                        lista.eliminar(dato);

                        auxC.setDpi(new BigInteger(jTextField2.getText().trim().toUpperCase()));
                        auxC.setNombres(jTextField3.getText().trim().toUpperCase());
                        auxC.setApellidos(jTextField4.getText().trim().toUpperCase());
                        auxC.setTipoLicencia(jTextField5.getText().trim().toUpperCase());
                        auxC.setGenero(jTextField6.getText().trim().toUpperCase());
                        auxC.setTelefono(jTextField7.getText().trim().toUpperCase());
                        auxC.setDireccion(jTextField8.getText().trim().toUpperCase());
                        lista.insertarFinal(auxC);

                        // Aux  placa no modificable
                        JOptionPane.showMessageDialog(null, jTextField1.getText() + " Modificado a " + auxC.getDpi().toString());
                        clean();
                    } else {
                        JOptionPane.showMessageDialog(null, jTextField1.getText() + " no existe1 ");
                    }
                }
                break;
            // Si esta en opcion eliminar
            case 3:
                 if (jTextField1.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, jTextField2.getText() + " Ingree un DPI valido!");
                } else {
                    BigInteger dato = new BigInteger(jTextField1.getText());
                    if (lista.buscar(dato) != null) {

                        lista.eliminar(dato);
                        JOptionPane.showMessageDialog(null, jTextField1.getText() + " Eliminado! " );
                        clean();
                    } else {
                        JOptionPane.showMessageDialog(null, jTextField1.getText() + " no existe1 ");
                    }
                }
                break;
            // si esta en 
            case 4:
                break;
            default:
                break;

        }

        System.out.println("Impresion de lista");
        lista.imprimir();
       }else{
           JOptionPane.showMessageDialog(null, "Rellene todas las casillas primero");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        menu.setVisible(true);
        menu.setLista(lista);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    //Carga masiva de conductores
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            String rutatotal = "";
            String registro = "";

            FileDialog dialogArchivo;
            dialogArchivo = new FileDialog(this, "Lista de Archivos desde Frame", FileDialog.LOAD);
            dialogArchivo.setVisible(true);
            // obtener informacion de archivo
            if (dialogArchivo.getFile() != null) {

                String directorio = dialogArchivo.getDirectory();
                String nombreArchivo = dialogArchivo.getFile();
                rutatotal = directorio + nombreArchivo;
            }

            // escribir en linea
            try {
                Scanner input = new Scanner(new File("/" + rutatotal));
                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    registro += line;
                }
                input.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            String[] arregloRegistro = registro.split(";");
            Conductor insertarC;
            for (int x = 0; x < arregloRegistro.length; x++) {

                String[] nuevo = arregloRegistro[x].split("%");
                System.out.print(nuevo[0] + " " + nuevo[1] + " " + nuevo[2] + " " + nuevo[3] + " " + nuevo[4] + " " + nuevo[5] + " " + nuevo[6] + "\n");
                insertarC = new Conductor(new BigInteger(nuevo[0]), nuevo[1], nuevo[2], nuevo[3], nuevo[4], nuevo[5], nuevo[6]);
                lista.insertarFinal(insertarC);
            }
            JOptionPane.showMessageDialog(null, "Carga masiva completada!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Archivo incorrecto cargado!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Buscar
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        BigInteger dato = new BigInteger(jTextField1.getText().toUpperCase().trim());
        System.out.println(dato);
        
        if(lista.buscar(dato)!= null)
        {
            Conductor conO = lista.buscar(dato);
            jTextField2.setText(conO.getDpi().toString());
            jTextField3.setText(conO.getNombres());
            jTextField4.setText(conO.getApellidos());
            jTextField5.setText(conO.getTipoLicencia());
            jTextField6.setText(conO.getGenero());
            jTextField7.setText(conO.getTelefono());
            jTextField8.setText(conO.getDireccion());           
        }
        else
        {
            JOptionPane.showMessageDialog(null, jTextField1.getText() + " no existe1 ");
            clean();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(ConductorVen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConductorVen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConductorVen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConductorVen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConductorVen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
