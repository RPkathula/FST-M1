listOfNUmbers = input("Enter the numbers : ").split(" ")
tupleList = [int(x) for x in listOfNUmbers]
print("Given list is ", tupleList)
print("Elements that are divisible by 5:")
for num in tupleList:
    if (num % 5 == 0):
        print(num)