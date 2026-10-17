package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MotionSchemeKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import defpackage.ge0;
import defpackage.iy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.ky;
import defpackage.mb0;
import defpackage.ms;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.qh0;
import defpackage.ti;
import defpackage.tl;
import defpackage.ve;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PullToRefreshKt {
    private static final float DragMultiplier = 0.5f;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float StrokeWidth = Dp.m7611constructorimpl(2.5f);
    private static final float ArcRadius = Dp.m7611constructorimpl(5.5f);
    private static final float SpinnerSize = Dp.m7611constructorimpl(16.0f);
    private static final float SpinnerContainerSize = Dp.m7611constructorimpl(40.0f);
    private static final float ArrowWidth = Dp.m7611constructorimpl(10.0f);
    private static final float ArrowHeight = Dp.m7611constructorimpl(5.0f);

    private static final ArrowValues ArrowValues(float f) {
        float max = (Math.max(Math.min(1.0f, f) - 0.4f, 0.0f) * 5.0f) / 3.0f;
        float g = y80.g(Math.abs(f) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 0.25f) + (g - (((float) Math.pow(g, 2.0d)) / 4.0f))) * 0.5f;
        return new ArrowValues(pow, pow * 360.0f, ((0.8f * max) + pow) * 360.0f, Math.min(1.0f, max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularArrowProgressIndicator-RPmYEkk, reason: not valid java name */
    public static final void m2998CircularArrowProgressIndicatorRPmYEkk(FloatProducer floatProducer, long j, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1353562852);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(floatProducer) : startRestartGroup.changedInstance(floatProducer) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1353562852, i2, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:631)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            Object obj = rememberedValue;
            if (rememberedValue == companion.getEmpty()) {
                Path Path = AndroidPath_androidKt.Path();
                Path.mo4651setFillTypeoQ8Xj4U(PathFillType.Companion.m5057getEvenOddRgk1Os());
                startRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            Path path = (Path) obj;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt.derivedStateOf(new ge0(floatProducer, i3));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(CircularArrowProgressIndicator_RPmYEkk$lambda$8((State) rememberedValue2), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, startRestartGroup, 6), 0.0f, null, null, startRestartGroup, 0, 28);
            Modifier.Companion companion2 = Modifier.Companion;
            int i4 = i2 & 14;
            boolean z = i4 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(floatProducer));
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new mb0(floatProducer, 6);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Modifier m807size3ABfNKs = SizeKt.m807size3ABfNKs(SemanticsModifierKt.clearAndSetSemantics(companion2, (ky) rememberedValue3), SpinnerSize);
            boolean changed = startRestartGroup.changed(animateFloatAsState) | (i4 == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(floatProducer))) | ((i2 & 112) == 32) | startRestartGroup.changedInstance(path);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue4 == companion.getEmpty()) {
                ve veVar = new ve(floatProducer, animateFloatAsState, j, path, 2);
                startRestartGroup.updateRememberedValue(veVar);
                rememberedValue4 = veVar;
            }
            CanvasKt.Canvas(m807size3ABfNKs, (ky) rememberedValue4, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new qh0(floatProducer, j, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularArrowProgressIndicator_RPmYEkk$lambda$10$lambda$9(FloatProducer floatProducer, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (floatProducer.invoke() > 0.0f) {
            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(floatProducer.invoke(), new ti(0.0f, 1.0f), 0));
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularArrowProgressIndicator_RPmYEkk$lambda$13$lambda$12(FloatProducer floatProducer, State state, long j, Path path, DrawScope drawScope) {
        ArrowValues ArrowValues = ArrowValues(floatProducer.invoke());
        float floatValue = ((Number) state.getValue()).floatValue();
        float rotation = ArrowValues.getRotation();
        long mo5334getCenterF1C5BW0 = drawScope.mo5334getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5262rotateUv8p0NA(rotation, mo5334getCenterF1C5BW0);
            float mo367toPx0680j_4 = drawScope.mo367toPx0680j_4(ArcRadius);
            float f = StrokeWidth;
            Rect m4555Rect3MmeM6k = RectKt.m4555Rect3MmeM6k(androidx.compose.ui.geometry.SizeKt.m4595getCenteruvyYCjk(drawScope.mo5335getSizeNHjbRc()), (drawScope.mo367toPx0680j_4(f) / 2.0f) + mo367toPx0680j_4);
            m3001drawCircularIndicatorKzyDr3Q(drawScope, j, floatValue, ArrowValues, m4555Rect3MmeM6k, f);
            m3000drawArrowuDrxG_w(drawScope, path, m4555Rect3MmeM6k, j, floatValue, ArrowValues, f);
            kf0.g(drawContext, mo5256getSizeNHjbRc);
            return w01.a;
        } catch (Throwable th) {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CircularArrowProgressIndicator_RPmYEkk$lambda$14(FloatProducer floatProducer, long j, int i, Composer composer, int i2) {
        m2998CircularArrowProgressIndicatorRPmYEkk(floatProducer, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularArrowProgressIndicator_RPmYEkk$lambda$7$lambda$6(FloatProducer floatProducer) {
        if (floatProducer.invoke() >= 1.0f) {
            return 1.0f;
        }
        return MinAlpha;
    }

    private static final float CircularArrowProgressIndicator_RPmYEkk$lambda$8(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PullToRefreshBox(final boolean z, iy iyVar, Modifier modifier, PullToRefreshState pullToRefreshState, Alignment alignment, ny nyVar, ny nyVar2, Composer composer, int i, int i2) {
        int i3;
        iy iyVar2;
        Modifier modifier2;
        final PullToRefreshState pullToRefreshState2;
        int i4;
        Alignment alignment2;
        int i5;
        ny nyVar3;
        Modifier modifier3;
        PullToRefreshState pullToRefreshState3;
        ny nyVar4;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Modifier modifier4;
        PullToRefreshState pullToRefreshState4;
        ny nyVar5;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-532332839);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            }
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    pullToRefreshState2 = pullToRefreshState;
                    if (startRestartGroup.changed(pullToRefreshState2)) {
                        i7 = Fields.CameraDistance;
                        i3 |= i7;
                    }
                } else {
                    pullToRefreshState2 = pullToRefreshState;
                }
                i7 = Fields.RotationZ;
                i3 |= i7;
            } else {
                pullToRefreshState2 = pullToRefreshState;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                alignment2 = alignment;
                i3 |= startRestartGroup.changed(alignment2) ? Fields.Clip : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    ny nyVar6 = nyVar;
                    i3 |= startRestartGroup.changedInstance(nyVar6) ? Fields.RenderEffect : 65536;
                    nyVar3 = nyVar6;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar2) ? 1048576 : Fields.BlendMode;
                    }
                    if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        pullToRefreshState3 = pullToRefreshState2;
                        nyVar4 = nyVar3;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if ((i2 & 8) != 0) {
                                pullToRefreshState2 = rememberPullToRefreshState(startRestartGroup, 0);
                                i3 &= -7169;
                            }
                            Alignment topStart = i4 != 0 ? Alignment.Companion.getTopStart() : alignment2;
                            if (i5 != 0) {
                                nyVar3 = ComposableLambdaKt.rememberComposableLambda(1028036671, true, new ny() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshBox$1
                                    public final void invoke(BoxScope boxScope, Composer composer2, int i9) {
                                        int i10;
                                        if ((i9 & 6) == 0) {
                                            i10 = (composer2.changed(boxScope) ? 4 : 2) | i9;
                                        } else {
                                            i10 = i9;
                                        }
                                        if (!composer2.shouldExecute((i10 & 19) != 18, i10 & 1)) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1028036671, i10, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox.<anonymous> (PullToRefresh.kt:126)");
                                        }
                                        PullToRefreshDefaults.INSTANCE.m2991Indicator2poqoh4(PullToRefreshState.this, z, boxScope.align(Modifier.Companion, Alignment.Companion.getTopCenter()), 0L, 0L, 0.0f, composer2, 1572864, 56);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.ny
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((BoxScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54);
                            }
                            i6 = i3;
                            modifier4 = modifier2;
                            pullToRefreshState4 = pullToRefreshState2;
                            alignment2 = topStart;
                            nyVar5 = nyVar3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            i6 = i3;
                            modifier4 = modifier2;
                            pullToRefreshState4 = pullToRefreshState2;
                            nyVar5 = nyVar3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-532332839, i6, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)");
                        }
                        Modifier m3003pullToRefreshZ4HSEVQ$default = m3003pullToRefreshZ4HSEVQ$default(modifier4, z, pullToRefreshState4, false, 0.0f, iyVar2, 12, null);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment2, false);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m3003pullToRefreshZ4HSEVQ$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        iy constructor = companion.getConstructor();
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
                        my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                        }
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        nyVar2.invoke(boxScopeInstance, startRestartGroup, Integer.valueOf(((i6 >> 15) & 112) | 6));
                        nyVar5.invoke(boxScopeInstance, startRestartGroup, Integer.valueOf(((i6 >> 12) & 112) | 6));
                        startRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        pullToRefreshState3 = pullToRefreshState4;
                        nyVar4 = nyVar5;
                    }
                    Alignment alignment3 = alignment2;
                    ny nyVar7 = nyVar4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new tl(z, iyVar, modifier3, pullToRefreshState3, alignment3, nyVar7, nyVar2, i, i2));
                        return;
                    }
                    return;
                }
                nyVar3 = nyVar;
                if ((i2 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                Alignment alignment32 = alignment2;
                ny nyVar72 = nyVar4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            alignment2 = alignment;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            nyVar3 = nyVar;
            if ((i2 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            Alignment alignment322 = alignment2;
            ny nyVar722 = nyVar4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        alignment2 = alignment;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        nyVar3 = nyVar;
        if ((i2 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        Alignment alignment3222 = alignment2;
        ny nyVar7222 = nyVar4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PullToRefreshBox$lambda$1(boolean z, iy iyVar, Modifier modifier, PullToRefreshState pullToRefreshState, Alignment alignment, ny nyVar, ny nyVar2, int i, int i2, Composer composer, int i3) {
        PullToRefreshBox(z, iyVar, modifier, pullToRefreshState, alignment, nyVar, nyVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final PullToRefreshState PullToRefreshState() {
        return new PullToRefreshStateImpl();
    }

    /* renamed from: drawArrow-uDrxG_w, reason: not valid java name */
    private static final void m3000drawArrowuDrxG_w(DrawScope drawScope, Path path, Rect rect, long j, float f, ArrowValues arrowValues, float f2) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f3 = ArrowWidth;
        path.lineTo((drawScope.mo367toPx0680j_4(f3) * arrowValues.getScale()) / 2.0f, drawScope.mo367toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.lineTo(drawScope.mo367toPx0680j_4(f3) * arrowValues.getScale(), 0.0f);
        float intBitsToFloat = (Float.intBitsToFloat((int) (rect.m4546getCenterF1C5BW0() >> 32)) + (Math.min(rect.getRight() - rect.getLeft(), rect.getBottom() - rect.getTop()) / 2.0f)) - ((drawScope.mo367toPx0680j_4(f3) * arrowValues.getScale()) / 2.0f);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (rect.m4546getCenterF1C5BW0() & 4294967295L)) - drawScope.mo367toPx0680j_4(f2);
        path.mo4653translatek4lQ0M(Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)));
        float endAngle = arrowValues.getEndAngle() - drawScope.mo367toPx0680j_4(f2);
        long mo5334getCenterF1C5BW0 = drawScope.mo5334getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo5262rotateUv8p0NA(endAngle, mo5334getCenterF1C5BW0);
            DrawScope.m5325drawPathLG529CI$default(drawScope, path, j, f, new Stroke(drawScope.mo367toPx0680j_4(f2), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        } finally {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
        }
    }

    /* renamed from: drawCircularIndicator-KzyDr3Q, reason: not valid java name */
    private static final void m3001drawCircularIndicatorKzyDr3Q(DrawScope drawScope, long j, float f, ArrowValues arrowValues, Rect rect, float f2) {
        DrawScope.m5314drawArcyD3GUKo$default(drawScope, j, arrowValues.getStartAngle(), arrowValues.getEndAngle() - arrowValues.getStartAngle(), false, rect.m4551getTopLeftF1C5BW0(), rect.m4549getSizeNHjbRc(), f, new Stroke(drawScope.mo367toPx0680j_4(f2), 0.0f, StrokeCap.Companion.m5135getButtKaPHkGw(), 0, null, 26, null), null, 0, 768, null);
    }

    public static final float getSpinnerContainerSize() {
        return SpinnerContainerSize;
    }

    public static final float getSpinnerSize() {
        return SpinnerSize;
    }

    /* renamed from: pullToRefresh-Z4HSEVQ, reason: not valid java name */
    public static final Modifier m3002pullToRefreshZ4HSEVQ(Modifier modifier, boolean z, PullToRefreshState pullToRefreshState, boolean z2, float f, iy iyVar) {
        return modifier.then(new PullToRefreshElement(z, iyVar, z2, pullToRefreshState, f, null));
    }

    /* renamed from: pullToRefresh-Z4HSEVQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3003pullToRefreshZ4HSEVQ$default(Modifier modifier, boolean z, PullToRefreshState pullToRefreshState, boolean z2, float f, iy iyVar, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 8) != 0) {
            f = PullToRefreshDefaults.INSTANCE.m2996getPositionalThresholdD9Ej5fM();
        }
        return m3002pullToRefreshZ4HSEVQ(modifier, z, pullToRefreshState, z3, f, iyVar);
    }

    public static final PullToRefreshState rememberPullToRefreshState(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(318623070, i, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:585)");
        }
        Object[] objArr = new Object[0];
        Saver<PullToRefreshStateImpl, Float> saver = PullToRefreshStateImpl.Companion.getSaver();
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ms(21);
            composer.updateRememberedValue(rememberedValue);
        }
        PullToRefreshStateImpl pullToRefreshStateImpl = (PullToRefreshStateImpl) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) saver, (iy) rememberedValue, composer, 384);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pullToRefreshStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PullToRefreshStateImpl rememberPullToRefreshState$lambda$3$lambda$2() {
        return new PullToRefreshStateImpl();
    }
}
