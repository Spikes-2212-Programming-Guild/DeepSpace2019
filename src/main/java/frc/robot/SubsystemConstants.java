package frc.robot;

import com.spikes2212.dashboard.ConstantHandler;
import com.spikes2212.utils.PIDSettings;

import edu.wpi.first.wpilibj.PIDController.Tolerance;

import java.util.function.Supplier;

import frc.robot.SubsystemComponents;

public class SubsystemConstants {

	public static interface Drivetrain {
		public static final Supplier<Double> ORIENTATION_KP = ConstantHandler
				.addConstantDouble("drivetrain - oriantation kp", 0.7);
		public static final Supplier<Double> ORIENTATION_KI = ConstantHandler
				.addConstantDouble("drivetrain - oriantation ki", 0.01);
		public static final Supplier<Double> ORIENTATION_KD = ConstantHandler
				.addConstantDouble("drivetrain - oriantation kd", 0.1);
	}

	public static class Lift {
		public static final Supplier<Double> UP_SPEED = ConstantHandler.addConstantDouble("Lift Up Speed", 0.9);
		public static final Supplier<Double> STAYING_SPEED = ConstantHandler.addConstantDouble("Lift Staying Speed",
				0.2);
		public static final Supplier<Double> DOWN_SPEED = ConstantHandler.addConstantDouble("Lift First Down Speed",
				-0.2);
		public static final Supplier<Double> HATCH_FOR_SHIP_AND_LEVEL_ONE_HEIGHT = ConstantHandler
				.addConstantDouble("hatch(sh) + hatch 1", 0);
		public static final Supplier<Double> HATCH_FOR_LEVEL_TWO_HEIGHT = ConstantHandler.addConstantDouble("hatch 2",
				0.71);
		public static final Supplier<Double> HATCH_FOR_LEVEL_THREE_HEIGHT = ConstantHandler.addConstantDouble("hatch 3",
				142);
		public static final Supplier<Double> CARGO_FOR_SHIP_GRIPPER_UP_HEIGHT = ConstantHandler
				.addConstantDouble("cargo(sh) side B", 0.414);
		public static final Supplier<Double> CARGO_FOR_SHIP_LATCH_UP_HEIGHT = ConstantHandler
				.addConstantDouble("cargo(sh) side A", 1.0592);
		public static final Supplier<Double> CARGO_FOR_LEVEL_ONE_LATCH_UP_HEIGHT = ConstantHandler
				.addConstantDouble("cargo 1 side A", 0.54);
		public static final Supplier<Double> CARGO_FOR_LEVEL_TWO_GRIPPER_UP_HEIGHT = ConstantHandler
				.addConstantDouble("cargo 2 side B", 0.6048);
		public static final Supplier<Double> CARGO_FOR_LEVEL_TWO_LATCH_UP_HEIGHT = ConstantHandler
				.addConstantDouble("cargo 2 side A", 125);
		public static final Supplier<Double> CARGO_FOR_LEVEL_THREE_GRIPPER_UP_HEIGHT = ConstantHandler
				.addConstantDouble("cargo 3 side B", 160.48);
		public static final Supplier<Double> CARGO_FOR_LEVEL_THREE_LATCH_UP_HEIGHT = ConstantHandler
				.addConstantDouble("cargo 3 side A", 196);
		public static final Supplier<Double> KP = ConstantHandler.addConstantDouble("lift-kp", 0.7);
		public static final Supplier<Double> KI = ConstantHandler.addConstantDouble("lift-ki", 0.01);
		public static final Supplier<Double> KD = ConstantHandler.addConstantDouble("lift-kd", 0.1);
		public static final Supplier<Double> TOLERANCE = ConstantHandler.addConstantDouble("lift-tolerance", 0);
		public static final Supplier<Double> WAIT_TIME = ConstantHandler.addConstantDouble("lift-wait time", 100);
		public static final PIDSettings LIFT_SETTINGS = new PIDSettings(KP.get(), KI.get(), KD.get(), TOLERANCE.get(),
				WAIT_TIME.get());
	}

	public static class Arm {
		public static final Supplier<Double> ARM_SPEED = ConstantHandler.addConstantDouble("Arm speed forward", 0.5);
		public static final Supplier<Double> ARM_SPEED_BACKWARDS = ConstantHandler.addConstantDouble("Arm speed back",
				-0.5);
		public static final Supplier<Double> KP =ConstantHandler.addConstantDouble("arm kP", 0.3);
		public static final Supplier<Double> KI =ConstantHandler.addConstantDouble("arm kI", 0.3);
		public static final Supplier<Double> KD =ConstantHandler.addConstantDouble("arm kD", 0.3);
		public static final Supplier<Double> TOLERANCE =ConstantHandler.addConstantDouble("arm tolarence", 0.5);
		public static final Supplier<Double> WAIT_TIME = ConstantHandler.addConstantDouble("arm wait time", 666999);
		public static final PIDSettings ARM_SETTINGS = new PIDSettings(KP.get(), KI.get(), KD.get(), TOLERANCE.get(), WAIT_TIME.get());
		public static final Supplier<Double> ANGLE = ConstantHandler.addConstantDouble("angle of arm needed", 40);

	}

	public static class Lock {

	}

	public static class Latch {
		public static final Supplier<Double> LATCH_SPEED = ConstantHandler.addConstantDouble("Latch Speed", 0.5);
	}

	public static class Gripper {
		public static final Supplier<Double> OUT_SPEED = ConstantHandler.addConstantDouble("Throw", 0.3);
		public static final Supplier<Double> GRIP_SPEED = ConstantHandler.addConstantDouble("Gripp", 0.3);
		public static final Supplier<Double> VOLTAGE = ConstantHandler.addConstantDouble("light sensor",
				SubsystemComponents.Gripper.LIGHT_SENSOR.getVoltage());
		public static final Supplier<Double> LIMIT_VOLTAGE = ConstantHandler
				.addConstantDouble("limit for entering ball", 5);
	}

}
