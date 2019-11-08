/**
 * This is JUnit that tests the lower method in StringHandling class.
 * This contains 1 testcases.
 *
 * Please don"t run this file.
 * You can add your own test cases to this file by just copy and
 * paste the last three lines of the code (TestCase1).
 *
 * @author Deepak Kumar
 */

import org.junit.Test;
import org.junit.Assert;
import java.util.*;
import java.lang.*;
// import static org.junit.Assert.assertEquals;

public class TestJUnit {
@Test
public void testCase1() {
  SequentialSearchST<String, Integer> symbolTable = new SequentialSearchST<String, Integer>();
  symbolTable.put("S",0);
  symbolTable.put("E",1);
  symbolTable.put("A",2);
  symbolTable.put("R",3);
  symbolTable.put("C",4);
  symbolTable.put("H",5);
  symbolTable.put("E",6);
  symbolTable.put("X",7);
  symbolTable.put("A",8);
  symbolTable.put("M",9);
  symbolTable.put("P",10);
  symbolTable.put("L",11);
  symbolTable.put("E",12);
  List<String> arr = new ArrayList<String>(Arrays.asList("L","P","M","X","H","C","R","A","E","S"));
  String res = "";
  for(String s: arr){
  	res += s + " ";
  }
  Assert.assertEquals(res, symbolTable.keys().toString());
  Assert.assertEquals(new Integer(7), symbolTable.get("X"));



  arr = new ArrayList<String>(Arrays.asList("L","P","M","H","C","R","A","E","S","X"));
  res = "";
  for(String s: arr){
    res += s + " ";
  }
  Assert.assertEquals(res, symbolTable.keys().toString());

  Assert.assertEquals(new Integer(12), symbolTable.get("E"));
  arr = new ArrayList<String>(Arrays.asList("L","P","M","H","C","R","A","S","X","E"));
  res = "";
  for(String s: arr){
    res += s + " ";
  }
  Assert.assertEquals(res, symbolTable.keys().toString());

  Assert.assertEquals(new Integer(4), symbolTable.get("C"));
  arr = new ArrayList<String>(Arrays.asList("L","P","M","H","R","A","S","X","E","C"));
  res = "";
  for(String s: arr){
    res += s + " ";
  }
  Assert.assertEquals(res, symbolTable.keys().toString());

  Assert.assertEquals(new Integer(10), symbolTable.get("P"));
  arr = new ArrayList<String>(Arrays.asList("L","M","H","R","A","S","X","E","C","P"));
  res = "";
  for(String s: arr){
    res += s + " ";
  }
  Assert.assertEquals(res, symbolTable.keys().toString());
}



}

