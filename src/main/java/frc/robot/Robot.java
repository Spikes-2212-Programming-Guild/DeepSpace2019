/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.spikes2212.genericsubsystems.basicSubsystem.BasicSubsystem;
import com.spikes2212.genericsubsystems.basicSubsystem.utils.limitationFunctions.TwoLimits;
import com.spikes2212.genericsubsystems.drivetrains.TankDrivetrain;
import com.spikes2212.genericsubsystems.drivetrains.commands.DriveArcade;
import com.spikes2212.utils.InvertedConsumer;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends TimedRobot {
	public static OI oi;
	public static TankDrivetrain drivetrain;
	public static BasicSubsystem Gripper;

	@Override
	public void robotInit() {
		oi = new OI();
		drivetrain = new TankDrivetrain(new InvertedConsumer(SubsystemComponents.Drivetrain.DRIVETRAIN_LEFT::set),
				SubsystemComponents.Drivetrain.DRIVETRAIN_RIGHT::set);
		drivetrain.setDefaultCommand(
				new DriveArcade(drivetrain, () -> oi.getLeftJoystickY(), () -> oi.getRightJoystickX()));
		Gripper = new BasicSubsystem((speed) -> {
			SubsystemComponents.Gripper.MOTOR_1.set(speed);
			SubsystemComponents.Gripper.MOTOR_2.set(-speed);
		}, new TwoLimits(() -> SubsystemComponents.Gripper.LIMIT.get()
				|| SubsystemComponents.Gripper.LIGHT_SENSOR.getVoltage() < 5, () -> false));

	}

	@Override
	public void robotPeriodic() {
	}

	@Override
	public void disabledInit() {
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() {
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic() {
	}
}
