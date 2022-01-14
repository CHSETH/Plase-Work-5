// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Conveyor extends SubsystemBase {
  
  private WPI_VictorSPX v_conveyor;

  public Conveyor() {
    v_conveyor = new WPI_VictorSPX(6);
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
