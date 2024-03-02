// let a = [0, 3, 2, 5]; let b = []
// //console.log(a.indexOf(2))
// for (let n of a) {
//     if (n === (a.indexOf(n))) {
//         b.push(n)
//     }

// }
// console.log(b.length)
// // let res = a.filter((n,i)=>(n===i))
// // console.log(res.length);
// let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 3, 4, 2, 7]; let array = []; let n = 14; let s = " "
// // for(let k of arr){
// //     if(arr.indexOf(k)%2==0)
// //     array.push(k)
// // }
// // console.log(array)
// //console.log(arr.filter((a,i)=>(i%2==0)))
// for (let i = 0; i < n; i + 2) {

//     s = s + " " + arr[i];

// }
// console.log(s)

let nums = [1,2,3,4]
// for(let n of nums){
//     console.log(n)
// }
// for(let props in nums){
//     console.log(props,nums[props])
// }
// nums.forEach((n,i)=>console.log(i,n))
// let num2 = nums.slice(1,3)
// console.log(num2)
let sum = 0;
let add = nums.map(addnums)
function addnums(n,i,arr){
sum = sum+n;
}
console.log(sum);

//set
let a = [1,1,2,2,3,3,4,5]
let b = new Set (a)
console.log(b)
//To find GCD OF TWO NUMBERS 
let A = 15 ; let B = 70;
let rem = A%B;
while(rem!=0){
    A = B;
    console.log("rem"+rem) // rem = 15; a = 70 , b = 15(rem); rem = 10; a = 15; b = 10; rem =5; a =10; b =5;rem =0
    console.log("a" +A)//15 = 1,3,5,15. 70=> 1,2,5,7,10 common divisor here is 5;
    B = rem;
    console.log("b"+B)
   
    rem = A%B
    
}
console.log("GCD"+B)