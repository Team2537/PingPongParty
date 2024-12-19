package frc.robot.commands

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.subsystems.Dropper

class myServoOpen(private val dropper: Dropper) : Command() {
    override fun initialize() {
        dropper.setAngle(100.0)
    }

    override fun isFinished(): Boolean {
        return true
    }
}