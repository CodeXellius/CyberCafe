/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cybercafe.view;

/**
 *
 * @author aadit
 */
public class loading extends javax.swing.JFrame {

    /**
     * Creates new form loading
     */
    public loading() {
        initComponents();
        startProgress(); // Show loading screen and initiate progress
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlb_loading = new javax.swing.JLabel();
        jpbar_loading = new javax.swing.JProgressBar();
        jlb_title = new javax.swing.JLabel();
        jlb_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb_loading.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlb_loading.setForeground(new java.awt.Color(242, 242, 242));
        jlb_loading.setText("Loading...");
        getContentPane().add(jlb_loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, -1, -1));

        jpbar_loading.setStringPainted(true);
        getContentPane().add(jpbar_loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 240, 30));

        jlb_title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlb_title.setForeground(new java.awt.Color(242, 242, 242));
        jlb_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb_title.setText("CYBER CAFE MANAGEMENT SYSTEM");
        getContentPane().add(jlb_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 680, 40));

        jlb_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cybercafe/resources/login_background.jpg"))); // NOI18N
        getContentPane().add(jlb_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

        /* Create and display the form */
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
        new loading().setVisible(true);
    });
}

        // Method to simulate loading progress
    private void startProgress() {
        javax.swing.SwingWorker<Void, Integer> worker = new javax.swing.SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(10); // Simulated delay for progress bar
                    publish(i);
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                int progress = chunks.get(chunks.size() - 1);
                jpbar_loading.setValue(progress);
            }

   
            @Override
                protected void done() {
                    // Dispose the loading screen
                    dispose();

                    // Show login screen
                    new login().setVisible(true);
            }
        };
        worker.execute();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlb_background;
    private javax.swing.JLabel jlb_loading;
    private javax.swing.JLabel jlb_title;
    private javax.swing.JProgressBar jpbar_loading;
    // End of variables declaration//GEN-END:variables
}