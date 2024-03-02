//swap two numbners without third variable
let a = 5; b = 10;
a = a+b;
b = a-b;
a = a-b;
console.log(`the value of a is ${a} and the value of b is ${b}`)
//swap two numbers with temp variable
let temp;
temp = a;
a = b;
b = temp;
console.log(`the value of a is ${a} and the value of b is ${b}`)
//swap two numbers with arra de-constructing method
 let [c,d] = [55,100];
 [c,d] = [d,c];
console.log(`the value of c is ${c} and the value of d is ${d}`)
//Find odd or even
console.log((d%2===0)?"even":"odd")
//print the numbers in the digit individually
let n = 12345
while(n!=0){
    console.log(n%10)
   n = parseInt(n/10)
}
//reverse the number in the digit
let n1 = 12345; let reverse = 0;
while(n1!=0){
let rem = n1%10
reverse = (reverse*10)+(rem)
n1 = parseInt(n1/10)
}
console.log(reverse)
//add the numbers in the digit;
let n2 = 12345; let sum = 0;
while(n2!=0){
    let rem = n2%10
    sum = sum+rem
    n2 = parseInt(n2/10)
}
console.log(sum)
//Find prime or not
let num = 19; let isprime = true;
isprime = (num==0||num==1)?false:true;
for(let i=2;i<num;i++){
   if(num%i===0){
    isprime = false;
    break;
   }
}
let result = isprime?"prime":"notprime"
console.log(result)
//factorial
let fact = function(n){
if(n==0){
    return 1;
}
else{
    return (n*fact(n-1))
}
}
console.log(fact(1))
//fibonocci series
let fib = [0,1]; let n3 = 9
for(let i=2;i<n3;i++){
fib[i] = fib[i-1] + fib[i-2]
}
console.log(fib)

