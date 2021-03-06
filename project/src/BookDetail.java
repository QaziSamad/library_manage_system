
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
 * BookDetail.java
 *
 * Created on 23-Jul-2011, 22:18:58
 */

/**
 *
 * @author Nafees Yousuf
 */
public class BookDetail extends javax.swing.JFrame {

    /** Creates new form BookDetail */
    public BookDetail() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBokTitl = new javax.swing.JTextField();
        txtISBn = new javax.swing.JTextField();
        txtAuthr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 0, 24));
        jLabel1.setText("Book Detail");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 130, 30);

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 0, 18));
        jLabel2.setText("Book Title");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 80, 23);

        jLabel3.setFont(new java.awt.Font("Script MT Bold", 0, 18));
        jLabel3.setText("ISBN No.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 90, 90, 23);

        jLabel4.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("Author");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 120, 60, 23);
        getContentPane().add(txtBokTitl);
        txtBokTitl.setBounds(120, 60, 150, 20);
        getContentPane().add(txtISBn);
        txtISBn.setBounds(120, 90, 150, 20);
        getContentPane().add(txtAuthr);
        txtAuthr.setBounds(120, 120, 150, 20);

        jLabel5.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("Category");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 140, 80, 30);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(120, 150, 150, 20);

        jButton1.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        jButton1.setText("Insert");
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 200, 70, 27);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookDetail().setVisible(true);
            }
        });
    }
    Connection cn=null;
    Statement s=null;
    PreparedStatement ps=null;
    ResultSet rs=null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtAuthr;
    private javax.swing.JTextField txtBokTitl;
    private javax.swing.JTextField txtISBn;
    // End of variables declaration//GEN-END:variables

}
