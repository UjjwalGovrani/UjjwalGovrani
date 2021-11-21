#Task3
#ujjwal Govrani
def passwd_check(passwd):

    SpecialSym=['$','@','#']
    return_val=True
    if len(passwd) < 6:
        print('the length of password should be at least 6 char long')
        return_val=False
    if len(passwd) > 15:
        print('the length of password should be not be greater than 15')
        return_val=False
    if not any(char.isupper() for char in passwd):
        print('the password should have at least one uppercase letter')
        return_val=False
    if not any(char.islower() for char in passwd):
        print('the password should have at least one lowercase letter')
        return_val=False
    if not any(char in SpecialSym for char in passwd):
        print('the password should have at least one of the symbols $@#')
        return_val=False
    return return_val

print(passwd_check.__doc__)
passwd = input('enter the password : ')
print(passwd_check(passwd))