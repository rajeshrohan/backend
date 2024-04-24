package concurrency;
public class Notes {
    /*
    CPU can be single core or Multi-core
    Core is a chip inside cpu responsible for executing instruction.
    Each core can execute one thread at a time.

    Anything happens on machines, there is a cpu running a thread , which actually running the code.
    CPU : executes thread

    code -> compile -> executable file exe,apk,etc.  ->  install on disk ->  becomes a  program  ->
    start  ->  load in memory (RAM)  ->  OS runs  ->   becomes Process

    program : a set of instruction
    process : a program in execution
    Thread : unit of cpu execution

    Each process comprises multiple threads, each thread treated as 1 task.

    PCB : process control block, a kind of data structure that store information about a process.
    each  process has :
        process id, list<Variable>, memory required, registers, priority,
        program counter(next line of code to be executed after resume), call stack


    multiple process don't share data with each other.
    Thread is used , to share data within the process.
    every thread has program counter, call stack, all threads have access to the same data.

    cpu has cpu scheduler : It decides the order of threads execution.
        depends on multiple factors:priority, resources, time to finish.
        CPU scheduler Algorithms:
        SJF  : Shortest Job First
        SRTF : Shortest Remaining Time First,
        FCFS : First Come, First Served
        Round Robin : Each process is assigned a fixed time unit, known as time slice

    Threads within the same process can access global data shared by all threads
    but cannot directly access each other’s stack data without proper synchronization mechanisms.

    Multithreading : Multithreading involves executing multiple threads of the same process concurrently
    Program Counter : Program counters are hardware registers that store the address of the next instruction to be executed.

---------------------------------------------------------------------------------------------------------------------------

                                    Concurrency vs Parallelism:
    when multiple thread at different stage of execution but necessarily not making progress is called concurrency.
    Threads actually making the progress is called parallelism.

    Parallelism happens only in multicore CPU.

    order of execution of threads is undecided as cpu scheduler algorithms decides, we can't decide.


     */
}
