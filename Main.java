
public class Main {

    public static void main(String[] args) {

        Book book = new Book("Good book");
        BookMover fromAvailableStatus = new FromAvailableStatus();
        fromAvailableStatus.moveToStatus(book, Status.OVERDUED);
        System.out.println("Текущий статус: " + book.getStatus());

        fromAvailableStatus.moveToStatus(book, Status.ARCHIVED);
        System.out.println("Текущий статус: " + book.getStatus());

        fromAvailableStatus.moveToStatus(book, Status.BORROWED);
        System.out.println("Текущий статус: " + book.getStatus());

        BookMover fromBorrowedStatus = new FromBorrowedStatus();
        fromBorrowedStatus.moveToStatus(book, Status.AVAILABLE);
        System.out.println("Текущий статус: " + book.getStatus());

        fromBorrowedStatus.moveToStatus(book, Status.ARCHIVED);
        System.out.println("Текущий статус: " + book.getStatus());

        fromBorrowedStatus.moveToStatus(book, Status.OVERDUED);
        System.out.println("Текущий статус: " + book.getStatus());

        BookMover fromArchivedStatus = new FromArcivedStatus();
        fromArchivedStatus.moveToStatus(book, Status.BORROWED);
        System.out.println("Текущий статус: " + book.getStatus());

        fromArchivedStatus.moveToStatus(book, Status.OVERDUED);
        System.out.println("Текущий статус: " + book.getStatus());

        fromArchivedStatus.moveToStatus(book, Status.AVAILABLE);
        System.out.println("Текущий статус: " + book.getStatus());

        BookMover fromOverduedStatus = new FromOverduedStatus();
        fromOverduedStatus.moveToStatus(book, Status.BORROWED);
        System.out.println("Текущий статус: " + book.getStatus());

        fromOverduedStatus.moveToStatus(book, Status.ARCHIVED);
        System.out.println("Текущий статус: " + book.getStatus());

        fromOverduedStatus.moveToStatus(book, Status.AVAILABLE);
        System.out.println("Текущий статус: " + book.getStatus());


    }
}
