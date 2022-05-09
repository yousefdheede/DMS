/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DMSpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author aks
 */
public class ViewAll extends javax.swing.JFrame {

    /**
     * Creates new form ViewAll
     */
    public ViewAll() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        listNotes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSpecialEvents = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        openselected = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Show All");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        listNotes.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(listNotes);

        listSpecialEvents.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(listSpecialEvents);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("All Notes");

        jLabel2.setText("All Special Events");

        dateLbl.setFont(new java.awt.Font("Cantarell", 1, 17)); // NOI18N
        dateLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jLabel3.setText("Note Text");

        openselected.setText("open selected note");
        openselected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openselectedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jScrollPane2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(openselected)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(openselected))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultListModel dn=(DefaultListModel)listNotes.getModel();
        DefaultListModel ds=(DefaultListModel)listSpecialEvents.getModel();
        
        dateLbl.setText(CalUI.selectedDate+" - "+CalUI.selectedMonth+" - "+CalUI.selectedYear);
        
        try
        {
            if((new File("allNotesLog.dat")).exists())
            {
                BufferedReader br = new BufferedReader(new FileReader("allNotesLog.dat"));
                String s="";
                String date, month, year;
                while((s=br.readLine())!=null)
                {
                    date=s.substring(s.lastIndexOf("@")+1, s.lastIndexOf("-")).trim();
                    System.out.println(""+date);
                    month=s.substring(s.lastIndexOf("-")+1, s.lastIndexOf("_")).trim();
                    System.out.println("    "+month);
                    year=s.substring(s.lastIndexOf("_")+1,s.lastIndexOf(".")).trim();
                    System.out.println(""+year);
                    int d=Integer.parseInt(date);
                    int m=Integer.parseInt(month);
                    int y=Integer.parseInt(year);
                    if(d==CalUI.selectedDate && m==CalUI.selectedMonth && y==CalUI.selectedYear)
                        dn.addElement(s);
                }
                br.close();
            }
            if((new File("specialEventsLog.dat")).exists())
            {
                BufferedReader b = new BufferedReader(new FileReader("specialEventsLog.dat"));
                String str="";
                while((str=b.readLine())!=null)
                {
                    String date=str.substring(str.lastIndexOf("#")+1, str.lastIndexOf("*")).trim();
                    String month=str.substring(str.lastIndexOf("*")+1, str.lastIndexOf("~")).trim();
                    String year=str.substring(str.lastIndexOf("~")+1).trim();
                    int d=Integer.parseInt(date);
                    int m=Integer.parseInt(month);
                    int y=Integer.parseInt(year);
                    if(d==CalUI.selectedDate && m==CalUI.selectedMonth && y==CalUI.selectedYear)
                    ds.addElement(str.substring(0,str.lastIndexOf("#")));
                }
                b.close();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void openselectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openselectedActionPerformed
      String x;
               x=listNotes.getSelectedValue();
               
               String x1=x.substring(x.lastIndexOf("@")+1).trim();
                NoteMaker mk=new NoteMaker();
            /*    
            FileReader reader;
              BufferedReader br;
        try {
            reader = new FileReader( x1 );
                  br = new BufferedReader(reader);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewAll.class.getName()).log(Level.SEVERE, null, ex);
        }*/
 BufferedReader buff = null;
  try {
       buff = new BufferedReader(new FileReader(x1));
       String str;
       while ((str = buff.readLine()) != null) {
       jTextArea1.append("\n"+str);
   }
 } catch (IOException e) {
  }              

        // TODO add your handling code here:
    }//GEN-LAST:event_openselectedActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JList<String> listNotes;
    private javax.swing.JList<String> listSpecialEvents;
    private javax.swing.JButton openselected;
    // End of variables declaration//GEN-END:variables
}
