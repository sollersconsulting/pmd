/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast.nodes;

import scala.meta.Defn;

public class ASTDefnObject extends AbstractScalaNode<Defn.Object> {

    public ASTDefnObject(Defn.Object scalaNode) {
        super(scalaNode);
    }
}
