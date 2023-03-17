/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gloryfinalvolleyballscoringboard;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.Timer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.DataLine;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author GPI299
 */
public class controlside extends javax.swing.JFrame {

    /**
     * Creates new form controlside
     */
    JFrame window;
  
    public static Mixer mixer;
    public static Clip clip;
   Timer thirty; 
   Timer ts;
    Timer mi;
       Timer tsf;
    Timer mif;
        Timer mifsec;
Action addTeamA;
Action lessTeamA;
Action addTeamB;
Action lessTeamB;
Action lessTeamASet;
Action addTeamASet;
Action lessTeamBSet;
Action addTeamBSet;
Action buzzer;



        
    public controlside() {
//             

   mainScoreBoard mainscoreboard = new mainScoreBoard();
   mainscoreboard.setVisible(true);

//window = new JFrame();


        initComponents();
          oneTimeOutTeamA.setBackground(Color.WHITE);
   twoTimeOutTeamA.setBackground(Color.WHITE);
  oneTimeOutTeamB.setBackground(Color.WHITE);
  twoTimeOutTeamB.setBackground(Color.WHITE);
        setLocationRelativeTo(this);
        removePicTeamA.setVisible(false);
                removePicTeamB.setVisible(false);

 setDefaultCloseOperation(controlside.DO_NOTHING_ON_CLOSE);
 
 
 
 addTeamA = new AddTeamA();
  lessTeamA = new LessTeamA();
 addTeamB = new AddTeamB();
 lessTeamB = new LessTeamB();
 lessTeamASet = new LessTeamASet();
 addTeamASet = new AddTeamASet();
 lessTeamBSet = new LessTeamBSet();
 addTeamBSet = new AddTeamBSet();
  buzzer = new Buzzer();


 
// Action clickAddTeamA = new AbstractAction("smth"){
//     @Override
//     public void actionPerformed (ActionEvent e){
//         throw new UnsupportedOperationException("Not supported yet. ");
//     }
//     
// };
 

 jPanel6.getInputMap().put(KeyStroke.getKeyStroke("alt D"), "addTeamA");
 jPanel6.getActionMap().put("addTeamA", addTeamA);
 
  jPanel6.getInputMap().put(KeyStroke.getKeyStroke("alt A"), "lessTeamA");
 jPanel6.getActionMap().put("lessTeamA", lessTeamA);
 
  jPanel6.getInputMap().put(KeyStroke.getKeyStroke("alt L"), "addTeamB");
 jPanel6.getActionMap().put("addTeamB", addTeamB);
 
  jPanel6.getInputMap().put(KeyStroke.getKeyStroke("alt J"), "lessTeamB");
 jPanel6.getActionMap().put("lessTeamB", lessTeamB);
 
 
  jPanel6.getInputMap().put(KeyStroke.getKeyStroke("alt Z"), "lessTeamASet");
 jPanel6.getActionMap().put("lessTeamASet", lessTeamASet);
 
  jPanel6.getInputMap().put(KeyStroke.getKeyStroke("alt C"), "addTeamASet");
 jPanel6.getActionMap().put("addTeamASet", addTeamASet);
 
  jPanel6.getInputMap().put(KeyStroke.getKeyStroke("alt B"), "lessTeamBSet");
 jPanel6.getActionMap().put("lessTeamBSet", lessTeamBSet);
   jPanel6.getInputMap().put(KeyStroke.getKeyStroke("alt M"), "addTeamBSet");
 jPanel6.getActionMap().put("addTeamBSet", addTeamBSet);
   jPanel6.getInputMap().put(KeyStroke.getKeyStroke("F2"), "buzzer");
 jPanel6.getActionMap().put("buzzer", buzzer);
    }
private class AddTeamA extends AbstractAction{
    @Override
     public void actionPerformed (ActionEvent e){
          int teamAScore = Integer.parseInt(txtTeamAScore.getText());
        teamAScore++;
        txtTeamAScore.setText(String.valueOf(teamAScore));
        mainScoreBoard.Instance.teamascore.setText(String.valueOf(teamAScore));
       
     }
}
private class LessTeamA extends AbstractAction{
    @Override
     public void actionPerformed (ActionEvent e){
          int teamAScore = Integer.parseInt(txtTeamAScore.getText());
        teamAScore--;
        txtTeamAScore.setText(String.valueOf(teamAScore));
        mainScoreBoard.Instance.teamascore.setText(String.valueOf(teamAScore));
       
     }
}
private class AddTeamB extends AbstractAction{
    @Override
     public void actionPerformed (ActionEvent e){
          int teamBScore = Integer.parseInt(txtteamBScore.getText());
        teamBScore++;
        txtteamBScore.setText(String.valueOf(teamBScore));
                mainScoreBoard.Instance.teambscore.setText(String.valueOf(teamBScore));

       
     }
}
private class LessTeamB extends AbstractAction{
    @Override
     public void actionPerformed (ActionEvent e){
          
int teamBScore = Integer.parseInt(txtteamBScore.getText());
        teamBScore--;
        txtteamBScore.setText(String.valueOf(teamBScore));
       mainScoreBoard.Instance.teambscore.setText(String.valueOf(teamBScore));

       
     }
}
private class LessTeamASet extends AbstractAction{
    @Override
     public void actionPerformed (ActionEvent e){
       
       int teamASetWon = Integer.parseInt(teamASetsWon.getText());
        teamASetWon--;
        teamASetsWon.setText(String.valueOf(teamASetWon));
                        mainScoreBoard.Instance.teamaset.setText(String.valueOf(teamASetWon));

     }
}
private class AddTeamASet extends AbstractAction{
    @Override
     public void actionPerformed (ActionEvent e){
          int teamASetWon = Integer.parseInt(teamASetsWon.getText());
        teamASetWon++;
        teamASetsWon.setText(String.valueOf(teamASetWon));
                mainScoreBoard.Instance.teamaset.setText(String.valueOf(teamASetWon));
       
     }
}
private class LessTeamBSet extends AbstractAction{
    @Override
     public void actionPerformed (ActionEvent e){
         
        int teamBSetsWon = Integer.parseInt(txtteamBSetsWon.getText());
        teamBSetsWon--;
        txtteamBSetsWon.setText(String.valueOf(teamBSetsWon));
                                mainScoreBoard.Instance.teambset.setText(String.valueOf(teamBSetsWon));

     }
}
private class AddTeamBSet extends AbstractAction{
    @Override
     public void actionPerformed (ActionEvent e){
             int teamBSetsWon = Integer.parseInt(txtteamBSetsWon.getText());
        teamBSetsWon++;
        txtteamBSetsWon.setText(String.valueOf(teamBSetsWon));
                        mainScoreBoard.Instance.teambset.setText(String.valueOf(teamBSetsWon));

     }
}
private class Buzzer extends AbstractAction{
    @Override
     public void actionPerformed (ActionEvent e){
            
       try {
    
   Path path = Paths.get("buzzer.wav");
   String realPath = path.toAbsolutePath().toString();
//   System.out.println(realPath.replace("\\", "/"));
   
   String pathreal = realPath.replace("\\", "/");
   String pathreal2 = pathreal.replace("/buzzer.wav", "/src/main/java/volleyballScoreBoard/buzzer.wav");
String pathreal3 = "C:/GPIVolleyBallScoringBoard/buzzer.wav";
   

   
//   src\main\java\volleyballScoreBoard
   System.out.println(pathreal2);
   File wavFile = new File(pathreal3);
    Clip clip = AudioSystem.getClip();
//    System.out.println("\n[Path] : " + path.toAbsolutePath());
    
//    System.out.println(realPath.replace("\\", "/"));
    
    clip.open(AudioSystem.getAudioInputStream(wavFile));
    clip.start();
} catch (Exception er) {
    System.out.println(er);
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

        jFrame1 = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        btnBuzzer = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnTimeOutReset = new javax.swing.JButton();
        btnFiveMinutes = new javax.swing.JButton();
        btnTimeOutThirty = new javax.swing.JButton();
        btnTimeOutOne = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblSeconds = new javax.swing.JLabel();
        timerControl1 = new javax.swing.JLabel();
        lblMinute = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnLessScoreTeamA = new javax.swing.JButton();
        btnAddScoreTeamA = new javax.swing.JButton();
        lessSetWonTeamA = new javax.swing.JButton();
        btnAddSetWonTeamA = new javax.swing.JButton();
        teamASetsWon = new javax.swing.JLabel();
        teamAPicture = new javax.swing.JPanel();
        teamApictureLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTeamAName = new javax.swing.JTextField();
        txtTeamAScore = new javax.swing.JTextField();
        insertTeamApicture = new javax.swing.JButton();
        removePicTeamA = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnTeamAService = new javax.swing.JButton();
        btnTeamBService = new javax.swing.JButton();
        btnNoneService = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        oneTimeOutTeamA = new javax.swing.JButton();
        twoTimeOutTeamA = new javax.swing.JButton();
        oneTimeOutTeamB = new javax.swing.JButton();
        twoTimeOutTeamB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        teamBPicture = new javax.swing.JPanel();
        teamBpictureLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtteamBScore = new javax.swing.JLabel();
        txtteamBSetsWon = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnAddScoreTeamB = new javax.swing.JButton();
        btnAddSetsWonTeamB = new javax.swing.JButton();
        btnLessSetsWonTeamB = new javax.swing.JButton();
        btnlessScoreTeamB = new javax.swing.JButton();
        txtTeamBName = new javax.swing.JTextField();
        insertTeamBPicture = new javax.swing.JButton();
        removePicTeamB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel6KeyPressed(evt);
            }
        });

