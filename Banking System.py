
balance = 1000.0

while True:
        print("\n##= Basic Banking System Menu =##")
        print(" 1. Deposit")
        print(" 2. Withdraw")
        print(" 3. Check Balance")
        print(" 4. Exit")
        print("-------------------")
        choice = input("Enter your Choice: ")

        if choice == '1':
            try:
                deposit_amount = float(input("Enter the Deposit Amount: "))
                if deposit_amount > 0:
                    balance += deposit_amount
                    print(f"Deposited: {deposit_amount}")
                    print(f"New Balance: {balance}")
                else:
                    print("Please enter a positive amount.")
            except ValueError:
                print("Invalid input. Please enter a numeric value.")
        
        elif choice == '2':
            try:
                withdraw_amount = float(input("Enter the Withdraw Amount: "))
                if withdraw_amount > 0 and withdraw_amount <= balance:
                    balance -= withdraw_amount
                    print(f"Withdrew {withdraw_amount}")
                    print(f"New Balance: {balance}")
                elif withdraw_amount > balance:
                    print("Insufficient balance.")
                else:
                    print("Please enter a positive amount.")
            except ValueError:
                print("Invalid input. Please enter a numeric value.")
        
        elif choice == '3':
            print(f"Your Balance is: {balance}")
        
        elif choice == '4':
            print("Thank you for using the Banking System. Come back again later!")
            break
        else:
            print("Invalid choice. ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR! ERROR!")
