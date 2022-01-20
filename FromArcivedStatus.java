public class FromArcivedStatus extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestStatus) {
        if (requestStatus == Status.AVAILABLE) {
            book.setStatus(requestStatus);
        } else {
            System.out.println("Перевод книги из статуса " + Status.ARCHIVED +
                    " в статус " + requestStatus + " невозможен");
        }
    }

}
