package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.foundation.text.selection.SelectionHandleAnchor;
import androidx.compose.foundation.text.selection.SelectionHandleInfo;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import defpackage.g5;
import defpackage.h5;
import defpackage.i1;
import defpackage.iy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.ky;
import defpackage.my;
import defpackage.uo;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidCursorHandle_androidKt {
    private static final float CursorHandleHeight;
    private static final float CursorHandleWidth;
    private static final float Sqrt2 = 1.4142135f;

    static {
        float m7611constructorimpl = Dp.m7611constructorimpl(25.0f);
        CursorHandleHeight = m7611constructorimpl;
        CursorHandleWidth = Dp.m7611constructorimpl(Dp.m7611constructorimpl(m7611constructorimpl * 2.0f) / 2.4142137f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if ((r14 & 4) != 0) goto L42;
     */
    /* renamed from: CursorHandle-USBMPiE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1059CursorHandleUSBMPiE(final OffsetProvider offsetProvider, final Modifier modifier, final long j, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1776202187);
        int i4 = 2;
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(offsetProvider) : startRestartGroup.changedInstance(offsetProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j)) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    j = DpSize.Companion.m7718getUnspecifiedMYxV2XQ();
                    i3 &= -897;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1776202187, i3, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:51)");
                }
                int i5 = i3 & 14;
                boolean z = i5 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(offsetProvider));
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new defpackage.h(offsetProvider, i4);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (ky) rememberedValue, 1, null);
                AndroidSelectionHandles_androidKt.HandlePopup(offsetProvider, Alignment.Companion.getTopCenter(), ComposableLambdaKt.rememberComposableLambda(-1653527038, true, new my() { // from class: i5
                    @Override // defpackage.my
                    public final Object invoke(Object obj, Object obj2) {
                        w01 CursorHandle_USBMPiE$lambda$1;
                        int intValue = ((Integer) obj2).intValue();
                        CursorHandle_USBMPiE$lambda$1 = AndroidCursorHandle_androidKt.CursorHandle_USBMPiE$lambda$1(j, semantics$default, (Composer) obj, intValue);
                        return CursorHandle_USBMPiE$lambda$1;
                    }
                }, startRestartGroup, 54), startRestartGroup, i5 | 432);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final long j2 = j;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: j5
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 CursorHandle_USBMPiE$lambda$2;
                    int intValue = ((Integer) obj2).intValue();
                    CursorHandle_USBMPiE$lambda$2 = AndroidCursorHandle_androidKt.CursorHandle_USBMPiE$lambda$2(OffsetProvider.this, modifier, j2, i, i2, (Composer) obj, intValue);
                    return CursorHandle_USBMPiE$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CursorHandle_USBMPiE$lambda$0$0(OffsetProvider offsetProvider, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(Handle.Cursor, offsetProvider.mo1072provideF1C5BW0(), SelectionHandleAnchor.Middle, true, null));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CursorHandle_USBMPiE$lambda$1(long j, Modifier modifier, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1653527038, i, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:63)");
            }
            if (j != InlineClassHelperKt.UnspecifiedPackedFloats) {
                composer.startReplaceGroup(-1244013944);
                Modifier m803requiredSizeInqDBjuR0$default = SizeKt.m803requiredSizeInqDBjuR0$default(modifier, DpSize.m7709getWidthD9Ej5fM(j), DpSize.m7707getHeightD9Ej5fM(j), 0.0f, 0.0f, 12, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopCenter(), false);
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
                uo.h(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                DefaultCursorHandle(null, composer, 0, 1);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1243644858);
                DefaultCursorHandle(modifier, composer, 0, 0);
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
    public static final w01 CursorHandle_USBMPiE$lambda$2(OffsetProvider offsetProvider, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m1059CursorHandleUSBMPiE(offsetProvider, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final void DefaultCursorHandle(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(694251107, i3, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:82)");
            }
            SpacerKt.Spacer(drawCursorHandle(SizeKt.m809sizeVpY3zN4(modifier, CursorHandleWidth, CursorHandleHeight)), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: f5
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 DefaultCursorHandle$lambda$0;
                    int intValue = ((Integer) obj2).intValue();
                    DefaultCursorHandle$lambda$0 = AndroidCursorHandle_androidKt.DefaultCursorHandle$lambda$0(Modifier.this, i, i2, (Composer) obj, intValue);
                    return DefaultCursorHandle$lambda$0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DefaultCursorHandle$lambda$0(Modifier modifier, int i, int i2, Composer composer, int i3) {
        DefaultCursorHandle(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final Modifier drawCursorHandle(Modifier modifier) {
        return ComposedModifierKt.composed$default(modifier, null, new i1(2), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier drawCursorHandle$lambda$0(Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(-2126899193);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126899193, i, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:87)");
        }
        long m1569getHandleColor0d7_KjU = ((TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m1569getHandleColor0d7_KjU();
        Modifier.Companion companion = Modifier.Companion;
        boolean changed = composer.changed(m1569getHandleColor0d7_KjU);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new h5(m1569getHandleColor0d7_KjU, 0);
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier then = modifier.then(DrawModifierKt.drawWithCache(companion, (ky) rememberedValue));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return then;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawCursorHandle$lambda$0$0$0(long j, CacheDrawScope cacheDrawScope) {
        float intBitsToFloat = Float.intBitsToFloat((int) (cacheDrawScope.m4293getSizeNHjbRc() >> 32)) / 2.0f;
        return cacheDrawScope.onDrawWithContent(new g5(intBitsToFloat, AndroidSelectionHandles_androidKt.createHandleImage(cacheDrawScope, intBitsToFloat), ColorFilter.Companion.m4802tintxETnrds$default(ColorFilter.Companion, j, 0, 2, null), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 drawCursorHandle$lambda$0$0$0$0(float f, ImageBitmap imageBitmap, ColorFilter colorFilter, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long mo5256getSizeNHjbRc = drawContext.mo5256getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            DrawTransform.translate$default(transform, f, 0.0f, 2, null);
            transform.mo5262rotateUv8p0NA(45.0f, Offset.Companion.m4532getZeroF1C5BW0());
            DrawScope.m5319drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
            kf0.g(drawContext, mo5256getSizeNHjbRc);
            return w01.a;
        } catch (Throwable th) {
            kf0.g(drawContext, mo5256getSizeNHjbRc);
            throw th;
        }
    }

    public static final float getCursorHandleHeight() {
        return CursorHandleHeight;
    }

    public static final float getCursorHandleWidth() {
        return CursorHandleWidth;
    }
}