        btnBuzzer.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnBuzzer.setText("BUZZER");
        btnBuzzer.setToolTipText("");
        btnBuzzer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuzzerActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnTimeOutReset.setText("RESET");
        btnTimeOutReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimeOutResetActionPerformed(evt);
            }
        });

        btnFiveMinutes.setText("Practice 5:00");
        btnFiveMinutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveMinutesActionPerformed(evt);
            }
        });

        btnTimeOutThirty.setText("30 s");
        btnTimeOutThirty.setMargin(new java.awt.Insets(0, 14, 2, 0));
        btnTimeOutThirty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimeOutThirtyActionPerformed(evt);
            }
        });

        btnTimeOutOne.setText("1 minute");
        btnTimeOutOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimeOutOneActionPerformed(evt);
            }
        });

        lblSeconds.setFont(new java.awt.Font("Digital-7 Mono", 1, 80)); // NOI18N
        lblSeconds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeconds.setText("00");
        lblSeconds.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        timerControl1.setFont(new java.awt.Font("Digital-7 Mono", 1, 80)); // NOI18N
        timerControl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerControl1.setText(":");
        timerControl1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblMinute.setFont(new java.awt.Font("Digital-7 Mono", 1, 80)); // NOI18N
        lblMinute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinute.setText("0");
        lblMinute.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(lblMinute, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timerControl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSeconds)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSeconds, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(lblMinute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(timerControl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnTimeOutReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFiveMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimeOutThirty, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimeOutOne, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFiveMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimeOutThirty, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimeOutOne, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTimeOutReset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnTimeOutReset.getAccessibleContext().setAccessibleName("btnTimeOutReset");
        btnFiveMinutes.getAccessibleContext().setAccessibleName("btnStart");
        btnTimeOutThirty.getAccessibleContext().setAccessibleName("btnTimeOutThirty");
        btnTimeOutOne.getAccessibleContext().setAccessibleName("btnTimeOutOne");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnLessScoreTeamA.setText("-1");
        btnLessScoreTeamA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessScoreTeamAActionPerformed(evt);
            }
        });

        btnAddScoreTeamA.setText("+1");
        btnAddScoreTeamA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddScoreTeamAActionPerformed(evt);
            }
        });
        btnAddScoreTeamA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAddScoreTeamAKeyPressed(evt);
            }
        });

        lessSetWonTeamA.setText("-1");
        lessSetWonTeamA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessSetWonTeamAActionPerformed(evt);
            }
        });

        btnAddSetWonTeamA.setText("+1");
        btnAddSetWonTeamA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSetWonTeamAActionPerformed(evt);
            }
        });

        teamASetsWon.setFont(new java.awt.Font("Digital-7 Mono", 1, 50)); // NOI18N
        teamASetsWon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teamASetsWon.setText("0");
        teamASetsWon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        teamASetsWon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        teamAPicture.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout teamAPictureLayout = new javax.swing.GroupLayout(teamAPicture);
        teamAPicture.setLayout(teamAPictureLayout);
        teamAPictureLayout.setHorizontalGroup(
            teamAPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teamApictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );
        teamAPictureLayout.setVerticalGroup(
            teamAPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teamApictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SCORE");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SETS WON");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtTeamAName.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        txtTeamAName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTeamAName.setText("TEAM A");
        txtTeamAName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamANameActionPerformed(evt);
            }
        });
        txtTeamAName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                changeName(evt);
            }
        });

        txtTeamAScore.setFont(new java.awt.Font("Digital-7 Mono", 1, 50)); // NOI18N
        txtTeamAScore.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTeamAScore.setText("0");
        txtTeamAScore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTeamAScore.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTeamAScore.setEnabled(false);

        insertTeamApicture.setText("Insert picture");
        insertTeamApicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertTeamApictureActionPerformed(evt);
            }
        });

        removePicTeamA.setText("Remove");
        removePicTeamA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePicTeamAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(teamAPicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(lessSetWonTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teamASetsWon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddSetWonTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(insertTeamApicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTeamAName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnLessScoreTeamA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTeamAScore)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddScoreTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(removePicTeamA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teamAPicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertTeamApicture, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removePicTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTeamAName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTeamAScore, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLessScoreTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddScoreTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teamASetsWon, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lessSetWonTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddSetWonTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btnLessScoreTeamA.getAccessibleContext().setAccessibleName("btnLessScoreTeamA");
        btnAddScoreTeamA.getAccessibleContext().setAccessibleName("btnAddScoreTeamA");
        lessSetWonTeamA.getAccessibleContext().setAccessibleName("lessSetWonTeamA");
        btnAddSetWonTeamA.getAccessibleContext().setAccessibleName("btnAddSetWonTeamA");
        teamASetsWon.getAccessibleContext().setAccessibleName("teamASetsWon");
        txtTeamAName.getAccessibleContext().setAccessibleName("txtTeamAName");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SERVING");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnTeamAService.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        btnTeamAService.setText("<");
        btnTeamAService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeamAServiceActionPerformed(evt);
            }
        });

        btnTeamBService.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        btnTeamBService.setText(">");
        btnTeamBService.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTeamBService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeamBServiceActionPerformed(evt);
            }
        });

        btnNoneService.setText("None");
        btnNoneService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoneServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTeamAService, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNoneService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTeamBService, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNoneService, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTeamAService, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTeamBService, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnTeamAService.getAccessibleContext().setAccessibleName("btnTeamAService");
        btnTeamBService.getAccessibleContext().setAccessibleName("btnTeamBService");
        btnNoneService.getAccessibleContext().setAccessibleName("btnNoneService");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        oneTimeOutTeamA.setText("                 ");
        oneTimeOutTeamA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneTimeOutTeamAActionPerformed(evt);
            }
        });

        twoTimeOutTeamA.setText("                 ");
        twoTimeOutTeamA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoTimeOutTeamAActionPerformed(evt);
            }
        });

        oneTimeOutTeamB.setText("                   ");
        oneTimeOutTeamB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneTimeOutTeamBActionPerformed(evt);
            }
        });

        twoTimeOutTeamB.setText("                  ");
        twoTimeOutTeamB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoTimeOutTeamBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Time out left");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oneTimeOutTeamA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(twoTimeOutTeamA)
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(twoTimeOutTeamB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oneTimeOutTeamB)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(oneTimeOutTeamA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twoTimeOutTeamA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(twoTimeOutTeamB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oneTimeOutTeamB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        teamBPicture.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout teamBPictureLayout = new javax.swing.GroupLayout(teamBPicture);
        teamBPicture.setLayout(teamBPictureLayout);
        teamBPictureLayout.setHorizontalGroup(
            teamBPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teamBpictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        teamBPictureLayout.setVerticalGroup(
            teamBPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teamBpictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SCORE");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtteamBScore.setFont(new java.awt.Font("Digital-7 Mono", 1, 50)); // NOI18N
        txtteamBScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtteamBScore.setText("0");
        txtteamBScore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtteamBScore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtteamBSetsWon.setFont(new java.awt.Font("Digital-7 Mono", 1, 50)); // NOI18N
        txtteamBSetsWon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtteamBSetsWon.setText("0");
        txtteamBSetsWon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtteamBSetsWon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("SETS WON");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAddScoreTeamB.setText("+1");
        btnAddScoreTeamB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddScoreTeamBActionPerformed(evt);
            }
        });

        btnAddSetsWonTeamB.setText("+1");
        btnAddSetsWonTeamB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSetsWonTeamBActionPerformed(evt);
            }
        });

        btnLessSetsWonTeamB.setText("-1");
        btnLessSetsWonTeamB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLessSetsWonTeamBActionPerformed(evt);
            }
        });

        btnlessScoreTeamB.setText("-1");
        btnlessScoreTeamB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlessScoreTeamBActionPerformed(evt);
            }
        });

        txtTeamBName.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        txtTeamBName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTeamBName.setText("TEAM B");
        txtTeamBName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamBNameActionPerformed(evt);
            }
        });
        txtTeamBName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                changeNameOnKeyPress(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                changeNameB(evt);
            }
        });

        insertTeamBPicture.setText("Insert picture");
        insertTeamBPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertTeamBPictureActionPerformed(evt);
            }
        });

        removePicTeamB.setText("Remove");
        removePicTeamB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePicTeamBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnlessScoreTeamB, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(btnLessSetsWonTeamB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtteamBScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtteamBSetsWon, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddScoreTeamB, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(btnAddSetsWonTeamB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(teamBPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTeamBName)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 65, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(insertTeamBPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(removePicTeamB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(teamBPicture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertTeamBPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removePicTeamB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTeamBName, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlessScoreTeamB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddScoreTeamB, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtteamBScore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtteamBSetsWon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLessSetsWonTeamB, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddSetsWonTeamB, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        txtteamBScore.getAccessibleContext().setAccessibleName("teamBScore");
        txtteamBSetsWon.getAccessibleContext().setAccessibleName("teamBSetsWon");
        btnAddScoreTeamB.getAccessibleContext().setAccessibleName("btnAddScoreTeamB");
        btnAddSetsWonTeamB.getAccessibleContext().setAccessibleName("btnAddSetsWonTeamB");
        btnLessSetsWonTeamB.getAccessibleContext().setAccessibleName("btnLessSetsWonTeamB");
        btnlessScoreTeamB.getAccessibleContext().setAccessibleName("btnlessScoreTeamB");

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuzzer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuzzer, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btnBuzzer.getAccessibleContext().setAccessibleName("btnBuzzer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int sf=60;
int mf=4;
int secondsOfFIve = 300;


boolean fiveMinutes = false;
boolean oneMinutes = false;
boolean thirtySeconds = false;

    private void btnFiveMinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveMinutesActionPerformed
        // TODO add your handling code here:
        

                   tsf = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                    
                    
                     if(secondsOfFIve==300){
                        lblMinute.setText(String.valueOf("5"));
                        mainScoreBoard.Instance.minutes.setText(String.valueOf("5"));

                        
                    } 
                     else if(secondsOfFIve==299){
                     lblMinute.setText(String.valueOf("4"));
                     mainScoreBoard.Instance.minutes.setText(String.valueOf("4"));


                     }
                     
                     else if(secondsOfFIve==239){
                     lblMinute.setText(String.valueOf("3"));
                      mainScoreBoard.Instance.minutes.setText(String.valueOf("3"));


                     }
                      else if(secondsOfFIve==179){
                     lblMinute.setText(String.valueOf("2"));
                      mainScoreBoard.Instance.minutes.setText(String.valueOf("2"));

                     }
                      else if(secondsOfFIve==119){
                     lblMinute.setText(String.valueOf("1"));
                     mainScoreBoard.Instance.minutes.setText(String.valueOf("1"));


                     }
                      else if(secondsOfFIve==59){
                     lblMinute.setText(String.valueOf("0"));
                     mainScoreBoard.Instance.minutes.setText(String.valueOf("0"));


                     }
                 
                     if(secondsOfFIve==0 && sf==0){
                            tsf.stop();
                            sf=60;
                            mf=4;
                            secondsOfFIve = 300;
                            fiveMinutes = false;
                            
                             try {
    
   Path path = Paths.get("buzzer.wav");
   String realPath = path.toAbsolutePath().toString();
//   System.out.println(realPath.replace("\\", "/"));
   
   String pathreal = realPath.replace("\\", "/");
   String pathreal2 = pathreal.replace("/buzzer.wav", "/src/main/java/volleyballScoreBoard/buzzer.wav");
String pathreal3 = "C:/GPIVolleyBallScoringBoard/buzzer.wav";
   

   
//   src\main\java\volleyballScoreBoard
   System.out.println(pathreal2);
   File wavFile = new File(pathreal3);
    Clip clip = AudioSystem.getClip();
//    System.out.println("\n[Path] : " + path.toAbsolutePath());
    
//    System.out.println(realPath.replace("\\", "/"));
    
    clip.open(AudioSystem.getAudioInputStream(wavFile));
    clip.start();
} catch (Exception ee) {
    System.out.println(ee);
}

                     }
                     
                    secondsOfFIve--;
                                                    

                  if(sf<10){
                 lblSeconds.setText(String.valueOf("0"+sf));
                 mainScoreBoard.Instance.seconds.setText(String.valueOf("0"+sf));


                  }
                  else if(sf==60){
                 lblSeconds.setText(String.valueOf("00"));
                 mainScoreBoard.Instance.seconds.setText(String.valueOf("00"));

                  }
                  else{
                 lblSeconds.setText(String.valueOf(sf));
                 mainScoreBoard.Instance.seconds.setText(String.valueOf(sf));

                  }
                              

                  if(sf==0){
//                    tsf.stop();
                    sf=60;
                } 
                sf--;
               
            }
        });

   tsf.start();
   fiveMinutes = true;

//      mif.start();
//            mifsec.start();


      
    }//GEN-LAST:event_btnFiveMinutesActionPerformed

    private void btnTeamAServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeamAServiceActionPerformed
        // TODO add your handling code here:
        mainScoreBoard.Instance.teamaserve.setForeground(Color.RED);
                mainScoreBoard.Instance.teambserve.setForeground(Color.GRAY);

    }//GEN-LAST:event_btnTeamAServiceActionPerformed

    private void txtTeamBNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamBNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamBNameActionPerformed

    private void btnAddScoreTeamAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddScoreTeamAActionPerformed
        // TODO add your handling code here:
        int teamAScore = Integer.parseInt(txtTeamAScore.getText());
        teamAScore++;
        txtTeamAScore.setText(String.valueOf(teamAScore));
        mainScoreBoard.Instance.teamascore.setText(String.valueOf(teamAScore));
//        this.addKeyListener(kHandler);

    }//GEN-LAST:event_btnAddScoreTeamAActionPerformed

    private void btnLessScoreTeamAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessScoreTeamAActionPerformed
        // TODO add your handling code here:
             int teamAScore = Integer.parseInt(txtTeamAScore.getText());
        teamAScore--;
        txtTeamAScore.setText(String.valueOf(teamAScore));
        mainScoreBoard.Instance.teamascore.setText(String.valueOf(teamAScore));

      
    }//GEN-LAST:event_btnLessScoreTeamAActionPerformed

    private void btnAddSetWonTeamAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSetWonTeamAActionPerformed
        // TODO add your handling code here:
        
                int teamASetWon = Integer.parseInt(teamASetsWon.getText());
        teamASetWon++;
        teamASetsWon.setText(String.valueOf(teamASetWon));
                mainScoreBoard.Instance.teamaset.setText(String.valueOf(teamASetWon));

    }//GEN-LAST:event_btnAddSetWonTeamAActionPerformed

    private void lessSetWonTeamAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessSetWonTeamAActionPerformed
        // TODO add your handling code here:
                        int teamASetWon = Integer.parseInt(teamASetsWon.getText());
        teamASetWon--;
        teamASetsWon.setText(String.valueOf(teamASetWon));
                        mainScoreBoard.Instance.teamaset.setText(String.valueOf(teamASetWon));

    }//GEN-LAST:event_lessSetWonTeamAActionPerformed

    private void btnAddScoreTeamBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddScoreTeamBActionPerformed
        // TODO add your handling code here:
         int teamBScore = Integer.parseInt(txtteamBScore.getText());
        teamBScore++;
        txtteamBScore.setText(String.valueOf(teamBScore));
                mainScoreBoard.Instance.teambscore.setText(String.valueOf(teamBScore));

    }//GEN-LAST:event_btnAddScoreTeamBActionPerformed

    private void btnlessScoreTeamBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlessScoreTeamBActionPerformed
        // TODO add your handling code here:
                 int teamBScore = Integer.parseInt(txtteamBScore.getText());
        teamBScore--;
        txtteamBScore.setText(String.valueOf(teamBScore));
       mainScoreBoard.Instance.teambscore.setText(String.valueOf(teamBScore));

    }//GEN-LAST:event_btnlessScoreTeamBActionPerformed

    private void btnAddSetsWonTeamBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSetsWonTeamBActionPerformed
        // TODO add your handling code here:
                 int teamBSetsWon = Integer.parseInt(txtteamBSetsWon.getText());
        teamBSetsWon++;
        txtteamBSetsWon.setText(String.valueOf(teamBSetsWon));
                        mainScoreBoard.Instance.teambset.setText(String.valueOf(teamBSetsWon));

    }//GEN-LAST:event_btnAddSetsWonTeamBActionPerformed

    private void btnLessSetsWonTeamBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLessSetsWonTeamBActionPerformed
        // TODO add your handling code here:
          int teamBSetsWon = Integer.parseInt(txtteamBSetsWon.getText());
        teamBSetsWon--;
        txtteamBSetsWon.setText(String.valueOf(teamBSetsWon));
                                mainScoreBoard.Instance.teambset.setText(String.valueOf(teamBSetsWon));

    }//GEN-LAST:event_btnLessSetsWonTeamBActionPerformed

    private void changeName(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_changeName
        // TODO add your handling code here:
                                        mainScoreBoard.Instance.teamaname.setText(String.valueOf(txtTeamAName.getText()));

        
    }//GEN-LAST:event_changeName

    private void changeNameB(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_changeNameB
        // TODO add your handling code here:
                                                mainScoreBoard.Instance.teambname.setText(String.valueOf(txtTeamBName.getText()));

    }//GEN-LAST:event_changeNameB

    private void changeNameOnKeyPress(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_changeNameOnKeyPress
        // TODO add your handling code here:
    }//GEN-LAST:event_changeNameOnKeyPress

    private void btnTeamBServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeamBServiceActionPerformed
        // TODO add your handling code here:
        mainScoreBoard.Instance.teamaserve.setForeground(Color.GRAY);
                mainScoreBoard.Instance.teambserve.setForeground(Color.RED);
    }//GEN-LAST:event_btnTeamBServiceActionPerformed

    private void btnNoneServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoneServiceActionPerformed
        // TODO add your handling code here:
             mainScoreBoard.Instance.teamaserve.setForeground(Color.BLACK);
                mainScoreBoard.Instance.teambserve.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnNoneServiceActionPerformed
       
    int k=30;


    private void btnTimeOutThirtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimeOutThirtyActionPerformed
        // TODO add your handling code here:
           thirtySeconds = true;

           thirty = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               
      if(k<10){
                 lblSeconds.setText(String.valueOf("0"+k));
                  mainScoreBoard.Instance.seconds.setText(String.valueOf("0"+k));


                  }
      else{
       lblSeconds.setText(String.valueOf(k));
                mainScoreBoard.Instance.seconds.setText(String.valueOf(k));
      }
                if(k==0){
                    thirty.stop();
                    thirtySeconds = false;

                    k=30;
                    try {
    
   Path path = Paths.get("buzzer.wav");
   String realPath = path.toAbsolutePath().toString();
//   System.out.println(realPath.replace("\\", "/"));
   
   String pathreal = realPath.replace("\\", "/");
   String pathreal2 = pathreal.replace("/buzzer.wav", "/src/main/java/volleyballScoreBoard/buzzer.wav");
String pathreal3 = "C:/GPIVolleyBallScoringBoard/buzzer.wav";
   

   
//   src\main\java\volleyballScoreBoard
   System.out.println(pathreal3);
   File wavFile = new File(pathreal3);
    Clip clip = AudioSystem.getClip();
//    System.out.println("\n[Path] : " + path.toAbsolutePath());
    
//    System.out.println(realPath.replace("\\", "/"));
    
    clip.open(AudioSystem.getAudioInputStream(wavFile));
    clip.start();
} catch (Exception ee) {
    System.out.println(ee);
}
//                    thirtySeconds = false;
                }
                k--;
            }
        });
            
   thirty.start();
      

    }//GEN-LAST:event_btnTimeOutThirtyActionPerformed
