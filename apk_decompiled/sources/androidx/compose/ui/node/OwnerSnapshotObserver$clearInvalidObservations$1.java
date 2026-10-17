package androidx.compose.ui.node;

import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class OwnerSnapshotObserver$clearInvalidObservations$1 extends f30 implements ky {
    public static final OwnerSnapshotObserver$clearInvalidObservations$1 INSTANCE = new OwnerSnapshotObserver$clearInvalidObservations$1();

    public OwnerSnapshotObserver$clearInvalidObservations$1() {
        super(1);
    }

    @Override // defpackage.ky
    public final Boolean invoke(Object obj) {
        obj.getClass();
        return Boolean.valueOf(!((OwnerScope) obj).isValidOwnerScope());
    }
}
