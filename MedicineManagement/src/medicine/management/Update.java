/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine.management;
import medicine.management.Categories;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author RISHABH RJ
 */
public class Update extends javax.swing.JFrame {
    

    /**
     * Creates new form Update
     */
    public Update() {
        initComponents();/*Update u1=new Update();
                u1.setVisible(true);
                u1.T2.setEnabled(false);
u1.T3.setEnabled(false);
u1.T4.setEnabled(false);
u1.T5.setEnabled(false);
u1.T6.setEnabled(false);
u1.T7.setEnabled(false);
u1.T8.setEnabled(false);
u1.T9.setEnabled(false);*/
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
        jLabel2 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        T7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        T8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        T9 = new javax.swing.JTextField();
        show = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(649, 566));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UPDATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 21, 192, 28);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Enter the id of medicine to be updated:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 80, 279, 38);

        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });
        T1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                T1KeyPressed(evt);
            }
        });
        getContentPane().add(T1);
        T1.setBounds(330, 80, 99, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 420, 85, 25);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 420, 89, 25);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("MEDNAME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(76, 197, 66, 14);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("MEDSELL:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(76, 252, 60, 14);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("MFG_DATE:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 310, 80, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("QUANTITY:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(76, 139, 67, 14);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("RACK:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(411, 139, 38, 14);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("EXP_DATE:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(420, 310, 70, 30);
        getContentPane().add(T2);
        T2.setBounds(195, 194, 104, 30);
        getContentPane().add(T3);
        T3.setBounds(195, 249, 104, 30);

        T4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                T4KeyPressed(evt);
            }
        });
        getContentPane().add(T4);
        T4.setBounds(200, 320, 104, 30);

        T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T5ActionPerformed(evt);
            }
        });
        getContentPane().add(T5);
        T5.setBounds(509, 309, 100, 30);

        T6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T6ActionPerformed(evt);
            }
        });
        getContentPane().add(T6);
        T6.setBounds(201, 136, 98, 30);
        getContentPane().add(T7);
        T7.setBounds(509, 136, 100, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("MFG_ID:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(411, 194, 50, 14);
        getContentPane().add(T8);
        T8.setBounds(507, 191, 100, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("MFG_NAME:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(411, 254, 72, 14);
        getContentPane().add(T9);
        T9.setBounds(508, 248, 100, 30);

        show.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
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
        show.setBounds(460, 80, 80, 25);

        delete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(60, 420, 90, 25);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(220, 420, 80, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicine/management/image/6.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 650, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     try
			
{
				
Class.forName("com.mysql.jdbc.Driver");
				
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine","root","");
String sql="Update med_detail set MNAME=?,MEDSELL=?,MFGDATE=?,EXPDATE=?,QUANTITY=?,RACK=? where MID=?";
String sql1="Update manufacturer set MFGID=?,MFGNAME=? where MID=?";
PreparedStatement pst=cn.prepareStatement(sql);
PreparedStatement pst1=cn.prepareStatement(sql1);
pst.setString(1,T2.getText());
				
pst.setFloat(2,Float.parseFloat(T3.getText()));
				
pst.setString(3,T4.getText());
				
pst.setString(4,T5.getText());
				
pst.setInt(5,Integer.parseInt(T6.getText()));
				
pst.setString(6,T7.getText());
pst.setInt(7, Integer.parseInt(T1.getText()));				
pst.executeUpdate();
pst1.setInt(1,Integer.parseInt(T8.getText()));
				
pst1.setString(2,T9.getText());
pst1.setInt(3, Integer.parseInt(T1.getText()));

pst1.executeUpdate();				
JOptionPane.showMessageDialog(null,"Updated Successfully!!!!");		
		
}catch(Exception z)
{
				
JOptionPane.showMessageDialog(null,"Incomplete ");
}
T1.setText("");
		
T2.setText("");
		
T3.setText("");
		
T4.setText("");
		
T5.setText("");
		
T6.setText("");

T7.setText("");

T8.setText("");

T9.setText("");
T2.setEnabled(false);
T3.setEnabled(false);
T4.setEnabled(false);
T5.setEnabled(false);
T6.setEnabled(false);
T7.setEnabled(false);
T8.setEnabled(false);
T9.setEnabled(false);
show.setEnabled(true);
T1.setEnabled(true);
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
			
{				
Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine","root","");
String sql="SELECT * FROM med_detail WHERE MID="+T1.getText();
String sql1="SELECT * FROM manufacturer WHERE MID="+T1.getText();
PreparedStatement pst=cn.prepareStatement(sql);
PreparedStatement pst1=cn.prepareStatement(sql1);
ResultSet rs=pst.executeQuery();
ResultSet rs1=pst1.executeQuery();	
if(rs.next() && rs1.next())
{
T1.setEnabled(true);
T2.setEnabled(true);
T3.setEnabled(true);
T4.setEnabled(true);
T5.setEnabled(true);
T6.setEnabled(true);
T7.setEnabled(true);
T8.setEnabled(true);
T9.setEnabled(true);
T2.setText(rs.getString(2));
T3.setText(Float.toString(rs.getFloat(3)));
T4.setText(rs.getString(4));
T5.setText(rs.getString(5));
T6.setText(Integer.toString(rs.getInt(6)));
T7.setText(rs.getString(7));
T8.setText(Integer.toString(rs1.getInt(1)));
T9.setText(rs1.getString(2));
show.setEnabled(false);
T1.setEnabled(false);
}
else
{
JOptionPane.showMessageDialog(null,"invalid id");
T1.setText("");
show.setEnabled(true);
}
}
catch(Exception y)
{
				
JOptionPane.showMessageDialog(null,"Wrong information!!!!!!");
		
}
        
        
    }//GEN-LAST:event_showActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try
			
{
				
int aa=Integer.parseInt(T1.getText());
				
if(aa==0)
					
JOptionPane.showMessageDialog(null,"Cannot Delete the Deleted Record");
				
else
				
{

Class.forName("com.mysql.jdbc.Driver");
	    			
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine","root","");

String sql="DELETE from med_detail where MID=?";

String sql1="DELETE from manufacturer where MID=?";	    			
PreparedStatement pst=cn.prepareStatement(sql);
	    			
	    			
PreparedStatement pst1=cn.prepareStatement(sql1);
pst.setInt(1,Integer.parseInt(T1.getText()));
	    			
pst.executeUpdate();
pst1.setInt(1,Integer.parseInt(T1.getText()));
	    			
pst1.executeUpdate();

	    				
JOptionPane.showMessageDialog(null,"Record is been Deleted Successfully");				
}
			
}
catch(Exception x)
				
{
					
JOptionPane.showMessageDialog(null,""+x);
				
}
     T1.setText("");
		
T2.setText("");
		
T3.setText("");
		
T4.setText("");
		
T5.setText("");
		
T6.setText("");

T7.setText("");

T8.setText("");

T9.setText("");

show.setEnabled(true);
T1.setEnabled(true);
			
	
    }//GEN-LAST:event_deleteActionPerformed

    private void T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T5ActionPerformed

    private void T1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try
			
{
				
Class.forName("com.mysql.jdbc.Driver");

Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine","root","");
String sql="SELECT * FROM med_detail WHERE MID="+T1.getText();
String sql1="SELECT * FROM manufacturer WHERE MID="+T1.getText();
PreparedStatement pst=cn.prepareStatement(sql);
PreparedStatement pst1=cn.prepareStatement(sql1);
ResultSet rs=pst.executeQuery();
ResultSet rs1=pst1.executeQuery();	
if(rs.next() && rs1.next())
{
T2.setText(rs.getString(2));
T3.setText(Float.toString(rs.getFloat(3)));
T4.setText(rs.getString(4));
T5.setText(rs.getString(5));
T6.setText(Integer.toString(rs.getInt(6)));
T7.setText(rs.getString(7));
T8.setText(Integer.toString(rs1.getInt(1)));
T9.setText(rs1.getString(2));
show.setEnabled(false);
T1.setEnabled(false);
//T1.setEnabled(true);
T2.setEnabled(true);
T3.setEnabled(true);
T4.setEnabled(true);
T5.setEnabled(true);
T6.setEnabled(true);
T7.setEnabled(true);
T8.setEnabled(true);
T9.setEnabled(true);

}
else
{
T1.setEnabled(false);
T2.setEnabled(false);
T3.setEnabled(false);
T4.setEnabled(false);
T5.setEnabled(false);
T6.setEnabled(false);
T7.setEnabled(false);
T8.setEnabled(false);
T9.setEnabled(false);
JOptionPane.showMessageDialog(null,"invalid id");
show.setEnabled(true);
T1.setEnabled(true);
/*T2.setEnabled(true);
T3.setEnabled(true);
T4.setEnabled(true);
T5.setEnabled(true);
T6.setEnabled(true);
T7.setEnabled(true);
T8.setEnabled(true);
T9.setEnabled(true);*/
T1.setText("");
}
}
catch(Exception y)
{
				
JOptionPane.showMessageDialog(null,"Id is not present!!!!");
		
}
        }
    }//GEN-LAST:event_T1KeyPressed

    private void showKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_showKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        try
			
{
				
Class.forName("com.mysql.jdbc.Driver");

Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine","root","");
String sql="SELECT * FROM med_detail WHERE MID="+T1.getText();
String sql1="SELECT * FROM manufacturer WHERE MID="+T1.getText();
PreparedStatement pst=cn.prepareStatement(sql);
PreparedStatement pst1=cn.prepareStatement(sql1);
ResultSet rs=pst.executeQuery();
ResultSet rs1=pst1.executeQuery();	
if(rs.next() && rs1.next())
{
T2.setText(rs.getString(2));
T3.setText(Float.toString(rs.getFloat(3)));
T4.setText(rs.getString(4));
T5.setText(rs.getString(5));
T6.setText(Integer.toString(rs.getInt(6)));
T7.setText(rs.getString(7));
T8.setText(Integer.toString(rs1.getInt(1)));
T9.setText(rs1.getString(2));
show.setEnabled(false);
T1.setEnabled(false);
}
else
{
T1.setEnabled(false);
T2.setEnabled(false);
T3.setEnabled(false);
T4.setEnabled(false);
T5.setEnabled(false);
T6.setEnabled(false);
T7.setEnabled(false);
T8.setEnabled(false);
T9.setEnabled(false);
JOptionPane.showMessageDialog(null,"invalid id");
show.setEnabled(true);
T1.setEnabled(true);
T2.setEnabled(true);
T3.setEnabled(true);
T4.setEnabled(true);
T5.setEnabled(true);
T6.setEnabled(true);
T7.setEnabled(true);
T8.setEnabled(true);
T9.setEnabled(true);
T1.setText("");
}
}
catch(Exception y)
{
				
JOptionPane.showMessageDialog(null,""+y);
		
}
        }
    }//GEN-LAST:event_showKeyPressed

    private void T4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_T4KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            try
			
