package androidx.compose.ui.platform;

import androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner;
import defpackage.f30;
import defpackage.iy;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1 extends f30 implements iy {
    final /* synthetic */ LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1(LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry) {
        super(0);
        this.this$0 = retainedValuesStoreEntry;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m6772invoke() {
        LifecycleRetainedValuesStore lifecycleRetainedValuesStore;
        lifecycleRetainedValuesStore = this.this$0._retainedValuesStore;
        lifecycleRetainedValuesStore.endLifecycleTransition();
    }

    @Override // defpackage.iy
    public /* bridge */ /* synthetic */ Object invoke() {
        m6772invoke();
        return w01.a;
    }
}
