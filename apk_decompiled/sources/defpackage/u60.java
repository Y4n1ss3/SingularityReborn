package defpackage;

import androidx.compose.foundation.MagnifierNode;
import androidx.compose.ui.geometry.Offset;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class u60 implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ MagnifierNode e;

    public /* synthetic */ u60(MagnifierNode magnifierNode, int i) {
        this.d = i;
        this.e = magnifierNode;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 onObservedReadsChanged$lambda$0;
        Offset applySemantics$lambda$0;
        Offset anchorPositionInRoot_F1C5BW0$lambda$0;
        int i = this.d;
        MagnifierNode magnifierNode = this.e;
        switch (i) {
            case 0:
                onObservedReadsChanged$lambda$0 = MagnifierNode.onObservedReadsChanged$lambda$0(magnifierNode);
                return onObservedReadsChanged$lambda$0;
            case 1:
                applySemantics$lambda$0 = MagnifierNode.applySemantics$lambda$0(magnifierNode);
                return applySemantics$lambda$0;
            default:
                anchorPositionInRoot_F1C5BW0$lambda$0 = MagnifierNode.getAnchorPositionInRoot_F1C5BW0$lambda$0(magnifierNode);
                return anchorPositionInRoot_F1C5BW0$lambda$0;
        }
    }
}
