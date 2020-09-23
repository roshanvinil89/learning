import string

a2z = string.ascii_lowercase
n = int(input())
width = 4 * n - 3

for start in reversed(range(n)):
    list1 = [a2z[i] for i in reversed(range(start + 1, n))]
    list2 = [a2z[start]]
    list3 = [a2z[i] for i in range(start + 1, n)]
    print('-'.join(list1 + list2 + list3).center(width, '-'))

for start in range(1, n):
    list1 = [a2z[i] for i in reversed(range(start + 1, n))]
    list2 = [a2z[start]]
    list3 = [a2z[i] for i in range(start + 1, n)]
    print('-'.join(list1 + list2 + list3).center(width, '-'))
