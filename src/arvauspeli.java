import java.util.Scanner;

public class arvauspeli {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // oikea arvaus
        String correctAnswer = "Kristian";

        // arvauskertojen muuttuja
        int arvausKerrat = 0;
        String arvaus = "";

        // loop kysyy arvausta
        while (true) {
            // kysyy nimen
            System.out.println("Arvaa nimeni (kirjoita loppu lopettaaksesi)");
            arvaus = scanner.nextLine();

            // katsoo haluaako kayttaja lopettaa
            if (arvaus.equalsIgnoreCase("loppu")) {
                System.out.println("Päätit lopettaa.");
                break; // lopettaa ohjelman
            }

            // lisää arvauskerran vain jos arvaus ei ole stop
            arvausKerrat++;

            // katsoo onko arvaus oikein
            if (arvaus.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Onneksi olkoon! Arvasit oikein");
                break;  // poistuu loopista jos arvaus on oikein
            } else {
                System.out.println("Väärin! Arvaa uudestaan.");
            }
        }

        // printtaa arvauskerrat
        System.out.println("Arvasit " + arvausKerrat + " kertaa.");

        scanner.close(); // sulkee skannerin, en ole varma onko se pakollinen tällaisessa koodissa
    }
}

