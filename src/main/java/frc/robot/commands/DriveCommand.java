package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;
import java.util.function.DoubleSupplier;

public class DriveCommand extends CommandBase{
  private final DriveTrain drivetrain;
  private final DoubleSupplier xAxis;
  private final DoubleSupplier yAxis;
  private final DoubleSupplier zAxis;

  public DriveCommand(DriveTrain dt, DoubleSupplier x, DoubleSupplier y, DoubleSupplier rot) {
    drivetrain = dt;
    xAxis = x;
    yAxis = y;
    zAxis = rot;

    addRequirements(drivetrain);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
	  drivetrain.drive(xAxis.getAsDouble(), yAxis.getAsDouble(), zAxis.getAsDouble());
  }

  @Override
  public void end(boolean interrupted) {
    drivetrain.stop();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}