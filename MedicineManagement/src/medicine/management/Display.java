/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine.management;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author RISHABH RJ
 */
public class Display extends javax.swing.JFrame {

    /**
     * Creates new form Display
     */
    public Display() {
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

        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        show = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setMinimumSize(new java.awt.Dimension(660, 520));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Enter Medicine Id:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(137, 74, 115, 17);

        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(280, 60, 110, 40);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("CLEAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(108, 442, 71, 23);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(407, 442, 81, 23);

        show.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        show.setText("SHOW");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        show.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                showKeyPressed(evt);
            }
        });
        getContentPane().add(show);
        show.setBounds(472, 72, 71, 23);

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 136, 620, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        show.setEnabled(true);
        t1.setEnabled(true);
        t1.setText("");
        ta.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Categories c=new Categories();
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        // TODO add your handling code here:
         try
 {Class.forName("com.mysql.jdbc.Driver");

Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine","root","");
    			JButton BT=(JButton)evt.getSource();
    			String query="SELECT * from med_detail";
                        String query1="SELECT * from manufacturer";
    			if(BT==show)
    			{       
                                show.setEnabled(false);
                                t1.setEnabled(false);
    				query="SELECT * from med_detail where MID="+t1.getText().trim();
                                query1="SELECT * from manufacturer where MID="+t1.getText().trim();
    			}
    			//DataFunction obj=new DataFunction();
    		      //   ResultSet rs=obj.FetchData(query);
              Statement stm=cn.createStatement();
              Statement stm1=cn.createStatement();
              ResultSet rs=stm.executeQuery(query);
              ResultSet rs1=stm1.executeQuery(query1);
    			//String data="MID\t MNAME\t MEDSELL\t MFGDATE\t EXPDATE\t QUANTITY\tRACK\tMFGID\tMFGNAME\t";
    			String data="";
                        int flag=0;
    			while(rs.next()==true && rs1.next()==true)
    			{
    				flag=1;
    				String a1,a2,a3,a4,a5,a6,a7,a8,a9;
    				
    				a1=Integer.toString(rs.getInt(1));
    				a2=rs.getString(2);
    				a3=Float.toString(rs.getInt(3));
    				a4=rs.getString(4);
    				a5=rs.getString(5);
    				a6=Integer.toString(rs.getInt(6));
    				a7=rs.getString(7);
                                a8=Integer.toString(rs1.getInt(1));
                                a9=rs1.getString(2);
    				data=data+"\n";
    				data=data+a1+"\t";
    				data=data+a2+"\t";
    				data=data+a3+"\t";
    				data=data+a4+"\t";
    				data=data+a5+"\t";
    				data=data+a6+"\t";
                                data=data+a7+"\t";
                                data=data+a8+"\t";
                                data=data+a9+"\t";
       			}
    			if(flag==0)
    				JOptionPane.showMessageDialog(null,"Not data found");
    			else
    				ta.setText(data);
    			
    		}
    		catch(Exception y)
    		{
    			JOptionPane.showMessageDialog(null,""+y);
    		}
        
        
        
        
        
    }//GEN-LAST:event_showActionPerformed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        try
 {Class.forName("com.mysql.jdbc.Driver");

Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine","root","");
    			//JButton BT=(JButton)evt.getSource();
    			String query="SELECT * from med_detail";
                        String query1="SELECT * from manufacturer";
    			//if(BT==show)
    			//{       
                                show.setEnabled(false);
                                t1.setEnabled(false);
    				query="SELECT * from med_detail where MID="+t1.getText().trim();
                                query1="SELECT * from manufacturer where MID="+t1.getText().trim();
    			//}
    			//DataFunction obj=new DataFunction();
    		      //   ResultSet rs=obj.FetchData(query);
              Statement stm=cn.createStatement();
              Statement stm1=cn.createStatement();
              ResultSet rs=stm.executeQuery(query);
              ResultSet rs1=stm1.executeQuery(query1);
    			//String data="MID\t MNAME\t MEDSELL\t MFGDATE\t EXPDATE\t QUANTITY\tRACK\tMFGID\tMFGNAME\t";
    			String data="";
                        int flag=0;
    			while(rs.next()==true && rs1.next()==true)
    			{
    				flag=1;
    				String a1,a2,a3,a4,a5,a6,a7,a8,a9;
    				
    				a1=Integer.toString(rs.getInt(1));
    				a2=rs.getString(2);
    				a3=Float.toString(rs.getInt(3));
    				a4=rs.getString(4);
    				a5=rs.getString(5);
    				a6=Integer.toString(rs.getInt(6));
    				a7=rs.getString(7);
                                a8=Integer.toString(rs1.getInt(1));
                                a9=rs1.getString(2);
    				data=data+"\n";
    				data=data+a1+"\t";
    				data=data+a2+"\t";
    				data=data+a3+"\t";
    				data=data+a4+"\t";
    				data=data+a5+"\t";
    				data=data+a6+"\t";
                                data=data+a7+"\t";
                                data=data+a8+"\t";
                                data=data+a9+"\t";
       			}
    			if(flag==0)
    				JOptionPane.showMessageDialog(null,"Not data found");
    			else
    				ta.setText(data);
    			
    		}
    		catch(Exception y)
    		{
    			JOptionPane.showMessageDialog(null,"Incorrect!!!");
    		}
        }
    }//GEN-LAST:event_t1KeyPressed

    private void showKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_showKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try
 {Class.forName("com.mysql.jdbc.Driver");

Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine","root","");
    			JButton BT=(JButton)evt.getSource();
    			String query="SELECT * from med_detail";
                        String query1="SELECT * from manufacturer";
    			if(BT==show)
    			{       
                                show.setEnabled(false);
                                t1.setEnabled(false);
    				query="SELECT * from med_detail where MID="+t1.getText().trim();
                                query1="SELECT * from manufacturer where MID="+t1.getText().trim();
    			}
    			//DataFunction obj=new DataFunction();
    		      //   ResultSet rs=obj.FetchData(query);
              Statement stm=cn.createStatement();
              Statement stm1=cn.createStatement();
              ResultSet rs=stm.executeQuery(query);
              ResultSet rs1=stm1.executeQuery(query1);
    			//String data="MID\t MNAME\t MEDSELL\t MFGDATE\t EXPDATE\t QUANTITY\tRACK\tMFGID\tMFGNAME\t";
    			String data="";
                        int flag=0;
    			while(rs.next()==true && rs1.next()==true)
    			{
    				flag=1;
    				String a1,a2,a3,a4,a5,a6,a7,a8,a9;
    				
    				a1=Integer.toString(rs.getInt(1));
    				a2=rs.getString(2);
    				a3=Float.toString(rs.getInt(3));
    				a4=rs.getString(4);
    				a5=rs.getString(5);
    				a6=Integer.toString(rs.getInt(6));
    				a7=rs.getString(7);
                                a8=Integer.toString(rs1.getInt(1));
                                a9=rs1.getString(2);
    				data=data+"\n";
    				data=data+a1+"\t";
    				data=data+a2+"\t";
    				data=data+a3+"\t";
    				data=data+a4+"\t";
    				data=data+a5+"\t";
    				data=data+a6+"\t";
                                data=data+a7+"\t";
                                data=data+a8+"\t";
                                data=data+a9+"\t";
       			}
    			if(flag==0)
    				JOptionPane.showMessageDialog(null,"Not data found");
    			else
    				ta.setText(data);
    			
    		}
    		catch(Exception y)
    		{
    			JOptionPane.showMessageDialog(null,""+y);
    		}
        }
    }//GEN-LAST:event_showKeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
         show.setEnabled(true);
        t1.setEnabled(true);
        t1.setText("");
        ta.setText("");
        }
    }//GEN-LAST:event_jButton1KeyPressed

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
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton show;
    private javax.swing.JTextField t1;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
