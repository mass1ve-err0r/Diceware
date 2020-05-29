#include "main.h"

std::string getWordAt(uint idx) {
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
