/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.Utilities;



public class GTADrive extends Command {
  public GTADrive() {
    // Use requires() here to declare subsystem dependencies
    super.requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //get driver input
    double triggerVal = Robot.m_oi.GetDriverRawAxis(RobotMap.RightTrigger)
        - Robot.m_oi.GetDriverRawAxis(RobotMap.LeftTrigger);
    double stick = Utilities.scale(Robot.m_oi.GetDriverRawAxis(RobotMap.LeftStickXValue), RobotMap.TurningRate);
    
    Robot.driveTrain.setLeftMotors(triggerVal + stick);
    Robot.driveTrain.setRightMotors(triggerVal - stick);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.driveTrain.setLeftMotors(0); 
    Robot.driveTrain.setRightMotors(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.driveTrain.setLeftMotors(0); // ensure motors stop
    Robot.driveTrain.setRightMotors(0);
  }

public void setExpiration(double d) {
}
}
