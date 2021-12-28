numList = input("Enter a sequence of numbers with space: First and Last Numbers in the sequence can be equal or not equal").split(" ")
print("List of Numbers : ", numList)
firstElement = numList[0]
lastElement = numList[-1]
if (firstElement == lastElement):
    print(True)
else:
    print(False)