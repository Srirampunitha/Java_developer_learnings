/*let day = "satueday";
if(day === "monday")
{
    console.log("7am")
}
else if(day === "tuesday" || day === "wednesday" || day === "thursday")
{
    console.log("8am")
}
else if(day === "friday")
{
    console.log("9am")
}
else {
    console.log("10am")
}*/
let day = "saturday";
let alarm = day === "monday" ? "7am" : "8am"
console.log(alarm);
//switch case
let country = "america"
switch (country) {
    case "japan":
        console.log("sushi");
        break;
    case "korea":
        console.log("kimchi");
        break;
        case "china":
            console.log("Noodles")
            break;
            default:
                console.log("Dosa")


}