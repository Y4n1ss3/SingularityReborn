package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.material3.tokens.SecondaryNavigationTabTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import defpackage.dt0;
import defpackage.er;
import defpackage.w01;
import defpackage.ye;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float ScrollableTabRowMinTabWidth = Dp.m7611constructorimpl(90.0f);
    private static final float ScrollableTabRowEdgeStartPadding = Dp.m7611constructorimpl(52.0f);

    private TabRowDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Indicator_9IZ8Weo$lambda$0(TabRowDefaults tabRowDefaults, Modifier modifier, float f, long j, int i, int i2, Composer composer, int i3) {
        tabRowDefaults.m2504Indicator9IZ8Weo(modifier, f, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PrimaryIndicator_10LGxhE$lambda$1(TabRowDefaults tabRowDefaults, Modifier modifier, float f, float f2, long j, Shape shape, int i, int i2, Composer composer, int i3) {
        tabRowDefaults.m2505PrimaryIndicator10LGxhE(modifier, f, f2, j, shape, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SecondaryIndicator_9IZ8Weo$lambda$2(TabRowDefaults tabRowDefaults, Modifier modifier, float f, long j, int i, int i2, Composer composer, int i3) {
        tabRowDefaults.m2506SecondaryIndicator9IZ8Weo(modifier, f, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005d  */
    @er
    /* renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2504Indicator9IZ8Weo(Modifier modifier, float f, long j, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        long j2;
        Modifier modifier3;
        float f3;
        long j3;
        ScopeUpdateScope endRestartGroup;
        long fromToken;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(1454716052);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i4 = Fields.RotationX;
                        i3 |= i4;
                    }
                } else {
                    j2 = j;
                }
                i4 = Fields.SpotShadowColor;
                i3 |= i4;
            } else {
                j2 = j;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                f3 = f2;
                j3 = j2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 != 0 ? Modifier.Companion : modifier2;
                    f3 = i6 != 0 ? PrimaryNavigationTabTokens.INSTANCE.m3590getActiveIndicatorHeightD9Ej5fM() : f2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        fromToken = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1454716052, i3, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:1038)");
                        }
                        BoxKt.Box(BackgroundKt.m227backgroundbw27NRU$default(SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), f3), fromToken, null, 2, null), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j3 = fromToken;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                    f3 = f2;
                }
                fromToken = j2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                BoxKt.Box(BackgroundKt.m227backgroundbw27NRU$default(SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), f3), fromToken, null, 2, null), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j3 = fromToken;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new dt0(this, modifier3, f3, j3, i, i2, 0));
                return;
            }
            return;
        }
        f2 = f;
        if ((i & 384) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004d  */
    /* renamed from: PrimaryIndicator-10LGxhE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2505PrimaryIndicator10LGxhE(Modifier modifier, float f, float f2, long j, Shape shape, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        float f3;
        int i4;
        float f4;
        long j2;
        int i5;
        Shape shape2;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1895596205);
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
                        j2 = j;
                        if (startRestartGroup.changed(j2)) {
                            i6 = Fields.CameraDistance;
                            i3 |= i6;
                        }
                    } else {
                        j2 = j;
                    }
                    i6 = Fields.RotationZ;
                    i3 |= i6;
                } else {
                    j2 = j;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    shape2 = shape;
                    i3 |= startRestartGroup.changed(shape2) ? Fields.Clip : 8192;
                    if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i7 != 0 ? Modifier.Companion : modifier2;
                            if (i8 != 0) {
                                f3 = Dp.m7611constructorimpl(24.0f);
                            }
                            if (i4 != 0) {
                                f4 = PrimaryNavigationTabTokens.INSTANCE.m3590getActiveIndicatorHeightD9Ej5fM();
                            }
                            if ((i2 & 8) != 0) {
                                j2 = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), startRestartGroup, 6);
                                i3 &= -7169;
                            }
                            if (i5 != 0) {
                                shape2 = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            modifier3 = modifier2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1059)");
                        }
                        SpacerKt.Spacer(BackgroundKt.m226backgroundbw27NRU(SizeKt.m804requiredWidth3ABfNKs(SizeKt.m796requiredHeight3ABfNKs(modifier3, f4), f3), j2, shape2), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    float f5 = f3;
                    float f6 = f4;
                    long j3 = j2;
                    Shape shape3 = shape2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new ye(this, modifier3, f5, f6, j3, shape3, i, i2));
                        return;
                    }
                    return;
                }
                shape2 = shape;
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                float f52 = f3;
                float f62 = f4;
                long j32 = j2;
                Shape shape32 = shape2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f4 = f2;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            shape2 = shape;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            float f522 = f3;
            float f622 = f4;
            long j322 = j2;
            Shape shape322 = shape2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        f3 = f;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f4 = f2;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        shape2 = shape;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        float f5222 = f3;
        float f6222 = f4;
        long j3222 = j2;
        Shape shape3222 = shape2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005d  */
    /* renamed from: SecondaryIndicator-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2506SecondaryIndicator9IZ8Weo(Modifier modifier, float f, long j, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        long j2;
        Modifier modifier3;
        float f3;
        long j3;
        ScopeUpdateScope endRestartGroup;
        long value;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1498258020);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i4 = Fields.RotationX;
                        i3 |= i4;
                    }
                } else {
                    j2 = j;
                }
                i4 = Fields.SpotShadowColor;
                i3 |= i4;
            } else {
                j2 = j;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                f3 = f2;
                j3 = j2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 != 0 ? Modifier.Companion : modifier2;
                    f3 = i6 != 0 ? PrimaryNavigationTabTokens.INSTANCE.m3590getActiveIndicatorHeightD9Ej5fM() : f2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), startRestartGroup, 6);
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1498258020, i3, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1081)");
                        }
                        BoxKt.Box(BackgroundKt.m227backgroundbw27NRU$default(SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), f3), value, null, 2, null), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j3 = value;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                    f3 = f2;
                }
                value = j2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                BoxKt.Box(BackgroundKt.m227backgroundbw27NRU$default(SizeKt.m793height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), f3), value, null, 2, null), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                j3 = value;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new dt0(this, modifier3, f3, j3, i, i2, 1));
                return;
            }
            return;
        }
        f2 = f;
        if ((i & 384) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public final long getContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026555673, i, -1, "androidx.compose.material3.TabRowDefaults.<get-containerColor> (TabRow.kt:994)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContentColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1163072359, i, -1, "androidx.compose.material3.TabRowDefaults.<get-contentColor> (TabRow.kt:1010)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getPrimaryContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2069154037, i, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContainerColor> (TabRow.kt:998)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getPrimaryContentColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1410362619, i, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContentColor> (TabRow.kt:1014)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getScrollableTabRowEdgeStartPadding-D9Ej5fM, reason: not valid java name */
    public final float m2507getScrollableTabRowEdgeStartPaddingD9Ej5fM() {
        return ScrollableTabRowEdgeStartPadding;
    }

    /* renamed from: getScrollableTabRowMinTabWidth-D9Ej5fM, reason: not valid java name */
    public final float m2508getScrollableTabRowMinTabWidthD9Ej5fM() {
        return ScrollableTabRowMinTabWidth;
    }

    public final long getSecondaryContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1938007129, i, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContainerColor> (TabRow.kt:1002)");
        }
        long value = ColorSchemeKt.getValue(SecondaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getSecondaryContentColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1166419479, i, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContentColor> (TabRow.kt:1018)");
        }
        long value = ColorSchemeKt.getValue(SecondaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    @er
    public final Modifier tabIndicatorOffset(Modifier modifier, TabPosition tabPosition) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(tabPosition) : InspectableValueKt.getNoInspectorInfo(), new TabRowDefaults$tabIndicatorOffset$2(tabPosition));
    }

    @er
    public static /* synthetic */ void getContainerColor$annotations() {
    }

    @er
    public static /* synthetic */ void getContentColor$annotations() {
    }
}
