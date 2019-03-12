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
import frc.robot.commands.ScissorLiftDrive;

/**
 * Add your docs here.
 */
public class ScissorLift extends Subsystem {

  private TalonSRX LeftScissor;
  private TalonSRX RightScissor;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
public ScissorLift(){
LeftScissor = new TalonSRX(RobotMap.LEFT_SCISSOR.value);
RightScissor = new TalonSRX(RobotMap.RIGHT_SCISSOR.value);

Robot.initTalon(LeftScissor);
Robot.initTalon(RightScissor);
RightScissor.follow(LeftScissor);

LeftScissor.setInverted(true);

}

public void set(ControlMode mode, double leftvalue){

  LeftScissor.set(mode, leftvalue);
}


  @Override
  public void initDefaultCommand() {

    setDefaultCommand(new ScissorLiftDrive());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
