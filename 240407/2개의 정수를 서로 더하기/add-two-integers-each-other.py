a = input()

b, c = a.split()

e = int(b)
f = int(c)

e += f
f += e 

print(e, f)