#!/usr/bin/env bash

echo "Entering startup_script.sh.."

$JBOSS_HOME/bin/jboss-cli.sh --connect --file=/home/site/deployments/tools/jboss-cli-commands.cli