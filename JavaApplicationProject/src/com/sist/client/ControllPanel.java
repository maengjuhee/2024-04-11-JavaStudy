package com.sist.client;

import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;

public class ControllPanel extends JPanel{
    CardLayout card=new CardLayout();
    EmpListPanel ep=new EmpListPanel();
    public ControllPanel()
    {
        setLayout(card);
        add("EP",ep);
    }
}
