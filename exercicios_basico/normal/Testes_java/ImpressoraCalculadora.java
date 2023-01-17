public class ImpressoraCalculadora {
    public static void main(String args[]){
        Impressora coco = new Impressora();
        String s1 = "10";
        int i1 = 2;
        int i2 = 4;
        float f1 = 2.1f;
        float f2 = 4.0f;
        double d1 = 2.0;
        byte b1 = 4;
        coco.radiciacao_String(s1);
        coco.radiciacao_byte(b1);
        coco.radiciacao_double(d1);
        coco.radiciacao_float(f2);
        coco.radiciacao_int(i1);
        coco.potencia_float(f1, f2);
        coco.potencia_int(i1, i2);
    }
}
