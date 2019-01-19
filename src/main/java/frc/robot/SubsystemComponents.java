package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class SubsystemComponents {
	public static class Drivetrain {
		public static final SpeedControllerGroup DRIVETRAIN_LEFT = new SpeedControllerGroup(
				new WPI_TalonSRX(RobotMap.CAN.MOTOR_LEFT_UP), new WPI_TalonSRX(RobotMap.CAN.MOTOR_LEFT_DOWN));

		public static final SpeedControllerGroup DRIVETRAIN_RIGHT = new SpeedControllerGroup(
				new WPI_TalonSRX(RobotMap.CAN.MOTOR_RIGHT_UP), new WPI_TalonSRX(RobotMap.CAN.MOTOR_RIGHT_DOWN));
	}
}
