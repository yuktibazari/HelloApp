public class UC5 {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;
        for(String name : args){
            if(!first){
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }
        if (first == true) {
            System.out.println("Hello, World!");
            } else {
            System.out.println("Hello, " + nameBuilder.toString() + "!");
            }
    }
}