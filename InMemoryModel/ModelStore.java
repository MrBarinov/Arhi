package InMemoryModel;

import java.util.ArrayList;
import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger {
	public List<PoligonalModel> Models;
	public List<Scene> Scenes;
	public List<Flash> Flashes;
	public List<Camera> Cameras;

	private List<IModelChangedObserver> ChangeObservers;

	public ModelStore(List<IModelChangedObserver> changeObservers) {
		this.Models = new ArrayList<>();
		this.Scenes = new ArrayList<>();
		this.Flashes = new ArrayList<>();
		this.Cameras = new ArrayList<>();
		this.ChangeObservers = changeObservers;
	}

	public Scene GetScena(int id) {
		for (Scene scene : Scenes) {
			if (scene.Id == id) {
				return scene;
			}
		}
		return null;
	}

	@Override
	public void NotifyChange(IModelChanger sender) {
	}

}
