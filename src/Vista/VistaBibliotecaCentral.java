/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Leo
 */
public class VistaBibliotecaCentral extends javax.swing.JFrame {

    /**
     * Creates new form VistaBibliotecaCentral
     */
    public VistaBibliotecaCentral() {
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

        botonAhorcado = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        botonBuscaminas = new javax.swing.JButton();
        botonTresEnRaya = new javax.swing.JButton();
        botonAdivinaLaPalabra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonAhorcado.setText("Ahorcado");

        botonVolver.setText("Volver");

        botonBuscaminas.setText("Buscaminas");

        botonTresEnRaya.setText("Tres en raya");

        botonAdivinaLaPalabra.setText("Adivina la palabra");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Biblioteca Central");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonBuscaminas, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(botonAhorcado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonAdivinaLaPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(botonTresEnRaya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 140, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscaminas)
                    .addComponent(botonTresEnRaya))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAhorcado)
                    .addComponent(botonAdivinaLaPalabra))
                .addGap(44, 44, 44)
                .addComponent(botonVolver)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAdivinaLaPalabra;
    private javax.swing.JButton botonAhorcado;
    private javax.swing.JButton botonBuscaminas;
    private javax.swing.JButton botonTresEnRaya;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

//AGREGAR ACTION LISTENER PARA TODAS LAS FUNCIONALIDADES INDIVIDUALES, LUEGO LOS GETTERS.
    public void agregarListener(ActionListener al){
        this.botonAhorcado.addActionListener(al);
        this.botonBuscaminas.addActionListener(al);
        this.botonAdivinaLaPalabra.addActionListener(al);
        this.botonTresEnRaya.addActionListener(al);
        this.botonVolver.addActionListener(al);
    }

    public JButton getButtonAhorcado() {
        return botonAhorcado;
    }

    public JButton getButtonVolver() {
        return botonVolver;
    }
    
    public JButton getBotonBuscaminas() {
        return botonBuscaminas;
    }
    
    public JButton getBotonAdivinaLaPalabra() {
        return botonAdivinaLaPalabra;
    }
    
    public JButton getBotonTresEnRaya() {
        return botonTresEnRaya;
    }

}
