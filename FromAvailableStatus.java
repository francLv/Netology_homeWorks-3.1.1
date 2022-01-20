public class FromAvailableStatus extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestStatus) {
        switch (requestStatus) {
            case BORROWED:
            case ARCHIVED:
                book.setStatus(requestStatus);
                break;
            default:
                System.out.println("Перевод книги из статуса " + Status.AVAILABLE +
                        " в статус " + requestStatus + " невозможен");
        }
    }
}
