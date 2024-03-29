// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;


import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
//import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;


/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //Declares and Assings the Subsystems motors to CanID's
    public static final class SubsystemConstants {
        public static final WPI_VictorSPX v_conveyor = new WPI_VictorSPX(7);
        public static final WPI_VictorSPX s_intake = new WPI_VictorSPX(8);
        
        public static final WPI_VictorSPX m_shooter = new WPI_VictorSPX(6);
        public static final WPI_VictorSPX m_shooter2 = new WPI_VictorSPX(6);
        
        public static final WPI_VictorSPX m_climber = new WPI_VictorSPX(5);
        public static final WPI_VictorSPX m_climber2 = new WPI_VictorSPX(5);

        public static final WPI_VictorSPX m_leftMotor_front = new WPI_VictorSPX(2);
        public static final WPI_VictorSPX m_rightMotor_front = new WPI_VictorSPX(3);
        public static final WPI_VictorSPX m_leftMotor_back = new WPI_VictorSPX(4);
        public static final WPI_VictorSPX m_rightMotor_back = new WPI_VictorSPX(1);
    }
}