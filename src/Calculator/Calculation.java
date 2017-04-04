/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import org.apache.commons.math3.fraction.Fraction;

/**
 *
 * @author Thien
 */
public class Calculation {
    
    public static double fractionToDouble(String fraction){
        String[] part_a = fraction.split("/");
        Fraction fraction_a = Fraction.getReducedFraction(Integer.parseInt(part_a[0]), Integer.parseInt(part_a[1]));
        return fraction_a.doubleValue();
    }
    
    public static double plus(String a, String b){
        String[] part_a = a.split("/");
        String[] part_b = b.split("/");
        Fraction fraction_a = Fraction.getReducedFraction(Integer.parseInt(part_a[0]), Integer.parseInt(part_a[1]));
        Fraction fraction_b = Fraction.getReducedFraction(Integer.parseInt(part_b[0]), Integer.parseInt(part_b[1]));
        double d = fraction_a.doubleValue() + fraction_b.doubleValue();
        return d;
    }
    public static double minus(String a, String b){
        String[] part_a = a.split("/");
        String[] part_b = b.split("/");
        Fraction fraction_a = Fraction.getReducedFraction(Integer.parseInt(part_a[0]), Integer.parseInt(part_a[1]));
        Fraction fraction_b = Fraction.getReducedFraction(Integer.parseInt(part_b[0]), Integer.parseInt(part_b[1]));
        double d = fraction_a.doubleValue() - fraction_b.doubleValue();
        return d;
    }
    public static double mul(String a, String b){
        String[] part_a = a.split("/");
        String[] part_b = b.split("/");
        Fraction fraction_a = Fraction.getReducedFraction(Integer.parseInt(part_a[0]), Integer.parseInt(part_a[1]));
        Fraction fraction_b = Fraction.getReducedFraction(Integer.parseInt(part_b[0]), Integer.parseInt(part_b[1]));
        double d = fraction_a.doubleValue() * fraction_b.doubleValue();
        return d;
    }
    public static double div(String a, String b){
        String[] part_a = a.split("/");
        String[] part_b = b.split("/");
        Fraction fraction_a = Fraction.getReducedFraction(Integer.parseInt(part_a[0]), Integer.parseInt(part_a[1]));
        Fraction fraction_b = Fraction.getReducedFraction(Integer.parseInt(part_b[0]), Integer.parseInt(part_b[1]));
        double d = fraction_a.doubleValue() / fraction_b.doubleValue();
        return d;
    }
}
