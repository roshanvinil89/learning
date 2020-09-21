string = input()
width = int(input())

start = 0
end = width
length = len(string)

lines = []
while end < length:
    lines.append(string[start:end])
    start = end
    end = end + width

if start < length:
    lines.append(string[start:])

print(*lines, sep='\n')

for i in range(0, len(string), width):
    print(string[i:i + width])

string1 = '\n'.join(string[i: i + width] for i in range(0, len(string), width))
print("##############")
print(string1)
