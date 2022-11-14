/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dolgozat;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author somoskoi.gabor
 */
public class GUI_OOP_Dolgozat extends javax.swing.JFrame {

    /**
     * Creates new form GUI_OOP_Dolgozat
     */
    
    
    public GUI_OOP_Dolgozat() {
        initComponents();
        PinGombokFeltolt();
        AmobaFeltolt();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpElrendezes = new javax.swing.ButtonGroup();
        brnGrpJatekos = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpnBejelentkezes = new javax.swing.JPanel();
        jpnPinBeallitas = new javax.swing.JPanel();
        chkKever = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtPin = new javax.swing.JTextField();
        jpnPin = new javax.swing.JPanel();
        jpnJatek = new javax.swing.JPanel();
        jpnAmoba = new javax.swing.JPanel();
        jpnAmobaBeallitas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuProgram = new javax.swing.JMenu();
        mnuItemUjra = new javax.swing.JMenuItem();
        mnuItemKilep = new javax.swing.JMenuItem();
        mnuElrendezes = new javax.swing.JMenu();
        mnuRdbVizszint = new javax.swing.JRadioButtonMenuItem();
        mnuRdbFuggoleges = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUI- OOP 1. dolgozat");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jpnPinBeallitas.setBorder(javax.swing.BorderFactory.createTitledBorder("Beállítás"));

        chkKever.setText("kever");
        chkKever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKeverActionPerformed(evt);
            }
        });

        jLabel1.setText("kód:");

        javax.swing.GroupLayout jpnPinBeallitasLayout = new javax.swing.GroupLayout(jpnPinBeallitas);
        jpnPinBeallitas.setLayout(jpnPinBeallitasLayout);
        jpnPinBeallitasLayout.setHorizontalGroup(
            jpnPinBeallitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPinBeallitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnPinBeallitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPin, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addGroup(jpnPinBeallitasLayout.createSequentialGroup()
                        .addGroup(jpnPinBeallitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkKever)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnPinBeallitasLayout.setVerticalGroup(
            jpnPinBeallitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnPinBeallitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkKever)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jpnPin.setBorder(javax.swing.BorderFactory.createTitledBorder("Pin kód"));

        javax.swing.GroupLayout jpnPinLayout = new javax.swing.GroupLayout(jpnPin);
        jpnPin.setLayout(jpnPinLayout);
        jpnPinLayout.setHorizontalGroup(
            jpnPinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );
        jpnPinLayout.setVerticalGroup(
            jpnPinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnBejelentkezesLayout = new javax.swing.GroupLayout(jpnBejelentkezes);
        jpnBejelentkezes.setLayout(jpnBejelentkezesLayout);
        jpnBejelentkezesLayout.setHorizontalGroup(
            jpnBejelentkezesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBejelentkezesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnPin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jpnPinBeallitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnBejelentkezesLayout.setVerticalGroup(
            jpnBejelentkezesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBejelentkezesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jpnBejelentkezesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnPin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnPinBeallitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Bejelentkezés", jpnBejelentkezes);

        jpnAmoba.setBorder(javax.swing.BorderFactory.createTitledBorder("Amőba"));

        javax.swing.GroupLayout jpnAmobaLayout = new javax.swing.GroupLayout(jpnAmoba);
        jpnAmoba.setLayout(jpnAmobaLayout);
        jpnAmobaLayout.setHorizontalGroup(
            jpnAmobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );
        jpnAmobaLayout.setVerticalGroup(
            jpnAmobaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        jpnAmobaBeallitas.setBorder(javax.swing.BorderFactory.createTitledBorder("Beállítás"));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "3*3", "4*4", "5*5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setPreferredSize(new java.awt.Dimension(80, 30));
        jScrollPane1.setViewportView(jList1);

        brnGrpJatekos.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("\"X\" kezd");

        brnGrpJatekos.add(jRadioButton2);
        jRadioButton2.setText("\"O\" kezd");

        javax.swing.GroupLayout jpnAmobaBeallitasLayout = new javax.swing.GroupLayout(jpnAmobaBeallitas);
        jpnAmobaBeallitas.setLayout(jpnAmobaBeallitasLayout);
        jpnAmobaBeallitasLayout.setHorizontalGroup(
            jpnAmobaBeallitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAmobaBeallitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnAmobaBeallitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jpnAmobaBeallitasLayout.setVerticalGroup(
            jpnAmobaBeallitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAmobaBeallitasLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnJatekLayout = new javax.swing.GroupLayout(jpnJatek);
        jpnJatek.setLayout(jpnJatekLayout);
        jpnJatekLayout.setHorizontalGroup(
            jpnJatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnJatekLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnAmoba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnAmobaBeallitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jpnJatekLayout.setVerticalGroup(
            jpnJatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnJatekLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpnJatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnAmoba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnAmobaBeallitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Játék", jpnJatek);

        mnuProgram.setText("Program");

        mnuItemUjra.setText("Újra");
        mnuProgram.add(mnuItemUjra);

        mnuItemKilep.setText("Kilépés");
        mnuItemKilep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemKilepActionPerformed(evt);
            }
        });
        mnuProgram.add(mnuItemKilep);

        jMenuBar1.add(mnuProgram);

        mnuElrendezes.setText("Játék elrendezése");

        btnGrpElrendezes.add(mnuRdbVizszint);
        mnuRdbVizszint.setSelected(true);
        mnuRdbVizszint.setText("vízszintes");
        mnuElrendezes.add(mnuRdbVizszint);

        btnGrpElrendezes.add(mnuRdbFuggoleges);
        mnuRdbFuggoleges.setText("függőleges");
        mnuElrendezes.add(mnuRdbFuggoleges);

        jMenuBar1.add(mnuElrendezes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkKeverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKeverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkKeverActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        kilepes();
    }//GEN-LAST:event_formWindowClosing

    private void mnuItemKilepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemKilepActionPerformed
        kilepes();
    }//GEN-LAST:event_mnuItemKilepActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_OOP_Dolgozat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_OOP_Dolgozat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_OOP_Dolgozat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_OOP_Dolgozat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_OOP_Dolgozat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup brnGrpJatekos;
    private javax.swing.ButtonGroup btnGrpElrendezes;
    private javax.swing.JCheckBox chkKever;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpnAmoba;
    private javax.swing.JPanel jpnAmobaBeallitas;
    private javax.swing.JPanel jpnBejelentkezes;
    private javax.swing.JPanel jpnJatek;
    private javax.swing.JPanel jpnPin;
    private javax.swing.JPanel jpnPinBeallitas;
    private javax.swing.JMenu mnuElrendezes;
    private javax.swing.JMenuItem mnuItemKilep;
    private javax.swing.JMenuItem mnuItemUjra;
    private javax.swing.JMenu mnuProgram;
    private javax.swing.JRadioButtonMenuItem mnuRdbFuggoleges;
    private javax.swing.JRadioButtonMenuItem mnuRdbVizszint;
    private javax.swing.JTextField txtPin;
    // End of variables declaration//GEN-END:variables

private void PinGombokFeltolt(){
    LayoutManager pinGrid = new GridLayout(4, 3);
    jpnPin.setLayout(pinGrid);
    JButton[] pinButtons = new JButton[10];
    String txt = "";
    int szamlalo = 1;
    for (int i = 0; i < pinButtons.length; i++) {
        txt = "";
        if (szamlalo == 10) {
            txt = "0";
        }else{
            txt += szamlalo;
        }
        pinButtons[i] = new JButton(txt);
        jpnPin.add(pinButtons[i]);
        szamlalo++;
        chkKever.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chkKever.isSelected()) {
                    
                }
            }
        });
    }
}

private void AmobaFeltolt(){
    LayoutManager jatekBox = new GridLayout(3, 3);
    jpnAmoba.setLayout(jatekBox);
    JButton[] amobaButtons = new JButton[9];
    for (int i = 0; i < amobaButtons.length; i++) {
        amobaButtons[i] = new JButton();
        jpnAmoba.add(amobaButtons[i]);
    }
}

private void kilepes(){
    int valasz = JOptionPane.showConfirmDialog(rootPane, "Kilépés", "Biztos kilép?", JOptionPane.YES_NO_OPTION);
    if(valasz == JOptionPane.YES_OPTION){
        System.exit(valasz);
    }
}

}
