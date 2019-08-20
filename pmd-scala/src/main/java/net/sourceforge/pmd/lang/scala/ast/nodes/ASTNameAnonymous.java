/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast.nodes;

import scala.meta.Name;

public class ASTNameAnonymous extends AbstractScalaNode<Name.Anonymous> {

    public ASTNameAnonymous(Name.Anonymous scalaNode) {
        super(scalaNode);
    }

    @Override
    public String getImage() {
        return getNode().value();
    }
}
