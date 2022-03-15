// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants.SubsystemConstants;
import edu.wpi.first.math.filter.SlewRateLimiter;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Shooter extends SubsystemBase {
  public Shooter() {}
  
  public void shoot() {
    //sets the shooter to full throttle
    System.out.println("Shoot set -1.0");
    SlewRateLimiter rampUp = new SlewRateLimiter(-0.05);
    SubsystemConstants.m_shooter.set(-0.5);
    System.out.println(SubsystemConstants.m_shooter.get());
  }

  public void stop() {
    //sets the shooter to rest
    System.out.println("Shoot set 0.0");
    SubsystemConstants.m_shooter.set(0.0);
    System.out.println(SubsystemConstants.m_shooter.get());
    
  }

  @Override
  public void periodic() {}

  public void m_shooter() {
    System.out.println("m_shooter() or something");
    SubsystemConstants.m_shooter.set(-0.5);
  }
}