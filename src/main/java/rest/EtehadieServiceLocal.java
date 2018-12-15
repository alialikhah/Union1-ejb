package rest;

import java.util.List;

import javax.ejb.Local;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import dao.entity.UserEntity;

@Local
@Path("/sms")
public interface EtehadieServiceLocal {
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	List<UserEntity> findAllUsers();//http://localhost:8080/etehadie/rest/sms
	
/*	@GET
	@Path("{userNameX}")
	@Produces(MediaType.APPLICATION_JSON)
	UserEntity findUserByEmail(@PathParam("userNameX") String userName);//http://localhost:8080/etehadie/rest/sms/moj
	*/
/*	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/response")
	Response findAllUsers2();*/

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/receiver")
	Response receiver(Track track);
	
	
	
/*	@POST
	@Consumes(MediaType.APPLICATION_JSON) 
	@Path("/getSms") //http://localhost:8080/etehadie/rest/sms/getSms در این آدرس باید به سیستم سرویس بدهیم
	Response insertToUserEntity(UserEntity userEntity);*/
	
}
