echo Compiling BSK...
tar -czvf ./Support.tar.gz ./*.sh ./*.txt ./Checks ./ServerFiles
echo Done!
echo
mkdir -v ./"Not for Support - Other"/TESTS/"Test `date +%Y_%m_%d_%H_%M_%S`"
cp -pv runme.sh ./"Not for Support - Other"/TESTS/"Test `date +%Y_%m_%d_%H_%M_%S`"


read -p "Run Tests? (y/n) " RESP
if [ "$RESP" = "y" ]; then
  ./TESTS.sh 2>&1 | tee -a TestStatus.log
else
  echo "Done!"
fi








