



public class Program {

    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>(4);

        String res = hashMap.put("+79005554433", "Андрей");
        res = hashMap.put("+79005554432", "Алексей");
        res = hashMap.put("+79005554432", "Петр");
        res = hashMap.put("+79005554433", "Николай");
        res = hashMap.put("+79005554434", "Владимир");
        res = hashMap.put("+79005554435", "Сергей");
        res = hashMap.put("+79005554436", "Елена");
        res = hashMap.put("+79005554437", "Дарья");
        res = hashMap.put("+79005554438", "Мария");
        res = hashMap.put("+79005554439", "Кристина");


        res = hashMap.get("+79005554436");

        hashMap.remove("+79005554438");

        for (HashMap.Entity element : hashMap) {
            System.out.println(element.key + " - " + element.value);
        }

    }

}


