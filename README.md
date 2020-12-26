# Getting Started


# bkn-launch

Database image

$ docker pull postgres:12-alpine 

$ docker run -p 5435:5432 --name bkn-launch-pg12 --network bkn-net -e POSTGRES_PASSWORD=Famo2369 -e POSTGRES_DB=db_bkn_launch postgres:12-alpine
