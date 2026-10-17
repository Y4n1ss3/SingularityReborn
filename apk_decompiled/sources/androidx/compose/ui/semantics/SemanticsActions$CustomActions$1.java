package androidx.compose.ui.semantics;

import defpackage.f30;
import defpackage.my;
import defpackage.ut;
import defpackage.yi;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsActions$CustomActions$1 extends f30 implements my {
    public static final SemanticsActions$CustomActions$1 INSTANCE = new SemanticsActions$CustomActions$1();

    public SemanticsActions$CustomActions$1() {
        super(2);
    }

    @Override // defpackage.my
    public final List<CustomAccessibilityAction> invoke(List<CustomAccessibilityAction> list, List<CustomAccessibilityAction> list2) {
        if (list == null) {
            list = ut.d;
        }
        return yi.A0(list, list2);
    }
}
