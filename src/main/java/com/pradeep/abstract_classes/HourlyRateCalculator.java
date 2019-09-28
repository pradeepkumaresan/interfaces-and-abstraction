package com.pradeep.abstract_classes;


import com.pradeep.ClientEngagement;

public class HourlyRateCalculator extends RevenueCalculator
{
    public static final double HOURLY_RATE = 50;

    private final double hourlyRate;

    public HourlyRateCalculator(final double hourlyRate)
    {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculate(final ClientEngagement clientEngagement)
    {
        return hourlyRate * clientEngagement.getHoursWorked();
    }
}
