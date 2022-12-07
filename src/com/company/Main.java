package com.company;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.*;
class Gr1 extends JFrame{
    Gr1(String s){
        super(s);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
public void paint(Graphics my_picture){
        my_picture.drawLine(150, 50, 300, 200);
        my_picture.drawLine(300, 200, 225, 275);
        my_picture.drawLine(150, 50, 225, 275);
        my_picture.drawLine(225, 275, 100, 225);
        my_picture.drawLine(100, 225, 150, 50);
        my_picture.setColor(Color.black);
        Polygon p = new Polygon();
        p.addPoint(150,50);
        p.addPoint(300,200);
        p.addPoint(225,275);
        my_picture.drawPolygon(p);
        my_picture.fillPolygon(p);
        my_picture.drawLine(100,225,125,220);
        my_picture.drawLine(135,218,155,215);
        my_picture.drawLine(165,215,185, (int) 213.5);
        Polygon z = new Polygon();
        z.addPoint(150,50);
        z.addPoint(225,275);
        z.addPoint(100,225);
        }
public static void main(String[] args) {
        new Gr1("");
        }
 }