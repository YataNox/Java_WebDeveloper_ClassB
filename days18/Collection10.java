package days18;

import java.util.ArrayList;

class Point
{
	private int x;
	private int y;
	public Point(int x, int y) {this.x = x; this.y = y;}
	public String toString() {return "x : " + x + ", y " + y;}
}

public class Collection10 
{
	public static void main(String[] args)
	{
		ArrayList<Point> list = new ArrayList<Point>();
		Point p1 = new Point(10,10);
		list.add(p1);
		list.add(new Point(20, 20));
		list.add(new Point(30, 30));
		for(Point p : list)
			System.out.println(p.toString());
	}
}
