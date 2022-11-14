
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sagar Borana
 */
public class TIC_TAC_TOE extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    private String turn = "X";
    private int xcount = 0;
    private int ocount = 0;
    private int totalcount = 0;
    private boolean win = false;
    
    public TIC_TAC_TOE() {
        initComponents();
    }

    private void ChoosePlayer(){
        if(turn.equalsIgnoreCase("X")){
            turn = "O";
        }else{
            turn = "X";
        }
    }
    
    private void SetScore(){
        scorex.setText(String.valueOf(xcount));
        scoreo.setText(String.valueOf(ocount));
    }
    
    private void winningGame(){
        
        totalcount++ ;
        
        String btn1 = button1.getText();
        String btn2 = button2.getText();
        String btn3 = button3.getText();
        String btn4 = button4.getText();
        String btn5 = button5.getText();
        String btn6 = button6.getText();
        String btn7 = button7.getText();
        String btn8 = button8.getText();
        String btn9 = button9.getText();
        
        if(btn1.equals(btn2) && btn2.equals(btn3) && !"".equals(btn1)){
            
            win = true;
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player X Wins";
                xcount++;
            }else{
                msg = " Player O Wins";
                ocount++;
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            button1.setBackground(Color.orange);
            button2.setBackground(Color.orange);
            button3.setBackground(Color.orange);
            
            SetScore();
            
        }else if(btn4.equals(btn5) && btn5.equals(btn6) && !"".equals(btn4)){
            
            win = true;
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player X Wins";
                xcount++;
            }else{
                msg = " Player O Wins";
                ocount++;
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            button4.setBackground(Color.orange);
            button5.setBackground(Color.orange);
            button6.setBackground(Color.orange);
            
            SetScore();
            
        }else if(btn7.equals(btn8) && btn8.equals(btn9) && !"".equals(btn7)){
            
            win = true;
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player X Wins";
                xcount++;
            }else{
                msg = " Player O Wins";
                ocount++;
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            button7.setBackground(Color.orange);
            button8.setBackground(Color.orange);
            button9.setBackground(Color.orange);
            
            SetScore();
            
        }else if(btn1.equals(btn4) && btn4.equals(btn7) && !"".equals(btn1)){
            
            win = true;
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player X Wins";
                xcount++;
            }else{
                msg = " Player O Wins";
                ocount++;
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            button1.setBackground(Color.orange);
            button4.setBackground(Color.orange);
            button7.setBackground(Color.orange);
            
            SetScore();
            
        }else if(btn2.equals(btn5) && btn5.equals(btn8) && !"".equals(btn2)){
            
            win = true;
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player X Wins";
                xcount++;
            }else{
                msg = " Player O Wins";
                ocount++;
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            button2.setBackground(Color.orange);
            button5.setBackground(Color.orange);
            button8.setBackground(Color.orange);
            
            SetScore();
            
        }else if(btn3.equals(btn6) && btn6.equals(btn9) && !"".equals(btn3)){
            
            win = true;
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player X Wins";
                xcount++;
            }else{
                msg = " Player O Wins";
                ocount++;
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            button3.setBackground(Color.orange);
            button6.setBackground(Color.orange);
            button9.setBackground(Color.orange);
            SetScore();
            
        }else if(btn1.equals(btn5) && btn5.equals(btn9) && !"".equals(btn1)){
            
            win = true;
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player X Wins";
                xcount++;
            }else{
                msg = " Player O Wins";
                ocount++;
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            button1.setBackground(Color.orange);
            button5.setBackground(Color.orange);
            button9.setBackground(Color.orange);
            
            SetScore();
            
        }else if(btn3.equals(btn5) && btn5.equals(btn7) && !"".equals(btn3)){
            
            win = true;
            String msg;
            if(turn.equalsIgnoreCase("X")){
                msg = "Player X Wins";
                xcount++;
            }else{
                msg = " Player O Wins";
                ocount++;
            }
            JOptionPane.showMessageDialog(this,msg,"Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            button3.setBackground(Color.orange);
            button5.setBackground(Color.orange);
            button7.setBackground(Color.orange);
            
            if(totalcount == 9){
                JOptionPane.showMessageDialog(this,"Game Drawn","Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            }
            SetScore();
            
        }
    }
    
    private void checkDraw(){
        
        if(win)
            return;
        
        if(!"".equals(button1.getText()) && !"".equals(button2.getText()) && !"".equals(button3.getText()) 
                && !"".equals(button4.getText()) && !"".equals(button5.getText()) && !"".equals(button6.getText())
                && !"".equals(button7.getText()) && !"".equals(button8.getText()) && !"".equals(button9.getText())){
            
            JOptionPane.showMessageDialog(this, "Let's Play Again!", "Game Drawn", JOptionPane.INFORMATION_MESSAGE);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        gamepanel = new javax.swing.JPanel();
        gamelabel = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        cardpanel = new javax.swing.JPanel();
        scorepanel = new javax.swing.JPanel();
        scorelabel = new javax.swing.JLabel();
        playxlabel = new javax.swing.JLabel();
        scorex = new javax.swing.JLabel();
        scoreo = new javax.swing.JLabel();
        play0label = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTree1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC_TAC_TOE");
        setResizable(false);

        gamepanel.setBackground(new java.awt.Color(0, 0, 0));
        gamepanel.setForeground(new java.awt.Color(255, 255, 255));

        gamelabel.setBackground(new java.awt.Color(0, 0, 0));
        gamelabel.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        gamelabel.setForeground(new java.awt.Color(255, 255, 255));
        gamelabel.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout gamepanelLayout = new javax.swing.GroupLayout(gamepanel);
        gamepanel.setLayout(gamepanelLayout);
        gamepanelLayout.setHorizontalGroup(
            gamepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gamelabel)
                .addGap(146, 146, 146))
        );
        gamepanelLayout.setVerticalGroup(
            gamepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamepanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(gamelabel)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        button1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        button9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });

        button7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });

        button8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 0, 0));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 204, 204));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        cardpanel.setBackground(new java.awt.Color(255, 255, 51));
        cardpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scorepanel.setBackground(new java.awt.Color(0, 0, 0));
        scorepanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        scorelabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        scorelabel.setForeground(new java.awt.Color(255, 255, 255));
        scorelabel.setText(" SCORECARD");

        javax.swing.GroupLayout scorepanelLayout = new javax.swing.GroupLayout(scorepanel);
        scorepanel.setLayout(scorepanelLayout);
        scorepanelLayout.setHorizontalGroup(
            scorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scorepanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(scorelabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        scorepanelLayout.setVerticalGroup(
            scorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scorepanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(scorelabel)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        playxlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playxlabel.setText("PLAYER X :");

        scorex.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        scorex.setText("0");

        scoreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        scoreo.setText("0");

        play0label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        play0label.setText("PLAYER O :");

        javax.swing.GroupLayout cardpanelLayout = new javax.swing.GroupLayout(cardpanel);
        cardpanel.setLayout(cardpanelLayout);
        cardpanelLayout.setHorizontalGroup(
            cardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scorepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(cardpanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(cardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(playxlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(play0label, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scorex)
                    .addComponent(scoreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardpanelLayout.setVerticalGroup(
            cardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardpanelLayout.createSequentialGroup()
                .addComponent(scorepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(cardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playxlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scorex, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(play0label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cardpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
            .addComponent(gamepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gamepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cardpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        if(button1.getText() != ""){
            return;
        }
        button1.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            button1.setForeground(Color.red);
        }else{
            button1.setForeground(Color.magenta);
        }
        
        winningGame();
        checkDraw();
        ChoosePlayer();
        
//        button1.setEnabled(false);
    }//GEN-LAST:event_button1ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        // TODO add your handling code here:
        if(button5.getText() != ""){
            return;
        }
        button5.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            button5.setForeground(Color.red);
        }else{
            button5.setForeground(Color.magenta);
        }
        
        winningGame();
        checkDraw();
        ChoosePlayer();
//        button5.setEnabled(false);
    }//GEN-LAST:event_button5ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit?","Tic Tac Toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
                
        button1.setBackground(Color.white);
        button2.setBackground(Color.white);
        button3.setBackground(Color.white);
        button4.setBackground(Color.white);
        button5.setBackground(Color.white);
        button6.setBackground(Color.white);
        button7.setBackground(Color.white);
        button8.setBackground(Color.white);
        button9.setBackground(Color.white);
        
        win = false;
    }//GEN-LAST:event_resetActionPerformed

    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        // TODO add your handling code here:
        if(button9.getText() != ""){
            return;
        }
        button9.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            button9.setForeground(Color.red);
        }else{
            button9.setForeground(Color.magenta);
        }
        
        winningGame();
        checkDraw();
        ChoosePlayer();
        
//        button9.setEnabled(false);
    }//GEN-LAST:event_button9ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
//         TODO add your handling code here:
        if(button4.getText() != ""){
            return;
        }
        button4.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            button4.setForeground(Color.red);
        }else{
            button4.setForeground(Color.magenta);
        }
        
        winningGame();
        checkDraw();
        ChoosePlayer();
//        button4.setEnabled(false);
    }//GEN-LAST:event_button4ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        if(button2.getText() != ""){
            return;
        }
        button2.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            button2.setForeground(Color.red);
        }else{
            button2.setForeground(Color.magenta);
        }
        
        winningGame();
        checkDraw();
        ChoosePlayer();
//        button2.setEnabled(false);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        if(button3.getText() != ""){
            return;
        }
        button3.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            button3.setForeground(Color.red);
        }else{
            button3.setForeground(Color.magenta);
        }
        
        winningGame();
        checkDraw();
        ChoosePlayer();
