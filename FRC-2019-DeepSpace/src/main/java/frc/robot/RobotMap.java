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
public enum RobotMap {
  //CAN Motor Controls
   //TalonSRX
    //Drive Motors
    LEFT_MOTOR(7),
    RIGHT_MOTOR(6),
    LEFT_FOLLOW_MOTOR(9),
    RIGHT_FOLLOW_MOTOR(8),

    //Lift_Motors
    LEFT_SCISSOR(1),
    RIGHT_SCISSOR(2),
    CASCADE_MOTOR(4),

    //Pickup Motor
    BALL_MOTOR(3),
    DISC_MOTOR(5),

    //Victor
   // DISC_ARM_MOTOR(1),
   // PLATFORM_MOTOR(2),

    //Solenoids
    //IN_SOLENOID(0),
    //OUT_SOLENOID(4),

  //PWM Motor Contorls

  //Joystick Contorls
  DRIVER(0),
  OPERATORSTICK(1);

  public final int value;

  RobotMap(int value){
    this.value=value;

  }

}
