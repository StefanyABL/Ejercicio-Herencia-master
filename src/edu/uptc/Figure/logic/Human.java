package edu.uptc.Figure.logic;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Calendar;

public class Human implements ActionsFigure {
	private String name;
	private Calendar birthday;
	private ArrayList<Organ> organs;

	public Human( String name, Calendar birthday) {
		this.name = name;
		this.birthday = birthday;
		organs=new ArrayList<>();
	}
	public void addOrgan(Organ organ){
		organs.add(organ);
	}

	@Override
	public double calcArea() {
		double años;
		Calendar now=Calendar.getInstance();
		int years=now.get(Calendar.YEAR)-birthday.get(Calendar.YEAR);
		int month=now.get(Calendar.MONTH)-birthday.get(Calendar.MONTH);
		int day=now.get(Calendar.DAY_OF_MONTH)-birthday.get(Calendar.DAY_OF_MONTH);
		if(month<0||(month==0&&day<0)){
			years--;
		}
		return years;
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub

	}
	
	public ArrayList<Organ> getOrgans() {
		return organs;
	}
	public void setOrgans(ArrayList<Organ> organs) {
		this.organs = organs;
	}

	public class Organ{
		private String description;
		private String funtion;
		public Organ(String description, String funtion) {
			super();
			this.description = description;
			this.funtion = funtion;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getFuntion() {
			return funtion;
		}
		public void setFuntion(String funtion) {
			this.funtion = funtion;
		}
		@Override
		public String toString() {
			return "Organ [description=" + description + ", funtion=" + funtion + "]";
		}
		
	}

}
