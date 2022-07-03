package utils;

public class TypeWriter {
    public TypeWriter() {}

    public void print(String text, int speed) {
        switch (speed) {
            case 1:
            for(int i = 0; i < text.length(); i++){
                System.out.printf("%c", text.charAt(i));
                try{
                    Thread.sleep(300);
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
            }
            break;
            case 2:
            for(int i = 0; i < text.length(); i++){
                System.out.printf("%c", text.charAt(i));
                try{
                    Thread.sleep(150);
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
            }
            break;
            case 3:
            for(int i = 0; i < text.length(); i++){
                System.out.printf("%c", text.charAt(i));
                try{
                    Thread.sleep(50);
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
            }
            break;
            default:
            for(int i = 0; i < text.length(); i++){
                System.out.printf("%c", text.charAt(i));
                try{
                    Thread.sleep(150);
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
            }
            break;
        }
    }

    public void print(String text) {
        for(int i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(50);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }

    public void println(String text, int speed) {
        switch (speed) {
            case 1:
            for(int i = 0; i < text.length(); i++){
                System.out.printf("%c", text.charAt(i));
                try{
                    Thread.sleep(300);
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
            }
            try{
                Thread.sleep(500);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
            System.out.println("");
            break;
            case 2:
            for(int i = 0; i < text.length(); i++){
                System.out.printf("%c", text.charAt(i));
                try{
                    Thread.sleep(150);
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
            }
            try{
                Thread.sleep(500);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
            System.out.println("");
            break;
            case 3:
            for(int i = 0; i < text.length(); i++){
                System.out.printf("%c", text.charAt(i));
                try{
                    Thread.sleep(50);
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
            }
            try{
                Thread.sleep(500);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
            System.out.println("");
            break;
            default:
            for(int i = 0; i < text.length(); i++){
                System.out.printf("%c", text.charAt(i));
                try{
                    Thread.sleep(150);
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("");
            break;
        }
    }

    public void println(String text) {
        for(int i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(5);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }
}