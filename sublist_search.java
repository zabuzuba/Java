import javax.lang.model.util.ElementScanner14;

class sublist_search {
    public static class Node {
        int data;
        Node next;
    }

    public static Node newNode(int key) {
        Node val = new Node();
        val.data = key;
        val.next = null;
        return val;
    }

    public static boolean search(Node parent_list, Node child_list) {
        Node ptr1 = parent_list;
        Node ptr2 = child_list;
        if (parent_list == null && child_list == null)
            return true;
        if (child_list == null || (child_list != null && parent_list == null))
            return false;
        while (parent_list != null) {
            ptr1 = parent_list;
            while (ptr2 != null) {
                if (ptr1 == null)
                    return false;
                else if (ptr2.data == ptr1.data) {
                    ptr2 = ptr2.next;
                    ptr1 = ptr1.next;
                } else
                    break;
            }
            if (ptr2 == null)
                return true;
            ptr2 = child_list;
            parent_list = parent_list.next;
        }
        return false;
    }

    public static void main(String args[]) {
        Node list = newNode(2);
        list.next = newNode(5);
        list.next.next = newNode(3);
        list.next.next.next = newNode(3);
        list.next.next.next.next = newNode(6);
        list.next.next.next.next.next = newNode(7);
        list.next.next.next.next.next.next = newNode(0);
        Node sub_list = newNode(3);
        sub_list.next = newNode(6);
        sub_list.next.next = newNode(7);
        if (search(list, sub_list))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
    }
}