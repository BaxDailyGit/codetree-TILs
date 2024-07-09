def square(n, m):
    for _ in range(n):
        print("1" * m)

n,m = input().split()
n = int(n)
m = int(m)

square(n, m)