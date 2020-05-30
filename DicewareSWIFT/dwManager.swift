//
// Created by Saadat Baig on 30.05.20.
// Copyright (c) 2020 Saadat Baig. All rights reserved.
//

import Foundation

let specials: [Character] = ["!", "$", "§", "_", "-", "+", "*", "#", "=", "}", "&", "%", "?", "ß", "^"]
let exchangeables: [Character] = ["i", "z", "e", "a", "s", "t", "b", "g", "o"]


func getUserInput(msg: String) -> Int {
    print(msg)
    let inp = readLine().flatMap(Int.init(_:))
    if (inp == nil) {
        return getUserInput(msg: "String was malformed! Please retry...")
    }
    return inp!
}

func createDicewareNumber() -> Int {
    var rv_i: [Int] = []

    for i in 1...5 {
        let rNum = Int.random(in: 1...6)
        rv_i.append(rNum)
    }
    return rv_i.reduce(0, {$0*10 + $1})
}

func getNWordsFromList(n: Int) -> String {
    var rv_a: [String] = []

    for i in 0..<n {
        let idx = createDicewareNumber()
        rv_a.append(dicewareMap[idx]!)
    }

    return rv_a.joined(separator: " ")
}

func replaceWhitespacesWithSpecials(password: String, mode: Int) -> String {
    if (mode == 0) { // Replace just with underscore
        return password.replacingOccurrences(of: " ", with: "_")
    }
    var rv_s: [Character] = []
    if (mode == 1) { // Replace with specials
        for char in password {
            if (char == " ") {
                let rNum = Int.random(in: 0...14)
                rv_s.append(specials[rNum])
            } else {
                rv_s.append(char)
            }
        }
    } else { // Replace with random numbers
        for char in password {
            if (exchangeables.contains(char)) {
                let rNum = Int.random(in: 0...9)
                rv_s.append(Character(String(rNum)))
            } else {
                rv_s.append(char)
            }
        }
    }
    return String(rv_s)
}