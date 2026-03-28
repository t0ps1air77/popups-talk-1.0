import javax.swing.*;
import java.awt.*;

public class window {

    JFrame framew = new JFrame();

    // the texts
    JLabel label = new JLabel("how to set text for popups:");
    JLabel label2 = new JLabel("set it from the code. find the word '//popups'");

    JLabel label3 = new JLabel("what this even about:");
    JLabel label4 = new JLabel("make it look like you got a text from a hacker");

    JLabel label5 = new JLabel("what was used to make this:");
    JLabel label6 = new JLabel("java. you have to use this in a IDE");

    // the frame (infos)
    window() {

        // text 1 (question)
        label.setBounds(0,0,10000,30);
        label.setFont(new Font(null, Font.PLAIN, 15));

        // text 2 (answer)
        label2.setBounds(0,20,10000,30);
        label2.setFont(new Font(null, Font.PLAIN, 15));

        // text 3 (question)
        label3.setBounds(0, 45, 10000, 30);
        label3.setFont(new Font(null, Font.PLAIN, 15));

        // text 4 (answer)
        label4.setBounds(0, 60, 10000, 30);
        label4.setFont(new Font(null, Font.PLAIN, 15));

        // text 5 (question)
        label5.setBounds(0, 85, 10000, 30);
        label5.setFont(new Font(null, Font.PLAIN, 15));

        // text 6 (answer)
        label6.setBounds(0, 100, 10000, 30);
        label6.setFont(new Font(null, Font.PLAIN, 15));


        // the second frame (after you click the infos button)
        framew.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framew.setSize(305, 305);
        framew.setLayout(null);
        framew.setTitle("infos. (click - to exit)");
        framew.setVisible(true);

        System.out.println("[new window worked successfully]");

        // adds stuff to the second frame
        framew.add(label);
        framew.add(label2);
        framew.add(label3);
        framew.add(label4);
        framew.add(label5);
        framew.add(label6);
    }
}
