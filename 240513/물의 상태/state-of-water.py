water_temp = int(input())

if water_temp < 0:
    print("ice")

elif water_temp >= 100:
    print("vapor")

else:
    print("water")