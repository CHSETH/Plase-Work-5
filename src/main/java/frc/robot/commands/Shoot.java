// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

public class Shoot extends CommandBase {
  final Shooter s_shooter;

  public Shoot(Shooter sh) {
    s_shooter = sh;
    addRequirements(s_shooter);
  }

  @Override
  public void initialize() {
    System.out.println("Shoot1");
    s_shooter.shoot();
  }

  @Override
  public void execute() {
    s_shooter.shoot();
  }

  @Override
  public void end(boolean interrupted) {
    System.out.println("Shoot2");
    s_shooter.shoot();
  }

  @Override
  public boolean isFinished() {
    System.out.println("Shoot3");
    return false;
  }
}

