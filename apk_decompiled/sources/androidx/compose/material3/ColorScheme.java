package androidx.compose.material3;

import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import defpackage.dq;
import defpackage.er;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ColorScheme {
    public static final int $stable = 0;
    private final long background;
    private ChipColors defaultAssistChipColorsCached;
    private ButtonColors defaultButtonColorsCached;
    private CardColors defaultCardColorsCached;
    private CheckboxColors defaultCheckboxColorsCached;
    private DatePickerColors defaultDatePickerColorsCached;
    private ChipColors defaultElevatedAssistChipColorsCached;
    private ButtonColors defaultElevatedButtonColorsCached;
    private CardColors defaultElevatedCardColorsCached;
    private SelectableChipColors defaultElevatedFilterChipColorsCached;
    private ChipColors defaultElevatedSuggestionChipColorsCached;
    private IconButtonColors defaultFilledIconButtonColorsCached;
    private IconToggleButtonColors defaultFilledIconToggleButtonColorsCached;
    private ButtonColors defaultFilledTonalButtonColorsCached;
    private IconButtonColors defaultFilledTonalIconButtonColorsCached;
    private IconToggleButtonColors defaultFilledTonalIconToggleButtonColorsCached;
    private SelectableChipColors defaultFilterChipColorsCached;
    private IconButtonColors defaultIconButtonColorsCached;
    private IconButtonColors defaultIconButtonVibrantColorsCached;
    private IconToggleButtonColors defaultIconToggleButtonColorsCached;
    private IconToggleButtonColors defaultIconToggleButtonVibrantColorsCached;
    private SelectableChipColors defaultInputChipColorsCached;
    private ListItemColors defaultListItemColorsCached;
    private MenuItemColors defaultMenuItemColorsCached;
    private NavigationBarItemColors defaultNavigationBarItemColorsCached;
    private NavigationRailItemColors defaultNavigationRailItemColorsCached;
    private ButtonColors defaultOutlinedButtonColorsCached;
    private CardColors defaultOutlinedCardColorsCached;
    private IconButtonColors defaultOutlinedIconButtonColorsCached;
    private IconButtonColors defaultOutlinedIconButtonVibrantColorsCached;
    private IconToggleButtonColors defaultOutlinedIconToggleButtonColorsCached;
    private IconToggleButtonColors defaultOutlinedIconToggleButtonVibrantColorsCached;
    private TextFieldColors defaultOutlinedTextFieldColorsCached;
    private RadioButtonColors defaultRadioButtonColorsCached;
    private RichTooltipColors defaultRichTooltipColorsCached;
    private SegmentedButtonColors defaultSegmentedButtonColorsCached;
    private NavigationItemColors defaultShortNavigationBarItemColorsCached;
    private SliderColors defaultSliderColorsCached;
    private ChipColors defaultSuggestionChipColorsCached;
    private SwitchColors defaultSwitchColorsCached;
    private ButtonColors defaultTextButtonColorsCached;
    private TextFieldColors defaultTextFieldColorsCached;
    private TimePickerColors defaultTimePickerColorsCached;
    private TopAppBarColors defaultTopAppBarColorsCached;
    private DragHandleColors defaultVerticalDragHandleColorsCached;
    private NavigationItemColors defaultWideNavigationRailItemColorsCached;
    private WideNavigationRailColors defaultWideWideNavigationRailColorsCached;
    private final long error;
    private final long errorContainer;
    private final long inverseOnSurface;
    private final long inversePrimary;
    private final long inverseSurface;
    private final long onBackground;
    private final long onError;
    private final long onErrorContainer;
    private final long onPrimary;
    private final long onPrimaryContainer;
    private final long onPrimaryFixed;
    private final long onPrimaryFixedVariant;
    private final long onSecondary;
    private final long onSecondaryContainer;
    private final long onSecondaryFixed;
    private final long onSecondaryFixedVariant;
    private final long onSurface;
    private final long onSurfaceVariant;
    private final long onTertiary;
    private final long onTertiaryContainer;
    private final long onTertiaryFixed;
    private final long onTertiaryFixedVariant;
    private final long outline;
    private final long outlineVariant;
    private final long primary;
    private final long primaryContainer;
    private final long primaryFixed;
    private final long primaryFixedDim;
    private final long scrim;
    private final long secondary;
    private final long secondaryContainer;
    private final long secondaryFixed;
    private final long secondaryFixedDim;
    private final long surface;
    private final long surfaceBright;
    private final long surfaceContainer;
    private final long surfaceContainerHigh;
    private final long surfaceContainerHighest;
    private final long surfaceContainerLow;
    private final long surfaceContainerLowest;
    private final long surfaceDim;
    private final long surfaceTint;
    private final long surfaceVariant;
    private final long tertiary;
    private final long tertiaryContainer;
    private final long tertiaryFixed;
    private final long tertiaryFixedDim;

    private ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        this.primary = j;
        this.onPrimary = j2;
        this.primaryContainer = j3;
        this.onPrimaryContainer = j4;
        this.inversePrimary = j5;
        this.secondary = j6;
        this.onSecondary = j7;
        this.secondaryContainer = j8;
        this.onSecondaryContainer = j9;
        this.tertiary = j10;
        this.onTertiary = j11;
        this.tertiaryContainer = j12;
        this.onTertiaryContainer = j13;
        this.background = j14;
        this.onBackground = j15;
        this.surface = j16;
        this.onSurface = j17;
        this.surfaceVariant = j18;
        this.onSurfaceVariant = j19;
        this.surfaceTint = j20;
        this.inverseSurface = j21;
        this.inverseOnSurface = j22;
        this.error = j23;
        this.onError = j24;
        this.errorContainer = j25;
        this.onErrorContainer = j26;
        this.outline = j27;
        this.outlineVariant = j28;
        this.scrim = j29;
        this.surfaceBright = j30;
        this.surfaceDim = j31;
        this.surfaceContainer = j32;
        this.surfaceContainerHigh = j33;
        this.surfaceContainerHighest = j34;
        this.surfaceContainerLow = j35;
        this.surfaceContainerLowest = j36;
        this.primaryFixed = j37;
        this.primaryFixedDim = j38;
        this.onPrimaryFixed = j39;
        this.onPrimaryFixedVariant = j40;
        this.secondaryFixed = j41;
        this.secondaryFixedDim = j42;
        this.onSecondaryFixed = j43;
        this.onSecondaryFixedVariant = j44;
        this.tertiaryFixed = j45;
        this.tertiaryFixedDim = j46;
        this.onTertiaryFixed = j47;
        this.onTertiaryFixedVariant = j48;
    }

    /* renamed from: copy-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1741copyCXl9yA$default(ColorScheme colorScheme, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, Object obj) {
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58;
        long j59;
        long j60;
        long j61;
        long j62;
        long j63;
        long j64;
        long j65;
        long j66;
        ColorScheme colorScheme2;
        long j67;
        long j68;
        long j69;
        long j70;
        long j71;
        long j72 = (i & 1) != 0 ? colorScheme.primary : j;
        long j73 = (i & 2) != 0 ? colorScheme.onPrimary : j2;
        long j74 = (i & 4) != 0 ? colorScheme.primaryContainer : j3;
        long j75 = (i & 8) != 0 ? colorScheme.onPrimaryContainer : j4;
        long j76 = (i & 16) != 0 ? colorScheme.inversePrimary : j5;
        long j77 = (i & 32) != 0 ? colorScheme.secondary : j6;
        long j78 = (i & 64) != 0 ? colorScheme.onSecondary : j7;
        long j79 = j72;
        long j80 = (i & Fields.SpotShadowColor) != 0 ? colorScheme.secondaryContainer : j8;
        long j81 = (i & Fields.RotationX) != 0 ? colorScheme.onSecondaryContainer : j9;
        long j82 = (i & Fields.RotationY) != 0 ? colorScheme.tertiary : j10;
        long j83 = (i & Fields.RotationZ) != 0 ? colorScheme.onTertiary : j11;
        long j84 = (i & Fields.CameraDistance) != 0 ? colorScheme.tertiaryContainer : j12;
        long j85 = (i & Fields.TransformOrigin) != 0 ? colorScheme.onTertiaryContainer : j13;
        long j86 = (i & 8192) != 0 ? colorScheme.background : j14;
        long j87 = (i & Fields.Clip) != 0 ? colorScheme.onBackground : j15;
        long j88 = (i & Fields.CompositingStrategy) != 0 ? colorScheme.surface : j16;
        long j89 = (i & 65536) != 0 ? colorScheme.onSurface : j17;
        long j90 = (i & Fields.RenderEffect) != 0 ? colorScheme.surfaceVariant : j18;
        long j91 = (i & Fields.ColorFilter) != 0 ? colorScheme.onSurfaceVariant : j19;
        long j92 = (i & Fields.BlendMode) != 0 ? colorScheme.surfaceTint : j20;
        long j93 = (i & 1048576) != 0 ? colorScheme.inverseSurface : j21;
        long j94 = (i & 2097152) != 0 ? colorScheme.inverseOnSurface : j22;
        long j95 = (i & 4194304) != 0 ? colorScheme.error : j23;
        long j96 = (i & GroupFlagsKt.IsNodeFlag) != 0 ? colorScheme.onError : j24;
        long j97 = (i & GroupFlagsKt.HasObjectKeyFlag) != 0 ? colorScheme.errorContainer : j25;
        long j98 = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? colorScheme.onErrorContainer : j26;
        long j99 = (i & GroupFlagsKt.IsRecompositionRequiredFlag) != 0 ? colorScheme.outline : j27;
        long j100 = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? colorScheme.outlineVariant : j28;
        long j101 = (i & GroupFlagsKt.IsMovableContentFlag) != 0 ? colorScheme.scrim : j29;
        long j102 = (i & GroupFlagsKt.HasMovableContentFlag) != 0 ? colorScheme.surfaceBright : j30;
        long j103 = (i & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? colorScheme.surfaceDim : j31;
        long j104 = (i & Integer.MIN_VALUE) != 0 ? colorScheme.surfaceContainer : j32;
        long j105 = (i2 & 1) != 0 ? colorScheme.surfaceContainerHigh : j33;
        long j106 = (i2 & 2) != 0 ? colorScheme.surfaceContainerHighest : j34;
        long j107 = (i2 & 4) != 0 ? colorScheme.surfaceContainerLow : j35;
        if ((i2 & 8) != 0) {
            j38 = j107;
            j37 = colorScheme.surfaceContainerLowest;
            j40 = j101;
            j41 = j102;
            j42 = j103;
            j43 = j104;
            j44 = j105;
            j45 = j106;
            j47 = j94;
            j48 = j95;
            j49 = j96;
            j50 = j97;
            j51 = j98;
            j52 = j99;
            j39 = j100;
            j54 = j87;
            j55 = j88;
            j56 = j89;
            j57 = j90;
            j58 = j91;
            j59 = j92;
            j46 = j93;
            j61 = j80;
            j62 = j81;
            j63 = j82;
            j64 = j83;
            j65 = j84;
            j66 = j85;
            j53 = j86;
            colorScheme2 = colorScheme;
            j67 = j73;
            j68 = j74;
            j69 = j75;
            j70 = j76;
            j71 = j77;
            j60 = j78;
        } else {
            j37 = j36;
            j38 = j107;
            j39 = j100;
            j40 = j101;
            j41 = j102;
            j42 = j103;
            j43 = j104;
            j44 = j105;
            j45 = j106;
            j46 = j93;
            j47 = j94;
            j48 = j95;
            j49 = j96;
            j50 = j97;
            j51 = j98;
            j52 = j99;
            j53 = j86;
            j54 = j87;
            j55 = j88;
            j56 = j89;
            j57 = j90;
            j58 = j91;
            j59 = j92;
            j60 = j78;
            j61 = j80;
            j62 = j81;
            j63 = j82;
            j64 = j83;
            j65 = j84;
            j66 = j85;
            colorScheme2 = colorScheme;
            j67 = j73;
            j68 = j74;
            j69 = j75;
            j70 = j76;
            j71 = j77;
        }
        return colorScheme2.m1744copyCXl9yA(j79, j67, j68, j69, j70, j71, j60, j61, j62, j63, j64, j65, j66, j53, j54, j55, j56, j57, j58, j59, j46, j47, j48, j49, j50, j51, j52, j39, j40, j41, j42, j43, j44, j45, j38, j37);
    }

    /* renamed from: copy-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1742copyG1PFcw$default(ColorScheme colorScheme, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, Object obj) {
        long j30;
        long j31;
        long j32;
        long j33;
        long j34;
        long j35;
        long j36;
        long j37;
        long j38;
        long j39;
        long j40;
        long j41;
        long j42;
        long j43;
        long j44;
        long j45;
        long j46;
        long j47;
        long j48;
        long j49;
        long j50;
        long j51;
        long j52;
        ColorScheme colorScheme2;
        long j53;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58 = (i & 1) != 0 ? colorScheme.primary : j;
        long j59 = (i & 2) != 0 ? colorScheme.onPrimary : j2;
        long j60 = (i & 4) != 0 ? colorScheme.primaryContainer : j3;
        long j61 = (i & 8) != 0 ? colorScheme.onPrimaryContainer : j4;
        long j62 = (i & 16) != 0 ? colorScheme.inversePrimary : j5;
        long j63 = (i & 32) != 0 ? colorScheme.secondary : j6;
        long j64 = (i & 64) != 0 ? colorScheme.onSecondary : j7;
        long j65 = j58;
        long j66 = (i & Fields.SpotShadowColor) != 0 ? colorScheme.secondaryContainer : j8;
        long j67 = (i & Fields.RotationX) != 0 ? colorScheme.onSecondaryContainer : j9;
        long j68 = (i & Fields.RotationY) != 0 ? colorScheme.tertiary : j10;
        long j69 = (i & Fields.RotationZ) != 0 ? colorScheme.onTertiary : j11;
        long j70 = (i & Fields.CameraDistance) != 0 ? colorScheme.tertiaryContainer : j12;
        long j71 = (i & Fields.TransformOrigin) != 0 ? colorScheme.onTertiaryContainer : j13;
        long j72 = (i & 8192) != 0 ? colorScheme.background : j14;
        long j73 = (i & Fields.Clip) != 0 ? colorScheme.onBackground : j15;
        long j74 = (i & Fields.CompositingStrategy) != 0 ? colorScheme.surface : j16;
        long j75 = (i & 65536) != 0 ? colorScheme.onSurface : j17;
        long j76 = (i & Fields.RenderEffect) != 0 ? colorScheme.surfaceVariant : j18;
        long j77 = (i & Fields.ColorFilter) != 0 ? colorScheme.onSurfaceVariant : j19;
        long j78 = (i & Fields.BlendMode) != 0 ? colorScheme.surfaceTint : j20;
        long j79 = (i & 1048576) != 0 ? colorScheme.inverseSurface : j21;
        long j80 = (i & 2097152) != 0 ? colorScheme.inverseOnSurface : j22;
        long j81 = (i & 4194304) != 0 ? colorScheme.error : j23;
        long j82 = (i & GroupFlagsKt.IsNodeFlag) != 0 ? colorScheme.onError : j24;
        long j83 = (i & GroupFlagsKt.HasObjectKeyFlag) != 0 ? colorScheme.errorContainer : j25;
        long j84 = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? colorScheme.onErrorContainer : j26;
        long j85 = (i & GroupFlagsKt.IsRecompositionRequiredFlag) != 0 ? colorScheme.outline : j27;
        long j86 = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? colorScheme.outlineVariant : j28;
        if ((i & GroupFlagsKt.IsMovableContentFlag) != 0) {
            j31 = j86;
            j30 = colorScheme.scrim;
            j33 = j80;
            j34 = j81;
            j35 = j82;
            j36 = j83;
            j37 = j84;
            j38 = j85;
            j40 = j73;
            j41 = j74;
            j42 = j75;
            j43 = j76;
            j44 = j77;
            j45 = j78;
            j32 = j79;
            j47 = j66;
            j48 = j67;
            j49 = j68;
            j50 = j69;
            j51 = j70;
            j52 = j71;
            j39 = j72;
            colorScheme2 = colorScheme;
            j53 = j59;
            j54 = j60;
            j55 = j61;
            j56 = j62;
            j57 = j63;
            j46 = j64;
        } else {
            j30 = j29;
            j31 = j86;
            j32 = j79;
            j33 = j80;
            j34 = j81;
            j35 = j82;
            j36 = j83;
            j37 = j84;
            j38 = j85;
            j39 = j72;
            j40 = j73;
            j41 = j74;
            j42 = j75;
            j43 = j76;
            j44 = j77;
            j45 = j78;
            j46 = j64;
            j47 = j66;
            j48 = j67;
            j49 = j68;
            j50 = j69;
            j51 = j70;
            j52 = j71;
            colorScheme2 = colorScheme;
            j53 = j59;
            j54 = j60;
            j55 = j61;
            j56 = j62;
            j57 = j63;
        }
        return colorScheme2.m1745copyG1PFcw(j65, j53, j54, j55, j56, j57, j46, j47, j48, j49, j50, j51, j52, j39, j40, j41, j42, j43, j44, j45, j32, j33, j34, j35, j36, j37, j38, j31, j30);
    }

    /* renamed from: copy-_VG5OTI$default, reason: not valid java name */
    public static /* synthetic */ ColorScheme m1743copy_VG5OTI$default(ColorScheme colorScheme, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, Object obj) {
        long j49;
        long j50;
        long j51;
        long j52;
        long j53;
        long j54;
        long j55;
        long j56;
        long j57;
        long j58;
        long j59;
        long j60;
        long j61;
        long j62;
        long j63;
        long j64;
        long j65;
        long j66;
        long j67;
        long j68;
        long j69;
        long j70;
        long j71;
        long j72;
        long j73;
        long j74;
        long j75;
        long j76;
        long j77;
        long j78;
        long j79;
        long j80;
        long j81;
        long j82;
        long j83;
        long j84;
        long j85;
        long j86;
        long j87;
        long j88;
        long j89;
        long j90;
        long j91;
        long j92;
        long j93;
        long j94;
        long j95;
        ColorScheme colorScheme2;
        long j96;
        long j97;
        long j98 = (i & 1) != 0 ? colorScheme.primary : j;
        long j99 = (i & 2) != 0 ? colorScheme.onPrimary : j2;
        long j100 = (i & 4) != 0 ? colorScheme.primaryContainer : j3;
        long j101 = (i & 8) != 0 ? colorScheme.onPrimaryContainer : j4;
        long j102 = (i & 16) != 0 ? colorScheme.inversePrimary : j5;
        long j103 = (i & 32) != 0 ? colorScheme.secondary : j6;
        if ((i & 64) != 0) {
            j49 = j98;
            j50 = colorScheme.onSecondary;
        } else {
            j49 = j98;
            j50 = j7;
        }
        long j104 = j50;
        long j105 = (i & Fields.SpotShadowColor) != 0 ? colorScheme.secondaryContainer : j8;
        long j106 = (i & Fields.RotationX) != 0 ? colorScheme.onSecondaryContainer : j9;
        long j107 = (i & Fields.RotationY) != 0 ? colorScheme.tertiary : j10;
        long j108 = (i & Fields.RotationZ) != 0 ? colorScheme.onTertiary : j11;
        long j109 = (i & Fields.CameraDistance) != 0 ? colorScheme.tertiaryContainer : j12;
        long j110 = (i & Fields.TransformOrigin) != 0 ? colorScheme.onTertiaryContainer : j13;
        long j111 = (i & 8192) != 0 ? colorScheme.background : j14;
        long j112 = (i & Fields.Clip) != 0 ? colorScheme.onBackground : j15;
        long j113 = (i & Fields.CompositingStrategy) != 0 ? colorScheme.surface : j16;
        long j114 = (i & 65536) != 0 ? colorScheme.onSurface : j17;
        long j115 = (i & Fields.RenderEffect) != 0 ? colorScheme.surfaceVariant : j18;
        long j116 = (i & Fields.ColorFilter) != 0 ? colorScheme.onSurfaceVariant : j19;
        long j117 = (i & Fields.BlendMode) != 0 ? colorScheme.surfaceTint : j20;
        long j118 = (i & 1048576) != 0 ? colorScheme.inverseSurface : j21;
        long j119 = (i & 2097152) != 0 ? colorScheme.inverseOnSurface : j22;
        long j120 = (i & 4194304) != 0 ? colorScheme.error : j23;
        long j121 = (i & GroupFlagsKt.IsNodeFlag) != 0 ? colorScheme.onError : j24;
        long j122 = (i & GroupFlagsKt.HasObjectKeyFlag) != 0 ? colorScheme.errorContainer : j25;
        long j123 = (i & GroupFlagsKt.HasAuxSlotFlag) != 0 ? colorScheme.onErrorContainer : j26;
        long j124 = (i & GroupFlagsKt.IsRecompositionRequiredFlag) != 0 ? colorScheme.outline : j27;
        long j125 = (i & GroupFlagsKt.HasRecompositionRequiredFlag) != 0 ? colorScheme.outlineVariant : j28;
        long j126 = (i & GroupFlagsKt.IsMovableContentFlag) != 0 ? colorScheme.scrim : j29;
        long j127 = (i & GroupFlagsKt.HasMovableContentFlag) != 0 ? colorScheme.surfaceBright : j30;
        long j128 = (i & GroupFlagsKt.IsSubcompositionContextFlag) != 0 ? colorScheme.surfaceDim : j31;
        long j129 = (i & Integer.MIN_VALUE) != 0 ? colorScheme.surfaceContainer : j32;
        long j130 = (i2 & 1) != 0 ? colorScheme.surfaceContainerHigh : j33;
        long j131 = (i2 & 2) != 0 ? colorScheme.surfaceContainerHighest : j34;
        long j132 = (i2 & 4) != 0 ? colorScheme.surfaceContainerLow : j35;
        long j133 = (i2 & 8) != 0 ? colorScheme.surfaceContainerLowest : j36;
        long j134 = (i2 & 16) != 0 ? colorScheme.primaryFixed : j37;
        long j135 = (i2 & 32) != 0 ? colorScheme.primaryFixedDim : j38;
        long j136 = (i2 & 64) != 0 ? colorScheme.onPrimaryFixed : j39;
        long j137 = (i2 & Fields.SpotShadowColor) != 0 ? colorScheme.onPrimaryFixedVariant : j40;
        long j138 = (i2 & Fields.RotationX) != 0 ? colorScheme.secondaryFixed : j41;
        long j139 = (i2 & Fields.RotationY) != 0 ? colorScheme.secondaryFixedDim : j42;
        long j140 = (i2 & Fields.RotationZ) != 0 ? colorScheme.onSecondaryFixed : j43;
        long j141 = (i2 & Fields.CameraDistance) != 0 ? colorScheme.onSecondaryFixedVariant : j44;
        long j142 = (i2 & Fields.TransformOrigin) != 0 ? colorScheme.tertiaryFixed : j45;
        long j143 = (i2 & 8192) != 0 ? colorScheme.tertiaryFixedDim : j46;
        long j144 = (i2 & Fields.Clip) != 0 ? colorScheme.onTertiaryFixed : j47;
        if ((i2 & Fields.CompositingStrategy) != 0) {
            j52 = j144;
            j51 = colorScheme.onTertiaryFixedVariant;
            j54 = j138;
            j55 = j139;
            j56 = j140;
            j57 = j141;
            j58 = j142;
            j59 = j143;
            j61 = j132;
            j62 = j133;
            j63 = j134;
            j64 = j135;
            j65 = j136;
            j53 = j137;
            j67 = j126;
            j68 = j127;
            j69 = j128;
            j70 = j129;
            j71 = j130;
            j60 = j131;
            j73 = j120;
            j74 = j121;
            j75 = j122;
            j76 = j123;
            j77 = j124;
            j66 = j125;
            j79 = j114;
            j80 = j115;
            j81 = j116;
            j82 = j117;
            j83 = j118;
            j72 = j119;
            j85 = j108;
            j86 = j109;
            j87 = j110;
            j88 = j111;
            j89 = j112;
            j78 = j113;
            j91 = j102;
            j92 = j103;
            j93 = j104;
            j94 = j105;
            j95 = j106;
            j84 = j107;
            colorScheme2 = colorScheme;
            j96 = j99;
            j97 = j100;
            j90 = j101;
        } else {
            j51 = j48;
            j52 = j144;
            j53 = j137;
            j54 = j138;
            j55 = j139;
            j56 = j140;
            j57 = j141;
            j58 = j142;
            j59 = j143;
            j60 = j131;
            j61 = j132;
            j62 = j133;
            j63 = j134;
            j64 = j135;
            j65 = j136;
            j66 = j125;
            j67 = j126;
            j68 = j127;
            j69 = j128;
            j70 = j129;
            j71 = j130;
            j72 = j119;
            j73 = j120;
            j74 = j121;
            j75 = j122;
            j76 = j123;
            j77 = j124;
            j78 = j113;
            j79 = j114;
            j80 = j115;
            j81 = j116;
            j82 = j117;
            j83 = j118;
            j84 = j107;
            j85 = j108;
            j86 = j109;
            j87 = j110;
            j88 = j111;
            j89 = j112;
            j90 = j101;
            j91 = j102;
            j92 = j103;
            j93 = j104;
            j94 = j105;
            j95 = j106;
            colorScheme2 = colorScheme;
            j96 = j99;
            j97 = j100;
        }
        return colorScheme2.m1746copy_VG5OTI(j49, j96, j97, j90, j91, j92, j93, j94, j95, j84, j85, j86, j87, j88, j89, j78, j79, j80, j81, j82, j83, j72, j73, j74, j75, j76, j77, j66, j67, j68, j69, j70, j71, j60, j61, j62, j63, j64, j65, j53, j54, j55, j56, j57, j58, j59, j52, j51);
    }

    @er
    /* renamed from: copy-C-Xl9yA, reason: not valid java name */
    public final /* synthetic */ ColorScheme m1744copyCXl9yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return m1743copy_VG5OTI$default(this, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    @er
    /* renamed from: copy-G1PFc-w, reason: not valid java name */
    public final /* synthetic */ ColorScheme m1745copyG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return m1743copy_VG5OTI$default(this, j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 65535, null);
    }

    /* renamed from: copy-_VG5OTI, reason: not valid java name */
    public final ColorScheme m1746copy_VG5OTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        return new ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, null);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m1747getBackground0d7_KjU() {
        return this.background;
    }

    public final ChipColors getDefaultAssistChipColorsCached$material3() {
        return this.defaultAssistChipColorsCached;
    }

    public final ButtonColors getDefaultButtonColorsCached$material3() {
        return this.defaultButtonColorsCached;
    }

    public final CardColors getDefaultCardColorsCached$material3() {
        return this.defaultCardColorsCached;
    }

    public final CheckboxColors getDefaultCheckboxColorsCached$material3() {
        return this.defaultCheckboxColorsCached;
    }

    public final DatePickerColors getDefaultDatePickerColorsCached$material3() {
        return this.defaultDatePickerColorsCached;
    }

    public final ChipColors getDefaultElevatedAssistChipColorsCached$material3() {
        return this.defaultElevatedAssistChipColorsCached;
    }

    public final ButtonColors getDefaultElevatedButtonColorsCached$material3() {
        return this.defaultElevatedButtonColorsCached;
    }

    public final CardColors getDefaultElevatedCardColorsCached$material3() {
        return this.defaultElevatedCardColorsCached;
    }

    public final SelectableChipColors getDefaultElevatedFilterChipColorsCached$material3() {
        return this.defaultElevatedFilterChipColorsCached;
    }

    public final ChipColors getDefaultElevatedSuggestionChipColorsCached$material3() {
        return this.defaultElevatedSuggestionChipColorsCached;
    }

    public final IconButtonColors getDefaultFilledIconButtonColorsCached$material3() {
        return this.defaultFilledIconButtonColorsCached;
    }

    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColorsCached$material3() {
        return this.defaultFilledIconToggleButtonColorsCached;
    }

    public final ButtonColors getDefaultFilledTonalButtonColorsCached$material3() {
        return this.defaultFilledTonalButtonColorsCached;
    }

    public final IconButtonColors getDefaultFilledTonalIconButtonColorsCached$material3() {
        return this.defaultFilledTonalIconButtonColorsCached;
    }

    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColorsCached$material3() {
        return this.defaultFilledTonalIconToggleButtonColorsCached;
    }

    public final SelectableChipColors getDefaultFilterChipColorsCached$material3() {
        return this.defaultFilterChipColorsCached;
    }

    public final IconButtonColors getDefaultIconButtonColorsCached$material3() {
        return this.defaultIconButtonColorsCached;
    }

    public final IconButtonColors getDefaultIconButtonVibrantColorsCached$material3() {
        return this.defaultIconButtonVibrantColorsCached;
    }

    public final IconToggleButtonColors getDefaultIconToggleButtonColorsCached$material3() {
        return this.defaultIconToggleButtonColorsCached;
    }

    public final IconToggleButtonColors getDefaultIconToggleButtonVibrantColorsCached$material3() {
        return this.defaultIconToggleButtonVibrantColorsCached;
    }

    public final SelectableChipColors getDefaultInputChipColorsCached$material3() {
        return this.defaultInputChipColorsCached;
    }

    public final ListItemColors getDefaultListItemColorsCached$material3() {
        return this.defaultListItemColorsCached;
    }

    public final MenuItemColors getDefaultMenuItemColorsCached$material3() {
        return this.defaultMenuItemColorsCached;
    }

    public final NavigationBarItemColors getDefaultNavigationBarItemColorsCached$material3() {
        return this.defaultNavigationBarItemColorsCached;
    }

    public final NavigationRailItemColors getDefaultNavigationRailItemColorsCached$material3() {
        return this.defaultNavigationRailItemColorsCached;
    }

    public final ButtonColors getDefaultOutlinedButtonColorsCached$material3() {
        return this.defaultOutlinedButtonColorsCached;
    }

    public final CardColors getDefaultOutlinedCardColorsCached$material3() {
        return this.defaultOutlinedCardColorsCached;
    }

    public final IconButtonColors getDefaultOutlinedIconButtonColorsCached$material3() {
        return this.defaultOutlinedIconButtonColorsCached;
    }

    public final IconButtonColors getDefaultOutlinedIconButtonVibrantColorsCached$material3() {
        return this.defaultOutlinedIconButtonVibrantColorsCached;
    }

    public final IconToggleButtonColors getDefaultOutlinedIconToggleButtonColorsCached$material3() {
        return this.defaultOutlinedIconToggleButtonColorsCached;
    }

    public final IconToggleButtonColors getDefaultOutlinedIconToggleButtonVibrantColorsCached$material3() {
        return this.defaultOutlinedIconToggleButtonVibrantColorsCached;
    }

    public final TextFieldColors getDefaultOutlinedTextFieldColorsCached$material3() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    public final RadioButtonColors getDefaultRadioButtonColorsCached$material3() {
        return this.defaultRadioButtonColorsCached;
    }

    public final RichTooltipColors getDefaultRichTooltipColorsCached$material3() {
        return this.defaultRichTooltipColorsCached;
    }

    public final SegmentedButtonColors getDefaultSegmentedButtonColorsCached$material3() {
        return this.defaultSegmentedButtonColorsCached;
    }

    public final NavigationItemColors getDefaultShortNavigationBarItemColorsCached$material3() {
        return this.defaultShortNavigationBarItemColorsCached;
    }

    public final SliderColors getDefaultSliderColorsCached$material3() {
        return this.defaultSliderColorsCached;
    }

    public final ChipColors getDefaultSuggestionChipColorsCached$material3() {
        return this.defaultSuggestionChipColorsCached;
    }

    public final SwitchColors getDefaultSwitchColorsCached$material3() {
        return this.defaultSwitchColorsCached;
    }

    public final ButtonColors getDefaultTextButtonColorsCached$material3() {
        return this.defaultTextButtonColorsCached;
    }

    public final TextFieldColors getDefaultTextFieldColorsCached$material3() {
        return this.defaultTextFieldColorsCached;
    }

    public final TimePickerColors getDefaultTimePickerColorsCached$material3() {
        return this.defaultTimePickerColorsCached;
    }

    public final TopAppBarColors getDefaultTopAppBarColorsCached$material3() {
        return this.defaultTopAppBarColorsCached;
    }

    public final DragHandleColors getDefaultVerticalDragHandleColorsCached$material3() {
        return this.defaultVerticalDragHandleColorsCached;
    }

    public final NavigationItemColors getDefaultWideNavigationRailItemColorsCached$material3() {
        return this.defaultWideNavigationRailItemColorsCached;
    }

    public final WideNavigationRailColors getDefaultWideWideNavigationRailColorsCached$material3() {
        return this.defaultWideWideNavigationRailColorsCached;
    }

    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m1748getError0d7_KjU() {
        return this.error;
    }

    /* renamed from: getErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m1749getErrorContainer0d7_KjU() {
        return this.errorContainer;
    }

    /* renamed from: getInverseOnSurface-0d7_KjU, reason: not valid java name */
    public final long m1750getInverseOnSurface0d7_KjU() {
        return this.inverseOnSurface;
    }

    /* renamed from: getInversePrimary-0d7_KjU, reason: not valid java name */
    public final long m1751getInversePrimary0d7_KjU() {
        return this.inversePrimary;
    }

    /* renamed from: getInverseSurface-0d7_KjU, reason: not valid java name */
    public final long m1752getInverseSurface0d7_KjU() {
        return this.inverseSurface;
    }

    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m1753getOnBackground0d7_KjU() {
        return this.onBackground;
    }

    /* renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m1754getOnError0d7_KjU() {
        return this.onError;
    }

    /* renamed from: getOnErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m1755getOnErrorContainer0d7_KjU() {
        return this.onErrorContainer;
    }

    /* renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m1756getOnPrimary0d7_KjU() {
        return this.onPrimary;
    }

    /* renamed from: getOnPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1757getOnPrimaryContainer0d7_KjU() {
        return this.onPrimaryContainer;
    }

    /* renamed from: getOnPrimaryFixed-0d7_KjU, reason: not valid java name */
    public final long m1758getOnPrimaryFixed0d7_KjU() {
        return this.onPrimaryFixed;
    }

    /* renamed from: getOnPrimaryFixedVariant-0d7_KjU, reason: not valid java name */
    public final long m1759getOnPrimaryFixedVariant0d7_KjU() {
        return this.onPrimaryFixedVariant;
    }

    /* renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m1760getOnSecondary0d7_KjU() {
        return this.onSecondary;
    }

    /* renamed from: getOnSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1761getOnSecondaryContainer0d7_KjU() {
        return this.onSecondaryContainer;
    }

    /* renamed from: getOnSecondaryFixed-0d7_KjU, reason: not valid java name */
    public final long m1762getOnSecondaryFixed0d7_KjU() {
        return this.onSecondaryFixed;
    }

    /* renamed from: getOnSecondaryFixedVariant-0d7_KjU, reason: not valid java name */
    public final long m1763getOnSecondaryFixedVariant0d7_KjU() {
        return this.onSecondaryFixedVariant;
    }

    /* renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m1764getOnSurface0d7_KjU() {
        return this.onSurface;
    }

    /* renamed from: getOnSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m1765getOnSurfaceVariant0d7_KjU() {
        return this.onSurfaceVariant;
    }

    /* renamed from: getOnTertiary-0d7_KjU, reason: not valid java name */
    public final long m1766getOnTertiary0d7_KjU() {
        return this.onTertiary;
    }

    /* renamed from: getOnTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1767getOnTertiaryContainer0d7_KjU() {
        return this.onTertiaryContainer;
    }

    /* renamed from: getOnTertiaryFixed-0d7_KjU, reason: not valid java name */
    public final long m1768getOnTertiaryFixed0d7_KjU() {
        return this.onTertiaryFixed;
    }

    /* renamed from: getOnTertiaryFixedVariant-0d7_KjU, reason: not valid java name */
    public final long m1769getOnTertiaryFixedVariant0d7_KjU() {
        return this.onTertiaryFixedVariant;
    }

    /* renamed from: getOutline-0d7_KjU, reason: not valid java name */
    public final long m1770getOutline0d7_KjU() {
        return this.outline;
    }

    /* renamed from: getOutlineVariant-0d7_KjU, reason: not valid java name */
    public final long m1771getOutlineVariant0d7_KjU() {
        return this.outlineVariant;
    }

    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m1772getPrimary0d7_KjU() {
        return this.primary;
    }

    /* renamed from: getPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1773getPrimaryContainer0d7_KjU() {
        return this.primaryContainer;
    }

    /* renamed from: getPrimaryFixed-0d7_KjU, reason: not valid java name */
    public final long m1774getPrimaryFixed0d7_KjU() {
        return this.primaryFixed;
    }

    /* renamed from: getPrimaryFixedDim-0d7_KjU, reason: not valid java name */
    public final long m1775getPrimaryFixedDim0d7_KjU() {
        return this.primaryFixedDim;
    }

    /* renamed from: getScrim-0d7_KjU, reason: not valid java name */
    public final long m1776getScrim0d7_KjU() {
        return this.scrim;
    }

    /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m1777getSecondary0d7_KjU() {
        return this.secondary;
    }

    /* renamed from: getSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1778getSecondaryContainer0d7_KjU() {
        return this.secondaryContainer;
    }

    /* renamed from: getSecondaryFixed-0d7_KjU, reason: not valid java name */
    public final long m1779getSecondaryFixed0d7_KjU() {
        return this.secondaryFixed;
    }

    /* renamed from: getSecondaryFixedDim-0d7_KjU, reason: not valid java name */
    public final long m1780getSecondaryFixedDim0d7_KjU() {
        return this.secondaryFixedDim;
    }

    /* renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m1781getSurface0d7_KjU() {
        return this.surface;
    }

    /* renamed from: getSurfaceBright-0d7_KjU, reason: not valid java name */
    public final long m1782getSurfaceBright0d7_KjU() {
        return this.surfaceBright;
    }

    /* renamed from: getSurfaceContainer-0d7_KjU, reason: not valid java name */
    public final long m1783getSurfaceContainer0d7_KjU() {
        return this.surfaceContainer;
    }

    /* renamed from: getSurfaceContainerHigh-0d7_KjU, reason: not valid java name */
    public final long m1784getSurfaceContainerHigh0d7_KjU() {
        return this.surfaceContainerHigh;
    }

    /* renamed from: getSurfaceContainerHighest-0d7_KjU, reason: not valid java name */
    public final long m1785getSurfaceContainerHighest0d7_KjU() {
        return this.surfaceContainerHighest;
    }

    /* renamed from: getSurfaceContainerLow-0d7_KjU, reason: not valid java name */
    public final long m1786getSurfaceContainerLow0d7_KjU() {
        return this.surfaceContainerLow;
    }

    /* renamed from: getSurfaceContainerLowest-0d7_KjU, reason: not valid java name */
    public final long m1787getSurfaceContainerLowest0d7_KjU() {
        return this.surfaceContainerLowest;
    }

    /* renamed from: getSurfaceDim-0d7_KjU, reason: not valid java name */
    public final long m1788getSurfaceDim0d7_KjU() {
        return this.surfaceDim;
    }

    /* renamed from: getSurfaceTint-0d7_KjU, reason: not valid java name */
    public final long m1789getSurfaceTint0d7_KjU() {
        return this.surfaceTint;
    }

    /* renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m1790getSurfaceVariant0d7_KjU() {
        return this.surfaceVariant;
    }

    /* renamed from: getTertiary-0d7_KjU, reason: not valid java name */
    public final long m1791getTertiary0d7_KjU() {
        return this.tertiary;
    }

    /* renamed from: getTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1792getTertiaryContainer0d7_KjU() {
        return this.tertiaryContainer;
    }

    /* renamed from: getTertiaryFixed-0d7_KjU, reason: not valid java name */
    public final long m1793getTertiaryFixed0d7_KjU() {
        return this.tertiaryFixed;
    }

    /* renamed from: getTertiaryFixedDim-0d7_KjU, reason: not valid java name */
    public final long m1794getTertiaryFixedDim0d7_KjU() {
        return this.tertiaryFixedDim;
    }

    public final void setDefaultAssistChipColorsCached$material3(ChipColors chipColors) {
        this.defaultAssistChipColorsCached = chipColors;
    }

    public final void setDefaultButtonColorsCached$material3(ButtonColors buttonColors) {
        this.defaultButtonColorsCached = buttonColors;
    }

    public final void setDefaultCardColorsCached$material3(CardColors cardColors) {
        this.defaultCardColorsCached = cardColors;
    }

    public final void setDefaultCheckboxColorsCached$material3(CheckboxColors checkboxColors) {
        this.defaultCheckboxColorsCached = checkboxColors;
    }

    public final void setDefaultDatePickerColorsCached$material3(DatePickerColors datePickerColors) {
        this.defaultDatePickerColorsCached = datePickerColors;
    }

    public final void setDefaultElevatedAssistChipColorsCached$material3(ChipColors chipColors) {
        this.defaultElevatedAssistChipColorsCached = chipColors;
    }

    public final void setDefaultElevatedButtonColorsCached$material3(ButtonColors buttonColors) {
        this.defaultElevatedButtonColorsCached = buttonColors;
    }

    public final void setDefaultElevatedCardColorsCached$material3(CardColors cardColors) {
        this.defaultElevatedCardColorsCached = cardColors;
    }

    public final void setDefaultElevatedFilterChipColorsCached$material3(SelectableChipColors selectableChipColors) {
        this.defaultElevatedFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultElevatedSuggestionChipColorsCached$material3(ChipColors chipColors) {
        this.defaultElevatedSuggestionChipColorsCached = chipColors;
    }

    public final void setDefaultFilledIconButtonColorsCached$material3(IconButtonColors iconButtonColors) {
        this.defaultFilledIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultFilledIconToggleButtonColorsCached$material3(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultFilledIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultFilledTonalButtonColorsCached$material3(ButtonColors buttonColors) {
        this.defaultFilledTonalButtonColorsCached = buttonColors;
    }

    public final void setDefaultFilledTonalIconButtonColorsCached$material3(IconButtonColors iconButtonColors) {
        this.defaultFilledTonalIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultFilledTonalIconToggleButtonColorsCached$material3(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultFilledTonalIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultFilterChipColorsCached$material3(SelectableChipColors selectableChipColors) {
        this.defaultFilterChipColorsCached = selectableChipColors;
    }

    public final void setDefaultIconButtonColorsCached$material3(IconButtonColors iconButtonColors) {
        this.defaultIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultIconButtonVibrantColorsCached$material3(IconButtonColors iconButtonColors) {
        this.defaultIconButtonVibrantColorsCached = iconButtonColors;
    }

    public final void setDefaultIconToggleButtonColorsCached$material3(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultIconToggleButtonVibrantColorsCached$material3(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultIconToggleButtonVibrantColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultInputChipColorsCached$material3(SelectableChipColors selectableChipColors) {
        this.defaultInputChipColorsCached = selectableChipColors;
    }

    public final void setDefaultListItemColorsCached$material3(ListItemColors listItemColors) {
        this.defaultListItemColorsCached = listItemColors;
    }

    public final void setDefaultMenuItemColorsCached$material3(MenuItemColors menuItemColors) {
        this.defaultMenuItemColorsCached = menuItemColors;
    }

    public final void setDefaultNavigationBarItemColorsCached$material3(NavigationBarItemColors navigationBarItemColors) {
        this.defaultNavigationBarItemColorsCached = navigationBarItemColors;
    }

    public final void setDefaultNavigationRailItemColorsCached$material3(NavigationRailItemColors navigationRailItemColors) {
        this.defaultNavigationRailItemColorsCached = navigationRailItemColors;
    }

    public final void setDefaultOutlinedButtonColorsCached$material3(ButtonColors buttonColors) {
        this.defaultOutlinedButtonColorsCached = buttonColors;
    }

    public final void setDefaultOutlinedCardColorsCached$material3(CardColors cardColors) {
        this.defaultOutlinedCardColorsCached = cardColors;
    }

    public final void setDefaultOutlinedIconButtonColorsCached$material3(IconButtonColors iconButtonColors) {
        this.defaultOutlinedIconButtonColorsCached = iconButtonColors;
    }

    public final void setDefaultOutlinedIconButtonVibrantColorsCached$material3(IconButtonColors iconButtonColors) {
        this.defaultOutlinedIconButtonVibrantColorsCached = iconButtonColors;
    }

    public final void setDefaultOutlinedIconToggleButtonColorsCached$material3(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultOutlinedIconToggleButtonColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultOutlinedIconToggleButtonVibrantColorsCached$material3(IconToggleButtonColors iconToggleButtonColors) {
        this.defaultOutlinedIconToggleButtonVibrantColorsCached = iconToggleButtonColors;
    }

    public final void setDefaultOutlinedTextFieldColorsCached$material3(TextFieldColors textFieldColors) {
        this.defaultOutlinedTextFieldColorsCached = textFieldColors;
    }

    public final void setDefaultRadioButtonColorsCached$material3(RadioButtonColors radioButtonColors) {
        this.defaultRadioButtonColorsCached = radioButtonColors;
    }

    public final void setDefaultRichTooltipColorsCached$material3(RichTooltipColors richTooltipColors) {
        this.defaultRichTooltipColorsCached = richTooltipColors;
    }

    public final void setDefaultSegmentedButtonColorsCached$material3(SegmentedButtonColors segmentedButtonColors) {
        this.defaultSegmentedButtonColorsCached = segmentedButtonColors;
    }

    public final void setDefaultShortNavigationBarItemColorsCached$material3(NavigationItemColors navigationItemColors) {
        this.defaultShortNavigationBarItemColorsCached = navigationItemColors;
    }

    public final void setDefaultSliderColorsCached$material3(SliderColors sliderColors) {
        this.defaultSliderColorsCached = sliderColors;
    }

    public final void setDefaultSuggestionChipColorsCached$material3(ChipColors chipColors) {
        this.defaultSuggestionChipColorsCached = chipColors;
    }

    public final void setDefaultSwitchColorsCached$material3(SwitchColors switchColors) {
        this.defaultSwitchColorsCached = switchColors;
    }

    public final void setDefaultTextButtonColorsCached$material3(ButtonColors buttonColors) {
        this.defaultTextButtonColorsCached = buttonColors;
    }

    public final void setDefaultTextFieldColorsCached$material3(TextFieldColors textFieldColors) {
        this.defaultTextFieldColorsCached = textFieldColors;
    }

    public final void setDefaultTimePickerColorsCached$material3(TimePickerColors timePickerColors) {
        this.defaultTimePickerColorsCached = timePickerColors;
    }

    public final void setDefaultTopAppBarColorsCached$material3(TopAppBarColors topAppBarColors) {
        this.defaultTopAppBarColorsCached = topAppBarColors;
    }

    public final void setDefaultVerticalDragHandleColorsCached$material3(DragHandleColors dragHandleColors) {
        this.defaultVerticalDragHandleColorsCached = dragHandleColors;
    }

    public final void setDefaultWideNavigationRailItemColorsCached$material3(NavigationItemColors navigationItemColors) {
        this.defaultWideNavigationRailItemColorsCached = navigationItemColors;
    }

    public final void setDefaultWideWideNavigationRailColorsCached$material3(WideNavigationRailColors wideNavigationRailColors) {
        this.defaultWideWideNavigationRailColorsCached = wideNavigationRailColors;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColorScheme(primary=");
        kp0.i(this.primary, sb, "onPrimary=");
        kp0.i(this.onPrimary, sb, "primaryContainer=");
        kp0.i(this.primaryContainer, sb, "onPrimaryContainer=");
        kp0.i(this.onPrimaryContainer, sb, "inversePrimary=");
        kp0.i(this.inversePrimary, sb, "secondary=");
        kp0.i(this.secondary, sb, "onSecondary=");
        kp0.i(this.onSecondary, sb, "secondaryContainer=");
        kp0.i(this.secondaryContainer, sb, "onSecondaryContainer=");
        kp0.i(this.onSecondaryContainer, sb, "tertiary=");
        kp0.i(this.tertiary, sb, "onTertiary=");
        kp0.i(this.onTertiary, sb, "tertiaryContainer=");
        kp0.i(this.tertiaryContainer, sb, "onTertiaryContainer=");
        kp0.i(this.onTertiaryContainer, sb, "background=");
        kp0.i(this.background, sb, "onBackground=");
        kp0.i(this.onBackground, sb, "surface=");
        kp0.i(this.surface, sb, "onSurface=");
        kp0.i(this.onSurface, sb, "surfaceVariant=");
        kp0.i(this.surfaceVariant, sb, "onSurfaceVariant=");
        kp0.i(this.onSurfaceVariant, sb, "surfaceTint=");
        kp0.i(this.surfaceTint, sb, "inverseSurface=");
        kp0.i(this.inverseSurface, sb, "inverseOnSurface=");
        kp0.i(this.inverseOnSurface, sb, "error=");
        kp0.i(this.error, sb, "onError=");
        kp0.i(this.onError, sb, "errorContainer=");
        kp0.i(this.errorContainer, sb, "onErrorContainer=");
        kp0.i(this.onErrorContainer, sb, "outline=");
        kp0.i(this.outline, sb, "outlineVariant=");
        kp0.i(this.outlineVariant, sb, "scrim=");
        kp0.i(this.scrim, sb, "surfaceBright=");
        kp0.i(this.surfaceBright, sb, "surfaceDim=");
        kp0.i(this.surfaceDim, sb, "surfaceContainer=");
        kp0.i(this.surfaceContainer, sb, "surfaceContainerHigh=");
        kp0.i(this.surfaceContainerHigh, sb, "surfaceContainerHighest=");
        kp0.i(this.surfaceContainerHighest, sb, "surfaceContainerLow=");
        kp0.i(this.surfaceContainerLow, sb, "surfaceContainerLowest=");
        kp0.i(this.surfaceContainerLowest, sb, "primaryFixed=");
        kp0.i(this.primaryFixed, sb, "primaryFixedDim=");
        kp0.i(this.primaryFixedDim, sb, "onPrimaryFixed=");
        kp0.i(this.onPrimaryContainer, sb, "onPrimaryFixedVariant=");
        kp0.i(this.onPrimaryFixedVariant, sb, "secondaryFixed=");
        kp0.i(this.secondaryFixed, sb, "secondaryFixedDim=");
        kp0.i(this.secondaryFixedDim, sb, "onSecondaryFixed=");
        kp0.i(this.onSecondaryFixed, sb, "onSecondaryFixedVariant=");
        kp0.i(this.onSecondaryFixedVariant, sb, "tertiaryFixed=");
        kp0.i(this.tertiaryFixed, sb, "tertiaryFixedDim=");
        kp0.i(this.tertiaryFixedDim, sb, "onTertiaryFixed=");
        kp0.i(this.onTertiaryFixed, sb, "onTertiaryFixedVariant=");
        sb.append((Object) Color.m4769toStringimpl(this.onTertiaryFixedVariant));
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ void getDefaultDatePickerColorsCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultRichTooltipColorsCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultTimePickerColorsCached$material3$annotations() {
    }

    public static /* synthetic */ void getDefaultTopAppBarColorsCached$material3$annotations() {
    }

    @er
    public /* synthetic */ ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36);
    }

    @er
    public /* synthetic */ ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29);
    }

    public /* synthetic */ ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, dq dqVar) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), null);
        Color.Companion companion = Color.Companion;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ColorScheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), r0.m4797getUnspecified0d7_KjU(), null);
        Color.Companion companion = Color.Companion;
    }
}
