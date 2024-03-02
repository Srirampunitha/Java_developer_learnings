let values = new Array();
values.push(5,7,8,9,10);

let result = values[0] + values[4]
console.log(result)

let data = [5,"aarthi",{job:"IT"}]
data.push(function(){console.log(`hi ${data[1]}`)});
console.log(data);
data[3]();

let num = [5,6,7,8,9]
num.push(10);
console.log(num);
num.pop();
console.log(num);
num.shift();
console.log(num);
num.unshift(4)
console.log(num);
num.splice(3,2, 8,9)
console.log(num);

let number = [5,10,2,3];

for(let n of number)
{
    console.log(n);
}
for(key in number)
{
    
    console.log(key, number[key])
}
let [a,b,c,d] = number;
console.log(c);
let user = "my name is aarthi" .split(' ');
let[x,,...y] = user;
console.log(y);

///////For Each///////////////
let r = [1,2,3,4,5,6]; let target = 3;
// let res= r.filter(n => (n%2===0))
// // .map(n=> n*2)
// // .reduce((a,b)=>a+b)
let res = r.forEach((n,i) => {
    console.log(n,i)
})
console.log(res);
////SET/////////
let nums = new Set();
nums.add(5)
nums.add(5);
nums.add(3);
nums.add("aarthi")
console.log(nums)
for(n1 of nums)
{
    console.log("n1 is" + n1)
}
nums.forEach(value => console.log(value))
console.log(nums.has("aarthii"))

///////////MAPS//////////////////
let map = new Map()
map.set("aarthi", "IT")
map.set("namjoon", 'bts')
console.log(map)
console.log(map.has("aarthi"))
for([k,v] of map)
{
    console.log("ket and value is", [k,v])
}
map.forEach((v,k)=> console.log(k,v))

/////////////RECURSION///////////////
// let n = 1
// function show()
// {
//     console.log("hi", n)
//     n++;
//     show()
// }
// show()
///////FACTORIAL////////
let numm = 5;
function fact(numm)
{
    if (numm == 0)
    return 1;
else {
return numm*fact(numm-1)
}
}
let res1 = fact(numm)
console.log(res1);

///////////Fibonnacci//////////
let fibNum = 5;
res = fib()
console.log(res);
function fib(n){
    a = 1;
    b = 0;
    console.log(a);
    console.log(b);
    for (let i = 1; i<=n;i++)
    {
        if(i>2)
        {
        c = a + b;
        b = a;
        a = c;
        return (console.log(c))
        }
        if(i===1)
        {
            return b;
        }
        if(i==2)
        {
            return a;
        }
    }
}