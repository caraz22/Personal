import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;

public class App {
    JFrame screen = new JFrame();
    JPanel homescreen = new JPanel();
    ImageIcon appIcon = new ImageIcon("images/tiktok-logo-name.png");
    ImageIcon homeScreenBackground = new ImageIcon("images/iphone-background.jpg");
    JButton appButton = new JButton(appIcon);
    JLabel backgroundLabel = new JLabel(homeScreenBackground);
    JLabel clock = new JLabel();
    ImageIcon dataSignal = new ImageIcon("images/data-wifi-battery.png");
    JLabel signalLabel = new JLabel(dataSignal);
    ImageIcon appBar = new ImageIcon("images/app-bar.png");
    JLabel appBarLabel = new JLabel(appBar);
    ImageIcon noNameAppIcon = new ImageIcon("images/tiktok-logo-name.png");
    JButton noNameAppButton = new JButton(noNameAppIcon);
    CardLayout changeScreens = new CardLayout();
    JPanel cardPanel = new JPanel();
    JPanel forUs = new JPanel();
    ImageIcon homeBar = new ImageIcon("images/tiktok-homeBar.png");
    JLabel homeBarLabel = new JLabel(homeBar);
    JButton us = new JButton("For Us");
    JButton selfImprove = new JButton("For Yourself");
    JButton relateable = new JButton("For Relating");
    JButton snoopy = new JButton("<html>For Snoopy<br>and Woodstock</html>");
    ImageIcon us1 = new ImageIcon("images/us/IMG_4968.png");
    ImageIcon us2 = new ImageIcon("images/us/IMG_4962.PNG");
    ImageIcon us3 = new ImageIcon("images/us/IMG_4963.PNG");
    ImageIcon us4 = new ImageIcon("images/us/IMG_4970.PNG");
    ImageIcon us5 = new ImageIcon("images/us/IMG_4974.PNG");
    ImageIcon us6 = new ImageIcon("images/us/IMG_4977.PNG");
    ImageIcon us7 = new ImageIcon("images/us/IMG_4987.PNG");
    ImageIcon us8 = new ImageIcon("images/us/IMG_4989.PNG");
    ImageIcon us9 = new ImageIcon("images/us/IMG_4991.PNG");
    ImageIcon us10 = new ImageIcon("images/us/IMG_4992.PNG");
    JLabel us1Label = new JLabel(us1);
    JLabel us2Label = new JLabel(us2);
    JLabel us3Label = new JLabel(us3);
    JLabel us4Label = new JLabel(us4);
    JLabel us5Label = new JLabel(us5);
    JLabel us6Label = new JLabel(us6);
    JLabel us7Label = new JLabel(us7);
    JLabel us8Label = new JLabel(us8);
    JLabel us9Label = new JLabel(us9);
    JLabel us10Label = new JLabel(us10);
    ImageIcon next = new ImageIcon("images/arrow-next.png");
    JButton nextButton = new JButton(next);
    int labelIndex = 0;
    ImageIcon prev = new ImageIcon("images/arrow-prev.png");
    JButton prevButton = new JButton(prev);
    JLabel tiktokName = new JLabel("TikTok");
    JLabel pictureCount = new JLabel();
    JLabel underline = new JLabel();
    JPanel forYourself = new JPanel();
    JPanel forRelating = new JPanel();
    JPanel forSW = new JPanel();
    ImageIcon yourself1 = new ImageIcon("images/IMG_4750.png");
    ImageIcon yourself2 = new ImageIcon("images/IMG_4964.png");
    ImageIcon yourself3 = new ImageIcon("images/IMG_4966.png");
    ImageIcon yourself4 = new ImageIcon("images/IMG_4979.png");
    ImageIcon yourself5 = new ImageIcon("images/IMG_4986.png");
    ImageIcon yourself6 = new ImageIcon("images/IMG_4990.png");
    JLabel yourself1Label = new JLabel(yourself1);
    JLabel yourself2Label = new JLabel(yourself2);
    JLabel yourself3Label = new JLabel(yourself3);
    JLabel yourself4Label = new JLabel(yourself4);
    JLabel yourself5Label = new JLabel(yourself5);
    JLabel yourself6Label = new JLabel(yourself6);
    JButton yourselfYourselfButton = new JButton("For Yourself");
    JButton yourselfRelatingButton = new JButton("For Relating");
    JButton yourselfUsButton = new JButton("For Us");
    JButton yourselfSWButton = new JButton("For Snoopy and Woodstock");
    JLabel yourselfUnderline = new JLabel();

