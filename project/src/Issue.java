
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Serch.java
 *
 * Created on 20-Jul-2011, 23:53:15
 */

/**
 *
 * @author Nafees Yousuf
 */
public class Issue extends javax.swing.JFrame {

    /** Creates new form Serch */
    public Issue() {
        initComponents();
        
    }
    public Connection con() throws SQLException, ClassNotFoundException
    {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        String url = "jdbc:odbc:sa1";
        return DriverManager.getConnection(url);
    }
    Vector<Vector<String>> data = new Vector<Vector<String>>();
        Vector abc,header, abc1;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIssue = new javax.swing.JButton();
        btnAction = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtIssue = new javax.swing.JTextField();
        txtDue = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnRetrn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        btnShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 0, 24));
        jLabel1.setText("Issues of Books");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 170, 40);

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 0, 18));
        jLabel2.setText("BookName");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 110, 90, 23);

        jLabel3.setFont(new java.awt.Font("Script MT Bold", 0, 18));
        jLabel3.setText("Category");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 140, 70, 23);
        getContentPane().add(txtBookName);
        txtBookName.setBounds(160, 110, 170, 20);
        getContentPane().add(txtCategory);
        txtCategory.setBounds(160, 140, 170, 20);

        jLabel4.setFont(new java.awt.Font("Script MT Bold", 0, 18));
        jLabel4.setText("Issue Date");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 170, 90, 23);

        jLabel5.setFont(new java.awt.Font("Script MT Bold", 0, 18));
        jLabel5.setText("Due Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 200, 80, 23);

        btnIssue.setFont(new java.awt.Font("Script MT Bold", 0, 14));
        btnIssue.setText("Issue");
        btnIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueActionPerformed(evt);
            }
        });
        getContentPane().add(btnIssue);
        btnIssue.setBounds(20, 350, 80, 30);

        btnAction.setFont(new java.awt.Font("Script MT Bold", 0, 14));
        btnAction.setText("Action");
        btnAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionActionPerformed(evt);
            }
        });
        getContentPane().add(btnAction);
        btnAction.setBounds(210, 350, 80, 30);

        btnExit.setFont(new java.awt.Font("Script MT Bold", 0, 14));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(300, 350, 80, 30);
        getContentPane().add(txtIssue);
        txtIssue.setBounds(160, 170, 170, 20);
        getContentPane().add(txtDue);
        txtDue.setBounds(160, 200, 170, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(

            data,header
        )
    );
    jScrollPane1.setViewportView(jTable1);

    getContentPane().add(jScrollPane1);
    jScrollPane1.setBounds(10, 230, 380, 80);

    btnRetrn.setFont(new java.awt.Font("Script MT Bold", 0, 14));
    btnRetrn.setText("Return");
    btnRetrn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRetrnActionPerformed(evt);
        }
    });
    getContentPane().add(btnRetrn);
    btnRetrn.setBounds(110, 350, 80, 30);

    jLabel6.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
    jLabel6.setText("ISBN No.");
    getContentPane().add(jLabel6);
    jLabel6.setBounds(44, 80, 90, 20);
    getContentPane().add(txtISBN);
    txtISBN.setBounds(160, 80, 170, 20);

    btnShow.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
    btnShow.setText("Show");
    btnShow.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnShowActionPerformed(evt);
        }
    });
    getContentPane().add(btnShow);
    btnShow.setBounds(310, 310, 80, 31);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionActionPerformed

        action obj = new action();
        obj.setVisible(true);
    }//GEN-LAST:event_btnActionActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
}//GEN-LAST:event_btnExitActionPerformed

    private void btnIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueActionPerformed
        // TODO add your handling code here:
         try{
            Connection conn = con();
            Statement s = (Statement) conn.createStatement();
            String query = "insert into IssueBook values('"+txtISBN.getText()+"','"+txtBookName .getText()+"','"+txtCategory .getText()+"','"+txtIssue.getText()+"','"+txtDue.getText()+"')";
      s.executeUpdate(query);
       JOptionPane.showMessageDialog(rootPane, "SUCCESSFULL");
        conn.close();
        }catch(ClassNotFoundException ex){JOptionPane.showInternalMessageDialog(txtBookName, ex+"2");}
    catch(SQLException ex)
{
    JOptionPane.showInternalMessageDialog(txtBookName, ex+"1");
}
        
    }//GEN-LAST:event_btnIssueActionPerformed

    private void btnRetrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrnActionPerformed
       jTable1.remove(jTable1.getSelectedRow());
        try{
            Connection conn = con();
            Statement s = (Statement) conn.createStatement();

            String query = "Delete from IssueBook where (ISBNNO='"+txtISBN.getText()+"')";
            s.executeUpdate(query);
            JOptionPane.showMessageDialog(rootPane, "SUCCESSFULL");
            conn.close();
        }catch(ClassNotFoundException ex){JOptionPane.showMessageDialog(txtISBN, ex+"2");}
       catch(SQLException ex) {
            JOptionPane.showMessageDialog(txtISBN, ex+"1");
        }
}//GEN-LAST:event_btnRetrnActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
     try{
            Connection conn = con();
            Statement s = (Statement) conn.createStatement();
            String query = "SELECT ISBNNO,BookName,Category,IssueDate,DueDate FROM  IssueBook";
            rs=s.executeQuery(query);
//            s.executeUpdate(query);
  JOptionPane.showMessageDialog(rootPane, "SUCCESSFULL");
      abc1 = new Vector();
            while(rs.next()) {
                abc = new Vector();
                 abc.add(rs.getString(1)) ;
                 abc.add(rs.getString(2)) ;
                abc.add(rs.getString(3)) ;
                abc.add(rs.getString(4)) ;
                abc.add(rs.getString(5)) ;
                             data.add(abc);
            }
       header = new Vector<String>();
             header.add("ISBN_No");
            header.add("BookName");
            header.add("Category");
             header.add("IssueDate");
            header.add("DueDate");

   jTable1.setModel(new javax.swing.table.DefaultTableModel(data,header));

        conn.close();
        }catch(ClassNotFoundException ex){JOptionPane.showMessageDialog(rootPane, ex.getMessage());}
    catch(SQLException ex)
{
    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
}


    }//GEN-LAST:event_btnShowActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Issue a = new Issue();
                 a.setVisible(true);
                a.setSize(400, 460);
                
            }
        });
    }
    Connection cn=null;
    Statement s=null;
    PreparedStatement ps=null;
    ResultSet rs=null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAction;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIssue;
    private javax.swing.JButton btnRetrn;
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtDue;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtIssue;
    // End of variables declaration//GEN-END:variables

}
