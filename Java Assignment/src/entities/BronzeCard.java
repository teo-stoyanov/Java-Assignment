package entities;

import interfaces.Cartable;

public class BronzeCard implements Cartable {
    private double turnover;
    private double discount;


    public BronzeCard(double turnover) {
        this.turnover = turnover;
        setDiscount();
    }

    private void setDiscount() {
        double newValue;
        if (this.turnover < 100) {
            newValue = 0;
        } else if (this.turnover >= 100 && this.turnover <= 300) {
            newValue = 0.01;
        } else {
            newValue = 0.025;
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
