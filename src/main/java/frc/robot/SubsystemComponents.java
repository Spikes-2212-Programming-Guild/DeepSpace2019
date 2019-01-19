package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;

public class SubsystemComponents {
    public static class Drivetrain {
        //public static final SpeedController LEFT_1 = new WPI_TalonSRX(RobotMap.CAN.LEFT_UP);
        //public static final SpeedController LEFT_2 = new WPI_TalonSRX(RobotMap.CAN.LEFT_DOWN);
        //public static final SpeedController RIGHT_1 = new WPI_TalonSRX(RobotMap.CAN.RIGHT_UP);
        //public static final SpeedController RIGHT_2 = new WPI_TalonSRX(RobotMap.CAN.RIGHT_DOWN);
        public static final SpeedControllerGroup DT_LEFT = new SpeedControllerGroup
                (new WPI_TalonSRX(RobotMap.CAN.LEFT_UP), new WPI_TalonSRX(RobotMap.CAN.LEFT_DOWN));

        public static final SpeedControllerGroup DT_RIGHT = new SpeedControllerGroup
                (new WPI_TalonSRX(RobotMap.CAN.RIGHT_UP),new WPI_TalonSRX(RobotMap.CAN.RIGHT_DOWN));
    }
}
