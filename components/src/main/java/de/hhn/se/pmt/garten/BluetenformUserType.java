/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten;

import org.hibernate.usertype.UserType;
import org.hibernate.*;
import java.sql.*;
import java.io.*;

public class BluetenformUserType implements UserType {
	private static final int[] SQL_TYPES = {Types.INTEGER};

	public boolean equals(Object aObject, Object aObject2) throws HibernateException {
		//TODO: Implement Method
//		throw new UnsupportedOperationException();
		return ((Bluetenform) aObject).ordinal() == ((Bluetenform)aObject2).ordinal();
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
		return Bluetenform.class;
	}
	
	public Serializable disassemble(Object aObject) throws HibernateException {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void nullSafeSet(PreparedStatement aPreparedStatement, Object aObject, int aint, org.hibernate.engine.spi.SessionImplementor aSessionImplementor) throws HibernateException, SQLException {
		//TODO: Implement Method
//		throw new UnsupportedOperationException();
		Bluetenform bluetenform = (Bluetenform) aObject;
		if (aObject == null){
			aPreparedStatement.setNull(aint, Types.INTEGER);
		}else{
			aPreparedStatement.setInt(aint, bluetenform.ordinal());
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
		return aResultSet.wasNull() ? null : Bluetenform.get(optVal);
	}
	
	public boolean isMutable() {
		//TODO: Implement Method
//		throw new UnsupportedOperationException();
		return false;
	}
	
}
//ORM Hash:370a235d07b0991dbd4b39a8f6ea8595