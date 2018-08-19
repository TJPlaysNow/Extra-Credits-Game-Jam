package com.tjplaysnow.ecgj.game.main;
import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class GameWindow
{
    JFrame window;
    Container Con;
    JPanel Title, Start, MaintextPanel, ChoicePanel, PlayerStats;
    JLabel TitleName, Money, MoneyNumber, Year, YearNumber;
    Font TitleFont = new Font("Times New Roman", Font.PLAIN,90);
    Font Default = new Font("Times New Roman", Font.PLAIN,30);
    JButton startButton, choice1, choice2;
    private JTextArea MainTextArea;
    TitleHandle TtHandeler = new TitleHandle();
//    ChoiceHandler choiceHandler = new ChoiceHandler();

    int year;
    int money;

    public static void main(String[] args)
    {
        new GameWindow();
    }

    public GameWindow()
    {
        window = new JFrame();
        window.setSize(900,700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        Con = window.getContentPane();

        Title = new JPanel();
        Title.setBounds(100,100,600,150);
        Title.setBackground(Color.black);
        TitleName = new JLabel("PlaceHolder");
        TitleName.setForeground(Color.white);
        TitleName.setFont(TitleFont);

        Start = new JPanel();
        Start.setBounds(300,400,200,100);
        Start.setBackground(Color.BLACK);

        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(Default);
        startButton.addActionListener(TtHandeler);
        startButton.setFocusPainted(false);

        Title.add(TitleName);
        Start.add(startButton);
        Con.add(Title);
        Con.add(Start);

        playSound();


    }
    public void playSound() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src - Game/idk.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
    }

    public void GameScreen()
    {
        Title.setVisible(false);
        Start.setVisible(false);

        MaintextPanel = new JPanel();
        MaintextPanel.setBounds(80,100,700,350);
        MaintextPanel.setBackground(Color.black);
        Con.add(MaintextPanel);

        MainTextArea = new JTextArea();
        MainTextArea.setBounds(80,100,700,350);
        MainTextArea.setBackground(Color.black);
        MainTextArea.setForeground(Color.white);
        MainTextArea.setFont(Default);
        MainTextArea.setLineWrap(true);
        MainTextArea.setEditable(false);
        MaintextPanel.add(MainTextArea);

        ChoicePanel = new JPanel();
        ChoicePanel.setBounds(250,450,300,150);
        ChoicePanel.setBackground(Color.black);
        ChoicePanel.setLayout(new GridLayout(2,1));
        Con.add(ChoicePanel);

        choice1 = new JButton();
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(Default);
        choice1.setFocusPainted(false);
//        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("1");
        ChoicePanel.add(choice1);

        choice2 = new JButton();
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(Default);
        choice2.setFocusPainted(false);
//        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("2");
        ChoicePanel.add(choice2);

        PlayerStats = new JPanel();
        PlayerStats.setBounds(100,15,600,50);
        PlayerStats.setBackground(Color.black);
        PlayerStats.setLayout(new GridLayout(1,4));
        Con.add(PlayerStats);

        Money = new JLabel("Credits:");
        Money.setFont(Default);
        Money.setForeground(Color.white);
        PlayerStats.add(Money);
        MoneyNumber = new JLabel();
        MoneyNumber.setFont(Default);
        MoneyNumber.setForeground(Color.white);
        PlayerStats.add(MoneyNumber);

        Year = new JLabel("Year:");
        Year.setFont(Default);
        Year.setForeground(Color.white);
        PlayerStats.add(Year);
        YearNumber = new JLabel();
        YearNumber.setFont(Default);
        YearNumber.setForeground(Color.white);
        PlayerStats.add(YearNumber);
        StatsInit();

    }
    public void StatsInit()
    {
        year = 2100;
        money = 0;
        YearNumber.setText("" + year);
        MoneyNumber.setText("" + money);
        choice1.setText("Next");
        MainTextArea.setText("Your vision flashes all white before it returns. The eye scanner makes another run across your pupils before you hear a quiet chime come from your AsteRisk brand check-in module. Your credentials fill up onto the screen.\n");
        nextText();
    }
    public void nextText()
    {
        choice1.setText("Next");
    }

    public class TitleHandle implements ActionListener{

        public void actionPerformed(ActionEvent event)
        {
            GameScreen();
        }
    }
//    public class ChoiceHandler implements ActionListener
//    {
//        public void actionPerformed(ActionEvent event)
//        {
//            String PlayerCommand = event.getActionCommand();
//            switch (Node)
//            {
//                case "1-1":
//                    switch (PlayerCommand)
//                    {
//                        case "1":
//                    }
//            }
//        }
//    }

}
