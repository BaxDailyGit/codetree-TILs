h = input()
h,w = h.split()
h,w = int(h), int(w)

if w/(h/100)**2 >= 25:
    print(int(w/(h/100)**2))
    print("Obesity")
else:
    print(int(w/(h/100)**2))