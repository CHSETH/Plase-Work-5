package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.AutonCommand;
import frc.robot.commands.IntakeIn;
import frc.robot.commands.Shoot;
import frc.robot.commands.IntakeOut;
import frc.robot.commands.conveyorIn;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Conveyor;


public class RobotContainer {

  private final DriveTrain s_drivetrain = new DriveTrain();
  private final Intake s_intake = new Intake();
  private final Shooter s_shooter = new Shooter();
  private final Joystick c_joystick = new Joystick(0);
  private final Conveyor v_conveyor = new Conveyor();


  public RobotContainer() {
    configureButtonBindings();

    s_drivetrain.setDefaultCommand(
      new DriveCommand(
        s_drivetrain, () -> c_joystick.getRawAxis(1)*-1, () -> c_joystick.getRawAxis(0)*-1, () -> c_joystick.getRawAxis(2)));

  }


  private void configureButtonBindings() {

    JoystickButton IntakeUpButton = new JoystickButton(c_joystick, 3);
    JoystickButton IntakeDownButton = new JoystickButton(c_joystick, 4);
    JoystickButton ShootButton = new JoystickButton(c_joystick,6);
    JoystickButton Conveyor = new JoystickButton(c_joystick, 1);

    IntakeUpButton.whileHeld(new IntakeIn(s_intake));
    IntakeDownButton.whileHeld(new IntakeOut(s_intake));
    ShootButton.whileHeld(new Shoot(s_shooter));
    Conveyor.whileHeld(new conveyorIn(v_conveyor));

  }

  public Command getAutonomousCommand() {

    AutonCommand m_autoCommand = new AutonCommand(s_drivetrain);

    return m_autoCommand;

  }


}


