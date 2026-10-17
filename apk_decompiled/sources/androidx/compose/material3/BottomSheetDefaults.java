package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;
import defpackage.wd;
import defpackage.ye;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BottomSheetDefaults {
    public static final int $stable = 0;
    public static final BottomSheetDefaults INSTANCE = new BottomSheetDefaults();
    private static final float Elevation = SheetBottomTokens.INSTANCE.m3610getDockedModalContainerElevationD9Ej5fM();
    private static final float SheetPeekHeight = Dp.m7611constructorimpl(56.0f);
    private static final float SheetMaxWidth = Dp.m7611constructorimpl(640.0f);
    private static final float PositionalThreshold = Dp.m7611constructorimpl(56.0f);
    private static final float VelocityThreshold = Dp.m7611constructorimpl(125.0f);

    private BottomSheetDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DragHandle_lgZ2HuY$lambda$1$lambda$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DragHandle_lgZ2HuY$lambda$2(BottomSheetDefaults bottomSheetDefaults, Modifier modifier, float f, float f2, Shape shape, long j, int i, int i2, Composer composer, int i3) {
        bottomSheetDefaults.m1641DragHandlelgZ2HuY(modifier, f, f2, shape, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x004d  */
    /* renamed from: DragHandle-lgZ2HuY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1641DragHandlelgZ2HuY(Modifier modifier, float f, float f2, Shape shape, long j, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        final float f3;
        int i4;
        float f4;
        Shape shape2;
        long j2;
        Composer composer2;
        Modifier modifier3;
        float f5;
        ScopeUpdateScope endRestartGroup;
        float f6;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1364277227);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f3 = f;
            i3 |= startRestartGroup.changed(f3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i6 = Fields.CameraDistance;
                            i3 |= i6;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i6 = Fields.RotationZ;
                    i3 |= i6;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        if (startRestartGroup.changed(j2)) {
                            i5 = Fields.Clip;
                            i3 |= i5;
                        }
                    } else {
                        j2 = j;
                    }
                    i5 = 8192;
                    i3 |= i5;
                } else {
                    j2 = j;
                }
                int i9 = 1;
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i7 != 0 ? Modifier.Companion : modifier2;
                        if (i8 != 0) {
                            f3 = SheetBottomTokens.INSTANCE.m3609getDockedDragHandleWidthD9Ej5fM();
                        }
                        if (i4 != 0) {
                            f4 = SheetBottomTokens.INSTANCE.m3608getDockedDragHandleHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            shape2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6).getExtraLarge();
                        }
                        if ((i2 & 16) != 0) {
                            j2 = ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), startRestartGroup, 6);
                            i3 &= -57345;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        modifier3 = modifier2;
                    }
                    final float f7 = f4;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1364277227, i3, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:415)");
                    }
                    Strings.Companion companion = Strings.Companion;
                    String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_bottom_sheet_drag_handle_description), startRestartGroup, 0);
                    f6 = SheetDefaultsKt.DragHandleVerticalPadding;
                    Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(modifier3, 0.0f, f6, 1, null);
                    boolean changed = startRestartGroup.changed(m2983getString2EP1pXo);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new wd(m2983getString2EP1pXo, i9);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    int i10 = i3 >> 6;
                    composer2 = startRestartGroup;
                    SurfaceKt.m2464SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(m764paddingVpY3zN4$default, false, (ky) rememberedValue, 1, null), shape2, j2, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1039573072, true, new my() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
                        public final void invoke(Composer composer3, int i11) {
                            if (!composer3.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1039573072, i11, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:425)");
                            }
                            BoxKt.Box(SizeKt.m809sizeVpY3zN4(Modifier.Companion, f3, f7), composer3, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.my
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return w01.a;
                        }
                    }, startRestartGroup, 54), composer2, (i10 & 112) | 12582912 | (i10 & 896), 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = f7;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    f5 = f4;
                }
                float f8 = f3;
                Shape shape3 = shape2;
                long j3 = j2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new ye(this, modifier3, f8, f5, shape3, j3, i, i2));
                    return;
                }
                return;
            }
            f4 = f2;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            int i92 = 1;
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            float f82 = f3;
            Shape shape32 = shape2;
            long j32 = j2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f3 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        int i922 = 1;
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        float f822 = f3;
        Shape shape322 = shape2;
        long j322 = j2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public final long getContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(433375448, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:383)");
        }
        long value = ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1642getElevationD9Ej5fM() {
        return Elevation;
    }

    public final Shape getExpandedShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1683783414, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:379)");
        }
        Shape value = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getHiddenShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1971658024, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-HiddenShape> (SheetDefaults.kt:375)");
        }
        Shape value = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedMinimizedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getPositionalThreshold-D9Ej5fM$material3, reason: not valid java name */
    public final float m1643getPositionalThresholdD9Ej5fM$material3() {
        return PositionalThreshold;
    }

    public final long getScrimColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2040719176, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:390)");
        }
        long m4760copywmQWz5c$default = Color.m4760copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m4760copywmQWz5c$default;
    }

    /* renamed from: getSheetMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m1644getSheetMaxWidthD9Ej5fM() {
        return SheetMaxWidth;
    }

    /* renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m1645getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM$material3, reason: not valid java name */
    public final float m1646getVelocityThresholdD9Ej5fM$material3() {
        return VelocityThreshold;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511309409, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:401)");
        }
        WindowInsets safeDrawing = WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m833onlybOOhFvg = WindowInsetsKt.m833onlybOOhFvg(safeDrawing, WindowInsetsSides.m845plusgK_yJZ4(companion.m853getBottomJoeWqyM(), companion.m859getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m833onlybOOhFvg;
    }
}
