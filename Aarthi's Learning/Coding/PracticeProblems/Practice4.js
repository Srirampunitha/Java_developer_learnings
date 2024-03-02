let n = 8; 
let isPower = (n==1)? true : false

if(n%2==0){
 for(let i =1;i<=(n/2)-1;i++){
    if(2**i==n){
        isPower = true;
        break;
    }
    else{
      isPower = false
    }
 }}
 else{
   isPower = false
 }
 if(isPower){
    console.log(true)
 }
 else{
    console.log(false)
 }
 



