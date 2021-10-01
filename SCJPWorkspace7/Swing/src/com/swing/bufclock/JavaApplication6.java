package com.swing.bufclock;

import java.applet.*;  
import java.awt.*;  
import java.util.*;  
import java.text.*;  
  
public class JavaApplication6 extends Applet implements Runnable {  
   Thread t1 = null;  
   int hours = 0, minutes = 0, seconds = 0;
   String time = "";
   
   public void init() {  
      setBackground( Color.green);  
   }  
   public void start() {
      t1 = new Thread( this );
      t1.start();
   } 
   public void run() {
      try {
         while (true) {
            Calendar cal = Calendar.getInstance();  
            hours = cal.get( Calendar.HOUR_OF_DAY );  
            if ( hours > 12 ) hours -= 12;  
            minutes = cal.get( Calendar.MINUTE );  
            seconds = cal.get( Calendar.SECOND );
            
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
            Date d = cal.getTime();  
            time = formatter.format( d );
            
            repaint();  
            t1.sleep( 1000 ); 
         }  
      }  
      catch (Exception e) { }  
   } 
   public void paint( Graphics g ) {
      g.setColor( Color.blue );  
      g.drawString( time, 50, 50 );  
   }  
} 
