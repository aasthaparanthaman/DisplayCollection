// Project 1 Fall 2024
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Aastha Paranthaman (aasthap)

package project1;

import bag.Bag;
import bag.BagInterface;
import cs2.TextShape;
import student.TestableRandom;
import cs2.Window;
import cs2.Button;
import cs2.WindowSide;

// -------------------------------------------------------------------------
/**
 * This is the ProjectRunner class. It has a constructor and a main method that
 * runs the methods to get the items from inside the bag.
 * 
 * @author Aastha Paranthaman
 * @version 17-Sep-2024
 */
public class ProjectRunner
{
    // ~Public Methods ........................................................

    /**
     * This is the main method that creates an instances of the
     * DisplayCollection and ShapeWindow classes and gets the items inside the
     * bag.
     * 
     * @param args
     *            Passing string arguments to the command line interface.
     */
    public static void main(String[] args)
    {
        DisplayCollection display = new DisplayCollection();
        ShapeWindow shape = new ShapeWindow(display.getItemBag());
    }
}
