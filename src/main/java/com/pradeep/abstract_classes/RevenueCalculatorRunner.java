package com.pradeep.abstract_classes;


import com.pradeep.ClientEngagement;

import static com.pradeep.abstract_classes.FixedFeeCalculator.STANDARD_FEE;

public class RevenueCalculatorRunner
{
    public static void main(String[] args)
    {
        final ClientEngagement clientEngagement =
            new ClientEngagement("Pluralsight", 100, 15_000);

        RevenueCalculator revenueCalculator = new FixedFeeCalculator(STANDARD_FEE);

        final double price = revenueCalculator.calculate(clientEngagement);
        System.out.println("price = " + price);
    }
}
