package frc.com.swervedrivespecialties.swervelib;

import edu.wpi.first.math.kinematics.SwerveModulePosition;

public interface SwerveModule {
    double getDriveVelocity();

    double getSteerAngle();

    SwerveModulePosition getSwerveModulePosition();

    double getPosition();

    void set(double driveVoltage, double steerAngle);
}
