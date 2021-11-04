// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.ArmSubsystem;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class ArmSubsystem extends SubsystemBase {
  /** Creates a new ArmSubsystem. */
  TalonSRX m_Arm = new TalonSRX(Constants.CanConstants.karmMotor);

  
  
  public ArmSubsystem() {
    m_Arm.configFactoryDefault();

  }

  public void arm(double speed){
    m_Arm.set(ControlMode.PercentOutput, speed);

  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
