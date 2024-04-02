package edu.eci.arep;


import java.util.ArrayList;

import static spark.Spark.*;

public class MathServer {
    public static void main(String[] args) {
        port(getPort());
        get("hello", (req,res) -> "Hello Docker!");
        get("factors",(req,res) -> {
            Factors factors = new Factors();
            ArrayList<Integer> ans =  factors.MakeFactors(Integer.parseInt(req.queryParams("value")));
            return "{\n" +
                    " \"operation\": \"factors\",\n" +
                    " \"input\":  \n" + Integer.parseInt(req.queryParams("value")) +
                    " \"output\":  \n" + ans +
                    "}"  ;
        });
        get("primes",(req,res) -> {
            Primes primes = new Primes();
            ArrayList<Integer> ans = primes.MakePrimes(Integer.parseInt(req.queryParams("value")));
            return "{\n" +
                    " \"operation\": \"primes\",\n" +
                    " \"input\":  \n" + Integer.parseInt(req.queryParams("value")) +
                    " \"output\":  \n" + ans +
                    "}"  ;
        });



    }
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }


}
