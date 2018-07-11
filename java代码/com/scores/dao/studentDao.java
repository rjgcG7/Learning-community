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

public class studentDao {
    private static  Connection con = null;
    private static Statement st = null;
    public studentDao() {
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
    public static void getAdd(String i2,String i3, String i4) throws SQLException{
	     try{
			List list=new ArrayList();			
			st.execute("insert into t_user(userid,username,password,is_teacher) values('"+i2+"','"+i3+"','"+i4+"','"+0+"')");
			}
		   catch(SQLException e){
			   e.printStackTrace();
			   }
			}
	public static student checkuser(String i1 ,String i2){
		student user = new student();
		try{
//			System.out.println(3333);
			ResultSet rs=st.executeQuery("select * from t_user where userid='"+i1+"' and password='"+i2+"'");
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
	public static student checkalluser(){
		student user = new student();
		try{
//			System.out.println(3333);
			ResultSet rs=st.executeQuery("select * from t_user ");
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



