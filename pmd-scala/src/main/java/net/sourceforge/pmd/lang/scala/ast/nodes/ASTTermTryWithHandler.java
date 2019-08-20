/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast.nodes;

import scala.meta.Term;

public class ASTTermTryWithHandler extends AbstractScalaNode<Term.TryWithHandler> {

    public ASTTermTryWithHandler(Term.TryWithHandler scalaNode) {
        super(scalaNode);
    }
}
