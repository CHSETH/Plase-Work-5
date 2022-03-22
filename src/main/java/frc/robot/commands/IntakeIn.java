package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class IntakeIn extends CommandBase {
  private final Intake s_Shlorper;

  public IntakeIn(Intake Shlorper) {

    s_Shlorper = Shlorper;
    
    addRequirements(s_Shlorper);

  }

  @Override
  public void initialize() {
    s_Shlorper.stop();
  }

  @Override
  public void execute() {
    s_Shlorper.lift();
  }

  @Override
  public void end(boolean interrupted) {
    s_Shlorper.stop();
  }
}
