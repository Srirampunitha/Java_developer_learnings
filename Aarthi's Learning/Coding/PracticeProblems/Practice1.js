//swap two numbers without using third variable
let a = 5; let b = 10;
a = a + b;
b = a - b;
a = a - b;
console.log(`the value of a is ${a} and the value of b is ${b}`)
// swap two numbers using third variable
let temp;
temp = a;
a = b;
b = temp;
console.log(`the value of a is ${a} and the value of b is ${b}`)
// swap two numbers using array de-constructing method
let [c, d] = [5, 9];
[c, d] = [d, c]
console.log(`the value of c is ${c} and the value of d is ${d}`)
//To find the number odd or even
let OddOrEven = (b % 2 == 0) ? "even" : "odd"
console.log(OddOrEven);
/////////////////////////////////////////////////////////
// To print the digit in the number individually
let num = 250598;
while (num != 0) {
    console.log(num % 10)
    num = parseInt(num / 10)
}
////////////////////////////////////////////////////////
//Reverse the number
let num1 = 542000; let rev = 0;
while (num1 != 0) {
    let rem = num1 % 10;
    rev = rev * 10 + (rem)
    num1 = parseInt(num1 / 10)
}
console.log(rev)
////////////////////////////////////////////////////////
//To add the digits in an number
let num3 = 40670; let sum = 0;
while (num3 != 0) {
    let rem = num3 % 10;
    sum = sum + rem;
    num3 = parseInt(num3 / 10)
}
console.log(sum)
//////////////////////////////////////////////////////////////
//To find a numbe is prime or not;
let isPrime = true; let e = 1;
PrimeorNot = function (n) {
    if (n == 0 || n == 1) {
        isPrime = false;
    }
    for (let i = 2; i < n; i++) {
        if (n % i === 0) {
            isPrime = false;
            break;
        }
    }
    if (isPrime) {
        return (`The given number${n} is prime`)
    }
    else {
        return (`The given number${n} is not a prime number`)
    }

}
console.log(PrimeorNot(2))
///////////////////////////////////////////////////////
//Factorial
let fact = function (n) {
    if (n == 0) {
        return 1;
    }
    let res = (n * (fact(n - 1)))
    return res;
}
console.log(fact(5))
///////////////////////////////////////////////////////
//Fibonocci series 0,1,1,2,3,5,8,13
let n1 = 0; let n2 = 1; let n3; let n = 7;
console.log(n1); console.log(n2)
for (let i = 2; i <= n; i++) {
    n3 = n1 + n2;
    console.log(n3)
    n1 = n2; //n1 = 0; n2 =1; => n3=1, (n1=1,n2=1,n3=2),(n1=1,n2=2,n3=3),
    n2 = n3 //
   
}
////////////////////////////////////////////////////////////
//Fibonnacci series using an array
let fib = [0,1]
for(let i = 2;i<=n;i++){
    fib[i] = fib[i-1]+fib[i-2]
}
console.log(fib)
///////////////////////////////////////////////////////////
//Adding two numbers in an array using forEach method
let arr = [1,2,3,4,5]; let total = 0; let add = 0 ;
arr.forEach(n => (total = total+n))
console.log(total)
//Adding two numbers in an array using map method
arr.map(n => (add = add+n))
console.log(add)
//Adding two numbers using reduce method
console.log(arr.reduce((a,b)=>(a+b)))
///////////////////////////
console.log("FIBANOCCI SERIES"); 
let f = 0; let s = 1; let t;
for(let i = 1;i<=n;i++){
console.log(f);
t = f+s;
f = s;
s = t;
}
//////////////////////////////////////
let fibb = [0,1];
for(let i=2;i<=n;i++){
    fibb[i] = fibb[i-1]+fibb[i-2];
}
console.log(fibb);
//////////////////////////////////////////
//Switch case
let alarm = "saturday";
switch(alarm){
    case "monday":
        console.log("7am")
        break;
        case "tuesday":
        console.log("8am")
        break;
        default:
            console.log("9am")
            break;
}
//for loop
for(let i =0;i<5;i++){
    console.log("hi")
    for(let j = 0;j<4;j++)
{console.log("hello")}
}
/////////////////////////////////////////////////////
//objects
let india = {
    state: "TN",
    district: "TVR",
    city: "KMU",
    village:{
        street: "MiddleStreet",
        doorNo: "27"
    }
}
console.log(india["village"].street)
for(let key in india){
    console.log(key,india[key])
}
for(let key in india.village){
    console.log(key,india.village[key])
}
///////////////////////////////////////////////////////////////
// method inside an object, this keyword, object compares itself
let stu1 = {
    tamil: 80,
    english: 99,
    maths: 90,
    compare: function(stu2){
let res = this.tamil > stu2.tamil ? "stu1 has high marks" : "stu2 has high marks"
return res;
    }
}
let stu2 = {
    tamil: 98,
    english: 97,
    maths: 80,
    compare: function(stu1){
        let res = stu1.english > this.english ? "stu1 has high marks" : "stu2 has high marks"
        return res; 
    }
}
console.log(stu2.compare(stu1))
////////////////////////////////////////////////////////////////
//constructor
let cons = new Cons("us","canada")
let cons2 = new Cons("france","spain")
function Cons(us, canada){
this.country1 = us,
this.country2 = canada
}
console.log(cons)
console.log(cons2)
/////////////////////////////////////////////////////////////////////
let foodie = new Food("india","korea")
function Food(i,k){
this.idly = i,
this.kimchi = k
}
console.log(foodie)
//////////////////////////////////////////////////////////////
let dest = new Dest("Rajasthan","ladakh")
function Dest(R,L){
this.dest1 = R,
this.dest2 = L
}
console.log(dest)

