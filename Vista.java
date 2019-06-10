package asignacionmemoria;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Vista extends javax.swing.JFrame {

    int[] cantidad = new int[8];
    Proceso proceso = new Proceso();
    int p3 = 0;
    int p5 = 0;
    int p7 = 0;

    public Vista() {
        initComponents();
        setBounds(100, 0, 500, 700);
        cantidad[0] = 0;
        cantidad[1] = 0;
        cantidad[2] = 8;
        cantidad[3] = 0;
        cantidad[4] = 10;
        cantidad[5] = 0;
        cantidad[6] = 4;
        cantidad[7] = 6;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OS 8m");

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 176, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(220, 50, 176, 80);

        jPanel2.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("p1 8m");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 176, 80);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(220, 130, 176, 80);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3);
        jPanel3.setBounds(220, 210, 176, 80);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("p3 2m");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel11);
        jLabel11.setBounds(0, 0, 176, 20);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(220, 290, 176, 20);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);
        getContentPane().add(jPanel5);
        jPanel5.setBounds(220, 310, 176, 100);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("p5 8m");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.add(jLabel12);
        jLabel12.setBounds(0, 0, 176, 80);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(220, 410, 176, 80);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(220, 490, 176, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("44");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 470, 30, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("8");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 120, 30, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("16");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 200, 30, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("24");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 270, 30, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("26");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(180, 300, 30, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("36");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 390, 30, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("48");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 510, 30, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("0");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 40, 30, 30);

        jLabel13.setText("proceso");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 20, 50, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(70, 20, 30, 20);

        jLabel14.setText("tamaño");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 60, 50, 14);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(70, 60, 30, 20);

        jButton1.setText("first");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 100, 60, 23);

        jButton2.setText("next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 140, 60, 23);

        jButton3.setText("best");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 180, 60, 23);

        jButton4.setText("worst");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(30, 220, 60, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void pintar() {
        if (cantidad[7] == 3) {
            JLabel label = new JLabel("p" + jTextField1.getText() + " " + jTextField2.getText() + "m");
            label.setFont(new java.awt.Font("Tahoma", 0, 16));
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            label.setBounds(0, p3, 176, 10 * Integer.parseInt(jTextField2.getText()));
            label.setBorder(new LineBorder(Color.RED));
            label.setForeground(Color.RED);
            jPanel3.add(label);
            p3 = p3 + (Integer.parseInt(jTextField2.getText()) * 10);
            jPanel3.updateUI();
        } else if (cantidad[7] == 5) {
            JLabel label = new JLabel("p" + jTextField1.getText() + " " + jTextField2.getText() + "m");
            label.setFont(new java.awt.Font("Tahoma", 0, 16));
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            label.setBounds(0, p5, 176, 10 * Integer.parseInt(jTextField2.getText()));
            label.setBorder(new LineBorder(Color.RED));
            label.setForeground(Color.RED);
            jPanel5.add(label);
            p5 = p5 + (Integer.parseInt(jTextField2.getText()) * 10);
            jPanel5.updateUI();
        } else if (cantidad[7] == 7) {
            JLabel label = new JLabel("p" + jTextField1.getText() + " " + jTextField2.getText() + "m");
            label.setFont(new java.awt.Font("Tahoma", 0, 16));
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            label.setBounds(0, p7, 176, 10 * Integer.parseInt(jTextField2.getText()));
            label.setBorder(new LineBorder(Color.RED));
            label.setForeground(Color.RED);
            jPanel7.add(label);
            p7 = p7 + (Integer.parseInt(jTextField2.getText()) * 10);
            jPanel7.updateUI();
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cantidad = proceso.first(Integer.parseInt(jTextField2.getText()), cantidad);
        pintar();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cantidad = proceso.next(Integer.parseInt(jTextField2.getText()), cantidad);
        pintar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cantidad = proceso.best(Integer.parseInt(jTextField2.getText()), cantidad);
        pintar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cantidad = proceso.worst(Integer.parseInt(jTextField2.getText()), cantidad);
        pintar();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
