package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.vector.VectorProperty;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import defpackage.er;
import defpackage.kf0;
import defpackage.ky;
import defpackage.oy;
import defpackage.vt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorPainterKt {
    public static final String RootGroupName = "VectorRootGroup";

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderVectorGroup(VectorGroup vectorGroup, Map<String, ? extends VectorConfig> map, Composer composer, int i, int i2) {
        int i3;
        Map<String, ? extends VectorConfig> map2;
        Map<String, ? extends VectorConfig> map3;
        ScopeUpdateScope endRestartGroup;
        Iterator<VectorNode> it;
        Map<String, ? extends VectorConfig> map4;
        Composer startRestartGroup = composer.startRestartGroup(-446179233);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(vectorGroup) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            map2 = map;
            i3 |= startRestartGroup.changedInstance(map2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                map3 = map2;
            } else {
                Map<String, ? extends VectorConfig> map5 = i4 != 0 ? vt.d : map2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-446179233, i3, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:423)");
                }
                Iterator<VectorNode> it2 = vectorGroup.iterator();
                while (it2.hasNext()) {
                    VectorNode next = it2.next();
                    if (next instanceof VectorPath) {
                        startRestartGroup.startReplaceGroup(798455915);
                        VectorPath vectorPath = (VectorPath) next;
                        VectorConfig vectorConfig = map5.get(vectorPath.getName());
                        if (vectorConfig == null) {
                            vectorConfig = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1
                            };
                        }
                        it = it2;
                        Composer composer2 = startRestartGroup;
                        map4 = map5;
                        VectorComposeKt.m5506Path9cdaXJ4((List) vectorConfig.getOrDefault(VectorProperty.PathData.INSTANCE, vectorPath.getPathData()), vectorPath.m5525getPathFillTypeRgk1Os(), vectorPath.getName(), (Brush) vectorConfig.getOrDefault(VectorProperty.Fill.INSTANCE, vectorPath.getFill()), ((Number) vectorConfig.getOrDefault(VectorProperty.FillAlpha.INSTANCE, Float.valueOf(vectorPath.getFillAlpha()))).floatValue(), (Brush) vectorConfig.getOrDefault(VectorProperty.Stroke.INSTANCE, vectorPath.getStroke()), ((Number) vectorConfig.getOrDefault(VectorProperty.StrokeAlpha.INSTANCE, Float.valueOf(vectorPath.getStrokeAlpha()))).floatValue(), ((Number) vectorConfig.getOrDefault(VectorProperty.StrokeLineWidth.INSTANCE, Float.valueOf(vectorPath.getStrokeLineWidth()))).floatValue(), vectorPath.m5526getStrokeLineCapKaPHkGw(), vectorPath.m5527getStrokeLineJoinLxFBmk8(), vectorPath.getStrokeLineMiter(), ((Number) vectorConfig.getOrDefault(VectorProperty.TrimPathStart.INSTANCE, Float.valueOf(vectorPath.getTrimPathStart()))).floatValue(), ((Number) vectorConfig.getOrDefault(VectorProperty.TrimPathEnd.INSTANCE, Float.valueOf(vectorPath.getTrimPathEnd()))).floatValue(), ((Number) vectorConfig.getOrDefault(VectorProperty.TrimPathOffset.INSTANCE, Float.valueOf(vectorPath.getTrimPathOffset()))).floatValue(), composer2, 0, 0, 0);
                        startRestartGroup = composer2;
                        startRestartGroup.endReplaceGroup();
                    } else {
                        it = it2;
                        map4 = map5;
                        if (next instanceof VectorGroup) {
                            startRestartGroup.startReplaceGroup(799870476);
                            VectorGroup vectorGroup2 = (VectorGroup) next;
                            VectorConfig vectorConfig2 = map4.get(vectorGroup2.getName());
                            if (vectorConfig2 == null) {
                                vectorConfig2 = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2
                                };
                            }
                            VectorComposeKt.Group(vectorGroup2.getName(), ((Number) vectorConfig2.getOrDefault(VectorProperty.Rotation.INSTANCE, Float.valueOf(vectorGroup2.getRotation()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.PivotX.INSTANCE, Float.valueOf(vectorGroup2.getPivotX()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.PivotY.INSTANCE, Float.valueOf(vectorGroup2.getPivotY()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.ScaleX.INSTANCE, Float.valueOf(vectorGroup2.getScaleX()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.ScaleY.INSTANCE, Float.valueOf(vectorGroup2.getScaleY()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TranslateX.INSTANCE, Float.valueOf(vectorGroup2.getTranslationX()))).floatValue(), ((Number) vectorConfig2.getOrDefault(VectorProperty.TranslateY.INSTANCE, Float.valueOf(vectorGroup2.getTranslationY()))).floatValue(), (List) vectorConfig2.getOrDefault(VectorProperty.PathData.INSTANCE, vectorGroup2.getClipPathData()), ComposableLambdaKt.rememberComposableLambda(1450046638, true, new VectorPainterKt$RenderVectorGroup$1(next, map4), startRestartGroup, 54), startRestartGroup, 805306368, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(800876643);
                            startRestartGroup.endReplaceGroup();
                        }
                    }
                    map5 = map4;
                    it2 = it;
                }
                map3 = map5;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new VectorPainterKt$RenderVectorGroup$2(vectorGroup, map3, i, i2));
                return;
            }
            return;
        }
        map2 = map;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: configureVectorPainter-T4PVSW8, reason: not valid java name */
    public static final VectorPainter m5518configureVectorPainterT4PVSW8(VectorPainter vectorPainter, long j, long j2, String str, ColorFilter colorFilter, boolean z) {
        vectorPainter.m5515setSizeuvyYCjk$ui(j);
        vectorPainter.setAutoMirror$ui(z);
        vectorPainter.setIntrinsicColorFilter$ui(colorFilter);
        vectorPainter.m5516setViewportSizeuvyYCjk$ui(j2);
        vectorPainter.setName$ui(str);
        return vectorPainter;
    }

    /* renamed from: configureVectorPainter-T4PVSW8$default, reason: not valid java name */
    public static /* synthetic */ VectorPainter m5519configureVectorPainterT4PVSW8$default(VectorPainter vectorPainter, long j, long j2, String str, ColorFilter colorFilter, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str = RootGroupName;
        }
        return m5518configureVectorPainterT4PVSW8(vectorPainter, j, j2, str, colorFilter, (i & 16) != 0 ? false : z);
    }

    /* renamed from: createColorFilter-xETnrds, reason: not valid java name */
    private static final ColorFilter m5520createColorFilterxETnrds(long j, int i) {
        if (j != 16) {
            return ColorFilter.Companion.m4805tintxETnrds(j, i);
        }
        return null;
    }

    public static final GroupComponent createGroupComponent(GroupComponent groupComponent, VectorGroup vectorGroup) {
        int size = vectorGroup.getSize();
        for (int i = 0; i < size; i++) {
            VectorNode vectorNode = vectorGroup.get(i);
            if (vectorNode instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) vectorNode;
                pathComponent.setPathData(vectorPath.getPathData());
                pathComponent.m5499setPathFillTypeoQ8Xj4U(vectorPath.m5525getPathFillTypeRgk1Os());
                pathComponent.setName(vectorPath.getName());
                pathComponent.setFill(vectorPath.getFill());
                pathComponent.setFillAlpha(vectorPath.getFillAlpha());
                pathComponent.setStroke(vectorPath.getStroke());
                pathComponent.setStrokeAlpha(vectorPath.getStrokeAlpha());
                pathComponent.setStrokeLineWidth(vectorPath.getStrokeLineWidth());
                pathComponent.m5500setStrokeLineCapBeK7IIE(vectorPath.m5526getStrokeLineCapKaPHkGw());
                pathComponent.m5501setStrokeLineJoinWw9F2mQ(vectorPath.m5527getStrokeLineJoinLxFBmk8());
                pathComponent.setStrokeLineMiter(vectorPath.getStrokeLineMiter());
                pathComponent.setTrimPathStart(vectorPath.getTrimPathStart());
                pathComponent.setTrimPathEnd(vectorPath.getTrimPathEnd());
                pathComponent.setTrimPathOffset(vectorPath.getTrimPathOffset());
                groupComponent.insertAt(i, pathComponent);
            } else if (vectorNode instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                groupComponent2.setName(vectorGroup2.getName());
                groupComponent2.setRotation(vectorGroup2.getRotation());
                groupComponent2.setScaleX(vectorGroup2.getScaleX());
                groupComponent2.setScaleY(vectorGroup2.getScaleY());
                groupComponent2.setTranslationX(vectorGroup2.getTranslationX());
                groupComponent2.setTranslationY(vectorGroup2.getTranslationY());
                groupComponent2.setPivotX(vectorGroup2.getPivotX());
                groupComponent2.setPivotY(vectorGroup2.getPivotY());
                groupComponent2.setClipPathData(vectorGroup2.getClipPathData());
                createGroupComponent(groupComponent2, vectorGroup2);
                groupComponent.insertAt(i, groupComponent2);
            }
        }
        return groupComponent;
    }

    public static final VectorPainter createVectorPainterFromImageVector(Density density, ImageVector imageVector, GroupComponent groupComponent) {
        long m5521obtainSizePxVpY3zN4 = m5521obtainSizePxVpY3zN4(density, imageVector.m5489getDefaultWidthD9Ej5fM(), imageVector.m5488getDefaultHeightD9Ej5fM());
        return m5518configureVectorPainterT4PVSW8(new VectorPainter(groupComponent), m5521obtainSizePxVpY3zN4, m5522obtainViewportSizePq9zytI(m5521obtainSizePxVpY3zN4, imageVector.getViewportWidth(), imageVector.getViewportHeight()), imageVector.getName(), m5520createColorFilterxETnrds(imageVector.m5491getTintColor0d7_KjU(), imageVector.m5490getTintBlendMode0nO6VwU()), imageVector.getAutoMirror());
    }

    private static final void mirror(DrawScope drawScope, ky kyVar) {
        long mo5334getCenterF1C5BW0 = drawScope.mo5334getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5263scale0AR0LA0(-1.0f, 1.0f, mo5334getCenterF1C5BW0);
            kyVar.invoke(drawScope);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: obtainSizePx-VpY3zN4, reason: not valid java name */
    private static final long m5521obtainSizePxVpY3zN4(Density density, float f, float f2) {
        float mo367toPx0680j_4 = density.mo367toPx0680j_4(f);
        float mo367toPx0680j_42 = density.mo367toPx0680j_4(f2);
        return Size.m4576constructorimpl((Float.floatToRawIntBits(mo367toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo367toPx0680j_42) & 4294967295L));
    }

    /* renamed from: obtainViewportSize-Pq9zytI, reason: not valid java name */
    private static final long m5522obtainViewportSizePq9zytI(long j, float f, float f2) {
        if (Float.isNaN(f)) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if (Float.isNaN(f2)) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return Size.m4576constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    public static final VectorPainter rememberVectorPainter(ImageVector imageVector, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1413834416, i, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:169)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        float genId$ui = imageVector.getGenId$ui();
        float density2 = density.getDensity();
        boolean changed = composer.changed((Float.floatToRawIntBits(density2) & 4294967295L) | (Float.floatToRawIntBits(genId$ui) << 32));
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            GroupComponent groupComponent = new GroupComponent();
            createGroupComponent(groupComponent, imageVector.getRoot());
            rememberedValue = createVectorPainterFromImageVector(density, imageVector, groupComponent);
            composer.updateRememberedValue(rememberedValue);
        }
        VectorPainter vectorPainter = (VectorPainter) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vectorPainter;
    }

    @er
    /* renamed from: rememberVectorPainter-mlNsNFs, reason: not valid java name */
    public static final VectorPainter m5523rememberVectorPaintermlNsNFs(float f, float f2, float f3, float f4, String str, long j, int i, oy oyVar, Composer composer, int i2, int i3) {
        float f5 = (i3 & 4) != 0 ? Float.NaN : f3;
        float f6 = (i3 & 8) != 0 ? Float.NaN : f4;
        String str2 = (i3 & 16) != 0 ? RootGroupName : str;
        long m4797getUnspecified0d7_KjU = (i3 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        int m4699getSrcIn0nO6VwU = (i3 & 64) != 0 ? BlendMode.Companion.m4699getSrcIn0nO6VwU() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(411310745, i2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:85)");
        }
        VectorPainter m5524rememberVectorPaintervIP8VLU = m5524rememberVectorPaintervIP8VLU(f, f2, f5, f6, str2, m4797getUnspecified0d7_KjU, m4699getSrcIn0nO6VwU, false, oyVar, composer, (i2 & 14) | 12582912 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | ((i2 << 3) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m5524rememberVectorPaintervIP8VLU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0131, code lost:
    
        if (r4 == r7.getEmpty()) goto L81;
     */
    /* renamed from: rememberVectorPainter-vIP8VLU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final VectorPainter m5524rememberVectorPaintervIP8VLU(float f, float f2, float f3, float f4, String str, long j, int i, boolean z, oy oyVar, Composer composer, int i2, int i3) {
        Object obj;
        float f5 = (i3 & 4) != 0 ? Float.NaN : f3;
        float f6 = (i3 & 8) == 0 ? f4 : Float.NaN;
        String str2 = (i3 & 16) != 0 ? RootGroupName : str;
        long m4797getUnspecified0d7_KjU = (i3 & 32) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j;
        int m4699getSrcIn0nO6VwU = (i3 & 64) != 0 ? BlendMode.Companion.m4699getSrcIn0nO6VwU() : i;
        boolean z2 = (i3 & Fields.SpotShadowColor) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1685735925, i2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:129)");
        }
        long m5521obtainSizePxVpY3zN4 = m5521obtainSizePxVpY3zN4((Density) composer.consume(CompositionLocalsKt.getLocalDensity()), f, f2);
        long m5522obtainViewportSizePq9zytI = m5522obtainViewportSizePq9zytI(m5521obtainSizePxVpY3zN4, f5, f6);
        boolean z3 = z2;
        boolean z4 = ((((3670016 & i2) ^ 1572864) > 1048576 && composer.changed(m4699getSrcIn0nO6VwU)) || (i2 & 1572864) == 1048576) | ((((458752 & i2) ^ 196608) > 131072 && composer.changed(m4797getUnspecified0d7_KjU)) || (i2 & 196608) == 131072);
        Object rememberedValue = composer.rememberedValue();
        if (z4 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = m5520createColorFilterxETnrds(m4797getUnspecified0d7_KjU, m4699getSrcIn0nO6VwU);
            composer.updateRememberedValue(rememberedValue);
        }
        ColorFilter colorFilter = (ColorFilter) rememberedValue;
        composer.startReplaceGroup(789579543);
        Object rememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new VectorPainter(null, 1, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        VectorPainter vectorPainter = (VectorPainter) rememberedValue2;
        m5518configureVectorPainterT4PVSW8(vectorPainter, m5521obtainSizePxVpY3zN4, m5522obtainViewportSizePq9zytI, str2, colorFilter, z3);
        CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(composer, 0);
        boolean z5 = ((((234881024 & i2) ^ 100663296) > 67108864 && composer.changed(oyVar)) || (i2 & 100663296) == 67108864) | ((((i2 & 896) ^ 384) > 256 && composer.changed(f5)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ 3072) > 2048 && composer.changed(f6)) || (i2 & 3072) == 2048);
        Object rememberedValue3 = composer.rememberedValue();
        if (!z5) {
            obj = rememberedValue3;
        }
        Composition composition$ui = vectorPainter.getComposition$ui();
        if (composition$ui == null || composition$ui.isDisposed()) {
            composition$ui = CompositionKt.Composition(new VectorApplier(vectorPainter.getVector$ui().getRoot()), rememberCompositionContext);
        }
        Composition composition = composition$ui;
        composition.setContent(ComposableLambdaKt.composableLambdaInstance(1749374910, true, new VectorPainterKt$rememberVectorPainter$2$composition$1$1(oyVar, m5522obtainViewportSizePq9zytI)));
        composer.updateRememberedValue(composition);
        obj = composition;
        Composition composition2 = (Composition) obj;
        vectorPainter.setComposition$ui(composition2);
        boolean changedInstance = composer.changedInstance(composition2);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new VectorPainterKt$rememberVectorPainter$2$1$1(composition2);
            composer.updateRememberedValue(rememberedValue4);
        }
        EffectsKt.DisposableEffect(vectorPainter, (ky) rememberedValue4, composer, 0);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vectorPainter;
    }
}
