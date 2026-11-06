# Java Gradle Application Deployment on AWS EC2

## 1. Project Overview

This project demonstrates how to build a Java application using Gradle and deploy it to an AWS EC2 Ubuntu server.

The application runs as a Linux systemd service under a dedicated Linux user. The service is configured to start automatically during server boot and restart when the application fails unexpectedly.

### Project Objectives

- Build a Java application using Gradle.
- Package the application into a JAR file.
- Provision an AWS EC2 Ubuntu server.
- Install Java 21 on the EC2 instance.
- Create a dedicated Linux user for the application.
- Transfer the JAR file securely using SCP.
- Configure and manage the application using systemd.
- Verify application logs, automatic recovery and startup after reboot.

## 2. Architecture

```text
Local WSL Ubuntu
      |
      | Gradle build
      v
   app.jar
      |
      | SCP over SSH
      v
AWS EC2 - Ubuntu 26.04
      |
      v
Java 21 Runtime
      |
      v
systemd Service
      |
      v
Java Application
(Runs as javaapp user)
```

## 3. Technology Stack

| Technology | Purpose |
|---|---|
| Java 21 | Application runtime |
| Gradle 9.8.2 | Build automation |
| Ubuntu 24.04.3 | Local development environment |
| Ubuntu 26.04 | EC2 operating system |
| AWS EC2 | Cloud virtual server |
| SSH | Secure remote connection |
| SCP | Secure file transfer |
| systemd | Linux service management |
