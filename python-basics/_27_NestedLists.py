listOfScores = []
marks = set()
for _ in range(int(input())):
    name = input()
    score = float(input())
    listOfScores.append([name, score])
    marks.add(score)

secondLowest = sorted(marks)[1]

print('\n'.join(sorted(list(map(lambda x: x[0], filter(lambda x: x[1] == secondLowest, listOfScores))),
                       key=lambda x: x[0])))