let f = 0, s= 1, t;
for(i=1;i<=n3;i++){
    console.log(f);
    t = f + s;
    f =s;
    s =t;

}
//fibonocci problem using recursion
let fibb = function(n){
    if(n==1){return 0;}
    else if(n==2){return 1}
    else{return fibb(n-1)+fibb(n-2)}
}
let series = new Array(n3).fill(0)
for(i=1;i<=n3;i++){
    series[i-1] = fibb(i)
}
console.log(series)
///////////////////////////////////////////////////////////////////////
//add numbers in an array using the for Each
let arr = [1,2,3,4,5,10]; let total = 0;
arr.forEach(value => total =value+total )
console.log(total)
//add numbers in an array using map method
arr.map(value=> total = total+value)
console.log(total)
//add numbers in an array using reduce method;
console.log(arr.reduce((a,b)=>(a+b)))
//subtract the numbers in an array using reduce method
console.log(arr.reduce((a,b)=>(a-b)))
// find the array is palindromic or not
let arr1 = [1,2,2,1]; let rev = 0;
let n4 = arr1.join("")
temp = Number(n4);
while(temp!=0){
    let rem = temp%10
rev = rev*10+rem
temp = parseInt(temp/10)
}
let res = (rev===Number(n4))?"palindrome":"not palindrome"
console.log(res)
//////////////////////////////////////////////////////////////////////////
//reverse the array; 
let arrRev = [1,2,3,4,5];
arrRev.reverse()
console.log(arrRev)
///////////////////////////////////////////////////////////////////////////////
//create an array of n numbers using fill() method
let n5 = 20;
let newArr = Array(n5).fill(0).map((value,i)=>i+1)
console.log(newArr)
//////////////////////////////////////////////////////////////////////////
// problem to find the all index of particular value in an array
let arr5 = [1,2,3,5,6,7,5,9,5,5 ] ; let set = new Set()
for(i=0;i<arr5.length;i++){
  set.add(arr5.indexOf(5,i))
}
console.log(Array.from(set))
////////////////////////////////////////////////////////////////////////////////////
//find the middle element in an array
let arr4 = [1,2,3,4,5,7,9]; let len = arr4.length
let midIndex = len%2==0?(len/2)-1:parseInt(len/2);
console.log(arr4[midIndex])
///////////////////////////////////////////////////////////////////////////////////////
//find the fascinating number
let num1 = 192; let number = 123456789;
let num2 = (num1*2+""+num1*3+""+num1).split("").sort((a,b)=>(a-b)).join("")
let res1 = (number==num2)?"fascinating num": "not fascinating num"
console.log(res1)
////////////////////////////////////////////////////////////////////////////////////////////
//compare two people scoring uing constructor
let stu1 = [1,2,3]; stu2 =[2,1,2]
function Marks(stu1, stu2){
    this.m1 = 0
    this.m2 = 0
let total1 = stu1.reduce((a,b)=>(a+b))
let total2 = stu2.reduce((a,b)=>(a+b))
return(total1>total2?this.m1++:this.m2++)
}
let compare = new Marks(stu1,stu2)
console.log(compare)
////////////////////////////////////////////////////////////////////////
//longest name in an array
let names = ["aarthi","ria","sri","punitha","Aarthimurugan"]
let LongestName = names.reduce(maxlen, -Infinity)
function maxlen(accumulator, value, index){
if(accumulator>value.length){
    
    return index
}
else{ return (index)}
}
console.log(LongestName)
// console.log(names[LongestName])
//////////////////////////////////////////////////////////
// to find gcd
let num3 = 15; let num4 = 70; let rem = num3%num4;
while(rem!=0){
    num3 = num4;
    num4 = rem;
    rem = num3%num4
}
console.log(num4)
///////////////////////////////////////////////////////////////////
//happy numbers
//let n7 = 91; let n9 = n7.toString().split(""); console.log(n9)
//let square = n9.reduce((a,b)=>(a**2+b**2))
//console.log(square)
let set1 = new Set()
let happyNum = function(n){
    while(n!=1){
        let sum = 0;
        while(n>0){
            sum = sum+(n%10)**2
            n = parseInt(n/10)  
        }
        if(set1.has(sum)){
            return "unHappy Number"
        }
        set1.add(sum)
        n = sum;
    }
    return "happy number"
}
console.log(happyNum(91))
////////////////////////////////////////////////////////////////////////////////////
//switch case
let food = "kore"
switch(food){
case "korea":
console.log("Kimchi")
break;
case "India":
console.log("Roti")
break;
case "America":
console.log("Burger")
break;
case "India":
console.log("Roti")
break;
default:
    console.log("Eat biryani")
}
//////////////////////////////////////////////////////////////
//nested for loop
for(let i =0;i<5;i++){
    console.log("Hi")
    for(let j = 0;j<5;j++){
        console.log("Aarthi")
    }
}
//////////////////////////////////////////////////////////////////////////////////////
//objects
let aarthi = {
    degree: "B.E",
    job: "engineer",
company:{
    name: "virtusa",
    city: "Chennai",
    dream: "Google"
},
power: (a)=>(a**2)
}
console.log(aarthi.company["dream"])
console.log(aarthi.power(3))
for(let key in aarthi){
    console.log(key, aarthi[key])
}
for(let key in aarthi.company){
    console.log(key, aarthi.company[key]) 
}
let st1 = {
    tamil: 90,
    english: 95,
    maths: 80,
    compare: function (st2){
        let res = (this.tamil>st2.tamil? "st1 tamil is high":"st2 tamil is high")
        return res;
    }
}
let st2 = {
    tamil: 99,
    english: 80,
    maths: 90,
    compare: function (st1){
      let res =   (st1.english>this.english? "st1 english is high":"st2 english is high")
      return res;
    }
}
console.log(st1.compare(st2))
console.log(st2.compare(st1))
////////////////////////////////////////////////////////////
//constructor
let shopping = new Shop("necklace","saree")
let shopping1 = new Shop("earring","saree")

