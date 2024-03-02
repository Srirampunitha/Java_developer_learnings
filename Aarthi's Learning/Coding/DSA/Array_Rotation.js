//Rotate an array left(counter clockwise)by 1;
//APPROACH 1
let arr = [1, 2, 3, 4, 5]; let n = arr.length
let temp = arr[0]
for (let i = 1; i < n; i++) {
    arr[i - 1] = arr[i] //shifting elements to the left
}
arr[n - 1] = temp
console.log(arr)
/////////////////////////////////////////////////////////////////
//ROTATE AN ARRAY BY K TIMES
//SOME NOTES BELOW:
//if k is positive number, array will be rotated by left(anti-clockwise)
//If k is negative number, array will be rotated by right(clockwise)
//At some point of time, we may need to rotate the array which will result in same output as previous roatation
//To tackle above problem, we gonna use some math trick;
//For left(anti-clockwise rotation)=> Rotate an array by (k%(arr.length))times
//For right(clock-wise rotation)=> Rotate an array by (k+arr.length)times;
////////////////////////////////////////////////////////////////////////////////////////////////////
arr = [1, 2, 3, 4, 5]; n = arr.length; let k = 7; let res;
//Rotate an array using recurison
//This recursive solution will work on O(n*k) so not efficient one to use;
res = (rotate(arr, k))
console.log(res)

function RotateOne(arr) { //This function will rotate an array exactly once so we can call this function recursively to rotate array by k times

    let temp = arr[0];
    for (let i = 1; i < arr.length; i++) {
        arr[i - 1] = arr[i]
    }
    arr[(arr.length) - 1] = temp;
}
function rotate(arr, k) {
    k = k % (arr.length)
    if (k < 0) {
        k = k + arr.length
    }
    for (let i = 1; i <= k; i++) {
        RotateOne(arr)
    }
    return arr
}
///////////////////////////////////////////////////////////////////////////////////////////////////

//Rotating an array by using reverse the array logic

//With is logic, the problem can be solve in O(n) time complexity
//How this logic works? see the ans below
//step1: This logic works by dividing the array into two parts
//Step2: first part is 0 tp k-1 and second part from k to len of array
//Step3: reverse each part by calling reverse function
//Step4. Finally reverse the whole array

arr = [1, 2, 3, 4, 5]; k = 5;
function reverse(arr, start, end) {
    let temp;
    while (start < end) {
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp;
        start++
        end--
    }
}
function rotates(arr, k) {
    k = k % (arr.length)
    if (k < 0) {
        k = k + 1
    }
    reverse(arr, 0, k - 1)
    reverse(arr, k, arr.length - 1)
    reverse(arr, 0, arr.length - 1)
    return arr
}
console.log(rotates(arr, k))
//////////////////////////////////////////////////////////////////////////////
//Push all the zeros to the end

//solved this problem using the two pointer approach
//Explanation: the nz always stick with non-zero element and the Z always stick with zeroth element
//If they are not happy about thier places, they will be swapped
arr = [3, 5, 0, 0, 4]
let nz = 0; let z = 0; temp;
if (arr.length == 1 || arr.length == 0) {
    console.log(arr)

}
while (nz < arr.length) {
    if (arr[nz] != 0) {
        temp = arr[nz];
        arr[nz] = arr[z];
        arr[z] = temp;
        nz++
        z++;
    }
    else {
        nz++
    }
}
console.log(arr)

///////////////////////////////////////////////////////////
//remove duplicate elements from a sorted array
arr = [2, 2, 3, 3, 4, 6, 6]
let rd = 0; //rd=>Remove duplicate
for (let i = 1; i < arr.length; i++) {
   
    if (arr[i] != arr[rd]) {
        rd++
        arr[rd] = arr[i]
    }
}
for(let i =0;i<=rd;i++){
    console.log(arr[i] )
}
/////////////////////////////////////////////////////////
//Find the leader of the array [geeks for geeks question]
//Approcah 1: Naive approach/Not optimized
arr = [8,11,5,11,7,6,3];
for(let i =0;i<arr.length;i++){
   let is_leader = true;
   for(let j =i+1;j<arr.length;j++){
    if(arr[i]<=arr[j]){
        is_leader = false;
        break;
    }
   }
   if(is_leader){
    console.log(arr[i])
   }
}
//////////////////////////////////////////////////
//Approach 2
arr = [8,11,5,11,7,6,3];
let current_leader = arr[arr.length-1]
console.log("leader is" + " "+current_leader);
for(let i=arr.length-2;i>=0;i--){
    if(arr[i]>current_leader){
        current_leader = arr[i]
        console.log("leader is" + " "+current_leader);
    }
}
///////////////////////////////////////////////////////////
//Find the majority element in an array
//Boyer Moores's voting algorithm
arr = [5,5,9,5,5,5,5,9,9,9,1]
// STEP1: Initialise zeroth element as majority element
// STEP2: Initialise count value as 1;
// STEP3: Loop over and check if the arr[i] is equal to majority element
// STEP4: If equal, count++ else count--
// STEP5: When the count value becomes zero, change the majority elemt to arr[i] and initialize count to 1
let majority = arr[0]; let count = 1;
for(let i =0;i<arr.length;i++){
    if(arr[i]==majority){
        count++
    }
    else{
        count--
    }
    if(count==0){
        majority = arr[i]
        count = 1;
    }
}
console.log(majority)
//////////////////////////////////////////////////////////////////////////////
//Two sum problem in O(N) time complexity using two pointer approach
arr = [5,3,5,2,1,4]; let target = 10;  n = arr.length; 
let num1 = 0; let num2 = n-1
arr.sort(a,b)
while(num1<num2){

}