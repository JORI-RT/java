public record UserRecord(int id, String name) {
    @Override
    public int id() {
        return id;
    }
    // field is defined as final
//    public String setId(int id) {
//        this.id = id;
//    }
}
