let a =5, b =10;
let c = 3; d = " 20.55";
d = parseFloat(d);
let e = 5, f = -5;
console.log(d);
 //let add = (num1,num2) => num1+num2; // arrow function
function add(num1, num2)
{
    if((num1 && num2)< 0 )
    {
        return "not adding negative numbers"
    }
    else{
        return num1+num2;
    }
}

let result1 = add(a,b);
let result2 = add(c,d);
let result3 = add(e,f)
console.log(result1, result2, result3)
