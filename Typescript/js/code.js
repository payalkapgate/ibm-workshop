function execute(operation) {
    console.log(operation(2, 4));
}
execute(function (num1, num2) { return num1 + num2; });
execute(function (num1, num2) { return (num1 + num2) / 2; });
