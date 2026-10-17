package defpackage;

import androidx.compose.runtime.State;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class kc extends hd0 {
    public final /* synthetic */ State a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(boolean z, State state) {
        super(z);
        this.a = state;
    }

    @Override // defpackage.hd0
    public final void handleOnBackPressed() {
        ((iy) this.a.getValue()).invoke();
    }
}
