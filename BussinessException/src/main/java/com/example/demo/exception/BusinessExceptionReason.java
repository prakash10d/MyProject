package com.example.demo.exception;

public enum BusinessExceptionReason {
         USER_NAME_ALREADY_REGISTER("user name already register"),
	     USER_NAME_NOT_FOUND("user_name not found");
         String code;
         String message;
		
         BusinessExceptionReason(String message) {
        	 this.message=message;
		}
         public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		
}
