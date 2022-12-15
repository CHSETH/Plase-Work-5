package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class IntakeOut extends CommandBase {
  private final Intake s_intake;
  double distance;

  public IntakeOut(Intake intake) {
    s_intake = intake;
    addRequirements(s_intake);
  }

  @Override
  public void initialize() {
    s_intake.stop();
  }

  @Override
  public void execute() {
    s_intake.lower();
  }

  @Override
  public void end(boolean interrupted) {
    s_intake.stop();
  }  
}