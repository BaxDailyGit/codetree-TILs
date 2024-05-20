arr = list(map(int, input().split()))

sum_val = 0 
cnt = 0
# arr의 원소의 인덱스를 생성
for i in range(len(arr)):
    #해당 인덱스의 값이 250이 넘으면 
    if arr[i] < 250:
        sum_val += arr[i]
        cnt += 1
    else:
        break
print(sum_val, "{:.1f}".format(sum_val/cnt))