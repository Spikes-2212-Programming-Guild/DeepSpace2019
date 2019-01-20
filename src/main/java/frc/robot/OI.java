/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI /*GEVALD*/ {
    public OI() { }

    private Joystick leftJoystick = new Joystick(1);
    private Joystick rightJoystick = new Joystick(0);
    private JoystickButton push =new JoystickButton(leftJoystick, 0);
    private JoystickButton take =new JoystickButton(leftJoystick, 1);

	public static double adjustInput(double speed) {
		return speed * Math.abs(speed);
	}
	
	public double getLeftJoystickX(){
		return -adjustInput(leftJoystick.getX());
	}
	
	public double getLeftJoystickY(){
		return -adjustInput(leftJoystick.getY());
	}
	
	public double getRightJoystickX(){
		return -adjustInput(rightJoystick.getX());
	}
	
	public double getRightJoystickY(){
		return -adjustInput(rightJoystick.getY());
	}
	public double push() {
		return SubsystemConstants.Gripper.OUT_SPEED.get();
	}
	
	public double take() {
		return SubsystemConstants.Gripper.GRIP_SPEED.get();
	}
    }