// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import frc.robot.Constants.SubsystemConstants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.MecanumDrive;


public class bigBrother extends SubsystemBase {

  private final MecanumDrive mecDrive2;
  /** Creates a new bigBrother. */
  public bigBrother() {
    mecDrive2 = new MecanumDrive(SubsystemConstants.m_leftMotor_front, SubsystemConstants.m_rightMotor_front, SubsystemConstants.m_leftMotor_back, SubsystemConstants.m_rightMotor_back);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
}