int s=60;
int m=1;

    private void btnTimeOutOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimeOutOneActionPerformed
        // TODO add your handling code here:
                         lblSeconds.setText(String.valueOf("00"));
                         mainScoreBoard.Instance.seconds.setText(String.valueOf("00"));

                   ts = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                    s--;
                  if(s<10){
                 lblSeconds.setText(String.valueOf("0"+s));
                  mainScoreBoard.Instance.seconds.setText(String.valueOf("0"+s));


                  }
                  else{
                 lblSeconds.setText(String.valueOf(s));
                 mainScoreBoard.Instance.seconds.setText(String.valueOf(s));


                  }
                              

                  if(s==0){
                    ts.stop();
                    try {
    
   Path path = Paths.get("buzzer.wav");
   String realPath = path.toAbsolutePath().toString();
//   System.out.println(realPath.replace("\\", "/"));
   
   String pathreal = realPath.replace("\\", "/");
   String pathreal2 = pathreal.replace("/buzzer.wav", "/src/main/java/volleyballScoreBoard/buzzer.wav");
String pathreal3 = "C:/GPIVolleyBallScoringBoard/buzzer.wav";
   

   
//   src\main\java\volleyballScoreBoard
   System.out.println(pathreal2);
   File wavFile = new File(pathreal3);
    Clip clip = AudioSystem.getClip();
//    System.out.println("\n[Path] : " + path.toAbsolutePath());
    
//    System.out.println(realPath.replace("\\", "/"));
    
    clip.open(AudioSystem.getAudioInputStream(wavFile));
    clip.start();
} catch (Exception ee) {
    System.out.println(ee);
}
                    s=60;
                    oneMinutes = false;
                } 
                
               
            }
        });
