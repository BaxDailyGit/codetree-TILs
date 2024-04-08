a = input()
b,c,d = a.split()

e = [int(b), int(c), int(d)]

print(sum(e), int(sum(e)/len(e)), sep = "\n")