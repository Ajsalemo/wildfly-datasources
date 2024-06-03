FROM maven:3.9.7-eclipse-temurin-17 as build
WORKDIR /usr/src/app
COPY . /usr/src/app

RUN mvn -f /usr/src/app/sql/pom.xml clean package -DskipTests

FROM quay.io/wildfly/wildfly:27.0.0.Final-jdk17

COPY --from=build /usr/src/app/sql/target/sql-0.0.1-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/ROOT.war
COPY --from=build /usr/src/app/sqlserver-module.xml /opt/jboss/wildfly/standalone/configuration/sqlserver-module.xml
COPY --from=build /usr/src/app/jboss-cli-commands.cli /opt/jboss/wildfly/standalone/configuration/jboss-cli-commands.cli
COPY --from=build /usr/src/app/sqljdbc_12.6/enu/jars/mssql-jdbc-12.6.2.jre11.jar /opt/jboss/wildfly/modules
COPY --from=build /usr/src/app/execute.sh /opt/jboss/wildfly/bin/execute.sh

CMD ["/opt/jboss/wildfly/bin/execute.sh"]

