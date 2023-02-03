public class Random {
            int min = 1; // Minimum value of range
            int max = 3; // Maximum value of range


            public int Rand(){
                int rand = (int)Math.floor(Math.random() * (max - min + 1) + min);
                //System.out.println("Liczba to : " + rand);
                return  rand;
        }
}
