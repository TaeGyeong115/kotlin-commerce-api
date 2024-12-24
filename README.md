## [프로젝트 문서](https://ivy-october-fe6.notion.site/Wanted-pre-onboarding-challenge-back-end-20-8c4abf19c63e41cfb0cd43d49306fb41?pvs=4)


### [ 환경 세팅 ]
  
Docker - MySQL 실행 
``` 
docker run -p 3306:3306 --name spring-commerce -e MYSQL_ROOT_PASSWORD=pass -e MYSQL_DATABASE=spring-commerce -e MYSQL_USER=taylor -e MYSQL_PASSWORD=pass -d mysql

docker exec -i -t spring-commerce bash
mysql -u taylor -p
use spring-commerce
```
