//Revison 24/12/2023

//swap two numbers without using temp variable
let a = 5; let b = 10;
a = a + b;
b = a - b;
a = a - b;
console.log(`The value of a is ${a} and b is ${b}`)
///////////////////////////////////////////////////////////////////
//swap two numbers using array de-constructing method
let c = 50; let d = 100;
[c, d] = [d, c]
console.log(`The value of c is ${c} and d is ${d}`)
/////////////////////////////////////////////////////////////////////
//To find odd or even
let res = (a % 2 == 0) ? "even" : "odd"
console.log(res)
////////////////////////////////////////////////////////////////////////
// To print the number in reverse order
let n = 12345; let rev = 0;
while (n > 0) {
    let rem = n % 10;
    rev = rev * 10 + rem
    n = parseInt(n / 10)
}
console.log(rev)
//////////////////////////////////////////////////////////////////////////
//To add the numbers in the digit
n = 12345; let sum = 0;
while (n > 0) {
    let rem = n % 10
    sum = sum + rem;
    n = parseInt(n / 10)
}
console.log(sum)
//////////////////////////////////////////////////////////////////////////////////
//prime number or not;
n = 0;
let isPrime = true;
for (let i = 2; i <= Math.sqrt(n); i++) {
    if (n % i == 0) {
        isPrime = false;
        break;
    }
}
if (isPrime && n >= 2) {
    console.log("prime number")
}
else {
    console.log("Not a prime number")
}
/////////////////////////////////////////////////////////////////////////////////////////
//Factorial
n = 5;
function fact(n) {
    if (n == 0) {
        return 1;
    }
    let res = n * fact(n - 1)
    return res;

}
console.log(fact(n))
//////////////////////////////////////////////////////////////////////////////////////////////
//Fibonocci series
let f = 0, s = 1, t; n = 10
for (let i = 0; i <= n; i++) {
    console.log(f)
    t = f + s;
    f = s;
    s = t;
}
/////////////////////////////////////////////////////////////////////////////////////////////////////
//Fibonocci series using array concept
let fib = [0, 1]
for (let i = 2; i <= n; i++) {
    fib[i] = fib[i - 1] + fib[i - 2]
}
console.log(fib)
////////////////////////////////////////////////////////////////////////////////////////////
// add  numbers in an array using forEach,map and reduce methods
let arr = [1, 2, 3, 4, 5]; sum = 0
arr.forEach(value => sum = sum + value)
console.log(sum)
///////////////////////////////////
sum = 0;
arr.map(value => sum = sum + value)
console.log(sum)
////////////////////////////////////////
sum = arr.reduce((a, b) => (a + b))
console.log(sum)
/////////////////////////////////////////////
//Find the array is palindromic or not
arr = [111, 121, 131, 525]; let isPalindrome;
let len = arr.length
for (let i = 0; i < len; i++) {
    let temp = arr[i]
    res = temp.toString().split("").reverse().join("")
    if (arr[i] == res) {
        isPalindrome = true
    }
    else {
        isPalindrome = false
        break;
    }
}
if (isPalindrome) {
    console.log("palindromic array")
}
else {
    console.log("Not palindromic array")
}
///////////////////////////////////////////////////////////////////////////////////////////
//reverse a string
let str = "aarthi"
console.log(str.split("").reverse().join(""))
//////////////////////////////////////////////////////////////////////////////////
//Reverse a array without using builtin method
arr = [111, 121, 131, 525, 666, 721]
len = arr.length - 1
for (let i = 0; i < len / 2; i++) {
    arr[i] = arr[i] + arr[len - i]
    arr[len - i] = arr[i] - arr[len - i]
    arr[i] = arr[i] - arr[len - i]
    console.log(arr)
}
console.log(arr)
/////////////////////////////////////////////////////////////////////
//reverse a string without using builtin method
str = "aarthi"; rev = ""
for (let i = str.length - 1; i >= 0; i--) {
    rev = rev + str[i]
}
console.log(rev)
////////////////////////////////////////////////////////////////////
//create an array with n numbers using fill method;
n = 10
arr = Array(n).fill(0).map((value, index) => (value + index + 1))
console.log(arr)
///////////////////////////////////////////////////////////////
//create an array of n numbers without using any builtin method
arr = []
for (let i = 1; i <= n; i++) {
    arr.push(i)
}
console.log(arr)
///////////////////////////////////////////////////////////////////////
//find all index of given number in an array
n = 5; arr = [1, 2, 5, 6, 7, 5, 9, 5]
for (let i = 0; i < arr.length; i++) {
    if (arr[i] == n) {
        console.log(i)
    }
}
/////////////////////////////////////////////
//find the middle element in the array
arr = [1, 2, 5, 7, 5, 9, 5]; len = arr.length
let mid = (len % 2 == 0) ? (len / 2) - 1 : parseInt(len / 2)
console.log("mid element is" + " " + arr[mid])
/////////////////////////////////////////////////////
//Fascinating Number
n = 192; res = ""; let num = 123456789
res = res + (n * 2) + (n * 3) + (n)
arr = res.toString().split("").sort((a, b) => (a - b)).join("")
console.log(arr)
if (arr == num) {
    console.log("fascinating num")
}
else {
    console.log("Not a fascinating number")
}
/////////////////////////////////////////////////////////////
//compare two people score using constructor
//The below solution is not correct
//check this problem in geeks for geeks and correct this
a = [1, 2, 3]; b = [2, 1, 2]
let score = function Score(a, b) {
    this.s1 = 0
    this.s2 = 0
}
for (let i = 0; i < a.length; i++) {
    if (a[i] > b[i]) {
        this.s1++
    }
    else {
        this.s2++
    }
}
console.log(score(a, b))
//////////////////////////////////////////////////////
//Display the longest name in an array
let name = ["aarthi", "punithaa", "sriram", "AarthiPunitha"]
let maxValue = name.reduce((maxx, value) => {
    if (maxx.length > value.length) {
        return maxx
    }
    else {
        return value
    }
}, -Infinity)
console.log(maxValue)
///////////////////////////////////////////////////////////////////
//Finf GCD of two numbers
a = 15; b = 70;
let rem = a % b
while (rem > 0) {
    a = b;
    b = rem;
    rem = a % b
}
console.log(b)
//////////////////////////////////////////////////////////////////////
//convert the first letter in a string to upperCase
str = "i love programming"
arr = str.split(" ")
for (let i = 0; i < arr.length; i++) {
    arr[i] = arr[i].charAt(0).toUpperCase() + arr[i].substring(1)
}
console.log(arr)
//////////////////////////////////////////////////////////////////////
//convert number to binary
n = 5;
let bin = n.toString(2)
console.log(bin)
//////////////////////////////////////////////////////////////////
//happy number 
n = 91; let set = new Set()
function happyNum(n) {
    while (n != 1) {
        let sum = 0;
        while (n != 0) {
            let rem = n % 10
            sum = sum + (rem ** 2)
            n = parseInt(n / 10)
        }
        if (set.has(sum)) {
            return ('not happy number')
        }
        set.add(sum)
        n = sum
    }
    return ("happy number")
}
console.log(happyNum(n))
/////////////////////////////////////////////////////
//switch case:
let food = "burger"
switch (food) {
    case "biriyani":
        console.log("India")
        break;
    case "Kimchi":
        console.log("korea")
        break;
    case "noodles":
        console.log("china")
        break;
    default:
        console.log("America")
}
//////////////////////////////////////////////////////////////
//Two sum problem leetcode
//description: return the indexes of two numbers in an array which can add to make a target
arr = [1, 2, 4, 5]; let target = 7;
for (let i = 0; i < arr.length; i++) {
    for (let j = i + 1; j < arr.length; j++) {
        if ((arr[i] + arr[j]) == target) {
            arr = [i, j]
            break;
        }
    }
}
console.log(arr)
/////////////////////////////////////////////////////////////////////////////////////////////
//objects
let aarthi = {
    qualification: "B.E",
    age: 25,
    job: {
        tech: "AWS",
        exp: 4
    },
    add: (a, b) => (a + b)
};
console.log(aarthi.add(1, 2))

