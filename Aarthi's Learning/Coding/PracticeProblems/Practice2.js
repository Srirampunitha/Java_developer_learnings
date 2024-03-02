let arr = [111,222,253,444,555];let rev=0; let arr1 = []
arr.forEach((value,index)=>{
    let num = arr[index]; let temp = num;
    //console.log(num)
    while(num!=0){
        let rem = num%10;
        rev = rev*10+(rem)
        num = parseInt(num/10)
    }
   arr1.push(rev)
   rev=0;
})
console.log(arr1)
if(JSON.stringify(arr)==JSON.stringify(arr1)){
    console.log(1)
}
else{console.log(0)}

///////////////To reverse array elements///////////////////////
let array = [121,252,323] ; let revArr;
let strArr2 = JSON.stringify(array); 
let strArr = String(array)
//console.log(strArr); console.log(array); 
console.log(strArr)
revArr = [...strArr].reverse().join("")
console.log(revArr)
/////////////////////////////////////////////////
 //concat two array
 let a = [1,2,3,4]; let b = [5,6,7]; let c = [8,9,10];
 let d = a.concat(b,c);
 console.log(d);
 /////////////////////////////////////////////////////
 let arr5 = []; let k = 5;
arr5.push(10)
arr5.push(1,2)
console.log(arr5)
let slice = arr5.slice(arr5[arr5.length-1])
console.log(slice)
console.log("arr5 is" +arr5)
console.log(parseInt(2.5));
let arr6 = [1,2,3,4,5]
let splice = arr6.splice(-1)
console.log("splice is" +splice)
console.log("arr6 is" + arr6)
////////////////////////////////////////////////////////////
let str = "abcabc" ; let j = 2; let M = 2; 
let arrStr = str.split("");  let i = 0; ;
console.log(arrStr)
for(let n of arrStr){
    let swap1 = arrStr.splice(-j).join("")
   arrStr.unshift(swap1)
   if(arrStr.join("")==str){
    i++;
    break;
   }
   else{
    i++;
   }
   console.log(arrStr)
    let swap2 = arrStr.splice(-M).join("")
    arrStr.unshift(swap2)
    if(arrStr.join("")==str){
        i++;
        break;
       }
       else{
        i++;
       }
}
console.log(arrStr.join(""))
console.log(i)