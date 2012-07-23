package todo

class Todo {

    boolean done
    int order
    String text

    static mapping = {
        order column: 'customorder'
    }

    static constraints = {
        text(nullable: false, empty: false)
    }
}
