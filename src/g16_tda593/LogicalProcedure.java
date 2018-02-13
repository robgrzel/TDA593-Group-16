package g16_tda593;

public class LogicalProcedure implements RewardProcedure {
  public int calculatePoints(Area a) {
    if(a instanceof LogicalArea) {
      return LOGICAL_POINTS;
    }
    return 0;
  }
}