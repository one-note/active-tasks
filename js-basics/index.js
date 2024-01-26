console.log("Hellow world");
let username;
username = window.prompt("Please enter your name");

username = Number(username);
console.log(username);
document.getElementById("id1").innerHTML("Hello ", username);
let age;
age = window.prompt("Enter your age :");
age = Number(age)
let result = age + 5;
console.log('Next year you will be', result);
console.log();
b = confirm();
console.log(b);


document.getElementById("buttonSubmit").onclick = function () {
    a = document.getElementById("textbox1").value
    a = Number(a)
    b = document.getElementById("textbox2").value
    b = Number(b)
    result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    console.log(result)
    document.getElementById("labelResult").innerHTML = "The value of the third side is " + result;
}


let counter = 0;
document.getElementById("increase").onclick = function () {
    counter += 1;
    document.getElementById("counter").innerHTML = counter;

}
document.getElementById("decrease").onclick = function () {
    counter -= 1;
    document.getElementById("counter").innerHTML = counter;

}
document.getElementById("increase").onclick = function () {
    counter = 0;
    document.getElementById("counter").innerHTML = counter;

}

let myName = "RTX on454";

console.log(myName.toUpperCase());
console.log(myName.toLowerCase());
console.log(myName.indexOf(" "));
console.log(myName.charAt(4));
console.log(myName.slice(4));
console.log(myName.slice(myName.indexOf(" ") + 1));
console.log("Hello")
// myName1 = Number (myName);
console.log(myName.valueOf());
console.log(myName.charAt(1).toUpperCase().trim());

document.getElementById("submit").onclick = function () {
    console.log("the button is pressed")
    if (document.getElementById("male").checked == true) {

        document.getElementById("showresult").innerHTML = "Hello bro";
    }
}


let age = 105;

switch (true) {
    case (age > 100) :
        console.log("You are old")
        break;
    case (age <= 0) :
        console.log("You need to be born")
    default:
        console.log("Enter a valid age")
        break;
}
/*
 let counter = 0;
 while (1==1) {
  console.log( 'loop counter',counter)
  counter +=1;
  if (counter > 1000)
  {
     break ;
  }
 }
let username ;
do{
 username =window.prompt("Enter your name")
}while(username = "" | null)
*/
/*
  count = hello("RTXon",3)
console.log(count)
  function hello (userName , num) {
   console.log("Hello user",userName)
 return num*5;
  }

*/
/*
let num = 123455.4534;
convertedNum =num.toLocaleString("en-us" , {style : "currency", currency:"USD"})
convertedNum =num.toLocaleString("hi-IN" , {style : "currency", currency:"INR"})


console.log(convertedNum);
*/
/*
 document.getElementById("submit").onclick = function() {
    let convertedTemp = 0;
    const tempInput = document.getElementById("tempIn").value ;
    if (document.getElementById("celcious").checked)
       {
        temp = tempInput
        convertedTemp = toCelcious(temp);
        document.getElementById("displayTemp").innerHTML= `The Temperature is ${convertedTemp}`
       }
      else if (document.getElementById("farenhiet").checked)
       {
        temp = tempInput
        convertedTemp = toFarenheit(temp);
        document.getElementById("displayTemp").innerHTML= `The Temperature is ${convertedTemp}`
       }
         else
         {
            document.getElementById("displayTemp").innerHTML= `please enter a valid Temperature`
         }


console.log(tempInput);
console.log(convertedTemp);
 }
 function toCelcious (temp) {
    return (temp-32) * (5/9);
 }
 function toFarenheit (temp){
    return (  temp* 9/5 + 32)
 }


 */
