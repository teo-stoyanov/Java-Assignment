package core;

import constant.Const;
import entities.BronzeCard;
import entities.GoldCard;
import entities.SilverCard;
import interfaces.Cartable;
import interfaces.InputReader;
import interfaces.OutputWriter;
import interfaces.Runnable;
import io.ConsoleReader;
import io.ConsoleWriter;

public class Engine implements Runnable {

    private InputReader reader;
    private OutputWriter writer;

    public Engine() {
        this.reader = new ConsoleReader();
        this.writer = new ConsoleWriter();
    }

    @Override
    public void run() {

        String cardType = reader.readLine();
        double turnover = Double.parseDouble(reader.readLine());
        double purchase = Double.parseDouble(reader.readLine());

        Cartable card;
        if (cardType.equals(Const.BRONZE)) {
            card = new BronzeCard(turnover);
        } else if (cardType.equals(Const.SILVER)) {
            card = new SilverCard(turnover);
        } else {
            card = new GoldCard(turnover);
        }

        double discountRate = PayDesk.findDiscountRate(card);
        double discountPrice = PayDesk.findDiscountValue(card, purchase);
        double totalPrice = PayDesk.findPriceAfterDiscount(card, purchase);

        writer.writeLine(String.format("Purchase value: $%.2f", purchase));
        writer.writeLine(String.format("Discount rate: %.1f" , discountRate) + "%");
        writer.writeLine(String.format("Discount: $%.2f" , discountPrice));
        writer.writeLine(String.format("Total: $%.2f" , totalPrice));
    }

}
