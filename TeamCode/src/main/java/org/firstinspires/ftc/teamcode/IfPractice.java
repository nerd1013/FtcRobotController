package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class IfPractice extends OpMode {
    public void init() {

    }
    public void loop() {
        boolean aButton = gamepad1.a;

        if (aButton) {
            telemetry.addData("A button", "Pressed");

        }
        else {
            telemetry.addData("A button", "Not Pressed");
        }
        telemetry.addData("A Button Status", aButton);
    }
}
