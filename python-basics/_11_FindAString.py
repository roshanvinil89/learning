string = input()
subString = input()
start = -1
count = 0
while start < len(string):
    start = string.find(subString, start + 1)
    if start == -1:
        print(count)
        break
    count += 1

print(sum([1 for i in range(len(string) - len(subString) + 1) if string[i : i+len(subString)] == subString]))