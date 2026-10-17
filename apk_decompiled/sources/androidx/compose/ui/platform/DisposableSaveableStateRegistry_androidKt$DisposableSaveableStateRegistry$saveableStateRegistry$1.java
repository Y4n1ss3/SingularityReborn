package androidx.compose.ui.platform;

import defpackage.f30;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 extends f30 implements ky {
    public static final DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 INSTANCE = new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1();

    public DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1() {
        super(1);
    }

    @Override // defpackage.ky
    public final Boolean invoke(Object obj) {
        boolean canBeSavedToBundle;
        canBeSavedToBundle = DisposableSaveableStateRegistry_androidKt.canBeSavedToBundle(obj);
        return Boolean.valueOf(canBeSavedToBundle);
    }
}
