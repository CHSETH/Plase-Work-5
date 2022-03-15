package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SubsystemConstants;
//import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


public class Intake extends SubsystemBase {
  //private Victor s_intake;

  public Intake() {
    //Assigning the CanID 5 to the motorcontroller
  }


  @Override
  public void periodic() {}

  public void lift() {
    //sets the intake to run at half throttle
    SubsystemConstants.s_intake.set(0.50);
  }

  public void lower() {
    //sets the intake to ran at half throttle in reverse
    SubsystemConstants.s_intake.set(-0.50);
  }


  public void stop() {
    SubsystemConstants.s_intake.set(0.0);
  }
}




