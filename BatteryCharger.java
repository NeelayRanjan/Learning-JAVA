import java.util.ArrayList;

public class BatteryCharger {
    private int[] rateTable = {50,60,160,60,80,100,100,120,150,150,150,200,40,240,220,220,200,200,180,180,140,100,80,60};

    public int getChargingCost(int startHour, int chargeTime){
        int cost = 0;
        for(int i=0;i<chargeTime;i++){
            cost += rateTable[(startHour+i)%24];
        }
        return cost;

    }

    public int getChargeStartTime(int chargeTime)
    {
        int startTime = 0;
        for (int i = 1; i < 24; i++)
        {
            if (this.getChargingCost(i, chargeTime)
                    < this.getChargingCost(startTime, chargeTime))
            {
                startTime = i;
            }
        }
        return startTime;
    }

}
