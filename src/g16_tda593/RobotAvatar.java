package g16_tda593;

import java.util.HashSet;
import java.util.Set;

import project.AbstractRobotSimulator;
import project.Point;

public class RobotAvatar extends AbstractRobotSimulator{
  private String robotId;
  private Point position;
  private Strategy strategy;
  private Set<Sensor> sensors;

  public RobotAvatar(Point startPosition, String id, Strategy s) {
    super(startPosition, id);
	
    this.position = startPosition;
    this.strategy = s;
    this.robotId = id;
    sensors = new HashSet<Sensor>();
    sensors.add(new GPS());
    sensors.add(new NetworkDevice());
    
    System.out.println("Robot " + robotId + " with missions " + strategy.getMissionPoints().size());
  }

  public String getRobotId() {
    return this.robotId;
  }

  public Point getPosition() {
    return super.getPosition();
  }

  public Strategy getStrategy() {
    return this.strategy;
  }

  public Set<Sensor> getSensors() {
    return this.sensors;
  }

  public void changeStrategy(Strategy s) {
	  this.strategy = s;
  }
}
