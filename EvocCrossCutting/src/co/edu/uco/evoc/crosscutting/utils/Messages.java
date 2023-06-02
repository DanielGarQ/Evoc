package co.edu.uco.evoc.crosscutting.utils;

public final class Messages {
	
	private Messages() {}
	
	public static final class UtilSqlMessages{
		
		private UtilSqlMessages() {}
		
		public static final String CONNECTION_IS_OPEN_USER_MESSAGE = "Se ha presentado un problmea tratando de validar si una conexion con la fuente de informacion estaba o no abierta";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_NULL_CONNECTION = "Se ha presentado una exception de tipo SQLException tratando de validar si la conexion está abierta cuando se encuentra nula... ";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_SQL_EXCEPTION = "Se ha presentado una exception de tipo SQLException tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepción presentada...";
		public static final String CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION = "Se ha presentado una exception inesperada de tipo Exception tratando de validar si la conexion estaba o no abierta. Por favor valida la traza de errores completa de la excepción presentada...";
		
	}
	
		public static final class CandidatoFacadeImplMessages{
		
		private CandidatoFacadeImplMessages() {}
		
		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo Candidato para una institución. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar el nuevo Candidato. por favor valide la traza completa de la excepciópresentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Candidato. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el estado tipo relación institucion. por favor valide la traza completa de la excepciópresentada...";
		public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del nuevo candidato. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
		public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar candidato. por favor valide la traza completa de la excepciópresentada...";
		public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el candidato. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
		public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el candidato. por favor valide la traza completa de la excepciópresentada...";
		
	}
		
		public static final class ZonaFacadeImplMessages{
			
			private ZonaFacadeImplMessages() {}
			
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva zona. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar la nueva zona. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la zona. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar la zona. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la zona. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar la zona. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la zona. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar la zona. por favor valide la traza completa de la excepciópresentada...";
			
		}
		
			public static final class TipoRegistradorFacadeImplMessages{
			
			private TipoRegistradorFacadeImplMessages() {}
			
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo tipo registrador. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar el nuevo tipo registrador. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del tipo registrador. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el tipo registrador. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del tipo registrador. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar el tipo registrador. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el tipo registrador. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el tipo registrador. por favor valide la traza completa de la excepciópresentada...";
			
		}
			
			
			public static final class TipoIdentificacionFacadeImplMessages{
				
			private TipoIdentificacionFacadeImplMessages() {}
				
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo Tipo Identificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar el nuevo Tipo Identificacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Tipo Identificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el TipoI dentificacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Tipo Identificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar Tipo Identificacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Tipo Identificacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Tipo Identificacion. por favor valide la traza completa de la excepciópresentada...";
				
		}
			
			public static final class TipoCandidatoFacadeImplMessages{
				
			private TipoCandidatoFacadeImplMessages() {}
					
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo Tipo Candidato. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar el nuevo Tipo Candidato. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Tipo Candidato. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Tipo Candidato. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Tipo Candidato. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar Tipo Candidato. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Tipo Candidato. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Tipo Candidato. por favor valide la traza completa de la excepciópresentada...";
					
		}
			
			public static final class PartidoFacadeImplMessages{
				
			private PartidoFacadeImplMessages() {}
						
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo Partido. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar el nuevo Partido. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Partido. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Partido. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Partido. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar Partido. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Partido. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Partido. por favor valide la traza completa de la excepciópresentada...";
						
		}
			
			public static final class RegistraduriaFacadeImplMessages{
				
			private RegistraduriaFacadeImplMessages() {}
							
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva Registraduria. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar la nueva Registraduria. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la Registraduria. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar la Registraduria. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la Registraduria. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar la Registraduria. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la Registraduria Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar la Registraduria. por favor valide la traza completa de la excepciópresentada...";
							
			}
			
		
			public static final class NivelTipoEleccionFacadeImplMessages{
				
			private NivelTipoEleccionFacadeImplMessages() {}
								
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del Nivel Tipo Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar del nuevo Nivel Tipo Eleccion. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Nivel Tipo Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Nivel Tipo Eleccion. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Nivel Tipo Eleccion Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar el Nivel Tipo Eleccion. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Nivel Tipo Eleccion Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Nivel Tipo Eleccion. por favor valide la traza completa de la excepciópresentada...";
								
		   }

}
