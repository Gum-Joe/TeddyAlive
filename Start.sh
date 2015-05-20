echo Teddy alive v0.1 ALPHA EMULATOR
echo "Hello!"
echo
echo "Please login... "
read RESP
if [ "$RESP" = $loginprompt ]; then 
   echo "Correct! Running..."
   java -jar ./bin/TeddyAlive.jar
 else 
   echo "Incorrect" 
   echo "Please type it correctly"
   Start.sh
 fi 



