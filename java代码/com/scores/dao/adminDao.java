package com.scores.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import com.scores.domain.*;

public class adminDao {
    private static  Connection con = null;
    private static Statement st = null;
    public adminDao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/duanxueqi","root", "123456");
            st = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public synchronized void release() {
        if (st != null) {
            try {
                st.close();
            } catch (Exception e) {
            }
        }

        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
            }
        }

    }
	public static admin checkuser(String i1 ,String i2){
		admin user = new admin();
		try{
//			System.out.println(3333);
			ResultSet rs=st.executeQuery("select * from t_admin where userid='"+i1+"' and password='"+i2+"'");
			if(rs.next()){
				user.setPassword(rs.getString("password"));
				user.setUserid(rs.getString("userid"));
				 return user;
			}
//			System.out.println(555555);
//			con.commit();
			return null;
			}
		   catch(SQLException e){
			   e.printStackTrace();
			   }
			return null;
			}
	public static admin checkalluser(){
		admin user = new admin();
		try{
//			System.out.println(3333);
			ResultSet rs=st.executeQuery("select * from t_admin ");
			if(rs.next()){
				user.setPassword(rs.getString("password"));
				user.setUserid(rs.getString("userid"));
//				System.out.println(44444);
				 return user;
			}
//			System.out.println(555555);
//			con.commit();
			return null;
			}
		   catch(SQLException e){
			   e.printStackTrace();
			   }
			return null;
			}


}



