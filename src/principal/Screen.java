package principal;

import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {

    public Screen() {

        setTitle("Challenge ONE - Conversor");
        setVisible(true);
        setSize(600,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JButton button = new JButton();
        button.setText("Clique aqui");
        button.setBounds(230, 100, 140, 40 );
        button.setForeground(new Color(159, 159, 159));
        button.setBackground(new Color(26, 92, 167));

        add(button);

    }
}
