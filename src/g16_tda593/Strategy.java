package g16_tda593;

import java.util.List;

import project.Point;

public interface Strategy {

  public List<Point> getMissionPoints();

  public Point getNextMissionPoint();

  public Point executeStrategy(RobotAvatar r);
  
  public void setCapturedDate(long date);
  
  public long getCapturedDate();

  public void changeMissionPoints(List<Point> missionPoints);

}
