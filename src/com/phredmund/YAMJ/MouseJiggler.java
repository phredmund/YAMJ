package com.phredmund.YAMJ;

import java.awt.Robot;
import java.awt.MouseInfo;

public class MouseJiggler {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();

        int counter = 1;

        while (true) {
            int xCoord = MouseInfo.getPointerInfo().getLocation().x;
            int yCoord = MouseInfo.getPointerInfo().getLocation().y;
            if (counter % 2 == 0) {
                xCoord += 1;
            } else {
                xCoord -= 1;;
            }
            // System.out.println("Moving mouse to " + xCoord + ", " + yCoord);
            robot.mouseMove(xCoord, yCoord);
            Thread.sleep(5000);
            counter++;
        }
    }
}
