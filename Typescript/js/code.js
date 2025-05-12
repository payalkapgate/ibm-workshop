//block scope example
var x = 22;
{
    var x_1 = 90;
    console.log(x_1);
    {
        var x_2 = 56;
        console.log(x_2);
    }
    {
        var x_3 = 45;
        console.log(x_3);
    }
}
console.log(x);
