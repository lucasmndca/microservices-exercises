# Installing the database

Our database runs on MySQL. More precisly within a docker container.

## Pre requisites

- [Docker 20.10.5 +](https://www.docker.com/get-started)
- [DBeaver](https://dbeaver.io/)

## Setup

1. Check if docker was properly installed. Press `CTRL + ALT + T` on Linux to opent the terminal or `SUPER + R` then type cmd on Windows.
2. Now run `docker -v`. You should be able to see its version. Mine is 20.10.5 at the moment of writting this guide.
3. Let's create a new container by running:

```
# Warning! This will download approximately 120MB to your computer!
$ docker run -e MYSQL_ROOT_PASSWORD=root --name dev-database -d -p 127.0.0.1:3306:3306 mysql:5.7
```

4. Check whether your container is in place:

```
$ docker ps -a
```

5. Check if you container is mapped to your host machine:

```
# On Linux
$ docker inspect dev-database | grep "HostPort" -> Should return `HostPort: 3306`
$ docker inspect dev-database | grep "HostIp" -> Should return `HostIp: 127.0.0.1`

#On Windows
$ docker inspect dev-database | findstr "HostPort" -> Should return `HostPort: 3306`
$ docker inspect dev-database | findstr "HostIp" -> Should return `HostIp: 127.0.0.1`
```

### Working with DBeaver
_If you have any questions please take a look at the picture I left for you here ./installation/workbench.png_

6. Open DBeaver
7. Create a new database connection.
8. Select "MySQL"
9. Fill the form in like this:

    - Server host: `127.0.0.1`
    - Port: `3306`
    - Username: `root`
    - Password: `root`

10. Open a new SQL script by clicking `SQL Editor > Open SQL script` or by pressing `F3` 
11. Now copy the script `./installation/installation-script.sql` and paste on DBeaver. Then select all by pressing `CTRL + A` and execute the script `ALT + X`.
12. Finally, disconnet and then reconnect once the script is run. 