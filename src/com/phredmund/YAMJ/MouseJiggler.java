package com.phredmund.YAMJ;

import java.awt.Robot;
import java.awt.MouseInfo;

public class MouseJiggler {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();

        while (true) {
            long time = System.currentTimeMillis();
            int xCoord = MouseInfo.getPointerInfo().getLocation().x;
            int yCoord = MouseInfo.getPointerInfo().getLocation().y;
            if (time % 2 == 0) {
                xCoord += 1;
            } else {
                xCoord -= 1;
            }
            robot.mouseMove(xCoord, yCoord);
            Thread.sleep(5000);
        }
        // TODO: Check out https://docs.oracle.com/javase/tutorial/uiswing/misc/systemtray.html to add icon to tray
    }
}
