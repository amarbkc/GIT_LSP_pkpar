package org.howard.edu.lsp.midterm.question1;

public class Driver1 {

	public static void main(String[] args) {
		SecurityOps test = new SecurityOps();
		// TODO Auto-generated method stub
		 String inputText = "I love CSCI363";
	        
	        // Encrypt the input text
	        String encryptedText = test.encrypt(inputText);
	        
	        // Display the encrypted text
	        System.out.println("Original Text: " + inputText);
	        System.out.println("Encrypted Text: " + encryptedText);

	}

}
