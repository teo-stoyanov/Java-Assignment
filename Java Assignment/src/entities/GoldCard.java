package entities;

import interfaces.Cartable;

public class GoldCard implements Cartable {
    private double turnover;
    private double discount;

    public GoldCard(double turnover) {
        this.turnover = turnover;
        setDiscount();
    }

    private void setDiscount() {
        double newValue = 0.02;
        if (this.turnover > 100) {
            int temp = (int)(this.turnover / 100);
            newValue += (temp * 1.0) / 100;
            if(newValue > 0.1){
                newValue = 0.1;
            }
        }
        this.discount = newValue;
    }

    @Override
    public double getTurnover() {
        return this.turnover;
    }

    @Override
    public double getDiscount() {
        return this.discount;
    }
}