lblMinute.setText(String.valueOf(m));
mainScoreBoard.Instance.minutes.setText(String.valueOf(m));

      mi = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            
                m--;

                lblMinute.setText(String.valueOf(m));
                mainScoreBoard.Instance.minutes.setText(String.valueOf(m));

                                    if(m==0){
                    mi.stop();
                    m=1;
                }  

            }
        });

   ts.start();
   mi.start();
      oneMinutes = true;


    }//GEN-LAST:event_btnTimeOutOneActionPerformed

    private void btnTimeOutResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimeOutResetActionPerformed
        // TODO add your handling code here:

if(thirtySeconds==true){
    thirty.stop();
    k=30;
    thirtySeconds=false;
}
else if(oneMinutes==true){
    ts.stop();
   mi.stop();
    s=60;
    m=1;
    oneMinutes=false;
    
}
else if(fiveMinutes==true){
          tsf.stop();
          sf=60;
          mf=4;
          secondsOfFIve = 300;
fiveMinutes = false;
}
                        lblMinute.setText(String.valueOf("0"));
                        lblSeconds.setText(String.valueOf("00"));
                        mainScoreBoard.Instance.minutes.setText(String.valueOf("0"));
                        mainScoreBoard.Instance.seconds.setText(String.valueOf("00"));



    }//GEN-LAST:event_btnTimeOutResetActionPerformed

    private void oneTimeOutTeamAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneTimeOutTeamAActionPerformed
        // TODO add your handling code here:
        String bgcolor1 = oneTimeOutTeamA.getBackground().toString();

                             System.out.print("orayt: "+bgcolor1);
                             if("java.awt.Color[r=255,g=255,b=255]".equals(bgcolor1)){
//                             System.out.print("orayt");
                                 oneTimeOutTeamA.setBackground(Color.ORANGE);
                     
                     mainScoreBoard.Instance.onetimeoutteama.setBackground(Color.ORANGE);
                             }
                             else{
                                oneTimeOutTeamA.setBackground(Color.WHITE);
                     
                                    mainScoreBoard.Instance.onetimeoutteama.setBackground(Color.WHITE);

                             }

                    

    }//GEN-LAST:event_oneTimeOutTeamAActionPerformed

    private void twoTimeOutTeamAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoTimeOutTeamAActionPerformed
        // TODO add your handling code here:
      String bgcolor1 = twoTimeOutTeamA.getBackground().toString();

                             System.out.print("orayt: "+bgcolor1);
                             if("java.awt.Color[r=255,g=255,b=255]".equals(bgcolor1)){
//                             System.out.print("orayt");
                                 twoTimeOutTeamA.setBackground(Color.ORANGE);
                     
                     mainScoreBoard.Instance.twotimeoutteama.setBackground(Color.ORANGE);
                             }
                             else{
                                twoTimeOutTeamA.setBackground(Color.WHITE);
                     
                                    mainScoreBoard.Instance.twotimeoutteama.setBackground(Color.WHITE);

                             }

    }//GEN-LAST:event_twoTimeOutTeamAActionPerformed

    private void oneTimeOutTeamBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneTimeOutTeamBActionPerformed
        // TODO add your handling code here:
             String bgcolor1 = oneTimeOutTeamB.getBackground().toString();

                             System.out.print("orayt: "+bgcolor1);
                             if("java.awt.Color[r=255,g=255,b=255]".equals(bgcolor1)){
//                             System.out.print("orayt");
                                 oneTimeOutTeamB.setBackground(Color.ORANGE);
                     
                     mainScoreBoard.Instance.onetimeoutteamb.setBackground(Color.ORANGE);
                             }
                             else{
                                oneTimeOutTeamB.setBackground(Color.WHITE);
                     
                                    mainScoreBoard.Instance.onetimeoutteamb.setBackground(Color.WHITE);

                             }


    }//GEN-LAST:event_oneTimeOutTeamBActionPerformed

    private void twoTimeOutTeamBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoTimeOutTeamBActionPerformed
        // TODO add your handling code here:
              String bgcolor1 = twoTimeOutTeamB.getBackground().toString();

                             System.out.print("orayt: "+bgcolor1);
                             if("java.awt.Color[r=255,g=255,b=255]".equals(bgcolor1)){
//                             System.out.print("orayt");
                                 twoTimeOutTeamB.setBackground(Color.ORANGE);
                     
                     mainScoreBoard.Instance.twotimeoutteamb.setBackground(Color.ORANGE);
                             }
                             else{
                                twoTimeOutTeamB.setBackground(Color.WHITE);
                     
                                    mainScoreBoard.Instance.twotimeoutteamb.setBackground(Color.WHITE);

                             }


    }//GEN-LAST:event_twoTimeOutTeamBActionPerformed

    private void txtTeamANameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamANameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamANameActionPerformed

    private void insertTeamApictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertTeamApictureActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        
  if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
