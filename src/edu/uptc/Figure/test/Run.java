package edu.uptc.Figure.test;

import java.awt.Point;
import java.util.Calendar;
import java.util.GregorianCalendar;

import edu.uptc.Figure.logic.ActionsFigure;
import edu.uptc.Figure.logic.Circle;
import edu.uptc.Figure.logic.Figure;
import edu.uptc.Figure.logic.Human;
import edu.uptc.Figure.logic.Human.Organ;
import edu.uptc.Figure.logic.Rectangle;

public class Run {
	public static void main(String args[]){
		
		Figure rectangle=new Rectangle(new Point(10,10),15,20);
		Figure circle=new Circle(new Point(20,20), 5);
		Human human=new Human( "Simon", new GregorianCalendar(1990, Calendar.SEPTEMBER,12));
		viewObject(rectangle);
		viewObject(circle);
		viewObject(human);
		Human lola=new Human("Dolores Buitrago",new GregorianCalendar(2000,8,13));
		Human.Organ organ=lola.new Organ("corazon", "Bombear sangre");
		lola.addOrgan(organ);
		organ.setDescription("pulmon");
		organ.setFuntion("respirar");
		lola.addOrgan(organ);
		for(Organ organs:lola.getOrgans()){
			System.out.println(organ);
		}
	}
	public static void viewObject(ActionsFigure aux){
		System.out.println(aux.calcArea());
	}
}
