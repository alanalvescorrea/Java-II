package alan_estudos_testes;

public class Return {

	public String name;
	
		public Hello (String aName) {
		 name = aName;}
			 public String sayHello(){
				 String mensagem = "olá, " + name + "!!" ;
				 	return mensagem;
			 }
	         }

      public static void main (String []args){
    	  
    	  Hello hello=new Hello ("ana");
    	  System.out.println (hello.sayHello());
    	  
    	  Hello1=new Hello ("alan");
    	  System.out.println(hello1.sayHello());
    	  
      }  
}
      