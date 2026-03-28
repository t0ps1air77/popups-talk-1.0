import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;
import java.util.TimerTask;
import java.util.Timer;
public class frame extends JFrame implements ActionListener {

    JButton button;
    JButton button2;
    JPanel panel;


    // the frame
    frame() {

            // the frame
            this.setSize(305, 305);
            this.setLayout(null);
            this.setTitle("popups talk");
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setResizable(false);
            this.setResizable(true);

            // the button (press for popups)
            button = new JButton();
            button.setBounds(10,10,263,90);
            button.setText("press for popups");
            button.addActionListener(this);

            // the second button (infos)
            button2 = new JButton();
            button2.setBounds(175, 200,100,50);
            button2.setText("infos");
            button2.addActionListener(this);

            // the shadow to the info button
            panel = new JPanel();
            panel.setBounds(180,205,100,50);
            panel.setBackground(Color.LIGHT_GRAY);

            // the blue link text down there (made by: @77t0p_SuPer)
            JLabel link = new JLabel("<html><a href=''>made by: @77t0p_SuPer</a></html>");
            link.setBounds(2,230,1000,30);

            link.setCursor(new Cursor(Cursor.HAND_CURSOR));

            link.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    try {
                        // the link
                        Desktop.getDesktop().browse(new URI("https://www.youtube.com/@77t0p_SuPer"));
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });


            // adds to the frame
            this.add(button);
            this.add(button2);
            this.add(link);
            this.add(panel);
            this.setVisible(true);
    }


    // make the button do stuff
    @Override
       public void actionPerformed(ActionEvent e) {
          // makes the second button works
           if(e.getSource()==button2) {
               window window = new window();
               System.out.println("[user clicked the 'infos' button]");
           }

           // makes the button works
           if(e.getSource()==button) {
               System.out.println("[user clicked the 'press for popups' button]");

               // the delay
               Timer timer = new Timer();
               TimerTask task = new TimerTask() {
                   @Override
                   public void run() {
                       // the popup (change the popups text from here) (write the word inside the " ")
                       int ans = JOptionPane.showConfirmDialog(null, "the message1", "title.qstin1", JOptionPane.YES_NO_CANCEL_OPTION);
                       System.out.println("[JOptionPane worked successfully]");
                       if(ans == JOptionPane.YES_OPTION) {
                           JOptionPane.showMessageDialog(null, "the message2", "title.yes2", JOptionPane.INFORMATION_MESSAGE);
                       }
                       else if(ans == JOptionPane.NO_OPTION) {
                           JOptionPane.showMessageDialog(null, "the message3", "title.no3", JOptionPane.INFORMATION_MESSAGE);
                       }
                       else {
                           JOptionPane.showMessageDialog(null, "the message.cancel4", "title.cancel4", JOptionPane.INFORMATION_MESSAGE);
                       }
                   }
               };
               // the delay (change the delay here)
               timer.schedule(task, 5000);
            }
       }
}
