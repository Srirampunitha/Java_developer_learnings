let aarthi = {
    company: "virtusa",
    project: 'bmo',
    team: "alerts",
    work:{
        bill: "90",
        IC: "50",
        logFix: "100",
    },
    mul: function(n1,n2)
    {
        return(n1*n2);
    }
}
console.log(aarthi.work['IC'])
for(prop in aarthi)
{
    console.log(prop, aarthi[prop]);
}
for(prop in aarthi.work)
{
    console.log(prop, aarthi.work[prop])
}

let n1 = 5; let n2 = 10;
let result = aarthi.mul(aarthi.work.IC, aarthi.work.logFix);
console.log(result)

let fruit ={
    sweet: "mango",
tangy:"orange",
smelly:"durian",
team: "ninja",
shape:{
    oval: "papaya",
round: "mango",
},
func : function()
{
    console.log(this.team, aarthi.team)
}
}
let Taste = fruit.func()