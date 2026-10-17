package defpackage;

import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class r21 {
    public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
    public static final int DISPATCH_MODE_STOP = 0;
    p31 mDispachedInsets;
    private final int mDispatchMode;

    public r21(int i) {
        this.mDispatchMode = i;
    }

    public final int getDispatchMode() {
        return this.mDispatchMode;
    }

    public abstract p31 onProgress(p31 p31Var, List list);

    public abstract q21 onStart(a31 a31Var, q21 q21Var);

    public void onEnd(a31 a31Var) {
    }

    public void onPrepare(a31 a31Var) {
    }
}
