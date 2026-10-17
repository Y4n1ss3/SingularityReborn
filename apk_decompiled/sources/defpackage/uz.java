package defpackage;

import androidx.compose.foundation.text.input.internal.HandwritingGestureApi34;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class uz implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ hi0 e;
    public final /* synthetic */ hi0 f;

    public /* synthetic */ uz(hi0 hi0Var, hi0 hi0Var2, int i) {
        this.d = i;
        this.e = hi0Var;
        this.f = hi0Var2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        CharSequence performRemoveSpaceGesture$lambda$1;
        CharSequence performRemoveSpaceGesture$lambda$3;
        int i = this.d;
        hi0 hi0Var = this.f;
        hi0 hi0Var2 = this.e;
        r80 r80Var = (r80) obj;
        switch (i) {
            case 0:
                performRemoveSpaceGesture$lambda$1 = HandwritingGestureApi34.performRemoveSpaceGesture$lambda$1(hi0Var2, hi0Var, r80Var);
                return performRemoveSpaceGesture$lambda$1;
            default:
                performRemoveSpaceGesture$lambda$3 = HandwritingGestureApi34.performRemoveSpaceGesture$lambda$3(hi0Var2, hi0Var, r80Var);
                return performRemoveSpaceGesture$lambda$3;
        }
    }
}
