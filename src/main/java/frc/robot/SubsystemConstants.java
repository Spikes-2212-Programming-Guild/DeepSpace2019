package frc.robot;

import com.spikes2212.dashboard.ConstantHandler;
import java.util.function.Supplier;

import frc.robot.SubsystemComponents;

public class SubsystemConstants {

   public static interface  Drivetrain{
     public static final Supplier<Double> ORIENTATION_KP = ConstantHandler.addConstantDouble("drivetrain - oriantation kp", 0.7);
     public static final Supplier<Double> ORIENTATION_KI = ConstantHandler.addConstantDouble("drivetrain - oriantation ki", 0.01);
     public static final Supplier<Double> ORIENTATION_KD = ConstantHandler.addConstantDouble("drivetrain - oriantation kd", 0.1);
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
		public static final Supplier<Double> LIMIT_VOLTAGE= ConstantHandler.addConstantDouble("limit for entering ball", 5)
	}
}
