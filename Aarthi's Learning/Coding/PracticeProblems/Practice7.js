let count = {
    a : 4,
    b : 9,
    c: 7,
    d: 9
}
let arr; let max = count.a;
for(let value in count){
    if(count[value]>max){
        max = count[value]
    }
    
}
console.log(max) 

