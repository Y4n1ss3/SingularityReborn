package androidx.compose.material3.carousel;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.b9;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarouselItemScopeImpl implements CarouselItemScope {
    public static final int $stable = 8;
    private final CarouselItemDrawInfo itemInfo;

    public CarouselItemScopeImpl(CarouselItemDrawInfo carouselItemDrawInfo) {
        this.itemInfo = carouselItemDrawInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 rememberMaskShape$lambda$1$lambda$0(CarouselItemScopeImpl carouselItemScopeImpl, Shape shape, Density density, Path path, Size size, LayoutDirection layoutDirection) {
        Rect intersect = carouselItemScopeImpl.getCarouselItemDrawInfo().getMaskRect().intersect(SizeKt.m4606toRectuvyYCjk(size.m4590unboximpl()));
        OutlineKt.addOutline(path, shape.mo283createOutlinePq9zytI(intersect.m4549getSizeNHjbRc(), layoutDirection, density));
        float left = intersect.getLeft();
        float top = intersect.getTop();
        path.mo4653translatek4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L)));
        return w01.a;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    public CarouselItemDrawInfo getCarouselItemDrawInfo() {
        return this.itemInfo;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    public Modifier maskBorder(Modifier modifier, BorderStroke borderStroke, Shape shape, Composer composer, int i) {
        composer.startReplaceGroup(610897768);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(610897768, i, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskBorder (CarouselItemScope.kt:85)");
        }
        Modifier border = BorderKt.border(modifier, borderStroke, rememberMaskShape(shape, composer, (i >> 6) & 126));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return border;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    public Modifier maskClip(Modifier modifier, Shape shape, Composer composer, int i) {
        composer.startReplaceGroup(440683050);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(440683050, i, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskClip (CarouselItemScope.kt:81)");
        }
        Modifier clip = ClipKt.clip(modifier, rememberMaskShape(shape, composer, (i >> 3) & 126));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return clip;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    public GenericShape rememberMaskShape(Shape shape, Composer composer, int i) {
        composer.startReplaceGroup(152582312);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(152582312, i, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.rememberMaskShape (CarouselItemScope.kt:88)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean changed = composer.changed(getCarouselItemDrawInfo()) | composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GenericShape(new b9(this, shape, density, 2));
            composer.updateRememberedValue(rememberedValue);
        }
        GenericShape genericShape = (GenericShape) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return genericShape;
    }
}
