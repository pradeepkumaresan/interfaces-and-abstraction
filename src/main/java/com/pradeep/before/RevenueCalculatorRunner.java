package com.pradeep.before;

import com.pradeep.ClientEngagement;

public class RevenueCalculatorRunner
{
    public static void main(String[] args)
    {
        final ClientEngagement clientEngagement =
            new ClientEngagement("Pluralsight", 100, 15_000);

        // "Hourly"
        // "FixedFee"
        // "RoyaltyPercentage"

        final double hourlyPrice = RevenueCalculator.price("Hourly", clientEngagement);
        System.out.println("hourlyPrice = " + hourlyPrice);

        final double fixedFeePrice = RevenueCalculator.price("FixedFee", clientEngagement);
        System.out.println("fixedFeePrice = " + fixedFeePrice);

        final double royaltyPercentagePrice = RevenueCalculator.price("RoyaltyPercentage", clientEngagement);
        System.out.println("royaltyPercentagePrice = " + royaltyPercentagePrice);
    }
}
