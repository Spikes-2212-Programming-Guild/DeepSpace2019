package frc.robot;

import com.spikes2212.dashboard.ConstantHandler;
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
	}

	public static class Arm {
    public static final Supplier<Double> ARM_SPEED = ConstantHandler.addConstantDouble("Arm speed", 0.5);
	}

	public static class Lock {

	}

	public static class Latch {

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
