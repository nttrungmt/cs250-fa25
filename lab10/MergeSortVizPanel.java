package lab10;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.util.Random;
import javax.swing.*;

public class MergeSortVizPanel extends JPanel {
    public static final int SIZE = 20;                  //array size
    private int[] array;                                //the array to be sorted
    private int[] temp;                                 //temporary array for the merging
    private int lStart, lEnd, rStart, rEnd;             //indexes for left and right sub-arrays
    private int src, dest;                              //indexes for copy from src to dest
    private int phase;                                  //visualization phase
    private int delay = 900;                            //default delay time in milliseconds
    //constructor method
    public MergeSortVizPanel() {
        initialize();
        this.setPreferredSize(new Dimension(800, 600));
        this.setLayout(null);
        //register the key event handler to this panel
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                panel_KeyPressed(e);
            }
        });
    }

    //initialize data
    private void initialize() {
        Random random = new Random();
        array = new int[SIZE];
        temp = new int[SIZE];
        phase=-1;lStart=-1; lEnd=-1; rStart=-1; rEnd=-1;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(240) + 20; // Ensure values are visible
        }
    }
    
    //this method handlesthe  key pressed event on the panel
    private void panel_KeyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        //Handle the key pressed
        if(key == KeyEvent.VK_S) {              //Start animation
            new Thread(() -> mergeSort(0, array.length-1)).start();
        } else if(key == KeyEvent.VK_R) {       //Reset
            initialize();
            repaint();
        }
    }
    
    //main mergeSort method
    private void mergeSort(int low, int high){
        //TODO: perform mergesort on array[low -> high]
    }
    
    //merge method with animation markers
    private void merge(int low, int mid, int high){
        //TODO: merge array[low -> mid] and array[mid+1 -> high] and save to temp[low -> high]
        
        //TODO: copy back temp[low -> high] to override array[low -> high]
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int barWidth = getWidth() / array.length;
        //TODO: draw the array on top
        
        //TODO: draw the temp array on the bottom
        
        //TODO: draw the arrow displaying the copy data between the array and temp and vice versa
    }
    
    //utility method to put the thread to sleep for delay milliseconds
    public static void sleep(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) { }
    }
    
    //utility method to draw an arrow from (x1,y1) to (x2,y2)
    public void drawArrow(Graphics g, int x1, int y1, int x2, int y2) {        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.red);
        g2d.drawLine(x1, y1,x2, y2);
        double angle = Math.atan2(y2 - y1, x2 - x1);
        AffineTransform tx = g2d.getTransform();
        tx.translate(x2, y2);
        tx.rotate(angle - Math.PI / 2d);
        g2d.setTransform(tx);
        Polygon arrowHead = new Polygon();
        arrowHead.addPoint(0, 5);
        arrowHead.addPoint(-5, -5);
        arrowHead.addPoint(5, -5);
        g2d.fill(arrowHead);
    }
    
    //utility method to draw a bar that represents a value in the array
    public void drawBar(Graphics g, int val, Color color, int x, int y, int w, int h) {
        g.setColor(color);
        FontMetrics fmt = g.getFontMetrics();
        int textHeight = fmt.getHeight();
        g.fillRect(x, y, w-4, h-10);
        int textWidth = fmt.stringWidth(val+"");
        g.drawString(val+"", x+(w-textWidth)/2, y+h+(18-textHeight)/2);
    }

    //program main entry point
    public static void main(String[] args) {
        JFrame frame = new JFrame("Merge Sort Visualization");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        MergeSortVizPanel panel = new MergeSortVizPanel();
        panel.setFocusable(true);
        frame.add(panel);        
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
