if [ -f ./*/target ] then;
git branch Gum-Joe-travis-jars
git checkout Gum-Joe-travis-jars
git add *
git commit -m "push travistest jars"
git push origin
