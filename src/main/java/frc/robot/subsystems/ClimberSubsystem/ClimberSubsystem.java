// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.ClimberSubsystem;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class ClimberSubsystem extends SubsystemBase {
  /** Creates a new ClimberSubsystem. */
  TalonSRX m_Climber = new TalonSRX(Constants.CanConstants.kclimberMotor);

  
  
  public ClimberSubsystem() {
    m_Climber.configFactoryDefault();

  }

  public void climb(double speed){
    m_Climber.set(ControlMode.PercentOutput, speed);

  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
