// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package g16_tda593;

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

	public Mission(LinkedList<Point> missionPoints, int id) {
		this.points = missionPoints;
		this.missionId = id;
	}

	/**
	 * 
	 * @return 
	 */
	public List<Point> getPoints() {
		return this.points;
	}

	/**
	 * 
	 * @return 
	 */
	public int getId() {
		return this.missionId;
	}
};
