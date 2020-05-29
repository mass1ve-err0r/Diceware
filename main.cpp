#include "main.h"

unsigned int randomNumberGenerator(int a, int b, bool singular) {
    std::random_device dev;
    std::mt19937 rng(dev());
    std::uniform_int_distribution<std::mt19937::result_type> rNum(a,b);

    if (singular) {
        unsigned int rv = rNum(rng);
        return rv;
    }

    unsigned int n1 = rNum(rng);
    unsigned int n2 = rNum(rng);
    unsigned int n3 = rNum(rng);
    unsigned int n4 = rNum(rng);
    unsigned int n5 = rNum(rng);

    std::string s1 = std::to_string(n1);
    std::string s2 = std::to_string(n2);
    std::string s3 = std::to_string(n3);
    std::string s4 = std::to_string(n4);
    std::string s5 = std::to_string(n5);

    std::string rv_s = s1 + s2 + s3 +s4 +s5;
    unsigned int rv = std::stoi(rv_s);
    return rv;
}

std::string replaceSpaceWithSpecialChar(std::string password) {
    char specials[10] = {'$', '_', '?', '!', '&', '%', '=', '-', '+', '#'};
    for(char & it : password) {
        if(it == ' ') {
            unsigned int rNum = randomNumberGenerator(0, 9, true);
            it = specials[rNum];
        }
    }
    return password;
}

std::string replaceSpaceWithRandomNumbers(std::string password) {
    char numbers[10] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    for(char & it : password) {
        if(it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 't' || it == 'z' || it == 's' || it == 'b') {
            unsigned int rNum = randomNumberGenerator(0, 9, true);
            it = numbers[rNum];
        }
    }
    return password;
}

std::string getWordAt(unsigned int idx) {
    std::string rv = dwMap.at(idx);
    return rv;
}

uint getUserInput() {
    std::string inp;
    unsigned int len;
    while(std::getline(std::cin, inp)) {
        std::stringstream ss(inp);
        if (ss >> len) {
            if (ss.eof()) {
                break;
            }
        }
        error("Failed to recognize amount. Retry...");
    }
    if (len > 66666) {
        error("Index was out of bounds! Retry...");
        return getUserInput();
    }
    return (uint)len;
}
