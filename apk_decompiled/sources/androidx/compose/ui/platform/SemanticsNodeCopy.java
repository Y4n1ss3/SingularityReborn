package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import defpackage.g10;
import defpackage.oa0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsNodeCopy {
    public static final int $stable = 8;
    private final oa0 children;
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNodeCopy(SemanticsNode semanticsNode, g10 g10Var) {
        this.unmergedConfig = semanticsNode.getUnmergedConfig$ui();
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        this.children = new oa0(replacedChildren$ui.size());
        int size = replacedChildren$ui.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui.get(i);
            if (g10Var.a(semanticsNode2.getId())) {
                this.children.b(semanticsNode2.getId());
            }
        }
    }

    public final oa0 getChildren() {
        return this.children;
    }

    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }
}
