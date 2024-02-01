/*& console.log("Hellow world");
let username;
// username = window.prompt("Please enter your name");

username = Number (username);
console.log (username);
// document.getElementById("id1").innerHTML("Hello ",username);
let  age ;
age = window.prompt("Enter your age :");
age = Number (age)
let result = age + 5;
console.log('Next year you will be',result);
// console.log();
//  b = confirm();
// console.log(b);

*/

// import { calculateArea } from "./calculateMath";

/*

document.getElementById("buttonSubmit").onclick = function (){
     a = document.getElementById("textbox1").value 
     a = Number(a)
     b = document.getElementById("textbox2").value
     b = Number(b)
     result = Math.sqrt (Math.pow(a,2)+Math.pow(b,2));
     console.log(result) 
     document.getElementById("labelResult").innerHTML = "The value of the third side is "+result ;
}

*/
/*
let counter = 0;
document.getElementById("increase").onclick = function(){
    counter +=1;
    document.getElementById("counter").innerHTML = counter;

}
document.getElementById("decrease").onclick = function(){
    counter -=1;
    document.getElementById("counter").innerHTML = counter;
     
}
document.getElementById("increase").onclick = function(){
    counter = 0 ;
    document.getElementById("counter").innerHTML = counter;
     
}
*/
/*
let myName = "RTX on454";

console.log(myName.toUpperCase());
console.log(myName.toLowerCase());
console.log(myName.indexOf(" "));
console.log(myName.charAt(4));
console.log(myName.slice(4));
console.log(myName.slice(myName.indexOf(" ")+1));
console.log("Hello")
// myName1 = Number (myName);
console.log(myName.valueOf());
console.log(myName.charAt(1).toUpperCase().trim());
*/
/*
 document.getElementById("submit").onclick = function () {
    console.log("the button is pressed")
    if (document.getElementById("male").checked == true) {
        
        document.getElementById("showresult").innerHTML = "Hello bro";
    }
 }
 */
 /*
 let age = 105;

 switch (true) {
        case (age>100) :
            console.log("You are old")
            break;
        case (age<=0) :
            console.log("You need to be born")
        default:
            console.log("Enter a valid age")
            break;
    }
    */
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
/*
let arrays = [2,4,35,35,3532,23,21,1,232];
arrays.sort((a,b) =>a-b );
arrays.forEach((element)=>console.log(element));

let listItems = new Map([
  ["cars",3],
  ["bike",4],
  ["house",7],
  ["shops",6]

]);

console.log(listItems)
listItems.forEach((element,elementName)=>console.log(`${elementName},${element}`))

 car = {
    name : "SENNA",
    model : "Mclaren",
    year : 2023,
    price : "$1.2M",
    drive : function(){
        console.log("This is very fast")},
    break : function() {
        console.log("Now stopping it ")
        console.log(`${this.model}`)
    }
 }
/*
 console.log(car.name)
 console.log(car.model)
 console.log(car.year)
 console.log(car.price)
 console.log(car.drive)
 console.log(car.break)

 car.drive()
 car.break()
*/
/*

 class book1 {
    name = "Narnia"
    pages = 435
    name1 = "Pirates of the carribean"
    pages1 = 658
    open(){console.log("Opening the book")}
    close(){console.log("closeing the book")}
 }

 const obj = new book1();
 const obj1 = new book1();

 console.log(obj.name)
obj.open()
 console.log(obj1.name)
obj1.close()

class book {
    constructor (name,pages){
        this.name = name
        this.pages = pages
    }
    studying(name,pages){
        console.log(`The student is reading ${name} which has ${pages} `)
    }
}
const b1 = new book();
b1.studying("Percy Jackson",598)

class NoteBook extends book1{
constructor(name,pages,author){
    super (name,pages)
    this.author= author;
}
ReadingNotes(name,pages,author){
    console.log(`The student ${this.name} is reading a notebook having ${this.pages} and its author is ${author}`)

}
}
const c1 = new NoteBook()
 c1.ReadingNotes("idk",223,"jsljs");

 */
