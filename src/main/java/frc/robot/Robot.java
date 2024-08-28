// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.hal.PWMJNI;
/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */

   private Spark leftMotor1 = new Spark(5);
   private Spark leftMotor2 = new Spark(6);
   private Spark rightMotor1 = new Spark(2);
   private Spark rightMotor2 = new Spark(3);
   private Joystick Joystick1 = new Joystick(0);
   // private Spark Led_Strips = new Spark(7);

  @Override
  public void robotInit() {
  //  Led_Strips.set(-0.25);
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {
  //  Led_Strips.set(-0.25);
  }

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {
  //  Led_Strips.set(-0.25);
  }

  @Override
  public void teleopPeriodic() {
    
    
    double speed = Joystick1.getRawAxis(4);
    double turn = -Joystick1.getRawAxis(1);

    double left = speed + turn;
    double right = speed - turn;

    leftMotor1.set(left);
    leftMotor2.set(left);
    rightMotor1.set(right);
    rightMotor2.set(right);
  }

  @Override
  public void disabledInit() {
  //  Led_Strips.set(-0.25);
  }

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {
  //  Led_Strips.set(-0.25);
  }

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {
  //  Led_Strips.set(-0.25);
  }

  @Override
  public void simulationPeriodic() {}
}
