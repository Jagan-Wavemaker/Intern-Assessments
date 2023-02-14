class Storage{
   int StorageSpace(){
        return 0;
   }
}

class Dell extends Storage{
    int StorageSpace(){
        return 200;
    }
}

class Lenovo extends Storage{
    int StorageSpace(){
        return 500;
    }
}
class HP extends Storage{
    int StorageSpace(){
        return 150;
    }
}

class Inherit{
    public static void main(String args[]){
        Dell d=new Dell();
        Lenovo l =new Lenovo();
        HP h=new HP();
        System.out.println("Remaining Storage Space of Dell is:"+d.StorageSpace()+"gb");
        System.out.println("Remaining Storage Space of Lenovo is:"+l.StorageSpace()+"kb");
        System.out.println("Remaining Storage Space of HP is:"+h.StorageSpace()+"gb");
    }
}
