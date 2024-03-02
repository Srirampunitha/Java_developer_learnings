let arr = ["a","b","b","c","d","b","c"]
//let arr = [1,2,3,3,3,2,2,2,2,3,1]; 
let count = 0; let max = 0; let index;
for(let i =0;i<arr.length;i++){
    for(let j =0;j<arr.length;j++){
        if(arr[i]===arr[j]){
            count++
        } 
       
        if(count>max){ //c>a?
           index = i;
           max = count
        }
    }
    console.log("************************")
    console.log("count :"+count)
    console.log("max :"+max)


    count = 0;
}
console.log(arr[index])

