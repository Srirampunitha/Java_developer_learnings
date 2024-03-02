//Regular linear search
let arr = [5, 6, 2, 9, 3, 5, 7]; let target = 3
for (let i = 0; i < arr.length; i++) {
  console.log(i)
  if (arr[i] == target) {
    console.log("the target found at" + i)
    break;
  }
}
//Binary Search
arr = [5, 6, 2, 9, 3, 5, 7]; target = 9
let start = 0; let end = (arr.length)
arr.sort((a, b) => (a - b)) // step 1: sort the array
console.log(arr) //
while (start <= end) {
  let mid = parseInt((start + end) / 2)
  if (arr[mid] === target) {
    console.log(mid)
    break;
  }
  else if (arr[mid] < target) {
    start = mid + 1
  }
  else {
    end = mid - 1
  }

}
