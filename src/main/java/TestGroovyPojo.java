public class TestGroovyPojo {
    private void bla() {
        GroovyPojo groovyPojo = new GroovyPojo();
        JavaPojo javaPojo = new JavaPojo();
        javaPojo.setEndDate(groovyPojo.getEndDate());
    }


}
