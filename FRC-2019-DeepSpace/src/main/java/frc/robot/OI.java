/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  public static final double JOY_DEADZONE = 0.25;

  public final XboxController DriverStick = new XboxController(RobotMap.DRIVER.value);
  public final XboxController OperatorStick = new XboxController(RobotMap.OPERATORSTICK.value);
  //public final Joystick DriverStick = new Joystick(RobotMap.DRIVER.value);
  //public final Joystick OperatorStick = new Joystick(RobotMap.OPERATORSTICK.value);



//Driver Joystick Controls

public double getLeftJoyX(){
  double raw = DriverStick.getX(Hand.kLeft);
  return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
}
public double getLeftJoyY(){
  double raw = DriverStick.getY(Hand.kLeft);
  return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
}

public double getRightJoyX(){
  double raw = DriverStick.getX(Hand.kRight);
  return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
}
public double getRightJoyY(){
  double raw = DriverStick.getY(Hand.kRight);
  return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
}

public double getRightTrigger(){
  double raw = DriverStick.getTriggerAxis(Hand.kRight);
  return Math.abs(.8-raw/2) < JOY_DEADZONE ? 0.0 : .8-raw/2;
}

// Operator Joystick Controls
public double getOperatorLeftJoyX(){
  double raw = OperatorStick.getX(Hand.kLeft);
  return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
}
public double getOperatorLeftJoyY(){
  double raw = OperatorStick.getY(Hand.kLeft);
  return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
}

public double getOperatorRightJoyX(){
  double raw = OperatorStick.getX(Hand.kRight);
  return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
}
public double getOperatorRightJoyY(){
  double raw = OperatorStick.getY(Hand.kRight);
  return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
}
public double getOperatorLeftTrigger(){
  double raw = OperatorStick.getTriggerAxis(Hand.kLeft);
  return Math.abs(raw) < JOY_DEADZONE ? 0.0 : -.7*raw;
}

public double getOperatorRightTrigger(){
  double raw = OperatorStick.getTriggerAxis(Hand.kRight);
  return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
}

  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
