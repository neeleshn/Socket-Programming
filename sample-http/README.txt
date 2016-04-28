To run the program:
----------------------------
Navigate inside the server folder and run the script with an input for number of servers.

sh start.sh <input>

then it will ask for Y value to pass to client program, just input the number and the program tells the least possible number that divides the input Y.

Sample output:
----------------------------
neeleshganan@neelux:~/Dropbox/myGit/MapRed-workspace/in-class/Week7/sample-http/server$ sh start.sh 6
starting server: 10001
starting server: 10002
starting server: 10003
starting server: 10004
starting server: 10005
starting server: 10006
Enter Y for client and press [ENTER]: 5
/home/neeleshganan/Dropbox/myGit/MapRed-workspace/in-class/Week7/sample-http/client
[info] Loading project definition from /home/neeleshganan/Dropbox/myGit/MapRed-workspace/in-class/Week7/sample-http/client/project
[info] Set current project to client (in build file:/home/neeleshganan/Dropbox/myGit/MapRed-workspace/in-class/Week7/sample-http/client/)
[info] Running main.WebClient 5
X = 5
Is a prime
[success] Total time: 7 s, completed Mar 18, 2016 9:26:09 PM
killed process with port: 10001
killed process with port: 10002
killed process with port: 10003
killed process with port: 10004
killed process with port: 10005
killed process with port: 10006

