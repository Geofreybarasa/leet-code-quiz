number = [1,2,3,4,5,45]

for num in number:
    if num % 15 == 0:
         print(num , "fizzbuzz")

    elif num % 3 == 0:
        print( num ,"fizz")


    elif num % 5 == 0:
        print(num, "buzz")
    else:
            print(num)
