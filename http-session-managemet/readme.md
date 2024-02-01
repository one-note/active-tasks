## Session Management by Servlet


### Why HTTP is stateless and what does it mean ?

HTTP is designed to be a stateless protocol, meaning that each request from a client to a server is independent and unrelated to any previous requests. There are several reasons why HTTP is designed to be stateless

#### Advantages of stateless nature:
- A stateless protocol simplifies the design and implementation of both clients and servers.
- Stateless communication allows for better scalability. We don't need to consider the synchronisation problems due to the independent nature of HTTP calls.
- Statelessness improves reliability. If a request fails or a connection is lost, it doesn't impact subsequent requests because each request is self-contained.
- Stateless requests are more cacheable. Proxy servers and browsers can cache responses since they are not tied to a specific client state , this improved performance and reduces server load.
- Stateless nature makes it compatible with a wide range of network architectures. It can be used in various environments, including distributed systems, where stateful communication may be challenging.
- HTTP itself is stateless, mechanisms like cookies and session tokens can be used on the client side to manage state.

### Why/when sessions are used ?

Sessions are used to maintain stateful communication between a web server and a client.They are employed in various scenarios to store and manage information about a user's interactions with a web application across multiple requests.  

They consist of three phases: establishing a connection, sending a request, and receiving a response. 
- Sessions are useful in situations where it is necessary to keep track of user activity, such as in a shopping cart on an ecommerce website.
- Sessions are stored on the server-side and are more secure than cookies, which are stored on the client-side. They can be used to store sensitive information such as user credentials and financial data.
- Sessions are typically implemented using a unique session ID that is stored in a cookie on the client's browser and associated with session data on the server. This allows the server to recognize the client and retrieve the relevant session data for subsequent requests.  

Session can also be used to do the below things 

- User Authentication or Avoiding Repetitive Authentication
- User-Specific Data
- Form Handling
- User Tracking and Analytics
- Security Token Storage
- Concurrency and State Management
- Customized User Experiences
- Persistent Data Between Requests
- Cache Management
- Cross-Page Communication
- Statelessness Mitigation
- Custom Session Storage
- Session Expiry and Cleanup

### Why cookies and headers are used ?

#### Advantages:
- Instead of sessions, tokens or often JSON Web Tokens or JWTs can be stored in cookies or headers for authentication.
- Cookies or local storage can be used to store small amounts of data on the client side.
- Custom headers can be used to transmit state information between the client and server.
- Headers, such as the Origin header, are used in CORS to enable or restrict cross-origin requests.
- In microservices architectures, cookies or headers may be used to pass information between services.
- By offloading some state to the client side (cookies or headers), the server's load can be reduced.
- Cookies or headers may be used to transmit authentication tokens in a Single Sign-On system.

#### Disadvantages:

- Tokens are usually stateless, meaning the server doesn't store information about the user's session. This could lead to increased token size and potential security concerns if sensitive information is stored in the token.
- Small data size and data stored on the client side is susceptible to tampering, so it's not suitable for sensitive information.
- Custom headers might not be as well-supported in some environments or by certain proxy servers.
- Depending on the configuration, CORS headers can limit or complicate certain types of interactions between different domains.
- Stateless architectures can result in increased overhead for handling distributed state and may require additional mechanisms for synchronization.
- Increased risk of security vulnerabilities if sensitive information is exposed or manipulated on the client side.
- Increased complexity in managing tokens across multiple applications and security problems can also arise if not handled carefully.


### Outputs of the  above servlet project:
![Screenshot (236)](https://github.com/SERVLETS/hello-world-servlet/assets/130679461/ccfa5bd5-558a-4ee4-87b0-a6e5b8c1dd1f)

![Screenshot (235)](https://github.com/SERVLETS/hello-world-servlet/assets/130679461/ea2f20a2-485e-4556-bd64-0ddb29d9b827)
