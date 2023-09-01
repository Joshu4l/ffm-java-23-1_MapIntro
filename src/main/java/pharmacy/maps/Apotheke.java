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

import java.util.HashMap;
import java.util.Map;

public class Apotheke {

    // ATTRIBUTES
    protected String name;
    protected String location;
    protected Map<String, Medication> medicationStock = new HashMap<>();


    // CONSTRUCTORS
    public Apotheke () {
        // Default Constructor
    }
    public Apotheke (String name, String location) {
        // Custom Constructor
        this.name = name;
        this.location = location;
    }

    // Inventory in and out
    public void putMedicationToStock (String name, Medication meds) {
        medicationStock.put(meds.name, meds);
    }
    public void removeMedicationFromStock(String name) {
        medicationStock.remove(name);
    }

    // Return meds
    public Medication getMedicationByName (String name){
        return medicationStock.get(name);
    }
    public Map<String, Medication> getEntireMedicationStock () {
        return medicationStock;
    }

    // Stock size
    public int getStockSize () {
        return medicationStock.size();
    }

}
