// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants.SubsystemConstants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Conveyor extends SubsystemBase {
  
  //private Victor v_conveyor;

  public Conveyor() {
    //Assigning the CanID 6 to the motorcontroller
    //v_conveyor = new Victor(6);
  }

  @Override
  public void periodic() {

  }

  public void lift(){
    //runs the conveyor at half throttle
    SubsystemConstants.v_conveyor.set(0.50);

  }

  public void lower(){
    //runs the conveyor at half throttle in reverse
    SubsystemConstants.v_conveyor.set(-0.50);

  }


  public void stop(){
    //sets the conveyor to rest
    SubsystemConstants.v_conveyor.set(0.0);

  }
  
}
