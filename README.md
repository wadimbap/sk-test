# Spring Boot test task for Superkassa

### Описание
Простое Spring Boot приложение для работы с JSONB в PostgreSQL, поддерживающее атомарное обновление значений и возврат результата через REST API.

### Требования
- Java 21
- PostgreSQL 15
- Maven 3.9.2
- Docker & Docker Compose

### Установка

1. Клонируйте репозиторий:
    ```bash
    git clone https://github.com/your-repo.git
    cd your-repo
    ```

2. Сборка контейнера:
    ```bash
    docker-compose build
    ```

3. Запуск контейнер:
    ```bash
    docker-compose up
    ```

### API

- **POST http://localhost:8080/modify**
    - **Запрос:** 
        ```json
        {
            "id": 1,
            "add": 5
        }
        ```
    - **Ответ:** 
        ```json
        {
            "current": 5
        }
        ```

### Остановка и удаление контейнеров

```bash
docker-compose down
