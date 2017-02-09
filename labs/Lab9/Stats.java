//****************************************
// Keith Danley
// Daniel Conroy
// Gary Miller
// Zack Hudac
// CMPSC 111 Spring 2014
// Lab #9
// Date:  2014
//
// Purpose: Andrew McCutchen Stats
//****************************************

import java.util.Date; // needed for printing today's date

public class Stats
{
    // Variables
    final int YEARS = 5;
    private double [] BA = new double [YEARS];
    private int H[] = new int [YEARS];
    private int HR[] = new int [YEARS];
    private int R[] = new int [YEARS];
    private int RBI[] = new int [YEARS];
    private double OBP[] = new double [YEARS];
    private double averageBA;
    private double totalH;
    private double totalHR;
    private double totalR;
    private double totalRBI;
    private double averageOBP;
    private double sumBA = 0;
    private double sumH = 0;
    private double sumHR = 0;
    private double sumR = 0;
    private double sumRBI = 0;
    private double sumOBP = 0;
    int i = 0; 

    // BA
    public Stats()
    {
        BA[0] = .286;
        BA[1] = .286;
        BA[2] = .259;
        BA[3] = .327;
        BA[4] = .317;

        // H
        H[0] = 124;
        H[1] = 163;
        H[2] = 148;
        H[3] = 194;
        H[4] = 185;

        // HR
        HR[0] = 12;
        HR[1] = 16;
        HR[2] = 23;
        HR[3] = 31;
        HR[4] = 21;

        // R
        R[0] = 74;
        R[1] = 94;
        R[2] = 87;
        R[3] = 107;
        R[4] = 97;

        // RBI
        RBI[0] = 54;
        RBI[1] = 56;
        RBI[2] = 89;
        RBI[3] = 96;
        RBI[4] = 84;

        // OBP
        OBP[0] = .365;
        OBP[1] = .365;
        OBP[2] = .364;
        OBP[3] = .400;
        OBP[4] = .404;
    

    // Calculate Average Stats

    for (i = 0; i < 5; i++)
    {
        sumBA += BA [i];
    }
    averageBA = sumBA/5;

    for (i = 0; i < 5; i++)
    {
        sumH += H [i];
    }
    totalH = sumH;

    for (i = 0; i < 5; i++)
    {
        sumHR += HR [i];
    }
    totalHR = sumHR;

    for (i = 0; i < 5; i++)
    {
        sumR += R [i];
    }
    totalR = sumR;

    for (i = 0; i < 5; i++)
    {
        sumRBI += RBI [i];
    }
    totalRBI = sumRBI;

    for (i = 0; i < 5; i++)
    {
        sumOBP += OBP [i];
    }
    averageOBP = sumOBP/5;

    }
    // Get Statistic
    public double getAverageBA ()
    {
        return averageBA;
    }
    public double getTotalH ()
    {
        return totalH;
    }
    public double getTotalHR ()
    {
        return totalHR;
    }
    public double getTotalR ()
    {
        return totalR;
    }
    public double getTotalRBI ()
    {
        return totalRBI;
    }
    public double getAverageOBP ()
    {
        return averageOBP;
    }    
}
