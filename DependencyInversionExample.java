public class DependencyInversionExample {
    interface InputDevice{
        void connect();
    }
    static class Keyboard implements InputDevice{
        @Override
        public void connect(){
            System.out.println("Keyboard connected ");
        }
    }
    static class Mouse implements InputDevice{
        @Override
        public void connect(){
            System.out.println("Mouse  connected");
        }
    }
    static class Computer{
        private InputDevice inputDevice;
        public Computer(InputDevice inputDevice){
            this.inputDevice = inputDevice;
        }
        public void start(){
            System.out.println("Computer is starting");
            inputDevice.connect();
        }
    }
    public static void main(String[] args){
        InputDevice keyboard= new Keyboard();
        Computer computer1 = new Computer(keyboard);
        computer1.start();
        System.out.println();
        InputDevice mouse = new Mouse();
        Computer computer2 = new Computer(mouse);
        computer2.start();
    }
}
