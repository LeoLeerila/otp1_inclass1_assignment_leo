# Inclass Assignment 

## Assignment Description

Users need a temperature calculator.

Requirements:
 - Convert Celsius to Fahrenheit
 - Convert Fahrenheit to Celsius
 - Convert Kelvin to Celsius
 - Check if a temperature is extreme

Deliverables in this task
 - README.md

## Technologies

- Frontend: JavaFX 20.0.1
- Backend: Java JDK 17 or newer
- Database: MariaDB
- Other tools:
  - Maven 3.9.16
  - Docker
  - Jenkins

## Design & Development Methodology

##### Database

The database was implemented to store conversion settings and results thus the database was implemented after the core functionality of the Temperature converter program.

##### GUI

The GUI was implemented to display stored conversion settings and results thus the GUI was implemented after the database functionality.

## Functional Testing

The program was tested with unit tests and manual testing with different input values to ensure the program works.

## Setup & Execution

### Docker image

requirements:
 - docker
 - X server (linux)
 - [Xming](https://sourceforge.net/projects/xming/) (windows)

#### 1. Setup MariaDB

Create a `docker-compose.yml` file containing the following text
```
services:

  db:
    image: mariadb
    restart: unless-stopped
    environment:
      MARIADB_ROOT_PASSWORD: example
    ports:
      - 3306:3306

  adminer:
    image: adminer
    restart: unless-stopped
    ports:
      - 8000:8080
```

Open a terminal in the same folder as the docker-compose.yml file

Start the Mariadb container with `docker compose up -d`

#### 2. Create database in MariaDB

Open http://localhost:8000/

Sign in to MariaDB with username `root` and password `example`

##### Create icdb database

Create a new database by selecting `Create Database`

Insert `icdb` to the text field and press `Save`

#### 3. Add tables

Create a new table in the database by selecting `Create table`

##### History table

Insert `history` to the text field next to `Table name`

add Columns
 - Column name, Type, Length, Options, NULL, AI
 - `id`, `int`, ` `, ` `, ` `, `check`
 - `originalType`, `text`, ` `, ` `, ` `, ` `
 - `originalDegree`, `double`, ` `, ` `, ` `, ` `
 - `extreme`, `bit`, ` `, ` `, ` `, ` `
 - `convertedType`, `text`, ` `, ` `, ` `, ` `
 - `convertedDegree`, `double`, ` `, ` `, ` `, ` `
 - `id`, `int`, ` `, ` `, ` `, ` `

Save the table by pressing `Save`

##### Degree Type table

Insert `degree_type` to the text field next to `Table name`

add Columns
 - Column name, Type, Length, Options, NULL, AI
 - `id`, `int`, ` `, ` `, ` `, `check`
 - `type_name`, `text`, ` `, ` `, ` `, ` `

Save the table by pressing `Save`

Add temperature types by selecting `New item`

Add `C` to the text field next to `type_name`

Insert the item and create a new item by selecting `Save and insert next`


Add `F` to the text field next to `type_name`

Insert the item and create a new item by selecting `Save and insert next`


Add `K` to the text field next to `type_name`

Insert the item by selecting `Save`



#### 3. Setup X server

##### Windows

Download and install [Xming](https://sourceforge.net/projects/xming/)

Start XLaunch

Use default setting in XLaunch

##### Linux

Download and install `xorg-xhost` if you have X server

or

Download and install `xorg-xwayland` and `xorg-xhost` if you have Wayland

Run `xhost +local:`

#### 4. Download docker image

`docker pull leoleerila/otp1:v2`

#### 5. Start the docker image

##### Windows

Run
`docker run --network=host --rm -e DISPLAY=host.docker.internal:0 leoleerila/otp1:v2`

##### Linux

Run
`docker run --network=host --rm -e DISPLAY=:1 leoleerila/otp1:v2`