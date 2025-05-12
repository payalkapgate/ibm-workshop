//create object that follows the person interface
var john = {
    name: "Payal Kapgate",
    age: 54,
    greet: function () {
        console.log("Hello, my name is ".concat(this.name, "!"));
    }
};
john.greet();
var Employee = /** @class */ (function () {
    function Employee(name, age, jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }
    Employee.prototype.greet = function () {
        console.log("Hi, I'm ".concat(this.name, ", a ").concat(this.jobTitle, "."));
    };
    return Employee;
}());
var sarah = new Employee("Sarah  Smith", 28, "Developer");
sarah.greet();
var book1 = { title: "Ts Basics", author: "Jane Doe" };
var book2 = { title: "Advanced TS", author: "John Smith", pages: 54 };
var Manager = /** @class */ (function () {
    function Manager() {
        this.name = "BOB";
        this.id = 234;
    }
    return Manager;
}());
