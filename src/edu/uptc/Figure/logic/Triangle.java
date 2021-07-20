package edu.uptc.Figure.logic;

import java.awt.Graphics;
import java.awt.Point;

public class Triangle extends Figure {
private int base;
private int height;
public Triangle(Point point, int base, int height) {
	super(point);
	this.base = base;
	this.height = height;
}
@Override
public double calcArea() {
	return (base*height)/2;
}
@Override
public void paint(Graphics g) {
	// TODO Auto-generated method stub
	
};

}
