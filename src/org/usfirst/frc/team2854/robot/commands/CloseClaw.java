package org.usfirst.frc.team2854.robot.commands;

import org.usfirst.frc.team2854.robot.Robot;


import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class CloseClaw extends Command {

    public CloseClaw() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.claw);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(0.9); //time for claw to close
    	Robot.claw.closeClaw();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.claw.stopClaw();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
