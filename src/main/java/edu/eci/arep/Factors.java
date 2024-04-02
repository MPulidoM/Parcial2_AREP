package edu.eci.arep;

import java.util.ArrayList;

public class Factors {
    public Factors (){}
    public ArrayList<Integer> MakeFactors(int val){
        int random = 0;
        int numero = 1;
        ArrayList<Integer> FactorsResultF = new ArrayList<>();
        while(random <= val){
            if(val%numero==0){
                FactorsResultF.add(numero);
            }
            numero += 1;
            random+= 1;
        }
        return FactorsResultF;
        }
}



