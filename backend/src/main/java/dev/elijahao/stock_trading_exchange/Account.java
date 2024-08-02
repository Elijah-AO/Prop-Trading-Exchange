package dev.elijahao.stock_trading_exchange;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Account {
    @Id
    private ObjectId id;
    private float balance;

    @DocumentReference
    private int userid;
    @DocumentReference
    private List<Stock> stocks;

    public void printAccount() {
        System.out.println("Account ID: " + this.id);
        System.out.println("balance: " + this.balance);
        System.out.println("UserID: " + this.userid);
    }
    
}
