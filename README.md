# Provera Jačine Lozinke (Java)

Jednostavan i praktičan konzolni alat napisan u Javi koji analizira složenost unete lozinke i procenjuje njenu otpornost na uobičajene napade pogađanjem (kao što su *brute-force* i rečnički napadi).

---

## 🛡️ O Projektu

Slabe i predvidive lozinke predstavljaju jednu od najčešćih ulaznih tačaka za neovlašćeni pristup sistemima i kompromitovanje naloga. Ovaj program služi kao demonstracija osnovnih principa bezbednosti lozinki i analize unosa teksta.

Program proverava prisustvo različitih tipova karaktera i ocenjuje lozinku na skali od **0 do 5 poena**:
- **Dužina lozinke:** Nosi 1 poen ukoliko lozinka ima 8 ili više karaktera.
- **Mala slova:** Nosi 1 poen ako lozinka sadrži barem jedno malo slovo (`a-z`).
- **Velika slova:** Nosi 1 poen ako lozinka sadrži barem jedno veliko slovo (`A-Z`).
- **Brojevi:** Nosi 1 poen ako lozinka sadrži barem jednu cifru (`0-9`).
- **Specijalni znakovi:** Nosi 1 poen ako lozinka sadrži simbole (`!`, `@`, `#`, `$`, itd.).

---

## ⚙️ Kako Kod Radi

1. **Unos podataka:** Program koristi `java.util.Scanner` za interaktivno preuzimanje lozinke sa standardnog ulaza konzole.
2. **Analiza karaktera:** Kroz `for-each` petlju prolazi se kroz niz karaktera (`lozinka.toCharArray()`), a pomoću metoda klase `Character` (`isLowerCase`, `isUpperCase`, `isDigit`) detektuje se raznovrsnost unetih simbola.
3. **Bodovanje i klasifikacija:** Na osnovu ukupnog broja poena, `switch-case` blok donosi konačnu bezbednosnu procenu:
   - **5/5:** `[+] Ocena: VEOMA JAKA lozinka!`
   - **4/5:** `[*] Ocena: DOBRA lozinka.`
   - **3/5:** `[-] Ocena: PROSECNA lozinka.`
   - **1-2/5:** `[!] Ocena: SLABA lozinka!`
   - **0/5 (`default`):** `[!!!] Niste uneli lozinku!` (reaguje na prazan unos)

---

## 🚀 Pokretanje Programa

### Preduslovi
- Instaliran **Java Development Kit (JDK 8 ili noviji)**

### Kompajliranje i Pokretanje (preko terminala / CMD)

1. Klonirajte repozitorijum:
   ```bash
   git clone [https://github.com/krstic-sec/password-strength-checker.git](https://github.com/krstic-sec/password-strength-checker.git)
   cd password-strength-checker
