/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  public static final int MotorLeft1Value = 0;
  public static final int MotorLeft2Value = 1;
  public static final int MotorRight1Value = 2;
  public static final int MotorRight2Value = 3;
	public static final int DriverController = 0;
	public static final int leftStickYValue = 0;
	public static final int RightTrigger = 3;
	public static final int LeftTrigger = 2;
	public static final int LeftStickXValue = 0;
  public static final double TurningRate = 0.7;

   /* The following PID Controller coefficients will need to be tuned */
    /* to match the dynamics of your drive system.  Note that the      */
    /* SmartDashboard in Test mode has support for helping you tune    */
    /* controllers by displaying a form where you can enter new P, I,  */
    /* and D constants and test the mechanism.                         */
    
    static final double kP = 0.03;
    static final double kI = 0.00;
    static final double kD = 0.00;
    static final double kF = 0.00;

    static final double kToleranceDegrees = 2.0f;    
    
    static final double kTargetAngleDegrees = 90.0f;
    
    // Channels for the wheels
    // final static int leftChannel	= 0;
    // final static int rightChannel	= 1;

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