for (let key in aarthi.job) {
    console.log(key, aarthi.job[key])
}
////////////////////////////////////////////////////////
//arrrow function
a = 5; b = 10;
sum = (a, b) => (a + b)
console.log(sum(a, b))
////////////////////////////////////////////////////////
let st1 = {
    tamil: 97,
    english: 98,
    maths: 91,
    compare: function (st2) {
        if (this.tamil > st2.tamil) {
            console.log("st1 tamil score is high")
        }
        else {
            console.log("st2 tamil score is high")
        }
    }

}
let st2 = {
    tamil: 99,
    english: 97,
    maths: 98
}
console.log(st1.compare(st2))
//////////////////////////////////////////////////////////////////
//constructor
st1 = new Build(97, 91)
st2 = new Build(99, 80)
st3 = new Build(90, 95)

function Build(a, b) {
    this.tamil = a,
        this.english = b
}
st1.tamil = 99
console.log(st1)
//////////////////////////////////////////////////////////////////////
//splice the array
arr = [1, 2, 3, 4, 5]
arr.splice(1, 2)
console.log(arr)
//////////////////////////////////////////////////////////////////
//slice method
arr = [1, 2, 3, 4, 5]
let slice = arr.slice(2, 4)
console.log(slice)
//////////////////////////////////////////////////////////////////////////
//for of loop
arr = [1, 2, 3, 4, 5]
for (let num of arr) {
    console.log(num)
}
for (let key in arr) {
    console.log(key)
}
////////////////////////////////////////////////////////////////////////////
//split method
str = "aarthi sriram"
arr = str.split(" ")
console.log(str)
console.log(arr)
//////////////////////////////////////////////////////////////////////////////
//spread operator
arr = [1, 2, 3]; let arr1 = [3, 2, 5]
arr = [...arr, ...arr1]
console.log(arr)
////////////////////////////////////////////////////////
//for each method
arr = [2, 5, 0, 5, 9, 8]
arr.forEach((value, index) => {
    console.log(value + index)
})
//count the number of occurences of particular item in an array
arr = ["a", "b", "a", "c", "c", "d"]; let count = {}
arr.forEach(value => {
    if (count[value]) {
        count[value]++
    }
    else {
        count[value] = 1;
    }
})
console.log(count)
//////////////////////////////////////////////////////////////
//find the element which occured for maximum time in an array
//map method
arr = [1, 2, 3, 5, 7, 7, 3, 7];
res = arr.map((value, index) => (value + index))
console.log(res)
let shop = [
    {
        item: "laptop",
        price: 3000,
        count: 3
    },
    {
        item: "Ipad",
        price: 2000,
        count: 2
    },
    {
        item: "Iphone",
        price: 1500,
        count: 5
    }
]
let TotalValue = shop.map(product => ({ name: product.item, price: product.price * product.count }))
console.log(TotalValue)
//convert numbers in string format of an array to number format using map method
str = ["1", "2", "3"]
str = str.map(Number)
console.log(str)
///////////////////////////////////////////////////////////////////////////////////////////////////
//Reduce method
arr = [1, 2, 3, 4, 5, 6, 7]
res = arr.reduce((a, b) => (a + b))
console.log(res)
//find the max value in the arr
res = arr.reduce((a, b) => (a > b) ? a : b)
console.log(res)
//Find the total value of items in the shop
shop = [
    {
        item: "laptop",
        price: 3000,
        count: 3
    },
    {
        item: "Ipad",
        price: 2000,
        count: 2
    },
    {
        item: "Iphone",
        price: 1500,
        count: 5
    }
]
let Totalvalue = shop.reduce((total, product) => total + (product.price) * (product.count), 0)
console.log(Totalvalue)
///////////////////////////////////////////////////////////////////////////////////////////////////
//sort method
arr = [7, 3, 1, 9, 2]
arr.sort((a, b) => (a - b))
console.log(arr)
/////////////////////////////////////////////////////////////////////////
//concat method
arr1 = [2, 5, 5]
arr = arr.concat(arr1)
console.log(arr)
//////////////////////////////////////////////////////
//fill method
n = 5;
arr = Array(n).fill(0).map((n, i) => ((n + i) + 1))
arr.fill(5, 1, 3)
console.log(arr)
/////////////////////////////////////////////////////
//includes method
console.log(arr.includes(5))
///////////////////////////////////////////////////
//join method
let countries = ["India", "America", "korea"]
console.log(countries.join("-"))
///////////////////////////////////////////////////
//Reverse method
console.log(countries.reverse())
////////////////////////////////////////////////////
//indexOf and lastIndex of method
food = ["cake", "chocolate", "cake", "biriyani", "chocolate"]
console.log(food.indexOf("biriyani"))
food[3] = "blackForest"
console.log(food)
console.log(food.lastIndexOf("cake"))
/////////////////////////////////////////////////////////
//every method
food = ["cake", "cake"]
res = food.every(value => (value == "cake"))
console.log(res)

