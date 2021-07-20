package edu.uptc.Figure.logic;

import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends Figure {
private int width;
private int height;
	public Rectangle(Point point, int width, int height) {
		super(point);
		this.height=height;
		this.width=width;
		// TODO Auto-generated constructor stub
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
public double calcArea(){
	return width*height;
}
public void paint(Graphics g){
	
}
}
