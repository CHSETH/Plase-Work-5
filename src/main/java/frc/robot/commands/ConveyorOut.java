// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Conveyor;

public class ConveyorOut extends CommandBase {
  private final Conveyor v_conveyor;

  public ConveyorOut(Conveyor conveyor) {
    v_conveyor = conveyor;
    addRequirements(v_conveyor);
  }

  @Override
  public void initialize() {
    v_conveyor.lower();
  }
  
  @Override
  public void execute() {
    v_conveyor.lower();
  }

  @Override
  public void end(boolean interrupted) {
    v_conveyor.stop();
  }
  
  @Override
  public boolean isFinished() {
    return false;
  }
}