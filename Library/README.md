# Library Catalog System

This project demonstrates core Object-Oriented Programming (OOP) concepts such as inheritance, polymorphism, and encapsulation by managing different types of library items (Books and DVDs) within a unified catalog tracking system.

## Features

- **Polymorphic Catalog:** Manage both **Books** (with author tracking) and **DVDs** (with duration tracking) under a unified system.
- **Dynamic Inventory Management:** Add new items with custom IDs, titles, and unique attributes to the catalog.
- **Real-Time Status Tracking:** Display all library materials instantly alongside their availability status (`Available` vs. `Checked Out`).
- **Interactive Checkouts:** Dynamically update item status to prevent double-checking an item already in use.
- **Intuitive CLI Menu:** A continuous user loop driven by a user-friendly console command-line interface.

---

## 💻 Sample Console Output & Execution

Here is a live demonstration of how the application operates in the console, showcasing item additions, catalog listing, and the checkout mechanism:

```text
====== LIBRARY CATALOG =========
1. Add Item
2. View Catalog
3. Checkout Item
4. Return Item
5. Exit
Choose option (1-5): 1
Choose type (1 for Book, 2 for DVD): 1
Enter ID: 501
Enter Title: Java
Enter Author: Unknown
Book Added!

====== LIBRARY CATALOG =========
1. Add Item
2. View Catalog
3. Checkout Item
4. Return Item
5. Exit
Choose option (1-5): 1
Choose type (1 for Book, 2 for DVD): 2
Enter ID: 702
Enter Title: Unique
Enter Duration (minutes): 14
DVD Added!

====== LIBRARY CATALOG =========
1. Add Item
2. View Catalog
3. Checkout Item
4. Return Item
5. Exit
Choose option (1-5): 2
ID: 501 | Title: Java | Status: Available | Author: Unknown [Type: Book]
ID: 702 | Title: Unique | Status: Available | Duration: 14 mins [Type: DVD]

====== LIBRARY CATALOG =========
1. Add Item
2. View Catalog
3. Checkout Item
4. Return Item
5. Exit
Choose option (1-5): 3
Enter Item ID to checkout: 702
Success! 'Unique' has been checked out.

====== LIBRARY CATALOG =========
1. Add Item
2. View Catalog
3. Checkout Item
4. Return Item
5. Exit
Choose option (1-5): 2
ID: 501 | Title: Java | Status: Available | Author: Unknown [Type: Book]
ID: 702 | Title: Unique | Status: Checked Out | Duration: 14 mins [Type: DVD]

====== LIBRARY CATALOG =========
1. Add Item
2. View Catalog
3. Checkout Item
4. Return Item
5. Exit
Choose option (1-5): 4
Enter Item ID to return: 702
Success! 'Unique' has been returned.

====== LIBRARY CATALOG =========
1. Add Item
2. View Catalog
3. Checkout Item
4. Return Item
5. Exit
Choose option (1-5): 2
ID: 501 | Title: Java | Status: Available | Author: Unknown [Type: Book]
ID: 702 | Title: Unique | Status: Available | Duration: 14 mins [Type: DVD]
```

