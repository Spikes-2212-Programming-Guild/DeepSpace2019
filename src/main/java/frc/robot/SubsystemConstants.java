package frc.robot;

import com.spikes2212.dashboard.ConstantHandler;

import java.util.function.Supplier;

public class SubsystemConstants {
    public static interface  Drivetrain{
        public static final Supplier<Double> ORIENTATION_KP = ConstantHandler.addConstantDouble("drivetrain - oriantation kp", 0.7);
        public static final Supplier<Double> ORIENTATION_KI = ConstantHandler.addConstantDouble("drivetrain - oriantation ki", 0.01);
        public static final Supplier<Double> ORIENTATION_KD = ConstantHandler.addConstantDouble("drivetrain - oriantation kd", 0.1);
    }
}
