# 📦 Java Package Access Example

This project demonstrates **access modifiers** (`protected`, `public`) and **package structure** in Java using two packages:

- `Packages.anmol`
- `Packages.anubhav`

---

## 🗂️ Project Structure

```
Packages/
├── anmol/
│   ├── first.java
│   └── innerFirstAccess.java
└── anubhav/
    └── second.java
```

---

## 🔍 Purpose

- Learn how to use **protected methods** across different packages.
- Understand **inheritance and access** of methods from parent classes in Java.
- Use of `import` statement and calling methods from other packages.

---

## 📌 How It Works

- `first.java` contains a `protected` method `show()`.
- `innerFirstAccess.java` extends `first` and adds a public method `callShow()` that accesses `show()`.
- `second.java` (in a different package) creates an object of `innerFirstAccess` to access `callShow()` and `show1()`.

---

## ✅ How to Run

1. **Compile all files:**
```bash
javac Packages/anmol/first.java Packages/anmol/innerFirstAccess.java Packages/anubhav/second.java
```

2. **Run the main class:**
```bash
java Packages.anubhav.second
```

---

## 🔐 Access Modifiers Summary

| Modifier    | Same Class | Same Package | Subclass (diff package) | Other Class |
|-------------|------------|--------------|--------------------------|-------------|
| `public`    | ✅          | ✅           | ✅                       | ✅          |
| `protected` | ✅          | ✅           | ✅                       | ❌          |
| `default`   | ✅          | ✅           | ❌                       | ❌          |
| `private`   | ✅          | ❌           | ❌                       | ❌          |

---

## 💡 Tip

To access `protected` members across packages:
- Use **inheritance** (`extends`)
- Call the protected method from a **public method** in the subclass
