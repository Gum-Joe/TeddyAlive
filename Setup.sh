echo Teddy alive v0.1 ALPHA EMULATOR
echo Preparing...
echo "Hello, Welcome"
echo -n Enter the login to use...
read login

export $loginprompt=$login


echo Please login...
read RESP
if [ "$RESP" = $loginprompt ]; then 
   echo "Correct! Running..."
   curl link_to_setup.jar -o ./TeddyAliveSetup.jar
   java -jar ./TeddyAliveSetup.jar
 else 
   echo "Incorrect"
   echo Please type the correct the one.
 fi 
