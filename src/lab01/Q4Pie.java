
package lab01;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.Arrays;

public class Q4Pie extends JPanel {
    private static final String TITLE = "Pie Chart: Total Sales of Product A";
    private static final String[] X_DATA = new String[]{"January", "February", "March", "April", "May", "June"};
    private static final int[] Y_DATA = new int[]{2500, 1600, 2000, 2700, 3200, 800};
    private static final int Y_DATA_TOTAL = Arrays.stream(Y_DATA).sum();

    private static final int FRAME_WIDTH = 550, FRAME_HEIGHT = 580;
    private static final int MARGIN_TOP = 60;
    private static final int DIAMETER = 450;

    public static void main(String[] args) {
        JFrame frame = new JFrame(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new Q4Pie();
        frame.getContentPane().add(panel);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);
    }

    private static void createTitle(Graphics2D g) {
        g.drawString(TITLE, (FRAME_WIDTH - g.getFontMetrics().stringWidth(TITLE)) / 2, 40);
    }

    private static void drawPie(Graphics2D g) {
        double prevAngle = 90;

        for (int i = 0; i < Y_DATA.length; i++) {
            double arcAngle = 1.0 * Y_DATA[i] * 360 / Y_DATA_TOTAL;
            double angle = (prevAngle - arcAngle / 2) * Math.PI / 180;
            double x = (FRAME_WIDTH / 2.0) + (DIAMETER / 2.0) * Math.cos(angle) * 2 / 3;
            double y = MARGIN_TOP + DIAMETER / 2.0 - (DIAMETER / 2.0) * Math.sin(angle) * 2 / 3;

            Arc2D.Double arc = new Arc2D.Double((FRAME_WIDTH - DIAMETER) / 2.0, MARGIN_TOP, DIAMETER, DIAMETER, prevAngle, -arcAngle, Arc2D.PIE);
            g.setColor(new Color((float) Math.random() * 2 / 3 + .3f, (float) Math.random() * 2 / 3 + .3f, (float) Math.random() * 2 / 3 + .3f));
            g.fill(arc);
            g.setColor(Color.BLACK);
            g.draw(arc);

            String text;
            text = X_DATA[i];
            g.drawString(text, (float) (x - g.getFontMetrics().stringWidth(text) / 2), (float) y - g.getFontMetrics().getAscent());
            text = "" + Y_DATA[i];
            g.drawString(text, (float) (x - g.getFontMetrics().stringWidth(text) / 2), (float) y);
            text = "(" + Math.round(Y_DATA[i] * 100.0 / Y_DATA_TOTAL) + "%)";
            g.drawString(text, (float) (x - g.getFontMetrics().stringWidth(text) / 2), (float) y + g.getFontMetrics().getAscent());

            prevAngle -= arcAngle;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setFont(new Font("Default", Font.BOLD, 20));
        createTitle(g2d);
        g.setFont(new Font("Default", Font.BOLD, 16));
        drawPie(g2d);
    }
}
