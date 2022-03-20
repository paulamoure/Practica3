package aplicacion;
import mates.Matematicas;

public class Principal{
	public static void main(String[] args){
		System.out.println(args[0]);
		System.out.println("El número PI (lambda) es " + Matematicas.generarNumeroPiLambda(Integer.parseInt(args[0])));
}
