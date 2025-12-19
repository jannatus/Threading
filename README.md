# Lab Report: Threading and Synchronization in Java

## Highlight
This lab demonstrates *multithreading in Java*, focusing on:
- *Thread creation*: using both Thread subclass (NumberThread) and Runnable interface (SquareThread).
- *Shared resource management*: using a synchronized method in SharedCounter.
- *Race condition prevention* and *thread-safe counter updates*.
- *Interleaved thread execution* while maintaining consistent counter values.

## Installation
1. Ensure *Java JDK 8+* is installed.  
2. Clone or download the repository:

```bash
git clone <your-repo-url>
cd <repo-folder>
## Usage

Run the program to observe *multithreading and synchronized counter updates*.

### Steps:

1. *Compile all Java files*:

```bash
javac ThreadingDemo.java NumberThread.java SquareThread.java SharedCounter.java
Contribution

Contributions are welcome! You can:
	•	Add more thread types demonstrating synchronization.
	•	Implement thread priority handling.
	•	Enhance output formatting for better visualization.
	•	Add unit tests to verify counter correctness.

To contribute:
	1.	Fork the repository.
	2.	Create a new branch (git checkout -b feature-branch).
	3.	Commit your changes (git commit -am 'Add feature').
	4.	Push to the branch (git push origin feature-branch).
	5.	Open a pull request.
