package br.com.library.repository;

import br.com.library.config.HibernateUtil;
import br.com.library.domain.model.Usuario;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
* SE PRECISAR MONTAR SQL NA MAO, USAR DESSE JEITO:
*
* session.createNativeQuery("""
    SELECT *
    FROM usuarios
    WHERE nome LIKE :nome
""", Usuario.class)
.setParameter("nome", "%Lucas%")
.getResultList();
*
*
*  OU USANDO orientação a objetos:

* session.createQuery(
    "FROM Usuario WHERE nome = :nome",
    Usuario.class
)
.setParameter("nome", "Lucas")
.getResultList();
* */

public class UsuarioRepository {
    public void salvar(Usuario usuario){

        Transaction transaction = null;

        try(Session session = HibernateUtil.getSeesion()){
            transaction = session.beginTransaction();

            session.persist(usuario);

            transaction.commit();
        } catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }

            throw e;
        }

    }
}
