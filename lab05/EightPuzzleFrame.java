package lab05;

import javax.swing.*;
import java.awt.*;

public class EightPuzzleFrame extends JFrame {
    private int[][] puzzle = { { 1, 0, 3 }, { 4, 5, 6 }, { 7, 8, 2 } }; // initial game state
    private JLabel lblStatus;       // show game status, progress
    private JPanel gamePanel;       // show the button grid
    private JButton[][] btnGrid;    // 2D grid of buttons showing the tiles
    private JButton btnNewGame;     //new game button
    private boolean bFinished;      // whether the game is finished or not

    // The application entry point
    public static void main(String[] args) {
        EightPuzzleFrame frame = new EightPuzzleFrame();    // create the game form
        frame.setVisible(true);                             // make it visible to the users
    }

    // Constructor method
    public EightPuzzleFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);        //set the close event
        this.setSize(new Dimension(500,500));           //set the form size
        setLocationRelativeTo(null);                    //make the form appear on the center screen
        setTitle("8 Puzzle Game");                      //set the form's title
        setLayout(new BorderLayout());                  //set the form's layout
        bFinished = false;                              //game is not finished when start
        //create the status label and put it in the north region
        lblStatus = new JLabel("Swap blank with neighbors");
        lblStatus.setFont(new Font("Arial", Font.BOLD, 14));
        this.add(lblStatus, BorderLayout.NORTH);
        //create the new game button and put it in the south region
        btnNewGame = new JButton("New Game");
        this.add(btnNewGame, BorderLayout.SOUTH);
        btnNewGame.addActionListener(e -> btnNewGame_Clicked());  //register event handler to the button
        //Initialize the game panel and put it in the center region
        gamePanel = new JPanel(new GridLayout(3,3));
        this.add(gamePanel, BorderLayout.CENTER);
        //TODO: Initialize the button grid to show the tiles and associate the event handler
    }

    // This method handles the click event on the button on the grid
    // r,c: the row and column indexes of the button on the grid
    public void btnGrid_Clicked(int r, int c) {
        // TODO: Add code for this btnGrid_Clicked method below
    }

    //Utility method to swap two tiles at (r1,c1) and (r2,c2) on both puzzle array and btnGrid
    private void swap(int r1, int c1, int r2, int c2) {
        // TODO: Add code for this method below
    }

    // This method checks if the game is finished or not.
    public boolean checkWin() {
        // TODO: Add code for this checkWin method below
        return false; //may need to fix this line
    }

    // This method resets the game to play a new game
    public void btnNewGame_Clicked() {
        // TODO: Add code for this btnNewGame_Clicked method below
    }
}
