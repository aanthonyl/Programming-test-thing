package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;

public class IO {
	public static Victor Shooter = new Victor(0);
	public static Victor Conveyor = new Victor(1);
	public static Victor Agitator = new Victor(2);
	public static Victor Vibrator = new Victor(3);
	public static Victor Snorfler = new Victor(4);

	public static Victor leftfrontDrive = new Victor(5);
	public static Victor leftrearDrive = new Victor(6);
	public static Victor rightfrontDrive = new Victor(7);
	public static Victor rightrearDrive = new Victor(8);

	public static Joystick leftJoysick = new Joystick(0);
	public static Joystick rightJoystick = new Joystick(1);
	public static Joystick coJoystick = new Joystick(2);

}
