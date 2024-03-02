//Convert integer to Binary using toString() method
let n = 32;
let res = n.toString(2)
console.log(res);
////////////////////////////////////////////////////////
//Convert integer to Binary without using any method
let str = ""; n = 45;
while (n >= 1) {
    let x = n % 2;
    n = parseInt(n / 2)
    str = x + str
}
console.log(str)
///////////////////////////////////////////////////////////
//convert binary to integer without using any method
let powerOfTwo = 1; res = 0;
for (let i = str.length - 1; i >= 0; i--) {
    if (str.charAt(i) == 1) {
        res = res + powerOfTwo
    }
    powerOfTwo = powerOfTwo * 2
}
console.log(res)
//////////////////////////////////////////////////////////////////
//Bitwise operators
//1.Bitwise OR (|)
//Bitwise OR can be used to add two numbers
console.log(5 | 10)
//left shift operator (<<)
//left shifting once(eg:5<<1)means multiplying that number with two once
console.log(5 << 1) //left shifting once
console.log(5 << 2) //left shifting twice
/////////////////////////////////////////
//Right shift operator
//right shifting once(eg:5<<1)means floor dividing that number with two once
console.log(5 >> 1) //right shifting once
console.log(5 >> 2) //right shifting twice
///////////////////////////////////////////////////////////////////
//Negotiation operator (~) 
//~ operator will give the value of -(n+1)
console.log(~2)
console.log(~-2)
//////////////////////////////////////////////////////////////////
//SWICH ON or SWITCH OFF the bits
//1 is considered as switch is ON
//0 is considered as Switch is OFF
//Question: How to switch on the bit? solu: Do bitwise OR operation with 1 to switch ON all switched off bits
//switch on the ith(3rd) bit
//Create mask and do OR operation to switch on ith bit;
n = 36; let i = 3;//"00100100";
let onMask = 1 << i;
res = n | onMask
console.log(res)
//////////////////////////////////////////////
//Switch off the ith bit
//Create mask and do AND operation to switch off ith bit;
n = 36; i = 5;
let OffMask = ~(1 << 5)
res = n & OffMask
console.log(res);
////////////////////////////////////////////////////////////
//Toggle a bit
//toggling means, it'll switch off the bit if it is on or it will switch on the bit if its off
//Toggling can be done by creating a mask and performing XOR operation;
n = 36; i = 5;
let tMask = (1 << i)
res = (n ^ tMask)
console.log(res)
////////////////////////////////////////////////////////////////////////////////
//Check the ith position bit is on or off
//To check this, we have to perform AND operation using 1;
//After performing, if the integer value obtained is 0, then that bit is OFF, otherwise it is ON;
n = 36; i = 5;
let cMask = (1 << i)
if ((n & cMask) == 0) {
    console.log("OFF")
}
else {
    console.log("ON")
}
///////////////////////////////////////////////////////////////////////////////////////
//Find the position of rightmost set bit
//Approach 1:
//Step 1: create a mask with 1;
//Do AND operation between mask and n
//If AND operation returns zero, left shift the 1 by 1 and increase the position and keep repeating it till the n&m is non-zero
//Time complexity for this is O(log n)
n = 10; let mask = 1; let position = 0;
if (n == 0) {
    console.log("No set bit found")
}
while ((n & mask) == 0) {
    mask = mask << 1;
    position++
}
console.log(position + 1)
/////////////////////////////////////////////////////////////////////////////
//To find the rightmost set bit;
//APPROACH 2:
//Step1: mask = (n&(n-1))
//Step2: n = (n^mask)=> this will make only the rightmost set bit as 1 and others as 0;
//Step 3: you'll get the two to the power number
//step4: extract the power value in the number using math.log2(n)method and add 1 to it;
n = 40;
mask = n & (n - 1)
res = n ^ mask
let pos = Math.log2(res)
console.log(pos + 1)
////////////////////////////////////////////////////////////////////////////////
//To find the right most different bit
//Step1: Find mask = (n^m)
//Step2: Find pos =(mask^mask-1)
//Step3: do Math.log2(pos)
//step4: return position+1 
n = 9; let m = 11;
mask = n ^ m;
pos = Math.log2((mask ^ (mask - 1)))
console.log(parseInt(pos + 1))
//////////////////////////////////////////////////////////////////////////////////
//counting the number of set bits
//step1: do n and (n-1) and take that result as n
//step2: repeat this step until the n becomes zero
//step3: The number of steps done to achieve n as zero is the count of set bit;
//Time complexity of this is O(log N)
n = 32; count = 0;
while (n != 0) {
    n = n & (n - 1)
    count++;
}
console.log("The set bit count is" + " " + count)
///////////////////////////////////////////////////////////////////////////////////////
//Find whether the number os power of two or not?
//when the integer is converted into binary format, if it is a power of two, it'll have only one set bit;
//by applying brian kernighan's algorithm, that set bit will become zero;
 n = 128;
 if(n==0){console.log(false)}
 if(n==1){console.log(true)}
 n = n&(n-1)
 if(n==0){
    console.log("yes, power of two")
 }
 else{
    console.log("Not a power of two")
 }
 /////////////////////////////////////////////////////////////////////////////////////////////
 //Finding a unique element in an array
 //point1: number xor with same number will become zero. eg: 5^5 = 0
//point2: number xor with 0 will be number itself. eg:5^0 = 5;
arr = [5,1,4,4,3,1,3]; res = 0; n = arr.length
for(let i =0;i<n;i++){
    res = res^arr[i]
}
console.log("The unique element is"+" "+res)
////////////////////////////////////////////////////////////////
//length of longest consecutive ones in binary representation;
//observation1: if u do (n&(n<<1)!=0), then it has consecutive 1 in it;
//observation1: if u do (n&(n<<1)==0), then it does not have consecutive 1 in it;
//solution:
//step1: do (n&(n<<1)) and update the value as n;
//step2: repeat this step till u get n value as zero;
//step3: the number of operations poerformed till u get n value as zero is the count of longest consecutive 1 length;
 n = 110; count = 0;

while(n>0){
    n = (n&(n<<1));
    count++
}
console.log("The length of longest consecutive ones is "+count)

