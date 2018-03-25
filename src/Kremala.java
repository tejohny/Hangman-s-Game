

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author john
 */
public class Kremala extends javax.swing.JFrame {

    public Kremala() {
        initComponents();
        jPanel1.setVisible(false);
        jPanel3.setVisible(false);
        jPanel2.setVisible(true);
        disabled();
        setResizable(false);
        Clap1 = new File("soundtrack.WAV");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
           try{
            clip1 = AudioSystem.getClip();
            clip1.open(AudioSystem.getAudioInputStream(Clap1));
            clip1.start();
            clip1.loop(Clip.LOOP_CONTINUOUSLY);
            
        }catch(Exception e){
            
        }
    }       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        checkbox = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        onoff = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        onoff2 = new javax.swing.JButton();
        checkbox2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        y = new javax.swing.JButton();
        x = new javax.swing.JButton();
        w = new javax.swing.JButton();
        d = new javax.swing.JButton();
        c = new javax.swing.JButton();
        b = new javax.swing.JButton();
        a = new javax.swing.JButton();
        i = new javax.swing.JButton();
        hidden = new javax.swing.JLabel();
        j = new javax.swing.JButton();
        z = new javax.swing.JButton();
        g = new javax.swing.JButton();
        h = new javax.swing.JButton();
        r = new javax.swing.JButton();
        e = new javax.swing.JButton();
        f = new javax.swing.JButton();
        l = new javax.swing.JButton();
        k = new javax.swing.JButton();
        n = new javax.swing.JButton();
        m = new javax.swing.JButton();
        o = new javax.swing.JButton();
        p = new javax.swing.JButton();
        q = new javax.swing.JButton();
        s = new javax.swing.JButton();
        t = new javax.swing.JButton();
        u = new javax.swing.JButton();
        v = new javax.swing.JButton();
        start = new javax.swing.JButton();
        lathi = new javax.swing.JLabel();
        telikomin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        quit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        eikona = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("κρεμαλα");
        setBackground(java.awt.SystemColor.activeCaption);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(1280, 800));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 790));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(84, 84, 84));
        jPanel3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.setMaximumSize(new java.awt.Dimension(1280, 800));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(1280, 800));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("BACKGROUND MUSIC :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        checkbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/checked.png"))); // NOI18N
        jPanel3.add(checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 170, 140));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        back.setForeground(new java.awt.Color(255, 51, 51));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 190, 90));

        onoff.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        onoff.setText("ON");
        onoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onoffActionPerformed(evt);
            }
        });
        jPanel3.add(onoff, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 130, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("SOUND EFFECTS :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        onoff2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        onoff2.setText("ON");
        onoff2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onoff2ActionPerformed(evt);
            }
        });
        jPanel3.add(onoff2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 140, 80));

        checkbox2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/checked.png"))); // NOI18N
        jPanel3.add(checkbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/options.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1360, 890));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        y.setText("Y");
        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });
        jPanel1.add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        x.setText("X");
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });
        jPanel1.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 40, -1));

        w.setText("W");
        w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wActionPerformed(evt);
            }
        });
        jPanel1.add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        d.setText("D");
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        jPanel1.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 40, -1));

        c.setText("C");
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        jPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 40, -1));

        b.setText("B");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 40, -1));

        a.setText("A");
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, -1));

        i.setText("I");
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });
        jPanel1.add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 40, -1));

        hidden.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        hidden.setText("_____");
        jPanel1.add(hidden, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 500, -1));

        j.setText("J");
        j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActionPerformed(evt);
            }
        });
        jPanel1.add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 40, -1));

        z.setText("Z");
        z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zActionPerformed(evt);
            }
        });
        jPanel1.add(z, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        g.setText("G");
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });
        jPanel1.add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 40, -1));

        h.setText("H");
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });
        jPanel1.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, -1));

        r.setText("R");
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });
        jPanel1.add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 40, -1));

        e.setText("E");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        jPanel1.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 40, -1));

        f.setText("F");
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        jPanel1.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 40, -1));

        l.setText("L");
        l.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lActionPerformed(evt);
            }
        });
        jPanel1.add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 40, -1));

        k.setText("K");
        k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kActionPerformed(evt);
            }
        });
        jPanel1.add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 40, -1));

        n.setText("N");
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });
        jPanel1.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 40, -1));

        m.setText("M");
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        jPanel1.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 40, -1));

        o.setText("O");
        o.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oActionPerformed(evt);
            }
        });
        jPanel1.add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        p.setText("P");
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });
        jPanel1.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 40, -1));

        q.setText("Q");
        q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qActionPerformed(evt);
            }
        });
        jPanel1.add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        s.setText("S");
        s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sActionPerformed(evt);
            }
        });
        jPanel1.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 40, -1));

        t.setText("T");
        t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tActionPerformed(evt);
            }
        });
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 40, -1));

        u.setText("U");
        u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uActionPerformed(evt);
            }
        });
        jPanel1.add(u, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 40, -1));

        v.setText("V");
        v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vActionPerformed(evt);
            }
        });
        jPanel1.add(v, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 40, -1));

        start.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        start.setText("START");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jPanel1.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 200, 90));

        lathi.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jPanel1.add(lathi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 330, 50));

        telikomin.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jPanel1.add(telikomin, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 360, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("MISTAKES :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("WORD :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, -1, -1));

        quit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        quit.setForeground(new java.awt.Color(255, 0, 0));
        quit.setText("QUIT");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });
        jPanel1.add(quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 520, 200, 90));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("RESULT :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 270, 60));

        eikona.setForeground(new java.awt.Color(255, 204, 51));
        eikona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/krem1.jpg"))); // NOI18N
        jPanel1.add(eikona, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2440, 2760));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.setText("PLAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 240, 80));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 240, 80));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton3.setText("OPTIONS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 240, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/logo.jpg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/front.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 790));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
      gemisma('c');
      c.setEnabled(false);
    }//GEN-LAST:event_cActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        gemisma('e');
        e.setEnabled(false);
    }//GEN-LAST:event_eActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
      arxh();
      counter1=0;
      if(soundoff==false)
      {
      clip1.start();
      clip1.loop(Clip.LOOP_CONTINUOUSLY);
      }
    }//GEN-LAST:event_startActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
       gemisma('a');
       a.setEnabled(false);
    }//GEN-LAST:event_aActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
       gemisma('b');
       b.setEnabled(false);
    }//GEN-LAST:event_bActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
       gemisma('d');
       d.setEnabled(false);
    }//GEN-LAST:event_dActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
      gemisma('f');
      f.setEnabled(false);
    }//GEN-LAST:event_fActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        gemisma('g');
        g.setEnabled(false);
    }//GEN-LAST:event_gActionPerformed

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        gemisma('h');
        h.setEnabled(false);
    }//GEN-LAST:event_hActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
     gemisma('i');
     i.setEnabled(false);
    }//GEN-LAST:event_iActionPerformed

    private void jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActionPerformed
        gemisma('j');
        j.setEnabled(false);
    }//GEN-LAST:event_jActionPerformed

    private void kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kActionPerformed
        gemisma('k');
        k.setEnabled(false);
    }//GEN-LAST:event_kActionPerformed

    private void lActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lActionPerformed
        gemisma('l');
        l.setEnabled(false);
    }//GEN-LAST:event_lActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        gemisma('m');
        m.setEnabled(false);
    }//GEN-LAST:event_mActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        gemisma('n');
        n.setEnabled(false);
    }//GEN-LAST:event_nActionPerformed

    private void oActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oActionPerformed
       gemisma('o');
       o.setEnabled(false);
    }//GEN-LAST:event_oActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        gemisma('p');
        p.setEnabled(false);
    }//GEN-LAST:event_pActionPerformed

    private void qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qActionPerformed
        gemisma('q');
        q.setEnabled(false);
    }//GEN-LAST:event_qActionPerformed

    private void sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sActionPerformed
        gemisma('s');
        s.setEnabled(false);
    }//GEN-LAST:event_sActionPerformed

    private void tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tActionPerformed
        gemisma('t');
        t.setEnabled(false);
    }//GEN-LAST:event_tActionPerformed

    private void uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uActionPerformed
       gemisma('u');
       u.setEnabled(false);
    }//GEN-LAST:event_uActionPerformed

    private void vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vActionPerformed
        gemisma('v');
        v.setEnabled(false);
    }//GEN-LAST:event_vActionPerformed

    private void wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wActionPerformed
        gemisma('w');
        w.setEnabled(false);
    }//GEN-LAST:event_wActionPerformed

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
       gemisma('x');
       x.setEnabled(false);
    }//GEN-LAST:event_xActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed
       gemisma('y');
       y.setEnabled(false);
    }//GEN-LAST:event_yActionPerformed

    private void zActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zActionPerformed
       gemisma('z');
       z.setEnabled(false);
    }//GEN-LAST:event_zActionPerformed

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
         gemisma('r');
         r.setEnabled(false);
    }//GEN-LAST:event_rActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jPanel1.setVisible(true);
        jButton3.setEnabled(false);
       jButton1.setEnabled(false);
       jButton2.setEnabled(false);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
         jPanel1.setVisible(false);
         hidden.setText("_____");
         start.setText("START");
         lathi.setText("");
         telikomin.setText("");
         ImageIcon icc = new ImageIcon("src/folder/krem1.jpg");
         eikona.setIcon(icc);
         disabled();
         jButton3.setEnabled(true);
         jButton1.setEnabled(true);
         jButton2.setEnabled(true);
         counter1=0;
         
         if(soundoff==false){
           clip1.start();
           clip1.loop(Clip.LOOP_CONTINUOUSLY);
         }
    }//GEN-LAST:event_quitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jPanel3.setVisible(true);
       jPanel2.setVisible(true);
