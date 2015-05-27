
LANG="$(sed -n '1p' info.yml)"
if [ "$LANG" = "lang: java" ]; then
  mvn clean install

fi