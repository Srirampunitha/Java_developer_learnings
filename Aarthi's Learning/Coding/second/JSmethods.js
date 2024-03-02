//ForEach
let nums = [1, 2, 3, 4, 5]; let letters = ['a', 'a', 'a', 'b', 'c', 'd', 'a', 'b', 'c']; let sum = 0;
let count = {};
nums.forEach(addnums);
function addnums(n, i, arr) {
    //console.log(`a[${i}]=${n}`);
    sum = sum + n;
}
console.log(sum)
/////
letters.forEach((n, i) => {
    if (count[n]) {
        count[n]++
    }
    else {
        count[n] = 1;
    }
})
console.log(count);
/////////////////////////
//slice method
nums.forEach((n, i) => console.log(i, n))
let num2 = nums.slice(1, 3)
console.log(num2)
////////////////////////////
//map method
let number = [1, 2, 3, 4, 5]
let number1 = number.map((n, i) => (n * i))
console.log(number1);
let product = [{
    name: "laptop",
    price: "1000",
    countt: "2"
},
{
    name: "desktop",
    price: "1500",
    countt: "3"
}]
let TotalValue = product.map((item) => ({ name: item.name, price: item.price * item.countt }))
console.log(TotalValue)

let str = ['1', '2', '3']
let strToNum = str.map(Number) //Number constructor will return number of any kind//can change numbers in string format to numbers
console.log(strToNum)
/////////////////////////////////////////
//Filter method
let numss = [1, 2, 3, 3, 4, 5, 6, 6, 5, 3, 9,]
let numss2 = numss.filter((n) => (n % 2 == 0))
console.log(numss2)
let numss3 = numss.filter((n, i, arr) => (arr.indexOf(n) === i))
console.log(numss3)
let person = [{
    name: "aarthi",
    age: "25"
},
{
    name: "sri",
    age: "23"
},
{
    name: "ria",
    age: "15"
}
]
console.log(person.filter((person) => (person.age >= 18)))
/////////////////////////////////////////////
// sort method
let names = ["sri", "punitha", "aarthi", "murugan"]
console.log(names.sort())
let num = [10, 5, 9, 70]
num.sort((a, b) => (a - b))
console.log(num)
console.log(num[0]) // to find lowest value in an array
console.log(num[num.length - 1]) // to find highest value in an array
let productt = [{ name: "laptop", price: "5000" }, { name: "desktop", price: "1000" }]
productt.sort((item1, item2) => (item1.price - item2.price))
console.log(productt)
////////////////////////////////////////////////////////////////////
//Fill method
let numbers = [1, 2, 3, 4, 5]
numbers.fill(7, 1, 4)
console.log(numbers);
let fillNumber = function (n) {
    return Array(n).fill(0).map((n, i) => (i + 1))
}
console.log(fillNumber(3))
////////////////////////////////////////////////////////////////////
//Includes method
let name = ["namjoon", "taehyung", "jimin"]
console.log(name.includes("namjoon"))
///////////////////////////////////////////////////////////////////
//join method
let countries = ["India", "US", "Canada"]
console.log(countries.join(" "))
///////////////////////////////////////////////////////////////////////
//reverse method.
//console.log(countries.reverse())
let revCountries = [...countries].reverse(countries) //using spread operator to copy existing array in an new array
console.log(countries)
console.log(revCountries)
//reverse string
let str1 = "hello jhope"
console.log(str1.split(" ").reverse().join(" "))
/////////////////////////////////////////////////////////////////////////////////////
//indexOf and lastIndexOf methods
let bts = ["namjoon", "jhope", "jimin", "jhope", "tae"]
console.log(bts.indexOf("jhope")); console.log(bts.lastIndexOf("jhope"));
let idx = bts.indexOf("jhope");
bts[idx] = "jin"
console.log(bts);
// problem to find the index of value 5
let nums1 = [1, 2, 3, 5, 4, 5, 7, 5, 9, 5]; let newarr = [];
newarr.push(nums1.indexOf(5), nums1.lastIndexOf(5))
newarr.push(nums1.indexOf(5, 4), nums1.lastIndexOf(5, 8))
console.log(newarr)
///////////////////////////////////////////////////////////////////
//every method
let age = [25, 29, 18, 23]
console.log(age.every(value => (value >= 18)))

let answers = [
    {
        name: "aarthi",
        answer: "YES"
    },
    {
        name: "ria",
        answer: "YES"
    },
    {
        name: "suga",
        answer: "No"
    },
]
//answers.forEach((n,i)=>console.log(i))
let res = answers.every((ans)=>(ans.answer=="YES")) //checking all the answers is yes
console.log(res)

let arr = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
console.log(arr.every(value => Array.isArray(value)))
// let res1 = answers.every((ans,i)=>{ // checking all the answers are same?
//     if(i==0){return true;}
//     else{
//         //console.log(ans[i-1].answer)
//         return(ans.answer==ans[i-1].answer)
//     }
// }) 
// console.log(res1)
///////////////////////////////////////////////////////////////////////////////////////////
//Some() method;
let ages = [25,23,18,16]
let result = ages.some(value => (value<16))
console.log(result)

let personAge = [
    {
        name: "aarthi",
        age: 25
    },
    {
        name: "ria",
        age: 21
    },
    {
        name: "RM",
        age: 29
    }
]
let check = personAge.some(value => value.age<22)
console.log(check)
///////////////////////////////////////////////////////////////////////////////////////////////
//find method()
let age1 = [23,16,2,5,16]
let find = age1.find(value => value===16)
console.log(age1.indexOf(find))

let Mark = [
    {
        name: "aarthi",
        score: 99
    },
    {
        name: "ria",
        score: 90
    },
    {
        name: "RM",
        score: 80
    }
]
let findHighest = Mark.find(value => value.score>90)
console.log(findHighest.name)
////////////////////////////////////////////////////////////////////
//findIndex() method
let numm = [1,3,4,6,9]
let findIndex = numm.findIndex(value=>value>5)
console.log(findIndex)
////////////////////////////////////////////////////////////////////////
//from() method
let string = "1234567"
let strArr = Array.from(string, Number)
console.log(strArr);
let numberss = [1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9]
let NoDup = Array.from(new Set(numberss));
console.log(NoDup)
//////////////////////////////////////////////////////
//Array.isArray method;
console.log(Array.isArray(string))
console.log(Array.isArray(numberss))
///////////////////////////////////////////////////////////
//flat() method
let arr1 = [[1,2],[3,[4,5,[6,7],[8,9],],],]
let flat = arr1.flat(Infinity)
console.log(flat)
///////////////////////////////////////////////////////////////////////
//reduce() method
let numbers2 = [10,2,3,4,5]
let total = numbers2.reduce((total,value)=>(total+value),5)
console.log(total)

let subtract = numbers2.reduce((sub,value)=>sub-value)
console.log(subtract)

//find max value using reduce method
let max = numbers2.reduce((max,value)=>{
    if(max>value){return max}
    else{return value}
},-Infinity)
console.log(max)

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
let totalValue = store.reduce((total,item)=>(total+(item.cost*item.count)),0)
console.log(totalValue)