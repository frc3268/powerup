/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team3268.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	// declare mappings for PWM, analog input, etc
	
	public static int PWM_driveLeftFront 	= 8;
	public static int PWM_driveLeftBack 	= 9;
	public static int PWM_driveRightFront 	= 1;
	public static int PWM_driveRightBack 	= 0;
	
	public static int PWM_shooterTopLeft 		= 7;
	public static int PWM_shooterBottomLeft		= 6;
	public static int PWM_shooterTopRight		= 3;
	public static int PWM_shooterBottomRight	= 2;
	
}
