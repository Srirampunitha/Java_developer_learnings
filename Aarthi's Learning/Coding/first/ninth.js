//swap two numbers without using third variable:
let a = 5;
let b = 10;
a = a + b; //15
b = a - b; //5
a = a - b; //10
console.log(`the value of a is ${a} and the value of b is ${b}`);
//swap two numbers using temp variable;
let c = 15;
let d = 60;
let temp = c;
c = d;
d = temp;
console.log(`the value of c is ${c} and the value of d is ${d}`);
//To find the number odd or even using function:
let OrE = function(num)
{
let cal = (num%2===0)?"Even":"odd";
return (`The given number${num} is ${cal}`)
}
let result1 = OrE(a)
let result2 = OrE(b)
let result3 = OrE(c)
let result4 = OrE(d)
console.log(`result 1 is ${result1} and R2 is ${result2} and R3 is ${result3} and R4 is ${result4}`)
//To print the numbers in the digit individually
let n = 12345;
while(n>0)
{
    console.log(n%10);
    n = parseInt(n/10);
}
//To print numbers in a reverse order;
let reverse = 0;
let n1 = 5427
while(n1!=0)
{
    let remainder = n1%10;
    reverse = (reverse*10)+remainder
    n1 = parseInt(n1/10);
}
console.log(reverse);
 let sum = 0;
 while(reverse>0)
 {
    let remainder = reverse%10
    sum = sum + remainder;
    reverse = parseInt(reverse/10);
 }
 console.log(` the sum is ${sum}`);



if (sum ==19 || reverse ==20 && sum !=18 )
{
    console.log("either one is correct")
}
else{console.log("nothing is correct")}


let mon, tue, wed, thur, fri, sat, sun;

let alarm = "monday"
switch(alarm)
{
    case "mon":
        console.log("5am")
        break;
        case "tue":
            console.log("6am")
            case "wed":
            console.log("6am")
            case "thur":
                console.log("6am")
                break;
                case "fri":
                    console.log("7am")
                    break;
                    case "sat":
                        console.log("9am")
                        case "sun":
                            console.log("9am")
                            break;
                            default:
                                console.log("sleep")
}

let R = 0;
while(R<=5)
{
    console.log("hi", R)
    R++;
}
for(R;R<10;R++)
{
    console.log("Hello",R)
    for(s=1;s<5;s++)
    {
        console.log("Hi aarthi",s)
    }
}
let mul = (num1,num2) => (num1**num2);
let res1 = mul(5,3);
let res2 = mul(2,3);
let res3 = mul(3,3);
console.log(res1, res2, res3);
