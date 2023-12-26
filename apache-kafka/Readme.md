<div style="text-align:center">

![kafkaLogo](https://github.com/Ansu-s/need_to_study_this/assets/130679461/43931d75-049b-4101-aa05-b5ba546f5bfe)

# Apache Kafka

</div>

## Why Kafka ?

Apache kafka is an open source event distributed platform which allow us to develop real time event driven applications. It allows us to create 
applications that can continuously produce or consume data records.
Kafka has three primary capabilities:

- It enables applications to publish or subscribe to data or event streams.
- It stores records accurately meaning in the order in which they occurred in a fault-tolerant and durable way.
- It processes records in real-time.

## UseCases of Kafka :

- Decoupling of dependencies - This helps to make the program loosely coupled thus reducing dependencies.
- Messaging - It can create a real time messaging communication.
- Location Tracking - Continuous tracking of the location can be done using the data streams.
- Data Gathering - We can collect data from various sensors or devices in real time and can perform analytics on them. 

## Kafka Components :

### Producers and Consumers :

Producers in Kafka are responsible for publishing or sending messages to Kafka topics. They generate data and push it to specific topics within the Kafka cluster. Producers play a key role in initiating the flow of information in a Kafka system, and they can publish messages in various formats, such as strings, JSON, or binary data.

Consumers in Kafka subscribe to one or more topics and retrieve messages from those topics. They play a crucial role in processing and acting upon the data produced by producers. Consumers can be part of consumer groups for parallel processing, and they maintain an offset to keep track of the last consumed message. Kafka supports both batch and real-time processing, making it flexible for various use cases.

![kafka2](https://github.com/Ansu-s/need_to_study_this/assets/130679461/6abcd7d5-9a51-440f-90d2-a41ac6d6d0da)

### Topics : 

An ordered collection of events in a durable way. They are persistent record of events.A event can be any thing like a user login in , change in a data value like temperature , price...

A topic is a stream of related messages in kafka. It is a logical representation of data. 
Topics can categorize messages into specific groups. We define the number of topics and it can be unlimited. Any number of 
consumers or producers can access any topics.

### Partitions and Segments :

We can't have a topic scale forever or be accessed do other operations to solve this we break the topics into several 
partitions, and then we can allocate the partition to different brokers in the cluster.
We always have strict ordering on the partitions.Partitions can be broken down into segments. 

![Screenshot (21)](https://github.com/Ansu-s/need_to_study_this/assets/130679461/9d7476dd-466e-4e7e-bc21-5f89ed6053f1)

![Screenshot (23)](https://github.com/Ansu-s/need_to_study_this/assets/130679461/43817a81-ace5-409a-ade9-ace3d4533d2b)

Replication Factor - This defines how many times the broker will be replicated to ensure reliability or fault tolerance.
The main broker is called a leader and the other ones are called is follower. The default factor is 3.
### Data Elements :

Data stored in kafka topics have four basic element the key which can be integer, string or compound numbers that is 
used to identify the data uniquely. Value represents the actual data. The header is optional which contain some meta data
and the timestamp shows the exact time the event occurred or got into the topic.

![Screenshot (24)](https://github.com/Ansu-s/need_to_study_this/assets/130679461/74e7cfd3-01a3-41da-b651-e49e40612bfa)

### Brokers :

A Kafka broker is a server or a node in the Kafka cluster. It is responsible for storing and managing the data (messages) that are produced and consumed by clients.
Broker basically does the below things

- Manages the partitions
- Stores the partitions in its local storage.
- Meta-data management
- Fault tolerance
- Replication management

### Zookeeper Ensemble :

This manages the kafka clusters. All kafka cluster always consensus on some information that is stored on the Zookeeper.
Zookeeper does the following few things
 - Authentication of the producers or consumers, access control lists.
 - Failure detection and security,leader election.
 - Store ACls,metadata other important information regarding the partitions.

#### However, the zookeeper has deprecated but all its features are now being managed by the Internal Metadata Management.

### Kafka Stream API :

There are four API that help us to store manage and retrieve data in kafka which are as follows
- **Producer API**: This enables an application to publish a stream to a Kafka topic.
- **Consumer API**: This enables an application to subscribe to one or more topics and to ingest and process the stream stored in the topic.
- **Streams API**: This builds on the Producer and Consumer APIs and adds complex processing capabilities that enable an application to perform continuous, front-to-back stream processing—specifically, to consume records from one or more topics, to analyze or aggregate or transform them as required, and to publish resulting streams to the same topics or other topics.
- **Connector API**: This lets developers build connectors, which are reusable producers or consumers that simplify and automate the integration of a data source into a Kafka cluster.

## Problems Kafka solved :

- **Data Integration**: Kafka provides a unified, fault-tolerant platform for real-time data integration.
- **Real-Time Event Streaming**: Kafka enables real-time event streaming for event-driven architectures.
- **Scalability and Fault Tolerance**: Kafka scales horizontally and ensures fault tolerance for large-scale distributed systems.
- **Log-Centric Architecture**: Kafka's log-centric design simplifies storage and retrieval of large volumes of log data.
- **Data Retention and Replay**: Kafka retains messages for replay and historical analysis.
- **Multiple Subscribers (Consumer Groups)**: It supports parallel processing with consumer groups for efficient message consumption.
- **Event-Driven Microservices**: Kafka serves as a communication backbone for event-driven microservices, facilitating asynchronous communication.


## Alternatives of Kafka :

Below are some alternatives to it, but all of these don't have exactly same capability, but we can use them in instead of kafka.

- **RabbitMQ** is a message broker that supports multiple messaging patterns, including publish/subscribe and point-to-point communication. It is known for its ease of use and flexibility. RabbitMQ is suitable for various messaging scenarios but may not scale as horizontally as Kafka for high-throughput streaming.

- **Apache Pulsar** is a distributed messaging and event streaming platform. It provides similar features to Kafka, including partitioning, fault tolerance, and scalability. Pulsar has a unique architecture that separates serving and storage, which can be beneficial in certain use cases.

- **Amazon Kinesis** is a cloud-based platform that includes several services for real-time data streaming. Amazon Kinesis Streams is particularly comparable to Kafka, providing the ability to ingest, process, and analyze streaming data at scale. It's a good fit for organizations already using AWS services.

- **NATS Streaming** is built on top of the NATS messaging system and is designed for high-throughput, reliable messaging. It supports features like publish/subscribe and message replay. NATS Streaming is known for its simplicity and low-latency characteristics.

- **MQTT** is a lightweight, open-source protocol for IoT (Internet of Things) and messaging. While not a complete streaming platform like Kafka, it is widely used for lightweight, low-bandwidth scenarios where devices need to communicate efficiently.





