a = input()
a = a.split()

if int(a[0]) > int(a[1]):
    print(int(a[0])-int(a[1]))
else:
    print(int(a[1])-int(a[0]))