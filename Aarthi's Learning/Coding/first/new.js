/*let a = 70;
let result, i;
let isprime =true;
let temp;
if(a<=1)
{
    isprime=false;
}
for( i =2; i<a/2;i++)
{
temp=a%i;
if(temp==0){
  isprime=false;  
}
}
if(isprime==true)
console.log("the num is prime");
else
console.log("the num is not a prime");*/
//To find prime number
let n = 29;
let isPrime = true;
if(n<=1)
{
    isPrime = false;
}
for(i=2;i<n;i++)
{
   if(n%i === 0){
    isPrime = false;
    break;
   }
   isPrime = true;
}

let result = isPrime ? "prime" : "Not Prime"
console.log(result);