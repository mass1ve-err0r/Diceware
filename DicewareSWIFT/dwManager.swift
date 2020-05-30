//
// Created by Saadat Baig on 30.05.20.
// Copyright (c) 2020 Saadat Baig. All rights reserved.
//

import Foundation



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