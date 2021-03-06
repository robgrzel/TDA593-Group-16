// --------------------------------------------------------
// Code generated by Papyrus Java
package g16_tda593;

import java.util.LinkedList;
import java.util.List;

import project.Point;

public class NormalStrategy implements Strategy {
	private List<Point> missionPoints;
	private long capturedDate;
	
  public Point executeStrategy(RobotAvatar r) {
    //Might need to change implementation later, not sure if it works
    return ((LinkedList<Point>) this.missionPoints).poll();
  }
  
  public List<Point> getMissionPoints() {
	return this.missionPoints;
  }
  
  public Point getNextMissionPoint() {
	return ((LinkedList<Point>) this.missionPoints).peek();
  }

  public void setCapturedDate(long date) {
	this.capturedDate = date;
	
  }
  
  public long getCapturedDate() {
	  return this.capturedDate;
  }

	public void changeMissionPoints(List<Point> missionPoints) {
		this.missionPoints = missionPoints;
	}
}
