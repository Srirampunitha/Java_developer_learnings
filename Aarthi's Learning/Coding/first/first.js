let a = 2;
let b= 9;
let c = 10;
// finding cube and squares of a number
let aCube = a**3;
let bCube = Math.pow(b,3);
console.log(aCube, bCube);
// operations on string
let Firstname = "aarthi"
let lastname = "m"
let fullname = Firstname + " " + lastname;
console.log(fullname);
console.log('aar\tthi \nmurugan');
//logical operator usage
let data = b>a || b>bCube;
let data2 = !data;
console.log(data, data2);
//if block
if(a>b && a>c)
{
    console.log("a is greatest");
}
else if (b>c)
{console.log("b is greatest")}
else{console.log("c is greatest")}
