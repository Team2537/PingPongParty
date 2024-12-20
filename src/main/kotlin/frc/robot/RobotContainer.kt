package frc.robot

import edu.wpi.first.wpilibj2.command.Command
import edu.wpi.first.wpilibj2.command.button.CommandXboxController
import edu.wpi.first.wpilibj2.command.button.Trigger
import frc.robot.commands.Autos
import frc.robot.commands.DriveCommand
import frc.robot.subsystems.DriveSubsystem
import frc.robot.commands.DcMotorRun
import frc.robot.commands.myServoClose
import frc.robot.commands.myServoOpen
import frc.robot.subsystems.Dropper

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the [Robot]
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
class RobotContainer {
    // The robot's subsystems and commands are defined here...
    private val driveSubsystem = DriveSubsystem()
    private val driveCommand = DriveCommand(driveSubsystem)
    private val dropper = Dropper()

    // Replace with CommandPS4Controller or CommandJoystick if needed
    private val driverController = CommandXboxController(Constants.OperatorConstants.kDriverControllerPort)

    /** The container for the robot. Contains subsystems, OI devices, and commands.  */
    init {
        // Configure the trigger bindings
        // configureBindings()

        driveSubsystem.setDefaultCommand(driveCommand)

        driverController.a().whileTrue(DcMotorRun(dropper))
        // driverController.b().onTrue(myServoOpen(dropper))
        // driverController.x().onTrue(myServoClose(dropper))
    }

    /**
     * Use this method to define your trigger->command mappings. Triggers can be created via the
     * [Trigger#Trigger(java.util.function.BooleanSupplier)] constructor with an arbitrary
     * predicate, or via the named factories in [edu.wpi.first.wpilibj2.command.button.CommandGenericHID]'s subclasses for
     * [CommandXboxController]/[edu.wpi.first.wpilibj2.command.button.CommandPS4Controller] controllers
     * or [edu.wpi.first.wpilibj2.command.button.CommandJoystick].
     */
    private fun configureBindings() {
        // Schedule DriveCommand when DriveCondition changes to true
        // Trigger { DriveSubsystem.DriveCondition() }.onTrue(DriveCommand(DriveSubsystem))

        // Schedule DriveMethodCommand when the Xbox controller's B button is pressed,
        // cancelling on release.
        // driverController.b().whileTrue(DriveSubsystem.DriveMethodCommand())
    }

    // /**
    //  * Use this to pass the autonomous command to the main [Robot] class.
    //  *
    //  * @return the command to run in autonomous
    //  */
    // val autonomousCommand: Command
    //     get() {
    //         // An Drive command will be run in autonomous
    //         return Autos.DriveAuto(DriveSubsystem)
    //     }
}
