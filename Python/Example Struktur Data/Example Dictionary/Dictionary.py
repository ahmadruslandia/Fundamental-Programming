def first():
    return "The First Example Succeeded"
def second():
    return "The Second Example Succeeded"
def third():
    return "The Third Example Succeeded"
def fourth():
    return "The Fourth Example Succeeded"
def default():
    return "Enter your Choice Correctly"

dict = {
    1: first,
    2: second,
    3: third,
    4: fourth,
    }

def switch(varchc):
    return dict.get(varchc, default)()

print(switch(1))
print(switch(2))
print(switch(3))
print(switch(4))
print(switch(5))
print(switch(6))