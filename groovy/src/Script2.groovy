println "In Script2"
class person{
   /* storageVolume1(){
        println"storageVolume1"
    }

    storageVolume2(){
        println"storageVolume2"
    }*/
    // def name = "shaoChen"
   // def age = 20
    //def storage[]
    def propertyMissing(String name, value) { println("the missingProperty name is $name \r\n value is $value\r\n") }
    def propertyMissing(String name) {  println("the missingProperty name is $name \r\n") }
    def methodMissing(String name, def args) {
        return "this methodMissing is $name"
    }
}
def person =new person()
    person.ddcd
Binding propertyBinding = new Binding()

propertyBinding.propertySet = {
    id,Closure c ->
        //def person =new person()
        c.delegate=person
        c.call()
      //  System.out.println()
}
Binding storageVolumeBinding = new Binding()
storageVolumeBinding.storageVolume = {
    id,Closure c ->
       // def person =new person()
        c.delegate=person
        c.call()
        //  System.out.println()
}
shell = new GroovyShell(propertyBinding)
shell.evaluate(new File('Script1.groovy'))

shell2 = new GroovyShell(storageVolumeBinding)
shell2.evaluate(new File("Script3.groovy"))
