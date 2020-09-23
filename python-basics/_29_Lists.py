n = int(input())
theList = []

for _ in range(n):
    command = input().split()

    if command[0] == 'insert':
        theList.insert(int(command[1]), int(command[2]))
    elif command[0] == 'print':
        print(theList)
    elif command[0] == 'remove':
        theList.remove(int(command[1]))
    elif command[0] == 'append':
        theList.append(int(command[1]))
    elif command[0] == 'sort':
        theList = sorted(theList)
    elif command[0] == 'pop':
        theList.pop(-1)
    elif command[0] == 'reverse':
        theList.reverse()
