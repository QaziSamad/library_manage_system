
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on 08-Jul-2011, 13:00:27
 */

/**
 *
 * @author Nafees Yousuf
 */
public class logn extends javax.swing.JFrame {
    private Regster Regster;

    /** Creates new form NewJFrame */
    public logn() {
        initComponents();
         try{
            Connection cn=con();
            ps=cn.prepareStatement("select  * from Register");
           rs=ps.executeQuery();
           rs.next();

        }catch(SQLException ex){

            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }catch(ClassNotFoundException ex){
             JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }
   public Connection con() throws SQLException, ClassNotFoundException
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        String url = "jdbc:odbc:sa1";
        return DriverManager.getConnection(url);
    }



    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsrnam = new javax.swing.JTextField();
        txtPas = new javax.swing.JPasswordField();
        btnRegstr = new javax.swing.JButton();
        btnLogn = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 1, 24));
        jLabel2.setText("     Library Management System");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 350, 50);

        jLabel4.setFont(new java.awt.Font("Script MT Bold", 1, 14));
        jLabel4.setText("User Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 150, 90, 20);

        jLabel5.setFont(new java.awt.Font("Script MT Bold", 1, 14));
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 190, 70, 18);
        getContentPane().add(txtUsrnam);
        txtUsrnam.setBounds(160, 150, 130, 20);
        getContentPane().add(txtPas);
        txtPas.setBounds(160, 190, 130, 20);

        btnRegstr.setFont(new java.awt.Font("Script MT Bold", 2, 14));
        btnRegstr.setText("Register");
        btnRegstr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegstrActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegstr);
        btnRegstr.setBounds(170, 230, 80, 30);

        btnLogn.setFont(new java.awt.Font("Script MT Bold", 0, 14));
        btnLogn.setText("Login");
        btnLogn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLognActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogn);
        btnLogn.setBounds(70, 230, 80, 30);

        btnExit.setFont(new java.awt.Font("Script MT Bold", 0, 14));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(260, 230, 80, 30);
        getContentPane().add(lblMessage);
        lblMessage.setBounds(110, 260, 180, 20);

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 0, 36));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 70, 110, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
}//GEN-LAST:event_btnExitActionPerformed

    private void btnLognActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLognActionPerformed
         
        try {
            // TODO add your handling code here: rs.next();
            //int i;
       
           Connection cn=con();
         s=cn.createStatement();
         rs=s.executeQuery("select count(1) from Register where UserName = '" +txtUsrnam.getText()+ "'");
         rs.next();
         if(rs.getString(1).equals("1"))
         {
           JOptionPane.showMessageDialog(rootPane, "Welcome");
             dispose();
           action obj = new action();
             obj.setVisible(true);
         }
//         }else
//         {
//           JOptionPane.showMessageDialog(rootPane, "Invalid UserName or Password");
//            txtUsrnam.setText("");
//             txtPas.setText("");
//         }

        }
        catch(SQLException e)
        {
JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
        catch(ClassNotFoundException e)
        {
JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

}//GEN-LAST:event_btnLognActionPerformed

    private void btnRegstrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegstrActionPerformed
          dispose();
         new Regster().setVisible(true);
//        Regster  obj =new Regster();
//        obj.setVisible(true);
    }//GEN-LAST:event_btnRegstrActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new logn().setVisible(true);
                logn a = new logn();
                a.setVisible(true);
                a.setSize(400, 360);
            }
        });
    }
    Connection cn=null;
    Statement s=null;
    PreparedStatement ps=null;
    ResultSet rs=null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogn;
    private javax.swing.JButton btnRegstr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JPasswordField txtPas;
    private javax.swing.JTextField txtUsrnam;
    // End of variables declaration//GEN-END:variables

}