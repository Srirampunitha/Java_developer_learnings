// object comparing itself with another object
/*let student1 = {
    tamil: 90,
    english: 85,
    maths: 80,
    compare: function(st2)
    {
if(this.tamil>student2.tamil)
{
    return(`student1 has high marks in tamil`)
}
else{return("student2 is high in tamil")}
    }
}
let student2 = {
    tamil: 9,
    english: 90,
    maths: 85,
    compare: function(stl)
    {
        if(this.english>student1.english)
{
    return(`student2 has high marks in english`)
}
else{return("student1 is high in english")}
    }
    }

let result1 = (student1.compare(student2))
let result2 = (student2.compare(student1))
console.log(result1)
console.log(result2)*/
//CONSTRUCTOR

let student1 = new CreateStudent(80, 90)
let student2 = new CreateStudent(85, 80)
function CreateStudent (tamil, english)
{
    this.tamil = tamil;
    this.englis = english
    this.domaths = function(n1,n2)
    {
       return n1*n2;
    }
}
console.log(student1);
console.log(student2);
let result = student2.domaths(10, 10)
console.log(result)