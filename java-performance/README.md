# Java Application Performance Tuning and Memory Management

## Chapter 2 - Just-in-time compilation and the Code Cache

Compiler Flags

1. -XX:+PrintCompilation
2. -XX:+UnlockDiagnosticVMOptions -XX:+LockCompilation
3. -XX:+PrintCodeCache
4. -XX:ReservedCodeCacheSize=28m -XX:+PrintCodeCache

```cmd

```

## Chapter 3 - Selecting the JVM

### JVM Versions

__32 bit__

1. Might be faster if heap < 3GB
2. Max heap size = 4gb
3. C1 compiler only

__64 bit__

1. Might be faster if using long/double 
2. Necessary if heap > 4gb
3. C1 and C2 compiler
4. Max heap size - OS dependent

Difference between (in milliseconds):

Both compilers
```cmd
java -XX:+PrintCompilation Main
```
and
Only client compiler (-client)
```cmd
java -client -XX:+PrintCompilation Main
```

### JVM Compiler flags

1. -client
2. -server
3. -d64
4. -XX:-TieredCompilation: for disabling tiered compilation

### Native Compilation Tuning

1. -XX:+PrintFlagFinals
2. -XX:CICompilerCount=n
3. -XX:CompileThreshold=n

```cmd
jinfo -flag CICompilerCount <pid>
```

```cmd
java -XX:CICompilerCount=6 -XX:+PrintCompilation Main 5000
```

```cmd
java -XX:CompileThreshold=1000 -XX:+PrintCompilation Main 5000
```

## Chapter 4 - How memory works - the stack and the heap

### JVM Memory

1. The stack

2. The Heap


### Java Memory - The Rules

Objects are stored on the heap

Variables are a reference to the object

Local variables are stored on the stack

### Chapter 5 

#### Escaping References 
 

### Chapter 10 - Tuning the JVM Memory Settings

````shell
-XX:+PrintStringTableStatistics 
````

````shell
-XX:StringTableSize=120121 
````

#### Tuning the size of the heap

````shell
-XX:+PrintStringTableStatistics 
````

````shell
-XX:MaxHeapSize=600m
````

Shortcut

````shell
-Xmx
-Xmx2g
````

````shell
-XX:InitialHeapSize=1g
````

Shortcut

````shell
-Xms
-Xms1g
````

````shell
-XX:+UnlockDiagnosticVMOptions
-XX:+PrintFlagsFinal
````

#### Generating a Heap Dump

````shell
-XX:+HeapDumpOnOutOfMemoryError
````

````shell
-XX:+HeapDumpPath=someFilePath
````

````shell
-verbose:gc
````

````shell
-XX:-UseAdaptativeSizePolicy
````

-XX:NewRation=n




