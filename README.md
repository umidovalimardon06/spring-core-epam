# Typical Java Application Architecture

## 3-Layer Structure

| Layer    | Depends On     |
|----------|----------------|
| Web      | Business       |
| Business | Data + Web     |
| Data     | Business       |

## Key Principles

- **DIP** (Dependency Inversion Principle) → part of SOLID
- **DI** (Dependency Injection) → implemented via Spring Framework