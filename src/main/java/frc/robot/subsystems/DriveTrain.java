// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


public class DriveTrain extends SubsystemBase {
  //Declares the 4 motors to be used by the DriveTrain
  private final WPI_VictorSPX m_leftMotor_front;
  private final WPI_VictorSPX m_rightMotor_front;
  private final WPI_VictorSPX m_leftMotor_back;
  private final WPI_VictorSPX m_rightMotor_back;
  //Declares the type of Drive as Mechanum
  private final MecanumDrive mecDrive;

  public DriveTrain() {
    //Assiging the motors to CanId's 1,2,3,and 4 respectively
    m_leftMotor_front = new WPI_VictorSPX(3);
    m_rightMotor_front = new WPI_VictorSPX(1);
    m_leftMotor_back = new WPI_VictorSPX(4);
    m_rightMotor_back = new WPI_VictorSPX(2);

    //Assigns the 4 motors to a Mechanum Drive
    mecDrive = new MecanumDrive(m_leftMotor_front, m_rightMotor_front, m_leftMotor_back, m_rightMotor_back);
  }

  public void drive(double xspeed, double yspeed, double rotation) {
    //Lets the controllers joystick values dictate the throttle of the MechanumDrive
    mecDrive.driveCartesian(xspeed, yspeed, rotation);
  }

  public void stop() {
    //Sets the MechanumDrive to rest when there is no input from the Joysticks
    mecDrive.driveCartesian(0, 0, 0);
  }

  @Override
  public void periodic() {} 

  public void joystickDrive() {}
}
