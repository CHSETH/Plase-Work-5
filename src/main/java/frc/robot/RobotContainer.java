package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.AutonCommand;
import frc.robot.commands.ConveyorIn;
import frc.robot.commands.IntakeIn;
import frc.robot.commands.Shoot;
import frc.robot.commands.IntakeOut;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Conveyor;


public class RobotContainer {

  //The Subsystems
  private final DriveTrain s_drivetrain = new DriveTrain();
  private final Intake s_intake = new Intake();
  private final Shooter s_shooter = new Shooter();
  private final Conveyor v_conveyor = new Conveyor();
  //The Joystick
  private final Joystick c_joystick = new Joystick(0);

  public RobotContainer() {
    configureButtonBindings();

    //The DriveTrain
    s_drivetrain.setDefaultCommand(
      new DriveCommand(
        s_drivetrain, () -> c_joystick.getRawAxis(1)*-1, () -> c_joystick.getRawAxis(0)*-1, () -> c_joystick.getRawAxis(2)));

  }


  private void configureButtonBindings() {

    /*JoystickButton IntakeUpButton = new JoystickButton(c_joystick, 3);
    JoystickButton IntakeDownButton = new JoystickButton(c_joystick, 4);
    JoystickButton ShootButton = new JoystickButton(c_joystick,7);
    JoystickButton Conveyor = new JoystickButton(c_joystick, 1);

    IntakeUpButton.whileHeld(new IntakeIn(s_intake));
    IntakeDownButton.whileHeld(new IntakeOut(s_intake));
    ShootButton.whileHeld(new Shoot(s_shooter));
    Conveyor.whileHeld(new ConveyorIn(v_conveyor));*/

    /*You can use either the above method or the below method to declare and assign button
    values to commands*/

    //run the shooter while button 7 is held on the joystick
    new JoystickButton(c_joystick, 7).whileHeld(new Shoot(s_shooter));
    //run the intake while button 3 is held on the joystick
    new JoystickButton(c_joystick, 3).whileHeld(new IntakeIn(s_intake));
    //reverse the intake while button 4 is held on the joystick
    new JoystickButton(c_joystick, 4).whileHeld(new IntakeOut(s_intake));
    //runs the conveyor while button 1 is held on the joystick
    new JoystickButton(c_joystick, 1).whileHeld(new ConveyorIn(v_conveyor));

  }

  public Command getAutonomousCommand() {

    AutonCommand m_autoCommand = new AutonCommand(s_drivetrain);

    return m_autoCommand;

  }


}


