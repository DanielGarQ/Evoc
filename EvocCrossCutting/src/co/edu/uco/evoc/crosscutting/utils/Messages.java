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
		
		public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del nuevo Candidato . Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
		public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar el nuevo Candidato. por favor valide la traza completa de la excepciópresentada...";
		public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Candidato. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
		public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Candidato. por favor valide la traza completa de la excepciópresentada...";
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
			public static final class EstadoMesaVotacionCalculadoFacadeImplMessages{
				
			private EstadoMesaVotacionCalculadoFacadeImplMessages() {}
									
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del Estado Mesa Votacion Calculado. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar del nuevo Estado Mesa Votacion Calculado. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Estado Mesa Votacion Calculado. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Estado Mesa Votacion Calculado. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Estado Mesa Votacion Calculado Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar el Estado Mesa Votacion Calculado. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Estado Mesa Votacion Calculado Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Estado Mesa Votacion Calculado. por favor valide la traza completa de la excepciópresentada...";
									
		   }
			
			public static final class EstadoEleccionFacadeImplMessages{
				
			private EstadoEleccionFacadeImplMessages() {}
										
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del Estado Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar del nuevo Estado Eleccion. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Estado Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Estado Eleccion. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Estado Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar el Estado Eleccion. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Estado Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Estado Eleccion. por favor valide la traza completa de la excepciópresentada...";
										
           }
			
			public static final class EstadoRegistradorFacadeImplMessages{
				
			private EstadoRegistradorFacadeImplMessages() {}
											
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del Estado Registrador. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar del nuevo Estado Registrador. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Estado Registrador. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Estado Registrador. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Estado Registrador. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar el Estado Registrador. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Estado Registrador. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Estado Registrador. por favor valide la traza completa de la excepciópresentada...";
											
	       }
			
			public static final class TipoEleccionFacadeImplMessages{
				
			private TipoEleccionFacadeImplMessages() {}
												
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del Tipo Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar del nuevo Tipo Eleccion. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Tipo Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Tipo Eleccion. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Tipo Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar el Tipo Eleccion. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Tipo Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Tipo Eleccion. por favor valide la traza completa de la excepciópresentada...";
												
		   }
			
			public static final class PersonaFacadeImplMessages{
				
			private PersonaFacadeImplMessages() {}
								
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva Persona. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar la nueva Persona. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la Persona. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar la Persona. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la Persona. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar la Persona. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la Persona. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar la Persona. por favor valide la traza completa de la excepciópresentada...";
							
		   }
			
			public static final class RegistradorFacadeImplMessages{
				
			private RegistradorFacadeImplMessages() {}
													
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del Registrador. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar del nuevo Registrador. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Registrador. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Registrador. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Registrador. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar el Registrador. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Registrador. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Registrador. por favor valide la traza completa de la excepciópresentada...";
													
		   }
			
			public static final class LocacionFacadeImplMessages{
				
			private LocacionFacadeImplMessages() {}
									
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva Locacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar la nueva Locacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la Locacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar la Locacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la Locacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar la Locacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la Locacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar la Locacion. por favor valide la traza completa de la excepciópresentada...";
								
		   }
			
			public static final class MesaVotacionFacadeImplMessages{
				
			private MesaVotacionFacadeImplMessages() {}
										
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la nueva Mesa De Votacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar la nueva Mesa de Votacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la Mesa de Votacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar la Mesa de Votacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la Mesa de Votacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar la Mesa de Votacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la Mesa de Votacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar la Mesa de Votacion. por favor valide la traza completa de la excepciópresentada...";
									
		   }
			
			public static final class VotanteRegistradoFacadeImplMessages{
				
			private VotanteRegistradoFacadeImplMessages() {}
														
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del Votante Registrado. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar del nuevo Votante Registrado. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Votante Registrado. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Votante Registrado. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Votante Registrado. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar el Votante Registrado. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Votante Registrado. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Votante Registrado. por favor valide la traza completa de la excepciópresentada...";
														
		 }
			
			public static final class JuradoRemanenteFacadeImplMessages{
				
			private JuradoRemanenteFacadeImplMessages() {}
															
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del Jurado Remanente. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar del nuevo Jurado Remanente. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Jurado Remanente. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Jurado Remanente. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Jurado Remanente. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar el Jurado Remanente. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Jurado Remanente. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Jurado Remanente. por favor valide la traza completa de la excepciópresentada...";
															
		 }
			
			public static final class JuradoVotacionFacadeImplMessages{
				
			private JuradoVotacionFacadeImplMessages() {}
																
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del Jurado Votacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar del nuevo Jurado de Votacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Jurado de Votacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Jurado de Votacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Jurado de Votacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar el Jurado de Votacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Jurado de Votacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Jurado de Votacion. por favor valide la traza completa de la excepciópresentada...";
																
		  }
			
			public static final class EleccionFacadeImplMessages{
				
			private EleccionFacadeImplMessages() {}
																	
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion de la Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar dela neuva Eleccion. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion de la Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listarla Eleccion. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion de la Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar la Eleccion. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar la Eleccion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar la Eleccion. por favor valide la traza completa de la excepciópresentada...";
																	
		  }
			
			public static final class CartonVotacionFacadeImplMessages{
				
			private CartonVotacionFacadeImplMessages() {}
																	
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del Carton de Votacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar del nuevo Carton de Votacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Carton de Votacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Carton de Votacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Carton de Votacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar el Carton de Votacion. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Carton de Votacion. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Carton de Votacion. por favor valide la traza completa de la excepciópresentada...";
																	
		  }
			
			public static final class CartonesPorMesaFacadeImplMessages{
				
			private CartonesPorMesaFacadeImplMessages() {}
																		
			public static final String REGISTER_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de registrar la informacion del Cartones Por Mesa. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String REGISTER_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de registrar del nuevo Cartones Por Mesa. por favor valide la traza completa de la excepciópresentada...";
			public static final String LIST_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de listar la informacion del Cartones Por Mesa. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String LIST_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de listar el Cartones Por Mesa. por favor valide la traza completa de la excepciópresentada...";
			public static final String MODIFY_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de modificar la informacion del Cartones Por Mesa. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String MODIFY_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de modificar el Cartones Por Mesa. por favor valide la traza completa de la excepciópresentada...";
			public static final String DROP_EXCEPTION_USER_MESSAGE = "Se ha presentado un problema tratando de eliminar el Cartones Por Mesa. Por favor intente de nuevo y si el problema persiste contacte al administrador de la aplicación...";
			public static final String DROP_EXCEPTION_TECHNICAL_MESSAGE = "Se ha presentado una excepción no conocida al momento de eliminar el Cartones Por Mesa. por favor valide la traza completa de la excepciópresentada...";
																		
		  }

}
