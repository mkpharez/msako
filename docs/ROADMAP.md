
# ***Android E-Wallet & M-Sacco Fintech App Development RoadMap(MVVM-Centric)***

## 🚀MSE10 2025 — MVP Launch (MVVM Foundations)
- [ ] **User Authentication**  
    - MVVM: ViewModel with StateFlow for UI state, sealed classes for events
    - Repository for login/signup API
    - Compose UI observes ViewModel
- [ ] **Session Persistence**
    - ViewModel restores state from DataStore
    - Repository abstracts DataStore/remote token logic
- [ ] **User Profile**
    - MVVM: Editable profile via ViewModel / Repository pattern
    - UI state (loading, editing, error)
- [ ] **Wallet Dashboard**
    - ViewModel exposes balance, recent transactions (StateFlow)
    - Repository fetches from remote, caches locally
- [ ] **Send/Receive Money**
    - Multi-step Compose UI, wizard state in ViewModel
    - Repository handles transfer, error mapping

---

## 🏁MSE11 2025 — Expansion (Advanced MVVM)
- [ ] **Transaction List Paging**
    - ViewModel manages paged state, combines flows
    - Repository with remote + cache source of truth
- [ ] **Notifications & 2FA**
    - Push notification token via Repository
    - 2FA flows: ViewModel orchestrates steps/events
- [ ] **Theming & Accessibility**
    - ViewModel manages theme state (dark/light/system)
    - Accessibility events as one-off effects

---

## ⏳MSE12 2025(Future) — Hardening & Advanced Features
- [ ] **Analytics**
- [ ] **Rewards/Loyalty**
- [ ] **Bill Payments**— MVP Launch (MVVM Foundations)
- [ ] **User Authentication**  
    - MVVM: ViewModel with StateFlow for UI state, sealed classes for events
    - Repository for login/signup API
    - Compose UI observes ViewModel
- [ ] **Session Persistence**
    - ViewModel restores state from DataStore
    - Repository abstracts DataStore/remote token logic
- [ ] **User Profile**
    - MVVM: Editable profile via ViewModel / Repository pattern
    - UI state (loading, editing, error)
- [ ] **Wallet Dashboard**
    - ViewModel exposes balance, recent transactions (StateFlow)
    - Repository fetches from remote, caches locally
- [ ] **Send/Receive Money**
    - Multi-step Compose UI, wizard state in ViewModel
    - Repository handles transfer, error mapping

---

## 🛣️MSE13 2025/26 Future — Hardening & Advanced Features
- [ ] **Analytics**
- [ ] **Rewards/Loyalty**
- [ ] **Bill Payments**
