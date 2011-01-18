/**
 * 
 */
package org.intermine.webservice.server.query.result;

import junit.framework.TestCase;

import org.intermine.metadata.Model;
import org.intermine.pathquery.PathQuery;

/**
 * @author alex
 *
 */
public class JSONQueryResultServiceTest extends TestCase {

	/**
	 * @param arg0
	 */
	public JSONQueryResultServiceTest(String arg0) {
		super(arg0);
	}
	
	private final Model model = Model.getInstanceByName("testmodel");
	private PathQuery pq;
	private final int firstResult = 0;
	private final int maxResults = 5000;
	private final String title = "Testing JSON query service";
	private final String description = "Testing JSON query service to see if it works";
	private final String minelink = "A link to a mine";
	private final String layout = "A layout";
	private QueryResultService qrs;
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
    protected void setUp() throws Exception {
		super.setUp();
		pq = new PathQuery(model);
		pq.addViews("Manager.department.name", "Manager.department.employees.name");
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
    protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testRunJSONPathQuery() throws Exception {
		//fail("We need a test to check we can run a path query and get back json");
	}
	
	public void testExecuteJSONQuery() throws Exception {
		//fail("We need a test to check we can execute a path query request");
	}

}
