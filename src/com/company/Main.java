package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

        public static void main(String[] args) {
            ArrayList<Persoon> personen = new ArrayList<>();

            personen.add(new Persoon("Karen", "Damen"));
            personen.add(new Persoon("Kristel", "Aerts"));

            personen.add(new Persoon("Kathleen", "Aerts"));

            Collections.sort(personen);

            for (Persoon p : personen) {

                System.out.printf("%s %s%n", p.getVoornaam(), p.getAchternaam());

            }


        }
	// write your code here
    }
class Persoon implements Comparable <Persoon>{
    private String voornaam;
    private String achternaam;

    public Persoon (String voornaam, String achternaam){
    this.voornaam = voornaam;
    this.achternaam = achternaam;
    }


    public String getVoornaam() {
        return this.voornaam;

    }

    public String getAchternaam() {
        return this.achternaam;
    }
    public int compareTo (Persoon o){
        int resultaat = achternaam.compareTo(o.achternaam);
        if (resultaat ==0){
            resultaat = voornaam.compareTo(o.voornaam);
        }
        return resultaat;
    }
}