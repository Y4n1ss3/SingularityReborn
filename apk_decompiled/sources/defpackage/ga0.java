package defpackage;

import androidx.compose.material3.carousel.KeylineList;
import androidx.compose.material3.carousel.KeylineListScope;
import androidx.compose.material3.carousel.StrategyKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ga0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ga0(int i, int i2, int i3, Object obj) {
        this.d = i3;
        this.g = obj;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 pathForRange$lambda$1;
        w01 moveKeylineAndCreateShiftedKeylineList$lambda$5;
        int i = this.d;
        int i2 = this.f;
        int i3 = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                pathForRange$lambda$1 = MultiParagraph.getPathForRange$lambda$1((Path) obj2, i3, i2, (ParagraphInfo) obj);
                return pathForRange$lambda$1;
            default:
                moveKeylineAndCreateShiftedKeylineList$lambda$5 = StrategyKt.moveKeylineAndCreateShiftedKeylineList$lambda$5((KeylineList) obj2, i3, i2, (KeylineListScope) obj);
                return moveKeylineAndCreateShiftedKeylineList$lambda$5;
        }
    }
}
