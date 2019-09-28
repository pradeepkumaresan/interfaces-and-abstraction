package com.pradeep.abstract_classes;


import com.pradeep.ClientEngagement;

public class FixedFeeCalculator extends RevenueCalculator
{
    public static final double STANDARD_FEE = 500;

    private final double fee;

    public FixedFeeCalculator(final double fee)
    {
        this.fee = fee;
    }

    @Override
    public double calculate(final ClientEngagement clientEngagement)
    {
        return fee;
    }
}
