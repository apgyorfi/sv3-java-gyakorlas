package tananyag.cmdarguments;

public class CmdMain {

    public static void main(String[] args) {

        System.out.println(args.length);

        for (String item: args){
            System.out.println(item);
        }

    }

}
