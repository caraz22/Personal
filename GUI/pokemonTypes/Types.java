package pokemonTypes;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.image.BufferedImage;

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
    JLabel pick = new JLabel("Pick type(s)");
    JLabel notVeryEffective = new JLabel("Not very effective:");
    JLabel superEffective = new JLabel("Super effective:");
    JLabel noEffect = new JLabel("No Effect:");
    

    Types() {

    }
}