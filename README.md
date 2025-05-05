# Expense Tracker – Homework 3 (CS 520 Spring 2025)

## Overview

This application is an updated version of the Expense Tracker app that applies software engineering best practices for maintainability, testability, extensibility, and debuggability. The application follows the MVC (Model-View-Controller) architectural pattern and supports both basic and advanced features as outlined in Homework 3 requirements.

This document describes how to **compile**, **run**, **test**, **generate documentation**, and details the new features implemented.

---

## Compilation Instructions

Ensure you are using `openjdk 17.0.7` or later.
```bash
New Features Implemented
1. Undo Functionality
Users can undo a transaction in two ways:

By selecting a specific transaction from the table and clicking the Undo button.

If no transaction is selected, the app removes the last added transaction.

The model tracks undo history using a stack.

The UI provides feedback if undo is not possible.

2. Enhanced Testing
Added a new test case to the TestExample.java file that attempts to remove a transaction not in the model’s list.

This test ensures the app handles invalid removals gracefully without crashing or altering state.

3. Export to CSV (Upcoming feature)
Users can export their transaction history to a .csv file.

The user is prompted for the file name, which must end with .csv.

Input validation is enforced.

A header row is included followed by one row per transaction.

Success or failure of the export is communicated via a dialog box.

This feature was implemented following the MVC pattern, open-closed principle, and UI best practices.


File Structure
.
├── src/
│   ├── controller/
│   │   ├── ExpenseTrackerController.java
│   │   └── InputValidation.java
│   ├── model/
│   │   ├── ExpenseTrackerModel.java
│   │   ├── Transaction.java
│   │   └── Filter/
│   │       ├── TransactionFilter.java
│   │       ├── AmountFilter.java
│   │       └── CategoryFilter.java
│   ├── view/
│   │   └── ExpenseTrackerView.java
│   └── ExpenseTrackerApp.java
├── test/
│   └── TestExample.java
├── lib/
│   └── junit-4.11.jar
├── jdoc/
│   └── [generated HTML files for Javadoc]
├── README.md                  ← generated earlier
├── gitlog.txt                 ← output of `git log`


Notes
The implementation uses descriptive commit messages and atomic commits.

The .git/ folder has been excluded from submission as required.







