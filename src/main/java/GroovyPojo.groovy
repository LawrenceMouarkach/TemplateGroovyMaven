import groovy.transform.Canonical

@Canonical
class GroovyPojo {
    String name
    int priority
    Date startDate
    Date endDate
    boolean completed
}