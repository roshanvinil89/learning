inputStr = input()
index, char = input().split()
index = int(index)

listOfChars = list(inputStr)
listOfChars[index] = char

newStr = ''.join(listOfChars)
print(newStr)
