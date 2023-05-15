package Ex1;

import java.util.Arrays;

public class Num <T extends  Number, V extends Number> {
    T a;
    V b;
    T obj1[];
    V obj2[];

    public Num(T a, V b) {
        this.a = a;
        this.b = b;
    }

    public Num(T[] obj1, V[] obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public double sumChisla(){
     return (a.doubleValue()+b.doubleValue());
    }

    public void equalsMassiv(){
        if(this.obj1.length != this.obj2.length){
            System.out.println("Не одинаковая размерность! Сравнение невозможно");
        }
        else{
            for(int i = 0; i < this.obj1.length; i++){
                if(this.obj1[i].doubleValue() == this.obj2[i].doubleValue()){
                    System.out.println("Элементы с индексом " + (i + 1) + " равны");
                }
                else{
                    System.out.println("Элементы с индексом " + (i + 1) + " не равны");
                }
            }
        }
    }

    public void min_max(){
        T max = obj1[0];
        V max2 = obj2[0];
        int maxIndex = 0;
        for (int index = 0; index < obj1.length; index++) {
            if (obj1[index].doubleValue() > max.doubleValue()) {
                max = obj1[index];
                maxIndex = index;
            }
        }
        for (int index = maxIndex; index < obj1.length; index++){
            System.out.println("From obj1 "+obj1[index]);
        }

        for (int index = 0; index < obj2.length; index++) {
            if (obj2[index].doubleValue() > max2.doubleValue()) {
                max2 = obj2[index];
                maxIndex = index;
            }
        }
        for (int index = maxIndex; index < obj2.length; index++){
            System.out.println("From obj2 "+obj2[index]);
        }
    }
}
