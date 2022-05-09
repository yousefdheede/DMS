/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package digitaldiary;
import java.awt.Image;
 
import java.io.File;
 
import javax.swing.ImageIcon;
 
import javax.swing.JFileChooser;
 
import javax.swing.JOptionPane;
 
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author HP
 */
public class DisplayImageOnJpanel extends javax.swing.JFrame {

    /**
     * Creates new form DisplayImageOnJpanel
     */
    public DisplayImageOnJpanel() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                        
 
    private void initComponents() {
 
 
 
        jButton1 = new javax.swing.JButton();
 
        label = new javax.swing.JLabel();
 
 
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
 
 
        jButton1.setText("UPLOAD");
 
        jButton1.addActionListener(new java.awt.event.ActionListener() {
 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
 
                jButton1ActionPerformed(evt);
 
            }
 
        });
 
 
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
 
        getContentPane().setLayout(layout);
 
        layout.setHorizontalGroup(
 
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 
            .addGroup(layout.createSequentialGroup()
 
                .addGap(109, 109, 109)
 
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
 
                .addContainerGap(103, Short.MAX_VALUE))
 
            .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
 
        );
 
        layout.setVerticalGroup(
 
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
 
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
 
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
 
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
 
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
 
                .addGap(27, 27, 27))
 
        );
 
 
 
        pack();
 
        setLocationRelativeTo(null);
 
    }// </editor-fold>                      
 
 public String getselectedImage;
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
 
        JFileChooser fileChooser = new JFileChooser();
 
        //Limit type of file name extensions supported.
 
        FileNameExtensionFilter filter = new FileNameExtensionFilter("4 Extensions Supported", "jpg", "png", "jpeg", "gif");
 
        fileChooser.setFileFilter(filter);
 
        int selected = fileChooser.showOpenDialog(null);
 
        //check if open button has been clicked.
 
        if (selected == JFileChooser.APPROVE_OPTION) {
 
            File file = fileChooser.getSelectedFile();
 
            //Get Path of the selected image.
 
             getselectedImage = file.getAbsolutePath();
 
            //Display image path on Message Dialog
 
            JOptionPane.showMessageDialog(null, getselectedImage);
 
            ImageIcon imIco = new ImageIcon(getselectedImage);
 
            //make image fit on jlabel.
 
            Image imFit = imIco.getImage();
 
            Image imgFit = imFit.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
 
            label.setIcon(new ImageIcon(imgFit));
 
          
 
        }
 
    }                                      
 
 
 
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
 
            java.util.logging.Logger.getLogger(DisplayImageOnJpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 
        } catch (InstantiationException ex) {
 
            java.util.logging.Logger.getLogger(DisplayImageOnJpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 
        } catch (IllegalAccessException ex) {
 
            java.util.logging.Logger.getLogger(DisplayImageOnJpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
 
            java.util.logging.Logger.getLogger(DisplayImageOnJpanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
 
        }
 
        //</editor-fold>
 
 
 
        /* Create and display the form */
 
        java.awt.EventQueue.invokeLater(new Runnable() {
 
            public void run() {
 
                new DisplayImageOnJpanel().setVisible(true);
 
            }
 
        });
 
    }
 
 
 
    // Variables declaration - do not modify                    
 
    private javax.swing.JButton jButton1;
 
    private javax.swing.JLabel label;
 
    // End of variables declaration                  
 


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("test");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(339, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                   NoteMaker mk = new NoteMaker();
                 mk.txtPane.setText(getselectedImage); 
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

}
