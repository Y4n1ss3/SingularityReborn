package defpackage;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class pb extends r50 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb(go0 go0Var, int i) {
        super(go0Var);
        this.b = i;
    }

    @Override // defpackage.go0
    public final String a() {
        switch (this.b) {
            case 0:
                return "kotlin.Array";
            default:
                return "kotlin.collections.ArrayList";
        }
    }
}
