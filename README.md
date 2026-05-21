# Student Record Management System (SRMS) - Qassim University

A professional, console-based **Student Record Management System** designed for **Qassim University** to demonstrate the execution of advanced Java development standards. This system integrates robust database flat-file mapping, core Object-Oriented Design patterns, and concurrent asynchronous execution structures to deliver an institutional-grade educational record software.

---

## 👥 Core Project Team & Contribution Matrix

In alignment with the coursework evaluation framework, architectural duties were distributed strategically based on software engineering disciplines:

1. **The Architect (Student 1)**
   * **Engineering Focus:** Core object graph modeling, foundational domain logic, and polymorphic interfaces.
   * **Code Contributions:** Designed base structure components `Person.java`, child domain models `Student.java`, and runtime state context `SRMS.java`.
   * **OOP Realization:** Structured core hierarchical Is-A inheritance, private encapsulated field bounds, and dynamic runtime method overriding (`displayInfo`).

2. **The Data & Logic Expert (Student 2)**
   * **Engineering Focus:** Asynchronous background concurrency execution, exception isolation, and persistent flat-file serialization.
   * **Code Contributions:** Built `StudentFileManager.java` mapping dynamic streams to flat disk architectures, and managed the `AutoSaveThread.java` lifecycle thread container.
   * **Technical Realization:** Isolated computational race conditions by deploying a dedicated daemon-style thread execution path operating at periodic intervals (`30,000ms`), securely bound inside transactional structural try-catch units.

3. **The Quality & Docs Lead (Student 3 - Salwa)**
   * **Engineering Focus:** Analytical queries, multi-criteria structural data reporting, release engineering, and deployment standard enforcement.
   * **Code Contributions:** Engineered sequential filtering runtime algorithms inside `SRMS.java` (`displayStudentsByGpa`, `displayStudentsByDepartment`, `displayStudentsByYear`).
   * **Technical Realization:** Established the centralized repository workspace, maintained safe continuous workspace environments via git sub-branch tracking (`architect-branch`, `data-expert-branch`, `quality-docs-branch`), managed pull request checkouts, integrated conflict resolution sweeps, and took ownership of deployment documentation structures.

---

## 🛠️ System Design & OOP Principles Applied

* **Inheritance:** `Student` structurally extends `Person` to optimize attribute mapping and logic reuse.
* **Encapsulation:** Protects user variables behind strict `private` storage tiers exposed explicitly through validating accessors (Getters/Setters).
* **Polymorphism:** Run-time polymorphic execution is demonstrated through dynamic overriding on collection parsing arrays.
* **Composition:** The state manager engine utilizes structural Composition, maintaining a strong Has-A layout via encapsulation of structural collections (`List<Student>`).
* **Concurrency (Multithreading):** Deploys safe parallel runtime logic via a decoupled worker execution process ensuring automatic background state updates without degrading primary prompt cycles.

---

## 🚀 Compilation, Run, & Testing Instructions

As strictly demanded by the course deliverables, the following instructions outline how to compile, execute, and test the system locally via the command-line interface.

### Prerequisites
* Ensure Java Development Kit (JDK 8 or higher) is installed.
* Verify environment variables are configured (`java -version` and `javac -version` should be active).

### Step 1: Compilation
Open your terminal or command prompt, navigate to the extracted root directory containing the source files, and run the following command to compile all Java files into executable bytecode:
```bash
javac *.java
