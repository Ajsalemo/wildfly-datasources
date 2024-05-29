FROM quay.io/wildfly/wildfly:27.0.0.Final-jdk17

COPY postgres-module.xml /opt/jboss/wildfly/standalone/configuration/postgres-module.xml
COPY jboss-cli-commands.cli /opt/jboss/wildfly/standalone/configuration/jboss-cli-commands.cli
COPY postgresql-42.7.3.jar /opt/jboss/wildfly/modules
COPY ./springboot/target/springboot-0.0.1-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/ROOT.war
COPY execute.sh /opt/jboss/wildfly/bin/execute.sh

CMD ["/opt/jboss/wildfly/bin/execute.sh"]

