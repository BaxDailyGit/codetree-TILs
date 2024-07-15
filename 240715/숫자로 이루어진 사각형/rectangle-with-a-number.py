# 사용 예제
N = int(input())

def print_square(N):
    num = 1
    for i in range(N):
        for j in range(N):
            print(num, end=' ')
            num += 1
            if num > 9:
                num = 1
        print()  # 각 행을 출력한 후 줄 바꿈

print_square(N)