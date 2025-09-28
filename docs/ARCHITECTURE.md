
# Architecture Overview

## Main Patterns
- MVVM for UI/features
- Repository for data abstraction

## Data Flow Diagram
User → View (Compose) → ViewModel (StateFlow) ↔ Repository → Remote API/DB

## Key Modules
- Auth: Handles login/signup logic
- Transactions: Fetches and displays user transactions

## Major Decisions
- Use of StateFlow instead of LiveData for reactivity
- Room for local persistence
- Retrofit for networking