//        button3.setEnabled(false);
    }//GEN-LAST:event_button3ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
//         TODO add your handling code here:
        if(button6.getText() != ""){
            return;
        }
        button6.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            button6.setForeground(Color.red);
        }else{
            button6.setForeground(Color.magenta);
        }
        
        winningGame();
        checkDraw();
        ChoosePlayer();
//        button6.setEnabled(false);
    }//GEN-LAST:event_button6ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        // TODO add your handling code here:
        if(button7.getText() != ""){
            return;
        }
        button7.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            button7.setForeground(Color.red);
        }else{
            button7.setForeground(Color.magenta);
        }
        
        winningGame();
        checkDraw();
        ChoosePlayer();
//        button7.setEnabled(false);
    }//GEN-LAST:event_button7ActionPerformed

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        // TODO add your handling code here:
        if(button8.getText() != ""){
            return;
        }
        button8.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            button8.setForeground(Color.red);
        }else{
            button8.setForeground(Color.magenta);
        }
        
        winningGame();
        checkDraw();
        ChoosePlayer();
//        button8.setEnabled(false);
    }//GEN-LAST:event_button8ActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JPanel cardpanel;
    private javax.swing.JButton exit;
    private javax.swing.JLabel gamelabel;
    private javax.swing.JPanel gamepanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel play0label;
    private javax.swing.JLabel playxlabel;
    private javax.swing.JButton reset;
    private javax.swing.JLabel scorelabel;
    private javax.swing.JLabel scoreo;
    private javax.swing.JPanel scorepanel;
    private javax.swing.JLabel scorex;
    // End of variables declaration//GEN-END:variables
}
