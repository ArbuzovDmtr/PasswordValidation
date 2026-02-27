**Password Validation**
=
A simple password validation utility written in Java.

**Validation Rules**
==
A password is considered valid if it meets all of the following criteria:

Minimum length: 8 characters;

Contains at least:
one uppercase letter,
one lowercase letter,
one digit,
one special character;

Is not included in a list of common/weak passwords
(e.g. "123456", "admin", "password")

Build/Run/Tests:
==

**lokal**: mvn clean verify

**Artefakt**: mvn package → target/*.jar