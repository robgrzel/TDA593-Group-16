package g16_tda593;

import java.util.Set;

public class RobotController {
  private Set<RobotAvatar> robots;
  public RobotController(Set<RobotAvatar> robots) {
	  this.robots = robots;
  }

  public Set<RobotAvatar> getRobots() {
    return this.robots;
  }
  public void executeMission(RobotAvatar r) {
	  if(!r.getStrategy().getMissionPoints().isEmpty()) {
        r.setDestination(r.getStrategy().executeStrategy(r));
	  }
  }
}
