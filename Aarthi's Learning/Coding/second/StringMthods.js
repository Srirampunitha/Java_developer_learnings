//char At() method
let name = "aarthi"
console.log(name.charAt(5))
//////////////////////////////////////////////////////////
//indexOf() and lastIndexOf() methods
let str = "I love bts and the bts leader is namjoon of bts"
console.log(str.indexOf("bts"))
console.log(str.lastIndexOf("bts"))
console.log(str.indexOf("l"))
//////////////////////////////////////////////////////////////////////////
//slice and substring methods
let newstr = str.slice(-14,-7)
console.log(newstr)
 let substr = str.substring(-7,10) //here, the negative numbers are considered as zero
 console.log(substr)
/////////////////////////////////////////////////////////////////////////////////////////////
//split method
let arr = str.split(" ",9)
console.log(arr)
////////////////////////////////////////////////////////////////////////////////////////////////
//includes() method
console.log(str.includes("leader",0))
//////////////////////////////////////////////////////////////////////////////////////////////
//starts with and ends with methods
let plan = "I have a plan to start a cafe"
console.log(plan.startsWith("have",3))
console.log(plan.endsWith("cafe"))
/////////////////////////////////////////////////////////////////////////////////////////////
//concat method
console.log(str.concat(" ",plan))
console.log(name + ' '+ plan) //arithmetic operators are way faster then concat method to join two strings
////////////////////////////////////////////////////////////////////////////////////////////////////////
// repeat () method
name = "aarthi";
console.log(name.repeat(5))
///////////////////////////////////////////////////////////////////////////////////////
//trim. trimstart and trim end methods
let greetings = "  Hello world   "
console.log(greetings)
console.log(greetings.trim())
console.log(greetings.trimStart())
console.log(greetings.trimEnd())
///////////////////////////////////////////////////////////////////////////////////////////
//pad start and pad end method
name = "aarthi"
console.log(name.padStart(10, "hi"))
console.log(name.padEnd(10, "hi"))
//////////////////////////////////////////////////////////////////////////////
//locale compare method
name = "aarthi"; let name1 = "aarthii"
console.log(name1.localeCompare(name))
///////////////////////////////////////////////////////////////////////////////
//search mathod
str = "It is raining outside"
console.log(str.search("out"))
console.log(str.search(/Rain/i)) // i here is used to make the search case insensitive
////////////////////////////////////////////////////////////////////////////////
//match and match all() methods
str = "The rain in SPAIN mainly stays in the plain"
console.log(str.match(/ain/i))
let res = str.matchAll(/ain/gi)
console.log([...res])
//replace and replaceAll() methods
str = "Mr Blue has blue car and blue house"
console.log(str.replace(/blue/, "red"))
console.log(str.replaceAll(/blue/gi, "red"))
let result = str.replaceAll(/blue|house|car/gi,(match)=>{
  return  match.toUpperCase()
})
console.log(result)
//////////////////////////////////////////////////////////////////////////////////////////
//fromCharCodeAt method
console.log(String.fromCharCode(79, 107, 32, 55357, 56397)) //110, 97,109, 106, 111, 111, 110. 10084, 65039
str = "Kim Namjoon❤️"
console.log(str.codePointAt(2))
console.log(String.fromCharCode(75,105,109,32,78,97,109,106,111,111,110,10084,65039))





