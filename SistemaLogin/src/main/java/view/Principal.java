/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author André
 */
public class Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());

   
    public Principal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        labelInformacoesUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnNotificacoes = new javax.swing.JMenu();
        btnVerNotificacoes = new javax.swing.JMenuItem();
        btnMarcarNotificacoesComoLidas = new javax.swing.JMenuItem();
        btnPerfil = new javax.swing.JMenu();
        btnVizualisarPerfil = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(153, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelInformacoesUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelInformacoesUsuario.setText("texto temporario");

        btnNotificacoes.setText("Notificações");

        btnVerNotificacoes.setText("Ver Notificações");
        btnNotificacoes.add(btnVerNotificacoes);

        btnMarcarNotificacoesComoLidas.setText("Marcar como Lida");
        btnNotificacoes.add(btnMarcarNotificacoesComoLidas);

        jMenuBar1.add(btnNotificacoes);

        btnPerfil.setText("Perfil");

        btnVizualisarPerfil.setText("Visualizar Perfil");
        btnPerfil.add(btnVizualisarPerfil);

        jMenuBar1.add(btnPerfil);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInformacoesUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(590, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelInformacoesUsuario)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnMarcarNotificacoesComoLidas;
    private javax.swing.JMenu btnNotificacoes;
    private javax.swing.JMenu btnPerfil;
    private javax.swing.JMenuItem btnVerNotificacoes;
    private javax.swing.JMenuItem btnVizualisarPerfil;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelInformacoesUsuario;
    // End of variables declaration//GEN-END:variables
}
