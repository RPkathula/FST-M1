player1 = input("Select rock, paper or scissors for player1 : ")
player2 = input("Select rock, paper or scissors for player2 : ")

if player1 == "rock" :
    if player2 == "rock" :
        print("Its tie")
    elif player2 == "paper" :
        print("Player2 wins")
    else:
        print("Player1 wins")

if player1 == "paper" :
    if player2 == "rock" :
        print("Player1 wins")
    elif player2 == "paper" :
        print("Its tie")
    else:
        print("Player2 wins")

if player1 == "scissors" :
    if player2 == "rock" :
        print("Player2 wins")
    elif player2 == "paper" :
        print("Player1 wins")
    else:
        print("Its tie")