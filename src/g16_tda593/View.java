// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package g16_tda593;

import java.util.Set;

import g16_tda593.Controller;
import g16_tda593.RobotAvatar;

/************************************************************/
/**
 * 
 */
public interface View {
	//We have an interface in case we want to implement more views.
	public void printReward(int rewardPoints, boolean procedure);
	public void printRobotAdded(String robotID);
};
