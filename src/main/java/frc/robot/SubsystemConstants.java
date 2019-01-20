package frc.robot;

import java.util.function.Supplier;

import com.spikes2212.dashboard.ConstantHandler;

import frc.robot.SubsystemComponents;

public class SubsystemConstants {

	public static class Drivetrain {

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
		public static final Supplier<Double> OUT_SPEED = ConstantHandler.addConstantDouble("Throw", 0.3);
		public static final Supplier<Double> GRIP_SPEED = ConstantHandler.addConstantDouble("Gripp", 0.3);
		public static final Supplier<Double> VOLTAGE = ConstantHandler.addConstantDouble("light sensor",
				SubsystemComponents.Gripper.LIGHT_SENSOR.getVoltage());
	}
}
