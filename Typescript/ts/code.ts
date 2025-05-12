//block scope example
const x=22;
{
    const x = 90;
    console.log(x);
    {
        const x = 56;
        console.log(x);
    }
    {
        const x = 45;
        console.log(x);
    }
}  
console.log(x);
