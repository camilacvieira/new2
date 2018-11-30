/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGrafica.Frame;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import pokemon.Treinador;


/**
 *
 * @author Caio
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    Treinador c, d;
    int vez = 1;
    
    public Frame(Treinador a, Treinador b) {
        c = new Treinador();
        d = new Treinador();
        initComponents();
        Panel2.setVisible(false);
        Panel3.setVisible(false);
        mudaTelaInicial(a, b);
    }
    
    public Frame() {
        initComponents();
        Panel2.setVisible(false);
        Panel3.setVisible(false);
        mudaTelaInicial();
    }
    
    public void mudaTelaInicial(){
        Component []components = Panel1.getComponents();
        for(Component component : components){
            if(component instanceof JButton){
                System.out.println("Teste");
                JButton button = (JButton) component;
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(component==iniciarJogo){
                            Panel1.setVisible(false);
                            Panel2.setVisible(true);
                            //mudaTelaTime();
                        }
                    }
                } );
            }
        }
    }
    
    public void mudaTelaInicial(Treinador a, Treinador b){
        Component []components = Panel1.getComponents();
        for(Component component : components){
            if(component instanceof JButton){
                System.out.println("Teste");
                JButton button = (JButton) component;
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(component==iniciarJogo){
                            
                            
                            Panel1.setVisible(false);
                            Panel2.setVisible(true);
                            
                            
                        }
                    }
                } );
            }
        }
    }
    
    public void escolheTimeA(Treinador a, Treinador b){
        Component []components = Panel2.getComponents();
        System.out.println("Teste1");
        for(Component component : components ){
            if(component instanceof JButton){
                JButton button = (JButton) component;
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(component == Time1){
                            System.out.println("Treinador a escolheu time 1");
                            a.escolherTime(1);
                        }
                        if(component == Time2){
                            System.out.println("Treinador a escolheu time 2");
                            a.escolherTime(2);
                        }
                        if(component == Time3){
                            System.out.println("Treinador a escolheu time 3");
                            a.escolherTime(3);
                        }
                        if(component == Time4){
                            System.out.println("Treinador a escolheu time 4");
                            a.escolherTime(4);
                        }
                        escolheTimeB(b);
                    }
                });
            }
        }
    }
    
    public void escolheTimeB(Treinador b){
        Component []components = Panel2.getComponents();
        for(Component component : components ){
            if(component instanceof JButton){
                JButton button = (JButton) component;
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(component == Time1){
                            System.out.println("Treinador b escolheu time 1");
                            b.escolherTime(1);
                        }
                        if(component == Time2){
                            System.out.println("Treinador b escolheu time 2");
                            b.escolherTime(2);
                        }
                        if(component == Time3){
                            System.out.println("Treinador b escolheu time 3");
                            b.escolherTime(3);
                        }
                        if(component == Time4){
                            System.out.println("Treinador b escolheu time 4");
                            b.escolherTime(4);
                        }
                        Panel2.setVisible(false);
                        Panel3.setVisible(true);
                    }
                });
            }
        }

    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Panel1 = new javax.swing.JPanel();
        iniciarJogo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        Time1 = new javax.swing.JButton();
        Time2 = new javax.swing.JButton();
        Time3 = new javax.swing.JButton();
        Time4 = new javax.swing.JButton();
        escolherTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1275, 740));
        setResizable(false);
        getContentPane().setLayout(null);

        Panel3.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaceGrafica/images/pokemon bg.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        Panel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 1280, 720);

        getContentPane().add(Panel3);
        Panel3.setBounds(0, 0, 1270, 720);

        Panel1.setLayout(null);

        iniciarJogo.setBorderPainted(false);
        iniciarJogo.setContentAreaFilled(false);
        iniciarJogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel1.add(iniciarJogo);
        iniciarJogo.setBounds(420, 260, 480, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaceGrafica/images/TelaInicial.png"))); // NOI18N
        jLabel1.setText("Teste");
        Panel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1270, 710);

        getContentPane().add(Panel1);
        Panel1.setBounds(0, 0, 1270, 720);

        Panel2.setLayout(null);

        Time1.setBorderPainted(false);
        Time1.setContentAreaFilled(false);
        Time1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Time1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time1ActionPerformed(evt);
            }
        });
        Panel2.add(Time1);
        Time1.setBounds(141, 240, 280, 55);

        Time2.setBorderPainted(false);
        Time2.setContentAreaFilled(false);
        Time2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Time2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time2ActionPerformed(evt);
            }
        });
        Panel2.add(Time2);
        Time2.setBounds(860, 240, 280, 55);

        Time3.setBorderPainted(false);
        Time3.setContentAreaFilled(false);
        Time3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Time3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time3ActionPerformed(evt);
            }
        });
        Panel2.add(Time3);
        Time3.setBounds(142, 613, 280, 55);

        Time4.setBorderPainted(false);
        Time4.setContentAreaFilled(false);
        Time4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Time4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Time4ActionPerformed(evt);
            }
        });
        Panel2.add(Time4);
        Time4.setBounds(865, 617, 280, 55);

        escolherTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaceGrafica/images/TelaEscolhaPersonagem_1.png"))); // NOI18N
        escolherTime.setText("jLabel2");
        Panel2.add(escolherTime);
        escolherTime.setBounds(0, 0, 1280, 720);

        getContentPane().add(Panel2);
        Panel2.setBounds(0, 0, 1280, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Time1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time1ActionPerformed
        if(vez==1){
            System.out.println("Jogador 1 escolheu time 1");
            c.escolherTime(1);
            vez=2;
        }
        else{
            System.out.println("Jogador 2 escolheu time 1");
            d.escolherTime(1);
            Panel2.setVisible(false);
            Panel3.setVisible(true);
        }
        
    }//GEN-LAST:event_Time1ActionPerformed

    private void Time2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time2ActionPerformed
        if(vez==1){
            System.out.println("Jogador 1 escolheu time 2");
            c.escolherTime(2);
            vez=2;
        }
        else{
            System.out.println("Jogador 2 escolheu time 2");
            d.escolherTime(2);
            Panel2.setVisible(false);
            Panel3.setVisible(true);
        }
    }//GEN-LAST:event_Time2ActionPerformed

    private void Time3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time3ActionPerformed
        if(vez==1){
            System.out.println("Jogador 1 escolheu time 3");
            c.escolherTime(3);
            vez=2;
        }
        else{
            System.out.println("Jogador 2 escolheu time 3");
            d.escolherTime(3);
            Panel2.setVisible(false);
            Panel3.setVisible(true);
        }
    }//GEN-LAST:event_Time3ActionPerformed

    private void Time4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Time4ActionPerformed
        if(vez==1){
            System.out.println("Jogador 1 escolheu time 4");
            c.escolherTime(4);
            vez=2;
        }
        else{
            System.out.println("Jogador 2 escolheu time 4");
            d.escolherTime(4);
            Panel2.setVisible(false);
            Panel3.setVisible(true);
        }
    }//GEN-LAST:event_Time4ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JButton Time1;
    private javax.swing.JButton Time2;
    private javax.swing.JButton Time3;
    private javax.swing.JButton Time4;
    private javax.swing.JLabel escolherTime;
    private javax.swing.JButton iniciarJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
