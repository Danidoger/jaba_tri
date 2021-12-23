package com.company;

public class Lesson3 {
    public static void main(){
    geoPoint aaaa = new geoPoint(213, 33,0.1, "долговременный межевой знак","Геодезический метод");
    geoPoint bbbb = aaaa.new_shifted_Point(24,4432);
    bbbb.set_opr_method("dadsad");
    System.out.println(bbbb.get("opr_method"));
    segment_on_surf vvvv = new segment_on_surf(aaaa, bbbb);
    System.out.println(vvvv.Length());
    segment_on_surf aabbb = vvvv.relative_turn(aaaa, 5);
    }

}
