package panel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import dialog.RegData;

public class TxtRead {
	public TxtRead() {
		
		try {
            File f = new File("test.txt");
            if(f.exists()) {
                BufferedReader in = new BufferedReader(new FileReader("test.txt"));
                
                String tempStr[] = new String[30]; 
                
                int F_Num = 0;
                while(true) {
                	tempStr[F_Num] = new String(); 
                    String temp = in.readLine();                   
                    if(temp == null)
                    	break;
                    tempStr[F_Num] = temp;
                    F_Num++;
                    
                }
                
                RegData.setInfoNum(F_Num);
                
                in.close();
                for(int i=0; i<F_Num; i++) {
                    String array[] = tempStr[i].split("##");
                    for(int j=0; j<array.length; j++) {
                        
                        switch(j) {
                        case 0 :
                        	RegData.setName(array[j], i); break;
                        case 1 :
                        	RegData.setWay(array[j], i); break;
                        case 2 :
                        	RegData.setDay(array[j], i); break;
                        case 3 :
                        	RegData.setSTime(array[j], i); break;
                        case 4 :
                        	RegData.setETime(array[j], i); break;
                        case 5 :
                        	RegData.setState(array[j], i); break;
                        }
                    }
                }
                
                
              
            }
            
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