/*
 let animals = ["cat","dog","cow","elephant"]
 animals.pop();
 animals.push("lion");
 console.log(animals)
num= animals.indexOf("lion");
console.log(num);
for(let i = 0 ; i< animals.length;i++)
{
    console.log(animals[i]);
}
let pet =["bird","fish","goat"];
let living = [animals,pet];
console.log(living);
living.forEach(elem => {
    console.log(elem);

});

for ( let show of living)
{
    for ( let show1 of show){
        console.log(show1)
    }
}

console.log(...living);

let numbersArray= [1,2,4,4,6,75,75,757,574456,2];
 let min = Math.min(...numbersArray);
 console.log;

 let totalArray= living.push(...numbersArray);
 console.log(totalArray);
 console.log(totalArray);
 for(let sho of totalArray){
    console.log(sho);
 }
 */
/*
 let a = 4;
 let b = 5;
 let c = 5;
 let d = 34;
 let e = 434;
 let f = 43;
 let plus=0;
 let total = sum (a , b ,c);
 function sum (a,b) {
    return a + b ;
 }

 function sum2(...arr){
    for (let arrr of arr)
    {
        arr += plus;
    }

 }
 let totalSum = sum2(a,b,c,d,e)
 console.log(total);
 console.log(totalSum);
 */
/*
 let result = sum(4,7)
console.log(result)
function sum(a,b) {
    return totSum = a+ b

}
function displayConsole(elemet) {
    console.log(elemet)

}
let arrNum = [1,42,42,6,64,4,3,21,7,56];
 let squr = arrNum.map(square)
function square(squr) {
    return Math.pow (squr ,2)

}
console.log(squr)
squr.forEach(element => {
    console.log(element)

});
let totalSqr = squr.reduce(calTotal);
console.log(`The total is ${totalSqr}`)
function calTotal(totalSqr,values) {
    return totalSqr+values;

}
 squr =  squr.sort(ascen);
 squr =squr.sort().reverse();
function ascen(a,b) {
    return a-b;
}
squr.forEach(displayConsole);
counter = 0;
document.getElementById("increaseBtn").onclick = function(){
    counter +=1;
    document.getElementById("showlabel").innerHTML = counter;
}
document.getElementById("decreaseBtn").onclick = function(){
    counter -=1;
    document.getElementById("showlabel").innerHTML = counter;
}
*/

let arrays = [2, 4, 35, 35, 3532, 23, 21, 1, 232];
arrays.sort((a, b) => a - b);
arrays.forEach((element) => console.log(element));

let listItems = new Map([
    ["cars", 3],
    ["bike", 4],
    ["house", 7],
    ["shops", 6]

]);

console.log(listItems)
listItems.forEach((element, elementName) => console.log(`${elementName},${element}`))

car = {
    name: "SENNA",
    model: "Mclaren",
    year: 2023,
    price: "$1.2M",
    drive: function () {
        console.log("This is very fast")
    },
    break: function () {
        console.log("Now stopping it ")
        console.log(`${this.model}`)
    }
}

console.log(car.name)
console.log(car.model)
console.log(car.year)
console.log(car.price)
console.log(car.drive)
console.log(car.break)

car.drive()
car.break()


class book1 {
    name = "Narnia"
    pages = 435
    name1 = "Pirates of the caribbean"
    pages1 = 658

    open() {
        console.log("Opening the book")
    }

    close() {
        console.log("closing the book")
    }
}

const obj = new book1();
const obj1 = new book1();

console.log(obj.name)
obj.open()
console.log(obj1.name)
obj1.close()

class book {
    constructor(name, pages) {
        this.name = name
        this.pages = pages
    }

    studying(name, pages) {
        console.log(`The user is reading ${name} which has ${pages} `)
    }
}

const b1 = new book();
b1.studying("Percy Jackson", 598)

class NoteBook extends book1 {
    constructor(name, pages, author) {
        super(name, pages)
        this.author = author;
    }

    ReadingNotes(name, pages, author) {
        console.log(`The user ${this.name} is reading a notebook having ${this.pages} and its author is ${author}`)

    }
}

const c1 = new NoteBook()
c1.ReadingNotes("idk", 223, "jsljs");

