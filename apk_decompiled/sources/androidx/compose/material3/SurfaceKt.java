package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.sn0;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new sn0(6), 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Dp LocalAbsoluteTonalElevation$lambda$3() {
        return Dp.m7609boximpl(Dp.m7611constructorimpl(0.0f));
    }

    /* renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m2464SurfaceT9BRK9s(Modifier modifier, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, my myVar, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i2 & 4) != 0) {
            j = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1781getSurface0d7_KjU();
        }
        if ((i2 & 8) != 0) {
            j2 = ColorSchemeKt.m1797contentColorForek8zF_U(j, composer, (i >> 6) & 14);
        }
        if ((i2 & 16) != 0) {
            f = Dp.m7611constructorimpl(0.0f);
        }
        if ((i2 & 32) != 0) {
            f2 = Dp.m7611constructorimpl(0.0f);
        }
        if ((i2 & 64) != 0) {
            borderStroke = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1093433818, i, -1, "androidx.compose.material3.Surface (Surface.kt:104)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        float m7611constructorimpl = Dp.m7611constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m7625unboximpl() + f);
        Modifier modifier2 = modifier;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j2)), providableCompositionLocal.provides(Dp.m7609boximpl(m7611constructorimpl))}, ComposableLambdaKt.rememberComposableLambda(421772006, true, new SurfaceKt$Surface$1(modifier2, shape, j, m7611constructorimpl, borderStroke, f2, myVar), composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m2465Surfaced85dljk(final boolean z, final iy iyVar, Modifier modifier, boolean z2, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final my myVar, Composer composer, int i, int i2, int i3) {
        final Modifier modifier2 = (i3 & 4) != 0 ? Modifier.Companion : modifier;
        final boolean z3 = (i3 & 8) != 0 ? true : z2;
        final Shape rectangleShape = (i3 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long m1781getSurface0d7_KjU = (i3 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1781getSurface0d7_KjU() : j;
        long m1797contentColorForek8zF_U = (i3 & 64) != 0 ? ColorSchemeKt.m1797contentColorForek8zF_U(m1781getSurface0d7_KjU, composer, (i >> 15) & 14) : j2;
        float m7611constructorimpl = (i3 & Fields.SpotShadowColor) != 0 ? Dp.m7611constructorimpl(0.0f) : f;
        final float m7611constructorimpl2 = (i3 & Fields.RotationX) != 0 ? Dp.m7611constructorimpl(0.0f) : f2;
        BorderStroke borderStroke2 = (i3 & Fields.RotationY) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i3 & Fields.RotationZ) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1416521139, i, i2, "androidx.compose.material3.Surface (Surface.kt:313)");
        }
        if (mutableInteractionSource2 == null) {
            composer.startReplaceGroup(1528143336);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            composer.startReplaceGroup(-227800369);
        }
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float m7611constructorimpl3 = Dp.m7611constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m7625unboximpl() + m7611constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(m1797contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m7609boximpl(m7611constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(1508735219, true, new my() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
            public final void invoke(Composer composer2, int i4) {
                long m2471surfaceColorAtElevationCLU3JFs;
                Modifier m2470surfaceXOJAsU;
                if (!composer2.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1508735219, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:321)");
                }
                Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.this);
                Shape shape2 = rectangleShape;
                m2471surfaceColorAtElevationCLU3JFs = SurfaceKt.m2471surfaceColorAtElevationCLU3JFs(m1781getSurface0d7_KjU, m7611constructorimpl3, composer2, 0);
                m2470surfaceXOJAsU = SurfaceKt.m2470surfaceXOJAsU(minimumInteractiveComponentSize, shape2, m2471surfaceColorAtElevationCLU3JFs, borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(m7611constructorimpl2));
                Modifier childSemantics$default = ChildParentSemanticsKt.childSemantics$default(SelectableKt.m1019selectableO2vRcR0$default(m2470surfaceXOJAsU, z, mutableInteractionSource2, RippleKt.m2297rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z3, null, iyVar, 16, null), null, 1, null);
                my myVar2 = myVar;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, childSemantics$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                iy constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer m3878constructorimpl = Updater.m3878constructorimpl(composer2);
                my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                }
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (fc.l(myVar2, composer2, 0)) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.my
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return w01.a;
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m2467Surfaceo_FOJdg(final iy iyVar, Modifier modifier, boolean z, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final my myVar, Composer composer, int i, int i2, int i3) {
        final Modifier modifier2 = (i3 & 2) != 0 ? Modifier.Companion : modifier;
        final boolean z2 = (i3 & 4) != 0 ? true : z;
        final Shape rectangleShape = (i3 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long m1781getSurface0d7_KjU = (i3 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1781getSurface0d7_KjU() : j;
        long m1797contentColorForek8zF_U = (i3 & 32) != 0 ? ColorSchemeKt.m1797contentColorForek8zF_U(m1781getSurface0d7_KjU, composer, (i >> 12) & 14) : j2;
        float m7611constructorimpl = (i3 & 64) != 0 ? Dp.m7611constructorimpl(0.0f) : f;
        final float m7611constructorimpl2 = (i3 & Fields.SpotShadowColor) != 0 ? Dp.m7611constructorimpl(0.0f) : f2;
        BorderStroke borderStroke2 = (i3 & Fields.RotationX) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i3 & Fields.RotationY) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1472753265, i, i2, "androidx.compose.material3.Surface (Surface.kt:207)");
        }
        if (mutableInteractionSource2 == null) {
            composer.startReplaceGroup(-1701037204);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            composer.startReplaceGroup(2023337163);
        }
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float m7611constructorimpl3 = Dp.m7611constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m7625unboximpl() + m7611constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(m1797contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m7609boximpl(m7611constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(849208527, true, new my() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
            public final void invoke(Composer composer2, int i4) {
                long m2471surfaceColorAtElevationCLU3JFs;
                Modifier m2470surfaceXOJAsU;
                if (!composer2.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(849208527, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:215)");
                }
                Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.this);
                Shape shape2 = rectangleShape;
                m2471surfaceColorAtElevationCLU3JFs = SurfaceKt.m2471surfaceColorAtElevationCLU3JFs(m1781getSurface0d7_KjU, m7611constructorimpl3, composer2, 0);
                m2470surfaceXOJAsU = SurfaceKt.m2470surfaceXOJAsU(minimumInteractiveComponentSize, shape2, m2471surfaceColorAtElevationCLU3JFs, borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(m7611constructorimpl2));
                Modifier childSemantics$default = ChildParentSemanticsKt.childSemantics$default(ClickableKt.m258clickableO2vRcR0$default(m2470surfaceXOJAsU, mutableInteractionSource3, RippleKt.m2297rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z2, null, null, iyVar, 24, null), null, 1, null);
                my myVar2 = myVar;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, childSemantics$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                iy constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer m3878constructorimpl = Updater.m3878constructorimpl(composer2);
                my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                }
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (fc.l(myVar2, composer2, 0)) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.my
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return w01.a;
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-XO-JAsU, reason: not valid java name */
    public static final Modifier m2470surfaceXOJAsU(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        Shape shape2;
        Modifier modifier2;
        Modifier modifier3;
        if (f > 0.0f) {
            modifier2 = Modifier.Companion;
            shape2 = shape;
            modifier3 = GraphicsLayerModifierKt.m4923graphicsLayerAp8cVGQ(modifier2, (r41 & 1) != 0 ? 1.0f : 0.0f, (r41 & 2) != 0 ? 1.0f : 0.0f, (r41 & 4) == 0 ? 0.0f : 1.0f, (r41 & 8) != 0 ? 0.0f : 0.0f, (r41 & 16) != 0 ? 0.0f : 0.0f, (r41 & 32) != 0 ? 0.0f : f, (r41 & 64) != 0 ? 0.0f : 0.0f, (r41 & Fields.SpotShadowColor) != 0 ? 0.0f : 0.0f, (r41 & Fields.RotationX) == 0 ? 0.0f : 0.0f, (r41 & Fields.RotationY) != 0 ? 8.0f : 0.0f, (r41 & Fields.RotationZ) != 0 ? TransformOrigin.Companion.m5174getCenterSzJe1aQ() : 0L, (r41 & Fields.CameraDistance) != 0 ? RectangleShapeKt.getRectangleShape() : shape2, (r41 & Fields.TransformOrigin) != 0 ? false : false, (r41 & 8192) != 0 ? null : null, (r41 & Fields.Clip) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (32768 & r41) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (r41 & 65536) != 0 ? CompositingStrategy.Companion.m4850getAutoNrFUSI() : 0);
        } else {
            shape2 = shape;
            modifier2 = Modifier.Companion;
            modifier3 = modifier2;
        }
        Modifier then = modifier.then(modifier3);
        if (borderStroke != null) {
            modifier2 = BorderKt.border(modifier2, borderStroke, shape2);
        }
        return ClipKt.clip(BackgroundKt.m226backgroundbw27NRU(then.then(modifier2), j, shape2), shape2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m2471surfaceColorAtElevationCLU3JFs(long j, float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:478)");
        }
        long m1795applyTonalElevationRFCenO8 = ColorSchemeKt.m1795applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j, f, composer, (i << 3) & 1008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1795applyTonalElevationRFCenO8;
    }

    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m2466Surfaced85dljk(final boolean z, final ky kyVar, Modifier modifier, boolean z2, Shape shape, long j, long j2, float f, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final my myVar, Composer composer, int i, int i2, int i3) {
        final Modifier modifier2 = (i3 & 4) != 0 ? Modifier.Companion : modifier;
        final boolean z3 = (i3 & 8) != 0 ? true : z2;
        final Shape rectangleShape = (i3 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long m1781getSurface0d7_KjU = (i3 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1781getSurface0d7_KjU() : j;
        long m1797contentColorForek8zF_U = (i3 & 64) != 0 ? ColorSchemeKt.m1797contentColorForek8zF_U(m1781getSurface0d7_KjU, composer, (i >> 15) & 14) : j2;
        float m7611constructorimpl = (i3 & Fields.SpotShadowColor) != 0 ? Dp.m7611constructorimpl(0.0f) : f;
        final float m7611constructorimpl2 = (i3 & Fields.RotationX) != 0 ? Dp.m7611constructorimpl(0.0f) : f2;
        BorderStroke borderStroke2 = (i3 & Fields.RotationY) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i3 & Fields.RotationZ) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1931279214, i, i2, "androidx.compose.material3.Surface (Surface.kt:420)");
        }
        if (mutableInteractionSource2 == null) {
            composer.startReplaceGroup(643421417);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            composer.startReplaceGroup(-533434450);
        }
        composer.endReplaceGroup();
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float m7611constructorimpl3 = Dp.m7611constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m7625unboximpl() + m7611constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(m1797contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m7609boximpl(m7611constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(-1839065134, true, new my() { // from class: androidx.compose.material3.SurfaceKt$Surface$4
            public final void invoke(Composer composer2, int i4) {
                long m2471surfaceColorAtElevationCLU3JFs;
                Modifier m2470surfaceXOJAsU;
                if (!composer2.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1839065134, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:428)");
                }
                Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.this);
                Shape shape2 = rectangleShape;
                m2471surfaceColorAtElevationCLU3JFs = SurfaceKt.m2471surfaceColorAtElevationCLU3JFs(m1781getSurface0d7_KjU, m7611constructorimpl3, composer2, 0);
                m2470surfaceXOJAsU = SurfaceKt.m2470surfaceXOJAsU(minimumInteractiveComponentSize, shape2, m2471surfaceColorAtElevationCLU3JFs, borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(m7611constructorimpl2));
                Modifier childSemantics$default = ChildParentSemanticsKt.childSemantics$default(ToggleableKt.m1026toggleableO2vRcR0$default(m2470surfaceXOJAsU, z, mutableInteractionSource2, RippleKt.m2297rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z3, null, kyVar, 16, null), null, 1, null);
                my myVar2 = myVar;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, childSemantics$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                iy constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer m3878constructorimpl = Updater.m3878constructorimpl(composer2);
                my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                }
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (fc.l(myVar2, composer2, 0)) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // defpackage.my
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return w01.a;
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
