//Prompt and alert example
var userInput = window.prompt("Please Enter your input: ");
if (userInput !== null) {
    window.alert("Hello, ".concat(userInput, "!"));
}
else {
    window.alert("You clicked cancel or closed the prompt");
}
