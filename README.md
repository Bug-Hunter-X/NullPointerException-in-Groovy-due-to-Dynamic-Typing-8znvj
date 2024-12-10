# Groovy NullPointerException Example

This repository demonstrates a common error in Groovy related to `NullPointerExceptions` due to dynamic typing.  The `bug.groovy` file contains code that throws a `NullPointerException` if a null value is passed to the `myMethod`. The `bugSolution.groovy` file shows how to safely handle null values to avoid this issue.

## How to Reproduce

1. Clone the repository.
2. Run `bug.groovy` using a Groovy interpreter (e.g., `groovy bug.groovy`).
3. Observe the `NullPointerException` when `myMethod` receives a `null` argument.
4. Run `bugSolution.groovy` to see the corrected version handling nulls gracefully.
