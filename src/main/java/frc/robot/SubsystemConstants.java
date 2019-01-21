package frc.robot;

import com.spikes2212.dashboard.ConstantHandler;
import java.util.function.Supplier;

public class SubsystemConstants {

	public static class Drivetrain {

	}

	public static class Lift {
        public static final Supplier<Double> UP_SPEED = ConstantHandler.
				addConstantDouble("Lift Up Speed", 0.9);
        public static final Supplier<Double> STAYING_SPEED = ConstantHandler.
				addConstantDouble("Lift Staying Speed",0.2);
        public static final Supplier<Double> DOWN_SPEED = ConstantHandler
                .addConstantDouble("Lift First Down Speed", -0.2);
	}

	public static class Arm {
		public static final Supplier<Double> ARM_SPEED = ConstantHandler.addConstantDouble("Arm speed", 0.5);
    }
}
