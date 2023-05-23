package com.spaghetti.visfx;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Clock extends Pane {
    private int hour;
    private int min;
    private int sec;

    public Clock(){
        setCurrentTime();
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public Clock(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        paintClock();
    }

    public void setCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        hour = now.getHour();
        min = now.getMinute();
        sec = now.getSecond();
        paintClock();
    }

    public void paintClock(){
        double radius = Math.min(getHeight(),getWidth()) * 0.9 * 0.5;
        double centerX = getWidth() / 2.0;
        double centerY = getHeight() / 2.0;
        Circle circle = new Circle(centerX,centerY,radius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5.0);

        double secL = radius * 0.9;
        double secTheta = sec * 2 * Math.PI / 60.0;
        double secX = centerX + secL * Math.sin(secTheta);
        double secY = centerY - secL * Math.cos(secTheta);
        Line secLine = new Line(centerX,centerY,secX,secY);
        secLine.setStroke(Color.RED);

        double minL = radius * 0.7;
        double minTheta = (min + sec/60.0) * 2 * Math.PI / 60.0;
        double minX = centerX + minL * Math.sin(minTheta);
        double minY = centerY - minL * Math.cos(minTheta);
        Line minLine = new Line(centerX,centerY,minX,minY);
        minLine.setStroke(Color.BLUE);
        minLine.setStrokeWidth(2.5);

        double hourL = radius * 0.5;
        double hourTheta = (hour % 12.0 + min/60.0) * 2 * Math.PI / 12.0;
        double hourX = centerX + hourL * Math.sin(hourTheta);
        double hourY = centerY - hourL * Math.cos(hourTheta);
        Line hourLine = new Line(centerX,centerY,hourX,hourY);
        hourLine.setStroke(Color.BROWN);
        hourLine.setStrokeWidth(5.0);

        getChildren().clear();
        getChildren().addAll(circle,secLine,minLine,hourLine);
    }

    @Override
    protected void setWidth(double v) {
        super.setWidth(v);
        paintClock();
    }

    @Override
    protected void setHeight(double v) {
        super.setHeight(v);
        paintClock();
    }
}
