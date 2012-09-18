/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package comp.nodes;

import comp.Visitor;
import comp.VisitorException;
/**
 *
 * @author sl136
 */
public class NodeExprArrayVarDeref extends NodeExprArrayVar {

	public NodeExprArrayVarDeref(String id, NodeExpr expr){
		super(id, expr);
	}

	public void visit( Visitor visitor ) throws VisitorException
	{
		visitor.handleNodeExprArrayVarDeref(this);
	}

}