/*
 try {
    console.lagg("Hello")
 } catch (error) {
   console.log(error) 
 }
console.log("hellow java")
 
try {
 let x =   window.prompt("Enter your name")
 if (isNaN(x))
 {console.log(`${x} is a name`)}
 else
 throw `${x} is not a name`
} catch (error) {
    console.log(error)
}
finally{
    console.log("Thank you for visiting our site")
}
*/
/*
let timer =setTimeout(hello,3000);
let timer2 =setTimeout(userReg,7000);

 function hello() {
    window.alert("Hello bro")
    
}
function userReg() {
    window.alert("Please register")
    
}
clearTimeout(timer)
clearTimeout(timer2)
 let counter = 0;
 let mycounter = setInterval(count,50)
 function count (){
    counter +=1;
    console.log(counter);
    if (counter>=100){
        clearInterval(mycounter);
    }
 }
 
*/
/*
let date1 = new Date();
let years = date1.getDay()
console.log(years)
date1= date1.toLocaleDateString()
console.log(date1)

let date2 = new Date()
formatDate();
function formatDate()
{
   let curYear=  date2.getFullYear()
   let curMonth=  date2.getMonth()
   let curDay=  date2.getDate();
   console.log(`${curDay} / ${curMonth} / ${curYear}`)
}
*/
/*
const myLabel = document.getElementById("myLabel");

update();
setInterval(update, 1000);

function update(){

    let date = new Date();
    myLabel.innerHTML = formatTime(date);

    function formatTime(date){
        let hours = date.getHours();
        let minutes = date.getMinutes();
        let seconds = date.getSeconds();
        let amOrPm = hours >= 12 ? "pm" : "am";

        hours = (hours % 12) || 12;

        hours = formatZeroes(hours);
        minutes = formatZeroes(minutes);
        seconds = formatZeroes(seconds);

        return `${hours}:${minutes}:${seconds} ${amOrPm}`;
    }
    function formatZeroes(time){
        time = time.toString();
        return time.length < 2 ? "0" + time : time;
    }
}
*/
/*
console.time("timer1")

window.prompt("enter a name")
console.timeEnd("timer1")

const promise = new Promise((resolve, reject) => {
 
    let fileLoaded = false;
 
    if(fileLoaded){
        resolve("File is now  loaded");
    }
    else{
        reject("File has not yet loaded");
    }
});
 
promise.then(value => console.log(value))
              .catch(error => console.log(error));



const wait = time => new Promise(resolve => {
    setTimeout(resolve, time);
});

wait(3000).then(() => console.log(`youn have waited for ${time}`));
*/
/*
async function greet ( )
{
    let condition = false;
    if(condition)
    {
        return "Hello user"
    }
    else{
        return "not hellow user"
    }
}
greet().then((value)=> console.log(value))
      .catch((error) => console.log(error));

*/
/*
async function greet ( ){
let condition = false;
    if(condition)
    {
        return "Hello user"
    }
    else{
        return "not hellow user"
    }
}
greet().then((value)=> console.log(value))
      .catch((error) => console.log(error));
 async function showResult (){
    try {
        let output = await greet()
        console.log(output)
    } catch (error) {
        console.log(error);
    }
    
 }
*/
/*
import { PI,calculateArea,sayHello } from "./calculateMath.js";

console.log(PI);
console.log(sayHello());
console.log(calculateArea(5));
import * as myModule from "./calculateMath.js";
console.log(myModule.PI);
console.log(myModule.sayHello());
console.log(myModule.calculateArea(15));
*/
/*
console.log(document);
console.dir(document);
document.title = "afjsl site"
console.log(document.getRootNode())
console.log(document.URL)
//document.location = "https://www.youtube.com/"

const header= document.getElementById("h1") ;
header.style.backgroundColor ="lightblue" ;

 let buttons =document.getElementsByName("b1");
 console.log(buttons)
 
 buttons.forEach(element => {
    console.log(element)
 });
 let head=document.getElementsByTagName("H1");
 
 console.log(head)
 head[0].style.backgroundColor="green"

 let querry = document.querySelector("#h1")
 querry.style.backgroundColor="yellow"

 let querry1 = document.querySelectorAll("#h1")
 querry1[0].style.backgroundColor="pink"

 let element = document.querySelector("#animals");
let child = element.firstElementChild;
child.style.backgroundColor = "blue";

let element1 = document.querySelector("#machines");
let child1 = element1.firstElementChild;
child1.style.backgroundColor = "red";

let element2 = document.querySelector("#machines");
let child2 = element2.lastElementChild;
child2.style.backgroundColor = "red";

let element3 = document.querySelector("#machines");
let child3 = element3.children[1];
console.log(child3)
child3.style.backgroundColor = "yellow";

let element4 = document.querySelector("#pets");
let child4 = element4.previousElementSibling;
console.log(child4)
child4.style.backgroundColor = "red";


let element5 = document.querySelector("#pets");
let sibling  = element4.parentElement;
console.log(sibling)
sibling.style.backgroundColor = "pink";

*/
/*
const newHeader = document.createElement("newHeader");
//newHeader.innerHTML= window.prompt("Enter your name");
document.body.append(newHeader); 

const newHeader1 = document.createElement("newHeader");
//newHeader1.textContent= window.prompt("Enter your address");
document.body.append(newHeader1);

const carUl = document.querySelector("#carCompany")
const newCar = document.createElement("li")
newCar.textContent="SENNA";
carUl.append(newCar);
carUl.prepend(newCar);
 
carUl.insertBefore(newCar,carUl.getElementsByTagName("li")[2])
*/
/*

const titleHeader = document.getElementById("css");
titleHeader.style.background = "rgb(50,200,250)"
titleHeader.style.background = "lightblue"
titleHeader.style.color = "red"
titleHeader.style.fontFamily= "consolas"
titleHeader.style.border = "5px dotted"
titleHeader.style.display = "block"
*/

