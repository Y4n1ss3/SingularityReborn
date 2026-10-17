package defpackage;

import androidx.compose.runtime.State;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class vf0 extends hd0 {
    public hy a;
    public final /* synthetic */ un b;
    public final /* synthetic */ State c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf0(boolean z, un unVar, State state) {
        super(z);
        this.b = unVar;
        this.c = state;
    }

    @Override // defpackage.hd0
    public final void handleOnBackCancelled() {
        hy hyVar = this.a;
        if (hyVar != null) {
            hyVar.a();
        }
    }

    @Override // defpackage.hd0
    public final void handleOnBackPressed() {
        hy hyVar = this.a;
        if (hyVar != null && !hyVar.a) {
            hyVar.a();
            hyVar = null;
            this.a = null;
        }
        if (hyVar == null) {
            hyVar = new hy(this.b, false, (my) this.c.getValue());
            this.a = hyVar;
        }
        cq.g((of) hyVar.b);
    }

    @Override // defpackage.hd0
    public final void handleOnBackProgressed(gc gcVar) {
        hy hyVar = this.a;
        if (hyVar != null) {
            ((of) hyVar.b).m(gcVar);
        }
    }

    @Override // defpackage.hd0
    public final void handleOnBackStarted(gc gcVar) {
        hy hyVar = this.a;
        if (hyVar != null) {
            hyVar.a();
        }
        this.a = new hy(this.b, true, (my) this.c.getValue());
    }
}
