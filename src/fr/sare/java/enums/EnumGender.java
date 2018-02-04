package fr.sare.java.enums;

/**
 * Enumeration for {@link fr.sare.java.functionalinterface.Person}
 */
public enum EnumGender {
    MALE("MALE"), FEMALE("FEMALE");

    private String libelle;

    private EnumGender(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return this.libelle;
    }
}
