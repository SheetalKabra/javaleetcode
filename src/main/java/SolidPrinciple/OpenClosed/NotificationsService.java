package SolidPrinciple.OpenClosed;
//OCP states that according to new requirements the module should be open for extension but closed for modification
//here we have NotificationService which send notification using email and mobile right not.
//but in future, I came and say i want to send the otp using whatsapp as well.
// then we need to add one more logic for whatsapp
//So acc to OCP, we will create an Notification Interface,
// and EmailNotificationService/MobileNotificationService/WhatsappNotificationService which implements NotificationService
public class NotificationsService {
    public void sendOtp(String medium){
        if(medium.equals("email")){
            //write email related logic
            //UseJavaMailSenderAPI
        }
        if(medium.equals("mobile")){
            //write logic using twillio api
        }
    }
}
