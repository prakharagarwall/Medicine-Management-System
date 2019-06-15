/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine.management;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JOptionPane;
/**
 *
 * @author RISHABH RJ
 */
public class Listing extends javax.swing.JFrame {

    /**
     * Creates new form Listing
     */
    public Listing() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        showexp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tw = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        del = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(635, 550));
        getContentPane().setLayout(null);

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);
        ta.setEnabled(false);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 580, 390);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 480, 71, 25);

        showexp.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        showexp.setText("SHOW ");
        showexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showexpActionPerformed(evt);
            }
        });
        getContentPane().add(showexp);
        showexp.setBounds(440, 20, 90, 25);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("ENTER CURRENT DATE(DD/MM/YYYY):");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 230, 30);

        tw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twActionPerformed(evt);
            }
        });
        tw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                twKeyPressed(evt);
            }
        });
        getContentPane().add(tw);
        tw.setBounds(280, 20, 120, 30);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("RESET");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 480, 80, 25);

        del.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        del.setText("DELETE");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        getContentPane().add(del);
        del.setBounds(280, 480, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Categories c=new Categories();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showexpActionPerformed
        // TODO add your handling code here:
        try
 {
     Class.forName("com.mysql.jdbc.Driver");

Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine","root","");
                        del.setEnabled(false);
    			JButton BT=(JButton)evt.getSource();
                        if(BT==showexp)
                        {
                        showexp.setEnabled(false);
                        tw.setEnabled(false);
                        String text=tw.getText();
                        Date date1=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(text);
    			String query="SELECT MID,MNAME,EXPDATE from med_detail";
                        Statement stm=cn.createStatement();
                        ResultSet rs=stm.executeQuery(query);
    			String data="MID\t MNAME\tEXPDATE\t";
    			int flag=0;
    			while(rs.next()==true)
    			{
                                String s=rs.getString(3);
                                Date date2=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(s);
                                if( date1.compareTo(date2)>=0 )
                                {
                                    flag=1;
    				String a1,a2,a3;
    				a1=Integer.toString(rs.getInt(1));
    				a2=rs.getString(2);
    				a3=rs.getString(3);
                                data=data+"\n";
    				data=data+a1+"\t";
    				data=data+a2+"\t";
    				data=data+a3+"\t";
                                }
                        }
                        if(flag==0)
                        {JOptionPane.showMessageDialog(null,"No data found");
                            
                        }
    			else
                        {ta.setText(data);
                        del.setEnabled(true);
                        }	
    		}
 }
    		catch(Exception y)
    		{
    			JOptionPane.showMessageDialog(null,"Incorrect data");
    		}
        
        
    }//GEN-LAST:event_showexpActionPerformed

    private void twActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        showexp.setEnabled(true);
        tw.setEnabled(true);
        tw.setText("");
	ta.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
         try
 {
 Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine","root","");
    			JButton BT=(JButton)evt.getSource();
                        if(BT==del)
                        {
                        del.setEnabled(false);
                        ta.setText("");
                        String text=tw.getText();
                        Date date1=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(text);
    			String query="SELECT MID,MNAME,EXPDATE from med_detail";
                        Statement stm=cn.createStatement();
                        ResultSet rs=stm.executeQuery(query);
                        String sql="DELETE from med_detail where MID=?";
                        String sql1="DELETE from manufacturer where MID=?";	    			
                        PreparedStatement pst=cn.prepareStatement(sql);
	    		PreparedStatement pst1=cn.prepareStatement(sql1);
                        int flag=0;
    			while(rs.next()==true)
    			{
                                String s=rs.getString(3);
                                Date date2=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(s);
                                if( date1.compareTo(date2)>=0 ){
                                pst.setInt(1,rs.getInt(1));
	    			pst.executeUpdate();
                                pst1.setInt(1,rs.getInt(1));
	    			pst1.executeUpdate();
                                flag=1;
 }                          
    				}
                        if(flag==1)
                       JOptionPane.showMessageDialog(null,"Records is been Deleted Successfully");
                        else
                        JOptionPane.showMessageDialog(null,"Cannot Delete the Deleted Record");
                        }
 }catch(Exception x)
				
{
					
JOptionPane.showMessageDialog(null,"Cannot delete!!!");
				
}
    }//GEN-LAST:event_delActionPerformed

    private void twKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_twKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        try
            {
     Class.forName("com.mysql.jdbc.Driver");

Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine","root","");
                        del.setEnabled(false);
    			//JButton BT=(JButton)evt.getSource();
                        //if(BT==showexp)
                        //{
                        showexp.setEnabled(false);
                        tw.setEnabled(false);
                        String text=tw.getText();
                        Date date1=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(text);
    			String query="SELECT MID,MNAME,EXPDATE from med_detail";
                        Statement stm=cn.createStatement();
                        ResultSet rs=stm.executeQuery(query);
    			String data="MID\t MNAME\tEXPDATE\t";
    			int flag=0;
    			while(rs.next()==true)
    			{
                                String s=rs.getString(3);
                                Date date2=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(s);
                                if( date1.compareTo(date2)>=0 )
                                {
                                    flag=1;
    				String a1,a2,a3;
    				a1=Integer.toString(rs.getInt(1));
    				a2=rs.getString(2);
    				a3=rs.getString(3);
                                data=data+"\n";
    				data=data+a1+"\t";
    				data=data+a2+"\t";
    				data=data+a3+"\t";
                                 }
                                
    			//	}
                        if(flag==0)
                        {
                            JOptionPane.showMessageDialog(null,"No data found");
                        }
    			else
                        {ta.setText(data);
                        del.setEnabled(true);}	
    		}
 }
    		catch(Exception y)
    		{
    			JOptionPane.showMessageDialog(null,"Empty Textfield!!!");
    		}
        }
    }//GEN-LAST:event_twKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        showexp.setEnabled(true);
        tw.setEnabled(true);
        tw.setText("");
	ta.setText("");
        }
    }//GEN-LAST:event_jButton2KeyPressed

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
            java.util.logging.Logger.getLogger(Listing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton del;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showexp;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField tw;
    // End of variables declaration//GEN-END:variables
}
