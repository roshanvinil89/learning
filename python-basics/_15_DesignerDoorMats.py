h, w = map(int, input().split())

pattern = '.|.'
welcome = 'WELCOME'

print('\n'.join((pattern*(2*i + 1)).center(w, '-') for i in range(h // 2)))
print(welcome.center(w, '-'))
print('\n'.join((pattern*(2*i + 1)).center(w, '-') for i in reversed(range(h // 2))))