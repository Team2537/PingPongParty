import com.revrobotics.CANSparkLowLevel1
import com.revrobotics.CANSparkMax
import edu.wpi.first.wpilibj.myServo
import edu.wpi.first.wpilibj2.command.Subsystem


object Dropper : Subsystem {
    var dropperMotor: Servo = Servo(1) //channel
    var dropperDCMotor: CANSparkMax = CANSparkMax(7, CANSparkMax.MotorType.kBrushless)


    fun setAngle(target: Double) {
        dropperMotor.angle = target
    }

    fun mySpeed(speed: Double) {
        dropperDCMotor.set(speed)
    }
}