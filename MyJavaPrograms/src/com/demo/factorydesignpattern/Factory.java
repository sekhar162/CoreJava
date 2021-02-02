package com.demo.factorydesignpattern;

//Factory client code
public class Factory {
    public static void main(String args[]) {
    	CurrencyFactory currencyFactory=new CurrencyFactory();

           Currency rupee = currencyFactory.createCurrency("india");
           System.out.println(rupee.getSymbol());
    }
}
