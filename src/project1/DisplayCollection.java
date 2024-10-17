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
import student.TestableRandom;

// -------------------------------------------------------------------------
/**
 * This is the DisplayCollection class. It creates the array of string values
 * for the bag and randomly adds items and gets items from the bag.
 * 
 * @author Aastha Paranthaman
 * @version 17-Sep-2024
 */
public class DisplayCollection
{
    // ~ Fields ................................................................
    
    /**
     * This STRINGS field is a constant that is available to any other classes.
     */ 
    public static final String[] STRINGS =
        { "red circle", "blue circle", "red square", "blue square" };
    private BagInterface<String> itemBag;

    // ~ Constructors ..........................................................

    /**
     * This is the DisplayCollection Constructor.
     */
    public DisplayCollection()
    {
        this.itemBag = new Bag<>();
        // Using the TestableRandom class to pick a random number from 5-15
        TestableRandom random = new TestableRandom();
        int count = random.nextInt(11) + 5;
        for (int i = 0; i < count; i++)
        {
            itemBag.add(STRINGS[random.nextInt(STRINGS.length)]);
        }
    }

    // ~Public Methods ........................................................


    /**
     * This is the getItemBag method that retrieves all the items in the bag.
     * 
     * @return BagInterface<String> A BagInterface that holds String values.
     */
    public BagInterface<String> getItemBag()
    {
        return itemBag;
    }
}
