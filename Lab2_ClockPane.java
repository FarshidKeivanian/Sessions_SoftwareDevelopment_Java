package org.example.itec313_lab2_javafx;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.time.LocalTime;

public class ClockPane extends Pane {

    private int hour;
    private int minute;
    private int second;

    public ClockPane() {
        setCurrentTime();
        setPrefSize(250, 250);
    }

    public ClockPane(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        setPrefSize(250, 250);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
        paintClock();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        paintClock();
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
        paintClock();
    }

    public void setCurrentTime() {
        LocalTime time = LocalTime.now();

        hour = time.getHour();
        minute = time.getMinute();
        second = time.getSecond();

        paintClock();
    }

    private void paintClock() {

        // Use the current size of the ClockPane.
        double width = getWidth() > 0 ? getWidth() : getPrefWidth();
        double height = getHeight() > 0 ? getHeight() : getPrefHeight();

        double clockRadius = Math.min(width, height) * 0.40;
        double centerX = width / 2;
        double centerY = height / 2;

        // Clock face
        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        // Hour numbers
        Text t12 = new Text(centerX - 8,
                centerY - clockRadius + 20, "12");

        Text t3 = new Text(centerX + clockRadius - 20,
                centerY + 5, "3");

        Text t6 = new Text(centerX - 4,
                centerY + clockRadius - 5, "6");

        Text t9 = new Text(centerX - clockRadius + 10,
                centerY + 5, "9");

        // Second hand
        double secondLength = clockRadius * 0.80;

        double secondX =
                centerX + secondLength *
                        Math.sin(second * (2 * Math.PI / 60));

        double secondY =
                centerY - secondLength *
                        Math.cos(second * (2 * Math.PI / 60));

        Line secondHand =
                new Line(centerX, centerY, secondX, secondY);

        secondHand.setStroke(Color.RED);

        // Minute hand
        double minuteLength = clockRadius * 0.65;

        double minuteX =
                centerX + minuteLength *
                        Math.sin(minute * (2 * Math.PI / 60));

        double minuteY =
                centerY - minuteLength *
                        Math.cos(minute * (2 * Math.PI / 60));

        Line minuteHand =
                new Line(centerX, centerY, minuteX, minuteY);

        minuteHand.setStroke(Color.BLUE);

        // Hour hand
        double hourLength = clockRadius * 0.50;

        double hourX =
                centerX + hourLength *
                        Math.sin(
                                (hour % 12 + minute / 60.0)
                                        * (2 * Math.PI / 12));

        double hourY =
                centerY - hourLength *
                        Math.cos(
                                (hour % 12 + minute / 60.0)
                                        * (2 * Math.PI / 12));

        Line hourHand =
                new Line(centerX, centerY, hourX, hourY);

        hourHand.setStroke(Color.GREEN);

        // Remove old clock drawing and draw the updated one
        getChildren().clear();

        getChildren().addAll(
                circle,
                t12,
                t3,
                t6,
                t9,
                secondHand,
                minuteHand,
                hourHand
        );
    }

    @Override
    protected void layoutChildren() {
        super.layoutChildren();
        paintClock();
    }
}