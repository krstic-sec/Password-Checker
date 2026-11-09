import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
  
        Scanner unos = new Scanner(System.in);

        System.out.println("============PROVERA JACINE LOZINKE============");
        
        System.out.println("Nemoj unisiti lozinku koju aktivno koristis na internetu!");
        System.err.print("POCETAK: "); System.out.println("Napravljeno za edukativne svrhe!!!");
        
        System.out.print("Unesi lozinku za proveru: ");
        String lozinka = unos.nextLine();

        boolean imaMalo = false;
        boolean imaVeliko = false;
        boolean imaBroj = false;
        boolean imaZnak = false;

      
        for (char c : lozinka.toCharArray()) {
            if (Character.isLowerCase(c)) {
                imaMalo = true;
            } else if (Character.isUpperCase(c)) {
                imaVeliko = true;
            } else if (Character.isDigit(c)) {
                imaBroj = true;
            } else {
                imaZnak = true; 
            }
        }

    
        int ocena = 0;
        if (lozinka.length() >= 8) ocena++;
        if (imaMalo) ocena++;
        if (imaVeliko) ocena++;
        if (imaBroj) ocena++;
        if (imaZnak) ocena++;

        System.out.println("Osvojeni poeni: " + ocena + "/5");


        switch (ocena) {
            case 5:
                System.out.println("[+] Ocena: VEOMA JAKA lozinka!");
                break;
            case 4:
                System.out.println("[*] Ocena: DOBRA lozinka.");
                break;
            case 3:
                System.out.println("[-] Ocena: PROSECNA lozinka.");
                break;
            case 1:
            case 2:
                System.out.println("[!] Ocena: SLABA lozinka!");
                break;
            default:
                System.err.println("[!!!] Niste uneli lozinku!");
                break;
        }


    }
}