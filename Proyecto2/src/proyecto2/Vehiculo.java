/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

import java.awt.Color;
import java.awt.FileDialog;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author wilson
 */
 
public class Vehiculo extends javax.swing.JFrame {

    ArbolB tree; // declarando arbol de grado 5
    MenuVehiculo menu;
    int opt;
    String datos="";
    /**
     * Creates new form Vehiculo
     */
    public Vehiculo() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(0);
    }

    public void setDatos(int opt, ArbolB tree, MenuVehiculo menu){
        this.opt = opt;
        this.tree = tree;
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
                jLabel1.setText("Modificar Vehiculo");
                jLabel2.setVisible(true);
                jTextField1.setVisible(true);
                jButton1.setText("Modificar");
                jTextField2.setEditable(false);
                jTextField2.setBackground(Color.GRAY);
                jButton4.setVisible(false);
                clean();
                break;
            case 3:
                jButton3.setVisible(true);
                jLabel1.setText("Eliminar Vehiculo");
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
                jLabel1.setText("Mostrar Vehiculo");
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
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Registro de Vehiculos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Placa del vehiculo a gestionar: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Placa: ");
        jLabel3.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Marca: ");
        jLabel4.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Modelo: ");
        jLabel5.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Año: ");
        jLabel6.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Color: ");
        jLabel7.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Precio: ");
        jLabel8.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Transmision: ");
        jLabel9.setPreferredSize(new java.awt.Dimension(60, 20));

        jTextField1.setName("txtKey"); // NOI18N

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

        jButton4.setText("carga");
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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Agregar/modificar y eliminar
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // Insertar un dato.
       if(!jTextField2.getText().equals("")&&!jTextField3.getText().equals("")&&!jTextField4.getText().equals("")&&!jTextField5.getText().equals("")&&!jTextField6.getText().equals("")&&!jTextField7.getText().equals("")&&!jTextField8.getText().equals("")){
        switch (opt) {

            // Si esta en la opcion agregar
            case 1:
                if (jTextField2.getText().compareTo("") == 0) {
                    JOptionPane.showMessageDialog(null, jTextField2.getText() + " Ingree una placa valida!");
                } else {
                    String verificarPlaca = jTextField2.getText().toUpperCase().trim().replace(" ", "");
                    if (tree.buscar(verificarPlaca) != null) {
                        JOptionPane.showMessageDialog(null, jTextField2.getText() + " Ya exite");
                        clean();
                    } else {
                        //Obtener datos de un Objeto Vehiculo y crear nuevo objeto
                        datos+=jTextField2.getText()+"\n";
                        String placa = jTextField2.getText().toUpperCase().trim().replace(" ", "");
                        String marca = jTextField3.getText().toUpperCase().trim().replace(" ", "");
                        String modelo = jTextField4.getText().toUpperCase().trim().replace(" ", "");
                        String year = jTextField5.getText().toUpperCase().trim().replace(" ", "");
                        String color = jTextField6.getText().toUpperCase().trim().replace(" ", "");
                        String precio = jTextField7.getText().toUpperCase().trim().replace(" ", "");
                        String trans = jTextField8.getText().toUpperCase().trim().replace(" ", "");
                        ObjVehiculo insertarV = new ObjVehiculo(placa, marca, modelo, year, color, precio, trans);
                        tree.insertar(placa, insertarV);
                        JOptionPane.showMessageDialog(null, jTextField2.getText() + " Se agrego con EXITO!");
                        clean();
                    }
                } 
                break;
                // Si esta en la opcion modificar
            case 2:
                String dato = jTextField1.getText();
                ObjVehiculo aux = new ObjVehiculo();
                
                if(tree.buscar(dato)!= null)
                {
                    // Aux  placa no modificable
                    aux.setMarca(jTextField3.getText().toUpperCase().trim().replace(" ", ""));
                    aux.setModelo(jTextField4.getText().toUpperCase().trim().replace(" ", ""));
                    aux.setYear(jTextField5.getText().toUpperCase().trim().replace(" ", ""));
                    aux.setColor(jTextField6.getText().toUpperCase().trim().replace(" ", ""));
                    aux.setPrecio(jTextField7.getText().toUpperCase().trim().replace(" ", ""));
                    aux.setTrans(jTextField8.getText().toUpperCase().trim().replace(" ", ""));
                    tree.update(tree.buscar(dato), aux);
                    JOptionPane.showMessageDialog(null, jTextField1.getText() + " Modificado ");
                }else
                    JOptionPane.showMessageDialog(null, jTextField1.getText() + " no existe1 ");
                break;
                // Si esta en opcion eliminar
            case 3:
                break;
                // si esta en 
            case 4:
                break;
            default:
                break;
                
        }
        
        System.out.println("Impresion del arbol construido");
        tree.imprimir();
        
       }else{
           JOptionPane.showMessageDialog(null, "Rellene todas las casillas primero");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Regresar a menu
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        menu.setVisible(true);
        menu.setArbol(tree);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    // Buscar
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String dato = jTextField1.getText().toUpperCase().trim().replace(" ", "");
        System.out.println(dato);
        
        if(tree.buscar(dato)!= null)
        {
            jTextField2.setText(tree.buscar(dato).objV[tree.currentKey()].getPlaca());
            jTextField3.setText(tree.buscar(dato).objV[tree.currentKey()].getMarca());
            jTextField4.setText(tree.buscar(dato).objV[tree.currentKey()].getModelo());
            jTextField5.setText(tree.buscar(dato).objV[tree.currentKey()].getYear());
            jTextField6.setText(tree.buscar(dato).objV[tree.currentKey()].getColor());
            jTextField7.setText(tree.buscar(dato).objV[tree.currentKey()].getPrecio());
            jTextField8.setText(tree.buscar(dato).objV[tree.currentKey()].getTrans());           
        }
        else
        {
            JOptionPane.showMessageDialog(null, jTextField1.getText() + " no existe1 ");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    
    // Carga Masiva
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        try{
            String rutatotal = "";
        String registro = "";
        
        FileDialog dialogArchivo;
        dialogArchivo = new FileDialog(this, "Carga masiva de Vehiculos", FileDialog.LOAD);
        dialogArchivo.setVisible(true);
        // obtener informacion de archivo
        if (dialogArchivo.getFile() != null) {

            String directorio = dialogArchivo.getDirectory();
            String nombreArchivo = dialogArchivo.getFile();
            rutatotal = directorio + nombreArchivo;
        }
        
        // escribir en linea
        try {
            Scanner input = new Scanner(new File("/"+rutatotal));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                registro+=line;
            }
            input.close();
        } catch (Exception ex) { ex.printStackTrace();}
        
        String[] arregloRegistro=registro.split(";");
        ObjVehiculo insertarV;
        for(int x=0;x<arregloRegistro.length;x++){
            
            String[] nuevo=arregloRegistro[x].split(":");
            
            // Impresion de datos que estoy inertando
            datos+=nuevo[0]+"\n";
            System.out.print(nuevo[0]+  " " + nuevo[1] + " " + nuevo[2] + " " + nuevo[3] + " " + nuevo[4] + " " + nuevo[5] + " " + nuevo[6]+ "\n");
            insertarV= new ObjVehiculo(nuevo[0], nuevo[1], nuevo[2], nuevo[3], nuevo[4], nuevo[5], nuevo[6]);
            tree.insertar(nuevo[0], insertarV);
        }
        JOptionPane.showMessageDialog(null, "Carga masiva completada!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se abrio el archivo correcto!");
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vehiculo().setVisible(true);
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
