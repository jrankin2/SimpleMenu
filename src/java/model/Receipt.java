/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author jrankin2
 */
public class Receipt {

    private double subTotal = 0;
    private double tax = 0;
    private double netTotal = 0;
    private double suggestedGratuity = 0;

    public Receipt(List<MenuItem> menuItems) {
        for (MenuItem item : menuItems) {
            this.subTotal += item.getPrice();
        }
        this.subTotal = round(subTotal, 2);
        this.tax = round(subTotal * .05, 2);
        this.netTotal = round(subTotal + tax, 2);
        this.suggestedGratuity = round(netTotal * .2, 2);
    }

    private static double round(double value, int places) {
        /*
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
        */
        return Double.valueOf(String.format("%.02f", value));
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }

    public double getSuggestedGratuity() {
        return suggestedGratuity;
    }

    public void setSuggestedGratuity(double suggestedGratuity) {
        this.suggestedGratuity = suggestedGratuity;
    }
}
