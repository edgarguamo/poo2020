/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 *
 *
 * Realizado por: Edgar Guamo M
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edgar Guamo
 */
public class IngresoMercaderia extends javax.swing.JFrame {

    //Declaración de arrayLists
    static List<Comestible> proComestibles = new ArrayList<Comestible>();
    static List<Utensilio> proUtensilio = new ArrayList<Utensilio>();
    static List<Oficina> proOficina = new ArrayList<Oficina>();
    static List<Industrial> proIndustrial = new ArrayList<Industrial>();
    private String cantidadTipo;
    private int posicion;
    
    
    /**
     * Creates new form IngresoMercaderia
     */
    public IngresoMercaderia() {
        initComponents();
        //sentencias para deshabilitar la vista de algunos objetos 
        //en la interfaz 
        txtOpcion.setVisible  (false);
        mensajeOpcion.setVisible(false);
        mensajeOpcion2.setVisible(false);
        txtOpcion2.setVisible(false);
        txtLista.setVisible(false);
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoMercaderia = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombrePro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidadPro = new javax.swing.JTextField();
        cbnCantidad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbnTipo = new javax.swing.JComboBox<>();
        btnRegistrarM = new javax.swing.JButton();
        merRegresar = new javax.swing.JButton();
        txtOpcion = new javax.swing.JTextField();
        mensajeOpcion = new javax.swing.JLabel();
        txtOpcion2 = new javax.swing.JTextField();
        mensajeOpcion2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMercaderia = new javax.swing.JList<>();
        txtLista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(770, 780));

