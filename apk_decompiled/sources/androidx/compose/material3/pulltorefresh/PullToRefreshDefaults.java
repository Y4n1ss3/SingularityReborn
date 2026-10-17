package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MotionSchemeKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.pulltorefresh.PullToRefreshDefaults;
import androidx.compose.material3.pulltorefresh.PullToRefreshState;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.iy;
import defpackage.je0;
import defpackage.k4;
import defpackage.kf0;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PullToRefreshDefaults {
    public static final int $stable = 0;
    private static final float Elevation;
    private static final float IndicatorMaxDistance;
    private static final float LoadingIndicatorElevation;
    private static final float PositionalThreshold;
    public static final PullToRefreshDefaults INSTANCE = new PullToRefreshDefaults();
    private static final Shape shape = RoundedCornerShapeKt.getCircleShape();
    private static final Shape indicatorShape = RoundedCornerShapeKt.getCircleShape();

    static {
        float m7611constructorimpl = Dp.m7611constructorimpl(80.0f);
        PositionalThreshold = m7611constructorimpl;
        IndicatorMaxDistance = m7611constructorimpl;
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        Elevation = elevationTokens.m3256getLevel2D9Ej5fM();
        LoadingIndicatorElevation = elevationTokens.m3254getLevel0D9Ej5fM();
    }

    private PullToRefreshDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IndicatorBox_1CPYgEU$lambda$2$lambda$1(ContentDrawScope contentDrawScope) {
        int m4750getIntersectrtfAjoo = ClipOp.Companion.m4750getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5259clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, m4750getIntersectrtfAjoo);
            contentDrawScope.drawContent();
            kf0.g(drawContext, mo5256getSizeNHjbRc);
            return w01.a;
        } catch (Throwable th) {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult IndicatorBox_1CPYgEU$lambda$6$lambda$5(final PullToRefreshState pullToRefreshState, final boolean z, final float f, final float f2, final Shape shape2, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(constraints.m7570unboximpl());
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new ky() { // from class: ph0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 IndicatorBox_1CPYgEU$lambda$6$lambda$5$lambda$4;
                IndicatorBox_1CPYgEU$lambda$6$lambda$5$lambda$4 = PullToRefreshDefaults.IndicatorBox_1CPYgEU$lambda$6$lambda$5$lambda$4(Placeable.this, pullToRefreshState, z, f, f2, shape2, (Placeable.PlacementScope) obj);
                return IndicatorBox_1CPYgEU$lambda$6$lambda$5$lambda$4;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IndicatorBox_1CPYgEU$lambda$6$lambda$5$lambda$4(Placeable placeable, final PullToRefreshState pullToRefreshState, final boolean z, final float f, final float f2, final Shape shape2, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, 0, 0, 0.0f, new ky() { // from class: mh0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 IndicatorBox_1CPYgEU$lambda$6$lambda$5$lambda$4$lambda$3;
                IndicatorBox_1CPYgEU$lambda$6$lambda$5$lambda$4$lambda$3 = PullToRefreshDefaults.IndicatorBox_1CPYgEU$lambda$6$lambda$5$lambda$4$lambda$3(PullToRefreshState.this, z, f, f2, shape2, (GraphicsLayerScope) obj);
                return IndicatorBox_1CPYgEU$lambda$6$lambda$5$lambda$4$lambda$3;
            }
        }, 4, (Object) null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IndicatorBox_1CPYgEU$lambda$6$lambda$5$lambda$4$lambda$3(PullToRefreshState pullToRefreshState, boolean z, float f, float f2, Shape shape2, GraphicsLayerScope graphicsLayerScope) {
        boolean z2 = pullToRefreshState.getDistanceFraction() > 0.0f || z;
        graphicsLayerScope.setTranslationY((pullToRefreshState.getDistanceFraction() * graphicsLayerScope.mo361roundToPx0680j_4(f)) - Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() & 4294967295L)));
        graphicsLayerScope.setShadowElevation(z2 ? graphicsLayerScope.mo367toPx0680j_4(f2) : 0.0f);
        graphicsLayerScope.setShape(shape2);
        graphicsLayerScope.setClip(true);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IndicatorBox_1CPYgEU$lambda$7(PullToRefreshDefaults pullToRefreshDefaults, PullToRefreshState pullToRefreshState, boolean z, Modifier modifier, float f, Shape shape2, long j, float f2, ny nyVar, int i, int i2, Composer composer, int i3) {
        pullToRefreshDefaults.m2992IndicatorBox1CPYgEU(pullToRefreshState, z, modifier, f, shape2, j, f2, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Indicator_2poqoh4$lambda$8(PullToRefreshDefaults pullToRefreshDefaults, PullToRefreshState pullToRefreshState, boolean z, Modifier modifier, long j, long j2, float f, int i, int i2, Composer composer, int i3) {
        pullToRefreshDefaults.m2991Indicator2poqoh4(pullToRefreshState, z, modifier, j, j2, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x008c  */
    /* renamed from: Indicator-2poqoh4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2991Indicator2poqoh4(final PullToRefreshState pullToRefreshState, final boolean z, Modifier modifier, long j, long j2, float f, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j3;
        long j4;
        final float f2;
        final Modifier modifier3;
        final long j5;
        final long j6;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        long j7;
        int i4;
        float f3;
        final long j8;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1076870256);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(pullToRefreshState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i6 = Fields.CameraDistance;
                        i3 |= i6;
                    }
                } else {
                    j3 = j;
                }
                i6 = Fields.RotationZ;
                i3 |= i6;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                j4 = j2;
                i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? Fields.Clip : 8192;
            } else {
                j4 = j2;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    if (startRestartGroup.changed(f2)) {
                        i5 = Fields.RenderEffect;
                        i3 |= i5;
                    }
                } else {
                    f2 = f;
                }
                i5 = 65536;
                i3 |= i5;
            } else {
                f2 = f;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changed(this) ? 1048576 : Fields.BlendMode;
            }
            if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j5 = j3;
                j6 = j4;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier4 = i7 != 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 8) != 0) {
                        j7 = getIndicatorContainerColor(startRestartGroup, (i3 >> 18) & 14);
                        i3 &= -7169;
                    } else {
                        j7 = j3;
                    }
                    if ((i2 & 16) != 0) {
                        j4 = getIndicatorColor(startRestartGroup, (i3 >> 18) & 14);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i4 = i3 & (-458753);
                        f3 = IndicatorMaxDistance;
                    } else {
                        i4 = i3;
                        f3 = f2;
                    }
                    j8 = j4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier4 = modifier2;
                    j7 = j3;
                    j8 = j4;
                    i4 = i3;
                    f3 = f2;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1076870256, i4, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:515)");
                }
                int i8 = (i4 & 14) | 12582912 | (i4 & 112) | (i4 & 896) | ((i4 >> 6) & 7168);
                int i9 = i4 << 6;
                int i10 = i8 | (458752 & i9) | (i9 & 234881024);
                Modifier modifier5 = modifier4;
                m2992IndicatorBox1CPYgEU(pullToRefreshState, z, modifier5, f3, null, j7, 0.0f, ComposableLambdaKt.rememberComposableLambda(298232649, true, new ny() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1
                    public final void invoke(BoxScope boxScope, Composer composer2, int i11) {
                        if (!composer2.shouldExecute((i11 & 17) != 16, i11 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(298232649, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous> (PullToRefresh.kt:524)");
                        }
                        CrossfadeKt.Crossfade(Boolean.valueOf(z), (Modifier) null, (FiniteAnimationSpec<Float>) MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer2, 6), (String) null, ComposableLambdaKt.rememberComposableLambda(-2064098104, true, new AnonymousClass1(j8, pullToRefreshState), composer2, 54), composer2, 24576, 10);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // defpackage.ny
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                        return w01.a;
                    }

                    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 implements ny {
                        final /* synthetic */ long $color;
                        final /* synthetic */ PullToRefreshState $state;

                        public AnonymousClass1(long j, PullToRefreshState pullToRefreshState) {
                            this.$color = j;
                            this.$state = pullToRefreshState;
                        }

                        public final void invoke(boolean z, Composer composer, int i) {
                            float f;
                            if ((i & 6) == 0) {
                                i |= composer.changed(z) ? 4 : 2;
                            }
                            if (!composer.shouldExecute((i & 19) != 18, i & 1)) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2064098104, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous>.<anonymous> (PullToRefresh.kt:528)");
                            }
                            if (z) {
                                composer.startReplaceGroup(-499784343);
                                f = PullToRefreshKt.StrokeWidth;
                                ProgressIndicatorKt.m2262CircularProgressIndicator4lLiAd8(SizeKt.m807size3ABfNKs(Modifier.Companion, PullToRefreshKt.getSpinnerSize()), this.$color, f, 0L, 0, 0.0f, composer, 390, 56);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(-499540745);
                                boolean changed = composer.changed(this.$state);
                                final PullToRefreshState pullToRefreshState = this.$state;
                                Object rememberedValue = composer.rememberedValue();
                                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0076: CONSTRUCTOR (r14v3 'rememberedValue' java.lang.Object) = (r13v1 'pullToRefreshState' androidx.compose.material3.pulltorefresh.PullToRefreshState A[DONT_INLINE]) A[MD:(androidx.compose.material3.pulltorefresh.PullToRefreshState):void (m)] (LINE:119) call: androidx.compose.material3.pulltorefresh.a.<init>(androidx.compose.material3.pulltorefresh.PullToRefreshState):void type: CONSTRUCTOR in method: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1.1.invoke(boolean, androidx.compose.runtime.Composer, int):void, file: classes.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
                                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
                                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.material3.pulltorefresh.a, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 122 more
                                        */
                                    /*
                                        this = this;
                                        r0 = r14 & 6
                                        if (r0 != 0) goto Le
                                        boolean r0 = r13.changed(r12)
                                        if (r0 == 0) goto Lc
                                        r0 = 4
                                        goto Ld
                                    Lc:
                                        r0 = 2
                                    Ld:
                                        r14 = r14 | r0
                                    Le:
                                        r0 = r14 & 19
                                        r1 = 18
                                        r2 = 0
                                        if (r0 == r1) goto L17
                                        r0 = 1
                                        goto L18
                                    L17:
                                        r0 = r2
                                    L18:
                                        r1 = r14 & 1
                                        boolean r0 = r13.shouldExecute(r0, r1)
                                        if (r0 == 0) goto L90
                                        boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r0 == 0) goto L2f
                                        r0 = -1
                                        java.lang.String r1 = "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator.<anonymous>.<anonymous> (PullToRefresh.kt:528)"
                                        r3 = -2064098104(0xffffffff84f85cc8, float:-5.8389726E-36)
                                        androidx.compose.runtime.ComposerKt.traceEventStart(r3, r14, r0, r1)
                                    L2f:
                                        if (r12 == 0) goto L57
                                        r12 = -499784343(0xffffffffe235e569, float:-8.3884786E20)
                                        r13.startReplaceGroup(r12)
                                        float r3 = androidx.compose.material3.pulltorefresh.PullToRefreshKt.access$getStrokeWidth$p()
                                        androidx.compose.ui.Modifier$Companion r12 = androidx.compose.ui.Modifier.Companion
                                        float r14 = androidx.compose.material3.pulltorefresh.PullToRefreshKt.getSpinnerSize()
                                        androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.m807size3ABfNKs(r12, r14)
                                        long r1 = r11.$color
                                        r9 = 390(0x186, float:5.47E-43)
                                        r10 = 56
                                        r4 = 0
                                        r6 = 0
                                        r7 = 0
                                        r8 = r13
                                        androidx.compose.material3.ProgressIndicatorKt.m2262CircularProgressIndicator4lLiAd8(r0, r1, r3, r4, r6, r7, r8, r9, r10)
                                        r8.endReplaceGroup()
                                        goto L86
                                    L57:
                                        r8 = r13
                                        r12 = -499540745(0xffffffffe2399cf7, float:-8.5598954E20)
                                        r8.startReplaceGroup(r12)
                                        androidx.compose.material3.pulltorefresh.PullToRefreshState r12 = r11.$state
                                        boolean r12 = r8.changed(r12)
                                        androidx.compose.material3.pulltorefresh.PullToRefreshState r13 = r11.$state
                                        java.lang.Object r14 = r8.rememberedValue()
                                        if (r12 != 0) goto L74
                                        androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.Companion
                                        java.lang.Object r12 = r12.getEmpty()
                                        if (r14 != r12) goto L7c
                                    L74:
                                        androidx.compose.material3.pulltorefresh.a r14 = new androidx.compose.material3.pulltorefresh.a
                                        r14.<init>(r13)
                                        r8.updateRememberedValue(r14)
                                    L7c:
                                        androidx.compose.material3.internal.FloatProducer r14 = (androidx.compose.material3.internal.FloatProducer) r14
                                        long r11 = r11.$color
                                        androidx.compose.material3.pulltorefresh.PullToRefreshKt.m2999access$CircularArrowProgressIndicatorRPmYEkk(r14, r11, r8, r2)
                                        r8.endReplaceGroup()
                                    L86:
                                        boolean r11 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r11 == 0) goto L8f
                                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                                    L8f:
                                        return
                                    L90:
                                        r8 = r13
                                        r8.skipToGroupEnd()
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1.AnonymousClass1.invoke(boolean, androidx.compose.runtime.Composer, int):void");
                                }

                                @Override // defpackage.ny
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke(((Boolean) obj).booleanValue(), (Composer) obj2, ((Number) obj3).intValue());
                                    return w01.a;
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, i10, 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f2 = f3;
                        j5 = j7;
                        j6 = j8;
                        modifier3 = modifier5;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new my() { // from class: lh0
                            @Override // defpackage.my
                            public final Object invoke(Object obj, Object obj2) {
                                w01 Indicator_2poqoh4$lambda$8;
                                int intValue = ((Integer) obj2).intValue();
                                Indicator_2poqoh4$lambda$8 = PullToRefreshDefaults.Indicator_2poqoh4$lambda$8(PullToRefreshDefaults.this, pullToRefreshState, z, modifier3, j5, j6, f2, i, i2, (Composer) obj, intValue);
                                return Indicator_2poqoh4$lambda$8;
                            }
                        });
                        return;
                    }
                    return;
                }
                modifier2 = modifier;
                if ((i & 3072) != 0) {
                }
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:104:0x029c, code lost:
            
                if (defpackage.q10.b(r4.rememberedValue(), java.lang.Integer.valueOf(r5)) == false) goto L189;
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x02d9  */
            /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:145:0x02cd  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x011a  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x00f8  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x00dd  */
            /* JADX WARN: Removed duplicated region for block: B:162:0x00d2  */
            /* JADX WARN: Removed duplicated region for block: B:163:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:172:0x0098  */
            /* JADX WARN: Removed duplicated region for block: B:175:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:176:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0117  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
            /* renamed from: IndicatorBox-1CPYgEU, reason: not valid java name */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m2992IndicatorBox1CPYgEU(final PullToRefreshState pullToRefreshState, final boolean z, Modifier modifier, float f, Shape shape2, long j, float f2, final ny nyVar, Composer composer, final int i, final int i2) {
                int i3;
                int i4;
                Modifier modifier2;
                float f3;
                int i5;
                long j2;
                float f4;
                final Shape shape3;
                ScopeUpdateScope endRestartGroup;
                Shape shape4;
                ComposeUiNode.Companion companion;
                int i6;
                int i7;
                Composer startRestartGroup = composer.startRestartGroup(-1341144489);
                if ((i2 & 1) != 0) {
                    i3 = i | 6;
                } else if ((i & 6) == 0) {
                    i3 = (startRestartGroup.changed(pullToRefreshState) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i2 & 2) != 0) {
                    i3 |= 48;
                } else if ((i & 48) == 0) {
                    i3 |= startRestartGroup.changed(z) ? 32 : 16;
                    i4 = i2 & 4;
                    if (i4 == 0) {
                        i3 |= 384;
                    } else if ((i & 384) == 0) {
                        modifier2 = modifier;
                        i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
                        if ((i & 3072) == 0) {
                            if ((i2 & 8) == 0) {
                                f3 = f;
                                if (startRestartGroup.changed(f3)) {
                                    i7 = Fields.CameraDistance;
                                    i3 |= i7;
                                }
                            } else {
                                f3 = f;
                            }
                            i7 = Fields.RotationZ;
                            i3 |= i7;
                        } else {
                            f3 = f;
                        }
                        if ((i & 24576) == 0) {
                            if ((i2 & 16) == 0 && startRestartGroup.changed(shape2)) {
                                i6 = Fields.Clip;
                                i3 |= i6;
                            }
                            i6 = 8192;
                            i3 |= i6;
                        }
                        i5 = i2 & 32;
                        if (i5 != 0) {
                            i3 |= 196608;
                            j2 = j;
                        } else {
                            j2 = j;
                            if ((i & 196608) == 0) {
                                i3 |= startRestartGroup.changed(j2) ? Fields.RenderEffect : 65536;
                            }
                        }
                        if ((i & 1572864) == 0) {
                            f4 = f2;
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(f4)) ? 1048576 : Fields.BlendMode;
                        } else {
                            f4 = f2;
                        }
                        if ((i2 & Fields.SpotShadowColor) != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        if ((i2 & Fields.RotationX) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changed(this) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            boolean z2 = true;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                shape3 = shape2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i4 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        f3 = IndicatorMaxDistance;
                                    }
                                    if ((i2 & 16) != 0) {
                                        shape4 = indicatorShape;
                                        i3 &= -57345;
                                    } else {
                                        shape4 = shape2;
                                    }
                                    if (i5 != 0) {
                                        j2 = Color.Companion.m4797getUnspecified0d7_KjU();
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                        f4 = Elevation;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    shape4 = shape2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1341144489, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)");
                                }
                                Modifier m807size3ABfNKs = SizeKt.m807size3ABfNKs(modifier2, PullToRefreshKt.getSpinnerContainerSize());
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                Composer.Companion companion2 = Composer.Companion;
                                if (rememberedValue == companion2.getEmpty()) {
                                    rememberedValue = new je0(10);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                Modifier drawWithContent = DrawModifierKt.drawWithContent(m807size3ABfNKs, (ky) rememberedValue);
                                boolean z3 = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(f3)) || (i3 & 3072) == 2048) | ((((3670016 & i3) ^ 1572864) > 1048576 && startRestartGroup.changed(f4)) || (i3 & 1572864) == 1048576);
                                if ((((57344 & i3) ^ 24576) <= 16384 || !startRestartGroup.changed(shape4)) && (i3 & 24576) != 16384) {
                                    z2 = false;
                                }
                                boolean z4 = z3 | z2;
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z4 || rememberedValue2 == companion2.getEmpty()) {
                                    final Shape shape5 = shape4;
                                    final float f5 = f3;
                                    final float f6 = f4;
                                    rememberedValue2 = new ny() { // from class: nh0
                                        @Override // defpackage.ny
                                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                                            MeasureResult IndicatorBox_1CPYgEU$lambda$6$lambda$5;
                                            IndicatorBox_1CPYgEU$lambda$6$lambda$5 = PullToRefreshDefaults.IndicatorBox_1CPYgEU$lambda$6$lambda$5(PullToRefreshState.this, z, f5, f6, shape5, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                                            return IndicatorBox_1CPYgEU$lambda$6$lambda$5;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                Modifier m226backgroundbw27NRU = BackgroundKt.m226backgroundbw27NRU(LayoutModifierKt.layout(drawWithContent, (ny) rememberedValue2), j2, shape4);
                                int i8 = ((i3 >> 12) & 7168) | 48;
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m226backgroundbw27NRU);
                                Shape shape6 = shape4;
                                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                iy constructor = companion3.getConstructor();
                                if (startRestartGroup.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                                my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                if (m3878constructorimpl.getInserting()) {
                                    companion = companion3;
                                } else {
                                    companion = companion3;
                                }
                                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                                nyVar.invoke(BoxScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i8 >> 6) & 112) | 6));
                                startRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                shape3 = shape6;
                            }
                            final Modifier modifier3 = modifier2;
                            final float f7 = f3;
                            final long j3 = j2;
                            final float f8 = f4;
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new my() { // from class: oh0
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 IndicatorBox_1CPYgEU$lambda$7;
                                        int intValue = ((Integer) obj2).intValue();
                                        IndicatorBox_1CPYgEU$lambda$7 = PullToRefreshDefaults.IndicatorBox_1CPYgEU$lambda$7(PullToRefreshDefaults.this, pullToRefreshState, z, modifier3, f7, shape3, j3, f8, nyVar, i, i2, (Composer) obj, intValue);
                                        return IndicatorBox_1CPYgEU$lambda$7;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        boolean z22 = true;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        }
                        final Modifier modifier32 = modifier2;
                        final float f72 = f3;
                        final long j32 = j2;
                        final float f82 = f4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    modifier2 = modifier;
                    if ((i & 3072) == 0) {
                    }
                    if ((i & 24576) == 0) {
                    }
                    i5 = i2 & 32;
                    if (i5 != 0) {
                    }
                    if ((i & 1572864) == 0) {
                    }
                    if ((i2 & Fields.SpotShadowColor) != 0) {
                    }
                    if ((i2 & Fields.RotationX) != 0) {
                    }
                    boolean z222 = true;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                    }
                    final Modifier modifier322 = modifier2;
                    final float f722 = f3;
                    final long j322 = j2;
                    final float f822 = f4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i4 = i2 & 4;
                if (i4 == 0) {
                }
                modifier2 = modifier;
                if ((i & 3072) == 0) {
                }
                if ((i & 24576) == 0) {
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i2 & Fields.SpotShadowColor) != 0) {
                }
                if ((i2 & Fields.RotationX) != 0) {
                }
                boolean z2222 = true;
                if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                final Modifier modifier3222 = modifier2;
                final float f7222 = f3;
                final long j3222 = j2;
                final float f8222 = f4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }

            public final long getContainerColor(Composer composer, int i) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1066257972, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-containerColor> (PullToRefresh.kt:405)");
                }
                long m1784getSurfaceContainerHigh0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1784getSurfaceContainerHigh0d7_KjU();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return m1784getSurfaceContainerHigh0d7_KjU;
            }

            /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
            public final float m2993getElevationD9Ej5fM() {
                return Elevation;
            }

            public final long getIndicatorColor(Composer composer, int i) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1441334156, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorColor> (PullToRefresh.kt:413)");
                }
                long m1765getOnSurfaceVariant0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1765getOnSurfaceVariant0d7_KjU();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return m1765getOnSurfaceVariant0d7_KjU;
            }

            public final long getIndicatorContainerColor(Composer composer, int i) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-80510850, i, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorContainerColor> (PullToRefresh.kt:409)");
                }
                long m1784getSurfaceContainerHigh0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1784getSurfaceContainerHigh0d7_KjU();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return m1784getSurfaceContainerHigh0d7_KjU;
            }

            /* renamed from: getIndicatorMaxDistance-D9Ej5fM, reason: not valid java name */
            public final float m2994getIndicatorMaxDistanceD9Ej5fM() {
                return IndicatorMaxDistance;
            }

            public final Shape getIndicatorShape() {
                return indicatorShape;
            }

            /* renamed from: getLoadingIndicatorElevation-D9Ej5fM, reason: not valid java name */
            public final float m2995getLoadingIndicatorElevationD9Ej5fM() {
                return LoadingIndicatorElevation;
            }

            /* renamed from: getPositionalThreshold-D9Ej5fM, reason: not valid java name */
            public final float m2996getPositionalThresholdD9Ej5fM() {
                return PositionalThreshold;
            }

            public final Shape getShape() {
                return shape;
            }

            @er
            public static /* synthetic */ void getContainerColor$annotations() {
            }

            @er
            public static /* synthetic */ void getShape$annotations() {
            }
        }
