import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;

class SleepMessages {
    void run(int lop) throws InterruptedException {
            Thread.sleep(lop);
    }
}

public class Main{
    
    public static void main(String[] args) throws Exception{
        
        String username, password;
	    Scanner obj = new Scanner(System.in);
		File f1 = new File("Data.txt");
		FileWriter f2 = new FileWriter("Data.txt");
		f2.write("");
		f2.close();
		SecretKey secretKey = KeyGenerator.getInstance("AES").generateKey();
		Cipher cipher = Cipher.getInstance("AES");

		int ch=3,ch2=3,log=0,log2=0;
		    
		while(true){
		    
		    System.out.print("\nOptions:\n1) Create New user\n2) Check Credentials\n3) Login to Server\n4) Exit\n\nEnter Your Choice: ");
		    String s=obj.nextLine();

;
		    if(s.charAt(0)=='1'){
		        
		        System.out.println("\n----------------------------------");
		        System.out.println("-------  New User Details  -------");
		        System.out.println("----------------------------------");
		        
		        while(true){
		            int check=0;
		            
		            System.out.print("\nEnter Username: ");
		            username=obj.nextLine();
		            
		            for(int i=0;i<username.length();i++){
		                if(username.charAt(i)==' '){
		                    System.out.print("\nContinue without using Space!\n");
		                    check=1;
		                    break;
		                }
		            }
		            
		            Scanner dataReader =new Scanner(f1);
		            
		            while (dataReader.hasNextLine()) {
		                String data = dataReader.nextLine();
		                String[] splited = data.split("\\s+");
		                
		                cipher.init(Cipher.DECRYPT_MODE, secretKey);
		                byte[] decryptedMessage = cipher.doFinal(Base64.getDecoder().decode(""+splited[0]));

		                if(new String(decryptedMessage,StandardCharsets.UTF_8).equals(username)){
		                    System.out.println("\nUsername Already Registered!");
		                    check=1;
		                    break;
		                }

		                    
		            }
		            dataReader.close();
		            
		            if(check==0){
		                break;
		            }
		        }
		        
		        while(true){
		            int check=0;
		            int uc=0;
		            int lc=0;
		            int nu=0;
		            int sy=0;
		            //By Jayesh
		            System.out.print("\nEnter Password: ");
		            password=obj.nextLine();
		            
		            if(password.length()<8){
		                System.out.println("\nToo Short Password Length!");
		                check=1;
		            }else{
		                
		                String [] sym={"@","!","#","$","%","^","&","*","(",")","+","-","/","_","~","<",">","?","[","]","{","}","|",":",";"};
		                for(int i=0;i<password.length();i++){
		                    int che=password.charAt(i);
		                    if(che>=65){
		                        if(che<=90){
		                            uc=1;
		                            check=0;
		                        }
		                    }
		                    
		                    if(che>=97){
		                        if(che<=122){
		                            lc=1;
		                            check=0;
		                        }
		                    }
		                    
		                    if(che>=48){
		                        if(che<=57){
		                            nu=1;
		                            check=0;
		                        }
		                    }
		                    String ask=""+password.charAt(i);
		                    for(int j=0;j<sym.length;j++){
		                        if(ask.equals(sym[j])){
		                            sy=1;
		                            check=0;
		                        }
		                    }
		                }
		                
		                System.out.println("");
		            
		                if(uc==0){
		                    System.out.println("Must Include UpperCase Alphabet");
		                    check=1;
		                }
		                if(lc==0){
		                    System.out.println("Must Include LowerCase Alphabet");
		                    check=1;
		                }
		                if(nu==0){
		                    System.out.println("Must Include Number");
		                    check=1;
		                }
		                if(sy==0){
		                    System.out.println("Must Include Symbol");
		                    check=1;
		                }
		              
		            }
		            
		                
		            if(check==0){
		                break;
		            }
		        }
		        
		        FileWriter f0 = new FileWriter("Data.txt",true);
		        BufferedWriter br = new BufferedWriter(f0);
		        System.out.println("User created successfully!");
		        
		        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		        byte[] encryptedMessage_1 = cipher.doFinal(username.getBytes(StandardCharsets.UTF_8));
		        byte[] encryptedMessage_2 = cipher.doFinal(password.getBytes(StandardCharsets.UTF_8));
		        
		        br.write(Base64.getEncoder().encodeToString(encryptedMessage_1)+" "+Base64.getEncoder().encodeToString(encryptedMessage_2)+"\n");
		        br.close();
		        f0.close();
		        
		    }else if(s.charAt(0)=='2'){
		        
		        System.out.print("\nEnter Username: ");
		        username=obj.nextLine();
		        System.out.print("\nEnter Password: ");
		        password=obj.nextLine();
		        Scanner dataReader =new Scanner(f1);
		        int check=0;
		        while (dataReader.hasNextLine()) {
		            String data = dataReader.nextLine();
		            String[] splited = data.split("\\s+");
		            check=0;
		            
		            cipher.init(Cipher.DECRYPT_MODE, secretKey);
		            byte[] decryptedMessage_1 = cipher.doFinal(Base64.getDecoder().decode(""+splited[0]));
		            byte[] decryptedMessage_2 = cipher.doFinal(Base64.getDecoder().decode(""+splited[1]));
		            
		            if(new String(decryptedMessage_1,StandardCharsets.UTF_8).equals(username)){
		                if(new String(decryptedMessage_2,StandardCharsets.UTF_8).equals(password)){
		                    System.out.println("\nAuthentication successful!\n\nDatabase Updated!");
		                    check=1;
		                    ch=3;
		                    break;
		                }else{
		                    ch=ch-1;
		                    System.out.println("\nIncorrect Password\n"+ch+" Attempt Left");
		                    check=1;
		                    break;
		                }
		            }
		            
		        }
		        
		        if(check==0){
		            System.out.println("\nUsername Not Found");
		        }
		        
		        if(ch==0){
		            log=log+30000;
		            System.out.println("\nAll Attempts are Used,\nWait "+log/1000+"sec to Continue!");
		            SleepMessages s1=new SleepMessages();
                    s1.run(log);
		            ch=3;
		        }
		            
		    }else if(s.charAt(0)=='3'){
		        
		        System.out.print("\nEnter Username: ");
		        username=obj.nextLine();
		        System.out.print("\nEnter Password: ");
		        password=obj.nextLine();
		        Scanner dataReader =new Scanner(f1);
		        int check=0;
		        while (dataReader.hasNextLine()) {
		            String data = dataReader.nextLine();
		            String[] splited = data.split("\\s+");
		            check=0;
		            
		            cipher.init(Cipher.DECRYPT_MODE, secretKey);
		            byte[] decryptedMessage_1 = cipher.doFinal(Base64.getDecoder().decode(""+splited[0]));
		            byte[] decryptedMessage_2 = cipher.doFinal(Base64.getDecoder().decode(""+splited[1]));
		            
		            if(new String(decryptedMessage_1,StandardCharsets.UTF_8).equals(username)){
		                if(new String(decryptedMessage_2,StandardCharsets.UTF_8).equals(password)){
		                    System.out.println("\nAuthentication successful!\n\nAccess Granted!");
		                    check=1;
		                    ch2=3;
		                    break;
		                }else{
		                    ch2=ch2-1;
		                    System.out.println("\nIncorrect Password\n"+ch2+" Attempt Left");
		                    check=1;
		                    break;
		                }
		            }
		            
		        }
		        
		        if(check==0){
		            System.out.println("\nUsername Not Found");
		        }
		        
		        if(ch2==0){
		            log2=log2+30000;
		            System.out.println("\nAll Attempts are Used,\nWait "+log2/1000+"sec to Continue!");
		            SleepMessages s1=new SleepMessages();
                    s1.run(log2);
		            ch2=3;
		        }
		        
		    }else if(s.charAt(0)=='4'){
		        
		        System.out.println("\nThanks For Using The Program");
		        break;
		        
		    }else{
		        System.out.print("\nWrong Choice Try Again\n");
		        
		    }
		    
		}
	}
}
