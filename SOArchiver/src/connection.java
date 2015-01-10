/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pentao
 */

import java.sql.*;
import javax.swing.*;
import java.io.*;

public class connection {
    static File file = new File(".");
    Connection conn = null;
    public static Connection ConnecrDb(){
        try {
            Class.forName("org.sqlite.JDBC");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:"+file.getCanonicalPath()+"\\SOArchiver");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Pentao\\Documents\\NetBeansProjects\\SOArchiver\\dist\\SOArchiver");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
