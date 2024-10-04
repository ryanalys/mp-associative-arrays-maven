package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Your Name Here
 */
public class TestsFromStudent {
  /**
   * A simple test.
   */
  @Test
  public void alwaysPass() throws Exception {
    try{
      assertEquals(true, true);
    } catch (Exception e) {
      fail("Somehow true is not true");
    }
  } // alwaysPass()

  /**
   * Ensures no exception is called when removing a key not in the array
   */
  @Test
  public void ryanAlyssaTest1() throws Exception {
    AssociativeArray<String, String> arr = new AssociativeArray<String, String>();
    arr.set("S", "spinach");
    arr.set("B", "bananas");

    //Make sure an exception is called when we remove a key not in the list
    try{
      arr.remove("R");
    } catch (Exception e) {
      fail("Exception called");
    }
  } //ryanAlyssaTest1

  /**
   * Ensures the get, set, and remove functions work properly under normal usage
   * Set multiple values, get a few of them, remove some, get others
   */
  @Test
  public void ryanAlyssaTest2() throws Exception {
    AssociativeArray<String, String> arr = new AssociativeArray<String, String>();
    arr.set("A", "aardvark");
    arr.set("B", "baboon");
    arr.set("C", "cat");
    arr.set("D", "dog");
    arr.set("B", "beaver");
    arr.remove("A");
    
    //Get a value
    try{
      assertEquals("cat", arr.get("C"));
    } catch (Exception e) {
      fail("Get returns an incorrect value");
    }

    //Get updates the value when set with the same key
    try{
      assertEquals("beaver", arr.get("B"));
    } catch (Exception e) {
      fail("Set does not update correctly when given a preexisting key");
    }

    //Removes the given value from the list
    try{
      assertEquals(false, arr.hasKey("A"));
      fail("Does not remove the key correctly");
    } catch (Exception e) {
      
    }
  } //ryanAlyssaTest2

  /**
   * Ensures size is correct after updating a key and removing a key.
   */
  @Test
  public void ryanAlyssaEdge1() throws Exception {
    AssociativeArray<String, String> arr = new AssociativeArray<String, String>();
    arr.set("A", "Alyssa");
    arr.set("E", "Ethan");
    arr.set("A", "Addison");
    arr.set("J", "Jerry");
    arr.set("M", "Mackenzie");
    arr.remove("Q");
    
    //Checks array size
    try{
      assertEquals(4, arr.size());
    } catch (Exception e) {
      fail("Size is incorrect");
    }
  } //ryanAlyssaEdge1
} // class TestsFromSam
