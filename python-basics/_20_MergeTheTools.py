string = input()
k = int(input())

print('\n'.join(''.join(list(dict.fromkeys(string[i: i + k]))) for i in range(0, len(string), k)))
