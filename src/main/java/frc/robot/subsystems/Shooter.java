// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants.SubsystemConstants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {

 //private final Talon m_shooter;

  public Shooter() {
    //Assigning the CanID 7 to the motorcontroller
    //m_shooter = new Talon(7);
  }


  
  public void shoot(){
    //sets the shooter to full throttle
    SubsystemConstants.m_shooter.set(-1.0);

  }

  public void stop(){
    //sets the shooter to rest
    SubsystemConstants.m_shooter.set(0.0);

  }

  @Override
  public void periodic() {


  }


public void m_shooter(){

  SubsystemConstants.m_shooter.set(-0.5);

}
}