//Define an Interface for a person
interface Person{
    name: string;
    age: number;
    greet(): void; // Methos signature
}

//create object that follows the person interface
const john: Person = {
    name: "Payal Kapgate",
    age: 54,
    greet(){
        console.log(`Hello, my name is ${this.name}!`);
    }
};
john.greet();

class Employee implements Person{
    constructor(
        public name: string,
        public age: number,
        public jobTitle: string
    ){}
    greet(){
        console.log(`Hi, I'm ${this.name}, a ${this.jobTitle}.`);
    }
}
const sarah = new Employee("Sarah  Smith", 28, "Developer");
sarah.greet();   
//Interface with optional property
interface Book{
    title: string;
    author: string;
    pages?: number;
}

const book1: Book = {title: "Ts Basics", author: "Jane Doe"};
const book2: Book = {title: "Advanced TS", author: "John Smith", pages: 54}


interface Person1{
    name: string;

}
interface Emp extends Person1{
    id:number;
}
class Manager implements Emp{
    name = "BOB";
    id= 234;
}