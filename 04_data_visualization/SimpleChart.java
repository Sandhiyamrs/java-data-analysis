import java.util.*;
import javax.swing.*;
import java.awt.*;

public class SimpleChart extends JPanel {
    private final int[] data = {10, 20, 30, 40, 50};

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth() / data.length;
        for (int i = 0; i < data.length; i++) {
            int height = data[i] * 5;
            g.fillRect(i * width + 10, getHeight() - height - 30, width - 20, height);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Bar Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(new SimpleChart());
        frame.setVisible(true);
    }
}

