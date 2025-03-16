# PlaySphere IPL

## Overview
**PlaySphere IPL** is a **Java-based IPL Player Management System** built using the **Set collection framework** to efficiently store and manage player data. The system follows a **layered architecture** comprising **Entity, DAO, Service, Controller, and Client layers**, ensuring modularity and scalability.

## Key Features
- **Get All Players** – Retrieve a complete list of IPL players.
- **Get CSK Players** – Display all players from **Chennai Super Kings (CSK)**.
- **Get MI Players** – Display all players from **Mumbai Indians (MI)**.
- **Get RCB Players** – Display all players from **Royal Challengers Bangalore (RCB)**.
- **Get Most Run Players** – Fetch players with the **highest runs** in the tournament.
- **Get Least Run Players** – Fetch players with the **lowest runs** in the tournament.
- **Get Most Wickets Players** – Fetch players with the **highest wickets** taken.
- **Get Least Wickets Players** – Fetch players with the **lowest wickets** taken.

## Architecture Overview
The project follows a **layered architecture**:

### 1. Entity Layer
Defines the **Player** entity with attributes like:
- `jerseyno`
- `name`
- `teamname`
- `runs`
- `wickets`

### 2. DAO (Data Access Object) Layer
- Manages **player data storage and retrieval**.
- Uses a **Set collection** for efficient lookups and to avoid duplicates.

### 3. Service Layer
- Implements **business logic** to process and filter data based on different criteria.
- Provides methods to fetch specific player details.

### 4. Controller Layer
- Acts as an **interface between the service layer and the client**.
- Handles requests and calls appropriate service methods.

### 5. Client Layer
- Provides **CLI or API-based user interaction**.
- Allows users to **execute queries and view player statistics**.

## Performance & Optimization
- **Uses Set collection** for **fast retrieval and efficient lookups**.
- **Avoids duplicates**, ensuring data integrity.
- **Optimized filtering methods** for better performance.

## Technologies Used
- **Java (Core Collections - Set Framework)**
- **OOP Principles**
- **Layered Architecture**

## Contributing
Contributions are welcome! Feel free to **fork**, **submit issues**, or **create pull requests**.

---

🚀 **PlaySphere IPL** – A professional IPL Player Management System built with Java!
