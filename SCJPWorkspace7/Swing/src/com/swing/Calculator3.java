package com.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator3 extends JFrame implements ActionListener,Runnable
{
  JButton bnum[];
  JButton bback,bce,bc;
  JButton bop[],jdb;
  JLabel jl;
  JTextField tf;
  JPanel p1,p2,p3;
  JDialog jd;
  double d1,d2,d3;
  //long n1,n2,n3;
  boolean frac=false;
  char op;
  boolean opc=false,ope=false;
  public void run()
  {
    while(true)
    {
      char ch=getTitle().charAt(0);
      setTitle(getTitle().substring(1,getTitle().length())+Character.toString(ch));
      try{
       Thread.sleep(200);
      }catch(InterruptedException ie){
       System.out.println(ie);
      }
    }
  }
  public Calculator3(String str)
  {
    super(str);
    bnum=new JButton[10];
    jd=new JDialog(this,"Message",true);
    jdb=new JButton("OK");
    jl=new JLabel();
    jd.setLayout(new FlowLayout());
    jdb.setMargin(new Insets(2,5,2,5));
    jd.add(jl); jd.add(jdb);
    jdb.addActionListener(this);
    for(int i=0;i<10;i++)
      bnum[i]=new JButton(Integer.toString(i));
    bback=new JButton("Back");
    bce=new JButton("CE");
    bc=new JButton("C");
    p2=new JPanel();
    p2.setLayout(new FlowLayout());
    p2.add(bback);
    p2.add(bce);
    p2.add(bc);
    tf=new JTextField(15);
    p1=new JPanel();
    p1.add(tf);
    tf.setEditable(false);
    tf.setHorizontalAlignment(JTextField.RIGHT);
    tf.setText("0.");
    tf.setBackground(Color.white);
    tf.setFont(new Font("Dialog",Font.BOLD,12));
    //System.out.println(tf.getFont());
    bop=new JButton[10];
    bop[0]=new JButton("+");
    bop[1]=new JButton("-");
    bop[2]=new JButton("*");
    bop[3]=new JButton("/");
    bop[4]=new JButton(".");
    bop[5]=new JButton("=");
    bop[6]=new JButton("%");
    bop[7]=new JButton("Sqrt");
    bop[8]=new JButton("1/x");
    bop[9]=new JButton("+/-");
    for(int i=0;i<10;i++){
      bop[i].setMargin(new Insets(2,2,2,2));
      bop[i].addActionListener(this);
    }
    p3=new JPanel();
    p3.setLayout(new GridLayout(4,5,5,5));
    p3.add(bnum[1]);
    p3.add(bnum[2]);
    p3.add(bnum[3]);
    p3.add(bop[0]);
    p3.add(bop[7]);
    p3.add(bnum[4]);
    p3.add(bnum[5]);
    p3.add(bnum[6]);
    p3.add(bop[1]);
    p3.add(bop[8]);
    p3.add(bnum[7]);
    p3.add(bnum[8]);
    p3.add(bnum[9]);
    p3.add(bop[2]);
    p3.add(bop[6]);
    p3.add(bnum[0]);
    p3.add(bop[9]);
    p3.add(bop[4]);
    p3.add(bop[3]);
    p3.add(bop[5]);
    Container c=getContentPane();
    c.setLayout(new FlowLayout());
    c.add(p1);
    c.add(p2);
    c.add(p3);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setResizable(false);
    for(int i=0;i<=6;i++)
      bop[i].setFont(new Font("Dialog",Font.BOLD,13));
    for(int i=0;i<10;i++){
      bnum[i].addActionListener(this);
      bnum[i].setMargin(new Insets(2,10,2,10));
    }
    bce.addActionListener(this);
    bc.addActionListener(this);
    bback.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
    String s=tf.getText();
    String str;
    if(!frac)
      str=s.substring(0,s.length()-1);
    else
      str=s;
    if(ae.getSource()==bback)
    {
      if(frac){
       if(str.charAt(str.length()-1)=='.')
        frac=false;
       else tf.setText(str.substring(0,str.length()-1));
      }
      else{
      if(!str.equals("0"))
       tf.setText(str.substring(0,str.length()-1)+".");
      }
      if(tf.getText().equals("."))
       tf.setText("0.");
    }
    else if(ae.getSource()==bce)
    {
      tf.setText("0.");
      frac=false;
      opc=false;
    }
    else if(ae.getSource()==bc)
    {
      tf.setText("0.");
      d1=0;
      d2=0;
      frac=false;
      opc=false;
      ope=false;
    }
    else if(ae.getSource()==bop[0])
    {
      if(ope){
       d2=Double.parseDouble(str);
       d3=calc(d1,d2,op);
       String dn=Double.toString(d3);
       if(dn.charAt(dn.length()-1)=='0')
        dn=dn.substring(0,dn.length()-1);
       tf.setText(dn);
       ope=false;
       str=dn;
      }
      d1=Double.parseDouble(str);
      opc=true;
      op='+';
    }
    else if(ae.getSource()==bop[1])
    {
      if(ope){
       d2=Double.parseDouble(str);
       d3=calc(d1,d2,op);
       String dn=Double.toString(d3);
       if(dn.charAt(dn.length()-1)=='0')
        dn=dn.substring(0,dn.length()-1);
       tf.setText(dn);
       ope=false;
       str=dn;
      }
      d1=Double.parseDouble(str);
      opc=true;
      op='-';
    }
    else if(ae.getSource()==bop[2])
    {
      if(ope){
       d2=Double.parseDouble(str);
       d3=calc(d1,d2,op);
       String dn=Double.toString(d3);
       if(dn.charAt(dn.length()-1)=='0')
        dn=dn.substring(0,dn.length()-1);
       tf.setText(dn);
       ope=false;
       str=dn;
      }
      d1=Double.parseDouble(str);
      opc=true;
      op='*';
    }
    else if(ae.getSource()==bop[3])
    {
      if(ope){
       d2=Double.parseDouble(str);
       d3=calc(d1,d2,op);
       String dn=Double.toString(d3);
       if(dn.charAt(dn.length()-1)=='0')
        dn=dn.substring(0,dn.length()-1);
       tf.setText(dn);
       ope=false;
       str=dn;
      }
      d1=Double.parseDouble(str);
      opc=true;
      op='/';
    }
    else if(ae.getSource()==bop[4])
    {
      frac=true;
    }
    else if(ae.getSource()==bop[5])
    {
      if(ope)
      {
       d2=Double.parseDouble(str);
       d3=calc(d1,d2,op);
       String dn=Double.toString(d3);
       if(dn.charAt(dn.length()-1)=='0')
        dn=dn.substring(0,dn.length()-1);
       tf.setText(dn);
       d1=d3;
       opc=false;
       ope=false;
      }
    }
    else if(ae.getSource()==bop[6])
    {
      if(ope)
      {
       double temp=Double.parseDouble(tf.getText());
       String tmp=Double.toString(d1*temp/100);
       if(tmp.charAt(tmp.length()-1)=='0')
        tmp=tmp.substring(0,tmp.length()-1);
       tf.setText(tmp);
      }
      else
       tf.setText("0.");
    }
    else if(ae.getSource()==bop[7])
    {
      double temp=Double.parseDouble(tf.getText());
      String tmp=Double.toString(Math.sqrt(temp));
      if(tmp.charAt(tmp.length()-1)=='0')
       tmp=tmp.substring(0,tmp.length()-1);
      tf.setText(tmp);
    }
    else if(ae.getSource()==bop[8])
    {
      double temp=Double.parseDouble(tf.getText());
      String tmp=Double.toString(1/temp);
      if(tmp.equals("Infinity")){
       jl.setText("Cannot divided by zero");
       jd.setSize(150,90);
       jd.setResizable(false);
       jd.setVisible(true);
      }
      else{
      if(tmp.charAt(tmp.length()-1)=='0')
       tmp=tmp.substring(0,tmp.length()-1);
      tf.setText(tmp);
      }
    }
    else if(ae.getSource()==bop[9])
    {
      double temp=Double.parseDouble(tf.getText());
      if(temp!=0){
      String tmp=Double.toString(-1*temp);
      if(tmp.charAt(tmp.length()-1)=='0')
       tmp=tmp.substring(0,tmp.length()-1);
      tf.setText(tmp);
      }else tf.setText("0.");
    }
    else if(ae.getSource()==jdb)
    {
      jd.setVisible(false);
    }
    else
    {
      if(opc){
       tf.setText("0.");
       frac=false;
       str="0";
       ope=true;
       opc=false;
      }
      if(frac)
       tf.setText(str+ae.getActionCommand());
      else{
      if(str.equals("0")){
       tf.setText("");
       tf.setText(ae.getActionCommand()+".");
      }
      else
       tf.setText(str+ae.getActionCommand()+".");
      }
    }
  }
  public double calc(double a,double b,char ch)
  {
    double c=0;
    switch(ch)
    {
      case '+':
       c=a+b;
       break;
      case '-':
       c=a-b;
       break;
      case '*':
       c=a*b;
       break;
      case '/':
       c=a/b;
       break;
    }
    return c;
  }
  public static void main(String[] args) 
  {
    Calculator3 c=new Calculator3("Calculator      ");
    c.setSize(210,250);
    c.setVisible(true);
    Thread t=new Thread(c);
    t.start();
  }
}