// function sayHello(){
//    // console.log("Hello")
//    // window.alert("Hello")
//    alert("SHfsLH")
// }
// //sayHello()
// function abcc(){
//     alert("djfaajdfal");
// }

// let changeElement = document.body;

// changeElement.onchange= sayHello() ;
 /*
let element = document.getElementById("myBlock")
element.onmouseover = changeColor;
element.onmouseout = changeColorBack;

function changeColor() {
    element.style.backgroundColor="lightblue"

}
function changeColor1() {
    this.style.backgroundColor="yellow"

}
function changeColorBack() {
    element.style.backgroundColor= "green"
    
}

const innerDiv = document.getElementById("innerDiv")
innerDiv.addEventListener("mouseover",changeColor1);


const imge = document.querySelector("#myImg");
const btn = document.querySelector("#myBtn");
btn.addEventListener("click", ()=>{
    if (imge.style.display =='none'){
        imge.style.display == 'block'
    }else{
        imge.style.display = 'none'
    }
})


//window.addEventListener("keydown",event => console.log(event.key));
const myDiv = document.getElementById("myDiv");
window.addEventListener("keydown", move);
let x = 0;
let y = 0;

function move(event){
    
    switch(event.key){
        case "ArrowDown":
            y+=5;
            myDiv.style.top = y + "px";
            console.log(event.key);
            break;
        case "ArrowUp":
            y-=5;
            myDiv.style.top = y + "px";
            console.log(event.key);
            break;
        case "ArrowRight":
            x+=5;
            myDiv.style.left = x + "px";
            console.log(event.key);
            break;
        case "ArrowLeft":
            x-=5;
            myDiv.style.left = x + "px";
            console.log(event.key);
            break;
        default:
            break;
    }
}
*/
/*
const showAnimation = document.getElementById("showAnimation");
 const myAnimation = document.getElementById("myDiv");
 
showAnimation.addEventListener("click", slide);
showAnimation.addEventListener("click", rotate);
showAnimation.addEventListener("click", scale)

 function slide(){
    let timerId = null;
    let x = 0;
    let y = 0;

    timerId = setInterval(frame, 5);

    function frame(){
        if(x >= 200 || y >= 200){
            clearInterval(timerId);
        }
        else{
            x+=1;
            y+=1;
            myAnimation.style.top = y + 'px';
            myAnimation.style.left = x + 'px';
        }
    }
}
function rotate(){
    let timerId = null;
    let degrees = 0;
 
    timerId = setInterval(frame, 5);

    function frame(){
        if(degrees >= 360){
            clearInterval(timerId);
        }
        else{
            degrees+=1;
            myAnimation.style.transform = "rotateZ("+degrees+"deg)";
        }
    }
}
function scale(){
    let timerId = null;
    let scaleX = 1;
    let scaleY = 1;
 
    timerId = setInterval(frame, 5);

    function frame(){
        if(scaleX <= 0.1 || scaleY <= 0.1){
            clearInterval(timerId);
        }
        else{
            scaleX-=0.01;
            scaleY-=0.01;
            myAnimation.style.transform = "scale("+scaleX+","+scaleY+")";
        }
    }
}
*/
/* 

let canva = document.getElementById("myCanva");
let context = canva.getContext("2d");
context.lineWidth = 5
context.strokeStyle = "blue"
context.beginPath();
context.moveTo(110,5);
context.lineTo(15,440);
context.stroke();


context.beginPath();
context.moveTo(10,5);
context.lineTo(150,440);
context.stroke();


context.strokeStyle = "green";
context.lineWidth = 10;
context.beginPath();
context.moveTo(0, 0);
context.lineTo(250, 250);
context.lineTo(250, 500);
context.moveTo(500, 0);
context.lineTo(250, 250);
context.stroke();



context.strokeStyle = "grey";
context.fillStyle = "yellow";
context.lineWidth = 10;
context.beginPath();
context.moveTo(250, 0);
context.lineTo(0, 250);
context.lineTo(500, 250);
context.lineTo(250, 0);
context.stroke();
context.fill();

context.fillStyle = "black";
context.fillRect(0, 0, 250, 250);
context.strokeStyle = "black";
context.strokeRect(0, 0, 250, 250);

context.fillStyle = "red";
context.fillRect(0, 250, 250, 250);
context.strokeStyle = "black";
context.strokeRect(0, 250, 250, 250);

context.fillStyle = "green";
context.fillRect(250, 250, 250, 250);
context.strokeStyle = "black";
context.strokeRect(250, 250, 250, 250);

context.fillStyle = "blue";
context.fillRect(250, 0, 250, 250);
context.strokeStyle = "black";
context.strokeRect(250, 0, 250, 250);


context.fillStyle = "lightgreen";
context.strokeStyle = "darkgreen";
context.lineWidth = 10;
context.beginPath();
context.arc(250, 250, 200, 0, 2 * Math.PI);
context.stroke();
context.fill();


context.font = "50px Calibri";
context.fillStyle = "red";
context.textAlign = "center";
context.fillText("Hello user", canva.width / 2, canva.height / 2);
 */
