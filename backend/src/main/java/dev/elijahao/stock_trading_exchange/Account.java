package dev.elijahao.stock_trading_exchange;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "accounts")
@Data
@NoArgsConstructor

public class Account {
    @Id
    private int id;
    
    private static int idCounter = 0;
    private float balance;

    @DocumentReference
    private int userid;
    @DocumentReference
    private ArrayList<Stock> stocks;


    public Account(int id, float balance, int userid) {
        this.id = id;
        this.balance = balance;
        this.userid = userid;
        this.id = idCounter++;
    }

    public void printAccount() {
        System.out.println("Account ID: " + this.id);
        System.out.println("balance: " + this.balance);
        System.out.println("UserID: " + this.userid);
    }
    
}
