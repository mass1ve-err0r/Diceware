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
# </editor-fold>