/*
const clickBtn = document.querySelector("#myBtn");

console.dir(window);
console.log(window.innerWidth);
console.log(window.innerHeight);
console.log(window.scrollX);
console.log(window.scrollY);

console.log(window.location.href);
// window.location.href = "https://youtube.com";
console.log(window.location.hostname);
console.log(window.location.pathname);

clickBtn.addEventListener("click", () => window.open("https://Youtube.com"));
// clickBtn.addEventListener("click", () => window.close());
// clickBtn.addEventListener("click", () => window.print());

//window.alert("Thnk you for visiting");
 // window.confirm("Are you sure want to leave");

let myName1 = window.prompt("Enter your name");
if(name1 == "user"){
    window.alert("please enter a valid name");
    window.close();
    
}

console.log(navigator.cookieEnabled);
document.cookie = "name = user1,address = world1 , 10 January 2030 12:00:00 UTC; path=/";
let Cookies = document.cookie;
console.dir(Cookies);
const firstText = document.querySelector("#firstText");
const lastText = document.querySelector("#lastText");
const submitBtn = document.querySelector("#submitBtn");
const cookieBtn = document.querySelector("#cookieBtn");

submitBtn.addEventListener("click", () => {
    setCookie("firstName", firstText.value, 365);
    setCookie("lastName", lastText.value, 365);
});
cookieBtn.addEventListener("click", () => {
    firstText.value = getCookie("firstName");
    lastText.value = getCookie("lastName");
});

function setCookie(name, value, daysToLive){
    const date = new Date();
    date.setTime(date.getTime() +  (daysToLive * 24 * 60 * 60 * 1000));
    let expires = "expires=" + date.toUTCString();
    document.cookie = `${name}=${value}; ${expires}; path=/`
}
function deleteCookie(name){
    setCookie(name, null, null);
}
function getCookie(name){
    const cookieDecoded = decodeURIComponent(document.cookie);
    const cArray = cookieDecoded.split("; ");
    let result = null;
    
    cArray.forEach(element => {
        if(element.indexOf(name) == 0){
            result = element.substring(name.length + 1)
        }
    })
    return result;
}
*/
/*
const timeDisplay = document.querySelector("#displayTime");
const startCountBtn = document.querySelector("#startCountBtn");
const pauseCountBtn = document.querySelector("#pauseCountBtn");
const resetCountBtn = document.querySelector("#resetCountBtn");

let startTime = 0;
let elapsedTime = 0;
let currentTime = 0;
let paused = true;
let intervalId;
let hrs = 0;
let mins = 0;
let secs = 0;

startCountBtn.addEventListener("click", () => {
    if(paused){
        paused = false;
        startTime = Date.now() - elapsedTime;
        intervalId = setInterval(updateTime, 1000);
    }
});
pauseCountBtn.addEventListener("click", () => {
    if(!paused){
        paused = true;
        elapsedTime = Date.now() - startTime;
        clearInterval(intervalId);
    }
});
resetCountBtn.addEventListener("click", () => {
    paused = true;
    clearInterval(intervalId);
    startTime = 0;
    elapsedTime = 0;
    currentTime = 0;
    hrs = 0;
    mins = 0;
    secs = 0;
    timeDisplay.textContent = "00:00:00";
});

function updateTime(){
    elapsedTime = Date.now() - startTime;

    secs = Math.floor((elapsedTime / 1000) % 60);
    mins = Math.floor((elapsedTime / (1000 * 60)) % 60);
    hrs = Math.floor((elapsedTime / (1000 * 60 * 60)) % 60);

    secs = pad(secs);
    mins = pad(mins);
    hrs = pad(hrs);

    timeDisplay.textContent = `${hrs}:${mins}:${secs}`;

    function pad(unit){
        return (("0") + unit).length > 2 ? unit : "0" + unit;
    }
}

*/
/*

const gameBoard = document.querySelector("#gameBoard");
const ctx = gameBoard.getContext("2d");
const scoreText = document.querySelector("#scoreText");
const resetBtn = document.querySelector("#resetBtn");
const gameWidth = gameBoard.width;
const gameHeight = gameBoard.height;
const boardBackground = "red";
const paddle1Color = "lightblue";
const paddle2Color = "green";
const paddleBorder = "black";
const ballColor = "blue";
const ballBorderColor = "black";
const ballRadius = 12.5;
const paddleSpeed = 50;
let intervalID;
let ballSpeed;
let ballX = gameWidth / 2;
let ballY = gameHeight / 2;
let ballXDirection = 0;
let ballYDirection = 0;
let player1Score = 0;
let player2Score = 0;
let paddle1 = {
    width: 25,
    height: 100,
    x: 0,
    y: 0
};
let paddle2 = {
    width: 25,
    height: 100,
    x: gameWidth - 25,
    y: gameHeight - 100
};

window.addEventListener("keydown", changeDirection);
resetBtn.addEventListener("click", resetGame);

gameStart();

function gameStart(){
    createBall();
    nextTick();
};
function nextTick(){
    intervalID = setTimeout(() => {
        clearBoard();
        drawPaddles();
        moveBall();
        drawBall(ballX, ballY);
        checkCollision();
        nextTick();
    }, 10)
};
function clearBoard(){
    ctx.fillStyle = boardBackground;
    ctx.fillRect(0, 0, gameWidth, gameHeight);
};
function drawPaddles(){
    ctx.strokeStyle = paddleBorder;

    ctx.fillStyle = paddle1Color;
    ctx.fillRect(paddle1.x, paddle1.y, paddle1.width, paddle1.height);
    ctx.strokeRect(paddle1.x, paddle1.y, paddle1.width, paddle1.height);

    ctx.fillStyle = paddle2Color;
    ctx.fillRect(paddle2.x, paddle2.y, paddle2.width, paddle2.height);
    ctx.strokeRect(paddle2.x, paddle2.y, paddle2.width, paddle2.height);
};
function createBall(){
    ballSpeed = 1;
    if(Math.round(Math.random()) == 1){
        ballXDirection =  1; 
    }
    else{
        ballXDirection = -1; 
    }
    if(Math.round(Math.random()) == 1){
        ballYDirection = Math.random() * 1; //more random directions
    }
    else{
        ballYDirection = Math.random() * -1; //more random directions
    }
    ballX = gameWidth / 2;
    ballY = gameHeight / 2;
    drawBall(ballX, ballY);
};
function moveBall(){
    ballX += (ballSpeed * ballXDirection);
    ballY += (ballSpeed * ballYDirection);
};
function drawBall(ballX, ballY){
    ctx.fillStyle = ballColor;
    ctx.strokeStyle = ballBorderColor;
    ctx.lineWidth = 2;
    ctx.beginPath();
    ctx.arc(ballX, ballY, ballRadius, 0, 2 * Math.PI);
    ctx.stroke();
    ctx.fill();
};
function checkCollision(){
    if(ballY <= 0 + ballRadius){
        ballYDirection *= -1;
    }
    if(ballY >= gameHeight - ballRadius){
        ballYDirection *= -1;
    }
    if(ballX <= 0){
        player2Score+=1;
        updateScore();
        createBall();
        return;
    }
    if(ballX >= gameWidth){
        player1Score+=1;
        updateScore();
        createBall();
        return;
    }
    if(ballX <= (paddle1.x + paddle1.width + ballRadius)){
        if(ballY > paddle1.y && ballY < paddle1.y + paddle1.height){
            ballX = (paddle1.x + paddle1.width) + ballRadius; // if ball gets stuck
            ballXDirection *= -1;
            ballSpeed += 1;
        }
    }
    if(ballX >= (paddle2.x - ballRadius)){
        if(ballY > paddle2.y && ballY < paddle2.y + paddle2.height){
            ballX = paddle2.x - ballRadius; // if ball gets stuck
            ballXDirection *= -1;
            ballSpeed += 1;
        }
    }
};
function changeDirection(event){
    const keyPressed = event.keyCode;
    const paddle1Up = 87;
    const paddle1Down = 83;
    const paddle2Up = 38;
    const paddle2Down = 40;

    switch(keyPressed){
        case(paddle1Up):
            if(paddle1.y > 0){
                paddle1.y -= paddleSpeed;
            }
            break;
        case(paddle1Down):
            if(paddle1.y < gameHeight - paddle1.height){
                paddle1.y += paddleSpeed;
            }
            break;
        case(paddle2Up):
            if(paddle2.y > 0){
                paddle2.y -= paddleSpeed;
            }
            break;
        case(paddle2Down):
            if(paddle2.y < gameHeight - paddle2.height){
                paddle2.y += paddleSpeed;
            }
            break;
    }
};
function updateScore(){
    scoreText.textContent = `${player1Score} : ${player2Score}`;
};
function resetGame(){
    player1Score = 0;
    player2Score = 0;
    paddle1 = {
        width: 25,
        height: 100,
        x: 0,
        y: 0
    };
    paddle2 = {
        width: 25,
        height: 100,
        x: gameWidth - 25,
        y: gameHeight - 100
    };
    ballSpeed = 1;
    ballX = 0;
    ballY = 0;
    ballXDirection = 0;
    ballYDirection = 0;
    updateScore();
    clearInterval(intervalID);
    gameStart();
    

};

*/
