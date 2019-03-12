/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.CascadeLiftDrive;

/**
 * Add your docs here.
 */
public class CascadeLift extends Subsystem {
private TalonSRX CascadeMotor;

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public CascadeLift(){
    CascadeMotor = new TalonSRX(RobotMap.CASCADE_MOTOR.value);

    Robot.initTalon(CascadeMotor);
    CascadeMotor.setNeutralMode(NeutralMode.Brake);

  }

  public void set(ControlMode mode, double cascadevalue){

    CascadeMotor.set(mode, cascadevalue);
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new CascadeLiftDrive());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    
  }
}
