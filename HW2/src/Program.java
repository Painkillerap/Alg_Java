

public class Program {

    public static void main(String[] args) {

        LinkedList<Employee> linkedList1 = new LinkedList<>();
        linkedList1.addFirst(new Employee("Андрей", 34));
        linkedList1.addFirst(new Employee("Александр", 45));
        linkedList1.addFirst(new Employee("Елена", 44));
        linkedList1.addFirst(new Employee("Данила", 22));
        linkedList1.addFirst(new Employee("Сергей", 18));
        linkedList1.addFirst(new Employee("Тимофей", 55));

        System.out.println(linkedList1);
        linkedList1.revert();
        System.out.println(linkedList1);

        DuableLinkedList<Employee> linkedList2 = new DuableLinkedList<>();
        linkedList2.addFirst(new Employee("Сергей", 43));
        linkedList2.addLast(new Employee("Валентин", 43));
        linkedList2.addLast(new Employee("Владимир", 55));
        linkedList2.addLast(new Employee("Владимир", 21));
        linkedList2.addLast(new Employee("Николай", 21));

        System.out.println(linkedList2);
        linkedList2.revert();
        System.out.println(linkedList2);

        Employee employee1 = new Employee("Сергей", 33);
        Employee employee2 = new Employee("Андрей", 33);

        System.out.println(employee1.equals(employee2));

        Employee employee3 = new Employee("Сергей", 33);
        Employee employee4 = new Employee("Сергей", 33);

        System.out.println(employee3.equals(employee4));

        Employee res = linkedList1.contains(new Employee("Данила", 22));
        System.out.println(res);

        linkedList1.sort(new EmployeeComparator(SortDirect.Ascending));
        System.out.println();
        System.out.println(linkedList2);

        linkedList1.sort(new EmployeeComparator(SortDirect.Descending));
        System.out.println();
        System.out.println(linkedList2);

        linkedList1.removeFirst();

        linkedList1.removeLast();

        System.out.println();
        System.out.println(linkedList1);


    }

}
