package g16_tda593;

import java.util.Date;
import java.util.List;
import java.util.Set;

import project.LocationController;
import project.Point;

public class EnvironmentController {
  private Set<Area> areas;

  public EnvironmentController(Set<Area> a) {
    this.areas = a;
  }

  public double distance(RobotAvatar r, Area a) {
		double distance = Math.hypot(r.getPosition().getX() - a.getCenter().getX(),
				r.getPosition().getZ() - a.getCenter().getZ());
		return distance;
	}

  public boolean getPermission(RobotAvatar r) {
	  for(Area a : areas) {
		  if(!(a instanceof LogicalArea)) {
			  if (r.getPosition().dist(a.getCenter()) < a.getRadius()) {
				  if(a.getOwner() == null) {
					  if(a.getLc().tryAcquire(r)) {
						  a.setOwner(r);
						  r.getStrategy().setCapturedDate((new Date()).getTime());
						  ((WaitStrategy) r.getStrategy()).setIsWaiting(true);
						  return true;
					  }
				  } else if(a.getOwner().getRobotId() == r.getRobotId()) {
					  return true;
				  } else {
					  return false;
				  }
			  }
		  }
	  }
		return true;
  }

  public void releasePermission(RobotAvatar r) {
    for(Area a : areas) {
    			if(r.getPosition().dist(a.getCenter()) < a.getRadius()*1.2 && r.getPosition().dist(a.getCenter()) > a.getRadius()) {
    				if(a.getOwner() != null && a.getOwner().getRobotId() == r.getRobotId()) {
    					a.setOwner(null);
    					a.getLc().release(r);
    				}
    			}
    		
    }
  }

  public Set<Area> getAreas() {
    return this.areas;
  }
}
