package pharmacy.maps;

/*
    Schritt 1: Erstellt eine Klasse 'Medication' mit den Methoden 'getName', 'getPrice' und 'getAvailability'.

    Schritt 2: Lege eine Java-Klasse 'Apotheke' an, die eine Java-Map verwendet,
    um den Medication Namen als Schlüssel und deren Informationen als Werte zu speichern.
    Implementiere Methoden, um Medication zur Map hinzuzufügen, Informationen abzurufen
    und die Verfügbarkeit zu aktualisieren.

    Schritt 3: Lege eine Methode 'int getStockSize()' in der Klasse `Apotheke` an. Diese Methode sollte die Anzahl
    der Medication in der Apotheke zurückgeben.

    Schritt 4: Lege eine Methode 'void putMedicationToStock(Medication medication)' in der Klasse `Apotheke` an.
    Diese Methode sollte das Medication indexiert nach seinem Namen in die Apotheke einfügen.

    Schritt 5: Lege eine Methode 'Medication getMedicationByName(String medicationName)' in der Klasse `Apotheke` an.
    Diese Methode sollte die gesuchte Medication mit diesem Namen zurückgeben.
    Falls keine Medication mit diesem Namen gefunden wird, sollte die Methode null zurückgeben.

    Schritt 6: Lege eine Methode 'void removeMedicationFromStock(String medicationName)' in der Klasse `Apotheke` an.
    Diese Methode sollte die Medication mit diesem Namen löschen.

    Schritt 7: Implementiere eine Methode 'getEntireMedicationStock()', um alle Medication in der Map auszugeben,
    einschließlich ihres Namens, Preises und der Verfügbarkeit.
 */

public class Main {

    public static void main (String[] args) {

        // Instantiate an Apotheke object
        Apotheke myApotheke = new Apotheke("shopApotheke", "Hamburg");

        // Instantiate a few Medication object...
        Medication med1 = new Medication("Ibuprofen", 7, true);
        Medication med2 = new Medication("Paracetamol", 6, true);
        // ... and put them into the Apotheke's stock
        myApotheke.putMedicationToStock(med1.name, med1);
        myApotheke.putMedicationToStock(med2.name, med2);

        // Now, show what's inside the Apotheke's stock...
        System.out.println(myApotheke.getEntireMedicationStock());
        // ...and print the resulting stock size as well
        System.out.println(myApotheke.getStockSize());

        // Search for a specific medicine within the Apotheke's stock for demonstration purposes
        System.out.println(myApotheke.getMedicationByName("Ibuprofen"));
    }

}
