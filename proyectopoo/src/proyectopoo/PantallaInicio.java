/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

/**
 *
 * @author Edgar Guamo
 */
public class PantallaInicio extends javax.swing.JFrame {

    /**
     * Creates new form PantallaInicio2
     */
    public PantallaInicio() {
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

        jFondo = new javax.swing.JPanel();
        logo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ingresarMerc = new javax.swing.JButton();
        calcularCom = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jFondo.setBackground(new java.awt.Color(51, 51, 51));

        logo.setBackground(new java.awt.Color(51, 51, 51));
        logo.setAutoscrolls(true);
        logo.setPreferredSize(new java.awt.Dimension(392, 460));

        jLabel2.setFont(new java.awt.Font("Vivaldi", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Universidad Técnica");

        jLabel3.setFont(new java.awt.Font("Vivaldi", 1, 44)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Particular de Loja");

        jLabel4.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Proyecto POO");

        jLabel5.setFont(new java.awt.Font("Vivaldi", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alumno: Edgar Guamo M.");

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addGroup(logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logoLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4))
                    .addGroup(logoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20))
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(69, 69, 69))
        );

        panelOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panelOpciones.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 48)); // NOI18N
        jLabel1.setText("Mall del Río");

        ingresarMerc.setBackground(new java.awt.Color(196, 225, 255));
        ingresarMerc.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        ingresarMerc.setText("Ingreso de Mercadería");
        ingresarMerc.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ingresarMerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarMercActionPerformed(evt);
            }
        });

        calcularCom.setBackground(new java.awt.Color(196, 225, 255));
        calcularCom.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        calcularCom.setText("Calcular Compra");
        calcularCom.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        calcularCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularComActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(196, 225, 255));
        salir.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        salir.setText("Salir");
        salir.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesLayout = new javax.swing.GroupLayout(panelOpciones);
        panelOpciones.setLayout(panelOpcionesLayout);
        panelOpcionesLayout.setHorizontalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresarMerc)
                    .addComponent(jLabel1))
                .addGap(50, 50, 50))
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addGroup(panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOpcionesLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(calcularCom))
                    .addGroup(panelOpcionesLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(salir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOpcionesLayout.setVerticalGroup(
            panelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(ingresarMerc)
                .addGap(77, 77, 77)
                .addComponent(calcularCom)
                .addGap(60, 60, 60)
                .addComponent(salir)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFondoLayout = new javax.swing.GroupLayout(jFondo);
        jFondo.setLayout(jFondoLayout);
        jFondoLayout.setHorizontalGroup(
            jFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFondoLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFondoLayout.setVerticalGroup(
            jFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Ingreso Mercadería
    private void ingresarMercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarMercActionPerformed
        // TODO add your handling code here:
        IngresoMercaderia iMerc = new IngresoMercaderia();
        //Para mostrar la interfaz 
        iMerc.show();
        
    }//GEN-LAST:event_ingresarMercActionPerformed
    
    //Boton calcular Compras
    private void calcularComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularComActionPerformed
        // TODO add your handling code here:
        CalcularCompra cComp = new CalcularCompra();
        //Para mostrar la interfaz 
        cComp.show();

    }//GEN-LAST:event_calcularComActionPerformed

    //Boton salir 
    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        //Para cerrrar el programa
        dispose();
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicio().setVisible(true);
            }
        });
    }
    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcularCom;
    private javax.swing.JButton ingresarMerc;
    private javax.swing.JPanel jFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
