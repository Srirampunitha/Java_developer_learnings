//Find odd or even
let a = 76;
if (a % 2 === 0)
{
    console.log("a is even");
}
else{console.log("a is odd")}
// using ternary operator instead of if/else
let b = 5;
let result = (b%2) === 0 ? "Even" : "odd";
console.log(result);

//swap two numbers
let x = 7;
let y = 5;
x = x + y; //12
y = x - y; //7
x = x - y;
console.log(`The value of x is ${x} and the value of y is ${y}`)//Template literal
