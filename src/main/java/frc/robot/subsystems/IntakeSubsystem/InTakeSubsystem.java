// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.IntakeSubsystem;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class InTakeSubsystem extends SubsystemBase {
  /** Creates a new ClimberSubsystem. */
  TalonSRX m_inTake = new TalonSRX(Constants.CanConstants.kintakeMotor);

  
  
  public InTakeSubsystem() {
    m_inTake.configFactoryDefault();

  }

  public void intake(double speed){
    m_inTake.set(ControlMode.PercentOutput, speed);

  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
