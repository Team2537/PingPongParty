package frc.robot.commands

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.subsystem.Dropper


class myServoOpen : Command() {
    //Open
    override fun initialize() {
        Dropper.setAngle(100.0)
    }
}