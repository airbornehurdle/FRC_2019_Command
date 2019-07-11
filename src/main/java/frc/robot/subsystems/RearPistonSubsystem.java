/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.RearPistons_Command;


public class RearPistonSubsystem extends Subsystem {

  public static DoubleSolenoid rearPistons = new DoubleSolenoid(2,3);

  public void RearPiston() {
    rearLower();
  }

  // Raise the two rear pistons 
  public void rearRaise() {
    rearPistons.set(DoubleSolenoid.Value.kForward);

  }

  // Lower the two rear pistons
  public void rearLower() {
    rearPistons.set(DoubleSolenoid.Value.kReverse);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new RearPistons_Command());
  }
}
