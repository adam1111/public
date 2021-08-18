package jdr;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.*;
public class Frames extends JFrame implements ActionListener
{
	 Dimension d = getSize();
	
	 Timer time=new Timer(100, this);
	 int cx=300,cy = 300,x,y,a=0,r=200;
	 
	 public Frames() {
		 time.start();
		this.setSize(600,600);
		this.setBackground(Color.black);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Title");
		
	
		
	}
	 
	

	@Override
	public void paint(Graphics s)
	{   super.paint(s);
	  s.drawLine(0,cy,600,cy);
	  s.drawLine(cx,0,cx,600);
	 
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		a++;
		 if(a <= 360) {
		 x = (int) Math.round(r*Math.cos(a*Math.PI/180));
		 y = (int) Math.round(r*Math.sin(a*Math.PI/180));
		 System.out.println(x);
		 System.out.println(y);
		 getGraphics().drawLine(cx+x, cy+y, cx+x, cy+y);
		 }	
		
	}
	
	


		
	}

	
		
	
	
	
		
	


