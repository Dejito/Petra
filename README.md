# Petra

An Android native application modeling clean architecture principles and best practices.

## Overview

Petra is a modern Android application built with Kotlin that demonstrates clean architecture patterns, including proper separation of concerns, dependency injection, and reactive programming. The application showcases best practices for building scalable and maintainable Android applications.

## Features

- **Clean Architecture**: Organized into presentation, domain, and data layers
- **Jetpack Compose**: Modern UI framework for building native Android interfaces
- **Kotlin**: 100% Kotlin codebase
- **Dependency Injection**: Koin for lightweight and practical dependency injection
- **Reactive Programming**: Coroutines and Flow for asynchronous operations
- **Product Management**: Browse and view detailed product information

## Architecture

The application follows Clean Architecture principles with the following layers:

### Presentation Layer
- **Views/Screens**: Composable UI components built with Jetpack Compose
- **ViewModel**: Manages UI state and business logic communication
- **Navigation**: Router-based navigation system

### Domain Layer
- **Use Cases**: Business logic and application rules
- **Models**: Domain entities and data transfer objects

### Data Layer
- **Repository**: Abstract data access patterns
- **Models**: API response and database entities
- **Remote/Local Data Sources**: API calls and local storage

## Project Structure

```
app/src/main/java/com/mobile/petra/
├── presentation/
│   ├── views/
│   │   ├── products/
│   │   │   └── screens/
│   │   │       └── ProductDetailScreen.kt
│   │   └── components/
│   ├── viewmodel/
│   │   └── product/
│   │       └── ProductsViewModel.kt
│   └── ui/
├── domain/
│   ├── model/
│   └── usecase/
├── data/
│   ├── model/
│   │   └── response/
│   ├── repository/
│   └── source/
└── router/
    └── Navigator.kt
```

## Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Dependency Injection**: Koin
- **Image Loading**: Coil
- **Architecture Pattern**: Clean Architecture
- **Asynchronous Programming**: Kotlin Coroutines & Flow

## Getting Started

### Prerequisites

- Android Studio (latest version recommended)
- Android SDK 21 or higher
- Kotlin 1.9 or higher

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/Dejito/Petra.git
   ```

2. Open the project in Android Studio

3. Sync Gradle files

4. Run the application on an emulator or physical device

## Key Components

### ProductDetailScreen
Located at `app/src/main/java/com/mobile/petra/presentation/views/products/screens/ProductDetailScreen.kt`

Displays detailed product information including:
- Product image
- Item name
- Price
- Category
- Detailed description
- Responsive design with vertical scrolling

### ProductsViewModel
Manages product data and state using coroutines and Flow for reactive updates.

## Usage

### Navigating to Product Details

The application uses a router-based navigation system. Navigate to the product detail screen using:

```kotlin
navigator.navigateUp() // Navigate back
```

### Fetching Products

Products are fetched using the ViewModel:

```kotlin
productsViewModel.fetchProducts()
```

## Contributing

Contributions are welcome! Please follow these guidelines:

1. Follow Kotlin coding conventions
2. Maintain clean architecture principles
3. Write clear commit messages
4. Test your changes thoroughly

## Future Enhancements

- [ ] Product search and filtering
- [ ] Shopping cart functionality
- [ ] User authentication
- [ ] Payment integration
- [ ] Product reviews and ratings
- [ ] Offline support with local caching

## License

This project is open source and available under the MIT License.

## Author

**Dejito** - [GitHub Profile](https://github.com/Dejito)

## Support

For issues, questions, or suggestions, please open an issue on the GitHub repository.

---

Built with ❤️ using Kotlin and Jetpack Compose
