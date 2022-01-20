public class FromOverduedStatus extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestStatus) {
        switch (requestStatus) {
            case AVAILABLE:
            case ARCHIVED:
                book.setStatus(requestStatus);
                break;
            default:
                System.out.println("Перевод книги из статуса " + Status.OVERDUED +
                        " в статус " + requestStatus + " невозможен");
        }
    }

}
