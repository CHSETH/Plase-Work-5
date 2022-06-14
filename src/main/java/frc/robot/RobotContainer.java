package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
//import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.GenericHID;

import frc.robot.commands.DriveCommand;
//import frc.robot.commands.Thanks2611;
import frc.robot.commands.ConveyorIn;
import frc.robot.commands.IntakeIn;
import frc.robot.commands.Shoot;
import frc.robot.commands.ConveyorOut;
import frc.robot.commands.StopShoot;
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
  public final Shooter m_shooter = new Shooter();
  public final Conveyor v_conveyor = new Conveyor();
  //The Joystick
  public final Joystick c_joystick = new Joystick(0);
  public final Joystick c_joystick3 = new Joystick(2);
  public final Joystick c_joystick2 = new Joystick(1);
  //The Air Compressor
  Compressor pcmCompressor = new Compressor(0, PneumaticsModuleType.CTREPCM);
  //The Pneumatic Solenoid
  DoubleSolenoid sole = new DoubleSolenoid(PneumaticsModuleType.CTREPCM,0,1);
  //public final GenericHID gamepad = new GenericHID(1);

  public RobotContainer() {
    configureButtonBindings();

    //The DriveTrain
    s_drivetrain.setDefaultCommand(
      new DriveCommand(
        s_drivetrain, () -> -c_joystick.getRawAxis(1), () -> c_joystick.getRawAxis(0), () -> c_joystick2.getRawAxis(2)));
  }

  private void configureButtonBindings() {
    /*You can use either the above method or the below method to declare and assign button
    values to commands*/

    //sets the shooter to rest when button 8 is pressed on the joystick
    //new JoystickButton(c_joystick, 8).toggleWhenPressed(new StopShoot(s_shooter));
    new JoystickButton(c_joystick3, 1).whileHeld(new Shoot(m_shooter));
    //run the shooter when button 7 is pressed on the joystick
    //new JoystickButton(c_joystick, 7).whileHeld(new Shoot(m_shooter));
    //run the intake while button 3 is held on the joystick
    new JoystickButton(c_joystick3, 3).whileHeld(new IntakeIn(s_intake));
    //reverse the intake while button 4 is held on the joystick
    new JoystickButton(c_joystick3, 4).whileHeld(new IntakeOut(s_intake));
    //runs the conveyor while button 1 is held on the joystick
    new JoystickButton(c_joystick3, 5).whileHeld(new ConveyorIn(v_conveyor));
    new JoystickButton(c_joystick3, 6).whileHeld(new ConveyorOut(v_conveyor));
    //new JoystickButton(c_joystick3, 2).whileHeld(new StopShoot(m_shooter));
    //Toggles the Solenoid for the Intake Deployment
    if(c_joystick3.getRawButtonPressed(9) == true){
      sole.set(DoubleSolenoid.Value.kForward);
    } else if(c_joystick3.getRawButtonReleased(9) == true){
      sole.set(DoubleSolenoid.Value.kReverse);
    }
  }

 // public Command getAutonomousCommand() {
    //Thanks2611 s_autoCommand = new Thanks2611();
    //return s_autoCommand;
  //}

  //public Command getAutonomusCommand(){
    //Thanks2611 M_AutonCommand = new Thanks2611();
    //return M_AutonCommand; 
  }

  






