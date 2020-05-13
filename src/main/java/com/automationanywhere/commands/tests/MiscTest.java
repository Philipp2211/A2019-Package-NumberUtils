package com.automationanywhere.commands.tests;

import com.automationanywhere.botcommand.data.impl.NumberValue;
import com.automationanywhere.commands.basic.Calc;
import com.automationanywhere.commands.basic.RoundNumber;

public class MiscTest {
    public static void main(String[] args){

        RoundNumber r = new RoundNumber();

        NumberValue d5 = r.action(2.1367645,3.00);
        System.out.println(d5);


        Calc c= new Calc();
        NumberValue d6 = c.action(1.00*-2.3);
        System.out.println(d6);
    }
}
