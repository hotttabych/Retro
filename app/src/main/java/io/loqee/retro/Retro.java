package io.loqee.retro;

public class Retro {
    private String name;
    private String description;
    private int logo;

    public Retro(String name, String description, int logo) {
        this.name = name;
        this.description = description;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getLogo() {
        return logo;
    }
}
