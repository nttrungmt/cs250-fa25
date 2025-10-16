package lab08;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.LinkedList;

public class SnakePanel extends JPanel {
    public static final int ROWS = 30;                        // #rows
    public static final int COLS = 30;                        // #cols
    public static final int SIZE = 20;                        // Tile size (one side)
    public static final int DELAY = 150;                      // delay for the timer
    public static final int LEFT=0, UP=1, RIGHT=2, DOWN=3;    // moving direction
    private int appleX=0, appleY=0;                           // position of the red apple
    private LinkedList<Point> snakeSegments;                  // list of snake segments
    
    private Timer timer;                            // timer to update game state
    private boolean isGameOver = false;             // whether the game is finished or not
    private int direction = RIGHT;                  // moving direction (default to RIGHT)
    
    //constructor method
    SnakePanel() {
        this.setPreferredSize(new Dimension(COLS*SIZE, ROWS*SIZE));  //set preferred size for this panel
        initialize();                                                //initialize the game state
        // Register the key event handler to this panel
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                panel_KeyPressed(e);
            }
        });
        // Set up the timer
        timer = new Timer(DELAY, e -> timerTicked(e));
        timer.start();
    }

    //Initialize the game by choosing a random location for the apple and 1st snake segment
    public void initialize() {
        // TODO: add code below
    }
    
    //This method draws the snake board game on the panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        // Clear the background
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, width, height);        
        // TODO: add code below
    }
    
    //this method handles the key pressed event on the panel
    private void panel_KeyPressed(KeyEvent e) {
        // TODO: add code below
    }
    
    //this method updates the game state: move the snake, capture the apple, and check collision
    private void timerTicked(ActionEvent e) {
        // TODO: add code below
    }

    //The program entry point which creates the window with the game panel
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //press x on window -> exit application
        SnakePanel gamePanel = new SnakePanel();                 //create the game panel
        gamePanel.setFocusable(true);                            //allow it to receive events (keys)
        frame.add(gamePanel);                                    //add it to the frame window
        frame.pack();                                            //resize the frame to fit
        frame.setResizable(false);                               //fix window size
        frame.setLocationRelativeTo(null);                       //make window appear on the center screen
        frame.setVisible(true);                                  //display the frame window
    }
}
