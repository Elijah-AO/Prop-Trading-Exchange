#include "../include/User.h"
#include <iostream>

static int idCounter = 1;

// Default constructor
// TODO: Potentially want to remove this functionality
User::User() {
    std::cout << "User Created with default values" << std::endl;
}

// Parameterised constructor
User::User(std::string name, std::string email, std::string password) {
    this->name = name;
    this->email = email;
    this->password = password;
    this->id = idCounter++;
    std::cout << "User Created with values" << std::endl;
}

void User::printUser() {
    std::cout << "Name: " << name << std::endl;
    std::cout << "Email: " << email << std::endl;
    std::cout << "Password: " << password << std::endl;
    std::cout << "Id: " << id << std::endl;
}

// Getters
std::string User::getName() { return name; }
std::string User::getEmail() { return email; }
std::string User::getPassword() { return password; }
int User::getID() { return id; }

// Setters
void User::setName(std::string name){ this->name = name; }
void User::setEmail(std::string email){ this->email = email; }
void User::setPassword(std::string password){ this->password = password; }











