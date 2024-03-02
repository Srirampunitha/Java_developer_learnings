let alarm = "tue"
switch(alarm)
{
    case "mon":
    console.log("7am")
    break;
    case "tue":
        console.log("8am")
        break;
        default:
        console.log("9am")
}
//////////for loop////////////
let i,j;
for(i=1;i<2;i++)
{
    console.log("*");
    for(j=1;j<2;j++)
    {  
    console.log("***");
    }
}
/////////objects////////////
let aarthi = {
    school1:"ywms",
    school2:"ctk",
    college:"aec",
    job:{
job1:"tcs",
job2:"virtusa",
    },
    add:(num1,num2) => (num1+num2)
}
console.log(aarthi.add(100,100));
for(props in aarthi)
{
    console.log(props, aarthi[props])
}
for(props in aarthi.job)
{
    console.log(props, aarthi.job[props])
}

findPOW= function(n1,n2){
return n1**n2;
}
let Power = console.log(findPOW(9,2))
/////////////////////////////////////////////////////
let student1 = {
    tamil: 90,
english: 90,
maths: 80,
cal: function(st2)
{
if(this.tamil>st2.tamil)
{
    console.log("st1 has high marks")
}
else{console.log("st2 has high marks")}
}
}
let student2 = {
    tamil: 99,
english: 90,
maths: 80,
}
student1.cal(student2)
////////////////constructor//////////////////////////////
let shop = new Diwali("idly","vintagemovie")
function Diwali(eat, watch)
{
this.ate = eat,
this.watch = watch
}
console.log(shop)
/////////array////////////////
let a = [1,2,3,4,5];
a.push(6);
console.log(a);
a.pop()
console.log(a);
a.shift()
console.log(a);
a.splice(1,2)
console.log(a);
a.unshift(5,6)
console.log(a);
let[x,,...z] = a;
console.log(x);
for(let n of a)
{
console.log(n)
}
for(key in a)
{
    console.log(key, a[key])
}
let myName = "my sweet name is aarthi" .split(' ')
let [r,t,...y] = myName;
console.log(y)
