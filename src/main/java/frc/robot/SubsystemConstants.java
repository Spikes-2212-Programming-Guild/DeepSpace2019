package frc.robot;

import com.spikes2212.dashboard.ConstantHandler;

import java.util.function.Supplier;

public class SubsystemConstants {

    public static class Drivetrain {
        public static final Supplier<Double> SPEED = ConstantHandler.addConstantDouble("Drivetrain Speed",
                0.1);
    }

    public static class Lift {
        public static final Supplier<Double> STAYING_SPEED = ConstantHandler.addConstantDouble("Lift Staying Speed",
                0.1);
        public static final Supplier<Double> UP_SPEED = ConstantHandler.addConstantDouble("Lift up Speed",
                0.1);
    }
    public static final Supplier<Double> DOWN_SPEED = ConstantHandler.addConstantDouble("Lift down Speed",
            0.1);

    public static class Arm {
        public static final Supplier<Double> ARM_SPEED = ConstantHandler.addConstantDouble("Arm Speed",
                0.1);
    }

    public static class Lock {
        public static final Supplier<Double> LOCK_SPEED = ConstantHandler.addConstantDouble("Lock Speed",
                0.1);
    }

    public static class Latch {
        public static final Supplier<Double> DOWN_SPEED = ConstantHandler.addConstantDouble("Lift down Speed",
                0.1);
    }

    public static class Roller {
        public static final Supplier<Double> DOWN_SPEED = ConstantHandler.addConstantDouble("Lift down Speed",
                0.1);
    }
}
