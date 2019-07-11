/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.FrontPiston_Command;



public class FrontPistonSubsystem extends Subsystem {

public static DoubleSolenoid frontPistons = new DoubleSolenoid(0,1);


public FrontPistonSubsystem() {
  frontLower();
}

// Raise the two front pistons
public void frontRaise() {
  frontPistons.set(DoubleSolenoid.Value.kForward);

}

// Lowers the two front pistons
public void frontLower() {
  frontPistons.set(DoubleSolenoid.Value.kReverse);

}



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new FrontPiston_Command());
  }
}
