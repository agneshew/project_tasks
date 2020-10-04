#!/usr/bin/env bash

export RUNCRUD_HOME=/Users/agnieszkahewusz/Desktop/tasks

stop_runcrud()
{
  $RUNCRUD_HOME/runcrud.sh stop
}

start_runcrud()
{
  $RUNCRUD_HOME/runcrud.sh start
  end
}

open() {
  if start_runcrud; then echo "Started runcrud"
  else
    echo "cannot start_runcrud"
    fail
  fi
}

open_safari() {
  if /usr/bin/open -a Safari http://localhost:8080/crud/v1/task/getTasks; then echo "Opened Safari"
  else
    echo "cannot open_safari"
    fail
  fi
}

fail() {
  echo "There were errors"
}

end() {
  echo "Work is finished"
}

if open; then open_safari
else
   stop_runcrud
   fail
fi