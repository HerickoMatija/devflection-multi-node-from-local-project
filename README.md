# Multi-node environment with a load balancer from a local Java project war

This repository is an example project to show how we can quickly create a highly-available backend service from a local project that builds a war.

# How to run

To start we need to package the local project. 
To do that go into the local-project folder with

    cd local-project
  
Then we need to run mvn pacakge
  
    ./mvnw package 
    or 
    ./mvnw.cmd package 
 
After that we go back up to the root folder

    cd ..

And we run docker-compose up to start up 3 instances of the app with a nginx load-balancer.

    docker-compose up

You can read more about the idea in the accompanying [blog post](https://devflection.com/posts/2023-01-16-docker-compose-multi-node-local-project).