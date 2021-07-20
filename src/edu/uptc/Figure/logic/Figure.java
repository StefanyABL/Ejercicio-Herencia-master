package edu.uptc.Figure.logic;
import java.awt.Point;

public abstract class Figure implements ActionsFigure{
private Point point;

public Figure(Point point) {
	super();
	this.point = point;
}

public Point getPoint() {
	return point;
}

public void setPoint(Point point) {
	this.point = point;
}

}
