import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class thingz extends JFrame implements ActionListener {
    private JButton MOLE1Button;
    private JButton MOLE2Button;
    private JButton MOLE3Button;
    private JButton MOLE4Button;
    private JButton MOLE5;
    private JButton MOLE6Button;
    private JButton MOLE7Button;
    private JButton MOLE8;
    private JButton MOLE9;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel9;
    private JPanel panel8;

    public thingz() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(panel1);
        setContentPane(panel2);
        setContentPane(panel3);
        setContentPane(panel4);
        setContentPane(panel5);
        setContentPane(panel6);
        setContentPane(panel7);
        setContentPane(panel8);
        setContentPane(panel9);
        setTitle("WHACK A MOLE");
        setSize(550, 200);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MOLE1Button.addActionListener(this);
        MOLE2Button.addActionListener(this);
        MOLE3Button.addActionListener(this);
        MOLE4Button.addActionListener(this);
        MOLE5.addActionListener(this);
        MOLE6Button.addActionListener(this);
        MOLE7Button.addActionListener(this);
        MOLE8.addActionListener(this);
        MOLE9.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object actionSource = e.getSource();
        if (actionSource instanceof JButton) {

        }
    }
}
