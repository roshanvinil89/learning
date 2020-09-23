n = int(input())
numlist = list(map(int, input().split()))
print(sorted(set(numlist), reverse=True)[1])