//            JOptionPane.showMessageDialog(null, selectedImagePath);
            //Display Image
            
            ImageIcon ii = new ImageIcon(selectedImagePath);
            // REsize immage
            Image image = ii.getImage().getScaledInstance(teamApictureLabel.getWidth(), teamApictureLabel.getHeight(), Image.SCALE_SMOOTH);
            Image imageM = ii.getImage().getScaledInstance(mainScoreBoard.Instance.teamAPictureLabel.getWidth(), mainScoreBoard.Instance.teamAPictureLabel.getHeight(), Image.SCALE_SMOOTH);

            teamApictureLabel.setIcon(new ImageIcon(image));
            mainScoreBoard.Instance.teamAPictureLabel.setIcon(new ImageIcon(imageM));
            insertTeamApicture.setVisible(false);
            removePicTeamA.setVisible(true);

        
  }
    }//GEN-LAST:event_insertTeamApictureActionPerformed

    private void insertTeamBPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertTeamBPictureActionPerformed
              // TODO add your handling code here:
        JFileChooser browseImageFile = new JFileChooser();
        
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        
  if(showOpenDialogue == JFileChooser.APPROVE_OPTION){
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
//            JOptionPane.showMessageDialog(null, selectedImagePath);
            //Display Image
            
            ImageIcon ii = new ImageIcon(selectedImagePath);
            // REsize immage
            Image image = ii.getImage().getScaledInstance(teamBpictureLabel.getWidth(), teamBpictureLabel.getHeight(), Image.SCALE_SMOOTH);
            Image imageM = ii.getImage().getScaledInstance(mainScoreBoard.Instance.teamBPictureLabel.getWidth(), mainScoreBoard.Instance.teamBPictureLabel.getHeight(), Image.SCALE_SMOOTH);

            teamBpictureLabel.setIcon(new ImageIcon(image));
            mainScoreBoard.Instance.teamBPictureLabel.setIcon(new ImageIcon(imageM));
   insertTeamBPicture.setVisible(false);
            removePicTeamB.setVisible(true);
        
  }
    }//GEN-LAST:event_insertTeamBPictureActionPerformed

    private void btnBuzzerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuzzerActionPerformed
        // TODO add your handling code here:
        try {
    
   Path path = Paths.get("buzzer.wav");
   String realPath = path.toAbsolutePath().toString();
//   System.out.println(realPath.replace("\\", "/"));
   
   String pathreal = realPath.replace("\\", "/");
   String pathreal2 = pathreal.replace("/buzzer.wav", "/src/main/java/volleyballScoreBoard/buzzer.wav");
String pathreal3 = "C:/GPIVolleyBallScoringBoard/buzzer.wav";
   

   
//   src\main\java\volleyballScoreBoard
   System.out.println(pathreal2);
   File wavFile = new File(pathreal3);
    Clip clip = AudioSystem.getClip();
//    System.out.println("\n[Path] : " + path.toAbsolutePath());
    
//    System.out.println(realPath.replace("\\", "/"));
    
    clip.open(AudioSystem.getAudioInputStream(wavFile));
    clip.start();
} catch (Exception e) {
    System.out.println(e);
}
    }//GEN-LAST:event_btnBuzzerActionPerformed

    private void removePicTeamAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePicTeamAActionPerformed
        // TODO add your handling code here:
         teamApictureLabel.setIcon(new ImageIcon());
            mainScoreBoard.Instance.teamAPictureLabel.setIcon(new ImageIcon());
         insertTeamApicture.setVisible(true);
        removePicTeamA.setVisible(false);


    }//GEN-LAST:event_removePicTeamAActionPerformed

    private void removePicTeamBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePicTeamBActionPerformed
        // TODO add your handling code here:
         teamBpictureLabel.setIcon(new ImageIcon());
            mainScoreBoard.Instance.teamBPictureLabel.setIcon(new ImageIcon());
         insertTeamBPicture.setVisible(true);
        removePicTeamB.setVisible(false);
    }//GEN-LAST:event_removePicTeamBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

 
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to close this application?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
                    System.exit(0);  
        }
  
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddScoreTeamAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAddScoreTeamAKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAddScoreTeamAKeyPressed

    private void jPanel6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel6KeyPressed
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
            java.util.logging.Logger.getLogger(controlside.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(controlside.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(controlside.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(controlside.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new controlside().setVisible(true);
                
            }
        });
//                        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddScoreTeamA;
    private javax.swing.JButton btnAddScoreTeamB;
    private javax.swing.JButton btnAddSetWonTeamA;
    private javax.swing.JButton btnAddSetsWonTeamB;
    private javax.swing.JButton btnBuzzer;
    private javax.swing.JButton btnFiveMinutes;
    private javax.swing.JButton btnLessScoreTeamA;
    private javax.swing.JButton btnLessSetsWonTeamB;
    private javax.swing.JButton btnNoneService;
    private javax.swing.JButton btnTeamAService;
    private javax.swing.JButton btnTeamBService;
    private javax.swing.JButton btnTimeOutOne;
    private javax.swing.JButton btnTimeOutReset;
    private javax.swing.JButton btnTimeOutThirty;
    private javax.swing.JButton btnlessScoreTeamB;
    private javax.swing.JButton insertTeamApicture;
    private javax.swing.JButton insertTeamBPicture;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblMinute;
    private javax.swing.JLabel lblSeconds;
    private javax.swing.JButton lessSetWonTeamA;
    private javax.swing.JButton oneTimeOutTeamA;
    private javax.swing.JButton oneTimeOutTeamB;
    private javax.swing.JButton removePicTeamA;
    private javax.swing.JButton removePicTeamB;
    private javax.swing.JPanel teamAPicture;
    private javax.swing.JLabel teamASetsWon;
    private javax.swing.JLabel teamApictureLabel;
    private javax.swing.JPanel teamBPicture;
    private javax.swing.JLabel teamBpictureLabel;
    private javax.swing.JLabel timerControl1;
    private javax.swing.JButton twoTimeOutTeamA;
    private javax.swing.JButton twoTimeOutTeamB;
    private javax.swing.JTextField txtTeamAName;
    public javax.swing.JTextField txtTeamAScore;
    private javax.swing.JTextField txtTeamBName;
    public javax.swing.JLabel txtteamBScore;
    private javax.swing.JLabel txtteamBSetsWon;
    // End of variables declaration//GEN-END:variables



}
