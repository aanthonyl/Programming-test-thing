package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {

	shooter shooter = new shooter(IO.Shooter, IO.Conveyor, IO.Agitator, IO.Vibrator, IO.Snorfler);
	Drive drive = new Drive(IO.leftfrontDrive, IO.rightfrontDrive, IO.leftrearDrive, IO.rightrearDrive);
	
	@Override
	public void robotInit() {
	
	}

	@Override
	public void autonomousInit() {
		drive.init();
		shooter.init();
	}

	@Override
	public void autonomousPeriodic() {
		drive.autoUpdate();
	}

	@Override
	public void teleopInit() {
		shooter.init();
		drive.init();
	}

	@Override
	public void teleopPeriodic() {
		shooter.update();
	}

	@Override
	public void testPeriodic() {
	}
}
