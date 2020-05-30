
# Diceware
> Create passwords with mathematically defined difficulty

## Introduction 
Diceware is a way of creating (strong) passwords through a defined set of rules.

#### _Definition_
The mechanism is (in general):
- Roll a dice five (5) times and then pick a word from a predefined set of words
	- These predefined sets or rather lists can be found at the Diceware homepage (link in the Credits section). 
- Repeat the process _N_ times
	- (N = Number of words you want your password to have)
- Join the words together with spaces and ta-da!

_Example:_
_I do this and want 5 words; After rolling the dice numerous times and noting down the words, I get:
"ninja", "berry", "aaa", "rand" and "zen"_
_=> "ninja berry aaa rand zen" becomes the password_ 

The safey in this lies in the set of words/ word lists. The standard Diceware list contains 7776 words, the formula to calculate the possibilities (hypotheses) is: <img src="https://render.githubusercontent.com/render/math?math=7776^{n}">

(If the markdown has not rendered, it's 7776 to the power of n; n = number of words to use)

The benefit by using this is a sense of randomness; If someone wants to hack you, the most common approach is to use a "rainbow table" with addtitional rulesets depending on the extent of a bruteforce attack. However, using diceware ensures a random password with a strong password entropy.

On average, an attacker will need to perform <img src="https://render.githubusercontent.com/render/math?math=2^{63}"> (2^63) operations.

#### _Implementations_
The other major difficulty implementing this is to pick _good_ random number generator in the target language. After hours of looking into it, one can safely deduce the best logical fit.

This repository holds safe implementations of Diceware in the following languages:
- Python
- Java
- C++
- Swift

As additional feature, I've added the ability to substitute whitespaces with special characters **and / or** substitute certain letters with random numbers (e.g. 's' ≠ 5).

## Where is code??
On the branches!

Pick the language you want to view Diceware in and feel free to grab it & run it!

- [Direct link to the C++ Variant](https://github.com/mass1ve-err0r/Diceware/tree/CPP)
- [Direct link to the Java Variant](https://github.com/mass1ve-err0r/Diceware/tree/Java)
- [Direct link to the Python Variant](https://github.com/mass1ve-err0r/Diceware/tree/Python)
- [Direct link to the Swift Variant](https://github.com/mass1ve-err0r/Diceware/tree/Swift)


If you want to use your own list/ a custom list, feel free to use the scraper. It'll output preformatted entries you can just ctrl+c & ctrl+v
## Credits
- [Diceware Homepage](https://theworld.com/~reinhold/diceware.html) - Providing Diceware lists & definition
- [a-rodin](https://gist.github.com/a-rodin/fef3f543412d6e1ec5b6cf55bf197d7b) - Hax for showing LaTeX in GitHub's markdown
- My friends & family

## License
**EVERYTHING ON THIS REPOSITORY (INCLUDING BRANCHES) IS LICENSED UNDER AGPL v3**
