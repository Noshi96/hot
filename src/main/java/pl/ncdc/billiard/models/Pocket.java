package pl.ncdc.billiard.models;

import org.opencv.core.Point;

public class Pocket {
	private int id;
	
	private Point point = new Point();

	public Point getPoint() {
		return point;
	}

	public Pocket(int id, Point point) {
		super();
		this.id = id;
		this.point = point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public Pocket(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