{
				
Class.forName("com.mysql.jdbc.Driver");
				
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine","root","");


String sql="Update med_detail set MNAME=?,MEDSELL=?,MFGDATE=?,EXPDATE=?,QUANTITY=?,RACK=? where MID=?";
String sql1="Update manufacturer set MFGID=?,MFGNAME=? where MID=?";
PreparedStatement pst=cn.prepareStatement(sql);
PreparedStatement pst1=cn.prepareStatement(sql1);
pst.setString(1,T2.getText());
				
pst.setFloat(2,Float.parseFloat(T3.getText()));
				
pst.setString(3,T4.getText());
				
pst.setString(4,T5.getText());
				
pst.setInt(5,Integer.parseInt(T6.getText()));
				
pst.setString(6,T7.getText());
pst.setInt(7, Integer.parseInt(T1.getText()));				
pst.executeUpdate();
pst1.setInt(1,Integer.parseInt(T8.getText()));
				
pst1.setString(2,T9.getText());
pst1.setInt(3, Integer.parseInt(T1.getText()));

pst1.executeUpdate();				
JOptionPane.showMessageDialog(null,"Updated Successfully!!!!");		
		
}catch(Exception z)
{
				
JOptionPane.showMessageDialog(null,"Empty Textfield!!!");
}
T1.setText("");
		
