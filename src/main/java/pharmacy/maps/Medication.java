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

public class Medication {

    protected String name;
    protected double price;
    protected boolean availability;


    // CONSTRUCTORS
    public Medication() {
        // Default Constructor
    }
    public Medication(String name, double price, boolean availability) {
        // Custom Constructor
        this.name = name;
        this.price = price;
        this.availability = availability;
    }


    // OVERRIDE
    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", availability=" + availability + '}';
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    // GETTERS AND SETTERS
    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public double getPrice () {
        return price;
    }
    public void setPrice (double price) {
        this.price = price;
    }

    public boolean getAvailability () {
        return availability;
    }
    public void setAvailability (boolean availability) {
        this.availability = availability;
    }

}
