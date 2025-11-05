package frc.robot.subsystems;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class DashboardSubsystem extends SubsystemBase {

    private final SparkMax primarymotor = 
        new SparkMax(1, MotorType.kBrushless);

    SparkMaxConfig primaryConfig = new SparkMaxConfig();

    public void setMotor(double set) {
        primarymotor.set(set);
    } 

    public static boolean test = false;

    public DashboardSubsystem() {
            
    primaryConfig.idleMode(IdleMode.kBrake);
        test = true;
    }
    public void setvalue (Boolean face) {
        test = face;
    }
    @Override
    public void periodic() {
      SmartDashboard.putBoolean("i am in your walls", test);
    }
}
