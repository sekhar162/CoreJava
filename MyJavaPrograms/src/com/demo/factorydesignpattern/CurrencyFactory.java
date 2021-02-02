package com.demo.factorydesignpattern;

//Factroy Class code
class CurrencyFactory {

    public Currency createCurrency (String country) {
    if (country. equalsIgnoreCase ("India")){
           return new Rupee();
    }else if(country. equalsIgnoreCase ("Singapore")){
           return new SGDDollar();
    }else if(country. equalsIgnoreCase ("US")){
           return new USDollar();
     }
    throw new IllegalArgumentException("No such currency");
    }
}
