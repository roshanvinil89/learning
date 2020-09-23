import re


def checkregex(regexstr):
    try:
        re.compile(regexstr)
        print(True)
    except re.error:
        print(False)


n = int(input())
for i in range(n):
    checkregex(input())
