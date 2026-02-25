package itson.vista;

import itson.control.CompraControl;

public class CompraVista extends javax.swing.JFrame {

    private CompraControl control;
    
    public CompraVista() {
        initComponents();
    }
    
    public void setControl(CompraControl control){
    
        this.control = control;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        btnVerProductos = new javax.swing.JButton();
        btnVerCarrito = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CASO DE USO COMPRAR PRODUCTO");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 500, -1));

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 460, 380));

        btnVerProductos.setText("Ver productos");
        btnVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        btnVerCarrito.setText("Ver mi carrito");
        btnVerCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCarritoActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        jButton2.setText("Proceder al pago");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProductosActionPerformed
        PnlFrutas pnlFrutas = new PnlFrutas(control);

        pnlFrutas.setSize(pnlPrincipal.getWidth(), pnlPrincipal.getHeight());
        pnlFrutas.setLocation(0, 0);

        pnlPrincipal.removeAll();
        pnlPrincipal.add(pnlFrutas);

        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }//GEN-LAST:event_btnVerProductosActionPerformed

    private void btnVerCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCarritoActionPerformed
        PnlCarrito pnlCarrito = new PnlCarrito(control);

        pnlCarrito.setSize(pnlPrincipal.getWidth(), pnlPrincipal.getHeight());
        pnlCarrito.setLocation(0, 0);

        pnlPrincipal.removeAll();
        pnlPrincipal.add(pnlCarrito);

        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();
    }//GEN-LAST:event_btnVerCarritoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        double monto = control.procesarPago();
        
        if (monto == 0) {
            javax.swing.JOptionPane.showMessageDialog(
                this,                            
                "Por favor, agrega minimo 1 producto a tu carrito",
                "Error de Productos",                
                javax.swing.JOptionPane.ERROR_MESSAGE
            );
        } else {
            
            PnlPago pnlPago = new PnlPago(control);

            pnlPago.setSize(pnlPrincipal.getWidth(), pnlPrincipal.getHeight());
            pnlPago.setLocation(0, 0);

            pnlPrincipal.removeAll();
            pnlPrincipal.add(pnlPago);

            pnlPrincipal.revalidate();
            pnlPrincipal.repaint();
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerCarrito;
    private javax.swing.JButton btnVerProductos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
