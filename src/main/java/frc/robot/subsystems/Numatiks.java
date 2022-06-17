// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SubsystemConstants;

public class Numatiks extends SubsystemBase {
  DoubleSolenoid sole = new DoubleSolenoid(PneumaticsModuleType.CTREPCM,0,1);
  @Override
  public void periodic() {}

  public void out() {
    sole.set(Value.kForward);
  }

  public void in() {
    sole.set(Value.kReverse);
  }
}