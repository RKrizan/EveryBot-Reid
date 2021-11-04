// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.DriveSubsystem;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */
  TalonSRX m_rightDrive1 = new TalonSRX(Constants.CanConstants.kdriveMotorRight1);
  TalonSRX m_rightDrive2 = new TalonSRX(Constants.CanConstants.kdriveMotorRight2);
  TalonSRX m_leftDrive1 = new TalonSRX(Constants.CanConstants.kdriveMotorLeft1);
  TalonSRX m_leftDrive2 = new TalonSRX(Constants.CanConstants.kdriveMotorLeft2);


  public DriveSubsystem() {
    m_rightDrive1.configFactoryDefault();
    m_rightDrive2.configFactoryDefault();
    m_leftDrive1.configFactoryDefault();
    m_leftDrive2.configFactoryDefault();

    m_leftDrive1.setInverted(true);
    m_leftDrive2.setInverted(true);

   m_leftDrive2.follow(m_leftDrive1);
   m_rightDrive2.follow(m_rightDrive1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void driveRight(double speed){
    m_rightDrive1.set(ControlMode.PercentOutput, speed);

  }
  public void driveLeft(double speed){
    m_leftDrive1.set(ControlMode.PercentOutput, speed);

  }



}
