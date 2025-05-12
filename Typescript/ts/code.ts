//Prompt and alert example
let userInput: string | null = window.prompt("Please Enter your input: ");
 if(userInput !== null){
    window.alert(`Hello, ${userInput}!`);
 }else{
    window.alert("You clicked cancel or closed the prompt");
 }