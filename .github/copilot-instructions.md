Repository purpose
- Collection of Java solutions for data-structures & algorithms (topic folders: Arrays, Hashing, Sorting, Recurssion, Misc, Basic Maths).
- Each problem folder commonly contains a .java source, compiled .class artifact, and optional input.txt/output.txt sample I/O.

Build / test / lint commands
- Compile a single source (from the file's directory):
  javac FileName.java
- Run that program reading the sample input file (from the same directory):
  java FileName < input.txt > output.txt
- One-step compile+run (from file dir):
  javac FileName.java && java FileName < input.txt > output.txt
- Compile all Java files in the repo (no build tool used here):
  find . -name "*.java" -print | xargs javac
- Enable additional compiler warnings while compiling a file:
  javac -Xlint FileName.java
- VS Code Task (preconfigured): Task label "compile and run java" — runs the same compile+run command for the active file (use Run Task / Ctrl+Shift+B).
- Note: there is no test framework or lint config committed. To run a "single test" run the program for that problem's input.txt as shown above.

High-level architecture
- Topic-oriented layout: each subfolder groups solutions by algorithm or topic (Arrays, Sorting, etc.).
- Solutions are standalone Java programs expecting stdin input; sample input.txt/output.txt files next to the source are used as example test cases.
- No project build system (Maven/Gradle). Sources are compiled and run per-file or via bulk javac commands.

Key conventions and repo-specific patterns
- File naming often encodes problem sources (e.g., LC136 for LeetCode ID). Prefer editing .java files only; .class files are compiled artifacts and should not be edited.
- Execution assumes current working directory = folder containing the .java and input.txt. Copilot suggestions that change I/O behavior should preserve stdin/stdout usage unless a migration to a test harness is intended.
- Keep workspace-only files (e.g., .vscode/settings.json) out of commits when they contain local values. Avoid suggesting changes that leak workstation secrets.
- Because compiled .class files are committed, Copilot should avoid recommending mass changes that require removing or regenerating .class files unless explicitly requested.

Useful notes for Copilot sessions
- When asked to run or test code, prefer the per-directory compile+run pattern above.
- When suggesting project-level changes (tests, build tool), note there is no existing build/test infra — propose a migration plan (Maven/Gradle + JUnit) rather than adding partial configs.
- Do not modify binary artifacts (.class) in suggestions. If converting the repo to a proper Java project, recommend removing .class files and adding .gitignore updates first.

References picked from repo
- VS Code task: .vscode/tasks.json contains the "compile and run java" task using: cd "${fileDirname}" && javac "${fileBasename}" && java "${fileBasenameNoExtension}" < input.txt > output.txt

If edits to this guidance are wanted, request additions or coverage for other areas (e.g., migrating to Maven/Gradle, adding CI, or adding a test harness).