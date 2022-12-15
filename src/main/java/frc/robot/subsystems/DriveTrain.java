// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
//import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import frc.robot.Constants.SubsystemConstants;

//Public class for the DriveTrain
public class DriveTrain extends SubsystemBase {
  //Declares the type of Drive as Mechanum
  private final MecanumDrive mecDrive;

  public DriveTrain() {
    // Assiging the motors to CanId's 1,2,3,and 4 respectively
    
    // Assigns the 4 motors to a Mechanum Drive
    mecDrive = new MecanumDrive(SubsystemConstants.m_leftMotor_front, SubsystemConstants.m_leftMotor_back, SubsystemConstants.m_rightMotor_front, SubsystemConstants.m_rightMotor_back);
  }

  public void drive(double xspeed, double yspeed, double rotation) {
    // Lets the controllers joystick values dictate the throttle of the MechanumDrive
    mecDrive.driveCartesian(xspeed, yspeed, rotation);
  }

  public void stop() {
    // Sets the MecanumDrive to rest when there is no input from the Joysticks
    mecDrive.driveCartesian(0, 0, 0);
  }

  @Override
  public void periodic() {} 

  public void joystickDrive() {}
}