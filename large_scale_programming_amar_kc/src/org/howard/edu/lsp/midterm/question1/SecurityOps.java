package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {

	public static String encrypt(String text) {
		//newstring that contain character at even indexing
        StringBuilder evenChars = new StringBuilder();
      //newstring that contain character at odd indexing
        StringBuilder oddChars = new StringBuilder();

        int i = 0;
        int k = 0;
        //creating a newstring that ignore space and puncuations
        StringBuilder temp = new StringBuilder();
        while (k < text.length()) {
            char ch = text.charAt(k);
            // Ignore punctuation and whitespace
            if (Character.isLetterOrDigit(ch)) {
            	temp.append(ch);            	
            	k++;
            	continue;
                }
            else {
            	k++;
            }
        }
         
        while (i < temp.length()) {
            char ch = temp.charAt(i);
            //grouping all the character at even indexing
                if(i % 2 == 0) {
                	evenChars.append(ch);
                }
                // grouping all the character at odd indexing
                else {
                	 oddChars.append(ch);
                }
                i++;
            }

        // Combine even and odd indexed characters
        return evenChars.toString() + oddChars.toString();
    }
}
