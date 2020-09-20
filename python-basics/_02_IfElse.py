n = int(input().strip())

if 1 == n % 2:
    print("Weird")
elif n < 6:
    print("Not Weird")
elif n < 21:
    print("Weird")
else:
    print("Not Weird")