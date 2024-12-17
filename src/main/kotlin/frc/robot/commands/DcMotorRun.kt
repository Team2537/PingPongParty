package frc.robot.commands

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.subsystems.Dropper

class DcMotorRun : Command() { 
    //Run
    override fun initialize() {
        Dropper.mySpeed(0.30)

    }

    override fun isFinished(): Boolean {
        return false
    }
}