package org.example.carrera_solidaria;

public class KmSolidariosIESMutxamel {
    public static void main(String[] args){

        //Aqui voy a crear un Organizador. El cual va a obtener todos
        // los corredores.
        Organizador iesmutxamel = new Organizador("I");//Solo se le da la edicion ya que el
        // nombre siempre sera IES MUTXAMEL y despúes tenemos la lista de corredores que empieza vacía.
        System.out.println(iesmutxamel);//Imprimimos la info


        Corredor corredor1 = new Corredor("Luis",1.5);//Aqui lo que vamos a hacer es ingresar un nuevo objeto tipo Corredor,
        // con los parametros de nombre y importe por vuelta.
        System.out.println(corredor1);//Imprimimos info de el corredor.
        iesmutxamel.inscribir_corredor(corredor1);//Vamos a inscribir un nuevo corredor.


        corredor1.insertarPatrocinador("Madre","Profe_mates","Profe_ingles");//Inscribimos patrocinadores para los corredores,
        // podemos inscribir un número indefinido por como hemos creado el metodo.
        corredor1.insertarPatrocinador("Profe_cast");//Aqui inscribimos solo 1 para el corredor 1
        System.out.println(corredor1);//Imprimimos la info del corredor.


        Corredor corredor2 = new Corredor("Carla",0.0);//Creamos la corredora carla, con 0 por vuelta.
        System.out.println(corredor2);//Imprimimos la info de la corredora.
        iesmutxamel.inscribir_corredor(corredor2);//Inscribimos a la corredora a la lista del Organizador.


        System.out.println(iesmutxamel);


        //a)
        iesmutxamel.mostrarCorredores();//Metodo para mostrar todos los corredores que esten en la lista de la Organizacion.


        //b)
        corredor1.setNumero_vueltas(15);//Definimos el numero de vueltas que ha dado Jose.
        iesmutxamel.calcularDonacion(corredor1);//Calculamos lo que tienen que pagar a Jose por sus vueltas.

        //Aqui he hecho un ejemplo mío, con raul que corre msa que el viento.
        Organizador iesmutxamel2 = new Organizador("II");

        //Le definimos el nombre y el importe por vuelta, tambien los patrocinadores y lo inscribiremos. Despues vamos a imprimir su info.
        Corredor corredor3 = new Corredor("Rauh",0.1);
        corredor3.insertarPatrocinador("Nacho","Patri","Angel_finalBoss","Paco");
        iesmutxamel2.inscribir_corredor(corredor3);
        System.out.println(corredor3);

        //Mostramos todos los corredores de iesmutxamel 2 , que solo esta raul.
        iesmutxamel2.mostrarCorredores();

        //Aqui hacemos el calculo de cuento le daran a raul por las vueltas, dinero para su beca mec.
        corredor3.setNumero_vueltas(50);
        iesmutxamel2.calcularDonacion(corredor3);

    }
}
