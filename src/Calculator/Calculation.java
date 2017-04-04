/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionFormat;

/**
 *
 * @author Thien
 */
public class Calculation {
    
    public static double fractionToDouble(String fraction){
        FractionFormat ff = new FractionFormat();
        Fraction fraction_a = ff.parse(fraction);
        return fraction_a.doubleValue();
    }
    
    public static double plus(String a, String b){
        FractionFormat ff = new FractionFormat();
        Fraction fraction_a = ff.parse(a);
        Fraction fraction_b = ff.parse(b);
        double d = fraction_a.doubleValue() + fraction_b.doubleValue();
        return d;
    }
    public static double minus(String a, String b){
        FractionFormat ff = new FractionFormat();
        Fraction fraction_a = ff.parse(a);
        Fraction fraction_b = ff.parse(b);
        double d = fraction_a.doubleValue() - fraction_b.doubleValue();
        return d;
    }
    public static double mul(String a, String b){
        FractionFormat ff = new FractionFormat();
        Fraction fraction_a = ff.parse(a);
        Fraction fraction_b = ff.parse(b);
        double d = fraction_a.doubleValue() * fraction_b.doubleValue();
        return d;
    }
    public static double div(String a, String b){
        FractionFormat ff = new FractionFormat();
        Fraction fraction_a = ff.parse(a);
        Fraction fraction_b = ff.parse(b);
        int c = Double.compare(fraction_b.doubleValue(), 0);
        double d = fraction_a.doubleValue() / fraction_b.doubleValue();
        return d;
    }
}
