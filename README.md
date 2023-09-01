# Cinema Application [🚧 Under Development 🚧]

## Introduction

The Cinema Application Backend serves as the API layer for the frontend to interact with. This application allows users to book seats for movies in various halls. Users can view available movies, select seats, and make bookings. Additionally, an admin panel is available for managing movie listings.

## Features

- User authentication
- Role-based authorization
    - Admin panel for authorized users
- Movie listing
- Hall and seat selection
- Booking confirmation
- Admin Panel Features
    - Add new movies
    - Update existing movies
    - Delete movies
  
## UML Diagram

    +--------------------+           +---------------------+
    |     User           |           |     Role            |
    +--------------------+           +---------------------+
    | - userId: Integer  |< >---|< >-| - roleId: Integer   |
    | - username: String |           | - authority: String |
    | - password: String |           +---------------------+
    +--------------------+           
            |                            
            | 1                          
            | *
    +-------------------+           
    |     Booking       |          
    +-------------------+          
    | - bookingId: Long |          
    | - user: User      |          
    | - movie: Movie    |          
    | - hall: Hall      |          
    +-------------------+          
            |                        
            | 1                      
            | 1                      
    +---------------------+            +------------------------+
    |     Hall            |            |     Movie              |
    +---------------------+            +------------------------+
    | - hallId: Long      |< >------| *| - movieId: Long        |
    | - hallName: String  |            | - movieName: String    |
    | - seats: List<Seat> |            | - image: String        |
    | - bookings:         |            | - movieDetails: String |
    |     List<Booking>   |            +------------------------+
    +---------------------+           
            |                                  
            | 1                                
            | *
    +------------------------+             
    |     Seat               |             
    +------------------------+             
    | - seatId: Long         |             
    | - seatNumber: Integer  |           
    | - isAvailable: Boolean |          
    | - hall: Hall           |             
    +------------------------+              
            |                                 
            | *
            | *
    +-----------------+                     
    |     Genre       |                     
    +-----------------+                     
    | - id: Long      |                     
    | - name: String  |                     
    +-----------------+ 

## Entities and Relationships

### Entities

1. **User**
   - `userId`: Integer (Primary Key)
   - `username`: String
   - `password`: String (Hashed)
   - **Relationships:**
      - `OneToMany` with `Booking`: One user can have multiple bookings.

2. **Role**
   - Commonly used for authority management.
   - **Relationships:**
      - `ManyToMany` with `User`: Multiple users can have the same role.

3. **Movie**
   - `movieId`: Long (Primary Key)
   - `movieName`: String
   - `image`: String
   - `movieDetails`: String
   - **Relationships:**
      - `OneToMany` with `Booking`: One movie can have multiple bookings.

4. **Hall**
   - `hallId`: Long (Primary Key)
   - `hallName`: String
   - **Relationships:**
      - `OneToMany` with `Seat`: One hall can have multiple seats.
      - `OneToMany` with `Booking`: One hall can have multiple bookings.

5. **Seat**
   - `seatId`: Long (Primary Key)
   - `seatNumber`: Integer
   - `isAvailable`: Boolean
   - **Relationships:**
      - `ManyToOne` with `Hall`: Many seats belong to one hall.
      - `ManyToMany` with `Booking`: One booking can have multiple seats.

6. **Booking**
   - `bookingId`: Long (Primary Key)
   - **Relationships:**
      - `ManyToOne` with `User`: One booking belongs to one user.
      - `ManyToOne` with `Movie`: One booking is for one movie.
      - `ManyToOne` with `Hall`: One booking takes place in one hall.
      - `ManyToMany` with `Seat`: One booking can have multiple seats.

---

## Technologies Used

- Spring Boot
- JPA (Java Persistence API)
- PostgreSQL
- Lombok

---

### How the Admin Panel Works

Authorized administrators can log into the admin panel to manage movies. The admin panel provides functionalities to add new movies to the database, update existing movie details, and remove movies.

- `POST /admin/movies` - To add a new movie
- `PUT /admin/movies/{movieId}` - To update an existing movie
- `DELETE /admin/movies/{movieId}` - To delete a movie

These endpoints are secured so that only users with admin roles can access them.


