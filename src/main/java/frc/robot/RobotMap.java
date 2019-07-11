/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {


  // PMW
  // Motors
  public static int leftFrontMotor = 1; 
  public static int leftRearMotor = 3;
  
  public static int rightFrontMotor = 0;
  public static int rightRearMotor = 2;

  //Elevator
  public static int elevatorMotor = 1;


  //Base
  
  //Intake
  public static int intakeMotor1 = 0;
  public static int intakeMotor2 = 2;


  //DIO




  //CAN 
  public static Compressor compressor = new Compressor(0);



  //USB
  public static int joystickPort0 = 0;
  public static int joystickPort1 = 1;
  public static int joystickPort2 = 2; 



  // Other DriveTrain Constants












  //Links to Resources
  //https://wpilib.screenstepslive.com/s/currentCS/m/cpp/l/241866-operating-pneumatic-cylinders-solenoids
  //

  //If you need any help with coding, refer to Discord chat or ChiefDelphi
  // chiefdelphi.com 



  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
