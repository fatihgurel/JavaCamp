package inheritance2;
//Birbirinin alternatifi olan kodlar için if yazılmaz!!! Bu yanlış bir kullanımdır.
public class LogManager {
    public void log(int logType){
        if (logType == 1) {
            System.out.println("Veritabanına loglandı");
        }else if(logType ==2){
            System.out.println("Dosya loglandı");
        }else{
            System.out.println("Email gönderildi");
        }
    }
}
 

//1 - Database
//2 - File
//3 - Email