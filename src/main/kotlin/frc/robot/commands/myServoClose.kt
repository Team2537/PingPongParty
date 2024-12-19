package frc.robot.commands

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.subsystems.Dropper

class myServoClose(private val dropper: Dropper) : Command() {
    override fun initialize() {
        dropper.setAngle(0.0)
    }

    override fun isFinished(): Boolean {
        return true
    }
}