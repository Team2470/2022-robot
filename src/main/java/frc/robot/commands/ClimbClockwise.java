// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.FrontClimber;

public class ClimbClockwise extends CommandBase {

  private Climber m_climber;
  /** Creates a new ForwardClimbClockwise. */
  public ClimbClockwise(Climber climber) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_climber = climber;

    addRequirements(m_climber);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    System.out.println("Forward");
    m_climber.startClimbMotor(Constants.kClockwise, Constants.kClimberSpeed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_climber.stopClimbMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}