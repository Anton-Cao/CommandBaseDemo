package org.usfirst.frc.team2854.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team2854.robot.Robot;

/**
 *
 */
public class OpenClaw extends Command {

    public OpenClaw() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.claw);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(0.9); //time for claw to open
    	Robot.claw.openClaw();
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
