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

public class UserDao {
	private static Score score;
    private static  Connection con = null;
    private static Statement st = null;
    public UserDao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
            		"jdbc:mysql://localhost:3306/wxh","root", "wuchenyou");
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
	public static User checkuser(String i1 ,String i2){
		User user = new User();
		try{
//			System.out.println(3333);
			ResultSet rs=st.executeQuery("select * from Users where username='"+i1+"' and password='"+i2+"'");
			if(rs.next()){
				user.setPassword(rs.getString("password"));
				user.setUsername(rs.getString("username"));
				user.setTid(rs.getInt("tid"));
				user.setTname(rs.getString("tname"));
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
	public static User checkalluser(){
		User user = new User();
		try{
//			System.out.println(3333);
			ResultSet rs=st.executeQuery("select * from Users ");
			if(rs.next()){
				user.setPassword(rs.getString("password"));
				user.setUsername(rs.getString("username"));
				user.setTid(rs.getInt("tid"));
				user.setTname(rs.getString("tname"));
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



