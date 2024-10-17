// Project 1 Fall 2024
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Aastha Paranthaman (aasthap)

package project1;

import bag.Bag;
import java.awt.Color;
import bag.BagInterface;
import cs2.TextShape;
import student.TestableRandom;
import cs2.Window;
import cs2.Button;
import cs2.WindowSide;

// -------------------------------------------------------------------------
/**
 * This is the ShapeWindow class. It creates the quit and choose buttons and
 * displays the different items inside the bag with different color text.
 * 
 * @author Aastha Paranthaman
 * @version 17-Sep-2024
 */
public class ShapeWindow
{
    // ~ Fields ................................................................

    private Window window;
    private TextShape textShape;
    private Button quitButton;
    private Button chooseButton;
    private BagInterface<String> itemBag;

    // ~ Constructors ..........................................................

    /**
     * This is the ShapeWindow Constructor.
     * 
     * @param itemBag
     *            The BagInterface that holds String values.
     */
    public ShapeWindow(BagInterface<String> itemBag)
    {
        // Creating the GUI window
        window = new Window();
        window.setTitle("Project 1");
        this.itemBag = itemBag;
        
        // Creating the "Quit" Button
        quitButton = new Button("Quit");
        quitButton.onClick(this, "clickedQuit");
        window.addButton(quitButton, WindowSide.NORTH);
        
        // Creating the "Choose" Button
        chooseButton = new Button("Choose");
        chooseButton.onClick(this, "clickedChoose");
        window.addButton(chooseButton, WindowSide.SOUTH);
        textShape = new TextShape(0, 0, "");
        window.addShape(textShape);
    }

    // ~Public Methods ........................................................


    /**
     * This clickedQuit method exits out of the GUI window.
     * 
     * @param quitButton
     *            The Button that quits the GUI.
     */
    public void clickedQuit(Button quitButton)
    {
        System.exit(0);
    }


    /**
     * This clickedChoose method chooses a new item out of the Bag.
     * 
     * @param clickedChoose
     *            The Button that chooses an item.
     */
    public void clickedChoose(Button clickedChoose)
    {
        if (!itemBag.isEmpty())
        {
            String item = itemBag.remove();
            textShape.setText(item);
            this.colorText();
            this.centerText();
        }
        else
        {
            textShape.setText("No more items");
            this.colorText();
            this.centerText();
        }
    }


    /**
     * This colorText method displays the color of the text.
     */
    private void colorText()
    {
        // Setting the foreground color of each item to either a red, blue or
        // black color depending on the text in the textShape
        if (this.textShape != null && textShape.getText().contains("red"))
        {
            textShape.setForegroundColor(Color.RED);
        }
        else if (this.textShape != null && textShape.getText().contains("blue"))
        {
            textShape.setForegroundColor(Color.BLUE);
        }
        else
        {
            textShape.setForegroundColor(Color.BLACK);
        }
    }


    /**
     * This centerText method center aligns the text.
     */
    private void centerText()
    {
        // Calculating the mid point of the window and the textShape to get the
        // center point
        textShape.moveTo(
            (window.getGraphPanelWidth() - textShape.getWidth()) / 2,
            (window.getGraphPanelHeight() - textShape.getHeight()) / 2);
    }
}
