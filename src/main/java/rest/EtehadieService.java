package rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import dao.entity.UserEntity;

/**
 * Session Bean implementation class EtehadieService
 */
@Stateless
public class EtehadieService implements EtehadieServiceLocal {

	/**
	 * Default constructor.
	 */
	public EtehadieService() {
		// TODO Auto-generated constructor stub
	}
	@Context
	private UriInfo uriInfo;

	@PersistenceContext(unitName = "aliUnit")
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<UserEntity> findAllUsers() {
		return entityManager.createNamedQuery("findAllUsers").getResultList();
	}

	/*
	 * @Override public UserEntity findUserByEmail(String userName) { return
	 * (UserEntity)
	 * entityManager.createNamedQuery("findUserByName").setParameter("v_userName",
	 * userName) .getSingleResult(); }
	 */
/*
	@Override
	public Response findAllUsers2() {
		return Response.ok(
				new Gson().toJson((UserEntity) entityManager.createNamedQuery("findUserByName")
						.setParameter("v_userName", "moj").getSingleResult(), UserEntity.class),
				MediaType.APPLICATION_OCTET_STREAM).build();
	}*/

	@Override
	public Response receiver(Track track) {
		String result = "Track saved : " + track;
		System.err.println(result);
		return Response.status(201).entity(result).build();
	}

}
