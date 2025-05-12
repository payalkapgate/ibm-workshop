// Grouping console example
function f1(){
    console.log("Group 1");
    console.groupCollapsed();
    console.info("Getting started");
    console.error("Something went wrong");
    console .log("logging this");
    console.groupEnd();
}
console.info("Bye");
f1();