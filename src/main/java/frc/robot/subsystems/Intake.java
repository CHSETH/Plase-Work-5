package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.Victor;

public class Intake extends SubsystemBase {

  private Victor s_intake;

  public Intake() {
    s_intake = new Victor(5);
  }

  @Override
  public void periodic() {

  }

  public void lift(){
    s_intake.set(0.50);

  }

  public void lower(){

    s_intake.set(-0.50);

  }


  public void stop(){

    s_intake.set(0.0);

  }


}




