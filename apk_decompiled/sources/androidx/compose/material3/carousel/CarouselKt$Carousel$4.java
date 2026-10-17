package androidx.compose.material3.carousel;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.iy;
import defpackage.k4;
import defpackage.my;
import defpackage.oy;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarouselKt$Carousel$4 implements oy {
    final /* synthetic */ oy $content;
    final /* synthetic */ CarouselPageSize $pageSize;
    final /* synthetic */ CarouselState $state;

    public CarouselKt$Carousel$4(CarouselState carouselState, CarouselPageSize carouselPageSize, oy oyVar) {
        this.$state = carouselState;
        this.$pageSize = carouselPageSize;
        this.$content = oyVar;
    }

    public final void invoke(PagerScope pagerScope, int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1042567175, i2, -1, "androidx.compose.material3.carousel.Carousel.<anonymous> (Carousel.kt:445)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new CarouselItemDrawInfoImpl();
            composer.updateRememberedValue(rememberedValue);
        }
        final CarouselItemDrawInfoImpl carouselItemDrawInfoImpl = (CarouselItemDrawInfoImpl) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new CarouselItemScopeImpl(carouselItemDrawInfoImpl);
            composer.updateRememberedValue(rememberedValue2);
        }
        CarouselItemScopeImpl carouselItemScopeImpl = (CarouselItemScopeImpl) rememberedValue2;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new Shape() { // from class: androidx.compose.material3.carousel.CarouselKt$Carousel$4$clipShape$1$1
                @Override // androidx.compose.ui.graphics.Shape
                /* renamed from: createOutline-Pq9zytI */
                public Outline mo283createOutlinePq9zytI(long j, LayoutDirection layoutDirection, Density density) {
                    return new Outline.Rectangle(CarouselItemDrawInfoImpl.this.getMaskRect());
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        CarouselKt$Carousel$4$clipShape$1$1 carouselKt$Carousel$4$clipShape$1$1 = (CarouselKt$Carousel$4$clipShape$1$1) rememberedValue3;
        Modifier.Companion companion2 = Modifier.Companion;
        CarouselState carouselState = this.$state;
        boolean changed = composer.changed(this.$pageSize);
        CarouselPageSize carouselPageSize = this.$pageSize;
        Object rememberedValue4 = composer.rememberedValue();
        if (changed || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new a(carouselPageSize, 1);
            composer.updateRememberedValue(rememberedValue4);
        }
        Modifier carouselItem = CarouselKt.carouselItem(companion2, i, carouselState, (iy) rememberedValue4, carouselItemDrawInfoImpl, carouselKt$Carousel$4$clipShape$1$1);
        oy oyVar = this.$content;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, carouselItem);
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        iy constructor = companion3.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer);
        my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
        }
        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        oyVar.invoke(carouselItemScopeImpl, Integer.valueOf(i), composer, Integer.valueOf(i2 & 112));
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Override // defpackage.oy
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((PagerScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return w01.a;
    }
}
