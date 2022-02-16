// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Victor;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Conveyor extends SubsystemBase {
  
  private Victor v_conveyor;

  public Conveyor() {
    v_conveyor = new Victor(6);
  }

  @Override
  public void periodic() {

  }

  public void lift(){
    v_conveyor.set(0.50);

  }

  public void lower(){

    v_conveyor.set(-0.50);

  }


  public void stop(){

    v_conveyor.set(0.0);

  }
  
}
