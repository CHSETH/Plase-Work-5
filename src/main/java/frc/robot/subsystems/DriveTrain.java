// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.motorcontrol.Victor;


public class DriveTrain extends SubsystemBase {

  
  private final Victor m_leftMotor_front;
  private final Victor m_rightMotor_front;
  private final Victor m_leftMotor_back;
  private final Victor m_rightMotor_back;
  private final MecanumDrive mecDrive;

  public DriveTrain(){

  m_leftMotor_front = new Victor(4);
  m_rightMotor_front = new Victor(2);
  m_leftMotor_back = new Victor(3);
  m_rightMotor_back = new Victor(1);

  mecDrive = new MecanumDrive(m_leftMotor_front, m_rightMotor_front, m_leftMotor_back, m_rightMotor_back);


  }

  public void drive(double xspeed, double yspeed, double rotation){
    mecDrive.driveCartesian(xspeed, yspeed, rotation);
  }

  public void stop(){
    mecDrive.driveCartesian(0, 0, 0);
  }


  @Override
  public void periodic() {

  } 


  public void joystickDrive() {

  }
  
}
