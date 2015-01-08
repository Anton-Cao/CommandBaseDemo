package org.usfirst.frc.team2854.robot.subsystems;

import org.usfirst.frc.team2854.robot.RobotMap;
import org.usfirst.frc.team2854.robot.commands.LiftUp;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lift extends Subsystem {
    Talon lift;
    
    public Lift(){
    	lift = new Talon(RobotMap.Lift.LIFT_TALON);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void liftUp(){
    	lift.set(1.0);
    }
    
    public void liftDown(){
    	lift.set(-1.0);
    }
    
    public void liftStop(){
    	lift.set(0.0);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new LiftUp());
    }
}

