#Task1
#Ujjwal Govrani
def gcd_fun (x, y):
    if (y == 0): # it divide every number  
        return x  # return x  
    else:  
        return gcd_fun (y, x % y)  
x =int (input ("Enter the first number: ")) # first no.
y =int (input ("Enter the second number: ")) # second no.
num = gcd_fun(x, y) # result
num = gcd_fun(x, y) # result
print("GCD of two number is: ")
print(num)