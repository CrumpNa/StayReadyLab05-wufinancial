package com.codedifferently.stayready;


public class CurrencyConversion {

    //start with usd-->euro : multip 
    //start with euro-->usd :divide 
    public double dollarToEuro(double dollar) {
        //Us Dollar	1.00 ---> Euro	0.94
        double exchangeRateE = 0.94; //exchange rate of dollars to euros
        double euros = 0.0;

        euros = dollar * exchangeRateE;//convert the dollar to euros

        return euros;
    }

    public double euroToDollar(double euro) {
        //Us Dollar	1.00 ---> Euro	0.94
        double exchangeRateE = 0.94; //exchange rate of dollars to euros
        double dollars = 0.0;

        dollars = euro / exchangeRateE;//convert euros to dollars

        return dollars;
    }

    public double euroToPound(double euro) {
        //Us Dollar	1.00 ---> Euro	0.94---> Pound 0.82
        double exchangeRateP = 0.82; //dollars to euros
        double pounds = 0.0;
        //1st convert euros to dollars

        double dollars = euroToDollar(euro);//euros to dollars
        pounds = dollars * exchangeRateP; //dollars to pounds
        return pounds;

    }

    public double poundToRupee(double pounds) {

        double exchangeRateP = 0.82; //exchange rate of pounds to dollars
        double exchangeRateR = 68.32; //exchange rate of rupees to dollars
        double rupees = 0.0;
        //1st convert pounds to dollars

        double dollars = pounds / exchangeRateP;//pounds to dollars
        rupees = dollars * exchangeRateR; //dollars to rupees

        return rupees;
    }

    public double rupeeToCanadianDollar(double rupees) {
        double exchangeRateC = 1.32; //pounds to dollars
        double exchangeRateR = 68.32; //rupees to dollars
        double canadianDollars = 0.0;
        //1st convert rupees to dollars

        double dollars = rupees / exchangeRateR;//rupees to dollars
        canadianDollars = dollars * exchangeRateC; //dollars to canad

        return canadianDollars;

    }

    public double canadianDollarToSingaporeanDollar(double canadianDollars) {
        double exchangeRateC = 1.32; //canadian to dollars
        double exchangeRateS = 1.43; //singaporean to dollars
        double singaDollars = 0.0;
        //1st convert canadian to dollars

        double dollars = canadianDollars / exchangeRateC;//canadian to dollars
        singaDollars = dollars * exchangeRateS; //dollars to singa

        return singaDollars;

    }

    public double singaporeanDollarToFranc(double singaDollars) {
        double exchangeRateS = 1.43; //singaporean to dollars
        double exchangeRateF = 1.01; //franc to dollars
        double franc = 0.0;
        //1st convert singa to dollars

        double dollars = singaDollars / exchangeRateS;//singa to dollars
        franc = dollars * exchangeRateF; //dollars to franc

        return franc;

    }

    public double francToRinggit(double franc) {
        double exchangeRateF = 1.01; //franc to dollars
        double exchangeRateR = 4.47; //ringgit to dollars
        double ringgit = 0.0;
        //1st convert fran to dollars

        double dollars = franc / exchangeRateF;//franc to dollars
        ringgit = dollars * exchangeRateR; //dollars to ringgit

        return ringgit;

    }

    public double ringgitToYen(double ringgit) {
        double exchangeRateR = 4.47; //ringgit to dollars
        double exchangeRateY = 115.84; //yen to dollars
        double yen = 0.0;

        //1st convert ringgit to dollars

        double dollars = ringgit / exchangeRateR;//ringgit to dollars
        yen = dollars * exchangeRateY; //dollars to yen

        return yen;

    }

    public double yenToYuan(double yen) {
        double exchangeRateY = 115.84; //yen to dollars
        double exchangeRateYu = 6.92; //yuan to dollars
        double yuan = 0.0;

        //1st convert yen to dollars

        double dollars = yen / exchangeRateY;//yen to dollars
        yuan = dollars * exchangeRateYu; //dollars to yuan

        return yuan;

    }

}


