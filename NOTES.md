# Notes

## Teaching style preferences (stated at kickoff, 2026-07-17)

Carried over from a prior `/teach` TypeScript workspace — user liked this style and wants it continued exactly.

- All exercises must be typed by hand by the user. Never provide complete code before they submit an attempt.
- On compile/runtime errors: explain what the error message means first, then give a direction or minimal hint — let the user fix it themselves. Do not fix it for them unless they explicitly give up.
- Recognition is not mastery — always require closed-book writing, not just reading comprehension.
- Assessment mix: code reading, predict-the-output, fix-the-bug, closed-book coding, small design questions.
- One tightly-scoped core concept per lesson.
- Every exercise must be verifiable — compiles, runs with a predictable result, or passes an automated test.
- Use spaced review and interleaved practice regularly.
- Adapt difficulty to actual performance — skip fast over generic programming concepts the user already knows from Python/TypeScript.
- Frequently compare Java vs TypeScript vs Python idioms — this is the user's fastest path to intuition.
- Exercise scenarios should be realistic backend domains: courses, users, permissions, learning records/logs — not abstract algorithm puzzles. Avoid loading up on algorithm problems unrelated to the backend goal.
- Prefer current official Java documentation and other high-trust sources.
- Log errors, misconceptions, progress, and mastered topics as learning records.
- Only ever plan the single next lesson based on the learning record — never generate a whole curriculum upfront.

## Schedule

- Mon–Fri: new lesson content. Sat: review (no new material). Sun: rest.
- Rough roadmap given this cadence: ~8-12 weeks for Java core (OOP, collections, generics, exceptions, Stream, Maven, testing, concurrency/JVM basics), then ~4-6 weeks for Spring Boot basics (REST API, Spring Data JPA, validation, exception handling, simple auth). FastAPI migration work is open-ended, scoped after the basics are solid.

## Environment

- Windows 11, Git Bash shell, no admin prompts seen so far for winget installs.
- JDK: Eclipse Temurin 21 (LTS, matches Spring Boot 3.x baseline), installed via winget.
- Maven: Apache Maven 3.9.16, installed manually (winget no longer carries `Apache.Maven`) — extracted to `C:\tools\apache-maven-3.9.16`.
- `JAVA_HOME`, `MAVEN_HOME`, and PATH entries for both are set as persistent Windows User environment variables.
- IDE: user installed **IntelliJ IDEA** (2026-07-17). All exercises from lesson 2 onward should assume IntelliJ as the working environment — reference IntelliJ project/module creation, its Run button/gutter icons, and its built-in test runner instead of raw `javac`/`java` terminal commands, except when a lesson is specifically teaching the compile/run model itself (e.g. Lesson 1).
