#include <iostream>
#include "include/User.h"
int main() {
    User user1("John Doe", "d", "123");
    User user2("John Doe", "d", "123");
    user1.printUser();
    user2.printUser();
    int id = user1.getID();
    std::cout << id << std::endl;
    return 0;
}