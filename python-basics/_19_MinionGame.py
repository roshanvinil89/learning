string = input()

kevinScore = 0
stuartScore = 0

vowels = 'AEIOU'

for i in range(len(string)):
    if string[i] in vowels:
        kevinScore += len(string) - i
    else:
        stuartScore += len(string) - i

if kevinScore > stuartScore:
    print("Kevin", kevinScore)
elif stuartScore > kevinScore:
    print("Stuart", stuartScore)
else:
    print("Draw")
