//swap two numbers
let a = 46; b = 92;
a = a + b;
b = a - b;
a = a - b;
console.log(`The value of a is: ${a} and the value of b is:${b}`);
///////////////////////////////////////////////////////////////////
//swap two numbers using temp variable;
let temp;
temp = a;
a = b;
b = temp;
console.log(`The value of a is: ${a} and the value of b is:${b}`);
/////////////////////////////////////////////////////////////////
//swap two numbers using array de-constructing
let [c, d] = [5, 10];
[c, d] = [d, c];
console.log(`The value of c is: ${c} and the value of d is:${d}`);
////////////////////////////////////////////////////////////////////////
//Find odd or even
let Find = function (num) {
    let result = num % 2 == 0 ? "Even" : "odd";
    return result;
}
let ans = console.log(Find(d));
/////////////////////////////////////////////////////////////////////////
// To print the digits individualy
let e = 123;
while (e != 0) {
    console.log(e % 10);
    e = parseInt(e / 10);
}
///////////////////////////////////////////////////////////////////////
//To reverse a numbers in a digit;
let reverse = 0; let f = 4567;
while (f != 0) {
    let remainder = f % 10;
    reverse = (reverse * 10) + remainder;
    f = parseInt(f / 10)
}
console.log(reverse);
//////////////////////////////////////////////////////////////////////////
//To add numbers in a digit
let x = 123; let sum = 0;
while (x != 0) {
    remainder = x % 10;
    sum = sum + remainder;
    x = parseInt(x / 10);
}
console.log(sum);
//////////////////////////////////////////////////////////////////////////
//To find the number prime or not
let isPrime = true; let y = 50
if(y ==1||y==0)
{
    isPrime = false;
}
for(i=2;i<y;i++)
{
    if(y%i===0)
    {
        isPrime = false;
        break;
    }
}

if(isPrime)
{
    console.log(`the number${y} is prime`)
}
else{
    console.log(`the number${y} is not prime`)
}
///////////////////////////////////////////////////////////////////////////////
//Palindrome
let num = 1001;  let rev = 0; let p =1001;
while(num!=0)
{
    let rem =(num%10);
    rev = (rev*10)+(rem);
    num = parseInt(num/10);
}
console.log(rev);
let res = (rev === p)?"palindrome":"Not Palindrome"
console.log(res);

let z = 5.9;
console.log(Math.floor(z))
let arr = [1,2,2,4,4,5,8,9,8]
// let result = arr.forEach((n,i)=>
// {
//     if(n==i){
//         console.log(n);
//     }
// })
for(let n in arr){
    //console.log(n, arr[n])
    if(arr[n]==n)
    console.log(arr[n])
}

