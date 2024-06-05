# min stack

actions = ["minStack", "push", "push", "push", "getMin", "pop", "top", "getMin"]
values = [[], [-2], [0], [-3], [], [], [], []]
output = []


class MinStack():
    def __init__(self):
        print("Initialized the stack")
        self.data = []
        self.min = None


    def push(self, val):
        print(f"Pushed the {val} in stack")
        self.data.append(val)
    

    def pop(self):
        print("Pop from stack")
        self.data.pop()
    

    def top(self):
        print("Top from stack")
        return self.data[-1]
    

    def get_min(self):
        return sorted(self.data)[0]



stack = None

for idx, action in enumerate(actions):
    match action:
        case "minStack":
            stack = MinStack()
            output.append(None)
        
        case "push":
            stack.push(values[idx][0])
            output.append(None)
        
        case "pop":
            stack.pop()
            output.append(None)
        
        case "top":
            top = stack.top()
            output.append(top)
        
        case "getMin":
            min = stack.get_min()
            output.append(min)


print()
print(output)
