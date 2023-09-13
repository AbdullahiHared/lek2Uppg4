import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        System.out.println("Skriv in text");
        String text = newScanner.nextLine();

        int textLength = text.length();
        System.out.println("Det är " + textLength + " bokstäver i texten");

        System.out.print("Ange bokstaven du vill kolla des index: ");
        String indexValue = newScanner.nextLine();
        System.out.println("Den bokstaven ligger på index " + text.indexOf(indexValue));
          
       
        System.out.print("Ange start index ");
        int startIndex = newScanner.nextInt();

        System.out.print("Ange slut index ");
        int endIndex = newScanner.nextInt();
        newScanner.nextLine();
        String changedString = text.substring(startIndex, endIndex);
        System.out.println(changedString);
        System.out.println(); 
        
        // check for a word/ text
        System.out.println("Ange din text:");
        String StringText = newScanner.nextLine();
        System.out.println();

        System.out.println("Ange den delen du vill veta om det finns med");
        String newString = newScanner.nextLine();
        
        // check if stringText contains newString
        if (StringText.contains(newString)) {
           System.out.println("Det finns med i texten");
        }  else {
           System.out.println(newString + " finns inte med i texten." );
        }
       
         // replace old text with new one

        System.out.println("Ange en text: ");
        String dinText = newScanner.nextLine();

        System.out.println("Ange den delen du vill byta:");
        String changeText = newScanner.nextLine();

        System.out.println("Ange ersättnings texten: ");
        String byteString = newScanner.nextLine();

        String newText = dinText.replace(changeText, byteString);

        System.out.println("Din nya text är: " + newText); 

    }
}