FROM maven:3.9.7-eclipse-temurin-17 as build
WORKDIR /usr/src/app
COPY . /usr/src/app

RUN mvn -f /usr/src/app/mysql/pom.xml clean package -DskipTests

FROM quay.io/wildfly/wildfly:27.0.0.Final-jdk17

COPY --from=build /usr/src/app/mysql/target/mysql-0.0.1-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/ROOT.war
COPY --from=build /usr/src/app/mysql-module.xml /opt/jboss/wildfly/standalone/configuration/mysql-module.xml
COPY --from=build /usr/src/app/jboss-cli-commands.cli /opt/jboss/wildfly/standalone/configuration/jboss-cli-commands.cli
COPY --from=build /usr/src/app/mysql-connector-j-8.4.0/mysql-connector-j-8.4.0.jar /opt/jboss/wildfly/modules
COPY --from=build /usr/src/app/execute.sh /opt/jboss/wildfly/bin/execute.sh

CMD ["/opt/jboss/wildfly/bin/execute.sh"]

