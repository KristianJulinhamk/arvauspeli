import java.util.Scanner;

public class arvauspeli {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
                break;
            }

            // lisää arvauskerran vain jos arvaus ei ole stop
            arvausKerrat++;

            // katsoo onko arvaus oikein
            if (arvaus.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Onneksi olkoon!");
                break;  // poistuu loopista jos arvaus on oikein
            } else {
                System.out.println("Väärin! Arvaa uudestaan.");
            }
        }

        // printtaa arvauskerrat
        System.out.println("Arvasit " + arvausKerrat + " kertaa.");

        scanner.close();
    }
}

