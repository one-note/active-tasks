## Javascript Basics

Variables:
JavaScript utilizes variables as containers for storing data values.It provides different types of variable
declarations such as let, const, and var. But, let and const are block-scoped, whereas var exhibits function-scoping
behavior.

```javascript
let mynum = 10;
const pi = 3.14;
var global = "Hello world";
```

Data Types:
JavaScript incorporates dynamic typing, allowing for implicit determination of data types. Common data types include
numbers, strings, booleans, arrays and more.

```javascript
let numberVar = 42;
let stringVar = "Hello, World!";
let booleanVar = true;
```

Control Statements:
Control statements, such as if, else, switch, while, and for, govern the flow of a program, enabling decision-making and
iterative processes.

```javascript
let x = 10;
if (x > 5) {
    console.log("x is greater than 5");
} else {
    console.log("x is not greater than 5");
}
```

Functions:
Functions serve as reusable units of code, facilitating modularization through parameterization and return values.

```javascript
function add(a, b) {
    return a + b;
}

console.log(add(3, 5)); // Outputs 8
```

Arrays:
Arrays act as ordered lists, accommodating various data types and proving instrumental for grouping related data.

```javascript
let fruits = ['apple', 'orange', 'banana'];
console.log(fruits[1]); // Outputs 'orange'
```

Objects:
Objects, structured as key-value pairs, provide a means to represent entities with keys as strings or symbols and
corresponding values of any data type.

```javascript
let person = {
    name: 'user',
    age: 30,
    isStudent: false
};
console.log(person.name); // Outputs 'user'
```

ES6 Concepts:

ES6 or ECMAScript 2015, introduced several impactful features to JavaScript, including arrow functions, template
literals, destructuring, and the use of let/const for variable declarations.
Arrow Function:

```javascript
const multiply = (a, b) => a * b;

function Counter() {
    this.count = 0;
    setInterval(() => {
        this.count++;
        console.log(this.count);
    }, 1000);
}

let counter = new Counter();
```

Template Literals:

```javascript
let name = 'username@1';
console.log(`Hello, ${name}!`);

let user = {
    name: 'user1',
    age: 28,
    city: 'BBSR',
    hobbies: ['Reading', 'Coding', 'Traveling'],
};

function generateUserProfile(user) {
    return `
        <div class="user-profile">
            <h2>${user.name}</h2>
            <p>Age: ${user.age}</p>
            <p>City: ${user.city}</p>
            <h3>Hobbies:</h3>
            <ul>
                ${user.hobbies.map(hobby => `<li>${hobby}</li>`).join('')}
            </ul>
        </div>
    `;
}

let userProfile = generateUserProfile(user);
console.log(userProfile);

Output:
    <h2>user1</h2>
<p>Age: 28</p>
<p>City: BBSR</p>
<h3>Hobbies:</h3>
<ul>
    <li>Reading</li>
    <li>Coding</li>
    <li>Traveling</li>
</ul>

```

Destructuring:

```javascript
let [first, second] = [1, 2];
let person = {name: 'user', age: 30, city: 'IND'};
let personName = person.name;
let personAge = person.age;
// Destructuring
let {name, age} = person;

console.log(name); // Outputs 'user'
console.log(age);  // Outputs 30

// Destructuring and  Default Values
let user = {username: 'guest', role: 'user'};
let {username, role = 'guest'} = user;

console.log(username); // Outputs 'guest'
console.log(role);     // Outputs 'user' value from the object
```
