package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SubsystemConstants;


public class Intake extends SubsystemBase {


  public Intake() {
  }


  @Override
  public void periodic() {}

  public void lift() {
    //sets the intake to run at half throttle
    SubsystemConstants.s_intake.set(0.3);
  }

  public void lower() {
    //sets the intake to ran at half throttle in reverse
    SubsystemConstants.s_intake.set(-0.3);
  }


  public void stop() {
    SubsystemConstants.s_intake.set(0.0);
  }
}





