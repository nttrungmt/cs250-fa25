package lab06;

import java.awt.*;
import javax.swing.*;

public class AddNewItemDialog extends JDialog {
    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private ItemManagerForm mainForm;   //link to the main form to update the table
    private Item obj;                   //the item object to be added to the table on the main form

    /* Launch the application.     */
    public static void main(String[] args) {
        try {
            AddNewItemDialog dialog = new AddNewItemDialog(null);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* Create the dialog */
    public AddNewItemDialog(ItemManagerForm mainForm) {
        setTitle("Add New Item Dialog");
        this.mainForm = mainForm;    //set the parent form of this dialog
        setModal(true);              //cannot return to the parent form while this dialog is opened
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        
    }
        
}
