//
//  main.swift
//  DicewareSWIFT
//
//  Created by Saadat Baig on 30.05.20.
//  Copyright © 2020 Saadat Baig. All rights reserved.
//

import Foundation

print("Diceware Generator")
var rv_pw: String

let nWords = getUserInput(msg: "How many words would you like to use?")
let _sw = getUserInput(msg: "Do you want to substitute whitespaces with special characters?")
let _sn = getUserInput(msg: "Do you want to substitute some characters with random numbers?")

let words = getNWordsFromList(n: nWords)

if (_sw == 1) {
    rv_pw = replaceWhitespacesWithSpecials(password: words, mode: 1)
} else {
    rv_pw = replaceWhitespacesWithSpecials(password: words, mode: 0)
}

if (_sn == 1) {
    rv_pw = replaceWhitespacesWithSpecials(password: rv_pw, mode: 3)
}

print("Done. Your password is as follows:")
print(rv_pw)