package com.scores.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.scores.domain.Classes;
import com.scores.domain.Homework;
import com.scores.domain.Score;

public class HomeworkDao {
	private static Score score;
    private static  Connection con = null;
    private static Statement st = null;
    public HomeworkDao() {
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
	public static List getAllHomework(int i1,int i2){
		try{
			List list=new ArrayList();
			ResultSet rs=st.executeQuery("select * from Homework where sno='"+i1+"' and cid='"+i2+"'");
//			System.out.println(111);
			while(rs.next()){
//				System.out.println(12);
				 Homework  classes=new  Homework();
				 classes.setCid(rs.getInt("cid"));
				 classes.setHname(rs.getString("hname"));
				 classes.setHgrade(rs.getInt("hgrade"));
				 classes.setCid(rs.getInt("cid"));
				 list.add(classes);
			}
//			con.commit();
			return list;
			}
		   catch(SQLException e){
			   e.printStackTrace();
			   }
			return null;
			}
	
public static void getAddClass(String i2,String i3,int i4) throws SQLException{
	     try{
			List list=new ArrayList();			
			st.execute("insert into class(cname,tname,tid) values('"+i2+"','"+i3+"','"+i4+"')");
			}
		   catch(SQLException e){
			   e.printStackTrace();
			   }
			}

public static void getDeleteClass(int i1,int i2){
	try{
		List list=new ArrayList();
		st.execute("delete from class where cid='"+i1+"' and tid='"+i2+"'");
		}
	   catch(SQLException e){
		   e.printStackTrace();
		   }
		}

}
