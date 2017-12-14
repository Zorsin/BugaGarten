/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten;

import org.hibernate.usertype.UserType;
import org.hibernate.*;
import java.sql.*;
import java.io.*;

public class BodenartUserType implements UserType {
	private static final int[] SQL_TYPES = {Types.INTEGER};

	public boolean equals(Object aObject, Object aObject2) throws HibernateException {
		return ((Bodenart) aObject).ordinal() == ((Bodenart)aObject2).ordinal();
	}
	
	public int hashCode(Object aObject) throws HibernateException {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public Object replace(Object aObject, Object aObject2, Object aObject3) throws HibernateException {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public Object deepCopy(Object aObject) throws HibernateException {
		//TODO: Implement Method
		return aObject;
	}
	
	public Class returnedClass() {
		//TODO: Implement Method
//		throw new UnsupportedOperationException();
		return Bodenart.class;
	}
	
	public Serializable disassemble(Object aObject) throws HibernateException {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void nullSafeSet(PreparedStatement aPreparedStatement, Object aObject, int aint, org.hibernate.engine.spi.SessionImplementor aSessionImplementor) throws HibernateException, SQLException {
//
//		throw new UnsupportedOperationException();
		if (aObject == null){
			aPreparedStatement.setNull(aint, Types.INTEGER);
		}else{
			Bodenart bodenart = (Bodenart) aObject;
			aPreparedStatement.setInt(aint, bodenart.ordinal());
		}
	}
	
	public Object assemble(Serializable aSerializable, Object aObject) throws HibernateException {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public int[] sqlTypes() {
		//TODO: Implement Method
//		throw new UnsupportedOperationException();
		return SQL_TYPES;
	}
	
	public Object nullSafeGet(ResultSet aResultSet, String[] aStrings, org.hibernate.engine.spi.SessionImplementor aSessionImplementor, Object aObject) throws HibernateException, SQLException {
		//TODO: Implement Method
//		throw new UnsupportedOperationException();
		int optVal = aResultSet.getInt(aStrings[0]);
		return aResultSet.wasNull() ? null : Bodenart.get(optVal);
	}
	
	public boolean isMutable() {
		//TODO: Implement Method
		return false;
	}
	
}
//ORM Hash:92d7879c6b789bd54a4c2c9815adad45