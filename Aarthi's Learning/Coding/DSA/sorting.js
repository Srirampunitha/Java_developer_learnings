// //Bubble sort
let arr = [2, 5, 1, 3, 9, 4]

for (let i = 0; i < arr.length; i++) {
    for (j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
            arr[j] = arr[j] + arr[j + 1]
            arr[j + 1] = arr[j] - arr[j + 1]
            arr[j] = arr[j] - arr[j + 1]
        }
    }
}
console.log(arr)
// //////////////////////////////////////////////////////////////////////////////
//Selection Sort
arr = [5, 2, 8, 3, 9, 1];
let n = arr.length;
for (let i = 0; i < n - 1; i++) {
    let minIdx = i;
    for (let j = i + 1; j < n; j++) {
        if (arr[minIdx] > arr[j]) {
            minIdx = j;

        }
    }
    if (minIdx != i) {
        arr[i] = arr[i] + arr[minIdx]
        arr[minIdx] = arr[i] - arr[minIdx]
        arr[i] = arr[i] - arr[minIdx]
    }


}
console.log(arr)
////////////////////////////////////////////////////////////////////////////////////////////////////////
// Insertion Sort
arr = [5, 2, 6, 1, 7, 2] // -,5 6 ; i =2; j =5;_, 5,5

for (let i = 1; i < arr.length; i++) {
    key = arr[i]
    let j = i - 1
    while (arr[j] > key && j >= 0) {
        arr[j + 1] = arr[j]
        j = j - 1

    }
    arr[j + 1] = key
}
console.log(arr)
//////////////////////////////////////////////////////////////////////////////////////////////////
//Quick Sort
arr = [5, 2, 1, 9, 3, 10]
function quicksort(arr) {
    if (arr.length < 2) {
        return arr
    }
    let pivot = arr[arr.length - 1]
    let left = [];
    let right = [];
    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i] <= pivot) {
            left.push(arr[i])
        }
        else {
            right.push(arr[i])
        }
    }
    return ([...quicksort(left), pivot, ...quicksort(right)])
}
let sort = quicksort(arr)
console.log("sorted array is" + " " + sort)
/////////////////////////////////////////////////////////////////////////////////////////
//Merge Sort
arr = [-5, 2, 9, 1, 3, 10]
function mergesort(arr) {
    if (arr.length < 2) {
        return arr
    }
    const mid = parseInt(arr.length) / 2
    let leftArr = arr.slice(0, mid)
    let rightArr = arr.slice(mid)
    return merge(mergesort(leftArr), mergesort(rightArr))
}
function merge(leftArr, rightArr) {
    let sortedArr = [];
    while (leftArr.length && rightArr.length) { // checking that the left and and right array are not empty
        if (leftArr[0] <= rightArr[0]) {
            sortedArr.push(leftArr.shift())
        }
        else {
            sortedArr.push(rightArr.shift())
        }
    }
    return [...sortedArr, ...leftArr, ...rightArr]
}

console.log(mergesort(arr))

