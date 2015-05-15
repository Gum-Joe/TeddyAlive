echo Teddy alive v0.1 ALPHA EMULATOR
echo Preparing...
echo "Hello, Welcome"
echo -n Enter the login to use...
read login

$loginprompt=$login


echo Please login...
read RESP
if [ "$RESP" = $loginprompt ]; then 
   echo "Correct!"
 else 
   echo "Incorrect" 
 fi 



