package frc.robot.subsystems

import com.revrobotics.CANSparkMax
import com.revrobotics.CANSparkLowLevel.MotorType
import edu.wpi.first.wpilibj.Servo
import edu.wpi.first.wpilibj2.command.SubsystemBase

class Dropper : SubsystemBase() {
    private val dropperMotor = Servo(1) //channel
    private val dropperDCMotor = CANSparkMax(8, MotorType.kBrushless)

    fun setAngle(target: Double) {
        dropperMotor.setAngle(target)
    }

    fun setSpeed(speed: Double) {
        dropperDCMotor.set(speed)
    }
}