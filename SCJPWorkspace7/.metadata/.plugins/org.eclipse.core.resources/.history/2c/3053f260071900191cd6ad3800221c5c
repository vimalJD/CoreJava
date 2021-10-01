package com.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
 
public class Calculator1 extends JFrame {
 
    /**
     * @param args the command line arguments
     */
    JButton zero = new JButton("          0          ");
    JButton one = new JButton("  1 ");
    JButton two = new JButton(" 2 ");
    JButton three = new JButton(" 3 ");
    JButton four = new JButton(" 4 ");
    JButton five = new JButton(" 5 ");
    JButton six = new JButton(" 6 ");
    JButton seven = new JButton(" 7 ");
    JButton eight = new JButton(" 8 ");
    JButton nine = new JButton(" 9 ");
    JButton plus = new JButton(" + ");
    JButton minus = new JButton(" -  ");
    JButton times = new JButton(" *  ");
    JButton divide = new JButton(" /  ");
    JButton square = new JButton("  ^2  ");
    JButton squareroot = new JButton("   2/x   ");
    JButton log = new JButton("  log  ");
    JButton degrees = new JButton(" DEG  ");
    JButton radians = new JButton("  RAD  ");
    JButton pi = new JButton("  pi  ");
    JButton equals = new JButton("               =               ");
    JButton sin = new JButton(" sin  ");
    JButton cos = new JButton("  cos  ");
    JButton tan = new JButton("  tan  ");
    JButton point = new JButton("  .  ");
    JButton clear = new JButton(" Clear ");
    String value;
    char operator;
    JTextArea area = new JTextArea(3, 5);
 
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator1 calculator = new Calculator1();
        calculator.setSize(230, 340);
        calculator.setTitle(" Calculator ");
        calculator.setResizable(false);
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 
    public Calculator1() {
        add(new JScrollPane(area), BorderLayout.NORTH);
        JPanel buttonpanel = new JPanel();
        buttonpanel.setLayout(new FlowLayout());
 
        buttonpanel.add(degrees);
        buttonpanel.add(radians);
        buttonpanel.add(pi);
        buttonpanel.add(sin);
        buttonpanel.add(cos);
        buttonpanel.add(tan);
        buttonpanel.add(square);
        buttonpanel.add(log);
        buttonpanel.add(squareroot);
        buttonpanel.add(seven);
        buttonpanel.add(eight);
        buttonpanel.add(nine);
        buttonpanel.add(divide);
        buttonpanel.add(four);
        buttonpanel.add(five);
        buttonpanel.add(six);
        buttonpanel.add(times);
        buttonpanel.add(one);
        buttonpanel.add(two);
        buttonpanel.add(three);
        buttonpanel.add(minus);
        buttonpanel.add(zero);
        buttonpanel.add(point);
        buttonpanel.add(plus);
        buttonpanel.add(clear);
        buttonpanel.add(equals);
 
        add(buttonpanel, BorderLayout.CENTER);
        area.setForeground(Color.BLACK);
        area.setBackground(Color.WHITE);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setEditable(false);
 
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("0".toString());
            }
        });
 
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("1".toString());
            }
        });
 
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("2".toString());
            }
        });
 
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("3".toString());
            }
        });
 
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("4".toString());
            }
        });
 
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("5".toString());
            }
        });
 
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("6".toString());
            }
        });
 
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("7".toString());
            }
        });
 
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("8".toString());
            }
        });
 
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("9".toString());
            }
        });
 
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("+".toString());
                operator = '+';
            }
        });
 
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("-".toString());
                operator = '-';
            }
        });
 
        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("*".toString());
                operator = '*';
            }
        });
 
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("/".toString());
                operator = '/';
            }
        });
 
        square.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("^2".toString());
            }
        });
 
        squareroot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("Squareroot".toString());
                value = "Squareroot";
            }
        });
 
        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("log".toString());
                value = "log";
            }
        });
 
        degrees.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("deg".toString());
                value = "deg";
            }
        });
 
        radians.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("rad".toString());
                value = "rad";
            }
        });
 
        pi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("pi".toString());
                value = "pi";
            }
        });
 
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                String leftSide;
                String rightSide;
                try {
                    leftSide = area.getText().substring(0, area.getText().indexOf(operator + ""));
                    rightSide = area.getText().substring(area.getText().indexOf(operator + "") + 1, area.getText().length());
                    switch (operator) {
                        case '+':
                            area.append(" = " + ((Double.parseDouble(leftSide)
                                    + Double.parseDouble(rightSide))));
                            break;
                        case '-':
                            area.append(" = " + ((Double.parseDouble(leftSide)
                                    - Double.parseDouble(rightSide))));
                            break;
                        case '/':
                            area.append(" = " + ((Double.parseDouble(leftSide)
                                    / Double.parseDouble(rightSide))));
                            break;
                        case '*':
                            area.append(" = " + ((Double.parseDouble(leftSide)
                                    * Double.parseDouble(rightSide))));
                            break;
 
                        default:
                            area.setText(" No Result... ");
 
                            break;
                    }
                } catch (Exception e) {
                }
 
                try {
                    String sinValue;
                    sinValue = area.getText().substring(area.getText().indexOf(value) + 1, area.getText().length());
                    area.append("=" + Math.sin((Double.parseDouble(sinValue))));
                } catch (Exception e) {
                }
 
                String cosValue;
                try {
                    cosValue = area.getText().substring(area.getText().indexOf("cos") + 1, area.getText().length());
                    area.append("=" + Math.cos((Double.parseDouble(cosValue))));
                } catch (Exception e) {
                }
                String tanValue;
                try {
                    tanValue = area.getText().substring(area.getText().indexOf("tan") + 1, area.getText().length());
                    area.append("=" + Math.tan((Double.parseDouble(tanValue))));
                } catch (Exception e) {
                }
            }
        });
 
        sin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                value = "sin";
            }
        });
 
        cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("cos".toString());
            }
        });
 
        tan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append("tan".toString());
            }
        });
 
        point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.append(".".toString());
            }
        });
 
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent f) {
                area.setText("");
            }
        });
    }
} 