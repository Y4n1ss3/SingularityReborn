package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import defpackage.f30;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CombinedModifier$toString$1 extends f30 implements my {
    public static final CombinedModifier$toString$1 INSTANCE = new CombinedModifier$toString$1();

    public CombinedModifier$toString$1() {
        super(2);
    }

    @Override // defpackage.my
    public final String invoke(String str, Modifier.Element element) {
        if (str.length() == 0) {
            return element.toString();
        }
        return str + ", " + element;
    }
}
