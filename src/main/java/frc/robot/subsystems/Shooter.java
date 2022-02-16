// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
//import edu.wpi.first.wpilibj.motorcontrol.Talon;

public class Shooter extends SubsystemBase {

  private final Talon m_shooter;

  public Shooter() {

    m_shooter = new Talon(4);
  }


  
  public void shoot(){

    m_shooter.set(-1.0);

  }

  public void stop(){

    m_shooter.set(0.0);

  }

  @Override
  public void periodic() {


  }


public void m_shooter(){

  m_shooter.set(-0.5);

}
}