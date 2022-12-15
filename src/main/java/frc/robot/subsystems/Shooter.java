// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants.SubsystemConstants;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Shooter extends SubsystemBase {
  MotorControllerGroup shooter = new MotorControllerGroup(SubsystemConstants.m_shooter, SubsystemConstants.m_shooter2);
  public Shooter() {}
  
  public void shoot() {
    // sets the shooter to full throttle
    shooter.set(0.90);
    System.out.println(SubsystemConstants.m_shooter.get());
  }

  public void reverse(){
    shooter.set(-0.9);
  }

  public void stop() {
    // sets the shooter to rest
    shooter.set(0.0);
    System.out.println(SubsystemConstants.m_shooter.get());
  }

  @Override
  public void periodic() {}

  public void slowShoot() {
    shooter.set(-0.5);
  }
}