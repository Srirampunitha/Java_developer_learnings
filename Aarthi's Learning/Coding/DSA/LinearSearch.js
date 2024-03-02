//Regular linear search
let arr = [5,6,2,9,3,5,7]; let target = 3
  for(let i=0;i<arr.length;i++){
    console.log(i)
    if(arr[i]==target){
        console.log("the target found at" + i)
        break;
    }
  }