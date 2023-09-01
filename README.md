# Cinema Application [🚧 Under Development 🚧]

## Introduction

The Cinema Application Backend serves as the API layer for the frontend to interact with. This application allows users to book seats for movies in various halls. Users can view available movies, select seats, and make bookings. Additionally, an admin panel is available for managing movie listings.

## 🌟 Features

### 👥 For General Users

- **User Authentication**: Secure sign-in process to ensure data privacy.
- **Movie Timetables**: Real-time listings of movies and their timings.
- **Dynamic Session Info**: View details like hall, movie, and time to make an informed choice.
- **Hall and Seat Selection**: Choose your favorite hall and seats for your movie experience.
- **Booking Process**: Engage in a streamlined booking process where you can select seats, see the price, and confirm your booking in a few easy steps.
- **Booking History**: Review your past bookings at any time to keep track of your movie experiences.

### 🔒 For Administrators

- **Role-Based Authorization**: A specialized admin panel that is accessible only to authorized users.
- **Session Management**: Add new sessions or modify existing ones.
- **Movie Management**: Add, update, or delete movie listings in real-time.
- **Booking History**: Manage and oversee all booking records, with the option to modify or delete them.
  
## UML Diagram

<img src="https://github.com/Porkul/cinema-app/assets/86647070/0e025839-5601-43ec-b3f2-124533b1ad3d" alt="cinema-uml" width="650"/>


## 🛠 Technologies Used

- Spring Boot
- JPA (Java Persistence API)
- PostgreSQL
- Lombok

---

### 📘 Admin Panel Guide

Authorized administrators can log into the admin panel to manage movies. The admin panel provides functionalities to add new movies to the database, update existing movie details, and remove movies.

- `POST /admin/movies` - To add a new movie
- `PUT /admin/movies/{movieId}` - To update an existing movie
- `DELETE /admin/movies/{movieId}` - To delete a movie

These endpoints are secured so that only users with admin roles can access them.


