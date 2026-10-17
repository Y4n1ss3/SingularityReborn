package androidx.compose.material3;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import defpackage.ms;
import defpackage.my;
import defpackage.w01;
import defpackage.x80;
import defpackage.yl;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MaterialThemeKt {
    public static final float TextSelectionBackgroundOpacity = 0.4f;
    private static final ProvidableCompositionLocal<Boolean> LocalUsingExpressiveTheme = CompositionLocalKt.staticCompositionLocalOf(new ms(14));
    private static final ProvidableCompositionLocal<MotionScheme> _localMotionScheme = CompositionLocalKt.staticCompositionLocalOf(new ms(15));

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalUsingExpressiveTheme$lambda$3() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialExpressiveTheme(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, final my myVar, Composer composer, int i, int i2) {
        ColorScheme colorScheme2;
        int i3;
        MotionScheme motionScheme2;
        int i4;
        Shapes shapes2;
        int i5;
        Typography typography2;
        my myVar2;
        ColorScheme colorScheme3;
        MotionScheme motionScheme3;
        Shapes shapes3;
        Typography typography3;
        ScopeUpdateScope endRestartGroup;
        final ColorScheme colorScheme4;
        ColorScheme colorScheme5;
        MotionScheme motionScheme4;
        Typography typography4;
        Shapes shapes4;
        Composer startRestartGroup = composer.startRestartGroup(1317329884);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            colorScheme2 = colorScheme;
        } else if ((i & 6) == 0) {
            colorScheme2 = colorScheme;
            i3 = (startRestartGroup.changed(colorScheme2) ? 4 : 2) | i;
        } else {
            colorScheme2 = colorScheme;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            motionScheme2 = motionScheme;
            i3 |= startRestartGroup.changed(motionScheme2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                shapes2 = shapes;
                i3 |= startRestartGroup.changed(shapes2) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    typography2 = typography;
                    i3 |= startRestartGroup.changed(typography2) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        myVar2 = myVar;
                        i3 |= startRestartGroup.changedInstance(myVar2) ? Fields.Clip : 8192;
                        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            if (i6 != 0) {
                                colorScheme2 = null;
                            }
                            final MotionScheme motionScheme5 = i7 != 0 ? null : motionScheme2;
                            final Shapes shapes5 = i4 != 0 ? null : shapes2;
                            final Typography typography5 = i5 != 0 ? null : typography2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1317329884, i3, -1, "androidx.compose.material3.MaterialExpressiveTheme (MaterialTheme.kt:190)");
                            }
                            ProvidableCompositionLocal<Boolean> providableCompositionLocal = LocalUsingExpressiveTheme;
                            if (((Boolean) startRestartGroup.consume(providableCompositionLocal)).booleanValue()) {
                                startRestartGroup.startReplaceGroup(1458674654);
                                if (colorScheme2 == null) {
                                    startRestartGroup.startReplaceGroup(-1061322393);
                                    ColorScheme colorScheme6 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6);
                                    startRestartGroup.endReplaceGroup();
                                    colorScheme5 = colorScheme6;
                                } else {
                                    startRestartGroup.startReplaceGroup(-1061323292);
                                    startRestartGroup.endReplaceGroup();
                                    colorScheme5 = colorScheme2;
                                }
                                if (motionScheme5 == null) {
                                    startRestartGroup.startReplaceGroup(-1061320152);
                                    MotionScheme motionScheme6 = MaterialTheme.INSTANCE.getMotionScheme(startRestartGroup, 6);
                                    startRestartGroup.endReplaceGroup();
                                    motionScheme4 = motionScheme6;
                                } else {
                                    startRestartGroup.startReplaceGroup(-1061321082);
                                    startRestartGroup.endReplaceGroup();
                                    motionScheme4 = motionScheme5;
                                }
                                if (typography5 == null) {
                                    startRestartGroup.startReplaceGroup(-1061318010);
                                    Typography typography6 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                                    startRestartGroup.endReplaceGroup();
                                    typography4 = typography6;
                                } else {
                                    startRestartGroup.startReplaceGroup(-1061318878);
                                    startRestartGroup.endReplaceGroup();
                                    typography4 = typography5;
                                }
                                if (shapes5 == null) {
                                    startRestartGroup.startReplaceGroup(-1061316190);
                                    Shapes shapes6 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6);
                                    startRestartGroup.endReplaceGroup();
                                    shapes4 = shapes6;
                                } else {
                                    startRestartGroup.startReplaceGroup(-1061316934);
                                    startRestartGroup.endReplaceGroup();
                                    shapes4 = shapes5;
                                }
                                MaterialTheme(colorScheme5, motionScheme4, shapes4, typography4, myVar2, startRestartGroup, i3 & 57344, 0);
                                startRestartGroup.endReplaceGroup();
                                colorScheme4 = colorScheme2;
                            } else {
                                startRestartGroup.startReplaceGroup(1459011221);
                                colorScheme4 = colorScheme2;
                                CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(Boolean.TRUE), ComposableLambdaKt.rememberComposableLambda(1535649272, true, new my() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialExpressiveTheme$1
                                    public final void invoke(Composer composer2, int i8) {
                                        if (!composer2.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1535649272, i8, -1, "androidx.compose.material3.MaterialExpressiveTheme.<anonymous> (MaterialTheme.kt:201)");
                                        }
                                        ColorScheme colorScheme7 = ColorScheme.this;
                                        if (colorScheme7 == null) {
                                            colorScheme7 = ColorSchemeKt.expressiveLightColorScheme();
                                        }
                                        ColorScheme colorScheme8 = colorScheme7;
                                        MotionScheme motionScheme7 = motionScheme5;
                                        if (motionScheme7 == null) {
                                            motionScheme7 = MotionScheme.Companion.expressive$material3();
                                        }
                                        MotionScheme motionScheme8 = motionScheme7;
                                        Shapes shapes7 = shapes5;
                                        Shapes shapes8 = shapes7 == null ? new Shapes(null, null, null, null, null, 31, null) : shapes7;
                                        Typography typography7 = typography5;
                                        MaterialThemeKt.MaterialTheme(colorScheme8, motionScheme8, shapes8, typography7 == null ? new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null) : typography7, myVar, composer2, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                startRestartGroup.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            colorScheme3 = colorScheme4;
                            motionScheme3 = motionScheme5;
                            shapes3 = shapes5;
                            typography3 = typography5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            colorScheme3 = colorScheme2;
                            motionScheme3 = motionScheme2;
                            shapes3 = shapes2;
                            typography3 = typography2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new x80(colorScheme3, motionScheme3, shapes3, typography3, myVar, i, i2, 1));
                            return;
                        }
                        return;
                    }
                    myVar2 = myVar;
                    if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                typography2 = typography;
                if ((i2 & 16) == 0) {
                }
                myVar2 = myVar;
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            shapes2 = shapes;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            typography2 = typography;
            if ((i2 & 16) == 0) {
            }
            myVar2 = myVar;
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        motionScheme2 = motionScheme;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        shapes2 = shapes;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        typography2 = typography;
        if ((i2 & 16) == 0) {
        }
        myVar2 = myVar;
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 MaterialExpressiveTheme$lambda$2(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, my myVar, int i, int i2, Composer composer, int i3) {
        MaterialExpressiveTheme(colorScheme, motionScheme, shapes, typography, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c6, code lost:
    
        if ((r25 & 8) != 0) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialTheme(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, final my myVar, Composer composer, int i, int i2) {
        ColorScheme colorScheme2;
        int i3;
        MotionScheme motionScheme2;
        Shapes shapes2;
        final Typography typography2;
        int i4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(904511636);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                colorScheme2 = colorScheme;
                if (startRestartGroup.changed(colorScheme2)) {
                    i7 = 4;
                    i3 = i7 | i;
                }
            } else {
                colorScheme2 = colorScheme;
            }
            i7 = 2;
            i3 = i7 | i;
        } else {
            colorScheme2 = colorScheme;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                motionScheme2 = motionScheme;
                if (startRestartGroup.changed(motionScheme2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                motionScheme2 = motionScheme;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            motionScheme2 = motionScheme;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                shapes2 = shapes;
                if (startRestartGroup.changed(shapes2)) {
                    i5 = Fields.RotationX;
                    i3 |= i5;
                }
            } else {
                shapes2 = shapes;
            }
            i5 = Fields.SpotShadowColor;
            i3 |= i5;
        } else {
            shapes2 = shapes;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                typography2 = typography;
                if (startRestartGroup.changed(typography2)) {
                    i4 = Fields.CameraDistance;
                    i3 |= i4;
                }
            } else {
                typography2 = typography;
            }
            i4 = Fields.RotationZ;
            i3 |= i4;
        } else {
            typography2 = typography;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? Fields.Clip : 8192;
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    motionScheme2 = MaterialTheme.INSTANCE.getMotionScheme(startRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    shapes2 = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    typography2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                    i3 &= -7169;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(904511636, i3, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:95)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ColorSchemeKt.getLocalColorScheme().provides(colorScheme2), _localMotionScheme.provides(motionScheme2), IndicationKt.getLocalIndication().provides(RippleKt.m2297rippleH2RKhps$default(false, 0.0f, 0L, 7, null)), ShapesKt.getLocalShapes().provides(shapes2), TextSelectionColorsKt.getLocalTextSelectionColors().provides(rememberTextSelectionColors(colorScheme2, startRestartGroup, i3 & 14)), TypographyKt.getLocalTypography().provides(typography2)}, ComposableLambdaKt.rememberComposableLambda(-1750539308, true, new my() { // from class: androidx.compose.material3.MaterialThemeKt$MaterialTheme$2
                    public final void invoke(Composer composer2, int i8) {
                        if (!composer2.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1750539308, i8, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:106)");
                        }
                        TextKt.ProvideTextStyle(Typography.this.getBodyLarge(), myVar, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // defpackage.my
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return w01.a;
                    }
                }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Shapes shapes3 = shapes2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x80(colorScheme2, motionScheme2, shapes3, typography2, myVar, i, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 MaterialTheme$lambda$0(ColorScheme colorScheme, Shapes shapes, Typography typography, my myVar, int i, int i2, Composer composer, int i3) {
        MaterialTheme(colorScheme, shapes, typography, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 MaterialTheme$lambda$1(ColorScheme colorScheme, MotionScheme motionScheme, Shapes shapes, Typography typography, my myVar, int i, int i2, Composer composer, int i3) {
        MaterialTheme(colorScheme, motionScheme, shapes, typography, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MotionScheme _localMotionScheme$lambda$5() {
        return MotionScheme.Companion.standard$material3();
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalUsingExpressiveTheme() {
        return LocalUsingExpressiveTheme;
    }

    public static final TextSelectionColors rememberTextSelectionColors(ColorScheme colorScheme, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1866455512, i, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:217)");
        }
        long m1772getPrimary0d7_KjU = colorScheme.m1772getPrimary0d7_KjU();
        boolean changed = composer.changed(m1772getPrimary0d7_KjU);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            TextSelectionColors textSelectionColors = new TextSelectionColors(m1772getPrimary0d7_KjU, Color.m4760copywmQWz5c$default(m1772getPrimary0d7_KjU, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            composer.updateRememberedValue(textSelectionColors);
            rememberedValue = textSelectionColors;
        }
        TextSelectionColors textSelectionColors2 = (TextSelectionColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textSelectionColors2;
    }

    private static /* synthetic */ void get_localMotionScheme$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if ((r20 & 4) != 0) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MaterialTheme(ColorScheme colorScheme, Shapes shapes, Typography typography, my myVar, Composer composer, int i, int i2) {
        int i3;
        Typography typography2;
        my myVar2;
        ColorScheme colorScheme2;
        Typography typography3;
        Shapes shapes2;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-449719819);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changed(colorScheme)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(shapes)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                typography2 = typography;
                if (startRestartGroup.changed(typography2)) {
                    i4 = Fields.RotationX;
                    i3 |= i4;
                }
            } else {
                typography2 = typography;
            }
            i4 = Fields.SpotShadowColor;
            i3 |= i4;
        } else {
            typography2 = typography;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            myVar2 = myVar;
        } else {
            myVar2 = myVar;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(myVar2) ? Fields.CameraDistance : Fields.RotationZ;
            }
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else {
                if ((i2 & 1) != 0) {
                    colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6);
                    i3 &= -15;
                }
                if ((i2 & 2) != 0) {
                    shapes = MaterialTheme.INSTANCE.getShapes(startRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    typography2 = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                    i3 &= -897;
                }
                ColorScheme colorScheme3 = colorScheme;
                Shapes shapes3 = shapes;
                Typography typography4 = typography2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-449719819, i3, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:59)");
                }
                int i5 = i3 << 3;
                MaterialTheme(colorScheme3, MaterialTheme.INSTANCE.getMotionScheme(startRestartGroup, 6), shapes3, typography4, myVar2, startRestartGroup, (i3 & 14) | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                colorScheme2 = colorScheme3;
                shapes2 = shapes3;
                typography3 = typography4;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            colorScheme2 = colorScheme;
            typography3 = typography2;
            shapes2 = shapes;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new yl(colorScheme2, shapes2, typography3, myVar, i, i2, 4));
        }
    }
}
