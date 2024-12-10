```groovy
def myMethod(param) {
  if (param == null) {
    println "Parameter is null"
    return
  }
  // Use the safe navigation operator to avoid the NullPointerException
  println param?.someMethod() ?: "someMethod returned null"
}

myMethod(null)
myMethod(["a", "b"])
```