package org.usfirst.frc.team2854.robot.subsystems;

import org.usfirst.frc.team2854.robot.RobotMap;
import org.usfirst.frc.team2854.robot.commands.OpenClaw;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Claw extends Subsystem {
	
	Talon clawTalon;
    
	public Claw(){
		clawTalon = new Talon(RobotMap.Claw.CLAW_TALON);
	}
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public void openClaw(){
		clawTalon.set(1.0);
	}
	
	public void closeClaw(){
		clawTalon.set(-1.0);
	}
	
	public void stopClaw(){
		clawTalon.set(0.0);
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new OpenClaw());
    }
}

