package frc.robot.subsystems

import edu.wpi.first.wpilibj2.command.Command
import edu.wpi.first.wpilibj2.command.SubsystemBase

import com.revrobotics.CANSparkMax
import com.revrobotics.CANSparkLowLevel.MotorType
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.XboxController;

/** Creates a new DriveSubsystem.  */
class DriveSubsystem : SubsystemBase() {
    val leftMotor: CANSparkMax
    val rightMotor: CANSparkMax
    val drive: DifferentialDrive
    val controller: XboxController

    init {
        leftMotor = CANSparkMax(16, MotorType.kBrushless)
        rightMotor = CANSparkMax(7, MotorType.kBrushless)

        drive = DifferentialDrive(leftMotor, rightMotor)

        controller = XboxController(0)
    }

    /** This method will be called once per scheduler run  */
    override fun periodic() {
        drive.tankDrive(controller.getLeftY(), controller.getRightY())
    }

    /** This method will be called once per scheduler run during simulation  */
    override fun simulationPeriodic() {
    }
}
