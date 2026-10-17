package defpackage;

import androidx.compose.foundation.AbstractClickableNode;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ AbstractClickableNode e;

    public /* synthetic */ f(AbstractClickableNode abstractClickableNode, int i) {
        this.d = i;
        this.e = abstractClickableNode;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 onObservedReadsChanged$lambda$0;
        boolean applySemantics$lambda$0;
        int i = this.d;
        AbstractClickableNode abstractClickableNode = this.e;
        switch (i) {
            case 0:
                onObservedReadsChanged$lambda$0 = AbstractClickableNode.onObservedReadsChanged$lambda$0(abstractClickableNode);
                return onObservedReadsChanged$lambda$0;
            default:
                applySemantics$lambda$0 = AbstractClickableNode.applySemantics$lambda$0(abstractClickableNode);
                return Boolean.valueOf(applySemantics$lambda$0);
        }
    }
}
