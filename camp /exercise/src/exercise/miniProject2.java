package exercise;

public class miniProject2 {
// vowels 
    public static void main(String[] args) {
        char harf='A';
        
        switch(harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli harf");
        }
    }

}
