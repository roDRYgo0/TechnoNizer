package javaClass;

/** @author rodri*/

public class usersBinnacle {
    
    public static void binnacle(int n){
        binnacle(n, -1);
    }
    
    public static void binnacle(int n, int d){
       binnacles(n, d);
    }
    
    private static void binnacles(int n, int d){
         switch(n){
            case 0:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" se registro en el sistema', ?, ?, 0)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 1:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" inicio sesión', ?, ?, 1)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 2:
                //        System.out.println(methodsSQL.execute("insert into usersBinnacle values ('Actualizacion de toda la información', ?, ?, 2)", standardization.getDateTime(), nickname));
                break;
            case 3:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" cambio su foto de perfil', ?, ?, 3)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 4:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" cambio su nombre de *#*#"+classUsuario.getPreviousFirstName()+"#*#* a *#*#"+classUsuario.getFirstName()+"#*#*', ?, ?, 4)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 5:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" cambio su apellido de *#*#"+classUsuario.getPreviousLastName()+"#*#* a *#*#"+classUsuario.getLastName()+"#*#*', ?, ?, 5)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 6:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" cambio su correo de *#*#"+classUsuario.getPreviousMail()+"#*#* a *#*#"+classUsuario.getMail()+"#*#*', ?, ?, 6)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 7:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" cambio su fecha de nacimiento de *#*#"+classUsuario.getPreviousBirthdate()+"#*#* a *#*#"+classUsuario.getBirthdate()+"#*#*', ?, ?, 7)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 8:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" cambio su género de *#*#"+classUsuario.getPreviousId_gender()+"#*#* a *#*#"+classUsuario.getId_gender()+"#*#*', ?, ?, 8)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 9:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" cambio su condicion de *#*#"+classUsuario.getPreviousCondition()+"#*#* a *#*#"+classUsuario.getCondition()+"#*#*', ?, ?, 9)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 10:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" cambio su membresia de *#*#"+classUsuario.getIdMemberships()+"#*# a *#*#"+classUsuario.getPreviousIdMemberships()+"#*#*', ?, ?, 10)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 11:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" cambio su contraseña', ?, ?, 11)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 12:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" agrego la verificación de dos pasos ', ?, ?, 12)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 13:
                String status;
                if(d == 0)
                    status = "desactivado";
                else
                    status = "activado";
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" cambio la verificación de dos pasos a "+status+"', ?, ?, 13)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 14:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" elimino la verificación de dos pasos ', ?, ?, 14)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 15:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" se equivoco al ingresar la contraseña ', ?, ?, 15)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 16:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" intento restablecer la contraseña', ?, ?, 16)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 17:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" contesto mal las preguntas de seguridad', ?, ?, 17)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 18:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" agrego las preguntas de seguridad ', ?, ?, 18)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 19:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" elimino las preguntas de seguridad ', ?, ?, 19)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 20:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" agrego el contacto *#*#"+classContact.getContact()+"#*#* ', ?, ?, 20)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 21:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" elimino el contacto *#*#"+controller.contac[d].getContact()+"#*#* ', ?, ?, 21)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 22:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classUsuario.getNickname()+" inicio sesión en modo administrativo ', ?, ?, 22)", standardization.getDateTime(), classUsuario.getNickname()));
                break;
            case 23:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classAdmin.nickname+" actualizó la foto a "+classUsuario.getNickname()+" en modo administrativo ', ?, ?, 23)", standardization.getDateTime(), classAdmin.nickname));
                break;
            case 24:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classAdmin.nickname+" actualizó nombres a "+classUsuario.getNickname()+" de *#*#"+classUsuario.getPreviousFirstName()+"#*#* a *#*#"+classUsuario.getFirstName()+"#*#* en modo administrativo ', ?, ?, 24)", standardization.getDateTime(), classAdmin.nickname));
                break;
            case 25:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classAdmin.nickname+" actualizó apellidos a "+classUsuario.getNickname()+" de *#*#"+classUsuario.getPreviousLastName()+"#*#* a *#*#"+classUsuario.getPreviousLastName()+"#*#* en modo administrativo ', ?, ?, 25)", standardization.getDateTime(), classAdmin.nickname));
                break;
            case 26:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classAdmin.nickname+" actualizó correo a "+classUsuario.getNickname()+" de *#*#"+classUsuario.getPreviousMail()+"#*#* a *#*#"+classUsuario.getMail()+"#*#* en modo administrativo ', ?, ?, 26)", standardization.getDateTime(), classAdmin.nickname));
                break;
            case 27:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classAdmin.nickname+" actualizó fecha de nacimiento a "+classUsuario.getNickname()+" de *#*#"+classUsuario.getPreviousBirthdate()+"#*#* a *#*#"+classUsuario.getBirthdate()+"#*#* en modo administrativo ', ?, ?, 27)", standardization.getDateTime(), classAdmin.nickname));
                break;
            case 28:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classAdmin.nickname+" actualizó género a "+classUsuario.getNickname()+" de *#*#"+classUsuario.getPreviousId_gender()+"#*#* a *#*#"+classUsuario.getId_gender()+"#*#* en modo administrativo ', ?, ?, 28)", standardization.getDateTime(), classAdmin.nickname));
                break;
            case 29:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classAdmin.nickname+" actualizó condición a "+classUsuario.getNickname()+" de *#*#"+classUsuario.getPreviousCondition()+"#*#* a *#*#"+classUsuario.getCondition()+"#*#* en modo administrativo ', ?, ?, 29)", standardization.getDateTime(), classAdmin.nickname));
                break;
            case 30:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classAdmin.nickname+" actualizó contraseña a "+classUsuario.getNickname()+" en modo administrativo ', ?, ?, 30)", standardization.getDateTime(), classAdmin.nickname));
                break;
            case 31:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classAdmin.nickname+" inserto keygen a "+classUsuario.getNickname()+" en modo administrativo ', ?, ?, 31)", standardization.getDateTime(), classAdmin.nickname));
                break;
            case 32:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classAdmin.nickname+" actualizó keygen a "+classUsuario.getNickname()+" en modo administrativo ', ?, ?, 32)", standardization.getDateTime(), classAdmin.nickname));
                break;
            case 33:
                System.out.println(methodsSQL.execute("insert into usersBinnacle values ('"+classAdmin.nickname+" elimino keygen a "+classUsuario.getNickname()+" en modo administrativo ', ?, ?, 33)", standardization.getDateTime(), classAdmin.nickname));
                break;
            case 34:
                break;
            case 35:
                break;
            case 36:
                break;
        }
    }
    
}
