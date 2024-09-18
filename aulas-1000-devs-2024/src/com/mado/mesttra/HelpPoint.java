public class HelpPoint {
    public static void main(String[] args) throws java.io.IOException {
        char choice, ignore;
        Help h1pobj = new Help();

        for (;;) {
            do {
                h1pobj.showmenu();

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (!h1pobj.isvalid(choice));

            if (choice == 'q')
                break;

            System.out.println("\n");

            h1pobj.helpon(choice);

        }
    }
}
