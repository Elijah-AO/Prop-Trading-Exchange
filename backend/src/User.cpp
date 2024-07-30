#include "../include/User.h"
#include <iostream>

static int idCounter = 1;

User::User() {
    std::cout << "User Created with default values" << std::endl;
}

void User::printUser() {
    std::cout << "User" << std::endl;
}
