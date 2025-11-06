package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.DashboardSubsystem;
import frc.robot.subsystems.ExampleSubsystem;


public class DashboardCommands {
    static DashboardSubsystem variablename=null;
        public DashboardCommands(DashboardSubsystem dashboardSubsystem) {
            this.variablename=dashboardSubsystem;
        }

        public static Command setmotors(double speed) {
        return Commands.runOnce(()->
            variablename.setMotor(speed));
    }
    
  }
