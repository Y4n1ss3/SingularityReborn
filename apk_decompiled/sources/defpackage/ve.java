package defpackage;

import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ve implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ve(long j, float[] fArr, hi0 hi0Var, gi0 gi0Var) {
        this.d = 1;
        this.e = j;
        this.f = fArr;
        this.g = hi0Var;
        this.h = gi0Var;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 drawGenericBorder$lambda$3;
        w01 fillBoundingBoxes_8ffj60Q$lambda$0;
        w01 CircularArrowProgressIndicator_RPmYEkk$lambda$13$lambda$12;
        int i = this.d;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                drawGenericBorder$lambda$3 = BorderModifierNode.drawGenericBorder$lambda$3((Rect) obj4, (ji0) obj3, this.e, (ColorFilter) obj2, (ContentDrawScope) obj);
                return drawGenericBorder$lambda$3;
            case 1:
                fillBoundingBoxes_8ffj60Q$lambda$0 = MultiParagraph.fillBoundingBoxes_8ffj60Q$lambda$0(this.e, (float[]) obj4, (hi0) obj3, (gi0) obj2, (ParagraphInfo) obj);
                return fillBoundingBoxes_8ffj60Q$lambda$0;
            default:
                CircularArrowProgressIndicator_RPmYEkk$lambda$13$lambda$12 = PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$13$lambda$12((FloatProducer) obj4, (State) obj3, this.e, (Path) obj2, (DrawScope) obj);
                return CircularArrowProgressIndicator_RPmYEkk$lambda$13$lambda$12;
        }
    }

    public /* synthetic */ ve(Object obj, Object obj2, long j, Object obj3, int i) {
        this.d = i;
        this.f = obj;
        this.g = obj2;
        this.e = j;
        this.h = obj3;
    }
}
