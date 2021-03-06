package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

public class SubsystemComponents {

	public static class Drivetrain {
		public static final SpeedControllerGroup LEFT = new SpeedControllerGroup(
				new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_MOTOR_LEFT1),
				new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_MOTOR_LEFT2));

		public static final SpeedControllerGroup RIGHT = new SpeedControllerGroup(
				new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_MOTOR_RIGHT1),
				new WPI_TalonSRX(RobotMap.CAN.DRIVETRAIN_MOTOR_RIGHT2));

		public static final Encoder ENCODER_RIGHT = new Encoder(RobotMap.DIO.DRIVETRAIN_ENCODER_RIGHT1,
				RobotMap.DIO.DRIVETRAIN_ENCODER_RIGHT2);
		public static final Encoder ENCODER_LEFT = new Encoder(RobotMap.DIO.DRIVETRAIN_ENCODER_LEFT1,
				RobotMap.DIO.DRIVETRAIN_ENCODER_LEFT2);
	}

	public static class Lift {
		public static final SpeedControllerGroup GEARBOX = new SpeedControllerGroup(
				new WPI_VictorSPX(RobotMap.PWM.LIFT_MOTOR1), new WPI_VictorSPX((RobotMap.PWM.LIFT_MOTOR2)));
		public static final Encoder ENCODER = new Encoder(RobotMap.DIO.LIFT_ENCODER1, RobotMap.DIO.LIFT_ENCODER2);
		public static final DigitalInput LIMIT_UP = new DigitalInput(RobotMap.DIO.LIFT_LIMIT_UP);
		public static final DigitalInput LIMIT_DOWN = new DigitalInput(RobotMap.DIO.LIFT_LIMIT_DOWN);
	}

	public static class Arm {
		public static final VictorSP MOTOR = new VictorSP(RobotMap.PWM.ARM_MOTOR);
		public static final DigitalInput LIMIT1 = new DigitalInput(RobotMap.DIO.ARM_LIMIT1);
		public static final DigitalInput LIMIT2 = new DigitalInput(RobotMap.DIO.ARM_LIMIT2);
		public static final AnalogPotentiometer POTENTIO = new AnalogPotentiometer(RobotMap.ANALOG_IN.ARM_POTENTIOMETER);
	}

	public static class Lock {

	}

	public static class Latch {
		public static final VictorSP MOTOR = new VictorSP(RobotMap.PWM.LATCH_MOTOR);
		public static final DigitalInput LIMIT = new DigitalInput(RobotMap.DIO.LATCH_LIMIT);
	}

	public static class Gripper {
		public static final VictorSP MOTOR_1 = new VictorSP(RobotMap.PWM.GRIPPER_MOTOR_1);
		public static final VictorSP MOTOR_2 = new VictorSP(RobotMap.PWM.GRIPPER_MOTOR_2);
		public static final AnalogInput LIGHT_SENSOR = new AnalogInput(RobotMap.ANALOG_IN.GRIPPER_LIGHT_SENSOR);
		public static final DigitalInput LIMIT = new DigitalInput(RobotMap.DIO.GRIPPER_LIMIT);
	}
}
