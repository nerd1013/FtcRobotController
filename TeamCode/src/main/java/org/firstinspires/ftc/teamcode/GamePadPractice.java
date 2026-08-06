package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {

        double speedForwardL = -gamepad1.left_stick_y;
        double speedForwardR = -gamepad1.right_stick_y;

        telemetry.addData("x", gamepad1.left_stick_x);
        telemetry.addData("y", speedForwardL);
        telemetry.addData("x", gamepad1.right_stick_x);
        telemetry.addData("y", speedForwardR);

        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("b button", gamepad1.b);

    }
}