    App() {
        screen.setSize(475, 800);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setLocationRelativeTo(null);
        screen.add(homescreen);
        screen.add(cardPanel);

        homescreen.setLayout(null);

        appButton.setBounds(15, 75, 50, 55);
        backgroundLabel.setBounds(-1, 0, 475, 800);

        homescreen.add(backgroundLabel);

        appButton.setFocusable(false);
        appButton.setBorderPainted(false);
        backgroundLabel.add(appButton);

        tiktokName.setBounds(20, 134, 50, 10);
        backgroundLabel.add(tiktokName);        

        ZoneId eastern = ZoneId.of("America/New_York");
        LocalTime time = LocalTime.now(eastern);
        String hoursMins = timeFormat(time);

        clock.setText(hoursMins);
        clock.setBounds(15, 0, 100, 40);    
        clock.setFont(new Font("SansSerif", Font.BOLD, 17));
        backgroundLabel.add(clock);


        signalLabel.setBounds(335, 0, 150, 50);
        backgroundLabel.add(signalLabel);

        appBarLabel.setBounds(7, 585, 450, 200);
        backgroundLabel.add(appBarLabel);

        noNameAppButton.setBounds(205, 660, 50, 55);
        noNameAppButton.setFocusable(false);
        noNameAppButton.setBorderPainted(false);
        homescreen.add(noNameAppButton);        
        homescreen.setComponentZOrder(noNameAppButton, 0);

        cardPanel.setLayout(changeScreens);
        cardPanel.add(homescreen, "1");
        cardPanel.add(forUs, "2");
        cardPanel.add(forYourself, "3");
        cardPanel.add(forRelating, "4");
        cardPanel.add(forSW, "5");
        
        appButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeScreens.show(cardPanel, "2");
            }
        });

        noNameAppButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeScreens.show(cardPanel, "2");
            }
        });

        forUs.setLayout(null);
        nextButton.setBounds(410, 364, 50, 96);
        buttonSettings(nextButton);
        prevButton.setBounds(0, 364, 50, 96);
        buttonSettings(prevButton);

        homeBarLabel.setBounds(-1, 695, 475, 69);
        homeBarLabel.setBorder(BorderFactory.createLineBorder(Color.white));
        forUs.setBackground(new Color(0, 0, 0));

        forUs.add(homeBarLabel);
        forUs.add(nextButton);
        forUs.add(prevButton);

        ArrayList<JLabel> usList = new ArrayList<>();
        usList.add(us1Label);
        usList.add(us2Label);
        usList.add(us3Label);
        usList.add(us4Label);
        usList.add(us5Label);
        usList.add(us6Label);
        usList.add(us7Label);
        usList.add(us8Label);
        usList.add(us9Label);
        usList.add(us10Label);

        us.setBounds(160, 0, 150, 50);
        us.setForeground(Color.WHITE);
        us.setFont(new Font("SansSerif", Font.PLAIN, 20));
        buttonSettings(us);

        underline.setBounds(207, 0, 150, 55);
        underline.setText("_____");
        underline.setForeground(Color.WHITE);
        underline.setFont(new Font("SansSerif", Font.PLAIN, 20));
        
        forUs.add(underline);
        forUs.add(us);
        

        // height - 96 / 2 , 364 - value
        us1Label.setBounds(63, 162, 334, 500);
        us2Label.setBounds(0, 174, 475, 475);
        us3Label.setBounds(0, 174, 475, 475);
        us4Label.setBounds(0, 172, 475, 479);
        us5Label.setBounds(0, 174, 475, 475);
        us6Label.setBounds(0, 174, 475, 475);
        us7Label.setBounds(0, 312, 475, 200);
        us8Label.setBounds(0, 93, 475, 638);
        us9Label.setBounds(0, 219, 475, 386);
        us10Label.setBounds(0, 174, 475, 475);
        
        for (int i = 0; i < usList.size(); i++) {
            forUs.add(usList.get(i)).setVisible(false);
        }

        us1Label.setVisible(true);

        pictureCount.setText("(1/10)");
        pictureCount.setBounds(410, 60, 50, 15);
        pictureCount.setForeground(Color.WHITE);
        forUs.add(pictureCount);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usList.get(labelIndex).setVisible(false);
                labelIndex = (labelIndex + 1) % usList.size();
                usList.get(labelIndex).setVisible(true);
                pictureCount.setText("(" + (labelIndex + 1) + "/10)");
            }
        });

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usList.get(labelIndex).setVisible(false);
                labelIndex = (labelIndex - 1) % usList.size();
                if (labelIndex < 0) {
                    labelIndex = usList.size() - 1;
                }
                usList.get(labelIndex).setVisible(true);
                pictureCount.setText("(" + (labelIndex + 1) + "/10)");
            }
        });        

        selfImprove.setBounds(0, 0, 100, 50);
        selfImprove.setForeground(Color.WHITE);
        selfImprove.setFont(new Font("SansSerif", Font.PLAIN, 12));
        buttonSettings(selfImprove);
        forUs.add(selfImprove);

        relateable.setBounds(75, 0, 120, 50);
        relateable.setForeground(Color.WHITE);
        relateable.setFont(new Font("SansSerif", Font.PLAIN, 12));
        buttonSettings(relateable);
        forUs.add(relateable);

        snoopy.setBounds(290, 0, 150, 50);
        snoopy.setForeground(Color.WHITE);
        snoopy.setFont(new Font("SansSerif", Font.PLAIN, 12));
        buttonSettings(snoopy);
        forUs.add(snoopy);

        us.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeScreens.show(cardPanel, "2");
            }
        });

        selfImprove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeScreens.show(cardPanel, "3");
            }
        });

        relateable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeScreens.show(cardPanel, "4");
            }
        });

        snoopy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeScreens.show(cardPanel, "5");
            }
        });

        // forYourself.setLayout(null);
        // nextButton.setBounds(410, 364, 50, 96);
        // buttonSettings(nextButton);
        // prevButton.setBounds(0, 364, 50, 96);
        // buttonSettings(prevButton);

        // homeBarLabel.setBounds(-1, 695, 475, 69);
        // homeBarLabel.setBorder(BorderFactory.createLineBorder(Color.white));
        // forYourself.setBackground(new Color(0, 0, 0));

        // forYourself.add(homeBarLabel);
        // forYourself.add(nextButton);
        // forYourself.add(prevButton);

        ArrayList<JLabel> yourselfList = new ArrayList<>();
        yourselfList.add(yourself1Label);
        yourselfList.add(yourself2Label);
        yourselfList.add(yourself3Label);
        yourselfList.add(yourself4Label);
        yourselfList.add(yourself5Label);
        yourselfList.add(yourself6Label);

        yourselfYourselfButton.setBounds(160, 0, 150, 50);
        yourselfYourselfButton.setForeground(Color.WHITE);
        yourselfYourselfButton.setFont(new Font("SansSerif", Font.PLAIN, 20));
        buttonSettings(yourselfYourselfButton);

        yourselfUnderline.setBounds(182, 0, 150, 55);
        yourselfUnderline.setText("__________");
        yourselfUnderline.setForeground(Color.WHITE);
        yourselfUnderline.setFont(new Font("SansSerif", Font.PLAIN, 20));
        
        forYourself.add(yourselfUnderline);
        forYourself.add(yourselfYourselfButton);


        screen.setVisible(true);
    }

    public void buttonSettings(JButton button) {
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setFocusable(false);
    }

    public String timeFormat(LocalTime localTime) {
        String minutes = "";
        if (localTime.getMinute() < 10) {
            minutes = "0" + localTime.getMinute();
        } else {
            minutes = String.valueOf(localTime.getMinute());
        }

        return (localTime.getHour() + ":" + minutes);
    }

    public static void main(String[] args) {
        new App();
    }
}