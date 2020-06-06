import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.Clip;
import java.awt.event.MouseEvent;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Vaibhav Sikarwar
 */
public class Menu extends JPanel {

    /**
     * Creates new form Menu
     */
    private Image bgImage;
    private SoundEffect menuBgm = new SoundEffect("./src/bgms/menuBgm.wav");
    private Image AdventureImage;
    private Image AdventureShadow;
    private Image MiniImage;
    private Image MiniShadow;

    public Menu() {
        initComponents();
        setSize(1012, 785);
        menuBgm.prepare();
        menuBgm.player.loop(Clip.LOOP_CONTINUOUSLY);
        bgImage = new ImageIcon(this.getClass().getResource("images/resources/images/interface/Surface.jpg")).getImage();
        AdventureImage = new ImageIcon(this.getClass().getResource(
                "images\\resources\\images\\interface\\Adventure_Default.png")).getImage();
        AdventureShadow = new ImageIcon((this.getClass().getResource(
                "images\\resources\\images\\interface\\SelectorScreen_Shadow_Adventure.png"))).getImage();
        MiniImage = new ImageIcon(this.getClass().getResource(
                "images\\resources\\images\\interface\\Mini_Default.png")).getImage();
        MiniShadow = new ImageIcon(this.getClass().getResource(
                "images\\resources\\images\\interface\\SelectorScreen_Shadow_Challenge.png")).getImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bgImage, 0, 0, null);
        g.drawImage(AdventureShadow, 523, 103, 392, 160, null);
        g.drawImage(AdventureImage, 520, 100, 380, 150, null);
        g.drawImage(MiniShadow, 533, 243, 360, 150, null);
        g.drawImage(MiniImage, 530, 232, 350, 150, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();

        setPreferredSize(new java.awt.Dimension(1012, 785));

        jPanel1.setOpaque(false);
        jPanel2.setOpaque(false);
        jPanel3.setOpaque(false);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jPanel1MousePressed(evt);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                jPanel3MousePressed(evt);
            }

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 387, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 105, Short.MAX_VALUE)
        );

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 72, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 357, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        GroupLayout.ParallelGroup BtnGroup01 = layout.createParallelGroup()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30));

        GroupLayout.SequentialGroup SGroup1 = layout.createSequentialGroup().addContainerGap(523, Short.MAX_VALUE)
                .addGroup(BtnGroup01)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30);
        GroupLayout.SequentialGroup SGroup2 = layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, SGroup1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(SGroup2)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(MouseEvent event) {
        getGraphics().drawImage(bgImage, 0, 0, null);
        getGraphics().drawImage(AdventureShadow, 523, 103, 392, 160, null);
        getGraphics().drawImage(MiniShadow, 533, 243, 360, 150, null);
        getGraphics().drawImage(MiniImage, 530, 232, 350, 150, null);
        getGraphics().drawImage(AdventureImage, 527, 107, 380, 150, null);

    }

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        paintComponent(getGraphics());
        menuBgm.player.stop();
        GameWindow.begin();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseEntered(MouseEvent evt) {
        AdventureImage = new ImageIcon(this.getClass().getResource(
                "images\\resources\\images\\interface\\Adventure_Highlight.png")).getImage();
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        repaint();
    }

    private void jPanel1MouseExited(MouseEvent evt) {
        AdventureImage = new ImageIcon(this.getClass().getResource(
                "images\\resources\\images\\interface\\Adventure_Default.png")).getImage();
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        repaint();
    }

    private void jPanel2MouseClicked(MouseEvent e) {
        System.out.println("jPanel2 clicked");
        System.exit(0);
    }

    private void jPanel2MouseEntered(MouseEvent e) {
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void jPanel2MouseExited(MouseEvent e) {
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }

    private void jPanel3MousePressed(MouseEvent event) {
        getGraphics().drawImage(bgImage, 0, 0, null);
        getGraphics().drawImage(AdventureShadow, 523, 103, 392, 160, null);
        getGraphics().drawImage(MiniShadow, 533, 243, 360, 150, null);
        getGraphics().drawImage(MiniImage, 535, 235, 350, 150, null);
        getGraphics().drawImage(AdventureImage, 520, 100, 380, 150, null);

    }

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        paintComponent(getGraphics());
        //****write mini_mode launcher hear
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel3MouseEntered(MouseEvent evt) {
        MiniImage = new ImageIcon(this.getClass().getResource(
                "images\\resources\\images\\interface\\Mini_Highlight.png")).getImage();
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        repaint();
    }

    private void jPanel3MouseExited(MouseEvent evt) {
        MiniImage = new ImageIcon(this.getClass().getResource(
                "images\\resources\\images\\interface\\Mini_Default.png")).getImage();
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;//Adventure Mode
    private JPanel jPanel2;//Exit Button
    private JPanel jPanel3;//Mini Mode
    // End of variables declaration//GEN-END:variables
}
