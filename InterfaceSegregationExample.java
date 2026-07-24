public class InterfaceSegregationExample {
    interface Printable{
        void print();
    }
    interface Scannable{
        void scan();
    }
    interface Faxable{
        void fax();

    }
    static class BasicPrinter implements Printable{
        @Override
        public void print(){
            System.out.println("Basic printer: Printing");
        }
    }
    static class MultiFunctionPrinter implements Printable,Scannable,Faxable{
@Override
public void print(){
    System.out.println("Multi Function Printing");
}
@Override
public void scan(){
    System.out.println("Multi Function Scanning");
}
@Override
public void fax(){
    System.out.println("Multi Function Fax...");
}
    }

        public static void main(String[] args){
            Printable basicPrinter= new BasicPrinter();
            basicPrinter.print();
            System.out.println();
            MultiFunctionPrinter mul = new MultiFunctionPrinter();
            mul.print();
            mul.scan();
            mul.fax();
        }
    }
    
