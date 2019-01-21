/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

public class RobotMap {
	public interface CAN {
		public static final int MOTOR_LEFT1 = 0;
		public static final int MOTOR_LEFT2 = 1;
		public static final int MOTOR_RIGHT1 = 2;
		public static final int MOTOR_RIGHT2 = 3;
	}

	public interface DIO {
<<<<<<< HEAD
		public static final int LIMIT = 1;
=======
	public static final int LIMIT =1;

	public static final int DRIVETRAIN_ENCODER_RIGHT1 = 0;
	public static final int DRIVETRAIN_ENCODER_RIGHT2 = 1;
	public static final int DRIVETRAIN_ENCODER_LEFT1 = 3;
	public static final int DRIVETRAIN_ENCODER_LEFT2 = 2;
>>>>>>> branch 'leo(abashcha)-griper' of https://github.com/Spikes-2212-Programming-Guild/DeepSpace2019
	}

	public static interface PWM {
		public static final int GRIPPER_MOTOR_1 = 0;
		public static final int GRIPPER_MOTOR_2 = 1;
	}

<<<<<<< HEAD
	public static interface ANALOG {
		public static final int LIGHT_SENSOR = 0;

=======
	public static interface ANALOG_IN {
		public static final int LIGHT =0;
		
>>>>>>> branch 'leo(abashcha)-griper' of https://github.com/Spikes-2212-Programming-Guild/DeepSpace2019
	}
}
