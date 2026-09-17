# Multi Threading

A small Java project demonstrating core multi-threading concepts through standalone
demo programs. Each file in `src/` focuses on one thread-related topic, intended for
learning and experimentation.

## Topics covered

| Demo file | Concept demonstrated |
|-----------|----------------------|
| `Main.java` | Getting/setting thread name and priority |
| `MyThread.java` | Creating a thread by extending `Thread`, using `Thread.yield()` and `Thread.sleep()` |
| `MyThread3.java` | A thread that sleeps before printing |
| `yeildDemo.java` | Yielding the CPU to let the main thread run |
| `MyTask.java` / `MyTask2.java` | Creating threads via the `Runnable` interface |
| `joinDemo.java` / `MyThread2.java` | `Thread.join()` — making one thread wait for another to finish |
| `InterCommDemo.java` | Inter-thread communication using `wait()` / `notify()` |
| `SynchronizationDemo.java` + `Synchronization_thread1/2.java` + `Table.java` | `synchronized` blocks protecting a shared resource |
| `SharedResource.java` | Placeholder for a shared resource class |

## Running the demos

The project is a plain Java project (no build tool configured). Compile and run any
demo from the `src` directory:

```bash
cd src
javac Main.java
java Main
```

Replace `Main.java` with the name of the demo you want to run (e.g. `javac joinDemo.java && java joinDemo`).

## Notes

- All demos are self-contained; each compiles to its own `.class` files in `src/`.
- Output ordering between threads is non-deterministic by design — that is part of
  what these programs illustrate.
- The working tree currently has an uncommitted change to `src/InterCommDemo.java`
  (a typo fix `thradDemo` → `ThreadDemo` plus some comment/cleanup edits).

## Project structure

```
Multi Threading/
├── .git/
├── .gitignore
├── .idea/                  # IntelliJ IDEA project settings
├── "Multi Threading.iml"   # IntelliJ module file
├── out/                    # Compiled output (git-ignored)
└── src/
    ├── Main.java
    ├── MyThread.java
    ├── MyThread2.java
    ├── MyThread3.java
    ├── MyTask.java
    ├── MyTask2.java
    ├── joinDemo.java
    ├── yeildDemo.java
    ├── InterCommDemo.java
    ├── SynchronizationDemo.java
    ├── Synchronization_thread1.java
    ├── Synchronization_thread2.java
    ├── Table.java
    └── SharedResource.java
```