def prime_num(num):
    temp = 0
    for i in range(2, num):
        if num % i == 0:
            temp = temp + 1

    if temp > 0:
        print(f"{num} is NON-PRIME NUMBER!")
    else:
        print(f"{num} is PRIME NUMBER!")


num = int(input("Enter a number to check Prime Number: "))
prime_num(num)
