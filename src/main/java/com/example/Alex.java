package com.example;

import java.util.List;

public class Alex extends Lion {

    private static final String SEX = "Самец";
    private static final List<String> FRIENDS = List.of("Марти", "Глория", "Мелман");
    private static final String PLACE_OF_LIVING = "Нью‑Йоркский зоопарк";

    public Alex(Feline feline) throws Exception {
        super(SEX, feline);
    }

    public List<String> getFriends() {
        return FRIENDS;
    }

    public String getPlaceOfLiving() {
        return PLACE_OF_LIVING;
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