//       jLabel4.setVisible(false);
       jButton3.setEnabled(false);
       jButton1.setEnabled(false);
       jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        jPanel3.setVisible(false);
        jPanel2.setVisible(true);
        jButton3.setEnabled(true);
       jButton1.setEnabled(true);
       jButton2.setEnabled(true);
    }//GEN-LAST:event_backActionPerformed

    private void onoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onoffActionPerformed
        if(onoff.getText()=="ON"){
            onoff.setText("OFF");
            ImageIcon icc = new ImageIcon("src/folder/unchecked.png");
            checkbox.setIcon(icc);
            soundoff=true;
            try{
               clip1.stop();
                
            } catch(Exception e){
            
            }  
        }
        else if(onoff.getText()=="OFF"){
            onoff.setText("ON");
            ImageIcon icc = new ImageIcon("src/folder/checked.png");
            checkbox.setIcon(icc);
            soundoff=false;
            try{
               clip1.start();
               clip1.loop(Clip.LOOP_CONTINUOUSLY);
            } catch(Exception e){
            
            }  
        }
    }//GEN-LAST:event_onoffActionPerformed

    private void onoff2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onoff2ActionPerformed
       if(onoff2.getText()=="ON"){
            onoff2.setText("OFF");
            ImageIcon icc = new ImageIcon("src/folder/unchecked.png");
            checkbox2.setIcon(icc);
            effectsoff=true;
       }
       else if(onoff2.getText()=="OFF"){
            onoff2.setText("ON");
            ImageIcon icc = new ImageIcon("src/folder/checked.png");
            checkbox2.setIcon(icc);
            effectsoff=false;
       }     
    }//GEN-LAST:event_onoff2ActionPerformed

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
            java.util.logging.Logger.getLogger(Kremala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kremala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kremala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kremala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kremala().setVisible(true);
            }
            
            
        });
    }
    String words[]={"apple","battery","attendant","aeroplane","skyscraper",
    "explanation","fireplace","independent","january","university","exchange",
    "discussion","mathematics","memory","grandmother","constantly","tobacco","shallow",
    "instant","ourselves","graphic","network","multimedia","numeric","software","peripheral",
    "command","keyboard","internet","interactive","hardware","scanner","people","because",
    "familiar","experiment","exercise","television","imagine","christmas","education","japanese",
    "potatoes","composition","freedom","european","swimming","vegetable","sunlight","remarkable","manufacturing",
    "examination","telephone","experience","divorced","frightened","according","according","somewhat",
    "smiling","generally","consequence","satisfied","difference","somebody","miserable","advantage","kindness",
    "particularly","opposite","laughing","situation","condition","especially","afternoon","breakfast","determined"
    ,"otherwise","speech","carriage","repeated","impossible","heaven","gentlemen","thousand","happiness","necessary",
    "entirely","circumstances","feelings","beautiful","knowledge","speaking","occasion","observed","besides"
    ,"across","standing","creature","suddenly","purpose","afterwards","immediately","daughter","beyond","therefore",
    "question","second","yourself","thousand","newspaper","atmosphere","wonderful","transportation","combination","develop"};
    
    //Δηλωση μεταβλητων
    
    int megethos = words.length; //Το μεγεθος του πινακα words
    String hidden1;
    String hidden2;
    String hidden3;
    String mistakes; // String που περιεχει τα λαθη που πατησε ο χρηστης
    int counter1=0; // Ακεραιος που αυξανεται για την εναλλαγη των εικονων του πινακα kremI
    String[] kremI = {"krem2.jpg","krem3.jpg","krem4.jpg","krem5.jpg","krem6.jpg","krem7.jpg","krem8.jpg","krem9.jpg"};
    File Clap1; //Μεταβλητες File,clip για τον backround ηχο
    Clip clip1;
    boolean soundoff=false;  // Μεταβλητες για ελεχγο υπαρξης των ηχων
    boolean effectsoff=false;
    
    
     void arxh(){
        int random =(int)(Math.random() * megethos);
        hidden1 = words[random];  //Εισαγωγη μιας τυχαιας λεξης του πινακα words στο hidden1
        int megethosl=hidden1.length();
        
        hidden.setText(""); //Το κειμενο του label που εμφανιζεται η λεξη το βαζουμε κενο
        String temp =hidden1.charAt(0)+ "";       
        for(int i=0;i<megethosl-1;i++){        
           temp= temp + "-"; 
        }
        hidden.setText(temp); // αφου βρουμε το πρωτο γραμμα της hidden1 ξαναγραφουμε την hidden με το πρωτο γραμμα
                              // και βαζουμε "-" για τα υπολοιπα γραμματα της hidden1 που δεν ξερουμε
        hidden2=temp;   // θα παιρνει τις τιμες της hidden για να μπορουν να γινονται οι καταλληλοι ελεγχοι      
        
        telikomin.setText("");
        enabled();
        start.setText("RESET");
        ImageIcon icc = new ImageIcon("src/folder/krem1.jpg");
        eikona.setIcon(icc);  
        lathi.setText("");
        mistakes="";      
     }
    
     void gemisma(char ch){
         
        hidden3=""; // η hidden θα γινεται ιση με αυτο μετα απο καθε πατημα κουμπιου
     
        for(int i=0;i<hidden1.length();i++){              //ελεγχει αν ταιριαζει το γραμμα
            if(hidden1.charAt(i)==ch){
                hidden3=hidden3 + ch;
                if(effectsoff==false){
                    telikomin.setText("Correct");
                    File Clap = new File("correct.WAV");
                    AudioSystem(Clap);
                }
            }
            else if(hidden1.charAt(i)!=ch && hidden2.charAt(i)=='-'){   //ελεγχει αν εχει παυλα
                hidden3=hidden3 + "-";
                
            }    
           else
                hidden3=hidden3 + hidden2.charAt(i); // αλλιως παιρνει το γραμμα που ηδη υπαρχει
            
        }   
        hidden2=hidden3;
        hidden.setText(hidden2);
        
        checkwin(hidden2);
        lathos(ch);    
     }
    
      void lathos(char ch){
          int counterf=0;
           for(int i=0;i<hidden1.length();i++){
               if(hidden1.charAt(i)==ch){
                 counterf++;
               }
           }    
           if(counterf==0 && counter1<6){
              if(effectsoff==false){
              telikomin.setText("Wrong");
              File Clap1 = new File("beep.WAV");
              AudioSystem(Clap1);
              }
              ImageIcon icc = new ImageIcon("src/folder/" + kremI[counter1]);
              eikona.setIcon(icc);
              counter1++;
              mistakes= mistakes + ch + ",";
              lathi.setText(mistakes);
           }
           else if(counterf==0 && counter1==6){
            try{
              if(effectsoff==false && soundoff==false){  
               clip1.stop();
              } 
            } catch(Exception e){
            
            } 
               if(effectsoff==false){
               File Clap = new File("gameover.WAV");
               AudioSystem(Clap);
               }
               mistakes= mistakes + ch;
               lathi.setText(mistakes);
               ImageIcon icc = new ImageIcon("src/folder/krem8.jpg");
               eikona.setIcon(icc);
               hidden.setText(hidden1);
               telikomin.setText("YOU LOSE!!!");
               disabled();
               counter1=0;
           }
    }
    

    void checkwin(String hidden2){
        int counterw=0;
        
        for(int i=0;i<hidden1.length();i++){
           if(hidden2.charAt(i)=='-'){
               counterw++;
           }
        }
        if(counterw==0){
            try{
              if(effectsoff==false && soundoff==false){
               clip1.stop();
              } 
            } catch(Exception e){
            
            }
            if(effectsoff==false){
            File Clap = new File("win.WAV");
            AudioSystem(Clap);
            }
            else if(effectsoff==true && soundoff==false){
               File Clap = new File("win.WAV");
               AudioSystem(Clap); 
            }
            ImageIcon icc = new ImageIcon("src/folder/krem9.jpg");
            eikona.setIcon(icc);
            
            hidden.setText(hidden2);
            telikomin.setText("YOU WIN!!!");
            disabled();  
            counter1=0;
        }   
    }
      
     void disabled(){
         a.setEnabled(false);
         b.setEnabled(false);
         c.setEnabled(false);
         d.setEnabled(false);
         e.setEnabled(false);
         f.setEnabled(false);
         g.setEnabled(false);
         h.setEnabled(false);
         i.setEnabled(false);
         j.setEnabled(false);
         k.setEnabled(false);
         l.setEnabled(false);
         m.setEnabled(false);
         n.setEnabled(false);
         o.setEnabled(false);
         p.setEnabled(false);
         q.setEnabled(false);
         r.setEnabled(false);
         s.setEnabled(false);
         t.setEnabled(false);
         u.setEnabled(false);
         v.setEnabled(false);
         w.setEnabled(false);
         x.setEnabled(false);
         y.setEnabled(false);
         z.setEnabled(false);     
     }
    
    void enabled(){
        
        a.setEnabled(true);
         b.setEnabled(true);
         c.setEnabled(true);
         d.setEnabled(true);
         e.setEnabled(true);
         f.setEnabled(true);
         g.setEnabled(true);
         h.setEnabled(true);
         i.setEnabled(true);
         j.setEnabled(true);
         k.setEnabled(true);
         l.setEnabled(true);
         m.setEnabled(true);
         n.setEnabled(true);
         o.setEnabled(true);
         p.setEnabled(true);
         q.setEnabled(true);
         r.setEnabled(true);
         s.setEnabled(true);
         t.setEnabled(true);
         u.setEnabled(true);
         v.setEnabled(true);
         w.setEnabled(true);
         x.setEnabled(true);
         y.setEnabled(true);
         z.setEnabled(true);
        
    }
    void AudioSystem(File file){
             try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
            
            
        }catch(Exception e){
            
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a;
    private javax.swing.JButton b;
    private javax.swing.JButton back;
    private javax.swing.JButton c;
    private javax.swing.JLabel checkbox;
    private javax.swing.JLabel checkbox2;
    private javax.swing.JButton d;
    private javax.swing.JButton e;
    private javax.swing.JLabel eikona;
    private javax.swing.JButton f;
    private javax.swing.JButton g;
    private javax.swing.JButton h;
    private javax.swing.JLabel hidden;
    private javax.swing.JButton i;
    private javax.swing.JButton j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton k;
    private javax.swing.JButton l;
    private javax.swing.JLabel lathi;
    private javax.swing.JButton m;
    private javax.swing.JButton n;
    private javax.swing.JButton o;
    private javax.swing.JButton onoff;
    private javax.swing.JButton onoff2;
    private javax.swing.JButton p;
    private javax.swing.JButton q;
    private javax.swing.JButton quit;
    private javax.swing.JButton r;
    private javax.swing.JButton s;
    private javax.swing.JButton start;
    private javax.swing.JButton t;
    private javax.swing.JLabel telikomin;
    private javax.swing.JButton u;
    private javax.swing.JButton v;
    private javax.swing.JButton w;
    private javax.swing.JButton x;
    private javax.swing.JButton y;
    private javax.swing.JButton z;
    // End of variables declaration//GEN-END:variables

    private Kremala createImageIcon(String desktopkrem2png) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
