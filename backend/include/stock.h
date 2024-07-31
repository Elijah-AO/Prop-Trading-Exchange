#include <iostream>

class Stock{
    public:
        Stock(std::string name, std::string ticker, float price);
        std::string getName();
        std::string getTicker();
        float getPrice();
        void setPrice(float price); 

        void printStock();

    private:
        std::string name;
        std::string ticker;
        float price;
};