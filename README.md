
# Diceware (Swift)
> Swift 5 | "safe" Randomization

## Variant Info
This is a Swift (5) implementation of Diceware.

It makes use of the `Int.random(in: )` function to produce "safe" random integers between `[0, n]` (including n). 

This is arguable since there is also `arc4random` & `arc4random_uniform`. Former has been deemed "unsafe" because a modulo bias exists.

If anyone wants to, please feel free to substitute `Int.random` with `arc4random_uniform` !

## Features
- Implements the standard Diceware list/ "Diceware Compliant"
- Substitute spaces with special chars
- Substitute certain chars with random digits (e.g. 's' ≠ 5, could be any Integer in range 0-9)
- Written in modern Swift

## Compiling & Usage
Load it up into Xcode, compile and you should be good to go
!
## Reporting Bugs
**DO NOT REPORT BUGS ON THIS BRANCH.**

**PLEASE SWITCH TO MASTER AND REPORT THE BUG THERE WITH THE BRANCH NAME.**

## Credits
- [Diceware Homepage](https://theworld.com/~reinhold/diceware.html) for providing the list
- The pigeons in front of my house
