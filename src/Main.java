import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        SemanticalScanner scan =  new SemanticalScanner("C:\\Users\\Manta\\Desktop\\Laborator1SDP\\main.cpp");
        try {
			scan.SolveIt();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        
    }
}






