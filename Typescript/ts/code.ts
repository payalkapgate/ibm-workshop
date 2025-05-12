function execute(operation: (num1: number, num2: number) => number){
    console.log(operation(2, 4));
}
execute((num1, num2) => { return num1 + num2});
execute((num1, num2) => {return (num1+num2) / 2 });