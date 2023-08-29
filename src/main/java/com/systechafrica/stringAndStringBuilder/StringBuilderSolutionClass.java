package com.systechafrica.stringAndStringBuilder;

public class StringBuilderSolutionClass {

  public static void main(String[] args) {
    StringBuilderSolutionClass solution = new StringBuilderSolutionClass();
    solution.testLogic();
  }

                        // **SOLUTION OF QUESTION 6 OCA TEST** //
  // I named the method to test logic as follows
  // The initial answer i had towards this question before writing the program is that it would return no match
  // I have however after some research i realized, when you call toString() on a String object, you essentially get the same string as the output and therefore the contents of sb changed to string and s essentially remaining string are null, hence same. Returns true
    
    public void testLogic() {
        StringBuffer sb = new StringBuffer(5);
        String s = "";
        
        if (sb.equals(s)) {
            System.out.println("Match 1");
        } else if (sb.toString().equals(s.toString())) {
            System.out.println("Match 2");
        } else {
            System.out.println("No Match");
        }
    }
}
