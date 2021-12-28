numbers = list(input("Enter a sequence of  values with space: ").split(" "))
sum = 0

for number in numbers:
  sum += int(number)

print(sum)