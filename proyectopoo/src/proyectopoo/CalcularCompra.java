/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;


import java.util.ArrayList;
import java.util.List;

import proyectopoo.IngresoMercaderia;
/**
 *
 * @author Edgar Guamo
 */
public class CalcularCompra extends javax.swing.JFrame {

    //Declaración de variables globales 
    int c2 = 0;
    //Obtención del tamaño de la lista 
    int tamanioLista = IngresoMercaderia.proComestibles.size()+
                IngresoMercaderia.proUtensilio.size()+
                IngresoMercaderia.proOficina.size()+
                IngresoMercaderia.proIndustrial.size();
    String matriz[][] = new String [tamanioLista][5];
    int cantidadReal;
    double cantidadMaxima;
    double subTotal=0;
    double totalIva;
    double total;
    /**
     * Creates new form CalcularCompra
     */
    public CalcularCompra() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoCompras = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        comprasFinalizar = new javax.swing.JButton();
        comprasRegresar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        modificarCan = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        lblSubtotal = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblSubto = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        iva = new javax.swing.JLabel();
        pTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoCompras.setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel1.setText("Registro de Compras");

        jLabel2.setText("Nombre del producto ");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        comprasFinalizar.setText("Buscar");
        comprasFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasFinalizarActionPerformed(evt);
            }
        });

        comprasRegresar.setText("Regresar");
        comprasRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasRegresarActionPerformed(evt);
            }
        });

        lblCantidad.setText("Ingrese la cantidad ");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        modificarCan.setText("Modificar Cantidad ");
        modificarCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarCanActionPerformed(evt);
            }
        });

        lblError.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(lblCantidad))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(comprasFinalizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comprasRegresar)
                            .addComponent(btnEliminar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificarCan)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(96, 96, 96)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(comprasFinalizar)
                .addGap(22, 22, 22)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(lblError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modificarCan)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(18, 18, 18)
                .addComponent(comprasRegresar)
                .addContainerGap())
        );

        tablaProductos.setForeground(new java.awt.Color(51, 51, 51));
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Unidades", "Marca", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(8);
            tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(10);
            tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        lblSubtotal.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtotal.setText("Subtotal:");

        lblIva.setForeground(new java.awt.Color(255, 255, 255));
        lblIva.setText("Iva:");

        lblSubto.setForeground(new java.awt.Color(255, 255, 255));
        lblSubto.setText("Precio total:");

        subtotal.setForeground(new java.awt.Color(255, 255, 255));
        subtotal.setText(" ");

        iva.setForeground(new java.awt.Color(255, 255, 255));

        pTotal.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fondoComprasLayout = new javax.swing.GroupLayout(fondoCompras);
        fondoCompras.setLayout(fondoComprasLayout);
        fondoComprasLayout.setHorizontalGroup(
            fondoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoComprasLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(fondoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoComprasLayout.createSequentialGroup()
                        .addGroup(fondoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSubtotal)
                            .addComponent(lblIva)
                            .addComponent(lblSubto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fondoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(iva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        fondoComprasLayout.setVerticalGroup(
            fondoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(fondoComprasLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIva)
                    .addComponent(iva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubto)
                    .addComponent(pTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondoCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comprasRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasRegresarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_comprasRegresarActionPerformed

    private void comprasFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasFinalizarActionPerformed
        // TODO add your handling code here:
        //Llamada a los métodos 
        rellenarTabla();
        mostrarLista();  
        
    }//GEN-LAST:event_comprasFinalizarActionPerformed

    public void rellenarTabla(){
        //Captura de la información de los textfield en variables 
        String search = txtNombre.getText();
        String searchCantidad = txtCantidad.getText();
        //Condicional para que por defecto se muestre el valor unitario del 
        //árticulo
        boolean condicion = true;
        if (searchCantidad.isEmpty()){
            searchCantidad = "1";
            condicion = false;
        }
        //Para rellenar la lista 
        for(Comestible comestible:IngresoMercaderia.proComestibles){
            //Condicional para encontrar los datos sin usar el nombre completo
            if(comestible.getNombre().contains(search)){
                matriz[c2][0] = comestible.getNombre();
                matriz[c2][1] = searchCantidad;
                matriz[c2][2] = comestible.getCantidadTipo();
                matriz[c2][3] = comestible.getMarca();
                cantidadReal = Integer.parseInt(matriz[c2][1]);
                comestible.calcularProducto(cantidadReal);
                matriz[c2][4] = Double.toString(comestible.getValorProducto());
                cantidadMaxima = comestible.getCantidad();                
            }             
        }
        for(Utensilio utensilio : IngresoMercaderia.proUtensilio){
            //Condicional para encontrar los datos sin usar el nombre completo
            if (utensilio.getNombre().contains(search)){
                matriz[c2][0] = utensilio.getNombre();
                matriz[c2][1] = searchCantidad;
                matriz[c2][2] = utensilio.getCantidadTipo();
                matriz[c2][3] = utensilio.getMarca();
                cantidadReal = Integer.parseInt(matriz[c2][1]);
                utensilio.calcularProducto(cantidadReal);
                matriz[c2][4] = Double.toString(utensilio.getValorProducto());
                cantidadMaxima = utensilio.getCantidad();
            }
        }
        for(Oficina oficina: IngresoMercaderia.proOficina){
            //Condicional para encontrar los datos sin usar el nombre completo
            if (oficina.getNombre().contains(search)){
                matriz[c2][0] = oficina.getNombre();
                matriz[c2][1] = searchCantidad;
                matriz[c2][2] = oficina.getCantidadTipo();
                matriz[c2][3] = oficina.getMarca();
                cantidadReal = Integer.parseInt(matriz[c2][1]);
                oficina.calcularProducto(cantidadReal);
                matriz[c2][4] = Double.toString(oficina.getValorProducto());
                cantidadMaxima = oficina.getCantidad();
            }
        }
        for(Industrial industrial: IngresoMercaderia.proIndustrial){
            //Condicional para encontrar los datos sin usar el nombre completo
            if (industrial.getNombre().contains(search)){
                matriz[c2][0] = industrial.getNombre();
                matriz[c2][1] = searchCantidad;
                matriz[c2][2] = industrial.getCantidadTipo();
                matriz[c2][3] = industrial.getMarca();
                cantidadReal = Integer.parseInt(matriz[c2][1]);
                industrial.calcularProducto(cantidadReal);
                matriz[c2][4] = Double.toString(industrial.getValorProducto());
                cantidadMaxima = industrial.getCantidad();
            }
        } 
        if (condicion){
            // Cuando el usuario ingrese la cantidad calcular los costos 
            subTotal = subTotal + Double.parseDouble(matriz[c2][4]);
            totalIva = 0.12*subTotal;
            total = subTotal+totalIva;
            //Limpieza del jLabel para eliminar el aviso por exceso de cantidad
            lblError.setText("");
            //Enviar la información a los jLabel para poder ser vistos 
            subtotal.setText(String.valueOf(subTotal));
            iva.setText(String.valueOf(totalIva));
            pTotal.setText(String.valueOf(total));   
        }
        //Incremento del contador
        c2++;
        //Llamada al método
        mostrarLista();
        //Limpieza del text field 
        txtCantidad.setText("");
    }
    
    //Método para mostrar la información en el jtable 
    public void mostrarLista(){
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Producto", "Cantidad", "Unidades", "Marca", "Costo"
            }
        ));
    }
    
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
       c2= c2-1;
       //Eliminación del último registro 
       matriz[c2][0]="";
       matriz[c2][1]="";
       matriz[c2][2]="";
       matriz[c2][3]="";
       matriz[c2][4]="";
       
       mostrarLista();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void modificarCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarCanActionPerformed
        // TODO add your handling code here:
        
        double cantidadElegida = Double.parseDouble(txtCantidad.getText());
        //Condicional para identificar si la cantidad excede a la registrada        
        if (cantidadElegida > cantidadMaxima){
            //Mensaje para avisar del exceso de cantidad 
            lblError.setText("cantidad máxima " + cantidadMaxima);
            
        }else if (cantidadElegida <= cantidadMaxima){ 
            c2=c2-1;
            rellenarTabla();
            mostrarLista();
            txtNombre.setText("");
        }
    }//GEN-LAST:event_modificarCanActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(CalcularCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcularCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcularCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcularCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcularCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton comprasFinalizar;
    private javax.swing.JButton comprasRegresar;
    private javax.swing.JPanel fondoCompras;
    private javax.swing.JLabel iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblSubto;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JButton modificarCan;
    private javax.swing.JLabel pTotal;
    private javax.swing.JLabel subtotal;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
