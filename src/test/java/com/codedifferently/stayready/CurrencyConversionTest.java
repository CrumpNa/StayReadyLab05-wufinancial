package com.codedifferently.stayready;

import org.junit.Test;
import org.junit.Assert;
/*Convert Dollar to Euro
Convert Euro to Dollar
Convert Euro to British Pound
Convert British Pound to Indian Rupee
Convert Rupee to Canadian Dollar
Convert Canadian Dollar to Singapore Dollar
Convert Singapore Dollar to Swiss Franc
Convert Swiss Franc to Malaysian Ringgit
Convert Malaysian Ringgit to Japanese Yen
Convert Japanese Yen to Chinese Yuan Renminbi*/ 

public class CurrencyConversionTest {
        @Test
        public void dollarToEuroTest(){
            //given
            CurrencyConversion c= new CurrencyConversion();
            double expected= 47.47;

            //when
            double actual=c.dollarToEuro(50.50);

            //then
            Assert.assertEquals(expected,actual,0.001);

        }

        @Test
        public void euroToDollarTest(){
            //given
            CurrencyConversion c= new CurrencyConversion();
            double expected= 53.72340425531915;

            //when
            double actual=c.euroToDollar(50.50);


            //then
            Assert.assertEquals(expected,actual,0.001);

        }


        @Test
        public void euroToPoundTest(){
            //given
            CurrencyConversion c= new CurrencyConversion();
            double expected= 44.0531914893617;
            //float e= 0.9;

            //when
            double actual=c.euroToPound(50.50);

            //then
            Assert.assertEquals(expected,actual,0.001);

        }
    
        @Test
        public void poundToRupeeTest(){

        //given

        double expected=4207.5122;
        CurrencyConversion c= new CurrencyConversion();

        //when
        double actual=c.poundToRupee(50.50);

        //then
        Assert.assertEquals(expected,actual,0.001);

        }

        @Test
        public void rupeeToCanadianDollarTest(){
        //given
        CurrencyConversion c=new CurrencyConversion();
        double expected= 0.97570258;

        //when
        double actual=c.rupeeToCanadianDollar(50.50);

        //then
        Assert.assertEquals(expected,actual,0.001);

        }

        @Test
        public void canadianDollarToSingaporeanDollarTest(){
        //given
        CurrencyConversion c=new CurrencyConversion();
        double expected= 54.70833333;

        //when
        double actual=c.canadianDollarToSingaporeanDollar(50.50);

        //then
        Assert.assertEquals(expected,actual,0.001);

        }
        @Test
        public void singaporeanDollarToFrancTest(){
        //given
        CurrencyConversion c=new CurrencyConversion();
        double expected= 35.66783217;

        //when
        double actual=c.singaporeanDollarToFranc(50.50);

        //then
        Assert.assertEquals(expected,actual,0.001);

        }
        @Test
        public void francToRinggitTest(){
        //given
        CurrencyConversion c=new CurrencyConversion();
        Main main=new Main();
        double expected= 223.5;

        //when
        double actual=c.francToRinggit(50.50);

        //then
        Assert.assertEquals(expected,actual,0.001);

        }
        @Test
        public void ringgitToYenTest(){
        //given
        CurrencyConversion c=new CurrencyConversion();
        double expected= 1308.706935;

        //when
        double actual=c.ringgitToYen(50.50);

        //then
        Assert.assertEquals(expected,actual,0.001);

        }
        @Test
        public void yenToYuanTest(){
        //given
        CurrencyConversion c=new CurrencyConversion();
        double expected= 3.01674724;

        //when
        double actual=c.yenToYuan(50.50);

        //then
        Assert.assertEquals(expected,actual,0.001);

        }
        }

