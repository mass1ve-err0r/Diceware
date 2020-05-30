def preformatX(lang: int):
    """
    Preformat a diceware wordlist (filename: dw.txt) for various languages.

    1-Python, 2-CPP, 3-Java, 4-Swift

    :param lang: lang identifier
    :return: None
    """
    infile = "dw.txt"
    with open(infile, 'r') as f:
        dicewareDict = {}
        while True:
            line = f.readline()
            line = "".join(line.strip().split())
            if not line:
                print("We done!")
                break
            dNum, dWord = line[:5], line[5:]
            dicewareDict[int(dNum)] = dWord
    if lang == 1:
        for key in dicewareDict:
            print("{}: \"{}\",".format(key, dicewareDict[key]))
        return
    elif lang == 2:
        for key in dicewareDict:
            print("{{{}, \"{}\"}},".format(key, dicewareDict[key]))
        return
    elif lang == 3:
        for key in dicewareDict:
            print("{} {}".format(key, dicewareDict[key]))
        return
    elif lang == 4:
        for key in dicewareDict:
            print("{}: \"{}\",".format(key, dicewareDict[key]))
        return
    return


if __name__ == '__main__':
    print("=" * 60 + "\nDiceware Formatter\n" + "=" * 60)
    # Uncomment the lines below to use.
    # ident: int = int(input("Which language should we preformat?: "))
    # preformatX(ident)
