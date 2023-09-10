def palindrome(first, second):
    rev_str = first[::-1]
    rev_num = int(rev_str)

    if rev_num == second:
        print("PALINDROME!")
    else:
        print("NOT PALINDROME!")


first = int(input("Enter a first number: "))
second = int(input("Enter a second number: "))
palindrome(first, second)
