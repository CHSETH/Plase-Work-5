package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Intake extends SubsystemBase {

  private WPI_VictorSPX s_intake;

  public Intake() {
    s_intake = new WPI_VictorSPX(5);
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




