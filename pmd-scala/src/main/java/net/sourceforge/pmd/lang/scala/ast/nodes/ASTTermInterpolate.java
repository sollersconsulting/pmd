/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast.nodes;

import scala.meta.Term;

public class ASTTermInterpolate extends AbstractScalaNode<Term.Interpolate> {

    public ASTTermInterpolate(Term.Interpolate scalaNode) {
        super(scalaNode);
    }
}
