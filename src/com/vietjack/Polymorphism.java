class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class VCB extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class AGR extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class CTG extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

class Test3 {
    public static void main(String args[]) {
        Bank b1 = new VCB(); // upcasting 
        Bank b2 = new AGR(); // upcasting 
        Bank b3 = new CTG(); // upcasting 
        System.out.println("VCB lai suat la: " + b1.getRateOfInterest());
        System.out.println("AGR lai suat la: " + b2.getRateOfInterest());
        System.out.println("CTG lai suat la: " + b3.getRateOfInterest());
    }
}