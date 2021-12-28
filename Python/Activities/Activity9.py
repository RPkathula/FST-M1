listOne = [1,2,3,4,5]
listTwo = [6,7,8,9,10]
print("List One : ", listOne)
print("List Two : ", listTwo)
listThree = []
for num in listOne:
    if (num % 2 != 0):
        listThree.append(num)
for num in listTwo:
    if (num % 2 == 0):
        listThree.append(num)
print("result List is:")
print(listThree)