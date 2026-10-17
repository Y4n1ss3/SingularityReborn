package androidx.compose.ui.focus;

import defpackage.f30;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusOwnerImpl$focusSearch$1 extends f30 implements ky {
    final /* synthetic */ ky $onFound;
    final /* synthetic */ FocusTargetNode $source;
    final /* synthetic */ FocusOwnerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$focusSearch$1(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, ky kyVar) {
        super(1);
        this.$source = focusTargetNode;
        this.this$0 = focusOwnerImpl;
        this.$onFound = kyVar;
    }

    @Override // defpackage.ky
    public final Boolean invoke(FocusTargetNode focusTargetNode) {
        boolean booleanValue;
        if (q10.b(focusTargetNode, this.$source)) {
            booleanValue = false;
        } else {
            if (q10.b(focusTargetNode, this.this$0.getRootFocusNode$ui())) {
                o.f("Focus search landed at the root.");
                return null;
            }
            booleanValue = ((Boolean) this.$onFound.invoke(focusTargetNode)).booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }
}
