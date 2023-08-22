package lesson1.ModelElements;

import java.util.List;

import lesson1.Stuff.Type;

public class Scene {
	public int Id;
	public List<PoligonalModel> Models;
	public List<Flash> Flashes;

	public Scene(List<PoligonalModel> models, List<Flash> flashes) {
		this.Id = 0;
		this.Models = models;
		this.Flashes = flashes;
	}

	public Type method1(Type type) {
		return null;
	}

	public Type method2(Type type, Type type2) {
		return null;
	}
}
