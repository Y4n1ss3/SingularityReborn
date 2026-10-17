package androidx.compose.ui.semantics;

import defpackage.f30;
import defpackage.my;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsProperties$ContentDescription$1 extends f30 implements my {
    public static final SemanticsProperties$ContentDescription$1 INSTANCE = new SemanticsProperties$ContentDescription$1();

    public SemanticsProperties$ContentDescription$1() {
        super(2);
    }

    @Override // defpackage.my
    public final List<String> invoke(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(list2);
        return arrayList;
    }
}
