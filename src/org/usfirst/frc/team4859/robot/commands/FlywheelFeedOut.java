package org.usfirst.frc.team4859.robot.commands;

import org.usfirst.frc.team4859.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FlywheelFeedOut extends Command {

    public FlywheelFeedOut() {
    	requires(Robot.launcher);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.launcher.FlywheelFeedOut();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.launcher.FlywheelFeedOut();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.launcher.FlywheelFeedStop();

    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
