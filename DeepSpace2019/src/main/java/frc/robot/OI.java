/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.spikes2212.utils.XboXUID;

import edu.wpi.first.wpilibj.Joystick;

public class OI /* GEVALD */ {

	private Joystick driverRight = new Joystick(0);
	private Joystick driverLeft = new Joystick(1);

	private XboXUID navigator = new XboXUID(2);

	public OI() {

	}

	public static double adjustInput(double speed) {
		return speed * Math.abs(speed);
	}
	
	public double getLeftJoystickX(){
		return -adjustInput(this.driverLeft.getX());
	}
	
	public double getLeftJoystickY(){
		return -adjustInput(this.driverLeft.getY());
	}
	
	public double getRightJoystickX(){
		return -adjustInput(this.driverRight.getX());
	}
	
	public double getRightJoystickY(){
		return -adjustInput(this.driverRight.getY());
	}
}