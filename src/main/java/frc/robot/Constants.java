package frc.robot;

public class Constants {
    //initialize TICKS_PER_REV, METERS_PER_INCH
    public static final double TICKS_PER_REV = 2048.0;
    public static final double METERS_PER_INCH = 0.0254;

    //left to right dstance between wheels
    public static final double DRIVETRAIN_TRACKWIDTH_METERS = 0.4690872;
    //front to back distance between wheels
    public static final double DRIVETRAIN_WHEELBASE_METERS = 0.4690872;

    public static final int DRIVETRAIN_PIGEON_ID = 6;

    public static final int FRONT_LEFT_MODULE_DRIVE_MOTOR = 21;
    public static final int FRONT_LEFT_MODULE_STEER_MOTOR = 20;
    public static final int FRONT_LEFT_MODULE_STEER_ENCODER = 2;

    public static final int FRONT_RIGHT_MODULE_DRIVE_MOTOR = 23;
    public static final int FRONT_RIGHT_MODULE_STEER_MOTOR = 22;
    public static final int FRONT_RIGHT_MODULE_STEER_ENCODER = 3;

    public static final int BACK_LEFT_MODULE_DRIVE_MOTOR = 27;
    public static final int BACK_LEFT_MODULE_STEER_MOTOR = 26;
    public static final int BACK_LEFT_MODULE_STEER_ENCODER = 5;

    public static final int BACK_RIGHT_MODULE_DRIVE_MOTOR = 25;
    public static final int BACK_RIGHT_MODULE_STEER_MOTOR = 24;
    public static final int BACK_RIGHT_MODULE_STEER_ENCODER = 4;

    //offsets
    public static final double FRONT_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(34.0137+180);
    public static final double FRONT_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(18.8086+180);
    public static final double BACK_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(308.408203125-180);
    public static final double BACK_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(196.435546875-180);

}
