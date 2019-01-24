/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.spikes2212.genericsubsystems.basicSubsystem.commands.MoveBasicSubsystem;
import com.spikes2212.genericsubsystems.basicSubsystem.commands.MoveBasicSubsystemWithPID;
import com.spikes2212.utils.XboXUID;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.Trigger;
import frc.robot.SubsystemComponents;

public class OI /* GEVALD */ {
	private XboXUID xbox = new XboXUID(2);
	private Joystick leftJoystick = new Joystick(1);
	private Joystick rightJoystick = new Joystick(0);
	private Button moveArmForward = xbox.getBlueButton();
	private Button moveArmBackwards = xbox.getRedButton();
	private Button closeLatch = xbox.getGreenButton();
	private Button throwBall = xbox.getYellowButton(); 
	private Button moveArmToAngle = xbox.getDownButton();
	public OI() {
		moveArmForward.whenPressed(new MoveBasicSubsystem(Robot.arm, SubsystemConstants.Arm.ARM_SPEED));
		moveArmBackwards.whenPressed(new MoveBasicSubsystem(Robot.arm, SubsystemConstants.Arm.ARM_SPEED_BACKWARDS));
		closeLatch.whileHeld(new MoveBasicSubsystem(Robot.latch, SubsystemConstants.Latch.LATCH_SPEED));
		throwBall.whileHeld(new MoveBasicSubsystem(Robot.gripper, SubsystemConstants.Gripper.OUT_SPEED));
		moveArmToAngle.whenPressed(new MoveBasicSubsystemWithPID(Robot.arm, SubsystemComponents.Arm.POTENTIO, SubsystemConstants.Arm.ANGLE,SubsystemConstants.Arm.ARM_SETTINGS));
		
	}


	
	
	
	public static double adjustInput(double speed) {
		return speed * Math.abs(speed);
	}

	public double getLeftJoystickX() {
		return -adjustInput(leftJoystick.getX());
	}

	public double getLeftJoystickY() {
		return -adjustInput(leftJoystick.getY());
	}

	public double getRightJoystickX() {
		return -adjustInput(rightJoystick.getX());
	}

	public double getRightJoystickY() {
		return -adjustInput(rightJoystick.getY());
	}
	
}