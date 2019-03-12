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
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.BallPickupDrive;

/**
 * Add your docs here.
 */
public class BallPickup extends Subsystem {
  private TalonSRX BallMotor;


  // Put methods for controlling this subsystem
  // here. Call these from Commands.

public BallPickup(){

  BallMotor = new TalonSRX(RobotMap.BALL_MOTOR.value);

  Robot.initTalon(BallMotor);
}

public void set(ControlMode mode, double ballvalue) {
  
  BallMotor.set(mode, ballvalue);
}

  @Override
  public void initDefaultCommand() {

    setDefaultCommand(new BallPickupDrive());

    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
