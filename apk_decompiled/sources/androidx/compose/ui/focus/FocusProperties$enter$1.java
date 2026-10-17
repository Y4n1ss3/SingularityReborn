package androidx.compose.ui.focus;

import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FocusProperties$enter$1 extends f30 implements ky {
    public static final FocusProperties$enter$1 INSTANCE = new FocusProperties$enter$1();

    public FocusProperties$enter$1() {
        super(1);
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return m4417invoke3ESFkO8(((FocusDirection) obj).m4391unboximpl());
    }

    /* renamed from: invoke-3ESFkO8, reason: not valid java name */
    public final FocusRequester m4417invoke3ESFkO8(int i) {
        return FocusRequester.Companion.getDefault();
    }
}
