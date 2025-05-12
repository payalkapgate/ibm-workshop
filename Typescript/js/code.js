//varialble scope example
firstFunction();
secondFunction();
var firstName;
function firstFunction() {
    var firstName = "Payal";
    console.log(firstName); // local variable
}
function secondFunction() {
    var firstName = "Prachi"; //local variable
    console.log(firstName);
}
console.log(firstName);
