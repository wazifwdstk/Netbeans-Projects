//SYED AHMAD WAZIF BIN SYED AHMAD MUNIF AL-IDRUS
package debug5;


public class Debug5 {

   
    public static void main(String[] args) {
        char branch = 'C';
        int collegeYear = 4;

        switch(collegeYear){
            case 1:{
            	System.out.println("English, Maths, Science");
                break;
            }
                
            case 2:
            	switch(branch){
                    case 'C':{
                        System.out.println("Operating System, Java, Data Structure");
                    }
                        break;
                    
                    case 'E':{
                        System.out.println("Micro processors, Logic switching theory");
                    }
                        break;
                    case 'M':{
                        System.out.println("Drawing, Manufacturing Machines");
                    }
                        break;
                }
                break;
            case 3:
                switch(branch){
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch(branch){
                    case 'C':{
                        System.out.println("Data Communication and Networks, MultiMedia");
                        }
                    case 'E':{
                        System.out.println("Embedded System, Image Processing");
                    }
                    case 'M':{
                        System.out.println("Production Technology, Thermal Engineering");
                    }
                }
                break;
    }
    
    }
}