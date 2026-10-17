package androidx.compose.ui.semantics;

import defpackage.f30;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsProperties$IsPopup$1 extends f30 implements my {
    public static final SemanticsProperties$IsPopup$1 INSTANCE = new SemanticsProperties$IsPopup$1();

    public SemanticsProperties$IsPopup$1() {
        super(2);
    }

    @Override // defpackage.my
    public final w01 invoke(w01 w01Var, w01 w01Var2) {
        throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
    }
}
