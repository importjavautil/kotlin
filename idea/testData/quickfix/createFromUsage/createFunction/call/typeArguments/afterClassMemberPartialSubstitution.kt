// "Create function 'foo'" "true"

class B<T>(val t: T) {
    fun <U> foo(i: Int, arg: U): Int {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class A<T>(val b: B<T>) {
    fun test(): Int {
        return b.foo<String>(2, "2")
    }
}