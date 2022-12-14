// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Climber;

public class Retract extends CommandBase {
  public final Climber s_climber;
  /** Creates a new Retract. */
  public Retract(Climber C) {
    s_climber = C;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    s_climber.retract();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    s_climber.retract();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    s_climber.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
