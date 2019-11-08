/**
 * This is TestRunner class which picks the test cases from the JUnit
 * and executes each test case.
 * 
 * This will shows an output on the console about how many test cases
 * passed / failed when you run this TestRunner class.
 * 
 * There will be a detailed information about which test cases have been failed 
 * or passed.
 * 
 * @author Deepak Kumar
 * 
 */


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestJUnit.class);

      if (result.wasSuccessful() == true) {
         System.out.println("");
         System.out.println("Great!!! All test cases passed.....");
         System.out.println("");
      } else {
         System.out.println("Oh!!! Some of the test cases failed may be because of logical errors");
         System.out.println("Please see the details below for the test cases that are failed");
         System.out.println("===============================");
         for (Failure failure : result.getFailures()) {
            int index = failure.getDescription().toString().indexOf("(");
            System.out.println("Test Case : " + failure.getDescription().toString().substring(8, index));
            int start = failure.getMessage().indexOf("<");
            int end = failure.getMessage().indexOf(">");
            System.out.println("Expected Output : " + failure.getMessage().substring(start+1, end));
            start = failure.getMessage().indexOf("<", start + 1);
            end = failure.getMessage().indexOf(">", end + 1);
            System.out.println("Your Output : " + failure.getMessage().substring(start+1, end));
            System.out.println("===============================");
         }
         System.out.println((result.getRunCount() - result.getFailureCount()) + " / " + result.getRunCount() + " Test Cases Passed....");
      }
   }
}