/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public class RobotMap {

	public interface CAN {
		public static final int DRIVETRAIN_MOTOR_LEFT1 = 0;
		public static final int DRIVETRAIN_MOTOR_LEFT2 = 1;
		public static final int DRIVETRAIN_MOTOR_RIGHT1 = 2;
		public static final int DRIVETRAIN_MOTOR_RIGHT2 = 3;
	}

	public interface DIO {
		public static final int LIFT_ENCODER1 = 0;
		public static final int LIFT_ENCODER2 = 1;
		public static final int LIFT_LIMIT_UP = 2;
		public static final int LIFT_LIMIT_DOWN = 3;

		public static final int DRIVETRAIN_ENCODER_RIGHT1 = 0;
		public static final int DRIVETRAIN_ENCODER_RIGHT2 = 1;
		public static final int DRIVETRAIN_ENCODER_LEFT1 = 3;
		public static final int DRIVETRAIN_ENCODER_LEFT2 = 2;

		public static final int GRIPPER_LIMIT = 1;
    
    public static final int ARM_LIMIT0 = 4;
	  public static final int ARM_LIMIT1 = 5;

	}

	public interface PWM {
		public static final int LIFT_MOTOR1 = 0;
		public static final int LIFT_MOTOR2 = 1;

		public static final int GRIPPER_MOTOR_1 = 0;
		public static final int GRIPPER_MOTOR_2 = 1;
	
    public static final int ARM_MOTOR = 3;
  }

	public static interface ANALOG_IN {
    public static final int GRIPPER_LIGHT_SENSOR = 0;
	}

}