let age = [18, 19, 20, 21, 25, 12]
res = age.every(age => age >= 18)
console.log(res)

let ans = [
    {
        name: "aarthi",
        answer: "Yes"
    },
    {
        name: "Ria",
        answer: "Yes"
    }
]
res = ans.every(ans => ans.answer == ("Yes"))
console.log(res)

arr = [[1, 2], [3, 4], [5, 6], {}]
res = arr.every(arr => Array.isArray(arr))
console.log(res)
/////////////////////////////////////////////////////////////////////////////
//some method
age = [15, 18, 19, 25, 21]
res = age.some(age => age < 18)
console.log(res)
////////////////////////////////////////////////////////////////////
//find method and findIndex method
res = age.find(age => age == 25)
console.log(age.indexOf(res))

res = age.findIndex(age => age > 18)
console.log(res)
////////////////////////////////////////////////////////////////////////
//from method
str = "abcdef"
arr = Array.from(str)
console.log(arr)
///////////////////////////////////////////////
//isArray method
console.log(Array.isArray(arr))
//////////////////////////////////////////////
//flat method
arr = [[1, 2], [[2, 3], [4, 3]]]
res = arr.flat(Infinity)
console.log(res)
/////////////////////////////////////////////
arr = [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]
set = new Set(arr)
arr = Array.from(set)
console.log(arr)
/////////////////////////////////////////////////////////
//String methods
//charAt method
arr = ["aarthi", "sriram", "punitha"]
console.log(arr[0].charAt(5))
for (let i = 0; i < arr.length; i++) {
    arr[i] = arr[i].charAt(0).toUpperCase() + arr[i].substring(1)
}
console.log(arr)
///////////////////////////////////////////////////////////////
//indexof and lastindexof methods
str = "aarthi"
console.log(str.indexOf("a"))
console.log(str.lastIndexOf("a"))
//////////////////////////////////////////////////////////////
//slice and substring method
str = "aarthi"
console.log(str.slice(-3, -1))
console.log(str.substring(0, 3)) // last index number not inclusive in both slice and substring methods
////////////////////////////////////////////////////////////////////////////////////
//split method
console.log(str.split("", 3))
/////////////////////////////////////////////////////////////
//includes method
res = str.includes("aar")
console.log(res)
//////////////////////////////////////////////////////////
//starts with and ends with method
str = "I love baking cakes"
console.log(str.startsWith("love", 2))
console.log(str.endsWith("cakes"))
//////////////////////////////////////////////////
//concat method
let str1 = "and eating cakes"
res = str.concat(" " + str1)
console.log(res)
//////////////////////////////////////
//repeat method
str = "aarthi"
res = str.repeat(3)
console.log(res)
////////////////////////////////////////
//trim, trimstart and trim end methods
str = " Hello World "
console.log(str.trim())
console.log(str.trimStart())
console.log(str.trimEnd())
//////////////////////////////////////////////
//pad start and pad end method
str = "aarthi"
res = str.padStart(10, "A")
console.log(res)
res = str.padEnd(15, "A")
console.log(res)
/////////////////////////////////////////////////////
//localeCompare method
str = "aarthi"; str1 = "aarthi"
res = str.localeCompare(str1)
console.log(res)
////////////////////////////////////////////////////
//search method
str = "It is raining outside"
res = str.search(/Rain/i)
console.log(res)
//////////////////////////////////////////////////
//match and match All method
str = "Mr.Blue has blue house and blue car"
res = str.match(/blue/gi)
console.log([...res])
////////////////////////////////////////////
//replace and replaceAll methods
res = str.replace(/blue/g, "red")
console.log(res)
//////////////////////////////////////////////////////
//charCodeAT
str = "aarthi"
res = str.charCodeAt(5)
console.log(res)
//////////////////////////////////
//fromcodepointAt method
res = String.fromCharCode(105)
console.log(res.toUpperCase())
//////////////////////////////////////////////////////////
//DSA
//Linear Search
arr = [1, 2, 5, 7, 9, 3]; target = 9
for (let i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        console.log(i)
        break;
    }
} //time complexity is O(n)
// Binary search
arr = [1, 2, 5, 7, 9, 3]; target = 3
arr.sort((a, b) => (a - b))
let left = 0; let right = arr.length;
while (left <= right) {
    let mid = parseInt(left + right) / 2
    if (arr[mid] == target) {
        console.log(mid)
        break;
    }
    if (arr[mid] > target) {
        right = mid - 1;
    }
    else {
        left = mid + 1
    }
} //time complexity O(log n)
////////////////////////////////////////////////////////////////////////////
//Bubble sort
arr = [5, 3, 9, 2, 7, 1]; let temp;
for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
            temp = arr[j];
            arr[j] = arr[j + 1]
            arr[j + 1] = temp;
        }
    }
}
console.log(arr) //time complexity O(n^2) //space complexity O(1)
///////////////////////////////////////////////////////////////////////////////
//Selection sort
arr = [15, 3, 9, 2, 7, 1]; temp;
for(let i =0;i<arr.length-1;i++){
    let minIdx = i;
    for(let j = i+1;j<arr.length;j++){
        if(arr[minIdx]>arr[j]){
            minIdx = j;
        }
    }
    temp = arr[minIdx]
    arr[minIdx] = arr[i]
    arr[i] = temp
}
console.log(arr)
//////////////////////////////////////////////////////////////////////////
//Insertion sort
arr = [15, 3, 9, 12, 7, 10]; let key;
for(let i =1;i<arr.length;i++){
    key = arr[i]
    j = i-1
    while(arr[j]>key&&j>=0){
        arr[j+1] = arr[j]
        j = j-1
    }
    arr[j+1] = key
}
console.log(arr)
////////////////////////////////////////////////////////////////////////////
//Quick sort
arr = [50, 3, 90, 12, 7, 10]; 
function quicksort(arr){
    if(arr.length<2){
        return arr
    }
    let left = []; let right = []; let pivot = arr[arr.length-1]
    for(let i =0;i<arr.length-1;i++){
        if(arr[i]<=pivot){
            left.push(arr[i])
        }
        else{
            right.push(arr[i])
        }
    }
    return([...quicksort(left),pivot,...quicksort(right)])
}
console.log(quicksort(arr))
/////////////////////////////////////////////////////////////////////////////////////////
//Merge sort
arr = [-5, 2, 9, 1, 3, 10]
function mergesort(arr){
    if(arr.length<2){
        return arr;
    }
    let mid  = parseInt(arr.length)/2
    let leftarr = arr.slice(0,mid)
    let rightarr = arr.slice(mid)
    return(merge(mergesort(leftarr),mergesort(rightarr)))
}
function merge(leftarr,rightarr){
    let Sortedarr=[]
    while(leftarr.length&&rightarr.length){
        if(leftarr[0]<=rightarr[0]){
            Sortedarr.push(leftarr.shift())
        }
        else{
            Sortedarr.push(rightarr.shift())
        }
    }
    return[...Sortedarr,...leftarr,...rightarr]
}
console.log(mergesort(arr))