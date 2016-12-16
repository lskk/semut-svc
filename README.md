# Semut: Smart City and Intelligent Transportation System

This is the backing service for Semut. Primary protocol is HTTP REST,
however additional communication channels using RabbitMQ and gRPC may be available.

## Menjalankan di development

Set environment variables sebagai berikut di IntelliJ IDEA launch configuration:

    SPRING_PROFILES_ACTIVE=development
    MYSQL_URI=jdbc:mysql://localhost/bsts_new?user=root&password=