        fondoMercaderia.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(392, 432));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel1.setText("Ingreso de Mercadería");

        jLabel2.setText("Nombre del Producto");

        jLabel3.setText("Cantidad");

        cbnCantidad.setEditable(true);
        cbnCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cantidad", "gramos", "libras", "onzas", "unidades", "kilos", "piezas" }));
        cbnCantidad.setAutoscrolls(true);
        cbnCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnCantidadActionPerformed(evt);
            }
        });

        jLabel4.setText("Precio por c/a");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel5.setText("$");

        cbnTipo.setEditable(true);
        cbnTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "Comestibles", "Utensilios", "Oficina", "Industriales" }));
        cbnTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnTipoActionPerformed(evt);
            }
        });

        btnRegistrarM.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarM.setText("Registrar");
        btnRegistrarM.setEnabled(false);
        btnRegistrarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMActionPerformed(evt);
            }
        });

        merRegresar.setBackground(new java.awt.Color(255, 255, 255));
        merRegresar.setText("Atras");
        merRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merRegresarActionPerformed(evt);
            }
        });

        txtOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOpcionActionPerformed(evt);
            }
        });

        mensajeOpcion.setText("mensajeOpcion");

        mensajeOpcion2.setText("mensajeOpcion2");

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jLabel6.setText("Marca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mensajeOpcion)
                            .addComponent(mensajeOpcion2)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(btnRegistrarM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(merRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbnTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCantidadPro, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(0, 0, 0)
                                    .addComponent(cbnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNombrePro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(txtNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadPro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(cbnTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mensajeOpcion)
                        .addGap(18, 18, 18)
                        .addComponent(txtOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mensajeOpcion2)
                        .addGap(42, 96, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarM, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(merRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        listaMercaderia.setBackground(new java.awt.Color(51, 51, 51));
        listaMercaderia.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(listaMercaderia);

        txtLista.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        txtLista.setForeground(new java.awt.Color(255, 255, 255));
        txtLista.setText("Productos en Bodega");

        javax.swing.GroupLayout fondoMercaderiaLayout = new javax.swing.GroupLayout(fondoMercaderia);
        fondoMercaderia.setLayout(fondoMercaderiaLayout);
        fondoMercaderiaLayout.setHorizontalGroup(
            fondoMercaderiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoMercaderiaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, 427, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondoMercaderiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoMercaderiaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLista))
                    .addGroup(fondoMercaderiaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        fondoMercaderiaLayout.setVerticalGroup(
            fondoMercaderiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
            .addGroup(fondoMercaderiaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(txtLista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoMercaderia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoMercaderia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOpcionActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtOpcionActionPerformed

    private void merRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merRegresarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_merRegresarActionPerformed

    private void btnRegistrarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMActionPerformed
        // TODO add your handling code here:
        //Captura de información de los textField 
        String nombre = txtNombrePro.getText();
        double cantidad = Double.parseDouble(txtCantidadPro.getText());
        String marca = txtMarca.getText();
        double precio = Double.parseDouble(txtPrecio.getText());
        String opcion1 = txtOpcion.getText();
        String opcion2 = txtOpcion2.getText();

        switch(posicion){
            //Envio de información a los objetos 
            case 1://Comestible
            
            //Creación del objeto
            Comestible comestible = new Comestible(opcion1, opcion2,
                nombre, cantidad, cantidadTipo, precio, marca);
            
            //envio de información al arrayList
            proComestibles.add(comestible);
            break;

            case 2://Utensilio
            //Creación del objeto
            Utensilio utensilio = new Utensilio(opcion1, nombre, cantidad
                , cantidadTipo, precio, marca);

            //envio de información al arrayList
            proUtensilio.add(utensilio);
            break;

            case 3://Oficina
            //Creación del objeto
            Oficina oficina = new Oficina(opcion1, nombre, cantidad
                , cantidadTipo, precio, marca);

            //envio de información al arrayList
            proOficina.add(oficina);
            break;

            case 4://Industrial
            //Creación del objeto
            Industrial industrial = new Industrial(opcion1, opcion2,
                nombre, cantidad, cantidadTipo, precio, marca);

            //envio de información al arrayList
            proIndustrial.add(industrial);
            break;

        }
        //Hacer visible la lista 
        txtLista.setVisible(true);
        verLista();
        limpiar();
        

    }//GEN-LAST:event_btnRegistrarMActionPerformed

    private void cbnTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnTipoActionPerformed
        // TODO add your handling code here:
        posicion = cbnTipo.getSelectedIndex();

        btnRegistrarM.setEnabled(true);
        
        //Mostrar las opciones extra para rellenar los campos únicos
        //de cada objeto

        switch(posicion){
            case 1://Comestible

            mensajeOpcion.setText("Tipo del producto");
            mensajeOpcion2.setText("Tiempo de vida Aproximada");
            txtOpcion.setVisible  (true);
            mensajeOpcion.setVisible(true);
            mensajeOpcion2.setVisible(true);
            txtOpcion2.setVisible(true);
            break;

            case 2://Utensilio
            mensajeOpcion.setText("Tipo del producto");
            txtOpcion.setVisible  (true);
            mensajeOpcion.setVisible(true);
            mensajeOpcion2.setVisible(false);
            txtOpcion2.setVisible(false);
            break;

            case 3://Oficina
            mensajeOpcion.setText("dimensiones");
            txtOpcion.setVisible  (true);
            mensajeOpcion.setVisible(true);
            mensajeOpcion2.setVisible(false);
            txtOpcion2.setVisible(false);
            break;

            case 4://Industrial
            mensajeOpcion.setText("nivel de toxicidad");
            mensajeOpcion2.setText("Envase del producto");
            txtOpcion.setVisible  (true);
            mensajeOpcion.setVisible(true);
            mensajeOpcion2.setVisible(true);
            txtOpcion2.setVisible(true);
            break;

        }

    }//GEN-LAST:event_cbnTipoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void cbnCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnCantidadActionPerformed
        // TODO add your handling code here:
        cantidadTipo = cbnCantidad.getSelectedItem().toString();

    }//GEN-LAST:event_cbnCantidadActionPerformed

    
    public void verLista(){
        //obtención del tamaño de la lista
        int tamanioLista = proComestibles.size()+proUtensilio.size()+
                proOficina.size()+proIndustrial.size();
        //Creación de una lista para almaccenar  los datos
        String [] listaProductos = new String[tamanioLista];
        
        
        //Relleno de la lista 
        int c = 0;
        for (Comestible comestible: proComestibles){
            listaProductos [c] = comestible.getNombre() + "       " + 
                    comestible.getCantidad() + "       " + 
                    comestible.getCantidadTipo();
            c++;
        }
        for (Utensilio utensilio : proUtensilio){
            listaProductos [c] = utensilio.getNombre() + "       " + 
                    utensilio.getCantidad() + "       " + 
                    utensilio.getCantidadTipo();
            c++;
        }
        for (Oficina oficina : proOficina){
            listaProductos [c] = oficina.getNombre() + "       " + 
                    oficina.getCantidad() + "       " + 
                    oficina.getCantidadTipo();
            c++;
        }
        for (Industrial industrial : proIndustrial){
            listaProductos [c] = industrial.getNombre() + "       " + 
                industrial.getCantidad() + "       " + 
                industrial.getCantidadTipo();
            c++;
        }
        
        //Envio de la lista al jList para que la información pueda ser visible
        listaMercaderia.setListData(listaProductos);       
    }
    
    //Método para limpiar los texfield de la intefaz 
    public void limpiar(){
        txtNombrePro.setText("");
        txtCantidadPro.setText("");
        txtMarca.setText("");
        txtPrecio.setText("");
        txtOpcion.setText("");
        txtOpcion2.setText("");
    }
    
        
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
            java.util.logging.Logger.getLogger(IngresoMercaderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoMercaderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoMercaderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoMercaderia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoMercaderia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarM;
    private javax.swing.JComboBox<String> cbnCantidad;
    private javax.swing.JComboBox<String> cbnTipo;
    private javax.swing.JPanel fondoMercaderia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaMercaderia;
    private javax.swing.JLabel mensajeOpcion;
    private javax.swing.JLabel mensajeOpcion2;
    private javax.swing.JButton merRegresar;
    private javax.swing.JTextField txtCantidadPro;
    private javax.swing.JLabel txtLista;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtOpcion;
    private javax.swing.JTextField txtOpcion2;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
