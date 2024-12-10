```groovy
def myMethod(param) {
  if (param == null) {
    println "Parameter is null"
    return
  }
  // Some code that uses the parameter
  println param.someMethod()
}

myMethod(null)
myMethod(["a", "b"])
```