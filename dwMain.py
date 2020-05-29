from dicewareMap import dicewareMap as dwMap
from typing import List, Any
from secrets import randbelow


# <editor-fold desc="[Prettier Printing Functions]">
def success(msg: str, val: Any = None) -> None:
    if val is None:
        print("[+]: {}".format(msg))
        return
    print("[+]: {}{}".format(msg, val))
    return


def error(msg: str, val: Any = None) -> None:
    if val is None:
        print("[-]: {}".format(msg))
        return
    print("[-]: {}{}".format(msg, val))
    return


def info(msg: str, val: Any = None) -> None:
    if val is None:
        print("[*]: {}".format(msg))
        return
    print("[*]: {}{}".format(msg, val))
    return
# </editor-fold>


# <editor-fold desc="[Internal Implementation Functions]">
def getRandomNumber(exclusive_max: int, singular: bool) -> int:
    if singular:
        rv_singular = randbelow(exclusive_max)
        return rv_singular
    rv_s: str = ""
    rNums: List[int] = []
    for i in range(0, 5):
        num: int = randbelow(exclusive_max)
        if num == 0:
            num = 1
        rNums.append(num)
    for i in rNums:
        rv_s += str(i)
    return int(rv_s)


def getUserInput(msg: str, upper_bound: int) -> int:
    rvUI: int
    try:
        info(msg)
        rvUI = int(input())
        if rvUI > upper_bound or rvUI < 0:
            error("Number too big or negative, please retry...")
            return getUserInput(msg, upper_bound)
        return rvUI
    except ValueError:
        error("Input not recognized, please retry...")
        return getUserInput(msg, upper_bound)


def getWordFromDicewareMap(key: int) -> str:
    return dwMap.get(key)
# </editor-fold>