//LOOP to repeat statement multiple times
// initialize, condition, increment
/*let i =5;
while(i>=5)
{
    
 console.log("hi", i)   ;
 
 i--;
}*/
//for loop
for(let i = 1; i<5; i++)
{
    console.log("BTS", i);
    for (j =1 ; j<=7; j++)
    {
    console.log("RM", j)

    }
}

//for loop to print the number which are divisble by 3
/*for(let i = 1; i<=100; i++)
{
    if(i%3 === 0)
    {
        console.log(i);
    }
    
} // for loop is best when u know starting and the ending point..*/
//while loop 
let a = 37765

while(a>0)
{
   console.log(a%10);
   a = parseInt(a/10);
    
} //while loop is best when you don't know the start and end point but knows about the condition
