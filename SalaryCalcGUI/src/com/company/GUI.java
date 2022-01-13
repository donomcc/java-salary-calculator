package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    private JPanel mainPanel;
    private JPanel topPanel;
    private JPanel midPanel;
    private JPanel botPanel;
    private JButton btnCalc;
    private JLabel yearlyLabel;
    private JTextField textField1;
    private JLabel monthlyLabel;
    private JLabel biweeklyLabel;
    private JLabel weeklyLabel;
    private JRadioButton radioButton1;
    private JRadioButton onePersonRadioButton;

    public GUI (String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        btnCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int hourlyWage = (int)(Integer.parseInt(textField1.getText()));
                int yearlySal = hourlyWage*40*52;
                int monthlySal = yearlySal/12;
                int biweeklySal = hourlyWage*40*2;
                int weeklySal = hourlyWage*40;
                yearlyLabel.setText("Yearly Salary: $"+yearlySal);
                monthlyLabel.setText("Monthly Salary: $"+monthlySal);
                biweeklyLabel.setText("BiWeekly Salary: $"+biweeklySal);
                weeklyLabel.setText("Weekly Salary: $"+weeklySal);
            }
        });
    }


}
