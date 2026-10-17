package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class rj implements hm {
    public static final rj e = new rj(0);
    public static final rj f = new rj(1);
    public final /* synthetic */ int d;

    public /* synthetic */ rj(int i) {
        this.d = i;
    }

    @Override // defpackage.hm
    public final kn getContext() {
        switch (this.d) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return st.d;
        }
    }

    @Override // defpackage.hm
    public final void resumeWith(Object obj) {
        switch (this.d) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.d) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
