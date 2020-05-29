from dicewareMap import dicewareMap as dwMap
from typing import Any


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
