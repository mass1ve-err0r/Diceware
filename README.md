# Diceware (Java / JavaFX)
> Java 14+ | Easy UI | "safer" Randomization

## Variant Info
This is a Java (14) implementation of Diceware.

It makes use of the `ThreadLocalRandom.current().nextInt(a, b)` function to produce "safer" random integers between `[0, n]` (exclusive n). 


If you just want to know the logic of Diceware in Java, please view the following files only:
- DicewareMap (reading in a `.properties` file)
- DicewarePassGen (functions for diceware)
- HomeViewController (logic to follow)

## Features
- Implements the standard Diceware list/ "Diceware Compliant"
- Substitute spaces with special chars
- Substitute certain chars with random digits (e.g. 's' ≠ 5, could be any Integer in range 0-9)
- Added GUI for even easier creation/ usage
	- (!) JavaFX 14+ will be required to compile

## Compiling & Usage
- JDK 14+
- JavaFX 14+


You should be able to just download the project and compile it inside a modern IDE.
## Reporting Bugs
**DO NOT REPORT BUGS ON THIS BRANCH.**

**PLEASE SWITCH TO MASTER AND REPORT THE BUG THERE WITH THE BRANCH NAME.**

## Credits
- [Diceware Homepage](https://theworld.com/~reinhold/diceware.html) for providing the list
- The pigeon gang, still peckin'
