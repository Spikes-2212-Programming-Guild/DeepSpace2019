package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;

public class SubsystemComponents {
	public static class Drivetrain {
		public static final SpeedControllerGroup DRIVETRAIN_LEFT = new SpeedControllerGroup(
				new WPI_TalonSRX(RobotMap.CAN.MOTOR_LEFT1), new WPI_TalonSRX(RobotMap.CAN.MOTOR_LEFT2));

		public static final SpeedControllerGroup DRIVETRAIN_RIGHT = new SpeedControllerGroup(
				new WPI_TalonSRX(RobotMap.CAN.MOTOR_RIGHT1), new WPI_TalonSRX(RobotMap.CAN.MOTOR_RIGHT2));

		public static final Encoder DRIVETRAIN_ENCODER_RIGHT = new Encoder(RobotMap.DIO.DRIVETRAIN_ENCODER_RIGHT1,
				RobotMap.DIO.DRIVETRAIN_ENCODER_RIGHT2);
		public static final Encoder DRIVETRAIN_ENCODER_LEFT = new Encoder(RobotMap.DIO.DRIVETRAIN_ENCODER_LEFT1,
				RobotMap.DIO.DRIVETRAIN_ENCODER_LEFT2);

	}

	public static class Lift {

	}

	public static class Arm {

	}

	public static class Lock {

	}

	public static class Latch {

	}

	public static class Gripper {
		public static final VictorSP MOTOR_1 = new VictorSP(RobotMap.PWM.GRIPPER_MOTOR_1);
		public static final VictorSP MOTOR_2 = new VictorSP(RobotMap.PWM.GRIPPER_MOTOR_2);
		public static final AnalogInput LIGHT_SENSOR = new AnalogInput(RobotMap.ANALOG.LIGHT_SENSOR);
		public static final DigitalInput LIMIT = new DigitalInput(RobotMap.DIO.LIMIT);
	}
}
