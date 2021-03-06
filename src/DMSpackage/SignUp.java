
package DMSpackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class SignUp extends javax.swing.JFrame {

    
    public SignUp() {
        initComponents();
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTf = new javax.swing.JTextField();
        passFld = new javax.swing.JPasswordField();
        confPassFld = new javax.swing.JPasswordField();
        btnProceed = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New User Registration");
        setMaximumSize(new java.awt.Dimension(542, 321));
        setMinimumSize(new java.awt.Dimension(542, 321));
        setSize(new java.awt.Dimension(542, 321));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        nameTf.setForeground(new java.awt.Color(192, 212, 212));
        nameTf.setText("Name");
        nameTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTfFocusGained(evt);
            }
        });
        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });
        getContentPane().add(nameTf);
        nameTf.setBounds(200, 80, 250, 22);
        getContentPane().add(passFld);
        passFld.setBounds(200, 130, 250, 22);
        getContentPane().add(confPassFld);
        confPassFld.setBounds(200, 180, 250, 22);

        btnProceed.setText("Proceed ");
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });
        getContentPane().add(btnProceed);
        btnProceed.setBounds(350, 230, 100, 25);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(38, 15, 231));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Password");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 130, 100, 30);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(38, 15, 231));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Confirm Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 180, 150, 30);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(38, 15, 231));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 80, 90, 30);
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 540, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       String image[]={"image1.png", "image2.png", "image3.png", "image4.png", "image5.png"};
        Random r= new Random();
        double a=Math.random()*4;
        int i=(int)a;

        backgroundLabel.setIcon(new ImageIcon(image[i]));
    }//GEN-LAST:event_formWindowOpened
public static String xx;
 
    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        String name=nameTf.getText().trim();
        xx=name;
        String pass=new String(passFld.getPassword());
        String confPass=new String(confPassFld.getPassword());
        
        if(!(new File(System.getProperty("user.home")+"/Documents/DigitalDiary/")).exists())
            new File(System.getProperty("user.home")+"/Documents/DigitalDiary/").mkdir();
        
        System.out.println(""+pass);
        System.out.println(""+confPass);
        if(!(name==null || name.isEmpty()))
        {
            if(pass.equals(confPass))
            {
                try
                {
                    BufferedWriter bw=new BufferedWriter(new FileWriter(".authen.dat"));
                    bw.write(name);
                    bw.newLine();
                    bw.write(pass);
                    bw.close();
                    NoteMaker nm=new NoteMaker();
                    nm.setVisible(true);
                    this.dispose();
                }
                catch(Exception e)
                {
                    System.out.println("Could not make file");
                    e.printStackTrace();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Passwords Do not match");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Name cannot be empty..");
        }
        
    }//GEN-LAST:event_btnProceedActionPerformed

    
     public  String  getuser(){
     String x = "John Doe :-->> ";
      if(xx==null)
        return x;
      else return xx+(":-->>");

    }
    private void nameTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTfFocusGained
        if(nameTf.getText().equals("Name"))
        {
            nameTf.setForeground(new java.awt.Color(44, 44, 44));
            nameTf.setText("");
        }
    }//GEN-LAST:event_nameTfFocusGained

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton btnProceed;
    private javax.swing.JPasswordField confPassFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nameTf;
    private javax.swing.JPasswordField passFld;
    // End of variables declaration//GEN-END:variables
}
