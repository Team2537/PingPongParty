package frc.robot.commands

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.subsystems.Dropper

class DcMotorRun(private val dropper: Dropper) : Command() {
    override fun initialize() {
        dropper.setSpeed(0.30)
    }

    override fun isFinished(): Boolean {
        return false
    }
}