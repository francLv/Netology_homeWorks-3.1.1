public class FromBorrowedStatus extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestStatus) {
        book.setStatus(requestStatus);
    }
}
