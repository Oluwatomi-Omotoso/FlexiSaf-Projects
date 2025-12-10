## Student Application CLI System

A lightweight Java-based Command Line Interface (CLI) system for managing student admission data.
This project simulates the basic workflow of an admission intake system — collecting applicant details, validating input, storing information in a text-based database, and allowing retrieval of previously stored records.

## Features

**1. Multi-Step Admission Input**
The application guides the user through several input stages:

- Personal information

- Academic background

- Guardian/parent details

Each step includes basic input validation to ensure correctness.

**2. Data storage using Text Files**

- Applicant data is saved into a structured .txt file.

- The program appends new submissions and can read back existing entries.

- Ensures simplicity and compatibility with console-based workflows.

**3. CLI Navigation**

- Simple numbered menu

- Options to create a new application, view saved applications, or exit

- Clear text prompts for a smooth user experience

## Project Structures

    ├── src
    │ └── main
    │       └── java
    │           ├── models
    │           │   └── Applicant.java
    │           ├── utils
    │           │   ├── ApplicantForm.java
    │           │   └── FileManager.java
    │           └── Main.java
    ├── applicants.txt   ← stored in project root
    ├── pom.xml          ← Maven configuration
    └── .gitignore

Main.java runs the entire program and coordinates input flow.
Helper classes handle validation, formatting, and file I/O.

## Data Handling

All applicant information is stored locally using:

    ├── src
    ├── applicants.txt ← stored in project root

## Screenshots

A /Screenshots [folder](https://github.com/Oluwatomi-Omotoso/FlexiSaf-Projects/tree/main/FinalTask/ScreenShots) has been provided, containing:

- CLI interaction examples

- Sample saved data from the applicants.txt file

## How to Run the Project

- Java 8 or newer

- A terminal/command prompt

**Run Command**

    javac Main.java
    java Main

No additional setup is required — everything runs locally on the CLI.

## Features Demonstrated in This Project

- Core Java syntax

- Class and object design

- Input validation

- File handling (read/write/append)

- CLI user experience design

