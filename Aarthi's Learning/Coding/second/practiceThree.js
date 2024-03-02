// swap two variables
//let [a,b] = [5,10]
let a = 20;
let b = 10;
[a, b] = [b, a]
console.log(`the value of a is ${a} and the value of b is ${b}`)
//swap two variables using third variable
let temp;
temp = a;
a = b;
b = temp;
console.log(`the value of a is ${a} and the value of b is ${b}`)
// To find odd or even
let result = (a % 2 === 0) ? "Even" : "odd"
console.log(`The value of a is ${result}`)
///To print the numbers individually
let c = 17894934;
while (c != 0) {
    console.log(c % 10);
    c = parseInt(c / 10)
}
//To print the numbers in reverse order
let d = 250598; let reverse = 0;
while (d != 0) {
    let remainder = d % 10;
    reverse = reverse * 10 + (remainder);
    d = parseInt(d / 10);
}
console.log(reverse);
// To add the numbers given in the digit
let e = 12345; let sum = 0;
while (e != 0) {
    let rem = e % 10;
    sum = sum + rem
    e = parseInt(e / 10)
}
console.log(sum);
// To find prime number or not
let isPrime = true;
if (a == 1 || a == 0) {
    isPrime = false;
}
for (i = 2; i < a; i++) {
    if (a % i == 0) {
        isPrime = false;
        break;
    }
}
if (isPrime) {
    console.log("the number is prime")
}
else {
    console.log("The number is not prime")
}

//To find a factorial of a given number
let n = 5;
let fact = function (n) {
    if (n == 0) {
        return 1;
    }
    else {
        let res = n * fact(n - 1)
        return res;
    }
}
console.log(fact(n));
//switch case
let food = "chinaa"
switch (food) {
    case "india":
        console.log("eat roti")
        break;
    case "china":
        console.log("eat noodles");
        break;
    case "korea":
        console.log("eat kimchi");
        break;
    default:
        console.log("eat biriyani");
        break;
}
//nested for loop
for (let i = 1; i <= 5; i++) {
    console.log("hi")
    for (let j = 1; j <= 5; j++) {
        console.log("namjoon")
    }
}
let add = (n1, n2) => n1 + n2;
console.log(add(100, 100))
//objects
let wonders = {
    india: "tajmahal",
    china: "greatwall",
    france: "eifiltower",
    america: {
        california: "siliconvalley",
        washington: "capital",
        newyork: "dosaman"
    },
    cube: (n) => (n ** 3)
}
console.log(wonders.america.newyork, wonders.cube(9));

for (props in wonders) {
    console.log(props, wonders[props])
}
for (props in wonders.america) {
    console.log(props, wonders.america[props])
}
let student1 = {
    tamil: 90,
    english: 90,
    compare: function (student2) {
        if (this.tamil > student2.tamil) {
            console.log("student 1 has high marks")
        }
    }
}
let student2 = {
    tamil: 80,
    english: 90
}
student1.compare(student2)

//constructor
let india = new State("TN", "KL")
function State(state1, state2) {
    this.southEast = state1,
        this.southWest = state2
}
console.log(india)
///array
let arr = new Array()
arr.push(1, 2, 3, 4, 5);
console.log(arr);
arr.pop()
console.log(arr)
arr.shift()
console.log(arr)
arr.unshift(1)
console.log(arr)
arr.splice(1, 1)
console.log(arr)
for (let n of arr) {
    console.log(n)
}
for (props in arr) {
    console.log(props, arr[props])
}
let name = "my name is aarthi".split(' ')
//console.log(name)
let [x, ...y] = name
console.log(x, y)
arr.filter(n => (n % 2 == 0))
    .map(n => n * 2)
//.reduce(n1,n2 => console.log((n1**n2)))
//.forEach(n => console.log(n))
//sets
let set = new Set()
set.add(1);
set.add(1);
set.add(5);
set.add("aarthi");
console.log(set);
console.log(set.has("aarthi"))
set.forEach(n => console.log(n))
for (let n of set) {
    console.log(n)
}
//maps
let map = new Map()
map.set("aarthi", "daughter")
map.set("sriram", "son")
map.set("punitha", "mom")
map.set("murugan", "dad")
console.log(map)
console.log(map.has("aarthi"))
map.forEach((v, k) => console.log(k, v))
for (let [k, v] of map) {
    console.log(k, v)
}
for (let props in map) {
    console.log(props, map[props])
}
//recursion factorial problem
let factorial = function (n) {
    if (n === 0) {
        return 1;
    }
    else {
        let Factresult = (n * factorial(n - 1))
        return Factresult;
    }
}
console.log(factorial(20))

//fibonacci series
//0,1,1,2,3,5,8,13,21
let fib = function (n) {
    let f = 0;
    let s = 1;
    console.log(f)
    console.log(s);
    let t = f + s;
    console.log(t);
    for (let i = 1; i < n; i++) {
        f = s;
        s = t;
        t = f + s
        console.log(t)
       
    }
    return t;
}
console.log(fib(9))

//fibonacci series in an array
function fibonacci(n) {
    const fib = [0, 1] //[0,1,1,2,]
    for (let i = 2; i <= n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2]
// if(fib[i]==5)
// {
   
//     break;
// }
    }
    return fib;
}
console.log(fibonacci(9))