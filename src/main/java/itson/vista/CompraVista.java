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

    public void mostrarProductos(){
    
        
        
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
        getContentPane().add(btnVerCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        jButton2.setText("Proceder al pago");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProductosActionPerformed
        
        PnlFrutas pnlFrutas = new PnlFrutas(control);
        
        pnlPrincipal.removeAll();
        pnlPrincipal.add(pnlFrutas);
        
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnVerProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerCarrito;
    private javax.swing.JButton btnVerProductos;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
