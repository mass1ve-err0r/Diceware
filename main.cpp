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
    if (len > 7776) {
        error("Number is too big! Retry...");
        return getUserInput();
    }
    return (uint)len;
}

int main() {
    std::string rv;
    unsigned int shouldUseSpecials, shouldSubstituteWithNumbers;

    info("How many words would you like to use?")
    unsigned int pLength = getUserInput();
    std::string dwFinalWords[pLength];
    size_t n = sizeof(dwFinalWords)/sizeof(std::string);
    for (int i = 0; i < n; ++i) {
        uint rNum = randomNumberGenerator(1, 6, false);
        dwFinalWords[i] = getWordAt(rNum);
    }

    for (int j = 0; j < n; ++j) {
        if (j-1 == n) {
            rv += dwFinalWords[j];
            continue;
        }
        rv += dwFinalWords[j];
        rv += " ";
    }

    info("Would you like to include special characters? (1)yes or (0)no");
    while (true) {
        shouldUseSpecials = getUserInput();
        if (shouldUseSpecials < 2 && shouldUseSpecials >= 0) {
            break;
        }
        error("Could not processes input. Retry...");
    }

    info("Would you like to substitute some characters with Numbers? (1)yes or (0)no");
    while (true) {
        shouldSubstituteWithNumbers = getUserInput();
        if (shouldSubstituteWithNumbers < 2 && shouldSubstituteWithNumbers >= 0) {
            break;
        }
        error("Could not processes input. Retry...");
    }

    if (shouldUseSpecials == 1) {
        rv = replaceSpaceWithSpecialChar(rv);
    }
    if (shouldSubstituteWithNumbers == 1) {
        rv = replaceSpaceWithRandomNumbers(rv);
    }

    success("Password creation successful. This is your password:")
    info(rv);
    return 0;
}