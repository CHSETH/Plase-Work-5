package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.GenericHID;

import frc.robot.commands.DriveCommand;
import frc.robot.commands.AutonCommand;
import frc.robot.commands.ConveyorIn;
import frc.robot.commands.IntakeIn;
import frc.robot.commands.Shoot;
//import frc.robot.commands.StopShoot;
import frc.robot.commands.IntakeOut;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Conveyor;

public class RobotContainer {
  //The Subsystems
  public final DriveTrain s_drivetrain = new DriveTrain();
  public final Intake s_intake = new Intake();
  public final Shooter s_shooter = new Shooter();
  public final Conveyor v_conveyor = new Conveyor();
  //The Joystick
  public final Joystick c_joystick = new Joystick(0);
  public final Joystick c_joystick2 = new Joystick(2);
  //public final GenericHID gamepad = new GenericHID(1);

  public RobotContainer() {
    configureButtonBindings();

    //The DriveTrain
    s_drivetrain.setDefaultCommand(
      new DriveCommand(
        s_drivetrain, () -> -c_joystick.getRawAxis(1), () -> c_joystick.getRawAxis(0), () -> c_joystick2.getRawAxis(2)));
  }

  private void configureButtonBindings() {
    JoystickButton IntakeUpButton = new JoystickButton(c_joystick, 3);
    JoystickButton IntakeDownButton = new JoystickButton(c_joystick, 4);
    JoystickButton ShootButton = new JoystickButton(c_joystick,1);
    JoystickButton Conveyor = new JoystickButton(c_joystick, 2);

    IntakeUpButton.whileHeld(new IntakeIn(s_intake));
    IntakeDownButton.whileHeld(new IntakeOut(s_intake));
    ShootButton.whileHeld(new Shoot(s_shooter));
    Conveyor.whileHeld(new ConveyorIn(v_conveyor));

    /*You can use either the above method or the below method to declare and assign button
    values to commands*/

    //sets the shooter to rest when button 8 is pressed on the joystick
    //new JoystickButton(c_joystick, 8).whenPressed(new StopShoot(s_shooter));
    new JoystickButton(c_joystick2, 1).toggleWhenPressed(new Shoot(s_shooter));
    //run the shooter when button 7 is pressed on the joystick
    //new JoystickButton(c_joystick, 1).whileHeld(new Shoot(s_shooter));
    //run the intake while button 3 is held on the joystick
    new JoystickButton(c_joystick2, 3).whileHeld(new IntakeIn(s_intake));
    //reverse the intake while button 4 is held on the joystick
    new JoystickButton(c_joystick2, 4).whileHeld(new IntakeOut(s_intake));
    //runs the conveyor while button 1 is held on the joystick
    new JoystickButton(c_joystick2, 5).whileHeld(new ConveyorIn(v_conveyor));
  }

  public Command getAutonomousCommand() {
    AutonCommand m_autoCommand = new AutonCommand(s_drivetrain);
    return m_autoCommand;
  }
}


