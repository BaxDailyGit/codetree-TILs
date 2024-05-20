n = int(input())
a = list(map(float, input().split()))


if sum(a)//n >= 4.0:
    print("{:.1f}".format(sum(a)/n))
    print("Perfect")
elif sum(a)//n >= 3.0:
    print("{:.1f}".format(sum(a)/n))
    print("Good")
else:
    print("{:.1f}".format(sum(a)/n))
    print("Poor")