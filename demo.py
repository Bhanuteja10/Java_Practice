from abc import ABC, abstractmethod

class Computer(ABC):
    @abstractmethod
    def code(self):
        pass

class Laptop(Computer):
    def code(self):
        print("Coding in Laptop")

class Desktop(Computer):
    def code(self):
        print("Coding in Desktop")

class Developer:
    def dev_app(self, computer):
        computer.code()

if __name__ == "__main__":
    lap = Laptop()
    desk = Desktop()

    rnd_person = Developer()
    rnd_person.dev_app(lap)