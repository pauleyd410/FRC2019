/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.GTADrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  private TalonSRX motorLeft1 = new TalonSRX(RobotMap.MotorLeft1Value);
  private TalonSRX motorRight1 = new TalonSRX(RobotMap.MotorRight1Value);
  private TalonSRX motorLeft2 = new TalonSRX(RobotMap.MotorLeft2Value);
  private TalonSRX motorRight2 = new TalonSRX(RobotMap.MotorRight2Value);

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new GTADrive());
  }

  
public void setLeftMotors(double speed) {
  motorLeft1.set(ControlMode.PercentOutput, -speed);
  motorLeft2.set(ControlMode.PercentOutput, -speed);
}


public void setRightMotors(double speed) {
  motorRight1.set(ControlMode.PercentOutput, speed);
  motorRight2.set(ControlMode.PercentOutput, speed);
}


}
