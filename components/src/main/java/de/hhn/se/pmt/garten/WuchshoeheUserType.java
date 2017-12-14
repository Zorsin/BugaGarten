/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten;

import org.hibernate.usertype.UserType;
import org.hibernate.*;
import java.sql.*;
import java.io.*;

public class WuchshoeheUserType implements UserType {
	private static final int[] SQL_TYPES = {Types.INTEGER};

	public boolean equals(Object aObject, Object aObject2) throws HibernateException {
		return ((Wuchshoehe) aObject).ordinal() == ((Wuchshoehe)aObject2).ordinal();
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
		return Wuchshoehe.class;
	}
	
	public Serializable disassemble(Object aObject) throws HibernateException {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void nullSafeSet(PreparedStatement aPreparedStatement, Object aObject, int aint, org.hibernate.engine.spi.SessionImplementor aSessionImplementor) throws HibernateException, SQLException {

		if (aObject == null){
			aPreparedStatement.setNull(aint, Types.INTEGER);
		}else{
			Wuchshoehe wuchshoehe = (Wuchshoehe) aObject;
			aPreparedStatement.setInt(aint, wuchshoehe.ordinal());
		}
	}
	
	public Object assemble(Serializable aSerializable, Object aObject) throws HibernateException {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public int[] sqlTypes() {
		//TODO: Implement Method
		return SQL_TYPES;
	}
	
	public Object nullSafeGet(ResultSet aResultSet, String[] aStrings, org.hibernate.engine.spi.SessionImplementor aSessionImplementor, Object aObject) throws HibernateException, SQLException {
		//TODO: Implement Method
		int optVal = aResultSet.getInt(aStrings[0]);
		return aResultSet.wasNull() ? null : Wuchshoehe.get(optVal);
	}
	
	public boolean isMutable() {
		//TODO: Implement Method
		return false;
	}
	
}
//ORM Hash:b52548ae0c0de4e7d945ddd07fbd1b07