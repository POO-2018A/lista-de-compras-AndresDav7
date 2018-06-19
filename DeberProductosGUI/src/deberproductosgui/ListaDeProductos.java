package deberproductosgui;

import javax.swing.JOptionPane;

public class ListaDeProductos extends javax.swing.JFrame {
    
    String cantidadLbl[] = new String[4];
    int indiceLbl = 0;
    
    public ListaDeProductos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblItemNombre = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        lblItem01 = new javax.swing.JLabel();
        lblItem02 = new javax.swing.JLabel();
        lblItem03 = new javax.swing.JLabel();
        lblItem04 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblItemNombre.setText("Item o Producto =");

        txtItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblItem04, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItem03, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItem02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItem01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReiniciar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(82, 82, 82)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblItemNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnCancelar))
                .addGap(28, 28, 28)
                .addComponent(lblItem01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblItem02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblItem03, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblItem04, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnReiniciar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        txtItem.setText("");
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        
        lblItem01.setText("");
        lblItem02.setText("");
        lblItem03.setText("");
        lblItem04.setText("");
        indiceLbl = 0;
        
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
     
        if("".equals(txtItem.getText())){
            
            JOptionPane.showMessageDialog(this, "Por favor Ingrese Texto !");
                        
        }else{
            
            if(indiceLbl >= 4){
                
                JOptionPane.showMessageDialog(this, "Listado Lleno !");
                
            }else{
            
                cantidadLbl[indiceLbl] = txtItem.getText();
                int option = JOptionPane.showConfirmDialog(this, "Desea agregar el producto ?");
                if(option == 0){
                switch(indiceLbl){
                    case 0:
                        lblItem01.setText(cantidadLbl[indiceLbl]);
                        break;
                    case 1:
                        lblItem02.setText(cantidadLbl[indiceLbl]);
                        break;
                    case 2:
                        lblItem03.setText(cantidadLbl[indiceLbl]);
                        break;
                    case 3:
                        lblItem04.setText(cantidadLbl[indiceLbl]);
                        break;   
                    }
                }else{
                    indiceLbl--;
                }
                indiceLbl++;
            }
        }
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(ListaDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel lblItem01;
    private javax.swing.JLabel lblItem02;
    private javax.swing.JLabel lblItem03;
    private javax.swing.JLabel lblItem04;
    private javax.swing.JLabel lblItemNombre;
    private javax.swing.JTextField txtItem;
    // End of variables declaration//GEN-END:variables
}
