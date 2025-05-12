//varialble scope example
firstFunction();
secondFunction();
let firstName: string | undefined
function firstFunction(){
    let firstName = "Payal";
    console.log(firstName); // local variable
}
function secondFunction(){
    let firstName = "Prachi"; //local variable
    console.log(firstName);
}
console.log(firstName)
