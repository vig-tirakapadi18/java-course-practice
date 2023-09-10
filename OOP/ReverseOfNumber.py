# def rev_num(num):
#     rem = 0
#     rev = 0

#     while (num > 0):
#         rem = num % 10
#         num = num / 10
#         rev = (rev * 10) + rem

#     print(f"The reverse is: {rev}")


# num = float(input("Enter a number to reverse: "))
# rev_num(num)


def rev_string(str):
    rev_str = str[::-1]
    # rev_num = int(rev_str)

    print(f"The reverse of string is {rev_str}")
    # print(f"The reverse of the number is {rev_num}")


str = input("Enter a string: ")
rev_string(str)
