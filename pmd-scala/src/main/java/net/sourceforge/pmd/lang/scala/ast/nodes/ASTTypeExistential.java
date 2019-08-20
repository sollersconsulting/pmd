/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast.nodes;

import scala.meta.Type;

public class ASTTypeExistential extends AbstractScalaNode<Type.Existential> {

    public ASTTypeExistential(Type.Existential scalaNode) {
        super(scalaNode);
    }
}
