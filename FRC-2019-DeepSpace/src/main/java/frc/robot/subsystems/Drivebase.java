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
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class Drivebase extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private TalonSRX LeftMotor;
  private TalonSRX LeftMotorFollower;
  private TalonSRX RightMotor;
  private TalonSRX RightMotorFollower;


  public Drivebase(){
    LeftMotor = new TalonSRX(RobotMap.LEFT_MOTOR.value);
    LeftMotorFollower = new TalonSRX(RobotMap.LEFT_FOLLOW_MOTOR.value);
    RightMotor = new TalonSRX(RobotMap.RIGHT_MOTOR.value);
    RightMotorFollower = new TalonSRX(RobotMap.RIGHT_FOLLOW_MOTOR.value);

    Robot.initTalon(LeftMotor);
    Robot.initTalon(RightMotor);
    Robot.initTalon(LeftMotorFollower);
    Robot.initTalon(RightMotorFollower);

    LeftMotorFollower.follow(LeftMotor);
    RightMotorFollower.follow(RightMotor);

   // RightMotor.setInverted(true);
   // LeftMotor.setInverted(true);
  

  }

public void set(ControlMode mode, double leftvalue, double rightvalue){
LeftMotor.set(mode, -leftvalue);
RightMotor.set(mode, rightvalue);

}

  @Override
  public void initDefaultCommand() {

    setDefaultCommand(new TankDrive());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
