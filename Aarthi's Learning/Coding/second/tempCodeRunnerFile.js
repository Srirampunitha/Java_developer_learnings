let arr =[1,1,3,4]; let n = 4;let res = 0;
for(let i=0;i<n;i++)
{
    res = res+arr[i]
}
console.log(res)

let res1=arr.reduce((n,n1)=>(n+n1))
console.log(res1)