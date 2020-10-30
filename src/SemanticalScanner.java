import java.util.Scanner;
import java.io.File;

import java.io.FileNotFoundException;



public class SemanticalScanner {
	private String path;
	private int lineNumber = 1;
	
	private String[] operators = {"+","-","*","/","%","==","!=",">","<",">=","<=","&&","||","!"};
	private String[] key_language = {"Auto", "double", "int", "struct", "Break", "else", "long", "switch", "Case", "enum", "register", "typedef", "Char", "extern", "return", "union", "Const", "float", "short", "unsigned", "Continue", "for", "signed", "void", "Default", "goto", "sizeof", "volatile", "Do", "if", "static", "while", "Asm", "dynamic_cast", "namespace", "reinterpret_cast", "Bool", "explicit", "new", "static_cast", "Catch false", "operator", "template", "Class", "friend", "private", "this", "Const_cast", "inline", "public", "throw", "Delete", "mutable", "protected", "true", "Try", "typeid", "typename", "using", "virtual", "wchar_t"};
	
	
	
	SemanticalScanner(String path){
		this.path = path;
	}
	
	
	
	public void SolveIt() throws FileNotFoundException {
		File codeFile = new File(this.path);
		Scanner scan = new Scanner(codeFile);
		
		while(scan.hasNextLine()){
			
		String currentLine = scan.nextLine();
		
		if(currentLine.length() != 0)
			
		//System.out.println(currentLine);
		//switch() aici
		//trebuie iterat fiecare rand pana cand se genereaza orice din switch. daca nu se genereaza nimic din switch, incep sa se genereze ID-uri.
		//sau se baga tot pana la space in id dupa care se ia switch pt fiecare din id si daca se gaseste undeva se scoate din id si se pun acolo unde trebuie
			// daca nu, ramane pe id
				//1 sau 2 dar cred ca e cam la sigur
		System.out.println(lineNumber);
		
		
		
		
		lineNumber++;
		
		}
	}
}
