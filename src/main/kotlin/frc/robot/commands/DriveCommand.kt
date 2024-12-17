package frc.robot.commands

import edu.wpi.first.wpilibj2.command.Command
import frc.robot.subsystems.DriveSubsystem

/** An Drive command that uses an Drive subsystem.  */
class DriveCommand(subsystem: DriveSubsystem) : Command() {
    init {
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(subsystem)
    }

    /** Called when the command is initially scheduled.  */
    override fun initialize() {}

    /** Called every time the scheduler runs while the command is scheduled.  */
    override fun execute() {}

    /** Called once the command ends or is interrupted.  */
    override fun end(interrupted: Boolean) {}

    /** Returns true when the command should end.  */
    override fun isFinished(): Boolean {
        return false
    }
}
