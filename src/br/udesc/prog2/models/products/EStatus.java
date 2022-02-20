
package br.udesc.prog2.models.products;

public enum EStatus {
    instalado, em_teste,em_andamento, concluido;
    
    public static boolean validar(String apartEnum) {
        try {
            return EStatus.valueOf(apartEnum) != null;
        } catch (Exception e) {
            return false;
        }
    }
}
