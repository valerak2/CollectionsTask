public record Ticket(String name, int ID) {
    @Override
    public int hashCode(){
        return ID;
    }
}
