a = input()
i = a.split()

print(int(i[0]) + int(i[1]) + int(i[2]))
print(int((int(i[0]) + int(i[1]) + int(i[2]))/len(i)))
print(int((int(i[0]) + int(i[1]) + int(i[2])) - ((int(i[0]) + int(i[1]) + int(i[2]))/len(i))))