public static double generarNumeroPiLambda(long pasos) {
	List<Point> list = Strem
		.generate(() -> new Point())
		.limit(pasos)
		.collect(Collectors.toList())
	
	double puntosDentroCirculo = List.stream().filter(point -> point.getX() * point.getY() * point.getY() < 1).count());
	double pi = 4 * (puntosDentroCirculo / pasos);

	return pi;

}
