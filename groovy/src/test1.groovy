import groovyx.gpars.dataflow.DataflowQueue
import groovyx.gpars.dataflow.DataflowVariable
import static groovyx.gpars.dataflow.Dataflow.task
/*final def x = new DataflowVariable()
final def y = new DataflowVariable()
final def z = new DataflowVariable()

task {
    z << x.val + y.val
}

task {
    x << 10
}

task {
    y << 5
}

println "Result: ${z.val}"*/
def words = ['Groovy','fantastic','concurrency','fun','enjoy','safe','GPars','data','flow']
def t = 'groovy'
def c
final def buffer = new DataflowVariable()

task{
   /* for(word in words){
        buffer<<word.toUpperCase()
    }*/
    c<<t.toUpperCase()
}
task{
  /*  while(true)*/
        println "${c.val}"
}
