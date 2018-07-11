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

public class ScoreDao {
	private static Score score;
    private static  Connection con = null;
    private static Statement st = null;
    public ScoreDao() {
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
	public static List getAllScores(int i1){
		try{
			List list=new ArrayList();
			ResultSet rs=st.executeQuery("select * from scores where cid='"+i1+"'");
//			System.out.println(111);
			while(rs.next()){
//				System.out.println(12);
				 Score  score=new  Score();
				 score.setSno(rs.getInt("sno"));
				 score.setSname(rs.getString("sname"));
				 score.setCname(rs.getString("cname"));
				 score.setGrade(rs.getInt("grade"));
				 score.setCid(rs.getInt("cid"));
				 list.add(score);
			}
//			con.commit();
			return list;
			}
		   catch(SQLException e){
			   e.printStackTrace();
			   }
			return null;
			}
public static void getAddScores(int i1,int i4) throws SQLException{
	     try{
			List list=new ArrayList();
			Student  student=new  Student();
			ResultSet rs=st.executeQuery("select * from student where sno='"+i1+"'");
			while(rs.next()){
				 student.setSno(rs.getInt("sno"));
				 student.setSname(rs.getString("sname"));
			}
			Classes  classes=new Classes();
			rs=st.executeQuery("select * from class where cid='"+i4+"'");
			while(rs.next()){
				classes.setCid(rs.getInt("cid"));
				classes.setCname(rs.getString("cname"));
			}
			int zero=0;
			st.execute("insert into scores(sno,sname,cname,cid,grade,checks) values('"+student.getSno()+"','"+student.getSname()+"','"+classes.getCname()+"','"+i4+"','"+zero+"','"+0+"')");
			}
		   catch(SQLException e){
			   e.printStackTrace();
			   }
			}
public static void getDeleteScores(int i1,int i2){
	try{
		List list=new ArrayList();
		st.execute("delete from scores where sno='"+i1+"'and cid='"+i2+"'");
		}
	   catch(SQLException e){
		   e.printStackTrace();
		   }
		}

public static void getUpdateScores(int i1,int  i2,int  i3){
	try{
		List list=new ArrayList();
		st.execute("update scores set grade='"+i3+"' where sno='"+i1+"' and cid='"+i2+"' ");
		}
	   catch(SQLException e){
		   e.printStackTrace();
		   }
		}
public static List getAccScores(){
	try{
		List list=new ArrayList();
		ResultSet rs=st.executeQuery("select * from scores");
		while(rs.next()){
			 Score  score=new  Score();
			 score.setSno(rs.getInt("sno"));
			 score.setSname(rs.getString("sname"));
			 score.setCname(rs.getString("cname"));
			 score.setGrade(rs.getInt("grade"));
			 score.setCid(rs.getInt("cid"));
			 list.add(score);
		}
		return list;}
	   catch(SQLException e){
		   e.printStackTrace();
		   }
		return null;
		}


}

