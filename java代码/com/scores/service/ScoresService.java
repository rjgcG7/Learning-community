package com.scores.service;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.scores.dao.*;
import com.scores.domain.Score;


public class ScoresService {
	   public List getAllScores(int i1){
			ScoreDao soreDAO=new ScoreDao();
//			System.out.println(3333);
			List li=soreDAO.getAllScores(i1);
			
			
//			if(li==null) {
//				System.out.println("no more date");
//			}
//			System.out.println(444);
//			for(Iterator it=li.iterator();it.hasNext();)
//		    { Score score=(Score)it.next();
//		      System.out.println(score.getSno());
//		     }
			
			
			 return soreDAO.getAllScores(i1);
			}
		public void getAddScores(int i1,int i4){
			ScoreDao soreDAO=new ScoreDao();
			try {
				soreDAO.getAddScores(i1,i4);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void getDeleteScores(int i1,int i4){
			ScoreDao soreDAO=new ScoreDao();
			soreDAO.getDeleteScores(i1,i4);
			}
		
		public void getUpdateScores(int i1,int  i2,int  i3) {
			ScoreDao soreDAO=new ScoreDao();
			soreDAO.getUpdateScores(i1,i2,i3);
		}
		
		}
