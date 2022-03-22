package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.SubsystemConstants;
//import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
//import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;


public class Intake extends SubsystemBase {
  //private Victor s_intake;

  //private PWMSparkMax s_intake;


  public Intake() {
    //s_intake = new PWMSparkMax(6);
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




