package lab01;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;

public class Q4Bar extends JPanel {
    private static final String TITLE = "Bar Chart: Total Sales of Product A";
    private static final String X_LABEL = "Month (in 2016)", Y_LABEL = "Amount";
    private static final String[] X_DATA = new String[]{"January", "February", "March", "April", "May", "June"};
    private static final int[] Y_DATA = new int[]{2500, 1600, 2000, 2700, 3200, 800};

    private static final int FRAME_WIDTH = 700, FRAME_HEIGHT = 600;
    private static final int MARGIN_LEFT = 50, MARGIN_RIGHT = 120;
    private static final int MARGIN_TOP = 45, MARGIN_BOTTOM = 75;
    private static final int X_MIN = MARGIN_LEFT, X_MAX = FRAME_WIDTH - MARGIN_RIGHT;
    private static final int Y_MIN = MARGIN_TOP, Y_MAX = FRAME_HEIGHT - MARGIN_BOTTOM;
    private static final int ARROW_SIZE = 13, SEP_BAR_LENGTH = 5, BAR_WIDTH = 50;
    private static final float PEN_RADIUS = 1.5f;

    private static final int X_START = 60, X_END = 50, Y_END = 40;
    private static final int Y_DATA_SEP = 500;
    private static final int Y_DATA_SEP_NUM = Math.ceilDiv(Arrays.stream(Y_DATA).max().getAsInt(), Y_DATA_SEP);
    private static final int Y_DATA_MAX = Y_DATA_SEP * Y_DATA_SEP_NUM;

    private static final double X_SEP = 1.0 * (X_MAX - X_MIN - X_END) / X_DATA.length;
    private static final double Y_SEP = 1.0 * (Y_MAX - Y_MIN - Y_END) / Y_DATA_SEP_NUM;

    public static void main(String[] args) {
        JFrame frame = new JFrame(TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new Q4Bar();
        frame.getContentPane().add(panel);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);
    }

    private static void createTitle(Graphics2D g) {
        g.drawString(TITLE, (FRAME_WIDTH - g.getFontMetrics().stringWidth(TITLE)) / 2, 40);
    }

    private static void createXAxis(Graphics2D g) {
        BasicStroke stroke = new BasicStroke(PEN_RADIUS, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        g.setStroke(stroke);

        // Main line
        g.draw(new Line2D.Double(X_MIN, Y_MAX, X_MAX, Y_MAX));

        // Axis label
        int labelSpace = 5;
        g.drawString(X_LABEL, X_MAX + labelSpace, Y_MAX);

        // Axis arrow
        g.draw(new Line2D.Double(X_MAX - ARROW_SIZE, Y_MAX - ARROW_SIZE * Math.tan(Math.PI / 9), X_MAX, Y_MAX));
        g.draw(new Line2D.Double(X_MAX - ARROW_SIZE, Y_MAX + ARROW_SIZE * Math.tan(Math.PI / 9), X_MAX, Y_MAX));

        // Separation
        int sepSpace = 18;
        double x = X_MIN + X_START;
        for (String month : X_DATA) {
            g.draw(new Line2D.Double(x, Y_MAX - SEP_BAR_LENGTH, x, Y_MAX + SEP_BAR_LENGTH));
            float width = g.getFontMetrics().stringWidth(month);
            g.drawString(month, (float) x - width / 2, Y_MAX + sepSpace);
            x += X_SEP;
        }
    }

    private static void createYAxis(Graphics2D g) {
        BasicStroke stroke = new BasicStroke(PEN_RADIUS, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        g.setStroke(stroke);

        // Main line
        g.draw(new Line2D.Double(X_MIN, Y_MIN, X_MIN, Y_MAX));

        // Axis arrow
        g.draw(new Line2D.Double(X_MIN - ARROW_SIZE * Math.tan(Math.PI / 9), Y_MIN + ARROW_SIZE, X_MIN, Y_MIN));
        g.draw(new Line2D.Double(X_MIN + ARROW_SIZE * Math.tan(Math.PI / 9), Y_MIN + ARROW_SIZE, X_MIN, Y_MIN));

        // Axis label
        int labelSpace = 5;
        g.drawString(Y_LABEL, X_MIN - g.getFontMetrics().stringWidth(Y_LABEL) / 2, Y_MIN - labelSpace);

        // Separation
        int sepSpace = 7;
        int currentY = Y_DATA_MAX;
        for (double y = Y_MIN + Y_END; y <= Y_MAX; y += Y_SEP) {
            g.draw(new Line2D.Double(X_MIN - SEP_BAR_LENGTH, y, X_MIN + SEP_BAR_LENGTH, y));
            g.drawString("" + currentY, X_MIN - g.getFontMetrics().stringWidth("" + currentY) - sepSpace, (float) (y + g.getFontMetrics().getAscent() / 2));
            currentY -= Y_DATA_SEP;
        }
    }

    private static void plotData(Graphics2D g) {
        int x = X_MIN + X_START;
        int space = 5;

        for (int data : Y_DATA) {
            // Bar
            int height = (int) (Y_SEP * Y_DATA_SEP_NUM * data / Y_DATA_MAX);
            int y = MARGIN_TOP + Y_MAX - Y_MIN - height;
            g.fill(new Rectangle2D.Double(x - BAR_WIDTH / 2.0, y, BAR_WIDTH, height));

            // Text
            float xText = x - (float) (g.getFontMetrics().stringWidth("" + data) / 2.0);
            g.drawString("" + data, xText, y - space);

            // Line
            Stroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1f, new float[]{3f}, 0);
            g.setStroke(dashed);
            g.draw(new Line2D.Double(X_MIN, y, x, y));
            x += X_SEP;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setFont(new Font("Default", Font.BOLD, 20));
        createTitle(g2d);

        g2d.setFont(new Font("Default", Font.BOLD, 12));
        createXAxis(g2d);
        createYAxis(g2d);

        g2d.setFont(new Font("Default", Font.PLAIN, 12));
        plotData(g2d);
    }
}
