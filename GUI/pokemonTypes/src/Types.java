package pokemonTypes.src;

import java.util.ArrayList;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Types {

    JFrame frame = new JFrame();
    JPanel pickTypes = new JPanel();
    ArrayList<JButton> types = new ArrayList<>();
    JButton normal = new JButton("NORMAL");
    JButton fire = new JButton("FIRE");
    JButton water = new JButton("WATER");
    JButton electric = new JButton("ELECTRIC");
    JButton grass = new JButton("GRASS");
    JButton ice = new JButton("ICE");
    JButton fighting = new JButton("FIGHTING");
    JButton poison = new JButton("POISON");
    JButton ground = new JButton("GROUND");
    JButton flying = new JButton("FLYING");
    JButton psychic = new JButton("PSYCHIC");
    JButton bug = new JButton("BUG");
    JButton rock = new JButton("ROCK");
    JButton ghost = new JButton("GHOST");
    JButton dragon = new JButton("DRAGON");
    JButton dark = new JButton("DARK");
    JButton steel = new JButton("STEEL");
    JButton fairy = new JButton("FAIRY");
    JButton check = new JButton("Check");
    JPanel strengthWeakness = new JPanel();
    ArrayList<JLabel> typeLabels = new ArrayList<>();
    JLabel normalLabel = new JLabel("NORMAL");
    JLabel fireLabel = new JLabel("FIRE");
    JLabel waterLabel = new JLabel("WATER");
    JLabel electricLabel = new JLabel("ELECTRIC");
    JLabel grassLabel = new JLabel("GRASS");
    JLabel iceLabel = new JLabel("ICE");
    JLabel fightingLabel = new JLabel("FIGHTING");
    JLabel poisonLabel = new JLabel("POISON");
    JLabel groundLabel = new JLabel("GROUND");
    JLabel flyingLabel = new JLabel("FLYING");
    JLabel psychicLabel = new JLabel("PSYCHIC");
    JLabel bugLabel = new JLabel("BUG");
    JLabel rockLabel = new JLabel("ROCK");
    JLabel ghostLabel = new JLabel("GHOST");
    JLabel dragonLabel = new JLabel("DRAGON");
    JLabel darkLabel = new JLabel("DARK");
    JLabel steelLabel = new JLabel("STEEL");
    JLabel fairyLabel = new JLabel("FAIRY");
    JButton startOver = new JButton("Start Over");
    JLabel pick = new JLabel();
    JTextField pickText = new JTextField("Pick type(s)");
    JLabel notVeryEffective = new JLabel("Not very effective:");
    JLabel superEffective = new JLabel("Super effective:");
    JLabel noEffect = new JLabel("No Effect:");
    CardLayout cL = new CardLayout();
    JPanel panel = new JPanel();
    Icon bugIcon = new ImageIcon("GUI/pokemonTypes/images/bug.png");
    Icon darkIcon = new ImageIcon("GUI/pokemonTypes/images/dark.png");
    Icon dragonIcon = new ImageIcon("GUI/pokemonTypes/images/dragon.png");
    Icon electricIcon = new ImageIcon("GUI/pokemonTypes/images/electric.png");
    Icon fairyIcon = new ImageIcon("GUI/pokemonTypes/images/fairy.png");
    Icon fightingIcon = new ImageIcon("GUI/pokemonTypes/images/fighting.png");
    Icon fireIcon = new ImageIcon("GUI/pokemonTypes/images/fire.png");
    Icon flyingIcon = new ImageIcon("GUI/pokemonTypes/images/flying.png");
    Icon ghostIcon = new ImageIcon("GUI/pokemonTypes/images/ghost.png");
    Icon grassIcon = new ImageIcon("GUI/pokemonTypes/images/grass.png");
    Icon groundIcon = new ImageIcon("GUI/pokemonTypes/images/ground.png");
    Icon iceIcon = new ImageIcon("GUI/pokemonTypes/images/ice.png");
    Icon normalIcon = new ImageIcon("GUI/pokemonTypes/images/normal.png");
    Icon poisonIcon = new ImageIcon("GUI/pokemonTypes/images/poison.png");
    Icon psychicIcon = new ImageIcon("GUI/pokemonTypes/images/psychic.png");
    Icon rockIcon = new ImageIcon("GUI/pokemonTypes/images/rock.png");
    Icon steelIcon = new ImageIcon("GUI/pokemonTypes/images/steel.png");
    Icon waterIcon = new ImageIcon("GUI/pokemonTypes/images/water.png");
    Icon boxBorderIcon = new ImageIcon("GUI/pokemonTypes/images/boxBorder.png");
    

    Types() {
        frame.setTitle("Type picker");
        frame.setSize(1200, 750);
        frame.setResizable(false);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel.setLayout(cL);
        panel.add(pickTypes, "1");
        panel.add(strengthWeakness, "2");

        pickTypes.setLayout(null);
        pickTypes.setBackground(new Color(255, 255, 255));

        pick.setBounds(415, 0, 350, 120);
        pick.setIcon(boxBorderIcon);
        
        pickText.setBounds(430, 25, 270, 80);
        pickText.setFont(new Font("Courier", Font.BOLD, 28));
        pickText.setBorder(BorderFactory.createEmptyBorder());
        pickText.setHorizontalAlignment(JTextField.CENTER);
        
        pickText.setBackground(new Color(196, 196, 196));
        
        pickTypes.add(pick);
        pickTypes.add(pickText);
    }

    public static void main(String[] args) {
        new Types();
    }
}