package defpackage;

import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.ui.layout.Placeable;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;
    public final /* synthetic */ int f;

    public /* synthetic */ h1(int i, int i2, Placeable placeable) {
        this.d = i2;
        this.e = placeable;
        this.f = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 IncreaseVerticalSemanticsBounds$lambda$4$lambda$3;
        w01 IncreaseHorizontalSemanticsBounds$lambda$1$lambda$0;
        int i = this.d;
        int i2 = this.f;
        Placeable placeable = this.e;
        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
        switch (i) {
            case 0:
                IncreaseVerticalSemanticsBounds$lambda$4$lambda$3 = AccessibilityUtilKt.IncreaseVerticalSemanticsBounds$lambda$4$lambda$3(placeable, i2, placementScope);
                return IncreaseVerticalSemanticsBounds$lambda$4$lambda$3;
            default:
                IncreaseHorizontalSemanticsBounds$lambda$1$lambda$0 = AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds$lambda$1$lambda$0(placeable, i2, placementScope);
                return IncreaseHorizontalSemanticsBounds$lambda$1$lambda$0;
        }
    }
}
