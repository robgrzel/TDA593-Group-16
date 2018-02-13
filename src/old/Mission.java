// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package old;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import project.Point;

/************************************************************/
/**
 * 
 */
public class Mission {
	/**
	 * 
	 */
	private LinkedList<Point> points;
	/**
	 * 
	 */
	private int missionId;

	public Mission(int id) {
		this.points = new LinkedList<Point>();
		this.missionId = id;
	}

	/**
	 * 
	 * @return 
	 */
	public LinkedList<Point> getPoints() {
		return this.points;
	}
	
	public void addPoint(Point p) {
		this.points.add(p);
	}

	/**
	 * 
	 * @return 
	 */
	public int getId() {
		return this.missionId;
	}
};