function Shop(N,S){
    this.jewel = N
    this.dress = S
    this.shop = function(){
        console.log("On shopping")
    }
}
console.log(shopping)
console.log(shopping1)
shopping.jewel = "bangle"
console.log(shopping)
shopping.shop() //calling shop fubnction created inside constructor
///////////////////////////////////////////////////////////////////////////////////////////////////////
let array = [0]
console.log(array)
array.push(1)
console.log(array)
array.unshift(2)
console.log(array)
array.pop()
console.log(array)
array.shift()
console.log(array)
/////////////////////////////////////////////////////////////////////////////////////////
//splice method:
let arr2 = [1,2,3,4,5]
arr2.splice(1,1,5)
console.log(arr2)
/////////////////////////////////
//for of loop 
let sum1 = 0;
for(let n of arr2){
    sum1 = sum1+n;
}
console.log(sum1)
sum1 = 0;
for(let key in arr2){
   sum1 = sum1+key
}
console.log(typeof(sum1))
//////////////////////////////////////////////////////////
//split method()
let str = "hello namjoon"; let str1 =["hello","jhope"]
strArr = str.split(" ")
console.log(strArr.reverse())
let newStr = [...strArr,...str1]
console.log(newStr)
//////////////////////////////////////////////////////////
//forEach() method
let nums = [1,2,3,4,5]; let mul; let summ = 0; 
nums.forEach((value,index)=>{
    mul = value*index
    summ = summ+mul
})
console.log(summ)
 let str2 = ['a','a','b','c','b','d','d','a']; let count = {}
 str2.forEach(value=>{
    if(count[value]){
        count[value]++
    }
    else{
        count[value]= 1;
    }
 })
 console.log(count)
///////////////////////////////////////////////////////////
//filter method()
nums = [2,4,5,6,9,5,2]
let evenNum = nums.filter((n,i,arr)=>(n%2==0))
console.log(evenNum)
let noDup = nums.filter((n,i,arr)=>(arr.indexOf(n)==i))
console.log(noDup)
let person = [
    {
        name: "aarthi",
        age: 25
    },
    {
    name: "ria",
        age: 21
    },
    {
        name: "arin",
            age: 7
        }
]
console.log(person.filter(person=> (person.age>=25)))
///////////////////////////////////////////////////////////////////////////////
//map method
nums = [2,5,0,5,9,8]
console.log(nums.map((n,i)=>(n*i)))
let arr6 = Array(5).fill(0).map((value,index)=>index+1)
console.log(arr6)
let shop = [
    {
        item: "laptop",
        price: 1000,
        count: 2
    },
    {
        item: "desktop",
        price:2000,
        count: 3
    }
]
let totalValue = shop.map(item => ({name:  item.item, price: item.price*item.count}))
console.log(totalValue)
///////////////////////////////////////////////////////////////////////////////
//reduce method
nums = [1,2,3,90,4,5,10]
console.log(nums.reduce((a,b)=>(a+b)))
let maxVal = nums.reduce(max, -Infinity)
function max(accumulator,value){
if(accumulator>value){
    return accumulator;
}
else if(value>accumulator){
    return value;
}
}
console.log(maxVal)
//////////////////////////////////////////////////////////
//slice method
nums = [1,2,3,4,5]
let slice = nums.slice(1,4)
console.log(slice)
//////////////////////////////////////////
//sort method
nums.sort((a,b)=>b-a)
nums = (nums.concat(7,7,3,2))
console.log(nums)
//////////////////////////////////////////////
let set2 = new Set()
for(i=0;i<nums.length;i++){
let idx = nums.indexOf(7,i)
if(idx>=0){
set2.add(idx)
}
}
console.log(Array.from(set2))
//////////////////////////////////////////////////////
//every method()
str = ["a","a","a",9]
console.log(str.every(value=> value == "a"))
arr = [[1,2],[2,3],[3,4]]
console.log(arr.every(value=> Array.isArray(value)))
console.log(arr.flat())
///////////////////////////////////////////////////////////////
console.log(str.some(value=> value=="b"))
let age = [18,21,23,16]
console.log(age.some((value)=>value<18))
//////////////////////////////////////////////////////////
//find method
console.log(age.find((value)=>value>20))
console.log(age.findIndex((value)=>value>20))
console.log(Array.isArray(age))
