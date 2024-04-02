package edu.eci.arep;

import java.util.ArrayList;

import edu.eci.arep.Factors;

public class Primes {



    public Primes (){
    }

    public  ArrayList<Integer> MakePrimes(int val){
        Factors factors = new Factors();
        ArrayList<Integer> PrimesResultF = new ArrayList<>();
        for(int i = 2; i<val;i++){
            if((i%1==0) &  (i%i==0) & (factors.MakeFactors(i).size()==2)){
                PrimesResultF.add(i);

            }
        }
        return PrimesResultF;

        }
    }


