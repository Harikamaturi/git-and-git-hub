public class SCI{
        public static void main(String []args){
            double p, r, t, s_interest, c_interest;
            p = 25000;
            r = 10;
            t = 4;
            System.out.println("Principal = "+p);
            System. out. println("Annual Rate of Interest = "+r);
            System. out. println("Time (years) = "+t);
            s_interest = (p * r * t)/100;
            c_interest = p * Math.pow(1.0+r/100.0,t) - p;
            System.out.println("Simple Interest: "+s_interest);
            System.out. println("Compound Interest: "+c_interest);
        }
    }

