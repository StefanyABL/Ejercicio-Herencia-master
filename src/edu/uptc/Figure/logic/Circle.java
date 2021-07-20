package edu.uptc.Figure.logic;

import java.awt.Graphics;
import java.awt.Point;

public class Circle extends Figure {
private float radio;

public Circle(Point point, float radio) {
	super(point);
	this.radio = radio;
}

@Override
public double calcArea() {
	return Math.PI*Math.pow(radio, 2);
}

@Override
public void paint(Graphics g) {
	// TODO Auto-generated method stub
	
}

}
