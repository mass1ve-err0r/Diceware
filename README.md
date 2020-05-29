
# Diceware (Python)
> Python 3.6+ | "safer" Randomization

## Variant Info
This is a Python (3.6+) implementation of Diceware.

It makes use of the `secrets.randbelow` function to produce "safer" random integers between `[0, n]` (exclusive n). 

_(See PEP506 for further discussion about the usage of `secrets`)_

## Features
- Implements the standard Diceware list/ "Diceware Compliant"
- Substitute spaces with special chars
- Substitute certain chars with random digits (e.g. 's' ≠ 5, could be any Integer in range 0-9)
- Added types for better readability
	- BONUS: JetBrains IDE users will notice the code-folding, this is purely visual and for additional readability. (analogous to pragma region/ mark)

## Compiling & Usage
It's Python, just grab & run it!

## Reporting Bugs
**DO NOT REPORT BUGS ON THIS BRANCH.**

**PLEASE SWITCH TO MASTER AND REPORT THE BUG THERE WITH THE BRANCH NAME.**

## Credits
- [Diceware Homepage](https://theworld.com/~reinhold/diceware.html) for providing the list
- The global pigeon gang roaming the world, they are watching and peckin'
