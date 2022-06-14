// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SubsystemConstants;

public class Numatiks extends SubsystemBase {
  @Override
  public void periodic() {}

  public void out() {
    SubsystemConstants.u_num1.set(1.0);
    SubsystemConstants.u_num2.set(0.0);
  }

  public void in() {
    SubsystemConstants.u_num1.set(0.0);
    SubsystemConstants.u_num2.set(1.0);
  }
}