// keyword this
// date 17/01/2024


class Stud {
     String name;
     int matricID;
     String university;

     Stud (String name, int matricID, String university) {
        this.name = name;
        this.matricID = matricID;
        this.university = university;
     }
      
     public String toString() {
        return name+" "+matricID+" "+university;
     }
     
     public static void main (String [] args) {
        Stud s1 = new Stud ("Ali", 1234, "UPSI");
        Stud s2 = new Stud ("Ahmad", 1256, "UPSI");

        System.out.println(s1);
        System.out.println(s2);
     }
}

