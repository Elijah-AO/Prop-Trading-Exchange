package dev.elijahao.stock_trading_exchange;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "stocks")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Stock {
    @Id
    private String ticker;
    private String name;
    private float price;

    public void printStock() {
        System.out.println("Ticker: " + this.ticker);
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
    }
    
}
