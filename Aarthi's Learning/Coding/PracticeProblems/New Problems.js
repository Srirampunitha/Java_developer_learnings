//reverse an array for k numbers
let arr= [1,2,3,4,5]; k = 3; n = 5;
let res = []
while(n>0){
    let slice = arr.splice(0,k).reverse()
   res = res.concat(slice)
   console.log(res)
   n = n-3
    }
    console.log(res)
    /////////////////////////////////////////
    //reverse an array without builtin method
    arr = [5,4,3,2,1]; let len = arr.length; let temp;
    for(let i =0;i<len;i++){
       len = len -1

        arr[len] = temp;
        arr[len] = arr[len];
        arr[i] = temp
        console.log(arr)
    }
   
//Move all the zeros to the end
arr = [0, 0, 0, 3, 1, 4]; n = 6; let zeros = []

for (let i = 0; i < n; i++) {
  if (arr[i] == 0) {
    zeros.push(arr[i])
    arr.splice(i,1)
    i = i-1 
    
  }
}
console.log(arr)
console.log(zeros)
console.log(...arr,...zeros)