T2.setText("");
		
T3.setText("");
		
T4.setText("");
		
T5.setText("");
		
T6.setText("");

T7.setText("");

T8.setText("");

T9.setText("");
T2.setEnabled(true);
T3.setEnabled(true);
T4.setEnabled(true);
T5.setEnabled(true);
T6.setEnabled(true);
T7.setEnabled(true);
T8.setEnabled(true);
T9.setEnabled(true);
show.setEnabled(true);
T1.setEnabled(true);

        }
        
    }//GEN-LAST:event_T4KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        T1.setText("");
		
T2.setText("");
		
T3.setText("");
		
T4.setText("");
		
T5.setText("");
		
T6.setText("");

T7.setText("");

T8.setText("");

T9.setText("");
T2.setEnabled(true);
T3.setEnabled(true);
T4.setEnabled(true);
T5.setEnabled(true);
T6.setEnabled(true);
T7.setEnabled(true);
T8.setEnabled(true);
T9.setEnabled(true);
show.setEnabled(true);
T1.setEnabled(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T1ActionPerformed

    private void T6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T6ActionPerformed
        // TODO add your handling code here: T1.setEnabled(false);

    }//GEN-LAST:event_T6ActionPerformed
/*
void XYZ(){T2.setEnabled(false);
T3.setEnabled(false);
T4.setEnabled(false);
T5.setEnabled(false);
T6.setEnabled(false);
T7.setEnabled(false);
T8.setEnabled(false);
T9.setEnabled(false);
        
    }*/
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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Update().setVisible(true);
                
                Update u3=new Update();
                u3.setVisible(true);
                u3.T2.setEnabled(false);
u3.T3.setEnabled(false);
u3.T4.setEnabled(false);
u3.T5.setEnabled(false);
u3.T6.setEnabled(false);
u3.T7.setEnabled(false);
u3.T8.setEnabled(false);
u3.T9.setEnabled(false);
         
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JTextField T8;
    private javax.swing.JTextField T9;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}
