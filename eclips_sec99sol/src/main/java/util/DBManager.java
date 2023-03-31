package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBManager {
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			// InitialContext()는 웹 애플리케이션이 처음 배치될 때 설정
			// 초기 컨텍스트를 구축합니다.
			// 커넥션 풀에 접근하려면 JNDI 서비스를 사용해야 합니다. 
			// JNDI는 서버에서 관리하고 있는 리소스에 대한 정보를 알고 있고 특정 리소스를 찾아서 사용할 수 있도록 
			// 객체를 반환해주는 역활을 합니다. 
			// JNDI 서버역활을 하는 객체를 생성합니다. 
			// 리소스가 로컬에 있을 때는 단순히 InitialContext 객체만 생성하면 됩니다.
			Context initContext = new InitialContext();
			
			// 모든 설정된 엔트리와 자원은 JNDI namespace의 java:/comp/env 부분에 놓이게 됨
			// java:comp/env는 웹어플의 구성된 엔트리와 리소스들이 배치되어있는 부분. 그래서 이것에 접근을 하여 web.xml의 <resource-env-ref>에 설정한 jdbc/mysql과 매핑되는 리소스를 가져온다.
			Context envContext = (Context)initContext.lookup("java:/comp/env");
			
			// envContext의 lookup메서드를 이용해서 "jdbc/TestDB"에 해당하는 객체를 찾아서 ds에 삽입
			// envContext.lookup( )은 리소스를 찾은 후 리소스를 사용할 수 있도록 객체를 반환해주는 메소드 입니다. 
			// lookup( ) 메소드의 인자값으로는 찾으려는 리소스의 등록된 이름을 지정합니다. 
			// 우리가 찾으려는 리소스의 이름은 "jdbc/TestDB" 이고 WAS인 톰캣에서 리소스를 관리하는 
			// 가상의 디렉터리는 "java:/comp/env"입니다. 
			// 그래서 lookup( ) 메소드의 최종인자 값은 "java:comp/env/jdbc/TestDB"이 됩니다.
			// lookup( ) 메소드가 반환하는 객체의 타입은 Object 이기 때문에 원래 리소스 타입으로 변환해줍니다. 앞에서 server.xml 파일에 커넥션 풀을 설정할 때 리소스의 타입을 DataSource로 등록했습니다. 즉, 원래 DataSource로 타입을 변환합니다.
			DataSource ds = (DataSource) envContext.lookup("jdbc/TestDB");
			
			// DataSource 객체의 getConnection( )는 커넥션 풀에 준비된 Connection 객체를 빌려오는 메소드 입니다. 
			// 빌려오는 Connection을 conn에 담습니다.
			conn = ds.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	// DBCP 연동을 사용 후 커넥션 풀을 닫아주는 클래스 생성
	public static void clos(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs!=null) rs.close();
			if (stmt!=null) stmt.close();
			if (conn!=null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void clos(Connection conn, Statement stmt) {
		try {
			if (stmt!=null) stmt.close();
			if (conn!=null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
