/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class VistaTresEnRaya extends javax.swing.JFrame {
     private JButton[][] tablero;
    /**
     * Creates new form VistaPrincipall
     */
    public VistaTresEnRaya() {
        initComponents();
        construirTablero();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        Jugar = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        panelVacio = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        Jugar1 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane5 = new javax.swing.JTextPane();

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        Jugar.setBackground(new java.awt.Color(255, 255, 255));
        Jugar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Jugar.setForeground(new java.awt.Color(255, 0, 0));
        Jugar.setText("Jugar");
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarjButtonJugarActionPerformed(evt);
            }
        });

        jTextField4.setBackground(new java.awt.Color(255, 204, 255));
        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 204));
        jTextField4.setText("  Tres En Raya");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4jTextField2ActionPerformed(evt);
            }
        });

        jTextPane4.setBackground(new java.awt.Color(204, 255, 204));
        jTextPane4.setText("Juegas como X y la Computadora como O.\nTienes que seleccionar la casilla donde quieres poner tu X  y realiza un clic con el ratón.\nYa que partes tu primero.\n Sólo puedes elegir las casillas que estén libres.\n El primer jugador que rellene 3 casillas en línea gana.\n Buena Suerte!");
        jScrollPane4.setViewportView(jTextPane4);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Jugar)
                .addGap(83, 83, 83))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        panelVacio.setBackground(new java.awt.Color(204, 204, 255));
        panelVacio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelVacio.setMaximumSize(new java.awt.Dimension(100, 100));
        panelVacio.setMinimumSize(new java.awt.Dimension(100, 100));
        panelVacio.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout panelVacioLayout = new javax.swing.GroupLayout(panelVacio);
        panelVacio.setLayout(panelVacioLayout);
        panelVacioLayout.setHorizontalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );
        panelVacioLayout.setVerticalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));

        Jugar1.setBackground(new java.awt.Color(255, 255, 255));
        Jugar1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Jugar1.setForeground(new java.awt.Color(255, 0, 0));
        Jugar1.setText("Jugar");
        Jugar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jugar1jButtonJugarActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(255, 204, 255));
        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 204));
        jTextField5.setText("  Tres En Raya");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5jTextField2ActionPerformed(evt);
            }
        });

        jTextPane5.setBackground(new java.awt.Color(204, 255, 204));
        jTextPane5.setText("Juegas como X y la Computadora como O.\nTienes que seleccionar la casilla donde quieres poner tu X  y realiza un clic con el ratón.Ya que partes tu primero.\n Sólo puedes elegir las casillas que estén libres. El primer jugador que rellene 3 casillas en línea gana.\n Buena Suerte!");
        jScrollPane5.setViewportView(jTextPane5);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(Jugar1))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Jugar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelVacio, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVacio, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JugarjButtonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarjButtonJugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JugarjButtonJugarActionPerformed

    private void jTextField4jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4jTextField2ActionPerformed

    private void Jugar1jButtonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jugar1jButtonJugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jugar1jButtonJugarActionPerformed

    private void jTextField5jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jugar;
    private javax.swing.JButton Jugar1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextPane jTextPane4;
    private javax.swing.JTextPane jTextPane5;
    private javax.swing.JPanel panelVacio;
    // End of variables declaration//GEN-END:variables

    
    public JButton getButtonJugar(){
        return Jugar1;
    }
    public JPanel getPanelVacio() {
        return panelVacio;
    }
    public JButton[][] getTablero() {
        return tablero;
    }
    
    public void agregarListenerJugar(ActionListener al){
        this.Jugar1.addActionListener(al);
    }
    
    public void agregarListener(ActionListener al){
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                tablero[i][j].addActionListener(al);
            }
        }
    }

    public void ponerSimbolo(int posicion,String simbolo){
        switch(posicion){
            case 1:
                tablero[0][0].setText(simbolo);
                break;
            case 2:
                tablero[0][1].setText(simbolo);
                break;
            case 3:
                tablero[0][2].setText(simbolo);
                break;
            case 4:
                tablero[1][0].setText(simbolo);
                break;
            case 5:
                tablero[1][1].setText(simbolo);
                break;
            case 6:
                tablero[1][2].setText(simbolo);
                break;
            case 7:
                tablero[2][0].setText(simbolo);
                break;
            case 8:
                tablero[2][1].setText(simbolo);
                break;
            case 9:
                tablero[2][2].setText(simbolo);
                break;
        }
    }
    public String comprobacionSimbolo (int posicion){
        String simbolo;
        simbolo = "";
        switch(posicion){
            case 1:
                simbolo = tablero[0][0].getText();
                break;
            case 2:
                simbolo = tablero[0][1].getText();
                break;
            case 3:
                simbolo = tablero[0][2].getText();
                break;
            case 4:
                simbolo = tablero[1][0].getText();
                break;
            case 5:
                simbolo = tablero[1][1].getText();
                break;
            case 6:
                simbolo = tablero[1][2].getText();
                break;
            case 7:
                simbolo = tablero[2][0].getText();
                break;
            case 8:
                simbolo = tablero[2][1].getText();
                break;
            case 9:
                simbolo = tablero[2][2].getText();
                break;
        }
        return simbolo;
    }
    
    public void construirTablero(){
        tablero = new JButton[3][3];
        this.panelVacio.setLayout(new GridLayout(3,3));
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                tablero[i][j] = new JButton();
                tablero[i][j].setBorderPainted(true);
                panelVacio.add(tablero[i][j]);
            }
        }
    }
}
        

