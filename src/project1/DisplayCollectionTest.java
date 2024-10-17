// Project 1 Fall 2024
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Aastha Paranthaman (aasthap)

package project1;

import bag.BagInterface;
import student.TestableRandom;
import student.TestCase;

// -------------------------------------------------------------------------
/**
 * This is the test class for the DisplayCollection class. It tests to see if
 * the contents inside the bag and size of the bag are returned correctly.
 * 
 * @author Aastha Paranthaman
 * @version 17-Sep-2024
 */
public class DisplayCollectionTest
    extends TestCase
{
    /**
     * This is the setUp method that initializes all the fields.
     */
    public void setUp()
    {
        // Set up was intentionally left empty because there are no fields.
    }


    /**
     * Tests the bagContents method to ensure that every String in the bag
     * contains one of the four legal strings.
     */
    public void testBagContents()
    {
        DisplayCollection display = new DisplayCollection();
        BagInterface<String> bag = display.getItemBag();
        // Removing each item and checking if it is a valid entry till the bag
        // is empty
        while (!bag.isEmpty())
        {
            String item = bag.remove();
            assertTrue(
                item.contains("blue square") || item.contains("red square")
                    || item.contains("blue circle")
                    || item.contains("red circle"));
        }
    }


    /**
     * Tests the bagSize method to ensure that the bag size is between 5 and 15
     * inclusive of 5 and 15.
     */
    public void testBagSize()
    {
        // Randomly looping through the items in the bag to get its size
        for (int i = 5; i <= 15; i++)
        {
            TestableRandom.setNextInts(i - 5);
            DisplayCollection dc = new DisplayCollection();
            BagInterface<String> bag = dc.getItemBag();
            assertEquals(i, bag.getCurrentSize());
        }
    }
}
