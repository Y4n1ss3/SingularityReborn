package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import defpackage.b6;
import defpackage.dq;
import defpackage.f6;
import defpackage.g6;
import defpackage.i6;
import defpackage.iy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.ky;
import defpackage.my;
import defpackage.uo;
import defpackage.w01;
import defpackage.z5;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt {
    public static final void HandlePopup(OffsetProvider offsetProvider, Alignment alignment, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(offsetProvider) : startRestartGroup.changedInstance(offsetProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(alignment) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        boolean z = false;
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1090171650, i2, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:219)");
            }
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && startRestartGroup.changed(offsetProvider))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new HandlePositionProvider(alignment, offsetProvider);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AndroidPopup_androidKt.Popup((HandlePositionProvider) rememberedValue, null, new PopupProperties(false, false, false, (SecureFlagPolicy) null, true, false, 15, (dq) null), myVar, startRestartGroup, ((i2 << 3) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new z5(i, 0, offsetProvider, alignment, myVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 HandlePopup$lambda$1(OffsetProvider offsetProvider, Alignment alignment, my myVar, int i, Composer composer, int i2) {
        HandlePopup(offsetProvider, alignment, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
    
        if ((r29 & 16) != 0) goto L64;
     */
    /* renamed from: SelectionHandle-wLIcFTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1478SelectionHandlewLIcFTc(final OffsetProvider offsetProvider, final boolean z, final ResolvedTextDirection resolvedTextDirection, final boolean z2, long j, final float f, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        Composer startRestartGroup = composer.startRestartGroup(-466280168);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(offsetProvider) : startRestartGroup.changedInstance(offsetProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(resolvedTextDirection.ordinal()) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            j2 = j;
            i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j2)) ? Fields.Clip : 8192;
        } else {
            j2 = j;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 1048576 : Fields.BlendMode;
        }
        int i4 = 0;
        if (startRestartGroup.shouldExecute((533651 & i3) != 533650, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    j2 = DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
                    i3 &= -57345;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-466280168, i3, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:65)");
                }
                final boolean isLeftSelectionHandle = SelectionHandlesKt.isLeftSelectionHandle(z, resolvedTextDirection, z2);
                AbsoluteAlignment absoluteAlignment = AbsoluteAlignment.INSTANCE;
                Alignment topRight = isLeftSelectionHandle ? absoluteAlignment.getTopRight() : absoluteAlignment.getTopLeft();
                int i5 = i3 & 14;
                boolean changed = ((i3 & 112) == 32) | (i5 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(offsetProvider))) | startRestartGroup.changed(isLeftSelectionHandle);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new b6(offsetProvider, z, isLeftSelectionHandle, i4);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (ky) rememberedValue, 1, null);
                final ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                final long j3 = j2;
                HandlePopup(offsetProvider, topRight, ComposableLambdaKt.rememberComposableLambda(1365123137, true, new my() { // from class: c6
                    @Override // defpackage.my
                    public final Object invoke(Object obj, Object obj2) {
                        w01 SelectionHandle_wLIcFTc$lambda$1;
                        int intValue = ((Integer) obj2).intValue();
                        SelectionHandle_wLIcFTc$lambda$1 = AndroidSelectionHandles_androidKt.SelectionHandle_wLIcFTc$lambda$1(ViewConfiguration.this, j3, isLeftSelectionHandle, semantics$default, offsetProvider, (Composer) obj, intValue);
                        return SelectionHandle_wLIcFTc$lambda$1;
                    }
                }, startRestartGroup, 54), startRestartGroup, i5 | 384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j2 = j3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final long j4 = j2;
            endRestartGroup.updateScope(new my() { // from class: d6
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 SelectionHandle_wLIcFTc$lambda$2;
                    int intValue = ((Integer) obj2).intValue();
                    SelectionHandle_wLIcFTc$lambda$2 = AndroidSelectionHandles_androidKt.SelectionHandle_wLIcFTc$lambda$2(OffsetProvider.this, z, resolvedTextDirection, z2, j4, f, modifier, i, i2, (Composer) obj, intValue);
                    return SelectionHandle_wLIcFTc$lambda$2;
                }
            });
        }
    }

    public static final void SelectionHandleIcon(Modifier modifier, iy iyVar, boolean z, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(2111672474);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2111672474, i2, -1, "androidx.compose.foundation.text.selection.SelectionHandleIcon (AndroidSelectionHandles.android.kt:123)");
            }
            SpacerKt.Spacer(drawSelectionHandle(SizeKt.m809sizeVpY3zN4(modifier, SelectionHandlesKt.getHandleWidth(), SelectionHandlesKt.getHandleHeight()), iyVar, z), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new f6(modifier, iyVar, z, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectionHandleIcon$lambda$0(Modifier modifier, iy iyVar, boolean z, int i, Composer composer, int i2) {
        SelectionHandleIcon(modifier, iyVar, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectionHandle_wLIcFTc$lambda$0$0(OffsetProvider offsetProvider, boolean z, boolean z2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        long mo1072provideF1C5BW0 = offsetProvider.mo1072provideF1C5BW0();
        semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(z ? Handle.SelectionStart : Handle.SelectionEnd, mo1072provideF1C5BW0, z2 ? SelectionHandleAnchor.Left : SelectionHandleAnchor.Right, (InlineClassHelperKt.DualUnsignedFloatMask & mo1072provideF1C5BW0) != InlineClassHelperKt.UnspecifiedPackedFloats, null));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectionHandle_wLIcFTc$lambda$1(ViewConfiguration viewConfiguration, final long j, final boolean z, final Modifier modifier, final OffsetProvider offsetProvider, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1365123137, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:85)");
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalViewConfiguration().provides(viewConfiguration), ComposableLambdaKt.rememberComposableLambda(1260045569, true, new my() { // from class: e6
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 SelectionHandle_wLIcFTc$lambda$1$0;
                    int intValue = ((Integer) obj2).intValue();
                    SelectionHandle_wLIcFTc$lambda$1$0 = AndroidSelectionHandles_androidKt.SelectionHandle_wLIcFTc$lambda$1$0(j, z, modifier, offsetProvider, (Composer) obj, intValue);
                    return SelectionHandle_wLIcFTc$lambda$1$0;
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectionHandle_wLIcFTc$lambda$1$0(long j, boolean z, Modifier modifier, final OffsetProvider offsetProvider, Composer composer, int i) {
        final int i2 = 1;
        final int i3 = 0;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1260045569, i, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:86)");
            }
            if (j != InlineClassHelperKt.UnspecifiedPackedFloats) {
                composer.startReplaceGroup(3458246);
                Arrangement.Horizontal right = z ? Arrangement.Absolute.INSTANCE.getRight() : Arrangement.Absolute.INSTANCE.getLeft();
                Modifier m803requiredSizeInqDBjuR0$default = SizeKt.m803requiredSizeInqDBjuR0$default(modifier, DpSize.m7709getWidthD9Ej5fM(j), DpSize.m7707getHeightD9Ej5fM(j), 0.0f, 0.0f, 12, null);
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(right, Alignment.Companion.getTop(), composer, 0);
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m803requiredSizeInqDBjuR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                iy constructor = companion.getConstructor();
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
                uo.h(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier.Companion companion2 = Modifier.Companion;
                boolean changedInstance = composer.changedInstance(offsetProvider);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new iy() { // from class: a6
                        @Override // defpackage.iy
                        public final Object invoke() {
                            boolean SelectionHandle_wLIcFTc$lambda$1$0$1$0;
                            int i4 = i2;
                            OffsetProvider offsetProvider2 = offsetProvider;
                            switch (i4) {
                                case 0:
                                    SelectionHandle_wLIcFTc$lambda$1$0$1$0 = AndroidSelectionHandles_androidKt.SelectionHandle_wLIcFTc$lambda$1$0$1$0(offsetProvider2);
                                    break;
                                default:
                                    SelectionHandle_wLIcFTc$lambda$1$0$1$0 = AndroidSelectionHandles_androidKt.SelectionHandle_wLIcFTc$lambda$1$0$0$0$0(offsetProvider2);
                                    break;
                            }
                            return Boolean.valueOf(SelectionHandle_wLIcFTc$lambda$1$0$1$0);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                SelectionHandleIcon(companion2, (iy) rememberedValue, z, composer, 6);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(4389176);
                boolean changedInstance2 = composer.changedInstance(offsetProvider);
                Object rememberedValue2 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new iy() { // from class: a6
                        @Override // defpackage.iy
                        public final Object invoke() {
                            boolean SelectionHandle_wLIcFTc$lambda$1$0$1$0;
                            int i4 = i3;
                            OffsetProvider offsetProvider2 = offsetProvider;
                            switch (i4) {
                                case 0:
                                    SelectionHandle_wLIcFTc$lambda$1$0$1$0 = AndroidSelectionHandles_androidKt.SelectionHandle_wLIcFTc$lambda$1$0$1$0(offsetProvider2);
                                    break;
                                default:
                                    SelectionHandle_wLIcFTc$lambda$1$0$1$0 = AndroidSelectionHandles_androidKt.SelectionHandle_wLIcFTc$lambda$1$0$0$0$0(offsetProvider2);
                                    break;
                            }
                            return Boolean.valueOf(SelectionHandle_wLIcFTc$lambda$1$0$1$0);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                SelectionHandleIcon(modifier, (iy) rememberedValue2, z, composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SelectionHandle_wLIcFTc$lambda$1$0$0$0$0(OffsetProvider offsetProvider) {
        return (offsetProvider.mo1072provideF1C5BW0() & InlineClassHelperKt.DualUnsignedFloatMask) != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SelectionHandle_wLIcFTc$lambda$1$0$1$0(OffsetProvider offsetProvider) {
        return (offsetProvider.mo1072provideF1C5BW0() & InlineClassHelperKt.DualUnsignedFloatMask) != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SelectionHandle_wLIcFTc$lambda$2(OffsetProvider offsetProvider, boolean z, ResolvedTextDirection resolvedTextDirection, boolean z2, long j, float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m1478SelectionHandlewLIcFTc(offsetProvider, z, resolvedTextDirection, z2, j, f, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final ImageBitmap createHandleImage(CacheDrawScope cacheDrawScope, float f) {
        int ceil = ((int) Math.ceil(f)) * 2;
        HandleImageCache handleImageCache = HandleImageCache.INSTANCE;
        ImageBitmap imageBitmap = handleImageCache.getImageBitmap();
        Canvas canvas = handleImageCache.getCanvas();
        CanvasDrawScope canvasDrawScope = handleImageCache.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || ceil > imageBitmap.getWidth() || ceil > imageBitmap.getHeight()) {
            imageBitmap = ImageBitmapKt.m4997ImageBitmapx__hDU$default(ceil, ceil, ImageBitmapConfig.Companion.m4991getAlpha8_sVssgQ(), false, null, 24, null);
            handleImageCache.setImageBitmap(imageBitmap);
            canvas = CanvasKt.Canvas(imageBitmap);
            handleImageCache.setCanvas(canvas);
        }
        ImageBitmap imageBitmap2 = imageBitmap;
        Canvas canvas2 = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            handleImageCache.setCanvasDrawScope(canvasDrawScope);
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        float width = imageBitmap2.getWidth();
        float height = imageBitmap2.getHeight();
        long m4576constructorimpl = Size.m4576constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m5252component4NHjbRc = drawParams.m5252component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas2);
        drawParams2.m5255setSizeuvyYCjk(m4576constructorimpl);
        canvas2.save();
        DrawScope.m5329drawRectnJ9OG0$default(canvasDrawScope2, Color.Companion.m4787getBlack0d7_KjU(), 0L, canvasDrawScope2.mo5335getSizeNHjbRc(), 0.0f, null, null, BlendMode.Companion.m4674getClear0nO6VwU(), 58, null);
        DrawScope.m5329drawRectnJ9OG0$default(canvasDrawScope2, ColorKt.Color(4278190080L), Offset.Companion.m4532getZeroF1C5BW0(), Size.m4576constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), 0.0f, null, null, 0, 120, null);
        DrawScope.m5316drawCircleVaOC9Bg$default(canvasDrawScope2, ColorKt.Color(4278190080L), f, Offset.m4508constructorimpl((Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)), 0.0f, null, null, 0, 120, null);
        canvas2.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m5255setSizeuvyYCjk(m5252component4NHjbRc);
        return imageBitmap2;
    }

    public static final Modifier drawSelectionHandle(Modifier modifier, iy iyVar, boolean z) {
        return ComposedModifierKt.composed$default(modifier, null, new g6(0, z, iyVar), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier drawSelectionHandle$lambda$0(final iy iyVar, final boolean z, Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(-196777734);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-196777734, i, -1, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:129)");
        }
        final long m1569getHandleColor0d7_KjU = ((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m1569getHandleColor0d7_KjU();
        boolean changed = composer.changed(m1569getHandleColor0d7_KjU) | composer.changed(iyVar) | composer.changed(z);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ky() { // from class: h6
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    DrawResult drawSelectionHandle$lambda$0$0$0;
                    drawSelectionHandle$lambda$0$0$0 = AndroidSelectionHandles_androidKt.drawSelectionHandle$lambda$0$0$0(m1569getHandleColor0d7_KjU, iyVar, z, (CacheDrawScope) obj);
                    return drawSelectionHandle$lambda$0$0$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier drawWithCache = DrawModifierKt.drawWithCache(modifier, (ky) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return drawWithCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawSelectionHandle$lambda$0$0$0(long j, iy iyVar, boolean z, CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new i6(iyVar, z, createHandleImage(cacheDrawScope, Float.intBitsToFloat((int) (cacheDrawScope.m4293getSizeNHjbRc() >> 32)) / 2.0f), ColorFilter.Companion.m4802tintxETnrds$default(ColorFilter.Companion, j, 0, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 drawSelectionHandle$lambda$0$0$0$0(iy iyVar, boolean z, ImageBitmap imageBitmap, ColorFilter colorFilter, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        boolean booleanValue = ((Boolean) iyVar.invoke()).booleanValue();
        w01 w01Var = w01.a;
        if (!booleanValue) {
            return w01Var;
        }
        if (z) {
            long mo5334getCenterF1C5BW0 = contentDrawScope.mo5334getCenterF1C5BW0();
            DrawContext drawContext = contentDrawScope.getDrawContext();
            long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo5263scale0AR0LA0(-1.0f, 1.0f, mo5334getCenterF1C5BW0);
                DrawScope.m5319drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
            } finally {
                kf0.g(drawContext, mo5256getSizeNHjbRc);
            }
        } else {
            DrawScope.m5319drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
        }
        return w01Var;
    }
}
