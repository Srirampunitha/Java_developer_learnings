let user = "company"
let india = {
    state: "tn",
    district: "tvr",
    taluk: "val",
    place: "IK",
    aarthi:{
        studies: "eng",
        job: "IT",
        company: "virtusa",
        passion: "cafe"
    }
}
let me = india.aarthi;
let myjob = me.job === "ITY"? "okay" : "notOkay";
console.log(myjob);

for(let subprop in me)
    {
        console.log(subprop,me[subprop])
    }