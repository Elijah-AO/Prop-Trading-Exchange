#include <iostream>
#include "stock.h"

// Parameterised constructor
Stock::Stock(std::string name, std::string ticker, float price) {
    this->name = name;
    this->ticker = ticker;
    this->price = price;
    std::cout << "Stock created with values" << std::endl;
}

void Stock::printStock() {
    std::cout << "Name: " << name << std::endl;
    std::cout << "Ticker: " << ticker << std::endl;
    std::cout << "Price: " << price << std::endl;
}

// Update price
float Stock::getPrice() { return price; }
void Stock::setPrice(float price){ this->price = price; }