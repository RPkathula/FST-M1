def calculateSum(num):
  if num:
    return num + calculateSum(num-1)
  else:
    return 0
res = calculateSum(5)
print(res)