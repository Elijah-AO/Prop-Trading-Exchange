#include <iostream>

class User {
public:
    User();
    User(std::string name, std::string email, std::string password);
    std::string getName();
    std::string getEmail();
    std::string getPassword();
    int getId();
    void setName(std::string name);
    void setEmail(std::string email);
    void setPassword(std::string password);
    void printUser();
private:
    std::string name;
    std::string email;
    std::string password;
    int id;
};
