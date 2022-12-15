// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants.SubsystemConstants;
import frc.robot.subsystems.Shooter;

public class StopShoot extends CommandBase {
  final Shooter s_shooter;

  public StopShoot(Shooter sh) {
    s_shooter = sh;
    addRequirements(s_shooter);
  }

  @Override
  public void initialize() {
    s_shooter.shoot();
  }

  @Override
  public void execute() {
    s_shooter.shoot();
    System.out.println(SubsystemConstants.m_shooter.get());
  }

  @Override
  public void end(boolean interrupted) {
    System.out.println("Shoot end");
    s_shooter.stop();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}