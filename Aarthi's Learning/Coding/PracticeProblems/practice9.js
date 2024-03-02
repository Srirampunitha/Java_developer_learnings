//swap two numbers
let a = 5, b = 10;
a = a + b;
b = a - b;
a = a - b;
console.log(`the value of a is ${a} and the value of b is ${b}`)
//////////////////////////////////////////////////////////////////////
//swap two numbers using the temp variable
let temp;
temp = a;
a = b;
b = temp;
console.log(`the value of a is ${a} and the value of b is ${b}`)
/////////////////////////////////////////////////////////////////////
//swap two numbers using array de-constructing method
let c = 3, d = 4;
[c, d] = [d, c]
console.log(`the value of c is ${c} and the value of d is ${d}`)
////////////////////////////////////////////////////////////////////////
//odd or even
if (b % 2 == 0) {
    console.log("even")
}
else {
    console.log("odd")
}
////////////////////////////////////////////////////////////////////////////
//print the number in a digit individually
let n = 12345
while (n != 0) {
    console.log(n % 10)
    n = parseInt(n / 10)
}
//////////////////////////////////////////////////////////////////////////
//reverse a digits in a number
n = 250598; let rev = 0;
while (n != 0) {
    let rem = n % 10;
    rev = rev * 10 + (rem)
    n = parseInt(n / 10)
}
console.log(rev)
/////////////////////////////////////////////////////////////////////////
//To add the digits given in the number
n = 12345; let sum = 0;
while (n != 0) {
    let rem = n % 10;
    sum = sum + rem;
    n = Math.floor(n / 10)
}
console.log(sum)
/////////////////////////////////////////////////////////////////////////
//To find the given number is prime or not;
n = 30; let isPrime = true;
isPrime = ((n == 0) || (n == 1)) ? false : true
for (let i = 2; i < Math.sqrt(n); i++) {
    if (n % 2 == 0) {
        isPrime = false
    }
}
if (isPrime) {
    console.log("prime number")
}
else {
    console.log("Not a prime number")
}
///////////////////////////////////////////////////////////////
//Factorial
n = 5;
function fact(n) {
    if ((n == 0) || (n == 1)) {
        return 1;
    }
    else {
        return n * (fact(n - 1))
    }
}
console.log(fact(n))
//////////////////////////////////////////////////////
//Fibonocci series
n = 10;
let f = 0, s = 1;
console.log(f); console.log(s)
for (let i = 2; i < n; i++) {
    t = f + s;
    f = s;
    s = t;
    console.log(t)
}
///////////////////////////////////////////////////////
//Fibonocci series using array
let fib = [0, 1]
for (let i = 2; i < n; i++) {
    fib[i] = fib[i - 1] + fib[i - 2]
}
console.log(fib)
///////////////////////////////////////////////////////
//adding two numbers using for each method;
n = [1, 2]; sum = 0;
n.forEach(value => sum = sum + value)
console.log(sum)
///////////////////////////////////////////////////////
//adding two numbers using reduce method
let res = n.reduce((a, b) => (a + b))
console.log(res)
//////////////////////////////////////////////////////
//Map method
n = [1, 2]
sum = 0;
n.map((value) => (sum = sum + value))
console.log(sum)
/////////////////////////////////////////////////////
//Reverse an array
arr = [1, 2, 3, 4, 5]
temp; let start = 0; let end = arr.length - 1
while (start < end) {
    temp = arr[start]
    arr[start] = arr[end];
    arr[end] = temp;
    start++
    end--
}
console.log(arr)
///////////////////////////////////////////////////////////
//Reverse an array using builtin method
arr.reverse()
console.log(arr)
//////////////////////////////////////////////////////////
//create an array of n numbers using fill method
n = 10;
arr = Array(n).fill(0).map((value, index) => (value = index + 1))
console.log(arr)
//////////////////////////////////////////////////////////
//find all the index of particular value in an array
arr = [1, 5, 3, 5, 3, 7, 5, 9, 5]; n = 5;
for (let i = 0; i < arr.length; i++) {
    if (arr[i] == n) {
        console.log(i)
    }
}
//////////////////////////////////////////////////////////////
//Find the mid element in an array
arr = [1, 2, 3, 4, 5]; n = arr.length
let mid = parseInt(n / 2)
console.log("Middle element is" + " " + arr[mid])
///////////////////////////////////////////////////////////
arr = ["a", "a", "r", "t", "h", "i"]
n = (arr.length)
mid = parseInt(n / 2)
console.log("Middle element is" + " " + arr[mid])
////////////////////////////////////////////////////////
//Fascinating number 
n = 192;
let num = "123456789"
res = ((n * 2) + "" + (n * 3) + "" + n).split("").sort((a, b) => (a - b)).join("")
console.log((res))
/////////////////////////////////////////////////////////
//Display the longest name in an array
let names = ["aarthi", "aarthiriya"]
let longestname = names.reduce((a, b) => (a.length > b.length ? a : b))
console.log(longestname)
///////////////////////////////////////////////////////////
//Find the GCD of two number
a = 15, b = 70;
let rem = a % b;
while (rem != 0) {
    a = b;
    b = rem;
    rem = a % b
}
console.log(b)
//////////////////////////////////////////////////////////////
// convert the first letter in a string to upper case
let str = "i love programming"
str = str.split(' ')
for (let i = 0; i < str.length; i++) {
    console.log(str[i])
    str[i] = str[i].charAt(0).toUpperCase() + str[i].substring(1)
}
console.log(str)
//////////////////////////////////////////////////////////////////
//convert a number to a binary
n = 5;
n = n.toString(2)
console.log(n)
//////////////////////////////////////////////////////////////////
//happy number
n = 91; let set = new Set()
function happyNum(n) {
    while (n != 1) {
        let sum = 0;
        while (n > 0) {
            let rem = n % 10;
            sum = sum + (rem ** 2)
            n = parseInt(n / 10)
        }

        if (set.has(sum)) {
            return ("Unhappy number")
        }
        set.add(sum)
        n = sum;
    }
    return "happy number"
}
console.log(happyNum(n))
///////////////////////////////////////////////////////////////////////////////////////
//odd or even
n = 50;
res = (n % 2 != 0) ? "odd" : "even"
console.log(res)
////////////////////////////////////////////////////////////////////////////////////////
//switch case
let food = "chole bhatura"
switch (food) {
    case "chicken chukka":
        console.log("tamilnadu")
        break;
    case "chole bhatura":
        console.log("Delhi")
        break;
    case "chole kulcha":
        console.log("Punjab")
        break;
    case "parotta":
        console.log("Kerala")
        break;
    default:
        console.log("TN")
}
///////////////////////////////////////////////////////////////////////////////////////
//nested for loop
for (let i = 1; i <= 2; i++) {
    console.log("Hi")
    for (let j = 1; j <= 1; j++) {
        console.log("Aarthi")
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////
//objects
food = {
    Tamilnadu: "chickenChukka",
    Delhi: "CholeBhatura",
    Punjab: "CholeKulcha",
    Beverage: {
        sweet: "hotChocolate",
        hot: "MasalaChai"
    }
}
console.log(food["Tamilnadu"])
console.log(food.Beverage.sweet)
for (let keys in food) {
    console.log(keys, food[keys])
}
for (let keys in food.Beverage) {
    console.log(keys, food.Beverage[keys])
}
//////////////////////////////////////////////////////////////////////////
//methods inside a object
let calc = {
    sum: (a, b) => (a + b),
    mul: (a, b) => (a * b),
    mod: (a, b) => (a % b)
}
console.log(calc.mul(5, 5))
console.log(calc.sum)
//////////////////////////////////////////////////////////////////////////
//this keyword
food = {
    Tamilnadu: "chickenChukka",
    Delhi: "CholeBhatura",
    Punjab: "CholeKulcha",
    Beverage: {
        sweet: "hotChocolate",
        hot: "MasalaChai"
    },
    favfood: function () { return this.Tamilnadu + " " + this.Beverage.hot }
}
console.log(food.favfood())
//////////////////////////////////////////////////////////////////////////////
//object compares itself
let stu1 = {
    tamil: 99,
    english: 97,
    maths: 91,
    compare: function (stu2) {
        let res = (((this.tamil) > stu2.tamil) ? "stu1" : "stu2")
        return res
    }
}
let stu2 = {
    tamil: 95,
    english: 99,
    maths: 93,
    compare: function (stu1) {
        let res1 = (this.english > stu1.english) ? "stu2" : "stu1"
        return res1
    }
}
console.log(stu1.compare(stu2))
console.log(stu2.compare(stu1))
////////////////////////////////////////////////////////////////////////////
//constructor
let shopping = new SHOP("chai", "cofee")

function SHOP(a, b) {
    this.food1 = a,
        this.food2 = b;
}
console.log(shopping)
shopping.food1 = "hotchocolate"
console.log(shopping)
////////////////////////////////////////////////////////////////////////////////////
//Array
arr = [1, 2, 3, 4, 5];
arr.push(6)
arr.splice(0, 2, 2)
console.log(arr)
//////////////////////////////////////////////////////////////////////////
//for of loop in array
for (let n of arr) {
    console.log(n)
}
//for in loop of array
for (let key in arr) {
    console.log(key, arr[key])
}
/////////////////////////////////////////////////////////////////////////
//assigning array values to the variables
a = arr[2]
console.log(a)
////////////////////////////////////////////////
str = "I placed in Google"
res = str.split(" ")
console.log(res)
///////////////////////////////////////////////////////
//spread operator
arr = [1, 2, 3]; let arr1 = [4, 5, 6]
arr = [...arr, ...arr1]
console.log(arr)
///////////////////////////////////////////////////////
//ForEach method
sum = 0; arr = [1, 2, 3]
arr.forEach(value => sum = sum + value)
console.log(sum)
//count the number of occurence of a string in an array usimg foreach method
str = ["a", "a", "a", "b", "b", "c", "c", "d"]; let count = {};
str.forEach(value => {
    if (count[value]) {
        count[value]++
    }
    else {
        count[value] = 1;
    }
})
console.log(count)
////////////////////////////////////////////////////////////////////////////
//Filter method
arr = [5, 2, 4, 6, 9, 10]
res = arr.filter(value => (value % 2 == 0))
console.log(res)
/////////////////
let person = [
    {
        name: "aarthi",
        age: 25
    },
    {
        name: "sri",
        age: 23
    },
    {
        name: "RM",
        age: 29
    }
]
res = person.filter(value => value.age > 25)
console.log(res)
let nums = [1, 2, 3, 3, 4, 5, 6, 6, 5, 3, 9,]
res = nums.filter((value, index) => value == index)
console.log(res)
/////////////////////////////////////////////////////////////////////////////
//Map method
nums = [1, 2, 3, 4, 5]
res = nums.map((value, index) => (value * index))
console.log(res)
res = nums.map(value => Math.sqrt(value))
console.log(res)
let shop = [
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
        name: "Mobile",
        price: 3000,
        count: 5
    }
]
total = shop.map(value => ((value.price) * (value.count)))
console.log(total)
let TotalValue = shop.map((value) => ({ name: value.name, price: (value.price * value.count) }))
console.log(TotalValue)
//str to number
str = ['1', '2', '3']
num = str.map(Number)
console.log(num)
/////////////////////////////////////////////////////////////////////////////////////////////
//Reduce method
arr = [2, 5, 0, 5, 9, 8]
res = arr.reduce((a, b) => (a + b), 5)
let res2 = arr.reduce((a, b) => (a - b))
console.log(res)
console.log(res2)
//finding the max value using reduce method
res = arr.reduce((a, b) => (a > b) ? a : b)
console.log(res)
let store = [
    {
        item: 'laptop',
        cost: 1000,
        count: 2
    },
    {
        item: 'desktop',
        cost: 2000,
        count: 3
    },
    {
        item: 'phone',
        cost: 500,
        count: 4
    }
]
totalValue = store.reduce((accu, items) => (accu + (items.cost * items.count)), 0)
console.log(totalValue)
/////////////////////////////////////////////////////////////////////////////
//slice method
arr = [1, 2, 5, 4, 5]
res = arr.slice(2, 4)
console.log(res)
arr.splice(2, 1, 3)
console.log(arr)
//////////////////////////////////////////////////////////
//sort method
arr = [5, 3, 1, 9, 2, 3, 4]
str = ["sri", "aarthi", "puni"]
arr.sort((a, b) => (a - b))
arr.sort((a, b) => (b - a))
console.log(str.sort())
console.log(arr)
console.log(str)
names = ["sri", "punitha", "aarthi", "murugan"]
console.log(names.sort())
let items = [
    {
        name: "laptop",
        price: 3000
    },
    {
        name: "desktop",
        price: 5000
    }
]
items.sort((item1, item2) => item2.price - item1.price)
console.log(items)
//////////////////////////////////////////////////////////////////////////
//concat method
arr = [1, 2, 3]; arr1 = [4, 5, 6]; let arr2 = [7, 8, 9]
res = arr.concat(arr1, arr2)
console.log(res)
//////////////////////////////////////////////////////////////
//fill method
res = Array(5).fill(0).map((value, index) => (value = index + 1))
console.log(res)
res.fill(6, 7)
console.log(res)
let numbers = [1, 2, 3, 4, 5]
numbers.fill(7, 1, 4)
console.log(numbers);
////////////////////////////////////////////////////////////////////////
//includes method
arr = [1, 2, 3, 4, 5]
res = arr.includes(7)
console.log(res)
///////////////////////////////////////////////////////////////
//Join method
let countries = ["india", "korea"]
res = countries.join()
console.log(res)
//////////////////////////////////////////////////////
//reverse method
res = countries.reverse()
console.log(res)
rev = [...countries].reverse()
console.log(rev)
str = "JHOPE HELLO"
res = str.split(" ").reverse().join(" ")
console.log(res)
////////////////////////////////////////////////////////
//indexOf and lastIndexOf method
arr = [3, 2, 1, 3, 5, 3, 1]
res = arr.indexOf(3)
rev = arr.lastIndexOf(3)
console.log([res, rev])
//////////////////////////////////////////////////////
//Every method
arr = [25, 29, 31, 26, 27]
res = arr.every(value => value >= 25)
console.log(res)

let paper = [
    {
        name: "aarthi",
        ans: "YES"
    },
    {
        name: "RM",
        ans: "YES"
    },
    {
        name: "Suga",
        ans: "YES"
    }
]
res = paper.every(value => value.ans == "YES")
console.log(res)
///////////////////////////////////////////////////////////////////////////////
//some method
arr = [25, 29, 26, 27, 20]
res = arr.some(value => (value <= 20))
console.log(res)
/////////////////////////////////////////////////////////////////////////
//Find method
let age1 = [23, 16, 2, 5, 16]
let find = age1.find(value => value === 16)
console.log(age1.indexOf(find))

person = [
    {
        name: 'aarthi',
        marks: 90
    },
    {
        name: 'RM',
        marks: 85
    }

]
res = person.find(value => (value.marks > 80))
console.log(res.name)
res = age1.findIndex(value => (value == 16))
console.log(res);
////////////////////////////////////////////
arr = [1, 2, 2, 2, 3, 3, 4, 5, 5]
set = new Set(arr)
console.log(Array.from(set))
str = "250598"
num = Array.from(str, Number)
console.log(num)
//////////////////////////////////////////////////////////
//isArray Method
console.log(Array.isArray(str))
console.log(Array.isArray(arr))
///////////////////////////////////////////////////////
//flat method
arr = [[1, 2, [3, 4]], [5, 6, [7]]]
console.log(arr.flat(Infinity))
/////////////////////////////////////////////////////////
//string methods
str = "aarthi";
res = str.charAt(2)
console.log(res)
////////////////////////////////////////////////////////
//indexOf and lastIndexOf methods
str = "I love BTS"
res = str.indexOf("i")
let res1 = str.lastIndexOf("i")
console.log([res, res1])
res = "a"
/////////////////////////////////////////////////////////////
//slice method
res = str.slice(-3)
console.log(res)
rev = str.substring(2, 6)
console.log(rev)
//////////////////////////////////////////////////////////
//split method
str = "I love BTS"
res = str.split(" ", 3)
console.log(res)
//////////////////////////////////////////////////////////
//includes method
res = str.includes("BTS")
console.log(res)
////////////////////////////////////////////////////////
//Startswith and endswith method
str = "I have a plan to start a cafe"
res = str.startsWith("have", 2)
console.log(res)
rev = str.endsWith("cafe")
console.log(rev)
///////////////////////////////////////////////////////
//concat method
str = "Aarthi"; str1 = "M"
res = str.concat(str1)
console.log(res)
console.log(str + "BTS")
console.log(str.concat(" ", str))
///////////////////////////////////////////////////////
//repeat method
res = str.repeat(3)
console.log(res)
/////////////////////////////////////////////////////////
//trim method
str = " aarthi "
console.log(str.trim())
/////////////////////////////////////////////////////////
//localecompare method
str = "aarthi"; str1 = "Riya"
res = str1.localeCompare(str)
console.log(res)
//////////////////////////////////////////////////////////
//padstart and padEnd method
str = "aarthi"
res = str.padStart(10, "hi")
console.log(res)
res = str.padEnd(10, "hi")
console.log(res)
////////////////////////////////////////////////////////////
//search method
str = "I have a plan to start a cafe"
res = str.search(/CAFE/i)
console.log(res)
////////////////////////////////////////////////////////////
str = "The rain in SPAIN mainly stays in the plain"
res = str.match(/Ain/i)
console.log(res)
res = str.matchAll(/ain/gi)
console.log([...res])
/////////////////////////////////////////////////////////////
str = "Mr Blue has blue car and blue house"
res = str.replace(/blue/gi, "red")
console.log(res)

str = "Mr Blue has blue car and blue house"
res = str.replace(/blue|car|has|/gi, (match) => {
    return match.toUpperCase()
})
console.log(res)
//////////////////////////////////////////////////////////////////
//rotate an array by 1
arr = [1, 2, 3, 4, 5]
temp = arr[0]
for (let i = 1; i < arr.length; i++) {
    arr[i - 1] = arr[i]
}
arr[arr.length - 1] = temp;
console.log(arr)
////////////////////////////////////////////////////////////////
//Rotate an array by k times
let k = 3;
arr = [1, 2, 3, 4, 5]
function reverse(arr, start, end) {
    while (start < end) {
        let temp;
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start++
        end--
    }

}
function rotate(arr, k) {
    k = k % (arr.length)
    if (k < 0) {
        k = k + arr.length
    }
    reverse(arr, 0, k - 1)
    reverse(arr, k, arr.length - 1)
    reverse(arr, 0, arr.length - 1)
    return arr;
}
console.log(rotate(arr, k))
//////////////////////////////////////////////////////////////////////
//Push all the zeroes to the end without changing the position of the non zero elements
arr = [1, 0, 3, 0, 2, 0, 7, 0, 1];
let z = 0; let nz = 0; temp;
if (arr.length == 1 || arr.length == 0) {
    console.log(arr)
}
while (nz < arr.length) {
    if (arr[nz] != 0) {
        temp = arr[nz]
        arr[nz] = arr[z]
        arr[z] = temp;
        nz++
        z++
    }
    else {
        nz++
    }
}
console.log(arr)
///////////////////////////////////////////////////////////////////////
//Remove duplicates from the sorted array
arr = [1, 2, 2, 4, 4, 5, 5, 6, 7, 7]; let rd = 0;
for (let i = 1; i < arr.length; i++) {
    if (arr[i] != arr[rd]) {
        rd++
        arr[rd] = arr[i]
    }
}
for (let i = 0; i <= rd; i++) {
    console.log(arr[i])
}
////////////////////////////////////////////////////////
//Find the leader in an array
arr = [15, 12, 14, 3, 1]; let currentLeader = arr[arr.length - 1]
console.log("leader is" + " " + currentLeader);
for (let i = arr.length - 2; i >= 0; i--) {
    if (arr[i] > currentLeader) {
        currentLeader = arr[i]
        console.log("leader is" + " " + currentLeader);
    }
}
/////////////////////////////////////////////////////////////////
//Find the majority element that occurs more than n/2 times
arr = [5, 5, 9, 5, 5, 5, 5, 9, 9, 9, 1];; let max = arr[0]; count = 1;
for (let i = 0; i < arr.length; i++) {
    if (arr[i] == max) {
        count++
    }
    else {
        count--
    }
    if (count == 0) {
        max = arr[i]
        count = 1;
    }
}
console.log(max)
////////////////////////////////////////////////////////////////
//searching
//Linear search
arr = [1, 2, 3, 4, 5]; let target = 5;
for (let i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        console.log(i)
    }
}
//////////////////////////////////////////////////////////////////////
//Binary search
arr = [1, 2, 3, 4, 5]; target = 5;
start = 0; end = arr.length - 1;
while (start <= end) {
    mid = parseInt((start + end) / 2)
    if (arr[mid] == target) {
        console.log(mid)
        break;
    }
    if (arr[mid] < target) {
        start = mid + 1
    }
    else {
        end = mid - 1
    }
}
/////////////////////////////////////////////////////////////////////////////////
//Bit manipulation
//Convert number to binary using to string method
n = 32
res = n.toString(2)
console.log(res)
////////////////////////////////////////////////
n = 32; str = ""
while (n >= 1) {
    let x = n % 2;
    n = parseInt(n / 2)
    str = x + str
}
console.log(str)
//////////////////////////////////////////////////////
//convert binary to number
n = "100000"; res = 0; let poweroftwo = 1;
for (let i = n.length - 1; i >= 0; i--) {
    if (n.charAt(i) == 1) {
        res = res + poweroftwo
    }
    poweroftwo = poweroftwo * 2
}
console.log(res)
///////////////////////////////////////////////////////////////////////
//convert a number to binary;
n = 45;
res = n.toString(2)
console.log(res)
///////////////////////////////////////////////////////////////////////
//Convert a number to binary without using any method...
str = ""; n = 45;
while (n >= 1) {
    let x = n % 2;
    n = parseInt(n / 2)
    str = x + str
}
console.log(str)
/////////////////////////////////////////////////////////////////////////////
//convert a binary to number without using any method
str = "101101"; poweroftwo = 1; res = 0;
for (let i = str.length - 1; i >= 0; i--) {
    if (str.charAt(i) == 1) {
        res = res + poweroftwo
    }
    poweroftwo = poweroftwo * 2
}
console.log(res)
/////////////////////////////////////////////////////////////////////////////////
console.log(5|10)
console.log(5<<2)
console.log(5>>1)
console.log(~-2)
///////////////////////////////////////////////
//To switch on the ith bit
n = 36;
console.log(n.toString(2))
str = 36; let i = 3;
let onMask = 1<<i
res = (str|onMask)
console.log(res.toString(2))
////////////////////////////////////////////////
//To switch off the ith bit;
n = 36; i =5;
console.log(n.toString(2))
let offmask = ~(1<<i)
res = n&offmask
console.log(res)
console.log(res.toString(2))
//////////////////////////////////////////////////////
//Toggling the bit
n = 36; i =1;
console.log(n.toString(2))
let tmask = 1<<i;
res = n^tmask
console.log(res)
console.log(res.toString(2))
//////////////////////////////////////////////
n = 36; i = 2;
console.log(n.toString(2))
let cmask = 1<<i;
if((n&cmask)==0){
    console.log('OFF')
}
else{
    console.log("ON")
}
////////////////////////////////////////
//To find the rightmost set bit
n = 40;
let mask = (n&(n-1))
res = n^mask
pos = Math.log2(res)
console.log(pos+1)
console.log(n.toString(2))
///////////////////////////////////////////
//To find the rightmost set bit;
n = 40;
mask = n&(n-1)
res = n^mask
pos = Math.log2(res)
console.log(pos+1)
/////////////////////////////////////////
//to find the rightmost different bit
n = 9; let m =11;
mask = n^m;
res = mask^(mask-1)
pos = Math.log2(res)
console.log(parseInt(pos+1))
