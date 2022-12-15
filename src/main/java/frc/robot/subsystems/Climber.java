// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants.SubsystemConstants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase {
  
  public Climber() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void extend(){
    SubsystemConstants.m_climber.set(0.7);
    SubsystemConstants.m_climber2.set(-0.7);
  }

  public void stop(){
    SubsystemConstants.m_climber.set(0.0);
    SubsystemConstants.m_climber2.set(0.0);
  }

  public void retract(){
    SubsystemConstants.m_climber.set(-1.0);
    SubsystemConstants.m_climber2.set(1.0);
  } 
}