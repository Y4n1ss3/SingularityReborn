package defpackage;

import androidx.compose.material3.SnackbarHostState;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ds extends us0 implements my {
    public int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ SnackbarHostState g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(boolean z, boolean z2, SnackbarHostState snackbarHostState, hm hmVar) {
        super(2, hmVar);
        this.e = z;
        this.f = z2;
        this.g = snackbarHostState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new ds(this.e, this.f, this.g, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((ds) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (defpackage.p01.H(r0, r1, r11) == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(r0, "Module disabled — rebooting device", null, false, null, r11, 14, null) == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(r0, "Blocker disabled", null, false, null, r11, 14, null) == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(r11.g, "Failed to disable blocker", null, false, null, r11, 14, null) == r10) goto L27;
     */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.d;
        vn vnVar = vn.d;
        if (i == 0) {
            p10.Q(obj);
            if (this.e) {
                boolean z = this.f;
                SnackbarHostState snackbarHostState = this.g;
                if (z) {
                    this.d = 1;
                } else {
                    this.d = 3;
                }
                return vnVar;
            }
            this.d = 4;
        } else {
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    p10.Q(obj);
                    return w01.a;
                }
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            nq nqVar = nr.a;
            hq hqVar = hq.d;
            z9 z9Var = new z9(2, 21, null);
            this.d = 2;
        }
    }
}
