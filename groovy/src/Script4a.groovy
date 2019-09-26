class Foo {
    def propertyMissing(String name) { name }
}

assert new Foo().boo == 'boo'
f= new Foo()
System.out.println( f.cc)
