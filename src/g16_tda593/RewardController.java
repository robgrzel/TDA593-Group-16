package g16_tda593;

import java.util.Date;
import java.util.Set;

import project.Point;

public class RewardController {
  private RewardStorage storage;
  private RewardProcedure[] procedures;

  public RewardController() {
	this.procedures = new RewardProcedure[2];
    this.storage = new RewardStorage();
    this.procedures[0] = new LogicalProcedure();
    this.procedures[1] = new PhysicalProcedure();
    this.storage.setCapturedDate((new Date()).getTime());
  }

  public int getRewardPoints() {
    return this.storage.getStoredPoints();
  }
  
  public boolean containsRobot(Set<RobotAvatar> robots, Area area) {
	  for(RobotAvatar r : robots) {
		  if(r.getPosition().dist(area.getCenter()) < area.getRadius()) {
			  return true;
		  }
	  }
	  return false;
  }

  public void updateRewardPoints(Set<Area> areas, Set<RobotAvatar> robots) {
    //Will have to change syntax to check seconds or ms
    //Might also have to change something for initialstate
    long temptime = (new Date()).getTime();
    if(this.storage.getCapturedDate() < temptime - 20000) {
      this.storage.setCapturedDate(temptime);
      int temp = 0;
      for(Area a : areas) {
    	  	if(containsRobot(robots, a)) {
    	  		System.out.println("room " + a + " contains robot ");
    	  		temp = temp + this.procedures[0].calculatePoints(a) + this.procedures[1].calculatePoints(a);
    	  	}
      }
      this.storage.setStoredPoints(temp);
      System.out.println("Current points are " + this.storage.getStoredPoints());
      this.storage.setCapturedDate((new Date()).getTime());
    }
  }
}