////////////ARRAY///////////////////////
let array = [2,5,0,5,9,8]
array.push(0)
console.log(array)
array.pop()
console.log(array)
array.unshift(0)
console.log(array)
array.shift()
console.log(array)
array.splice(2,1,0)
console.log(array)
for(let n of array){
    console.log(n)
}
for(let key in array){
    console.log(array[key], key)
}
///////////////SPLIT METHOD/////////////////
let myName = "my sweet name is aarthi".split(" ")
let [x,y,...z] = myName;
console.log(z)
let myDay = "how was the day?"
let newMyDay = myDay.split("")
console.log(newMyDay.length)
///////////////////////////////////////////////////
//for each
let arr1 = [5,4,2,0,0,0]; let tot = 0; let str = ['a','b','c','d','a','d']; let count = {};
arr1.forEach(n => (tot = n+tot))
console.log(tot)
str.forEach(counting)
function counting(n){
if(count[n]){
    count[n]++
}
else{
    count[n] = 1;
}
}
console.log(count)
//////////////////////////
let count1 = {}
str.forEach(n => {
    if(count1[n]){count1[n]++}
    else{count1[n]=1}
})
console.log(count1)
/////////////////////////////////////////////////////
//filter method
let arr2 = arr1.filter(n => n%2==0)
console.log(arr2)
let dupARR = [1,1,2,2,3,3,4,4,5,5]
let oriARR = dupARR.filter((n,i)=>(dupARR.indexOf(n,5)===i))
console.log(oriARR)
let bts = [{
    name1: "namjoon",
    age: 29
},{
    name2: "jin",
    age: 30},{
        name3: "jungkook",
        age: 26}]
   let bts1 =    (bts.filter(person => (person.age>=26)))
   console.log(bts1)
   ///////////////////////////////////////////////////////////////////
   //Map method
   let arr3 = [5,4,3,2,1]; let tott = 0;
   (arr3.map(n=>(tott=n+tott))); console.log(tott)
let arr4 = arr3.map((n,i) => (n*i))
console.log(arr4)
let product = [
    {
        name: "laptop",
        price: 5000,
        count: 3
    },
    {
        name: "desktop",
        price: 7000,
        count: 2
    },
    {
        name: "phone",
        price: 2000,
        count: 2
    }
]
console.log(product.map((item) => ({name: item.name, price: item.price*item.count})))
let str1 = ['1','2','3']
let number = str1.map(Number)
console.log(number,str1)
 let name = [
    {
        firstname: "aarthi",
        lastname: "murugan"
    },
    {
        firstname: "sriram",
        lastname: "murugan"
    },
    {
        firstname: "punitha",
        lastname: "murugan"
    }
 ]
 console.log(name.map(fullname => ([fullname.firstname,fullname.lastname].join(" "))))
 //////////////////////////////////////////////////////////////////////////////////////////
 //reduce method
 let arr5 = [0,40,100,6,70,0]
 console.log(arr5.reduce((a,b)=>(a+b)))
 /////////////////////////////////////////////////////////////////
 //slice method
 console.log(arr5.slice(2,5)); console.log(arr5)
 ////////////////////////////////////////////////////
 // sort method
 let Bts = ["namjoon","jhope","jimin","tae"]
 console.log(Bts.sort())
 let Sortedarr = (arr5.sort((a,b)=>(a-b)))
 let smallestElement = Sortedarr[0];
 let HighestElement = Sortedarr[Sortedarr.length-1]
 console.log(smallestElement);
 console.log(HighestElement)

 let product2 = [
    {
        name: "laptop",
        price: 5000,
        count: 3
    },
    {
        name: "desktop",
        price: 7000,
        count: 2
    },
    {
        name: "phone",
        price: 2000,
        count: 2
    }
]
let sort = product2.sort((a,b)=>(a.price - b.price))
console.log(sort)