# wildfly-datasources

This repository provides some runnable local containerized examples of a Spring Boot application deployed into a Wildfly v.27 container using Java 17 utilizing three different datasources:
- MySQL
- Postgres
- MSSQL

When building the images for the respective datasource, make sure to provide the proper database credentials in `jboss-cli-commands.cli`, which can be passed with the `-e` flag to your `docker run..` command
