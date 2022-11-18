// creamos la clase de tipo objeto 
public class DesarrolladorFrontend {


		//variable entero
		int aniosExperienciaBootstrap;
		
		//variable boolean
		boolean experienciaCloud;
		
		//constante de visibilidad "privada"
		private double AUMENTO_VARIABLE = 3;

		//getter and setter)
		public int getAniosExperienciaBootstrap() {
			return aniosExperienciaBootstrap;
		}

		public void setAniosExperienciaBootstrap(int aniosExperienciaBootstrap) {
			this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
		}

		public boolean isExperienciaCloud() {
			return experienciaCloud;
		}

		public void setExperienciaCloud(boolean experienciaCloud) {
			this.experienciaCloud = experienciaCloud;
		}

		// constructor por defecto
		public DesarrolladorFrontend() {
		}

		//método constructor con los atributos
		public DesarrolladorFrontend(int aniosExperienciaBootstrap, boolean experienciaCloud) {
			this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
			this.experienciaCloud = experienciaCloud;
		}

		
		
		
	}