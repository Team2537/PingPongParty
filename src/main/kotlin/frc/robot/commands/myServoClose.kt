package frc.robot.commands

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.subsystem.Dropper

class myServoClose : Command() {
    //Close

    override fun initialize() {
        Dropper.setAngle(0.0)
    }
}