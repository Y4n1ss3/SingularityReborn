package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScopeKt;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TabIndicatorOffsetNode;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g5 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ g5(UpdatableAnimationState updatableAnimationState, float f, ky kyVar) {
        this.d = 4;
        this.f = updatableAnimationState;
        this.e = f;
        this.g = kyVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 drawCursorHandle$lambda$0$0$0$0;
        w01 animateScrollToItem$lambda$7;
        w01 ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17$lambda$16;
        w01 measure_3p2s80s$lambda$3;
        w01 animateToZero$lambda$1;
        int i = this.d;
        Object obj2 = this.g;
        float f = this.e;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                drawCursorHandle$lambda$0$0$0$0 = AndroidCursorHandle_androidKt.drawCursorHandle$lambda$0$0$0$0(f, (ImageBitmap) obj3, (ColorFilter) obj2, (ContentDrawScope) obj);
                return drawCursorHandle$lambda$0$0$0$0;
            case 1:
                animateScrollToItem$lambda$7 = LazyLayoutScrollScopeKt.animateScrollToItem$lambda$7(f, (gi0) obj3, (LazyLayoutScrollScope) obj2, (AnimationScope) obj);
                return animateScrollToItem$lambda$7;
            case 2:
                ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17$lambda$16 = ModalBottomSheetKt.ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17$lambda$16(f, (IntSize) obj3, (SheetState) obj2, (DraggableAnchorsConfig) obj);
                return ModalBottomSheetContent_7___e2Q$lambda$18$lambda$17$lambda$16;
            case 3:
                measure_3p2s80s$lambda$3 = TabIndicatorOffsetNode.measure_3p2s80s$lambda$3((Placeable) obj3, (MeasureScope) obj2, f, (Placeable.PlacementScope) obj);
                return measure_3p2s80s$lambda$3;
            default:
                animateToZero$lambda$1 = UpdatableAnimationState.animateToZero$lambda$1((UpdatableAnimationState) obj3, f, (ky) obj2, ((Long) obj).longValue());
                return animateToZero$lambda$1;
        }
    }

    public /* synthetic */ g5(float f, Object obj, Object obj2, int i) {
        this.d = i;
        this.e = f;
        this.f = obj;
        this.g = obj2;
    }

    public /* synthetic */ g5(Placeable placeable, MeasureScope measureScope, float f) {
        this.d = 3;
        this.f = placeable;
        this.g = measureScope;
        this.e = f;
    }
}
