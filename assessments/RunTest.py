import json

class RunTest:
    def __init__(self, answer):
        self.answer = answer

    def check(self):
        return self.user_answer and self.user_answer == self.answer
    
    def receive_JSON(self, fname):
        with open('assessments/input.json', 'r') as f:
            data = json.load(f)
            self.user_answer = data['answer'][0]['test']
    
t = RunTest("1")
t.receive_JSON('input.json')
print(t.check())
