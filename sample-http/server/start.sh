#!/bin/bash
for i in `seq 1 $1`; do
   # printf "Enter X for server "$i" and press [ENTER]: "
   # read name
   k=$((i + 10000)) 
   nohup sbt "run $i" > my.log 2>&1&
   echo starting server: $k
done

sleep 30

printf "Enter Y for client and press [ENTER]: "
read input

cd ../client
pwd
sbt "run $input"

for x in `seq 1 $1`; do
   # printf "Enter X for server "$i" and press [ENTER]: "
   # read name
   # $k = {10000 + $i}
   k=$((x + 10000)) 
   kill -9 $(lsof -t -i:$k)
   echo killed process with port: $k
done