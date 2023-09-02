# Cinema Application [🚧 Under Development 🚧]

## Introduction

The Cinema Application Backend provides an API for the frontend, making it easy for users to book movie seats in various halls. The backend also includes an admin panel for effortless management of movies and showtimes.

##  Features

### 👥 For General Users

- **User Authentication**: Secure sign-in process to ensure data privacy.
- **Movie Timetables & Dynamic Session Info**: Browse real-time listings and get comprehensive session details, including hall, movie, and time
- **Booking Process**: Engage in a streamlined booking process where you can select seats, see the price, and confirm your booking in a few easy steps.
- **Booking History**: Review your past bookings at any time to keep track of your movie experiences.
> 📣 **Note**:  Upcoming versions will include a shopping cart and payment processing features

### 🔒 For Administrators

- **Role-Based Authorization**: A specialized admin panel that is accessible only to authorized users.
- **Session Management**: Add new sessions or modify existing ones.
- **Movie Management**: Add, update, or delete movie listings in real-time.
- **Booking History**: Manage and oversee all booking records, with the option to modify or delete them.
  
## UML Diagram

<img src="https://github.com/Porkul/cinema-app/assets/86647070/0e025839-5601-43ec-b3f2-124533b1ad3d" alt="cinema-uml" width="650"/>


## 🛠 Technologies Used

### Backend
-  **Spring Boot** - The core framework used for the backend.
-  **JPA (Java Persistence API)** - For database operations.
-  **PostgreSQL** - As the database solution.
-  **Lombok** - For reducing boilerplate code in Java.


### Frontend
-  **React** - The library used for building the user interface.
-  **TypeScript** - For adding static type definitions to JavaScript, enhancing code quality and maintainability.

---

### 📘 API Endpoints

### User Authentication

- `POST /auth/register`: Registers a new user.
- `POST /auth/login`: Authenticates a user and returns a token.
- `GET /auth/user`: Fetches the authenticated user's details.

### Movie Operations

- `GET /movies`: Fetches all movies for general discovery.
- `GET /movies/{movieId}`: Fetches details of a specific movie.
- `GET /movies/popular`: Fetches popular movies.
- `GET /movies/upcoming`: Fetches movies that are coming soon.
- `GET /movies/genres/{genre}`: Fetches all movies of a specific genre.

### Booking Operations

- `POST /bookings`: Makes a new booking.
- `GET /bookings`: Fetches all bookings made by the authenticated user.
- `GET /bookings/{bookingId}`: Fetches details of a specific booking.
- `POST /bookings/{bookingId}/refund`: Requests a refund for a specific booking.

### Hall and Seat Operations

- `GET /halls`: Fetches all halls.
- `GET /halls/{hallId}`: Fetches details of a specific hall.
- `GET /halls/{hallId}/seats`: Fetches all seats in a specific hall.

### Admin Operations

#### Movie Management

- `POST /admin/movies`: Adds a new movie.
- `PUT /admin/movies/{movieId}`: Updates an existing movie.
- `DELETE /admin/movies/{movieId}`: Deletes a movie.

#### Movie Session Management

- `POST /admin/sessions`: Adds a new movie session to the timetable.
- `PUT /admin/sessions/{sessionId}`: Updates an existing session.
- `DELETE /admin/sessions/{sessionId}`: Deletes a session.

#### Customer Booking Management

- `GET /admin/bookings`: Fetches all bookings.
- `DELETE /admin/bookings/{bookingId}`: Cancels a booking.



