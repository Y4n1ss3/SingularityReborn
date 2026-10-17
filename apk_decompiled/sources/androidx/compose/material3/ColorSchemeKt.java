package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorDarkTokens;
import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.PaletteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import defpackage.er;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final ProvidableCompositionLocal<ColorScheme> LocalColorScheme = CompositionLocalKt.staticCompositionLocalOf(new defpackage.e1(11));
    private static final ProvidableCompositionLocal<Boolean> LocalTonalElevationEnabled = CompositionLocalKt.staticCompositionLocalOf(new defpackage.e1(12));

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryFixed.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[ColorSchemeKeyTokens.PrimaryFixedDim.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryFixed.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnPrimaryFixedVariant.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryFixed.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[ColorSchemeKeyTokens.SecondaryFixedDim.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryFixed.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnSecondaryFixedVariant.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryFixed.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[ColorSchemeKeyTokens.TertiaryFixedDim.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryFixed.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[ColorSchemeKeyTokens.OnTertiaryFixedVariant.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorScheme LocalColorScheme$lambda$1() {
        return m1809lightColorScheme_VG5OTI$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalTonalElevationEnabled$lambda$2() {
        return true;
    }

    /* renamed from: applyTonalElevation-RFCenO8, reason: not valid java name */
    public static final long m1795applyTonalElevationRFCenO8(ColorScheme colorScheme, long j, float f, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1610977682, i, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:1539)");
        }
        boolean booleanValue = ((Boolean) composer.consume(LocalTonalElevationEnabled)).booleanValue();
        if (Color.m4762equalsimpl0(j, colorScheme.m1781getSurface0d7_KjU()) && booleanValue) {
            j = m1810surfaceColorAtElevation3ABfNKs(colorScheme, f);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j;
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1796contentColorFor4WTKRHQ(ColorScheme colorScheme, long j) {
        return Color.m4762equalsimpl0(j, colorScheme.m1772getPrimary0d7_KjU()) ? colorScheme.m1756getOnPrimary0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1777getSecondary0d7_KjU()) ? colorScheme.m1760getOnSecondary0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1791getTertiary0d7_KjU()) ? colorScheme.m1766getOnTertiary0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1747getBackground0d7_KjU()) ? colorScheme.m1753getOnBackground0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1748getError0d7_KjU()) ? colorScheme.m1754getOnError0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1773getPrimaryContainer0d7_KjU()) ? colorScheme.m1757getOnPrimaryContainer0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1778getSecondaryContainer0d7_KjU()) ? colorScheme.m1761getOnSecondaryContainer0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1792getTertiaryContainer0d7_KjU()) ? colorScheme.m1767getOnTertiaryContainer0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1749getErrorContainer0d7_KjU()) ? colorScheme.m1755getOnErrorContainer0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1752getInverseSurface0d7_KjU()) ? colorScheme.m1750getInverseOnSurface0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1781getSurface0d7_KjU()) ? colorScheme.m1764getOnSurface0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1790getSurfaceVariant0d7_KjU()) ? colorScheme.m1765getOnSurfaceVariant0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1782getSurfaceBright0d7_KjU()) ? colorScheme.m1764getOnSurface0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1783getSurfaceContainer0d7_KjU()) ? colorScheme.m1764getOnSurface0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1784getSurfaceContainerHigh0d7_KjU()) ? colorScheme.m1764getOnSurface0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1785getSurfaceContainerHighest0d7_KjU()) ? colorScheme.m1764getOnSurface0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1786getSurfaceContainerLow0d7_KjU()) ? colorScheme.m1764getOnSurface0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1787getSurfaceContainerLowest0d7_KjU()) ? colorScheme.m1764getOnSurface0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1788getSurfaceDim0d7_KjU()) ? colorScheme.m1764getOnSurface0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1774getPrimaryFixed0d7_KjU()) ? colorScheme.m1758getOnPrimaryFixed0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1775getPrimaryFixedDim0d7_KjU()) ? colorScheme.m1758getOnPrimaryFixed0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1779getSecondaryFixed0d7_KjU()) ? colorScheme.m1762getOnSecondaryFixed0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1780getSecondaryFixedDim0d7_KjU()) ? colorScheme.m1762getOnSecondaryFixed0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1793getTertiaryFixed0d7_KjU()) ? colorScheme.m1768getOnTertiaryFixed0d7_KjU() : Color.m4762equalsimpl0(j, colorScheme.m1794getTertiaryFixedDim0d7_KjU()) ? colorScheme.m1768getOnTertiaryFixed0d7_KjU() : Color.Companion.m4797getUnspecified0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1797contentColorForek8zF_U(long j, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:1112)");
        }
        composer.startReplaceGroup(89374938);
        long m1796contentColorFor4WTKRHQ = m1796contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j);
        if (m1796contentColorFor4WTKRHQ == 16) {
            m1796contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1796contentColorFor4WTKRHQ;
    }

    @er
    /* renamed from: darkColorScheme-C-Xl9yA, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m1798darkColorSchemeCXl9yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return m1803darkColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    /* renamed from: darkColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1799darkColorSchemeCXl9yA$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, Object obj) {
        long m3129getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m3129getPrimary0d7_KjU() : j;
        long m3113getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m3113getOnPrimary0d7_KjU() : j2;
        long m3130getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m3130getPrimaryContainer0d7_KjU() : j3;
        long m3114getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m3114getOnPrimaryContainer0d7_KjU() : j4;
        long m3108getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m3108getInversePrimary0d7_KjU() : j5;
        long m3134getSecondary0d7_KjU = (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m3134getSecondary0d7_KjU() : j6;
        long m3117getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m3117getOnSecondary0d7_KjU() : j7;
        long m3135getSecondaryContainer0d7_KjU = (i & Fields.SpotShadowColor) != 0 ? ColorDarkTokens.INSTANCE.m3135getSecondaryContainer0d7_KjU() : j8;
        long j37 = m3129getPrimary0d7_KjU;
        long m3118getOnSecondaryContainer0d7_KjU = (i & Fields.RotationX) != 0 ? ColorDarkTokens.INSTANCE.m3118getOnSecondaryContainer0d7_KjU() : j9;
        long m3148getTertiary0d7_KjU = (i & Fields.RotationY) != 0 ? ColorDarkTokens.INSTANCE.m3148getTertiary0d7_KjU() : j10;
        long m3123getOnTertiary0d7_KjU = (i & Fields.RotationZ) != 0 ? ColorDarkTokens.INSTANCE.m3123getOnTertiary0d7_KjU() : j11;
        long m3149getTertiaryContainer0d7_KjU = (i & Fields.CameraDistance) != 0 ? ColorDarkTokens.INSTANCE.m3149getTertiaryContainer0d7_KjU() : j12;
        long m3124getOnTertiaryContainer0d7_KjU = (i & Fields.TransformOrigin) != 0 ? ColorDarkTokens.INSTANCE.m3124getOnTertiaryContainer0d7_KjU() : j13;
        long m3104getBackground0d7_KjU = (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m3104getBackground0d7_KjU() : j14;
        long m3110getOnBackground0d7_KjU = (i & Fields.Clip) != 0 ? ColorDarkTokens.INSTANCE.m3110getOnBackground0d7_KjU() : j15;
        long m3138getSurface0d7_KjU = (i & Fields.CompositingStrategy) != 0 ? ColorDarkTokens.INSTANCE.m3138getSurface0d7_KjU() : j16;
        long m3121getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m3121getOnSurface0d7_KjU() : j17;
        long m3147getSurfaceVariant0d7_KjU = (i & Fields.RenderEffect) != 0 ? ColorDarkTokens.INSTANCE.m3147getSurfaceVariant0d7_KjU() : j18;
        long m3122getOnSurfaceVariant0d7_KjU = (i & Fields.ColorFilter) != 0 ? ColorDarkTokens.INSTANCE.m3122getOnSurfaceVariant0d7_KjU() : j19;
        long j38 = (i & Fields.BlendMode) != 0 ? j37 : j20;
        long m3109getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m3109getInverseSurface0d7_KjU() : j21;
        long m3107getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m3107getInverseOnSurface0d7_KjU() : j22;
        long m3105getError0d7_KjU = (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m3105getError0d7_KjU() : j23;
        long m3111getOnError0d7_KjU = (i & GroupFlagsKt.IsNodeFlag) != 0 ? ColorDarkTokens.INSTANCE.m3111getOnError0d7_KjU() : j24;
        long m3106getErrorContainer0d7_KjU = (i & GroupFlagsKt.HasObjectKeyFlag) != 0 ? ColorDarkTokens.INSTANCE.m3106getErrorContainer0d7_KjU() : j25;
        long m3112getOnErrorContainer0d7_KjU = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorDarkTokens.INSTANCE.m3112getOnErrorContainer0d7_KjU() : j26;
        long m3127getOutline0d7_KjU = (i & GroupFlagsKt.IsRecompositionRequiredFlag) != 0 ? ColorDarkTokens.INSTANCE.m3127getOutline0d7_KjU() : j27;
        long m3128getOutlineVariant0d7_KjU = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorDarkTokens.INSTANCE.m3128getOutlineVariant0d7_KjU() : j28;
        long m3133getScrim0d7_KjU = (i & GroupFlagsKt.IsMovableContentFlag) != 0 ? ColorDarkTokens.INSTANCE.m3133getScrim0d7_KjU() : j29;
        long m3139getSurfaceBright0d7_KjU = (i & GroupFlagsKt.HasMovableContentFlag) != 0 ? ColorDarkTokens.INSTANCE.m3139getSurfaceBright0d7_KjU() : j30;
        long m3140getSurfaceContainer0d7_KjU = (i & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? ColorDarkTokens.INSTANCE.m3140getSurfaceContainer0d7_KjU() : j31;
        long m3141getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m3141getSurfaceContainerHigh0d7_KjU() : j32;
        long m3142getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m3142getSurfaceContainerHighest0d7_KjU() : j33;
        long m3143getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m3143getSurfaceContainerLow0d7_KjU() : j34;
        long m3144getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m3144getSurfaceContainerLowest0d7_KjU() : j35;
        if ((i2 & 8) != 0) {
            j36 = ColorDarkTokens.INSTANCE.m3145getSurfaceDim0d7_KjU();
        }
        return m1798darkColorSchemeCXl9yA(j37, m3113getOnPrimary0d7_KjU, m3130getPrimaryContainer0d7_KjU, m3114getOnPrimaryContainer0d7_KjU, m3108getInversePrimary0d7_KjU, m3134getSecondary0d7_KjU, m3117getOnSecondary0d7_KjU, m3135getSecondaryContainer0d7_KjU, m3118getOnSecondaryContainer0d7_KjU, m3148getTertiary0d7_KjU, m3123getOnTertiary0d7_KjU, m3149getTertiaryContainer0d7_KjU, m3124getOnTertiaryContainer0d7_KjU, m3104getBackground0d7_KjU, m3110getOnBackground0d7_KjU, m3138getSurface0d7_KjU, m3121getOnSurface0d7_KjU, m3147getSurfaceVariant0d7_KjU, m3122getOnSurfaceVariant0d7_KjU, j38, m3109getInverseSurface0d7_KjU, m3107getInverseOnSurface0d7_KjU, m3105getError0d7_KjU, m3111getOnError0d7_KjU, m3106getErrorContainer0d7_KjU, m3112getOnErrorContainer0d7_KjU, m3127getOutline0d7_KjU, m3128getOutlineVariant0d7_KjU, m3133getScrim0d7_KjU, m3139getSurfaceBright0d7_KjU, m3140getSurfaceContainer0d7_KjU, m3141getSurfaceContainerHigh0d7_KjU, m3142getSurfaceContainerHighest0d7_KjU, m3143getSurfaceContainerLow0d7_KjU, m3144getSurfaceContainerLowest0d7_KjU, j36);
    }

    @er
    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m1800darkColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return m1803darkColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 65535, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1801darkColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long m3129getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m3129getPrimary0d7_KjU() : j;
        long m3113getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m3113getOnPrimary0d7_KjU() : j2;
        long m3130getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m3130getPrimaryContainer0d7_KjU() : j3;
        long m3114getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m3114getOnPrimaryContainer0d7_KjU() : j4;
        long m3108getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m3108getInversePrimary0d7_KjU() : j5;
        long m3134getSecondary0d7_KjU = (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m3134getSecondary0d7_KjU() : j6;
        long m3117getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m3117getOnSecondary0d7_KjU() : j7;
        long m3135getSecondaryContainer0d7_KjU = (i & Fields.SpotShadowColor) != 0 ? ColorDarkTokens.INSTANCE.m3135getSecondaryContainer0d7_KjU() : j8;
        long j30 = m3129getPrimary0d7_KjU;
        long m3118getOnSecondaryContainer0d7_KjU = (i & Fields.RotationX) != 0 ? ColorDarkTokens.INSTANCE.m3118getOnSecondaryContainer0d7_KjU() : j9;
        long m3148getTertiary0d7_KjU = (i & Fields.RotationY) != 0 ? ColorDarkTokens.INSTANCE.m3148getTertiary0d7_KjU() : j10;
        long m3123getOnTertiary0d7_KjU = (i & Fields.RotationZ) != 0 ? ColorDarkTokens.INSTANCE.m3123getOnTertiary0d7_KjU() : j11;
        long m3149getTertiaryContainer0d7_KjU = (i & Fields.CameraDistance) != 0 ? ColorDarkTokens.INSTANCE.m3149getTertiaryContainer0d7_KjU() : j12;
        long m3124getOnTertiaryContainer0d7_KjU = (i & Fields.TransformOrigin) != 0 ? ColorDarkTokens.INSTANCE.m3124getOnTertiaryContainer0d7_KjU() : j13;
        long m3104getBackground0d7_KjU = (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m3104getBackground0d7_KjU() : j14;
        long m3110getOnBackground0d7_KjU = (i & Fields.Clip) != 0 ? ColorDarkTokens.INSTANCE.m3110getOnBackground0d7_KjU() : j15;
        long m3138getSurface0d7_KjU = (i & Fields.CompositingStrategy) != 0 ? ColorDarkTokens.INSTANCE.m3138getSurface0d7_KjU() : j16;
        long m3121getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m3121getOnSurface0d7_KjU() : j17;
        long m3147getSurfaceVariant0d7_KjU = (i & Fields.RenderEffect) != 0 ? ColorDarkTokens.INSTANCE.m3147getSurfaceVariant0d7_KjU() : j18;
        long m3122getOnSurfaceVariant0d7_KjU = (i & Fields.ColorFilter) != 0 ? ColorDarkTokens.INSTANCE.m3122getOnSurfaceVariant0d7_KjU() : j19;
        long j31 = (i & Fields.BlendMode) != 0 ? j30 : j20;
        long m3109getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m3109getInverseSurface0d7_KjU() : j21;
        long m3107getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m3107getInverseOnSurface0d7_KjU() : j22;
        long m3105getError0d7_KjU = (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m3105getError0d7_KjU() : j23;
        long m3111getOnError0d7_KjU = (i & GroupFlagsKt.IsNodeFlag) != 0 ? ColorDarkTokens.INSTANCE.m3111getOnError0d7_KjU() : j24;
        long m3106getErrorContainer0d7_KjU = (i & GroupFlagsKt.HasObjectKeyFlag) != 0 ? ColorDarkTokens.INSTANCE.m3106getErrorContainer0d7_KjU() : j25;
        long m3112getOnErrorContainer0d7_KjU = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorDarkTokens.INSTANCE.m3112getOnErrorContainer0d7_KjU() : j26;
        long m3127getOutline0d7_KjU = (i & GroupFlagsKt.IsRecompositionRequiredFlag) != 0 ? ColorDarkTokens.INSTANCE.m3127getOutline0d7_KjU() : j27;
        long m3128getOutlineVariant0d7_KjU = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorDarkTokens.INSTANCE.m3128getOutlineVariant0d7_KjU() : j28;
        if ((i & GroupFlagsKt.IsMovableContentFlag) != 0) {
            j29 = ColorDarkTokens.INSTANCE.m3133getScrim0d7_KjU();
        }
        return m1800darkColorSchemeG1PFcw(j30, m3113getOnPrimary0d7_KjU, m3130getPrimaryContainer0d7_KjU, m3114getOnPrimaryContainer0d7_KjU, m3108getInversePrimary0d7_KjU, m3134getSecondary0d7_KjU, m3117getOnSecondary0d7_KjU, m3135getSecondaryContainer0d7_KjU, m3118getOnSecondaryContainer0d7_KjU, m3148getTertiary0d7_KjU, m3123getOnTertiary0d7_KjU, m3149getTertiaryContainer0d7_KjU, m3124getOnTertiaryContainer0d7_KjU, m3104getBackground0d7_KjU, m3110getOnBackground0d7_KjU, m3138getSurface0d7_KjU, m3121getOnSurface0d7_KjU, m3147getSurfaceVariant0d7_KjU, m3122getOnSurfaceVariant0d7_KjU, j31, m3109getInverseSurface0d7_KjU, m3107getInverseOnSurface0d7_KjU, m3105getError0d7_KjU, m3111getOnError0d7_KjU, m3106getErrorContainer0d7_KjU, m3112getOnErrorContainer0d7_KjU, m3127getOutline0d7_KjU, m3128getOutlineVariant0d7_KjU, j29);
    }

    /* renamed from: darkColorScheme-_VG5OTI, reason: not valid java name */
    public static final ColorScheme m1802darkColorScheme_VG5OTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, null);
    }

    /* renamed from: darkColorScheme-_VG5OTI$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1803darkColorScheme_VG5OTI$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, Object obj) {
        long m3129getPrimary0d7_KjU = (i & 1) != 0 ? ColorDarkTokens.INSTANCE.m3129getPrimary0d7_KjU() : j;
        long m3113getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorDarkTokens.INSTANCE.m3113getOnPrimary0d7_KjU() : j2;
        long m3130getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorDarkTokens.INSTANCE.m3130getPrimaryContainer0d7_KjU() : j3;
        long m3114getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorDarkTokens.INSTANCE.m3114getOnPrimaryContainer0d7_KjU() : j4;
        long m3108getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorDarkTokens.INSTANCE.m3108getInversePrimary0d7_KjU() : j5;
        long m3134getSecondary0d7_KjU = (i & 32) != 0 ? ColorDarkTokens.INSTANCE.m3134getSecondary0d7_KjU() : j6;
        long m3117getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorDarkTokens.INSTANCE.m3117getOnSecondary0d7_KjU() : j7;
        long j49 = m3129getPrimary0d7_KjU;
        long m3135getSecondaryContainer0d7_KjU = (i & Fields.SpotShadowColor) != 0 ? ColorDarkTokens.INSTANCE.m3135getSecondaryContainer0d7_KjU() : j8;
        long m3118getOnSecondaryContainer0d7_KjU = (i & Fields.RotationX) != 0 ? ColorDarkTokens.INSTANCE.m3118getOnSecondaryContainer0d7_KjU() : j9;
        long m3148getTertiary0d7_KjU = (i & Fields.RotationY) != 0 ? ColorDarkTokens.INSTANCE.m3148getTertiary0d7_KjU() : j10;
        long m3123getOnTertiary0d7_KjU = (i & Fields.RotationZ) != 0 ? ColorDarkTokens.INSTANCE.m3123getOnTertiary0d7_KjU() : j11;
        long m3149getTertiaryContainer0d7_KjU = (i & Fields.CameraDistance) != 0 ? ColorDarkTokens.INSTANCE.m3149getTertiaryContainer0d7_KjU() : j12;
        long m3124getOnTertiaryContainer0d7_KjU = (i & Fields.TransformOrigin) != 0 ? ColorDarkTokens.INSTANCE.m3124getOnTertiaryContainer0d7_KjU() : j13;
        long m3104getBackground0d7_KjU = (i & 8192) != 0 ? ColorDarkTokens.INSTANCE.m3104getBackground0d7_KjU() : j14;
        long m3110getOnBackground0d7_KjU = (i & Fields.Clip) != 0 ? ColorDarkTokens.INSTANCE.m3110getOnBackground0d7_KjU() : j15;
        long m3138getSurface0d7_KjU = (i & Fields.CompositingStrategy) != 0 ? ColorDarkTokens.INSTANCE.m3138getSurface0d7_KjU() : j16;
        long m3121getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorDarkTokens.INSTANCE.m3121getOnSurface0d7_KjU() : j17;
        long m3147getSurfaceVariant0d7_KjU = (i & Fields.RenderEffect) != 0 ? ColorDarkTokens.INSTANCE.m3147getSurfaceVariant0d7_KjU() : j18;
        long m3122getOnSurfaceVariant0d7_KjU = (i & Fields.ColorFilter) != 0 ? ColorDarkTokens.INSTANCE.m3122getOnSurfaceVariant0d7_KjU() : j19;
        long j50 = (i & Fields.BlendMode) != 0 ? j49 : j20;
        long m3109getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorDarkTokens.INSTANCE.m3109getInverseSurface0d7_KjU() : j21;
        long m3107getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorDarkTokens.INSTANCE.m3107getInverseOnSurface0d7_KjU() : j22;
        long m3105getError0d7_KjU = (i & 4194304) != 0 ? ColorDarkTokens.INSTANCE.m3105getError0d7_KjU() : j23;
        long m3111getOnError0d7_KjU = (i & GroupFlagsKt.IsNodeFlag) != 0 ? ColorDarkTokens.INSTANCE.m3111getOnError0d7_KjU() : j24;
        long m3106getErrorContainer0d7_KjU = (i & GroupFlagsKt.HasObjectKeyFlag) != 0 ? ColorDarkTokens.INSTANCE.m3106getErrorContainer0d7_KjU() : j25;
        long m3112getOnErrorContainer0d7_KjU = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorDarkTokens.INSTANCE.m3112getOnErrorContainer0d7_KjU() : j26;
        long m3127getOutline0d7_KjU = (i & GroupFlagsKt.IsRecompositionRequiredFlag) != 0 ? ColorDarkTokens.INSTANCE.m3127getOutline0d7_KjU() : j27;
        long m3128getOutlineVariant0d7_KjU = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorDarkTokens.INSTANCE.m3128getOutlineVariant0d7_KjU() : j28;
        long m3133getScrim0d7_KjU = (i & GroupFlagsKt.IsMovableContentFlag) != 0 ? ColorDarkTokens.INSTANCE.m3133getScrim0d7_KjU() : j29;
        long m3139getSurfaceBright0d7_KjU = (i & GroupFlagsKt.HasMovableContentFlag) != 0 ? ColorDarkTokens.INSTANCE.m3139getSurfaceBright0d7_KjU() : j30;
        long m3140getSurfaceContainer0d7_KjU = (i & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? ColorDarkTokens.INSTANCE.m3140getSurfaceContainer0d7_KjU() : j31;
        long m3141getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorDarkTokens.INSTANCE.m3141getSurfaceContainerHigh0d7_KjU() : j32;
        long m3142getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorDarkTokens.INSTANCE.m3142getSurfaceContainerHighest0d7_KjU() : j33;
        long m3143getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorDarkTokens.INSTANCE.m3143getSurfaceContainerLow0d7_KjU() : j34;
        long m3144getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorDarkTokens.INSTANCE.m3144getSurfaceContainerLowest0d7_KjU() : j35;
        long m3145getSurfaceDim0d7_KjU = (i2 & 8) != 0 ? ColorDarkTokens.INSTANCE.m3145getSurfaceDim0d7_KjU() : j36;
        long m3131getPrimaryFixed0d7_KjU = (i2 & 16) != 0 ? ColorDarkTokens.INSTANCE.m3131getPrimaryFixed0d7_KjU() : j37;
        long m3132getPrimaryFixedDim0d7_KjU = (i2 & 32) != 0 ? ColorDarkTokens.INSTANCE.m3132getPrimaryFixedDim0d7_KjU() : j38;
        long m3115getOnPrimaryFixed0d7_KjU = (i2 & 64) != 0 ? ColorDarkTokens.INSTANCE.m3115getOnPrimaryFixed0d7_KjU() : j39;
        long m3116getOnPrimaryFixedVariant0d7_KjU = (i2 & Fields.SpotShadowColor) != 0 ? ColorDarkTokens.INSTANCE.m3116getOnPrimaryFixedVariant0d7_KjU() : j40;
        long m3136getSecondaryFixed0d7_KjU = (i2 & Fields.RotationX) != 0 ? ColorDarkTokens.INSTANCE.m3136getSecondaryFixed0d7_KjU() : j41;
        long m3137getSecondaryFixedDim0d7_KjU = (i2 & Fields.RotationY) != 0 ? ColorDarkTokens.INSTANCE.m3137getSecondaryFixedDim0d7_KjU() : j42;
        long m3119getOnSecondaryFixed0d7_KjU = (i2 & Fields.RotationZ) != 0 ? ColorDarkTokens.INSTANCE.m3119getOnSecondaryFixed0d7_KjU() : j43;
        long m3120getOnSecondaryFixedVariant0d7_KjU = (i2 & Fields.CameraDistance) != 0 ? ColorDarkTokens.INSTANCE.m3120getOnSecondaryFixedVariant0d7_KjU() : j44;
        long m3150getTertiaryFixed0d7_KjU = (i2 & Fields.TransformOrigin) != 0 ? ColorDarkTokens.INSTANCE.m3150getTertiaryFixed0d7_KjU() : j45;
        long m3151getTertiaryFixedDim0d7_KjU = (i2 & 8192) != 0 ? ColorDarkTokens.INSTANCE.m3151getTertiaryFixedDim0d7_KjU() : j46;
        long m3125getOnTertiaryFixed0d7_KjU = (i2 & Fields.Clip) != 0 ? ColorDarkTokens.INSTANCE.m3125getOnTertiaryFixed0d7_KjU() : j47;
        if ((i2 & Fields.CompositingStrategy) != 0) {
            j48 = ColorDarkTokens.INSTANCE.m3126getOnTertiaryFixedVariant0d7_KjU();
        }
        return m1802darkColorScheme_VG5OTI(j49, m3113getOnPrimary0d7_KjU, m3130getPrimaryContainer0d7_KjU, m3114getOnPrimaryContainer0d7_KjU, m3108getInversePrimary0d7_KjU, m3134getSecondary0d7_KjU, m3117getOnSecondary0d7_KjU, m3135getSecondaryContainer0d7_KjU, m3118getOnSecondaryContainer0d7_KjU, m3148getTertiary0d7_KjU, m3123getOnTertiary0d7_KjU, m3149getTertiaryContainer0d7_KjU, m3124getOnTertiaryContainer0d7_KjU, m3104getBackground0d7_KjU, m3110getOnBackground0d7_KjU, m3138getSurface0d7_KjU, m3121getOnSurface0d7_KjU, m3147getSurfaceVariant0d7_KjU, m3122getOnSurfaceVariant0d7_KjU, j50, m3109getInverseSurface0d7_KjU, m3107getInverseOnSurface0d7_KjU, m3105getError0d7_KjU, m3111getOnError0d7_KjU, m3106getErrorContainer0d7_KjU, m3112getOnErrorContainer0d7_KjU, m3127getOutline0d7_KjU, m3128getOutlineVariant0d7_KjU, m3133getScrim0d7_KjU, m3139getSurfaceBright0d7_KjU, m3140getSurfaceContainer0d7_KjU, m3141getSurfaceContainerHigh0d7_KjU, m3142getSurfaceContainerHighest0d7_KjU, m3143getSurfaceContainerLow0d7_KjU, m3144getSurfaceContainerLowest0d7_KjU, m3145getSurfaceDim0d7_KjU, m3131getPrimaryFixed0d7_KjU, m3132getPrimaryFixedDim0d7_KjU, m3115getOnPrimaryFixed0d7_KjU, m3116getOnPrimaryFixedVariant0d7_KjU, m3136getSecondaryFixed0d7_KjU, m3137getSecondaryFixedDim0d7_KjU, m3119getOnSecondaryFixed0d7_KjU, m3120getOnSecondaryFixedVariant0d7_KjU, m3150getTertiaryFixed0d7_KjU, m3151getTertiaryFixedDim0d7_KjU, m3125getOnTertiaryFixed0d7_KjU, j48);
    }

    public static final ColorScheme expressiveLightColorScheme() {
        PaletteTokens paletteTokens = PaletteTokens.INSTANCE;
        return m1809lightColorScheme_VG5OTI$default(0L, 0L, 0L, paletteTokens.m3554getPrimary300d7_KjU(), 0L, 0L, 0L, 0L, paletteTokens.m3567getSecondary300d7_KjU(), 0L, 0L, 0L, paletteTokens.m3580getTertiary300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, paletteTokens.m3504getError300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -33558793, 65535, null);
    }

    public static final long fromToken(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.m1747getBackground0d7_KjU();
            case 2:
                return colorScheme.m1748getError0d7_KjU();
            case 3:
                return colorScheme.m1749getErrorContainer0d7_KjU();
            case 4:
                return colorScheme.m1750getInverseOnSurface0d7_KjU();
            case 5:
                return colorScheme.m1751getInversePrimary0d7_KjU();
            case 6:
                return colorScheme.m1752getInverseSurface0d7_KjU();
            case 7:
                return colorScheme.m1753getOnBackground0d7_KjU();
            case 8:
                return colorScheme.m1754getOnError0d7_KjU();
            case 9:
                return colorScheme.m1755getOnErrorContainer0d7_KjU();
            case 10:
                return colorScheme.m1756getOnPrimary0d7_KjU();
            case 11:
                return colorScheme.m1757getOnPrimaryContainer0d7_KjU();
            case Matrix.TranslateX /* 12 */:
                return colorScheme.m1760getOnSecondary0d7_KjU();
            case Matrix.TranslateY /* 13 */:
                return colorScheme.m1761getOnSecondaryContainer0d7_KjU();
            case Matrix.TranslateZ /* 14 */:
                return colorScheme.m1764getOnSurface0d7_KjU();
            case 15:
                return colorScheme.m1765getOnSurfaceVariant0d7_KjU();
            case 16:
                return colorScheme.m1789getSurfaceTint0d7_KjU();
            case 17:
                return colorScheme.m1766getOnTertiary0d7_KjU();
            case 18:
                return colorScheme.m1767getOnTertiaryContainer0d7_KjU();
            case 19:
                return colorScheme.m1770getOutline0d7_KjU();
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                return colorScheme.m1771getOutlineVariant0d7_KjU();
            case 21:
                return colorScheme.m1772getPrimary0d7_KjU();
            case 22:
                return colorScheme.m1773getPrimaryContainer0d7_KjU();
            case 23:
                return colorScheme.m1776getScrim0d7_KjU();
            case 24:
                return colorScheme.m1777getSecondary0d7_KjU();
            case RectListKt.BitOffsetForParentId /* 25 */:
                return colorScheme.m1778getSecondaryContainer0d7_KjU();
            case 26:
                return colorScheme.m1781getSurface0d7_KjU();
            case 27:
                return colorScheme.m1790getSurfaceVariant0d7_KjU();
            case 28:
                return colorScheme.m1782getSurfaceBright0d7_KjU();
            case 29:
                return colorScheme.m1783getSurfaceContainer0d7_KjU();
            case 30:
                return colorScheme.m1784getSurfaceContainerHigh0d7_KjU();
            case 31:
                return colorScheme.m1785getSurfaceContainerHighest0d7_KjU();
            case 32:
                return colorScheme.m1786getSurfaceContainerLow0d7_KjU();
            case UtilsKt.MUTABLE_BUFFER_SIZE /* 33 */:
                return colorScheme.m1787getSurfaceContainerLowest0d7_KjU();
            case 34:
                return colorScheme.m1788getSurfaceDim0d7_KjU();
            case 35:
                return colorScheme.m1791getTertiary0d7_KjU();
            case 36:
                return colorScheme.m1792getTertiaryContainer0d7_KjU();
            case 37:
                return colorScheme.m1774getPrimaryFixed0d7_KjU();
            case 38:
                return colorScheme.m1775getPrimaryFixedDim0d7_KjU();
            case 39:
                return colorScheme.m1758getOnPrimaryFixed0d7_KjU();
            case 40:
                return colorScheme.m1759getOnPrimaryFixedVariant0d7_KjU();
            case 41:
                return colorScheme.m1779getSecondaryFixed0d7_KjU();
            case 42:
                return colorScheme.m1780getSecondaryFixedDim0d7_KjU();
            case 43:
                return colorScheme.m1762getOnSecondaryFixed0d7_KjU();
            case 44:
                return colorScheme.m1763getOnSecondaryFixedVariant0d7_KjU();
            case 45:
                return colorScheme.m1793getTertiaryFixed0d7_KjU();
            case 46:
                return colorScheme.m1794getTertiaryFixedDim0d7_KjU();
            case 47:
                return colorScheme.m1768getOnTertiaryFixed0d7_KjU();
            case AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                return colorScheme.m1769getOnTertiaryFixedVariant0d7_KjU();
            default:
                defpackage.o.n();
                return 0L;
        }
    }

    public static final ProvidableCompositionLocal<ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalTonalElevationEnabled() {
        return LocalTonalElevationEnabled;
    }

    public static final long getValue(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810780884, i, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1524)");
        }
        long fromToken = fromToken(MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fromToken;
    }

    @er
    /* renamed from: lightColorScheme-C-Xl9yA, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m1804lightColorSchemeCXl9yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return m1809lightColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1805lightColorSchemeCXl9yA$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, Object obj) {
        long m3177getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m3177getPrimary0d7_KjU() : j;
        long m3161getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m3161getOnPrimary0d7_KjU() : j2;
        long m3178getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m3178getPrimaryContainer0d7_KjU() : j3;
        long m3162getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m3162getOnPrimaryContainer0d7_KjU() : j4;
        long m3156getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m3156getInversePrimary0d7_KjU() : j5;
        long m3182getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m3182getSecondary0d7_KjU() : j6;
        long m3165getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m3165getOnSecondary0d7_KjU() : j7;
        long m3183getSecondaryContainer0d7_KjU = (i & Fields.SpotShadowColor) != 0 ? ColorLightTokens.INSTANCE.m3183getSecondaryContainer0d7_KjU() : j8;
        long j37 = m3177getPrimary0d7_KjU;
        long m3166getOnSecondaryContainer0d7_KjU = (i & Fields.RotationX) != 0 ? ColorLightTokens.INSTANCE.m3166getOnSecondaryContainer0d7_KjU() : j9;
        long m3196getTertiary0d7_KjU = (i & Fields.RotationY) != 0 ? ColorLightTokens.INSTANCE.m3196getTertiary0d7_KjU() : j10;
        long m3171getOnTertiary0d7_KjU = (i & Fields.RotationZ) != 0 ? ColorLightTokens.INSTANCE.m3171getOnTertiary0d7_KjU() : j11;
        long m3197getTertiaryContainer0d7_KjU = (i & Fields.CameraDistance) != 0 ? ColorLightTokens.INSTANCE.m3197getTertiaryContainer0d7_KjU() : j12;
        long m3172getOnTertiaryContainer0d7_KjU = (i & Fields.TransformOrigin) != 0 ? ColorLightTokens.INSTANCE.m3172getOnTertiaryContainer0d7_KjU() : j13;
        long m3152getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m3152getBackground0d7_KjU() : j14;
        long m3158getOnBackground0d7_KjU = (i & Fields.Clip) != 0 ? ColorLightTokens.INSTANCE.m3158getOnBackground0d7_KjU() : j15;
        long m3186getSurface0d7_KjU = (i & Fields.CompositingStrategy) != 0 ? ColorLightTokens.INSTANCE.m3186getSurface0d7_KjU() : j16;
        long m3169getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m3169getOnSurface0d7_KjU() : j17;
        long m3195getSurfaceVariant0d7_KjU = (i & Fields.RenderEffect) != 0 ? ColorLightTokens.INSTANCE.m3195getSurfaceVariant0d7_KjU() : j18;
        long m3170getOnSurfaceVariant0d7_KjU = (i & Fields.ColorFilter) != 0 ? ColorLightTokens.INSTANCE.m3170getOnSurfaceVariant0d7_KjU() : j19;
        long j38 = (i & Fields.BlendMode) != 0 ? j37 : j20;
        long m3157getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m3157getInverseSurface0d7_KjU() : j21;
        long m3155getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m3155getInverseOnSurface0d7_KjU() : j22;
        long m3153getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m3153getError0d7_KjU() : j23;
        long m3159getOnError0d7_KjU = (i & GroupFlagsKt.IsNodeFlag) != 0 ? ColorLightTokens.INSTANCE.m3159getOnError0d7_KjU() : j24;
        long m3154getErrorContainer0d7_KjU = (i & GroupFlagsKt.HasObjectKeyFlag) != 0 ? ColorLightTokens.INSTANCE.m3154getErrorContainer0d7_KjU() : j25;
        long m3160getOnErrorContainer0d7_KjU = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorLightTokens.INSTANCE.m3160getOnErrorContainer0d7_KjU() : j26;
        long m3175getOutline0d7_KjU = (i & GroupFlagsKt.IsRecompositionRequiredFlag) != 0 ? ColorLightTokens.INSTANCE.m3175getOutline0d7_KjU() : j27;
        long m3176getOutlineVariant0d7_KjU = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorLightTokens.INSTANCE.m3176getOutlineVariant0d7_KjU() : j28;
        long m3181getScrim0d7_KjU = (i & GroupFlagsKt.IsMovableContentFlag) != 0 ? ColorLightTokens.INSTANCE.m3181getScrim0d7_KjU() : j29;
        long m3187getSurfaceBright0d7_KjU = (i & GroupFlagsKt.HasMovableContentFlag) != 0 ? ColorLightTokens.INSTANCE.m3187getSurfaceBright0d7_KjU() : j30;
        long m3188getSurfaceContainer0d7_KjU = (i & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? ColorLightTokens.INSTANCE.m3188getSurfaceContainer0d7_KjU() : j31;
        long m3189getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m3189getSurfaceContainerHigh0d7_KjU() : j32;
        long m3190getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m3190getSurfaceContainerHighest0d7_KjU() : j33;
        long m3191getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m3191getSurfaceContainerLow0d7_KjU() : j34;
        long m3192getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m3192getSurfaceContainerLowest0d7_KjU() : j35;
        if ((i2 & 8) != 0) {
            j36 = ColorLightTokens.INSTANCE.m3193getSurfaceDim0d7_KjU();
        }
        return m1804lightColorSchemeCXl9yA(j37, m3161getOnPrimary0d7_KjU, m3178getPrimaryContainer0d7_KjU, m3162getOnPrimaryContainer0d7_KjU, m3156getInversePrimary0d7_KjU, m3182getSecondary0d7_KjU, m3165getOnSecondary0d7_KjU, m3183getSecondaryContainer0d7_KjU, m3166getOnSecondaryContainer0d7_KjU, m3196getTertiary0d7_KjU, m3171getOnTertiary0d7_KjU, m3197getTertiaryContainer0d7_KjU, m3172getOnTertiaryContainer0d7_KjU, m3152getBackground0d7_KjU, m3158getOnBackground0d7_KjU, m3186getSurface0d7_KjU, m3169getOnSurface0d7_KjU, m3195getSurfaceVariant0d7_KjU, m3170getOnSurfaceVariant0d7_KjU, j38, m3157getInverseSurface0d7_KjU, m3155getInverseOnSurface0d7_KjU, m3153getError0d7_KjU, m3159getOnError0d7_KjU, m3154getErrorContainer0d7_KjU, m3160getOnErrorContainer0d7_KjU, m3175getOutline0d7_KjU, m3176getOutlineVariant0d7_KjU, m3181getScrim0d7_KjU, m3187getSurfaceBright0d7_KjU, m3188getSurfaceContainer0d7_KjU, m3189getSurfaceContainerHigh0d7_KjU, m3190getSurfaceContainerHighest0d7_KjU, m3191getSurfaceContainerLow0d7_KjU, m3192getSurfaceContainerLowest0d7_KjU, j36);
    }

    @er
    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ ColorScheme m1806lightColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return m1809lightColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 65535, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1807lightColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long m3177getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m3177getPrimary0d7_KjU() : j;
        long m3161getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m3161getOnPrimary0d7_KjU() : j2;
        long m3178getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m3178getPrimaryContainer0d7_KjU() : j3;
        long m3162getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m3162getOnPrimaryContainer0d7_KjU() : j4;
        long m3156getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m3156getInversePrimary0d7_KjU() : j5;
        long m3182getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m3182getSecondary0d7_KjU() : j6;
        long m3165getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m3165getOnSecondary0d7_KjU() : j7;
        long m3183getSecondaryContainer0d7_KjU = (i & Fields.SpotShadowColor) != 0 ? ColorLightTokens.INSTANCE.m3183getSecondaryContainer0d7_KjU() : j8;
        long j30 = m3177getPrimary0d7_KjU;
        long m3166getOnSecondaryContainer0d7_KjU = (i & Fields.RotationX) != 0 ? ColorLightTokens.INSTANCE.m3166getOnSecondaryContainer0d7_KjU() : j9;
        long m3196getTertiary0d7_KjU = (i & Fields.RotationY) != 0 ? ColorLightTokens.INSTANCE.m3196getTertiary0d7_KjU() : j10;
        long m3171getOnTertiary0d7_KjU = (i & Fields.RotationZ) != 0 ? ColorLightTokens.INSTANCE.m3171getOnTertiary0d7_KjU() : j11;
        long m3197getTertiaryContainer0d7_KjU = (i & Fields.CameraDistance) != 0 ? ColorLightTokens.INSTANCE.m3197getTertiaryContainer0d7_KjU() : j12;
        long m3172getOnTertiaryContainer0d7_KjU = (i & Fields.TransformOrigin) != 0 ? ColorLightTokens.INSTANCE.m3172getOnTertiaryContainer0d7_KjU() : j13;
        long m3152getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m3152getBackground0d7_KjU() : j14;
        long m3158getOnBackground0d7_KjU = (i & Fields.Clip) != 0 ? ColorLightTokens.INSTANCE.m3158getOnBackground0d7_KjU() : j15;
        long m3186getSurface0d7_KjU = (i & Fields.CompositingStrategy) != 0 ? ColorLightTokens.INSTANCE.m3186getSurface0d7_KjU() : j16;
        long m3169getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m3169getOnSurface0d7_KjU() : j17;
        long m3195getSurfaceVariant0d7_KjU = (i & Fields.RenderEffect) != 0 ? ColorLightTokens.INSTANCE.m3195getSurfaceVariant0d7_KjU() : j18;
        long m3170getOnSurfaceVariant0d7_KjU = (i & Fields.ColorFilter) != 0 ? ColorLightTokens.INSTANCE.m3170getOnSurfaceVariant0d7_KjU() : j19;
        long j31 = (i & Fields.BlendMode) != 0 ? j30 : j20;
        long m3157getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m3157getInverseSurface0d7_KjU() : j21;
        long m3155getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m3155getInverseOnSurface0d7_KjU() : j22;
        long m3153getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m3153getError0d7_KjU() : j23;
        long m3159getOnError0d7_KjU = (i & GroupFlagsKt.IsNodeFlag) != 0 ? ColorLightTokens.INSTANCE.m3159getOnError0d7_KjU() : j24;
        long m3154getErrorContainer0d7_KjU = (i & GroupFlagsKt.HasObjectKeyFlag) != 0 ? ColorLightTokens.INSTANCE.m3154getErrorContainer0d7_KjU() : j25;
        long m3160getOnErrorContainer0d7_KjU = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorLightTokens.INSTANCE.m3160getOnErrorContainer0d7_KjU() : j26;
        long m3175getOutline0d7_KjU = (i & GroupFlagsKt.IsRecompositionRequiredFlag) != 0 ? ColorLightTokens.INSTANCE.m3175getOutline0d7_KjU() : j27;
        long m3176getOutlineVariant0d7_KjU = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorLightTokens.INSTANCE.m3176getOutlineVariant0d7_KjU() : j28;
        if ((i & GroupFlagsKt.IsMovableContentFlag) != 0) {
            j29 = ColorLightTokens.INSTANCE.m3181getScrim0d7_KjU();
        }
        return m1806lightColorSchemeG1PFcw(j30, m3161getOnPrimary0d7_KjU, m3178getPrimaryContainer0d7_KjU, m3162getOnPrimaryContainer0d7_KjU, m3156getInversePrimary0d7_KjU, m3182getSecondary0d7_KjU, m3165getOnSecondary0d7_KjU, m3183getSecondaryContainer0d7_KjU, m3166getOnSecondaryContainer0d7_KjU, m3196getTertiary0d7_KjU, m3171getOnTertiary0d7_KjU, m3197getTertiaryContainer0d7_KjU, m3172getOnTertiaryContainer0d7_KjU, m3152getBackground0d7_KjU, m3158getOnBackground0d7_KjU, m3186getSurface0d7_KjU, m3169getOnSurface0d7_KjU, m3195getSurfaceVariant0d7_KjU, m3170getOnSurfaceVariant0d7_KjU, j31, m3157getInverseSurface0d7_KjU, m3155getInverseOnSurface0d7_KjU, m3153getError0d7_KjU, m3159getOnError0d7_KjU, m3154getErrorContainer0d7_KjU, m3160getOnErrorContainer0d7_KjU, m3175getOutline0d7_KjU, m3176getOutlineVariant0d7_KjU, j29);
    }

    /* renamed from: lightColorScheme-_VG5OTI, reason: not valid java name */
    public static final ColorScheme m1808lightColorScheme_VG5OTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, null);
    }

    /* renamed from: lightColorScheme-_VG5OTI$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1809lightColorScheme_VG5OTI$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, Object obj) {
        long m3177getPrimary0d7_KjU = (i & 1) != 0 ? ColorLightTokens.INSTANCE.m3177getPrimary0d7_KjU() : j;
        long m3161getOnPrimary0d7_KjU = (i & 2) != 0 ? ColorLightTokens.INSTANCE.m3161getOnPrimary0d7_KjU() : j2;
        long m3178getPrimaryContainer0d7_KjU = (i & 4) != 0 ? ColorLightTokens.INSTANCE.m3178getPrimaryContainer0d7_KjU() : j3;
        long m3162getOnPrimaryContainer0d7_KjU = (i & 8) != 0 ? ColorLightTokens.INSTANCE.m3162getOnPrimaryContainer0d7_KjU() : j4;
        long m3156getInversePrimary0d7_KjU = (i & 16) != 0 ? ColorLightTokens.INSTANCE.m3156getInversePrimary0d7_KjU() : j5;
        long m3182getSecondary0d7_KjU = (i & 32) != 0 ? ColorLightTokens.INSTANCE.m3182getSecondary0d7_KjU() : j6;
        long m3165getOnSecondary0d7_KjU = (i & 64) != 0 ? ColorLightTokens.INSTANCE.m3165getOnSecondary0d7_KjU() : j7;
        long j49 = m3177getPrimary0d7_KjU;
        long m3183getSecondaryContainer0d7_KjU = (i & Fields.SpotShadowColor) != 0 ? ColorLightTokens.INSTANCE.m3183getSecondaryContainer0d7_KjU() : j8;
        long m3166getOnSecondaryContainer0d7_KjU = (i & Fields.RotationX) != 0 ? ColorLightTokens.INSTANCE.m3166getOnSecondaryContainer0d7_KjU() : j9;
        long m3196getTertiary0d7_KjU = (i & Fields.RotationY) != 0 ? ColorLightTokens.INSTANCE.m3196getTertiary0d7_KjU() : j10;
        long m3171getOnTertiary0d7_KjU = (i & Fields.RotationZ) != 0 ? ColorLightTokens.INSTANCE.m3171getOnTertiary0d7_KjU() : j11;
        long m3197getTertiaryContainer0d7_KjU = (i & Fields.CameraDistance) != 0 ? ColorLightTokens.INSTANCE.m3197getTertiaryContainer0d7_KjU() : j12;
        long m3172getOnTertiaryContainer0d7_KjU = (i & Fields.TransformOrigin) != 0 ? ColorLightTokens.INSTANCE.m3172getOnTertiaryContainer0d7_KjU() : j13;
        long m3152getBackground0d7_KjU = (i & 8192) != 0 ? ColorLightTokens.INSTANCE.m3152getBackground0d7_KjU() : j14;
        long m3158getOnBackground0d7_KjU = (i & Fields.Clip) != 0 ? ColorLightTokens.INSTANCE.m3158getOnBackground0d7_KjU() : j15;
        long m3186getSurface0d7_KjU = (i & Fields.CompositingStrategy) != 0 ? ColorLightTokens.INSTANCE.m3186getSurface0d7_KjU() : j16;
        long m3169getOnSurface0d7_KjU = (i & 65536) != 0 ? ColorLightTokens.INSTANCE.m3169getOnSurface0d7_KjU() : j17;
        long m3195getSurfaceVariant0d7_KjU = (i & Fields.RenderEffect) != 0 ? ColorLightTokens.INSTANCE.m3195getSurfaceVariant0d7_KjU() : j18;
        long m3170getOnSurfaceVariant0d7_KjU = (i & Fields.ColorFilter) != 0 ? ColorLightTokens.INSTANCE.m3170getOnSurfaceVariant0d7_KjU() : j19;
        long j50 = (i & Fields.BlendMode) != 0 ? j49 : j20;
        long m3157getInverseSurface0d7_KjU = (i & 1048576) != 0 ? ColorLightTokens.INSTANCE.m3157getInverseSurface0d7_KjU() : j21;
        long m3155getInverseOnSurface0d7_KjU = (i & 2097152) != 0 ? ColorLightTokens.INSTANCE.m3155getInverseOnSurface0d7_KjU() : j22;
        long m3153getError0d7_KjU = (i & 4194304) != 0 ? ColorLightTokens.INSTANCE.m3153getError0d7_KjU() : j23;
        long m3159getOnError0d7_KjU = (i & GroupFlagsKt.IsNodeFlag) != 0 ? ColorLightTokens.INSTANCE.m3159getOnError0d7_KjU() : j24;
        long m3154getErrorContainer0d7_KjU = (i & GroupFlagsKt.HasObjectKeyFlag) != 0 ? ColorLightTokens.INSTANCE.m3154getErrorContainer0d7_KjU() : j25;
        long m3160getOnErrorContainer0d7_KjU = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? ColorLightTokens.INSTANCE.m3160getOnErrorContainer0d7_KjU() : j26;
        long m3175getOutline0d7_KjU = (i & GroupFlagsKt.IsRecompositionRequiredFlag) != 0 ? ColorLightTokens.INSTANCE.m3175getOutline0d7_KjU() : j27;
        long m3176getOutlineVariant0d7_KjU = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? ColorLightTokens.INSTANCE.m3176getOutlineVariant0d7_KjU() : j28;
        long m3181getScrim0d7_KjU = (i & GroupFlagsKt.IsMovableContentFlag) != 0 ? ColorLightTokens.INSTANCE.m3181getScrim0d7_KjU() : j29;
        long m3187getSurfaceBright0d7_KjU = (i & GroupFlagsKt.HasMovableContentFlag) != 0 ? ColorLightTokens.INSTANCE.m3187getSurfaceBright0d7_KjU() : j30;
        long m3188getSurfaceContainer0d7_KjU = (i & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? ColorLightTokens.INSTANCE.m3188getSurfaceContainer0d7_KjU() : j31;
        long m3189getSurfaceContainerHigh0d7_KjU = (i & Integer.MIN_VALUE) != 0 ? ColorLightTokens.INSTANCE.m3189getSurfaceContainerHigh0d7_KjU() : j32;
        long m3190getSurfaceContainerHighest0d7_KjU = (i2 & 1) != 0 ? ColorLightTokens.INSTANCE.m3190getSurfaceContainerHighest0d7_KjU() : j33;
        long m3191getSurfaceContainerLow0d7_KjU = (i2 & 2) != 0 ? ColorLightTokens.INSTANCE.m3191getSurfaceContainerLow0d7_KjU() : j34;
        long m3192getSurfaceContainerLowest0d7_KjU = (i2 & 4) != 0 ? ColorLightTokens.INSTANCE.m3192getSurfaceContainerLowest0d7_KjU() : j35;
        long m3193getSurfaceDim0d7_KjU = (i2 & 8) != 0 ? ColorLightTokens.INSTANCE.m3193getSurfaceDim0d7_KjU() : j36;
        long m3179getPrimaryFixed0d7_KjU = (i2 & 16) != 0 ? ColorLightTokens.INSTANCE.m3179getPrimaryFixed0d7_KjU() : j37;
        long m3180getPrimaryFixedDim0d7_KjU = (i2 & 32) != 0 ? ColorLightTokens.INSTANCE.m3180getPrimaryFixedDim0d7_KjU() : j38;
        long m3163getOnPrimaryFixed0d7_KjU = (i2 & 64) != 0 ? ColorLightTokens.INSTANCE.m3163getOnPrimaryFixed0d7_KjU() : j39;
        long m3164getOnPrimaryFixedVariant0d7_KjU = (i2 & Fields.SpotShadowColor) != 0 ? ColorLightTokens.INSTANCE.m3164getOnPrimaryFixedVariant0d7_KjU() : j40;
        long m3184getSecondaryFixed0d7_KjU = (i2 & Fields.RotationX) != 0 ? ColorLightTokens.INSTANCE.m3184getSecondaryFixed0d7_KjU() : j41;
        long m3185getSecondaryFixedDim0d7_KjU = (i2 & Fields.RotationY) != 0 ? ColorLightTokens.INSTANCE.m3185getSecondaryFixedDim0d7_KjU() : j42;
        long m3167getOnSecondaryFixed0d7_KjU = (i2 & Fields.RotationZ) != 0 ? ColorLightTokens.INSTANCE.m3167getOnSecondaryFixed0d7_KjU() : j43;
        long m3168getOnSecondaryFixedVariant0d7_KjU = (i2 & Fields.CameraDistance) != 0 ? ColorLightTokens.INSTANCE.m3168getOnSecondaryFixedVariant0d7_KjU() : j44;
        long m3198getTertiaryFixed0d7_KjU = (i2 & Fields.TransformOrigin) != 0 ? ColorLightTokens.INSTANCE.m3198getTertiaryFixed0d7_KjU() : j45;
        long m3199getTertiaryFixedDim0d7_KjU = (i2 & 8192) != 0 ? ColorLightTokens.INSTANCE.m3199getTertiaryFixedDim0d7_KjU() : j46;
        long m3173getOnTertiaryFixed0d7_KjU = (i2 & Fields.Clip) != 0 ? ColorLightTokens.INSTANCE.m3173getOnTertiaryFixed0d7_KjU() : j47;
        if ((i2 & Fields.CompositingStrategy) != 0) {
            j48 = ColorLightTokens.INSTANCE.m3174getOnTertiaryFixedVariant0d7_KjU();
        }
        return m1808lightColorScheme_VG5OTI(j49, m3161getOnPrimary0d7_KjU, m3178getPrimaryContainer0d7_KjU, m3162getOnPrimaryContainer0d7_KjU, m3156getInversePrimary0d7_KjU, m3182getSecondary0d7_KjU, m3165getOnSecondary0d7_KjU, m3183getSecondaryContainer0d7_KjU, m3166getOnSecondaryContainer0d7_KjU, m3196getTertiary0d7_KjU, m3171getOnTertiary0d7_KjU, m3197getTertiaryContainer0d7_KjU, m3172getOnTertiaryContainer0d7_KjU, m3152getBackground0d7_KjU, m3158getOnBackground0d7_KjU, m3186getSurface0d7_KjU, m3169getOnSurface0d7_KjU, m3195getSurfaceVariant0d7_KjU, m3170getOnSurfaceVariant0d7_KjU, j50, m3157getInverseSurface0d7_KjU, m3155getInverseOnSurface0d7_KjU, m3153getError0d7_KjU, m3159getOnError0d7_KjU, m3154getErrorContainer0d7_KjU, m3160getOnErrorContainer0d7_KjU, m3175getOutline0d7_KjU, m3176getOutlineVariant0d7_KjU, m3181getScrim0d7_KjU, m3187getSurfaceBright0d7_KjU, m3188getSurfaceContainer0d7_KjU, m3189getSurfaceContainerHigh0d7_KjU, m3190getSurfaceContainerHighest0d7_KjU, m3191getSurfaceContainerLow0d7_KjU, m3192getSurfaceContainerLowest0d7_KjU, m3193getSurfaceDim0d7_KjU, m3179getPrimaryFixed0d7_KjU, m3180getPrimaryFixedDim0d7_KjU, m3163getOnPrimaryFixed0d7_KjU, m3164getOnPrimaryFixedVariant0d7_KjU, m3184getSecondaryFixed0d7_KjU, m3185getSecondaryFixedDim0d7_KjU, m3167getOnSecondaryFixed0d7_KjU, m3168getOnSecondaryFixedVariant0d7_KjU, m3198getTertiaryFixed0d7_KjU, m3199getTertiaryFixedDim0d7_KjU, m3173getOnTertiaryFixed0d7_KjU, j48);
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m1810surfaceColorAtElevation3ABfNKs(ColorScheme colorScheme, float f) {
        if (Dp.m7616equalsimpl0(f, Dp.m7611constructorimpl(0.0f))) {
            return colorScheme.m1781getSurface0d7_KjU();
        }
        return ColorKt.m4806compositeOverOWjLjI(Color.m4760copywmQWz5c$default(colorScheme.m1789getSurfaceTint0d7_KjU(), ((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m1781getSurface0d7_KjU());
    }
}
