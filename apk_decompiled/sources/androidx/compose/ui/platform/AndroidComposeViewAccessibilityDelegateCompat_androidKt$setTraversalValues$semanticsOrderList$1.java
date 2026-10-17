package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsNode;
import defpackage.f30;
import defpackage.g10;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$1 extends f30 implements ky {
    final /* synthetic */ g10 $currentSemanticsNodes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$1(g10 g10Var) {
        super(1);
        this.$currentSemanticsNodes = g10Var;
    }

    @Override // defpackage.ky
    public final Boolean invoke(SemanticsNode semanticsNode) {
        return Boolean.valueOf(this.$currentSemanticsNodes.a(semanticsNode.getId()));
    }
}
