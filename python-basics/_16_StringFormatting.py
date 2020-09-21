number = int(input())
width = len(bin(number)[2:])

print('\n'.join(' '.join(
    [str(i).rjust(width), str(oct(i))[2:].rjust(width), str(hex(i)).upper()[2:].rjust(width), str(bin(i))[2:].rjust(
        width)]) for i in range(1, number + 1)))
