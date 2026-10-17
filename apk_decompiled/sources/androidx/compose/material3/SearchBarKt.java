package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.internal.PredictiveBack;
import androidx.compose.material3.internal.PredictiveBackState;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import defpackage.d9;
import defpackage.dq;
import defpackage.er;
import defpackage.fc;
import defpackage.gc;
import defpackage.hm0;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.lm0;
import defpackage.mb0;
import defpackage.ml0;
import defpackage.my;
import defpackage.ny;
import defpackage.ou;
import defpackage.p01;
import defpackage.p50;
import defpackage.p9;
import defpackage.q10;
import defpackage.q6;
import defpackage.qk;
import defpackage.rg;
import defpackage.st;
import defpackage.un;
import defpackage.w01;
import defpackage.xl;
import defpackage.y80;
import defpackage.zl0;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SearchBarKt {
    private static final int AnimationDelayMillis = 100;
    private static final int AnimationEnterDurationMillis = 600;
    private static final CubicBezierEasing AnimationEnterEasing;
    private static final FiniteAnimationSpec<Float> AnimationEnterFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationEnterSizeSpec;
    private static final int AnimationExitDurationMillis = 350;
    private static final CubicBezierEasing AnimationExitEasing;
    private static final FiniteAnimationSpec<Float> AnimationExitFloatSpec;
    private static final FiniteAnimationSpec<IntSize> AnimationExitSizeSpec;
    private static final FiniteAnimationSpec<Float> AnimationPredictiveBackExitFloatSpec;
    private static final EnterTransition DockedEnterTransition;
    private static final ExitTransition DockedExitTransition;
    private static final float DockedExpandedTableMaxHeightScreenRatio = 0.6666667f;
    private static final float DockedExpandedTableMinHeight;
    private static final String LayoutIdInputField = "InputField";
    private static final String LayoutIdSearchContent = "Content";
    private static final String LayoutIdSurface = "Surface";
    private static final float SearchBarAsTopBarPadding;
    private static final float SearchBarCornerRadius;
    private static final float SearchBarIconOffsetX;
    private static final float SearchBarMaxWidth;
    private static final float SearchBarMinWidth;
    private static final float SearchBarPredictiveBackMaxOffsetXRatio = 0.05f;
    private static final float SearchBarPredictiveBackMaxOffsetY;
    private static final float SearchBarPredictiveBackMinMargin;
    private static final float SearchBarPredictiveBackMinScale = 0.9f;
    private static final float SearchBarVerticalPadding;
    private static final TextFieldColors UnspecifiedTextFieldColors;

    static {
        Color.Companion companion = Color.Companion;
        UnspecifiedTextFieldColors = new TextFieldColors(companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), new TextSelectionColors(companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), null), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), companion.m4797getUnspecified0d7_KjU(), null);
        SearchBarAsTopBarPadding = Dp.m7611constructorimpl(8.0f);
        SearchBarCornerRadius = Dp.m7611constructorimpl(SearchBarDefaults.INSTANCE.m2309getInputFieldHeightD9Ej5fM() / 2.0f);
        DockedExpandedTableMinHeight = Dp.m7611constructorimpl(240.0f);
        SearchBarMinWidth = Dp.m7611constructorimpl(360.0f);
        SearchBarMaxWidth = Dp.m7611constructorimpl(720.0f);
        SearchBarVerticalPadding = Dp.m7611constructorimpl(8.0f);
        SearchBarIconOffsetX = Dp.m7611constructorimpl(4.0f);
        SearchBarPredictiveBackMinMargin = Dp.m7611constructorimpl(8.0f);
        SearchBarPredictiveBackMaxOffsetY = Dp.m7611constructorimpl(24.0f);
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        AnimationEnterEasing = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        AnimationExitEasing = cubicBezierEasing;
        TweenSpec tween = AnimationSpecKt.tween(AnimationEnterDurationMillis, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterFloatSpec = tween;
        TweenSpec tween2 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitFloatSpec = tween2;
        AnimationPredictiveBackExitFloatSpec = AnimationSpecKt.tween$default(AnimationExitDurationMillis, 0, cubicBezierEasing, 2, null);
        TweenSpec tween3 = AnimationSpecKt.tween(AnimationEnterDurationMillis, 100, easingEmphasizedDecelerateCubicBezier);
        AnimationEnterSizeSpec = tween3;
        TweenSpec tween4 = AnimationSpecKt.tween(AnimationExitDurationMillis, 100, cubicBezierEasing);
        AnimationExitSizeSpec = tween4;
        DockedEnterTransition = EnterExitTransitionKt.fadeIn$default(tween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tween3, null, false, null, 14, null));
        DockedExitTransition = EnterExitTransitionKt.fadeOut$default(tween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tween4, null, false, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DetectClickFromInteractionSource(InteractionSource interactionSource, iy iyVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-652650823);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(interactionSource) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-652650823, i2, -1, "androidx.compose.material3.DetectClickFromInteractionSource (SearchBar.kt:2592)");
            }
            int i3 = i2 & 14;
            boolean z = (i3 == 4) | ((i2 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SearchBarKt$DetectClickFromInteractionSource$1$1(interactionSource, iyVar, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.LaunchedEffect(interactionSource, (my) rememberedValue, startRestartGroup, i3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(interactionSource, iyVar, i, 26));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DetectClickFromInteractionSource$lambda$73(InteractionSource interactionSource, iy iyVar, int i, Composer composer, int i2) {
        DetectClickFromInteractionSource(interactionSource, iyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ee  */
    /* renamed from: DockedSearchBar-EQC0FA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2316DockedSearchBarEQC0FA8(final my myVar, final boolean z, ky kyVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, final ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        int i4;
        float f3;
        int i5;
        float f4;
        int i6;
        Composer composer2;
        SearchBarColors searchBarColors2;
        Modifier modifier3;
        float f5;
        float f6;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        int i7;
        int i8;
        Composer composer3;
        int i9;
        SearchBarColors searchBarColors3;
        final SearchBarColors searchBarColors4;
        float f7;
        float f8;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-2008777812);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i11 = Fields.Clip;
                        i3 |= i11;
                    }
                } else {
                    shape2 = shape;
                }
                i11 = 8192;
                i3 |= i11;
            } else {
                shape2 = shape;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0 && startRestartGroup.changed(searchBarColors)) {
                    i10 = Fields.RenderEffect;
                    i3 |= i10;
                }
                i10 = 65536;
                i3 |= i10;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                f3 = f;
                i3 |= startRestartGroup.changed(f3) ? 1048576 : Fields.BlendMode;
                i5 = i2 & Fields.SpotShadowColor;
                if (i5 != 0) {
                    i3 |= 12582912;
                    f4 = f2;
                } else {
                    f4 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f4) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                }
                if ((i2 & Fields.RotationX) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i6 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i12 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        if ((i2 & 16) != 0) {
                            shape3 = SearchBarDefaults.INSTANCE.getDockedShape(startRestartGroup, 6);
                            i7 = i6 & (-57345);
                        } else {
                            shape3 = shape2;
                            i7 = i6;
                        }
                        if ((i2 & 32) != 0) {
                            i9 = 0;
                            i8 = i5;
                            searchBarColors3 = SearchBarDefaults.INSTANCE.m2306colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                            composer3 = startRestartGroup;
                            i7 &= -458753;
                        } else {
                            i8 = i5;
                            composer3 = startRestartGroup;
                            i9 = 0;
                            searchBarColors3 = searchBarColors;
                        }
                        float m2311getTonalElevationD9Ej5fM = i4 != 0 ? SearchBarDefaults.INSTANCE.m2311getTonalElevationD9Ej5fM() : f;
                        if (i8 != 0) {
                            f4 = SearchBarDefaults.INSTANCE.m2310getShadowElevationD9Ej5fM();
                        }
                        SearchBarColors searchBarColors5 = searchBarColors3;
                        shape2 = shape3;
                        searchBarColors4 = searchBarColors5;
                        f7 = f4;
                        f8 = m2311getTonalElevationD9Ej5fM;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        int i13 = (i2 & 16) != 0 ? i6 & (-57345) : i6;
                        if ((i2 & 32) != 0) {
                            i13 &= -458753;
                        }
                        i7 = i13;
                        f7 = f4;
                        f8 = f3;
                        searchBarColors4 = searchBarColors;
                        composer3 = startRestartGroup;
                        i9 = 0;
                    }
                    composer3.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2008777812, i7, -1, "androidx.compose.material3.DockedSearchBar (SearchBar.kt:657)");
                    }
                    long m2303getContainerColor0d7_KjU = searchBarColors4.m2303getContainerColor0d7_KjU();
                    int i14 = i7;
                    long m1797contentColorForek8zF_U = ColorSchemeKt.m1797contentColorForek8zF_U(searchBarColors4.m2303getContainerColor0d7_KjU(), composer3, i9);
                    SearchBarColors searchBarColors6 = searchBarColors4;
                    int i15 = i14 >> 6;
                    Composer composer4 = composer3;
                    Shape shape4 = shape2;
                    SurfaceKt.m2464SurfaceT9BRK9s(SizeKt.m812width3ABfNKs(ZIndexModifierKt.zIndex(modifier2, 1.0f), SearchBarMinWidth), shape4, m2303getContainerColor0d7_KjU, m1797contentColorForek8zF_U, f8, f7, null, ComposableLambdaKt.rememberComposableLambda(401953073, true, new my() { // from class: androidx.compose.material3.SearchBarKt$DockedSearchBar$1
                        public final void invoke(Composer composer5, int i16) {
                            EnterTransition enterTransition;
                            ExitTransition exitTransition;
                            if (!composer5.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(401953073, i16, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.kt:666)");
                            }
                            my myVar2 = my.this;
                            boolean z2 = z;
                            final SearchBarColors searchBarColors7 = searchBarColors4;
                            final ny nyVar2 = nyVar;
                            Modifier.Companion companion = Modifier.Companion;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer5, 0);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer5, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            iy constructor = companion2.getConstructor();
                            if (composer5.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor);
                            } else {
                                composer5.useNode();
                            }
                            Composer m3878constructorimpl = Updater.m3878constructorimpl(composer5);
                            my b = k4.b(companion2, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                            }
                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            myVar2.invoke(composer5, 0);
                            enterTransition = SearchBarKt.DockedEnterTransition;
                            exitTransition = SearchBarKt.DockedExitTransition;
                            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z2, (Modifier) null, enterTransition, exitTransition, (String) null, ComposableLambdaKt.rememberComposableLambda(-1224554113, true, new ny() { // from class: androidx.compose.material3.SearchBarKt$DockedSearchBar$1$1$1
                                public final void invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer6, int i17) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1224554113, i17, -1, "androidx.compose.material3.DockedSearchBar.<anonymous>.<anonymous>.<anonymous> (SearchBar.kt:674)");
                                    }
                                    float m7611constructorimpl = Dp.m7611constructorimpl(SearchBar_androidKt.getWindowContainerHeight(composer6, 0) * 0.6666667f);
                                    Dp m7609boximpl = Dp.m7609boximpl(SearchBarKt.getDockedExpandedTableMinHeight());
                                    Dp m7609boximpl2 = Dp.m7609boximpl(m7611constructorimpl);
                                    m7609boximpl.getClass();
                                    m7609boximpl2.getClass();
                                    if (m7609boximpl.compareTo(m7609boximpl2) > 0) {
                                        m7609boximpl = m7609boximpl2;
                                    }
                                    Modifier m794heightInVpY3zN4 = SizeKt.m794heightInVpY3zN4(Modifier.Companion, m7609boximpl.m7625unboximpl(), m7611constructorimpl);
                                    SearchBarColors searchBarColors8 = SearchBarColors.this;
                                    ny nyVar3 = nyVar2;
                                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer6, 0);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer6, m794heightInVpY3zN4);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                    iy constructor2 = companion3.getConstructor();
                                    if (composer6.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer6.startReusableNode();
                                    if (composer6.getInserting()) {
                                        composer6.createNode(constructor2);
                                    } else {
                                        composer6.useNode();
                                    }
                                    Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer6);
                                    my b2 = k4.b(companion3, m3878constructorimpl2, columnMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                                    if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                                    }
                                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                    DividerKt.m1934HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors8.m2304getDividerColor0d7_KjU(), composer6, 0, 3);
                                    nyVar3.invoke(columnScopeInstance2, composer6, 6);
                                    composer6.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.ny
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return w01.a;
                                }
                            }, composer5, 54), composer5, 1600518, 18);
                            composer5.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.my
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return w01.a;
                        }
                    }, composer3, 54), composer4, ((i14 >> 9) & 112) | 12582912 | (57344 & i15) | (i15 & 458752), 64);
                    shape2 = shape4;
                    composer2 = composer4;
                    boolean z2 = (i14 & 896) == 256;
                    Object rememberedValue = composer2.rememberedValue();
                    if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ou(kyVar, 5);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    BackHandler_androidKt.BackHandler(z, (iy) rememberedValue, composer2, (i14 >> 3) & 14, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    searchBarColors2 = searchBarColors6;
                    modifier3 = modifier2;
                    f6 = f8;
                    f5 = f7;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    searchBarColors2 = searchBarColors;
                    modifier3 = modifier2;
                    f5 = f4;
                    f6 = f;
                }
                Shape shape5 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new lm0(myVar, z, kyVar, modifier3, shape5, searchBarColors2, f6, f5, nyVar, i, i2));
                    return;
                }
                return;
            }
            f3 = f;
            i5 = i2 & Fields.SpotShadowColor;
            if (i5 != 0) {
            }
            if ((i2 & Fields.RotationX) != 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i6 & 1)) {
            }
            Shape shape52 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) == 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & Fields.SpotShadowColor;
        if (i5 != 0) {
        }
        if ((i2 & Fields.RotationX) != 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((38347923 & i3) != 38347922, i6 & 1)) {
        }
        Shape shape522 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @er
    /* renamed from: DockedSearchBar-eWTbjVg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2317DockedSearchBareWTbjVg(final String str, final ky kyVar, final ky kyVar2, final boolean z, final ky kyVar3, Modifier modifier, boolean z2, my myVar, my myVar2, my myVar3, Shape shape, SearchBarColors searchBarColors, float f, float f2, MutableInteractionSource mutableInteractionSource, final ny nyVar, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        ky kyVar4;
        int i5;
        int i6;
        final Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        my myVar4;
        int i9;
        my myVar5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        final Shape shape2;
        final SearchBarColors searchBarColors2;
        final float f3;
        final MutableInteractionSource mutableInteractionSource2;
        final my myVar6;
        final boolean z4;
        final my myVar7;
        Composer composer2;
        final my myVar8;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        int i20;
        Shape shape3;
        boolean z5;
        Composer composer3;
        int i21;
        SearchBarColors searchBarColors3;
        int i22;
        float m2311getTonalElevationD9Ej5fM;
        final MutableInteractionSource mutableInteractionSource3;
        final my myVar9;
        SearchBarColors searchBarColors4;
        float f5;
        Shape shape4;
        final my myVar10;
        Modifier modifier3;
        final my myVar11;
        final boolean z6;
        int i23;
        int i24;
        Composer startRestartGroup = composer.startRestartGroup(1929583712);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            kyVar4 = kyVar;
        } else {
            kyVar4 = kyVar;
            if ((i & 48) == 0) {
                i4 |= startRestartGroup.changedInstance(kyVar4) ? 32 : 16;
            }
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(kyVar2) ? Fields.RotationX : Fields.SpotShadowColor;
            i5 = i3 & 8;
            int i25 = Fields.RotationZ;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changedInstance(kyVar3) ? 16384 : 8192;
                    i6 = i3 & 32;
                    if (i6 == 0) {
                        i4 |= 196608;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        if ((i & 196608) == 0) {
                            i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
                        }
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                        z3 = z2;
                    } else {
                        z3 = z2;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(z3) ? 1048576 : Fields.BlendMode;
                        }
                    }
                    i8 = i3 & Fields.SpotShadowColor;
                    if (i8 == 0) {
                        i4 |= 12582912;
                        myVar4 = myVar;
                    } else {
                        myVar4 = myVar;
                        if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changedInstance(myVar4) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                    }
                    i9 = i3 & Fields.RotationX;
                    if (i9 == 0) {
                        i4 |= 100663296;
                        myVar5 = myVar2;
                    } else {
                        myVar5 = myVar2;
                        if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changedInstance(myVar5) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                    }
                    i10 = i3 & Fields.RotationY;
                    if (i10 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i11 = i10;
                        i4 |= startRestartGroup.changedInstance(myVar3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        if ((i2 & 6) == 0) {
                            if ((i3 & Fields.RotationZ) == 0 && startRestartGroup.changed(shape)) {
                                i24 = 4;
                                i12 = i2 | i24;
                            }
                            i24 = 2;
                            i12 = i2 | i24;
                        } else {
                            i12 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            if ((i3 & Fields.CameraDistance) == 0 && startRestartGroup.changed(searchBarColors)) {
                                i23 = 32;
                                i12 |= i23;
                            }
                            i23 = 16;
                            i12 |= i23;
                        }
                        int i26 = i12;
                        i13 = i3 & Fields.TransformOrigin;
                        if (i13 != 0) {
                            i14 = i26 | 384;
                        } else {
                            int i27 = i26;
                            if ((i2 & 384) == 0) {
                                i27 |= startRestartGroup.changed(f) ? Fields.RotationX : Fields.SpotShadowColor;
                            }
                            i14 = i27;
                        }
                        i15 = i3 & 8192;
                        if (i15 != 0) {
                            i16 = i14 | 3072;
                        } else {
                            int i28 = i14;
                            if ((i2 & 3072) == 0) {
                                if (startRestartGroup.changed(f2)) {
                                    i25 = 2048;
                                }
                                i16 = i28 | i25;
                            } else {
                                i16 = i28;
                            }
                        }
                        i17 = i3 & Fields.Clip;
                        if (i17 != 0) {
                            i18 = i16 | 24576;
                        } else {
                            i18 = i16;
                            if ((i2 & 24576) == 0) {
                                i18 |= startRestartGroup.changed(mutableInteractionSource) ? 16384 : 8192;
                                if ((i3 & Fields.CompositingStrategy) == 0) {
                                    i18 |= 196608;
                                } else if ((i2 & 196608) == 0) {
                                    i19 = i17;
                                    i18 |= startRestartGroup.changedInstance(nyVar) ? 131072 : 65536;
                                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 74899) != 74898, i4 & 1)) {
                                        startRestartGroup.startDefaults();
                                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                            Modifier modifier4 = i6 != 0 ? Modifier.Companion : modifier2;
                                            boolean z7 = i7 != 0 ? true : z3;
                                            my myVar12 = i8 != 0 ? null : myVar4;
                                            if (i9 != 0) {
                                                myVar5 = null;
                                            }
                                            my myVar13 = i11 != 0 ? null : myVar3;
                                            if ((i3 & Fields.RotationZ) != 0) {
                                                i20 = i18 & (-15);
                                                shape3 = SearchBarDefaults.INSTANCE.getDockedShape(startRestartGroup, 6);
                                            } else {
                                                i20 = i18;
                                                shape3 = shape;
                                            }
                                            if ((i3 & Fields.CameraDistance) != 0) {
                                                i21 = i4;
                                                composer3 = startRestartGroup;
                                                z5 = true;
                                                searchBarColors3 = SearchBarDefaults.INSTANCE.m2306colorsKlgxPg(0L, 0L, null, composer3, 3072, 7);
                                                i22 = i20 & (-113);
                                            } else {
                                                z5 = true;
                                                composer3 = startRestartGroup;
                                                i21 = i4;
                                                searchBarColors3 = searchBarColors;
                                                i22 = i20;
                                            }
                                            m2311getTonalElevationD9Ej5fM = i13 != 0 ? SearchBarDefaults.INSTANCE.m2311getTonalElevationD9Ej5fM() : f;
                                            float m2310getShadowElevationD9Ej5fM = i15 != 0 ? SearchBarDefaults.INSTANCE.m2310getShadowElevationD9Ej5fM() : f2;
                                            if (i19 != 0) {
                                                myVar9 = myVar5;
                                                searchBarColors4 = searchBarColors3;
                                                f5 = m2310getShadowElevationD9Ej5fM;
                                                shape4 = shape3;
                                                mutableInteractionSource3 = null;
                                            } else {
                                                mutableInteractionSource3 = mutableInteractionSource;
                                                myVar9 = myVar5;
                                                searchBarColors4 = searchBarColors3;
                                                f5 = m2310getShadowElevationD9Ej5fM;
                                                shape4 = shape3;
                                            }
                                            myVar10 = myVar13;
                                            modifier3 = modifier4;
                                            myVar11 = myVar12;
                                            z6 = z7;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i3 & Fields.RotationZ) != 0) {
                                                i18 &= -15;
                                            }
                                            if ((i3 & Fields.CameraDistance) != 0) {
                                                i18 &= -113;
                                            }
                                            myVar10 = myVar3;
                                            searchBarColors4 = searchBarColors;
                                            f5 = f2;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            myVar9 = myVar5;
                                            z5 = true;
                                            modifier3 = modifier2;
                                            z6 = z3;
                                            myVar11 = myVar4;
                                            composer3 = startRestartGroup;
                                            i22 = i18;
                                            shape4 = shape;
                                            m2311getTonalElevationD9Ej5fM = f;
                                            i21 = i4;
                                        }
                                        composer3.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1929583712, i21, i22, "androidx.compose.material3.DockedSearchBar (SearchBar.kt:2047)");
                                        }
                                        final ky kyVar5 = kyVar4;
                                        final SearchBarColors searchBarColors5 = searchBarColors4;
                                        int i29 = i21 >> 6;
                                        int i30 = i22 << 12;
                                        Composer composer4 = composer3;
                                        float f6 = m2311getTonalElevationD9Ej5fM;
                                        m2316DockedSearchBarEQC0FA8(ComposableLambdaKt.rememberComposableLambda(-1275782414, z5, new my() { // from class: androidx.compose.material3.SearchBarKt$DockedSearchBar$4
                                            public final void invoke(Composer composer5, int i31) {
                                                if (!composer5.shouldExecute((i31 & 3) != 2, i31 & 1)) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1275782414, i31, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.kt:2049)");
                                                }
                                                SearchBarDefaults.INSTANCE.InputField(str, kyVar5, kyVar2, z, kyVar3, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z6, myVar11, myVar9, myVar10, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource3, composer5, 196608, 384, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.my
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return w01.a;
                                            }
                                        }, composer3, 54), z, kyVar3, modifier3, shape4, searchBarColors4, f6, f5, nyVar, composer4, (i29 & 7168) | (i29 & 112) | 6 | (i29 & 896) | (57344 & i30) | (458752 & i30) | (3670016 & i30) | (i30 & 29360128) | ((i22 << 9) & 234881024), 0);
                                        SearchBarColors searchBarColors6 = searchBarColors4;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier2 = modifier3;
                                        f3 = f5;
                                        composer2 = composer4;
                                        searchBarColors2 = searchBarColors6;
                                        z4 = z6;
                                        myVar6 = myVar9;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        shape2 = shape4;
                                        f4 = f6;
                                        myVar7 = myVar11;
                                        myVar8 = myVar10;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        shape2 = shape;
                                        searchBarColors2 = searchBarColors;
                                        f3 = f2;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        myVar6 = myVar5;
                                        z4 = z3;
                                        myVar7 = myVar4;
                                        composer2 = startRestartGroup;
                                        myVar8 = myVar3;
                                        f4 = f;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new my() { // from class: gm0
                                            @Override // defpackage.my
                                            public final Object invoke(Object obj, Object obj2) {
                                                w01 DockedSearchBar_eWTbjVg$lambda$29;
                                                int intValue = ((Integer) obj2).intValue();
                                                DockedSearchBar_eWTbjVg$lambda$29 = SearchBarKt.DockedSearchBar_eWTbjVg$lambda$29(str, kyVar, kyVar2, z, kyVar3, modifier2, z4, myVar7, myVar6, myVar8, shape2, searchBarColors2, f4, f3, mutableInteractionSource2, nyVar, i, i2, i3, (Composer) obj, intValue);
                                                return DockedSearchBar_eWTbjVg$lambda$29;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i19 = i17;
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 74899) != 74898, i4 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                        }
                        if ((i3 & Fields.CompositingStrategy) == 0) {
                        }
                        i19 = i17;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 74899) != 74898, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i11 = i10;
                    if ((i2 & 6) == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    int i262 = i12;
                    i13 = i3 & Fields.TransformOrigin;
                    if (i13 != 0) {
                    }
                    i15 = i3 & 8192;
                    if (i15 != 0) {
                    }
                    i17 = i3 & Fields.Clip;
                    if (i17 != 0) {
                    }
                    if ((i3 & Fields.CompositingStrategy) == 0) {
                    }
                    i19 = i17;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 74899) != 74898, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i6 = i3 & 32;
                if (i6 == 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i3 & Fields.SpotShadowColor;
                if (i8 == 0) {
                }
                i9 = i3 & Fields.RotationX;
                if (i9 == 0) {
                }
                i10 = i3 & Fields.RotationY;
                if (i10 == 0) {
                }
                i11 = i10;
                if ((i2 & 6) == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i2622 = i12;
                i13 = i3 & Fields.TransformOrigin;
                if (i13 != 0) {
                }
                i15 = i3 & 8192;
                if (i15 != 0) {
                }
                i17 = i3 & Fields.Clip;
                if (i17 != 0) {
                }
                if ((i3 & Fields.CompositingStrategy) == 0) {
                }
                i19 = i17;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 74899) != 74898, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            if ((i3 & 16) != 0) {
            }
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i3 & Fields.SpotShadowColor;
            if (i8 == 0) {
            }
            i9 = i3 & Fields.RotationX;
            if (i9 == 0) {
            }
            i10 = i3 & Fields.RotationY;
            if (i10 == 0) {
            }
            i11 = i10;
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i26222 = i12;
            i13 = i3 & Fields.TransformOrigin;
            if (i13 != 0) {
            }
            i15 = i3 & 8192;
            if (i15 != 0) {
            }
            i17 = i3 & Fields.Clip;
            if (i17 != 0) {
            }
            if ((i3 & Fields.CompositingStrategy) == 0) {
            }
            i19 = i17;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 74899) != 74898, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        int i252 = Fields.RotationZ;
        if (i5 == 0) {
        }
        if ((i3 & 16) != 0) {
        }
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & Fields.SpotShadowColor;
        if (i8 == 0) {
        }
        i9 = i3 & Fields.RotationX;
        if (i9 == 0) {
        }
        i10 = i3 & Fields.RotationY;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i262222 = i12;
        i13 = i3 & Fields.TransformOrigin;
        if (i13 != 0) {
        }
        i15 = i3 & 8192;
        if (i15 != 0) {
        }
        i17 = i3 & Fields.Clip;
        if (i17 != 0) {
        }
        if ((i3 & Fields.CompositingStrategy) == 0) {
        }
        i19 = i17;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i18 & 74899) != 74898, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DockedSearchBarLayout-nbWgWpA, reason: not valid java name */
    public static final void m2318DockedSearchBarLayoutnbWgWpA(final SearchBarState searchBarState, final my myVar, Modifier modifier, final Shape shape, final SearchBarColors searchBarColors, final float f, final float f2, final ny nyVar, Composer composer, final int i) {
        int i2;
        Modifier modifier2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1402423467);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            modifier2 = modifier;
            i2 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            modifier2 = modifier;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(shape) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(searchBarColors) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if (startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1402423467, i2, -1, "androidx.compose.material3.DockedSearchBarLayout (SearchBar.kt:2323)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            un unVar = (un) rememberedValue;
            boolean isExpanded = isExpanded(searchBarState);
            boolean changedInstance = startRestartGroup.changedInstance(unVar) | ((i2 & 14) == 4);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new zl0(unVar, searchBarState, 1);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            BackHandler_androidKt.BackHandler(isExpanded, (iy) rememberedValue2, startRestartGroup, 0, 0);
            int i3 = i2 >> 3;
            composer2 = startRestartGroup;
            SurfaceKt.m2464SurfaceT9BRK9s(WindowInsetsPadding_androidKt.imePadding(modifier2), shape, searchBarColors.m2303getContainerColor0d7_KjU(), ColorSchemeKt.m1797contentColorForek8zF_U(searchBarColors.m2303getContainerColor0d7_KjU(), startRestartGroup, 0), f, f2, null, ComposableLambdaKt.rememberComposableLambda(-956905210, true, new my() { // from class: androidx.compose.material3.SearchBarKt$DockedSearchBarLayout$2
                public final void invoke(Composer composer3, int i4) {
                    if (!composer3.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-956905210, i4, -1, "androidx.compose.material3.DockedSearchBarLayout.<anonymous> (SearchBar.kt:2335)");
                    }
                    float m7611constructorimpl = Dp.m7611constructorimpl(SearchBar_androidKt.getWindowContainerHeight(composer3, 0) * 0.6666667f);
                    Dp m7609boximpl = Dp.m7609boximpl(SearchBarKt.getDockedExpandedTableMinHeight());
                    Dp m7609boximpl2 = Dp.m7609boximpl(m7611constructorimpl);
                    m7609boximpl.getClass();
                    m7609boximpl2.getClass();
                    if (m7609boximpl.compareTo(m7609boximpl2) > 0) {
                        m7609boximpl = m7609boximpl2;
                    }
                    float m7625unboximpl = m7609boximpl.m7625unboximpl();
                    my myVar2 = my.this;
                    final SearchBarColors searchBarColors2 = searchBarColors;
                    final ny nyVar2 = nyVar;
                    List E = y80.E(myVar2, ComposableLambdaKt.rememberComposableLambda(-1776541672, true, new my() { // from class: androidx.compose.material3.SearchBarKt$DockedSearchBarLayout$2.1
                        public final void invoke(Composer composer4, int i5) {
                            if (!composer4.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1776541672, i5, -1, "androidx.compose.material3.DockedSearchBarLayout.<anonymous>.<anonymous> (SearchBar.kt:2344)");
                            }
                            SearchBarColors searchBarColors3 = SearchBarColors.this;
                            ny nyVar3 = nyVar2;
                            Modifier.Companion companion2 = Modifier.Companion;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer4, 0);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, companion2);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                            iy constructor = companion3.getConstructor();
                            if (composer4.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer m3878constructorimpl = Updater.m3878constructorimpl(composer4);
                            my b = k4.b(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                            }
                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            DividerKt.m1934HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors3.m2304getDividerColor0d7_KjU(), composer4, 0, 3);
                            nyVar3.invoke(columnScopeInstance, composer4, 6);
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.my
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return w01.a;
                        }
                    }, composer3, 54));
                    boolean changed = composer3.changed(searchBarState) | composer3.changed(m7611constructorimpl) | composer3.changed(m7625unboximpl);
                    SearchBarState searchBarState2 = searchBarState;
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new SearchBarKt$DockedSearchBarLayout$2$2$1(searchBarState2, m7611constructorimpl, m7625unboximpl);
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue3;
                    Modifier.Companion companion2 = Modifier.Companion;
                    my combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(E);
                    boolean changed2 = composer3.changed(multiContentMeasurePolicy);
                    Object rememberedValue4 = composer3.rememberedValue();
                    if (changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        rememberedValue4 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                        composer3.updateRememberedValue(rememberedValue4);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue4;
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion2);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    iy constructor = companion3.getConstructor();
                    if (composer3.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer3);
                    my b = k4.b(companion3, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                    combineAsVirtualLayouts.invoke(composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), composer2, ((i2 >> 6) & 112) | 12582912 | (57344 & i3) | (i3 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            endRestartGroup.updateScope(new my() { // from class: jm0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 DockedSearchBarLayout_nbWgWpA$lambda$52;
                    int intValue = ((Integer) obj2).intValue();
                    DockedSearchBarLayout_nbWgWpA$lambda$52 = SearchBarKt.DockedSearchBarLayout_nbWgWpA$lambda$52(SearchBarState.this, myVar, modifier3, shape, searchBarColors, f, f2, nyVar, i, (Composer) obj, intValue);
                    return DockedSearchBarLayout_nbWgWpA$lambda$52;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DockedSearchBarLayout_nbWgWpA$lambda$51$lambda$50(un unVar, SearchBarState searchBarState) {
        p01.t(unVar, null, null, new SearchBarKt$DockedSearchBarLayout$1$1$1(searchBarState, null), 3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DockedSearchBarLayout_nbWgWpA$lambda$52(SearchBarState searchBarState, my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, ny nyVar, int i, Composer composer, int i2) {
        m2318DockedSearchBarLayoutnbWgWpA(searchBarState, myVar, modifier, shape, searchBarColors, f, f2, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DockedSearchBar_EQC0FA8$lambda$24$lambda$23(ky kyVar) {
        kyVar.invoke(Boolean.FALSE);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DockedSearchBar_EQC0FA8$lambda$25(my myVar, boolean z, ky kyVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2316DockedSearchBarEQC0FA8(myVar, z, kyVar, modifier, shape, searchBarColors, f, f2, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DockedSearchBar_eWTbjVg$lambda$29(String str, ky kyVar, ky kyVar2, boolean z, ky kyVar3, Modifier modifier, boolean z2, my myVar, my myVar2, my myVar3, Shape shape, SearchBarColors searchBarColors, float f, float f2, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, int i3, Composer composer, int i4) {
        m2317DockedSearchBareWTbjVg(str, kyVar, kyVar2, z, kyVar3, modifier, z2, myVar, myVar2, myVar3, shape, searchBarColors, f, f2, mutableInteractionSource, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: ExpandedDockedSearchBar-qKj4JfE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2319ExpandedDockedSearchBarqKj4JfE(final SearchBarState searchBarState, final my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, PopupProperties popupProperties, final ny nyVar, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i4;
        float f3;
        int i5;
        int i6;
        PopupProperties popupProperties2;
        ny nyVar2;
        final PopupProperties popupProperties3;
        Composer composer2;
        final Modifier modifier3;
        final Shape shape3;
        final SearchBarColors searchBarColors3;
        final float f4;
        final float f5;
        ScopeUpdateScope endRestartGroup;
        my myVar2;
        Composer composer3;
        boolean z;
        int i7;
        final SearchBarColors searchBarColors4;
        final PopupProperties popupProperties4;
        boolean z2;
        final Shape shape4;
        final float f6;
        int i8;
        final Modifier modifier4;
        final float f7;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1121062437);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i10 = Fields.CameraDistance;
                        i3 |= i10;
                    }
                } else {
                    shape2 = shape;
                }
                i10 = Fields.RotationZ;
                i3 |= i10;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i9 = Fields.Clip;
                        i3 |= i9;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i9 = 8192;
                i3 |= i9;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                f3 = f;
                i3 |= startRestartGroup.changed(f3) ? Fields.RenderEffect : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    i3 |= startRestartGroup.changed(f2) ? 1048576 : Fields.BlendMode;
                    i6 = i2 & Fields.SpotShadowColor;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((12582912 & i) == 0) {
                        popupProperties2 = popupProperties;
                        i3 |= startRestartGroup.changed(popupProperties2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        if ((i2 & Fields.RotationX) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            nyVar2 = nyVar;
                            i3 |= startRestartGroup.changedInstance(nyVar2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                popupProperties3 = popupProperties;
                                composer2 = startRestartGroup;
                                modifier3 = modifier2;
                                shape3 = shape2;
                                searchBarColors3 = searchBarColors2;
                                f4 = f;
                                f5 = f2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i11 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                        shape2 = SearchBarDefaults.INSTANCE.getDockedShape(startRestartGroup, 6);
                                    }
                                    if ((i2 & 16) != 0) {
                                        z = true;
                                        i7 = i6;
                                        searchBarColors4 = SearchBarDefaults.INSTANCE.m2306colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                                        composer3 = startRestartGroup;
                                        i3 = (-57345) & i3;
                                    } else {
                                        composer3 = startRestartGroup;
                                        z = true;
                                        i7 = i6;
                                        searchBarColors4 = searchBarColors2;
                                    }
                                    float m2311getTonalElevationD9Ej5fM = i4 != 0 ? SearchBarDefaults.INSTANCE.m2311getTonalElevationD9Ej5fM() : f;
                                    float m2310getShadowElevationD9Ej5fM = i5 != 0 ? SearchBarDefaults.INSTANCE.m2310getShadowElevationD9Ej5fM() : f2;
                                    if (i7 != 0) {
                                        z2 = z;
                                        shape4 = shape2;
                                        f6 = m2310getShadowElevationD9Ej5fM;
                                        popupProperties4 = new PopupProperties(true, false, false, false, 6, (dq) null);
                                    } else {
                                        popupProperties4 = popupProperties;
                                        z2 = z;
                                        shape4 = shape2;
                                        f6 = m2310getShadowElevationD9Ej5fM;
                                    }
                                    i8 = i3;
                                    modifier4 = modifier2;
                                    f7 = m2311getTonalElevationD9Ej5fM;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 8) != 0) {
                                        i3 &= -7169;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    SearchBarColors searchBarColors5 = searchBarColors2;
                                    i8 = i3;
                                    modifier4 = modifier2;
                                    f7 = f3;
                                    composer3 = startRestartGroup;
                                    searchBarColors4 = searchBarColors5;
                                    shape4 = shape2;
                                    z2 = true;
                                    popupProperties4 = popupProperties2;
                                    f6 = f2;
                                }
                                composer3.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1121062437, i8, -1, "androidx.compose.material3.ExpandedDockedSearchBar (SearchBar.kt:435)");
                                }
                                if (!isExpanded(searchBarState)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    endRestartGroup = composer3.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        final int i12 = 0;
                                        final ny nyVar3 = nyVar2;
                                        final Modifier modifier5 = modifier4;
                                        myVar2 = new my() { // from class: nm0
                                            @Override // defpackage.my
                                            public final Object invoke(Object obj, Object obj2) {
                                                w01 ExpandedDockedSearchBar_qKj4JfE$lambda$10;
                                                w01 ExpandedDockedSearchBar_qKj4JfE$lambda$14;
                                                switch (i12) {
                                                    case 0:
                                                        int intValue = ((Integer) obj2).intValue();
                                                        ExpandedDockedSearchBar_qKj4JfE$lambda$10 = SearchBarKt.ExpandedDockedSearchBar_qKj4JfE$lambda$10(searchBarState, myVar, modifier5, shape4, searchBarColors4, f7, f6, popupProperties4, nyVar3, i, i2, (Composer) obj, intValue);
                                                        return ExpandedDockedSearchBar_qKj4JfE$lambda$10;
                                                    default:
                                                        int intValue2 = ((Integer) obj2).intValue();
                                                        ExpandedDockedSearchBar_qKj4JfE$lambda$14 = SearchBarKt.ExpandedDockedSearchBar_qKj4JfE$lambda$14(searchBarState, myVar, modifier5, shape4, searchBarColors4, f7, f6, popupProperties4, nyVar3, i, i2, (Composer) obj, intValue2);
                                                        return ExpandedDockedSearchBar_qKj4JfE$lambda$14;
                                                }
                                            }
                                        };
                                        endRestartGroup.updateScope(myVar2);
                                        return;
                                    }
                                    return;
                                }
                                PopupProperties popupProperties5 = popupProperties4;
                                int i13 = i8 & 14;
                                boolean z3 = i13 == 4 ? z2 : false;
                                Object rememberedValue = composer3.rememberedValue();
                                if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.SearchBarKt$ExpandedDockedSearchBar$positionProvider$1$1
                                        @Override // androidx.compose.ui.window.PopupPositionProvider
                                        /* renamed from: calculatePosition-llwVHH4 */
                                        public long mo336calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
                                            IntRect collapsedBounds;
                                            collapsedBounds = SearchBarKt.getCollapsedBounds(SearchBarState.this);
                                            return collapsedBounds.m7768getTopLeftnOccac();
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue);
                                }
                                SearchBarKt$ExpandedDockedSearchBar$positionProvider$1$1 searchBarKt$ExpandedDockedSearchBar$positionProvider$1$1 = (SearchBarKt$ExpandedDockedSearchBar$positionProvider$1$1) rememberedValue;
                                Object rememberedValue2 = composer3.rememberedValue();
                                Composer.Companion companion = Composer.Companion;
                                if (rememberedValue2 == companion.getEmpty()) {
                                    rememberedValue2 = EffectsKt.createCompositionCoroutineScope(st.d, composer3);
                                    composer3.updateRememberedValue(rememberedValue2);
                                }
                                un unVar = (un) rememberedValue2;
                                boolean changedInstance = composer3.changedInstance(unVar) | (i13 == 4 ? z2 : false);
                                Object rememberedValue3 = composer3.rememberedValue();
                                if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                                    rememberedValue3 = new zl0(unVar, searchBarState, 3);
                                    composer3.updateRememberedValue(rememberedValue3);
                                }
                                final Shape shape5 = shape4;
                                final SearchBarColors searchBarColors6 = searchBarColors4;
                                final float f8 = f7;
                                final float f9 = f6;
                                Modifier modifier6 = modifier4;
                                Composer composer4 = composer3;
                                AndroidPopup_androidKt.Popup(searchBarKt$ExpandedDockedSearchBar$positionProvider$1$1, (iy) rememberedValue3, popupProperties5, ComposableLambdaKt.rememberComposableLambda(-363177991, z2, new my() { // from class: androidx.compose.material3.SearchBarKt$ExpandedDockedSearchBar$3
                                    public final void invoke(Composer composer5, int i14) {
                                        if (!composer5.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-363177991, i14, -1, "androidx.compose.material3.ExpandedDockedSearchBar.<anonymous> (SearchBar.kt:457)");
                                        }
                                        Object rememberedValue4 = composer5.rememberedValue();
                                        Composer.Companion companion2 = Composer.Companion;
                                        if (rememberedValue4 == companion2.getEmpty()) {
                                            rememberedValue4 = new FocusRequester();
                                            composer5.updateRememberedValue(rememberedValue4);
                                        }
                                        final FocusRequester focusRequester = (FocusRequester) rememberedValue4;
                                        SearchBarState searchBarState2 = SearchBarState.this;
                                        final my myVar3 = myVar;
                                        SearchBarKt.m2318DockedSearchBarLayoutnbWgWpA(searchBarState2, ComposableLambdaKt.rememberComposableLambda(2123999554, true, new my() { // from class: androidx.compose.material3.SearchBarKt$ExpandedDockedSearchBar$3.1
                                            public final void invoke(Composer composer6, int i15) {
                                                if (!composer6.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(2123999554, i15, -1, "androidx.compose.material3.ExpandedDockedSearchBar.<anonymous>.<anonymous> (SearchBar.kt:462)");
                                                }
                                                Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(Modifier.Companion, FocusRequester.this);
                                                my myVar4 = myVar3;
                                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer6, focusRequester2);
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                                iy constructor = companion3.getConstructor();
                                                if (composer6.getApplier() == null) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer6.startReusableNode();
                                                if (composer6.getInserting()) {
                                                    composer6.createNode(constructor);
                                                } else {
                                                    composer6.useNode();
                                                }
                                                Composer m3878constructorimpl = Updater.m3878constructorimpl(composer6);
                                                my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                }
                                                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                if (fc.l(myVar4, composer6, 0)) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.my
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return w01.a;
                                            }
                                        }, composer5, 54), modifier4, shape5, searchBarColors6, f8, f9, nyVar, composer5, 48);
                                        Object rememberedValue5 = composer5.rememberedValue();
                                        if (rememberedValue5 == companion2.getEmpty()) {
                                            rememberedValue5 = new SearchBarKt$ExpandedDockedSearchBar$3$2$1(focusRequester, null);
                                            composer5.updateRememberedValue(rememberedValue5);
                                        }
                                        EffectsKt.LaunchedEffect(w01.a, (my) rememberedValue5, composer5, 6);
                                        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer5.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                                        SearchBarValue targetValue = SearchBarState.this.getTargetValue();
                                        boolean changed = composer5.changed(SearchBarState.this) | composer5.changed(softwareKeyboardController);
                                        SearchBarState searchBarState3 = SearchBarState.this;
                                        Object rememberedValue6 = composer5.rememberedValue();
                                        if (changed || rememberedValue6 == companion2.getEmpty()) {
                                            rememberedValue6 = new SearchBarKt$ExpandedDockedSearchBar$3$3$1(searchBarState3, softwareKeyboardController, null);
                                            composer5.updateRememberedValue(rememberedValue6);
                                        }
                                        EffectsKt.LaunchedEffect(targetValue, (my) rememberedValue6, composer5, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, composer3, 54), composer4, ((i8 >> 15) & 896) | 3072, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier6;
                                composer2 = composer4;
                                shape3 = shape5;
                                searchBarColors3 = searchBarColors6;
                                popupProperties3 = popupProperties5;
                                f4 = f8;
                                f5 = f9;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                final int i14 = 1;
                                myVar2 = new my() { // from class: nm0
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 ExpandedDockedSearchBar_qKj4JfE$lambda$10;
                                        w01 ExpandedDockedSearchBar_qKj4JfE$lambda$14;
                                        switch (i14) {
                                            case 0:
                                                int intValue = ((Integer) obj2).intValue();
                                                ExpandedDockedSearchBar_qKj4JfE$lambda$10 = SearchBarKt.ExpandedDockedSearchBar_qKj4JfE$lambda$10(searchBarState, myVar, modifier3, shape3, searchBarColors3, f4, f5, popupProperties3, nyVar, i, i2, (Composer) obj, intValue);
                                                return ExpandedDockedSearchBar_qKj4JfE$lambda$10;
                                            default:
                                                int intValue2 = ((Integer) obj2).intValue();
                                                ExpandedDockedSearchBar_qKj4JfE$lambda$14 = SearchBarKt.ExpandedDockedSearchBar_qKj4JfE$lambda$14(searchBarState, myVar, modifier3, shape3, searchBarColors3, f4, f5, popupProperties3, nyVar, i, i2, (Composer) obj, intValue2);
                                                return ExpandedDockedSearchBar_qKj4JfE$lambda$14;
                                        }
                                    }
                                };
                                endRestartGroup.updateScope(myVar2);
                                return;
                            }
                            return;
                        }
                        nyVar2 = nyVar;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    popupProperties2 = popupProperties;
                    if ((i2 & Fields.RotationX) != 0) {
                    }
                    nyVar2 = nyVar;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i6 = i2 & Fields.SpotShadowColor;
                if (i6 == 0) {
                }
                popupProperties2 = popupProperties;
                if ((i2 & Fields.RotationX) != 0) {
                }
                nyVar2 = nyVar;
                if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & Fields.SpotShadowColor;
            if (i6 == 0) {
            }
            popupProperties2 = popupProperties;
            if ((i2 & Fields.RotationX) != 0) {
            }
            nyVar2 = nyVar;
            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & Fields.SpotShadowColor;
        if (i6 == 0) {
        }
        popupProperties2 = popupProperties;
        if ((i2 & Fields.RotationX) != 0) {
        }
        nyVar2 = nyVar;
        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExpandedDockedSearchBar_qKj4JfE$lambda$10(SearchBarState searchBarState, my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, PopupProperties popupProperties, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2319ExpandedDockedSearchBarqKj4JfE(searchBarState, myVar, modifier, shape, searchBarColors, f, f2, popupProperties, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExpandedDockedSearchBar_qKj4JfE$lambda$13$lambda$12(un unVar, SearchBarState searchBarState) {
        p01.t(unVar, null, null, new SearchBarKt$ExpandedDockedSearchBar$2$1$1(searchBarState, null), 3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExpandedDockedSearchBar_qKj4JfE$lambda$14(SearchBarState searchBarState, my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, PopupProperties popupProperties, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2319ExpandedDockedSearchBarqKj4JfE(searchBarState, myVar, modifier, shape, searchBarColors, f, f2, popupProperties, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* renamed from: ExpandedFullScreenSearchBar-_UtchM0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2320ExpandedFullScreenSearchBar_UtchM0(final SearchBarState searchBarState, final my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, my myVar2, DialogProperties dialogProperties, final ny nyVar, Composer composer, final int i, final int i2) {
        int i3;
        my myVar3;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i4;
        float f3;
        int i5;
        float f4;
        my myVar4;
        int i6;
        DialogProperties dialogProperties2;
        final float f5;
        final Modifier modifier3;
        final Shape shape3;
        final SearchBarColors searchBarColors3;
        Composer composer2;
        final DialogProperties dialogProperties3;
        final float f6;
        final my myVar5;
        ScopeUpdateScope endRestartGroup;
        my myVar6;
        Shape shape4;
        boolean z;
        Composer composer3;
        my myVar7;
        final float f7;
        final my myVar8;
        final SearchBarColors searchBarColors4;
        final DialogProperties dialogProperties4;
        final Shape shape5;
        int i7;
        final Modifier modifier4;
        final float f8;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-909632031);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            myVar3 = myVar;
        } else {
            myVar3 = myVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(myVar3) ? 32 : 16;
            }
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i10 = Fields.CameraDistance;
                        i3 |= i10;
                    }
                } else {
                    shape2 = shape;
                }
                i10 = Fields.RotationZ;
                i3 |= i10;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i9 = Fields.Clip;
                        i3 |= i9;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i9 = 8192;
                i3 |= i9;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                f3 = f;
                i3 |= startRestartGroup.changed(f3) ? Fields.RenderEffect : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    f4 = f2;
                    i3 |= startRestartGroup.changed(f4) ? 1048576 : Fields.BlendMode;
                    if ((12582912 & i) != 0) {
                        if ((i2 & Fields.SpotShadowColor) == 0) {
                            myVar4 = myVar2;
                            if (startRestartGroup.changedInstance(myVar4)) {
                                i8 = GroupFlagsKt.IsNodeFlag;
                                i3 |= i8;
                            }
                        } else {
                            myVar4 = myVar2;
                        }
                        i8 = 4194304;
                        i3 |= i8;
                    } else {
                        myVar4 = myVar2;
                    }
                    i6 = i2 & Fields.RotationX;
                    if (i6 == 0) {
                        i3 |= 100663296;
                        dialogProperties2 = dialogProperties;
                    } else {
                        dialogProperties2 = dialogProperties;
                        if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changed(dialogProperties2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                    }
                    if ((i2 & Fields.RotationY) == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i11 != 0 ? Modifier.Companion : modifier2;
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape4 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                                } else {
                                    shape4 = shape2;
                                }
                                int i12 = i3;
                                if ((i2 & 16) != 0) {
                                    z = true;
                                    composer3 = startRestartGroup;
                                    i12 &= -57345;
                                    searchBarColors2 = SearchBarDefaults.INSTANCE.m2306colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                                } else {
                                    z = true;
                                    composer3 = startRestartGroup;
                                }
                                float m2311getTonalElevationD9Ej5fM = i4 != 0 ? SearchBarDefaults.INSTANCE.m2311getTonalElevationD9Ej5fM() : f;
                                float m2310getShadowElevationD9Ej5fM = i5 != 0 ? SearchBarDefaults.INSTANCE.m2310getShadowElevationD9Ej5fM() : f2;
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    myVar7 = new my() { // from class: androidx.compose.material3.SearchBarKt$ExpandedFullScreenSearchBar$1
                                        public final WindowInsets invoke(Composer composer4, int i13) {
                                            composer4.startReplaceGroup(-2028768625);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2028768625, i13, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous> (SearchBar.kt:350)");
                                            }
                                            WindowInsets fullScreenWindowInsets = SearchBarDefaults.INSTANCE.getFullScreenWindowInsets(composer4, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            composer4.endReplaceGroup();
                                            return fullScreenWindowInsets;
                                        }

                                        @Override // defpackage.my
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            return invoke((Composer) obj, ((Number) obj2).intValue());
                                        }
                                    };
                                    i12 &= -29360129;
                                } else {
                                    myVar7 = myVar2;
                                }
                                if (i6 != 0) {
                                    dialogProperties4 = new DialogProperties(false, false, false, 7, (dq) null);
                                    f7 = m2310getShadowElevationD9Ej5fM;
                                    myVar8 = myVar7;
                                    searchBarColors4 = searchBarColors2;
                                } else {
                                    f7 = m2310getShadowElevationD9Ej5fM;
                                    myVar8 = myVar7;
                                    searchBarColors4 = searchBarColors2;
                                    dialogProperties4 = dialogProperties2;
                                }
                                shape5 = shape4;
                                i7 = i12;
                                modifier4 = modifier5;
                                f8 = m2311getTonalElevationD9Ej5fM;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    i3 &= -29360129;
                                }
                                i7 = i3;
                                z = true;
                                modifier4 = modifier2;
                                shape5 = shape2;
                                searchBarColors4 = searchBarColors2;
                                f8 = f3;
                                myVar8 = myVar4;
                                composer3 = startRestartGroup;
                                f7 = f4;
                                dialogProperties4 = dialogProperties2;
                            }
                            composer3.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-909632031, i7, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar (SearchBar.kt:353)");
                            }
                            if (!isExpanded(searchBarState)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                endRestartGroup = composer3.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final int i13 = 0;
                                    final my myVar9 = myVar3;
                                    myVar6 = new my() { // from class: km0
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 ExpandedFullScreenSearchBar__UtchM0$lambda$6;
                                            w01 ExpandedFullScreenSearchBar__UtchM0$lambda$9;
                                            switch (i13) {
                                                case 0:
                                                    int intValue = ((Integer) obj2).intValue();
                                                    ExpandedFullScreenSearchBar__UtchM0$lambda$6 = SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$6(searchBarState, myVar9, modifier4, shape5, searchBarColors4, f8, f7, myVar8, dialogProperties4, nyVar, i, i2, (Composer) obj, intValue);
                                                    return ExpandedFullScreenSearchBar__UtchM0$lambda$6;
                                                default:
                                                    int intValue2 = ((Integer) obj2).intValue();
                                                    ExpandedFullScreenSearchBar__UtchM0$lambda$9 = SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$9(searchBarState, myVar9, modifier4, shape5, searchBarColors4, f8, f7, myVar8, dialogProperties4, nyVar, i, i2, (Composer) obj, intValue2);
                                                    return ExpandedFullScreenSearchBar__UtchM0$lambda$9;
                                            }
                                        }
                                    };
                                    endRestartGroup.updateScope(myVar6);
                                    return;
                                }
                                return;
                            }
                            DialogProperties dialogProperties5 = dialogProperties4;
                            Object rememberedValue = composer3.rememberedValue();
                            Composer.Companion companion = Composer.Companion;
                            if (rememberedValue == companion.getEmpty()) {
                                rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, composer3);
                                composer3.updateRememberedValue(rememberedValue);
                            }
                            un unVar = (un) rememberedValue;
                            boolean changedInstance = composer3.changedInstance(unVar) | ((i7 & 14) == 4 ? z : false);
                            Object rememberedValue2 = composer3.rememberedValue();
                            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                                rememberedValue2 = new zl0(unVar, searchBarState, 2);
                                composer3.updateRememberedValue(rememberedValue2);
                            }
                            final Modifier modifier6 = modifier4;
                            final Shape shape6 = shape5;
                            final SearchBarColors searchBarColors5 = searchBarColors4;
                            final float f9 = f8;
                            final float f10 = f7;
                            final my myVar10 = myVar8;
                            Composer composer4 = composer3;
                            BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog((iy) rememberedValue2, null, dialogProperties5, false, false, ComposableLambdaKt.rememberComposableLambda(625093617, z, new ny() { // from class: androidx.compose.material3.SearchBarKt$ExpandedFullScreenSearchBar$4
                                public final void invoke(PredictiveBackState predictiveBackState, Composer composer5, int i14) {
                                    int i15;
                                    if ((i14 & 6) == 0) {
                                        i15 = i14 | ((i14 & 8) == 0 ? composer5.changed(predictiveBackState) : composer5.changedInstance(predictiveBackState) ? 4 : 2);
                                    } else {
                                        i15 = i14;
                                    }
                                    if (!composer5.shouldExecute((i15 & 19) != 18, i15 & 1)) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(625093617, i15, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous> (SearchBar.kt:362)");
                                    }
                                    Object rememberedValue3 = composer5.rememberedValue();
                                    Composer.Companion companion2 = Composer.Companion;
                                    if (rememberedValue3 == companion2.getEmpty()) {
                                        rememberedValue3 = new FocusRequester();
                                        composer5.updateRememberedValue(rememberedValue3);
                                    }
                                    final FocusRequester focusRequester = (FocusRequester) rememberedValue3;
                                    int i16 = i15;
                                    SearchBarState searchBarState2 = SearchBarState.this;
                                    final my myVar11 = myVar;
                                    SearchBarKt.m2321FullScreenSearchBarLayoutEQC0FA8(searchBarState2, predictiveBackState, ComposableLambdaKt.rememberComposableLambda(-2142632188, true, new my() { // from class: androidx.compose.material3.SearchBarKt$ExpandedFullScreenSearchBar$4.1
                                        public final void invoke(Composer composer6, int i17) {
                                            if (!composer6.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                                composer6.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2142632188, i17, -1, "androidx.compose.material3.ExpandedFullScreenSearchBar.<anonymous>.<anonymous> (SearchBar.kt:367)");
                                            }
                                            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(Modifier.Companion, FocusRequester.this);
                                            my myVar12 = myVar11;
                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer6, focusRequester2);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                            iy constructor = companion3.getConstructor();
                                            if (composer6.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer6.startReusableNode();
                                            if (composer6.getInserting()) {
                                                composer6.createNode(constructor);
                                            } else {
                                                composer6.useNode();
                                            }
                                            Composer m3878constructorimpl = Updater.m3878constructorimpl(composer6);
                                            my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                            }
                                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            if (fc.l(myVar12, composer6, 0)) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.my
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                            return w01.a;
                                        }
                                    }, composer5, 54), modifier6, shape6, searchBarColors5, f9, f10, (WindowInsets) myVar10.invoke(composer5, 0), nyVar, composer5, ((i16 << 3) & 112) | 384);
                                    Object rememberedValue4 = composer5.rememberedValue();
                                    if (rememberedValue4 == companion2.getEmpty()) {
                                        rememberedValue4 = new SearchBarKt$ExpandedFullScreenSearchBar$4$2$1(focusRequester, null);
                                        composer5.updateRememberedValue(rememberedValue4);
                                    }
                                    EffectsKt.LaunchedEffect(w01.a, (my) rememberedValue4, composer5, 6);
                                    SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composer5.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                                    SearchBarValue targetValue = SearchBarState.this.getTargetValue();
                                    boolean changed = composer5.changed(SearchBarState.this) | composer5.changed(softwareKeyboardController);
                                    SearchBarState searchBarState3 = SearchBarState.this;
                                    Object rememberedValue5 = composer5.rememberedValue();
                                    if (changed || rememberedValue5 == companion2.getEmpty()) {
                                        rememberedValue5 = new SearchBarKt$ExpandedFullScreenSearchBar$4$3$1(searchBarState3, softwareKeyboardController, null);
                                        composer5.updateRememberedValue(rememberedValue5);
                                    }
                                    EffectsKt.LaunchedEffect(targetValue, (my) rememberedValue5, composer5, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.ny
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                    invoke((PredictiveBackState) obj, (Composer) obj2, ((Number) obj3).intValue());
                                    return w01.a;
                                }
                            }, composer3, 54), composer4, ((i7 >> 18) & 896) | 196608, 26);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            dialogProperties3 = dialogProperties5;
                            composer2 = composer4;
                            searchBarColors3 = searchBarColors5;
                            f6 = f9;
                            f5 = f10;
                            myVar5 = myVar10;
                            shape3 = shape6;
                            modifier3 = modifier6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            f5 = f2;
                            modifier3 = modifier2;
                            shape3 = shape2;
                            searchBarColors3 = searchBarColors2;
                            composer2 = startRestartGroup;
                            dialogProperties3 = dialogProperties2;
                            f6 = f;
                            myVar5 = myVar2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            final int i14 = 1;
                            myVar6 = new my() { // from class: km0
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 ExpandedFullScreenSearchBar__UtchM0$lambda$6;
                                    w01 ExpandedFullScreenSearchBar__UtchM0$lambda$9;
                                    switch (i14) {
                                        case 0:
                                            int intValue = ((Integer) obj2).intValue();
                                            ExpandedFullScreenSearchBar__UtchM0$lambda$6 = SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$6(searchBarState, myVar, modifier3, shape3, searchBarColors3, f6, f5, myVar5, dialogProperties3, nyVar, i, i2, (Composer) obj, intValue);
                                            return ExpandedFullScreenSearchBar__UtchM0$lambda$6;
                                        default:
                                            int intValue2 = ((Integer) obj2).intValue();
                                            ExpandedFullScreenSearchBar__UtchM0$lambda$9 = SearchBarKt.ExpandedFullScreenSearchBar__UtchM0$lambda$9(searchBarState, myVar, modifier3, shape3, searchBarColors3, f6, f5, myVar5, dialogProperties3, nyVar, i, i2, (Composer) obj, intValue2);
                                            return ExpandedFullScreenSearchBar__UtchM0$lambda$9;
                                    }
                                }
                            };
                            endRestartGroup.updateScope(myVar6);
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f4 = f2;
                if ((12582912 & i) != 0) {
                }
                i6 = i2 & Fields.RotationX;
                if (i6 == 0) {
                }
                if ((i2 & Fields.RotationY) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f3 = f;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            f4 = f2;
            if ((12582912 & i) != 0) {
            }
            i6 = i2 & Fields.RotationX;
            if (i6 == 0) {
            }
            if ((i2 & Fields.RotationY) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        f4 = f2;
        if ((12582912 & i) != 0) {
        }
        i6 = i2 & Fields.RotationX;
        if (i6 == 0) {
        }
        if ((i2 & Fields.RotationY) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExpandedFullScreenSearchBar__UtchM0$lambda$6(SearchBarState searchBarState, my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, my myVar2, DialogProperties dialogProperties, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2320ExpandedFullScreenSearchBar_UtchM0(searchBarState, myVar, modifier, shape, searchBarColors, f, f2, myVar2, dialogProperties, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExpandedFullScreenSearchBar__UtchM0$lambda$8$lambda$7(un unVar, SearchBarState searchBarState) {
        p01.t(unVar, null, null, new SearchBarKt$ExpandedFullScreenSearchBar$3$1$1(searchBarState, null), 3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExpandedFullScreenSearchBar__UtchM0$lambda$9(SearchBarState searchBarState, my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, my myVar2, DialogProperties dialogProperties, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2320ExpandedFullScreenSearchBar_UtchM0(searchBarState, myVar, modifier, shape, searchBarColors, f, f2, myVar2, dialogProperties, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020b  */
    /* renamed from: FullScreenSearchBarLayout-EQC0FA8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2321FullScreenSearchBarLayoutEQC0FA8(final SearchBarState searchBarState, final PredictiveBackState predictiveBackState, final my myVar, final Modifier modifier, final Shape shape, final SearchBarColors searchBarColors, final float f, final float f2, final WindowInsets windowInsets, ny nyVar, Composer composer, final int i) {
        int i2;
        Composer composer2;
        State state;
        Density density;
        int i3;
        MutableState mutableState;
        int i4;
        Object rememberedValue;
        boolean z;
        Object rememberedValue2;
        boolean changed;
        Object rememberedValue3;
        int currentCompositeKeyHash;
        Composer m3878constructorimpl;
        int currentCompositeKeyHash2;
        Composer m3878constructorimpl2;
        int currentCompositeKeyHash3;
        Composer m3878constructorimpl3;
        final ny nyVar2 = nyVar;
        Composer startRestartGroup = composer.startRestartGroup(-740838201);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(predictiveBackState) : startRestartGroup.changedInstance(predictiveBackState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(shape) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(searchBarColors) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(f) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= startRestartGroup.changed(windowInsets) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        int i5 = 0;
        if (startRestartGroup.shouldExecute((i2 & 306783379) != 306783378, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740838201, i2, -1, "androidx.compose.material3.FullScreenSearchBarLayout (SearchBar.kt:2398)");
            }
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt.derivedStateOf(new hm0(predictiveBackState, i5));
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            State state2 = (State) rememberedValue4;
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState2 = (MutableState) rememberedValue5;
            BackEventProgress FullScreenSearchBarLayout_EQC0FA8$lambda$55 = FullScreenSearchBarLayout_EQC0FA8$lambda$55(state2);
            if (FullScreenSearchBarLayout_EQC0FA8$lambda$55 instanceof BackEventProgress.InProgress) {
                if (mutableState2.getValue() == null) {
                    mutableState2.setValue(FullScreenSearchBarLayout_EQC0FA8$lambda$55);
                }
            } else if (q10.b(FullScreenSearchBarLayout_EQC0FA8$lambda$55, BackEventProgress.NotRunning.INSTANCE)) {
                mutableState2.setValue(null);
            } else if (!q10.b(FullScreenSearchBarLayout_EQC0FA8$lambda$55, BackEventProgress.Completed.INSTANCE)) {
                defpackage.o.n();
                return;
            }
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                state = state2;
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            } else {
                state = state2;
            }
            MutableState mutableState3 = (MutableState) rememberedValue6;
            BackEventProgress FullScreenSearchBarLayout_EQC0FA8$lambda$552 = FullScreenSearchBarLayout_EQC0FA8$lambda$55(state);
            if (FullScreenSearchBarLayout_EQC0FA8$lambda$552 instanceof BackEventProgress.InProgress) {
                mutableState3.setValue(FullScreenSearchBarLayout_EQC0FA8$lambda$552);
            } else if (q10.b(FullScreenSearchBarLayout_EQC0FA8$lambda$552, BackEventProgress.NotRunning.INSTANCE)) {
                mutableState3.setValue(null);
            } else if (!q10.b(FullScreenSearchBarLayout_EQC0FA8$lambda$552, BackEventProgress.Completed.INSTANCE)) {
                defpackage.o.n();
                return;
            }
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Shape fullScreenShape = SearchBarDefaults.INSTANCE.getFullScreenShape(startRestartGroup, 6);
            boolean changed2 = startRestartGroup.changed(density2) | startRestartGroup.changed(fullScreenShape);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changed2) {
                density = density2;
            } else {
                density = density2;
                if (rememberedValue7 != companion.getEmpty()) {
                    i3 = i2;
                    mutableState = mutableState3;
                    i4 = 1;
                    GenericShape genericShape = (GenericShape) rememberedValue7;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = new MutableWindowInsets(null, i4, 0 == true ? 1 : 0);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) rememberedValue;
                    WindowInsets insets = mutableWindowInsets.getInsets();
                    WindowInsetsSides.Companion companion2 = WindowInsetsSides.Companion;
                    WindowInsets m833onlybOOhFvg = WindowInsetsKt.m833onlybOOhFvg(insets, WindowInsetsSides.m845plusgK_yJZ4(companion2.m855getHorizontalJoeWqyM(), companion2.m853getBottomJoeWqyM()));
                    z = (i3 & 234881024) != 67108864;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new ml0(mutableWindowInsets, windowInsets, 1);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    Modifier consumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier, (ky) rememberedValue2), windowInsets);
                    changed = startRestartGroup.changed(mutableState) | ((i3 & 14) != 4) | startRestartGroup.changed(mutableState2);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = new SearchBarKt$FullScreenSearchBarLayout$2$1(mutableState, searchBarState, mutableWindowInsets, mutableState2);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, consumeWindowInsets);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    iy constructor = companion3.getConstructor();
                    if (startRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.useNode();
                    } else {
                        startRestartGroup.createNode(constructor);
                    }
                    m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                    my b = k4.b(companion3, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (!m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                    Modifier.Companion companion4 = Modifier.Companion;
                    Modifier padding = PaddingKt.padding(LayoutIdKt.layoutId(companion4, LayoutIdInputField), WindowInsetsKt.asPaddingValues(WindowInsetsKt.m833onlybOOhFvg(m833onlybOOhFvg, companion2.m855getHorizontalJoeWqyM()), startRestartGroup, 0));
                    Alignment.Companion companion5 = Alignment.Companion;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), true);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
                    iy constructor2 = companion3.getConstructor();
                    if (startRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.useNode();
                    } else {
                        startRestartGroup.createNode(constructor2);
                    }
                    m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
                    my b2 = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    if (!m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                    }
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i6 = i3 >> 6;
                    myVar.invoke(startRestartGroup, Integer.valueOf(i6 & 14));
                    startRestartGroup.endNode();
                    SurfaceKt.m2464SurfaceT9BRK9s(LayoutIdKt.layoutId(companion4, LayoutIdSurface), genericShape, searchBarColors.m2303getContainerColor0d7_KjU(), ColorSchemeKt.m1797contentColorForek8zF_U(searchBarColors.m2303getContainerColor0d7_KjU(), startRestartGroup, 0), f, f2, null, ComposableSingletons$SearchBarKt.INSTANCE.m1839getLambda$1146652811$material3(), startRestartGroup, (57344 & i6) | 12582918 | (458752 & i6), 64);
                    composer2 = startRestartGroup;
                    Modifier padding2 = PaddingKt.padding(LayoutIdKt.layoutId(companion4, LayoutIdSearchContent), WindowInsetsKt.asPaddingValues(m833onlybOOhFvg, composer2, 0));
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion5.getStart(), composer2, 0);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, padding2);
                    iy constructor3 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.useNode();
                    } else {
                        composer2.createNode(constructor3);
                    }
                    m3878constructorimpl3 = Updater.m3878constructorimpl(composer2);
                    my b3 = k4.b(companion3, m3878constructorimpl3, columnMeasurePolicy, m3878constructorimpl3, currentCompositionLocalMap3);
                    if (!m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                    }
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion3.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    DividerKt.m1934HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors.m2304getDividerColor0d7_KjU(), composer2, 0, 3);
                    nyVar2 = nyVar;
                    nyVar2.invoke(columnScopeInstance, composer2, Integer.valueOf(6 | ((i3 >> 24) & 112)));
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }
            i3 = i2;
            mutableState = mutableState3;
            i4 = 1;
            rememberedValue7 = new GenericShape(new d9(shape, fullScreenShape, density, searchBarState, mutableState));
            startRestartGroup.updateRememberedValue(rememberedValue7);
            GenericShape genericShape2 = (GenericShape) rememberedValue7;
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == companion.getEmpty()) {
            }
            MutableWindowInsets mutableWindowInsets2 = (MutableWindowInsets) rememberedValue;
            WindowInsets insets2 = mutableWindowInsets2.getInsets();
            WindowInsetsSides.Companion companion22 = WindowInsetsSides.Companion;
            WindowInsets m833onlybOOhFvg2 = WindowInsetsKt.m833onlybOOhFvg(insets2, WindowInsetsSides.m845plusgK_yJZ4(companion22.m855getHorizontalJoeWqyM(), companion22.m853getBottomJoeWqyM()));
            if ((i3 & 234881024) != 67108864) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue2 = new ml0(mutableWindowInsets2, windowInsets, 1);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            Modifier consumeWindowInsets2 = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier, (ky) rememberedValue2), windowInsets);
            changed = startRestartGroup.changed(mutableState) | ((i3 & 14) != 4) | startRestartGroup.changed(mutableState2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new SearchBarKt$FullScreenSearchBarLayout$2$1(mutableState, searchBarState, mutableWindowInsets2, mutableState2);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue3;
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, consumeWindowInsets2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.Companion;
            iy constructor4 = companion32.getConstructor();
            if (startRestartGroup.getApplier() == null) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
            my b4 = k4.b(companion32, m3878constructorimpl, measurePolicy2, m3878constructorimpl, currentCompositionLocalMap4);
            if (!m3878constructorimpl.getInserting()) {
            }
            k4.j(b4, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier4, companion32.getSetModifier());
            Modifier.Companion companion42 = Modifier.Companion;
            Modifier padding3 = PaddingKt.padding(LayoutIdKt.layoutId(companion42, LayoutIdInputField), WindowInsetsKt.asPaddingValues(WindowInsetsKt.m833onlybOOhFvg(m833onlybOOhFvg2, companion22.m855getHorizontalJoeWqyM()), startRestartGroup, 0));
            Alignment.Companion companion52 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion52.getTopStart(), true);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, padding3);
            iy constructor22 = companion32.getConstructor();
            if (startRestartGroup.getApplier() == null) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
            my b22 = k4.b(companion32, m3878constructorimpl2, maybeCachedBoxMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap22);
            if (!m3878constructorimpl2.getInserting()) {
            }
            k4.j(b22, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier22, companion32.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i62 = i3 >> 6;
            myVar.invoke(startRestartGroup, Integer.valueOf(i62 & 14));
            startRestartGroup.endNode();
            SurfaceKt.m2464SurfaceT9BRK9s(LayoutIdKt.layoutId(companion42, LayoutIdSurface), genericShape2, searchBarColors.m2303getContainerColor0d7_KjU(), ColorSchemeKt.m1797contentColorForek8zF_U(searchBarColors.m2303getContainerColor0d7_KjU(), startRestartGroup, 0), f, f2, null, ComposableSingletons$SearchBarKt.INSTANCE.m1839getLambda$1146652811$material3(), startRestartGroup, (57344 & i62) | 12582918 | (458752 & i62), 64);
            composer2 = startRestartGroup;
            Modifier padding22 = PaddingKt.padding(LayoutIdKt.layoutId(companion42, LayoutIdSearchContent), WindowInsetsKt.asPaddingValues(m833onlybOOhFvg2, composer2, 0));
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion52.getStart(), composer2, 0);
            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(composer2, padding22);
            iy constructor32 = companion32.getConstructor();
            if (composer2.getApplier() == null) {
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
            }
            m3878constructorimpl3 = Updater.m3878constructorimpl(composer2);
            my b32 = k4.b(companion32, m3878constructorimpl3, columnMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap32);
            if (!m3878constructorimpl3.getInserting()) {
            }
            k4.j(b32, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
            Updater.m3886setimpl(m3878constructorimpl3, materializeModifier32, companion32.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            DividerKt.m1934HorizontalDivider9IZ8Weo(null, 0.0f, searchBarColors.m2304getDividerColor0d7_KjU(), composer2, 0, 3);
            nyVar2 = nyVar;
            nyVar2.invoke(columnScopeInstance2, composer2, Integer.valueOf(6 | ((i3 >> 24) & 112)));
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: im0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 FullScreenSearchBarLayout_EQC0FA8$lambda$70;
                    int intValue = ((Integer) obj2).intValue();
                    FullScreenSearchBarLayout_EQC0FA8$lambda$70 = SearchBarKt.FullScreenSearchBarLayout_EQC0FA8$lambda$70(SearchBarState.this, predictiveBackState, myVar, modifier, shape, searchBarColors, f, f2, windowInsets, nyVar2, i, (Composer) obj, intValue);
                    return FullScreenSearchBarLayout_EQC0FA8$lambda$70;
                }
            });
        }
    }

    private static final BackEventProgress FullScreenSearchBarLayout_EQC0FA8$lambda$55(State<? extends BackEventProgress> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FullScreenSearchBarLayout_EQC0FA8$lambda$62$lambda$61(Shape shape, Shape shape2, Density density, SearchBarState searchBarState, MutableState mutableState, Path path, Size size, LayoutDirection layoutDirection) {
        if (shape == RoundedCornerShapeKt.getCircleShape() && shape2 == RectangleShapeKt.getRectangleShape()) {
            if (density.mo367toPx0680j_4(Dp.m7611constructorimpl(SearchBarCornerRadius * Math.max(1.0f - searchBarState.getProgress(), transform((BackEventProgress.InProgress) mutableState.getValue())))) < 0.001d) {
                Path.addRect$default(path, androidx.compose.ui.geometry.SizeKt.m4606toRectuvyYCjk(size.m4590unboximpl()), null, 2, null);
            } else {
                Path.addRoundRect$default(path, RoundRectKt.m4571RoundRectsniSvfs(androidx.compose.ui.geometry.SizeKt.m4606toRectuvyYCjk(size.m4590unboximpl()), CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(r4) << 32) | (Float.floatToRawIntBits(r4) & 4294967295L))), null, 2, null);
            }
        } else {
            if (searchBarState.getProgress() >= 0.5f) {
                shape = shape2;
            }
            OutlineKt.addOutline(path, shape.mo283createOutlinePq9zytI(size.m4590unboximpl(), layoutDirection, density));
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FullScreenSearchBarLayout_EQC0FA8$lambda$65$lambda$64(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, WindowInsets windowInsets2) {
        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FullScreenSearchBarLayout_EQC0FA8$lambda$70(SearchBarState searchBarState, PredictiveBackState predictiveBackState, my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, ny nyVar, int i, Composer composer, int i2) {
        m2321FullScreenSearchBarLayoutEQC0FA8(searchBarState, predictiveBackState, myVar, modifier, shape, searchBarColors, f, f2, windowInsets, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0237  */
    @er
    /* renamed from: SearchBar-WuY5d9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2322SearchBarWuY5d9Q(final String str, final ky kyVar, final ky kyVar2, final boolean z, final ky kyVar3, Modifier modifier, boolean z2, my myVar, my myVar2, my myVar3, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, MutableInteractionSource mutableInteractionSource, final ny nyVar, Composer composer, final int i, final int i2, final int i3) {
        String str2;
        int i4;
        int i5;
        int i6;
        final Modifier modifier2;
        int i7;
        boolean z3;
        int i8;
        my myVar4;
        int i9;
        my myVar5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        final Shape shape2;
        final SearchBarColors searchBarColors2;
        final float f3;
        final WindowInsets windowInsets2;
        final MutableInteractionSource mutableInteractionSource2;
        final my myVar6;
        final boolean z4;
        final my myVar7;
        Composer composer2;
        final my myVar8;
        final float f4;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        Composer composer3;
        int i19;
        SearchBarColors searchBarColors3;
        float m2311getTonalElevationD9Ej5fM;
        WindowInsets windowInsets3;
        final MutableInteractionSource mutableInteractionSource3;
        final my myVar9;
        final SearchBarColors searchBarColors4;
        float f5;
        WindowInsets windowInsets4;
        final my myVar10;
        final my myVar11;
        Shape shape4;
        Modifier modifier3;
        final boolean z5;
        int i20;
        int i21;
        int i22;
        Composer startRestartGroup = composer.startRestartGroup(1506988286);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i4 = (startRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i4 = i;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(kyVar2) ? Fields.RotationX : Fields.SpotShadowColor;
            i5 = i3 & 8;
            int i23 = Fields.RotationZ;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
                int i24 = 8192;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changedInstance(kyVar3) ? 16384 : 8192;
                    i6 = i3 & 32;
                    int i25 = Fields.RenderEffect;
                    if (i6 == 0) {
                        i4 |= 196608;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        if ((i & 196608) == 0) {
                            i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
                        }
                    }
                    i7 = i3 & 64;
                    int i26 = Fields.BlendMode;
                    if (i7 == 0) {
                        i4 |= 1572864;
                        z3 = z2;
                    } else {
                        z3 = z2;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                        }
                    }
                    i8 = i3 & Fields.SpotShadowColor;
                    if (i8 == 0) {
                        i4 |= 12582912;
                        myVar4 = myVar;
                    } else {
                        myVar4 = myVar;
                        if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changedInstance(myVar4) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                    }
                    i9 = i3 & Fields.RotationX;
                    if (i9 == 0) {
                        i4 |= 100663296;
                        myVar5 = myVar2;
                    } else {
                        myVar5 = myVar2;
                        if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changedInstance(myVar5) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                    }
                    i10 = i3 & Fields.RotationY;
                    if (i10 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i11 = i10;
                        i4 |= startRestartGroup.changedInstance(myVar3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        if ((i2 & 6) == 0) {
                            if ((i3 & Fields.RotationZ) == 0 && startRestartGroup.changed(shape)) {
                                i22 = 4;
                                i12 = i2 | i22;
                            }
                            i22 = 2;
                            i12 = i2 | i22;
                        } else {
                            i12 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            if ((i3 & Fields.CameraDistance) == 0 && startRestartGroup.changed(searchBarColors)) {
                                i21 = 32;
                                i12 |= i21;
                            }
                            i21 = 16;
                            i12 |= i21;
                        }
                        int i27 = i12;
                        i13 = i3 & Fields.TransformOrigin;
                        if (i13 != 0) {
                            i14 = i27 | 384;
                        } else {
                            int i28 = i27;
                            if ((i2 & 384) == 0) {
                                i28 |= startRestartGroup.changed(f) ? Fields.RotationX : Fields.SpotShadowColor;
                            }
                            i14 = i28;
                        }
                        i15 = i3 & 8192;
                        if (i15 != 0) {
                            i16 = i14 | 3072;
                        } else {
                            i16 = i14;
                            if ((i2 & 3072) == 0) {
                                if (startRestartGroup.changed(f2)) {
                                    i23 = 2048;
                                }
                                i16 |= i23;
                                if ((i2 & 24576) == 0) {
                                    if ((i3 & Fields.Clip) == 0 && startRestartGroup.changed(windowInsets)) {
                                        i24 = 16384;
                                    }
                                    i16 |= i24;
                                }
                                i17 = i3 & Fields.CompositingStrategy;
                                if (i17 == 0) {
                                    i16 |= 196608;
                                } else if ((i2 & 196608) == 0) {
                                    i18 = i15;
                                    if (!startRestartGroup.changed(mutableInteractionSource)) {
                                        i25 = 65536;
                                    }
                                    i16 |= i25;
                                    if ((i3 & 65536) != 0) {
                                        i16 |= 1572864;
                                    } else if ((i2 & 1572864) == 0) {
                                        if (startRestartGroup.changedInstance(nyVar)) {
                                            i26 = 1048576;
                                        }
                                        i16 |= i26;
                                    }
                                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
                                        startRestartGroup.startDefaults();
                                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                            Modifier modifier4 = i6 != 0 ? Modifier.Companion : modifier2;
                                            boolean z6 = i7 != 0 ? true : z3;
                                            my myVar12 = i8 != 0 ? null : myVar4;
                                            if (i9 != 0) {
                                                myVar5 = null;
                                            }
                                            my myVar13 = i11 != 0 ? null : myVar3;
                                            if ((i3 & Fields.RotationZ) != 0) {
                                                i16 &= -15;
                                                shape3 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                                            } else {
                                                shape3 = shape;
                                            }
                                            if ((i3 & Fields.CameraDistance) != 0) {
                                                i19 = i4;
                                                composer3 = startRestartGroup;
                                                searchBarColors3 = SearchBarDefaults.INSTANCE.m2306colorsKlgxPg(0L, 0L, null, composer3, 3072, 7);
                                                i16 &= -113;
                                            } else {
                                                composer3 = startRestartGroup;
                                                i19 = i4;
                                                searchBarColors3 = searchBarColors;
                                            }
                                            m2311getTonalElevationD9Ej5fM = i13 != 0 ? SearchBarDefaults.INSTANCE.m2311getTonalElevationD9Ej5fM() : f;
                                            float m2310getShadowElevationD9Ej5fM = i18 != 0 ? SearchBarDefaults.INSTANCE.m2310getShadowElevationD9Ej5fM() : f2;
                                            if ((i3 & Fields.Clip) != 0) {
                                                windowInsets3 = SearchBarDefaults.INSTANCE.getWindowInsets(composer3, 6);
                                                i16 &= -57345;
                                            } else {
                                                windowInsets3 = windowInsets;
                                            }
                                            if (i17 != 0) {
                                                myVar9 = myVar5;
                                                searchBarColors4 = searchBarColors3;
                                                f5 = m2310getShadowElevationD9Ej5fM;
                                                windowInsets4 = windowInsets3;
                                                mutableInteractionSource3 = null;
                                            } else {
                                                mutableInteractionSource3 = mutableInteractionSource;
                                                myVar9 = myVar5;
                                                searchBarColors4 = searchBarColors3;
                                                f5 = m2310getShadowElevationD9Ej5fM;
                                                windowInsets4 = windowInsets3;
                                            }
                                            myVar10 = myVar12;
                                            myVar11 = myVar13;
                                            shape4 = shape3;
                                            modifier3 = modifier4;
                                            z5 = z6;
                                            i20 = i16;
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i3 & Fields.RotationZ) != 0) {
                                                i16 &= -15;
                                            }
                                            if ((i3 & Fields.CameraDistance) != 0) {
                                                i16 &= -113;
                                            }
                                            if ((i3 & Fields.Clip) != 0) {
                                                i16 &= -57345;
                                            }
                                            myVar11 = myVar3;
                                            searchBarColors4 = searchBarColors;
                                            m2311getTonalElevationD9Ej5fM = f;
                                            f5 = f2;
                                            windowInsets4 = windowInsets;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            myVar9 = myVar5;
                                            modifier3 = modifier2;
                                            z5 = z3;
                                            myVar10 = myVar4;
                                            composer3 = startRestartGroup;
                                            i20 = i16;
                                            shape4 = shape;
                                            i19 = i4;
                                        }
                                        composer3.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1506988286, i19, i20, "androidx.compose.material3.SearchBar (SearchBar.kt:1967)");
                                        }
                                        final String str3 = str2;
                                        int i29 = i19 >> 6;
                                        int i30 = 6 | (i29 & 112) | (i29 & 896) | (i29 & 7168);
                                        int i31 = i20 << 12;
                                        SearchBarColors searchBarColors5 = searchBarColors4;
                                        Composer composer4 = composer3;
                                        float f6 = m2311getTonalElevationD9Ej5fM;
                                        m2323SearchBarY92LkZI(ComposableLambdaKt.rememberComposableLambda(-1597173218, true, new my() { // from class: androidx.compose.material3.SearchBarKt$SearchBar$6
                                            public final void invoke(Composer composer5, int i32) {
                                                if (!composer5.shouldExecute((i32 & 3) != 2, i32 & 1)) {
                                                    composer5.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1597173218, i32, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.kt:1969)");
                                                }
                                                SearchBarDefaults.INSTANCE.InputField(str3, kyVar, kyVar2, z, kyVar3, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), z5, myVar10, myVar9, myVar11, SearchBarColors.this.getInputFieldColors(), mutableInteractionSource3, composer5, 196608, 384, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.my
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return w01.a;
                                            }
                                        }, composer3, 54), z, kyVar3, modifier3, shape4, searchBarColors5, f6, f5, windowInsets4, nyVar, composer4, i30 | (57344 & i31) | (458752 & i31) | (3670016 & i31) | (29360128 & i31) | (i31 & 234881024) | ((i20 << 9) & 1879048192), 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier2 = modifier3;
                                        f3 = f6;
                                        windowInsets2 = windowInsets4;
                                        composer2 = composer4;
                                        searchBarColors2 = searchBarColors5;
                                        z4 = z5;
                                        myVar6 = myVar9;
                                        myVar8 = myVar11;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        f4 = f5;
                                        shape2 = shape4;
                                        myVar7 = myVar10;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        shape2 = shape;
                                        searchBarColors2 = searchBarColors;
                                        f3 = f;
                                        windowInsets2 = windowInsets;
                                        mutableInteractionSource2 = mutableInteractionSource;
                                        myVar6 = myVar5;
                                        z4 = z3;
                                        myVar7 = myVar4;
                                        composer2 = startRestartGroup;
                                        myVar8 = myVar3;
                                        f4 = f2;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new my() { // from class: fm0
                                            @Override // defpackage.my
                                            public final Object invoke(Object obj, Object obj2) {
                                                w01 SearchBar_WuY5d9Q$lambda$28;
                                                int intValue = ((Integer) obj2).intValue();
                                                SearchBar_WuY5d9Q$lambda$28 = SearchBarKt.SearchBar_WuY5d9Q$lambda$28(str, kyVar, kyVar2, z, kyVar3, modifier2, z4, myVar7, myVar6, myVar8, shape2, searchBarColors2, f3, f4, windowInsets2, mutableInteractionSource2, nyVar, i, i2, i3, (Composer) obj, intValue);
                                                return SearchBar_WuY5d9Q$lambda$28;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i18 = i15;
                                if ((i3 & 65536) != 0) {
                                }
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                        }
                        if ((i2 & 24576) == 0) {
                        }
                        i17 = i3 & Fields.CompositingStrategy;
                        if (i17 == 0) {
                        }
                        i18 = i15;
                        if ((i3 & 65536) != 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i11 = i10;
                    if ((i2 & 6) == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    int i272 = i12;
                    i13 = i3 & Fields.TransformOrigin;
                    if (i13 != 0) {
                    }
                    i15 = i3 & 8192;
                    if (i15 != 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    i17 = i3 & Fields.CompositingStrategy;
                    if (i17 == 0) {
                    }
                    i18 = i15;
                    if ((i3 & 65536) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i6 = i3 & 32;
                int i252 = Fields.RenderEffect;
                if (i6 == 0) {
                }
                i7 = i3 & 64;
                int i262 = Fields.BlendMode;
                if (i7 == 0) {
                }
                i8 = i3 & Fields.SpotShadowColor;
                if (i8 == 0) {
                }
                i9 = i3 & Fields.RotationX;
                if (i9 == 0) {
                }
                i10 = i3 & Fields.RotationY;
                if (i10 == 0) {
                }
                i11 = i10;
                if ((i2 & 6) == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                int i2722 = i12;
                i13 = i3 & Fields.TransformOrigin;
                if (i13 != 0) {
                }
                i15 = i3 & 8192;
                if (i15 != 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                i17 = i3 & Fields.CompositingStrategy;
                if (i17 == 0) {
                }
                i18 = i15;
                if ((i3 & 65536) != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            int i242 = 8192;
            if ((i3 & 16) != 0) {
            }
            i6 = i3 & 32;
            int i2522 = Fields.RenderEffect;
            if (i6 == 0) {
            }
            i7 = i3 & 64;
            int i2622 = Fields.BlendMode;
            if (i7 == 0) {
            }
            i8 = i3 & Fields.SpotShadowColor;
            if (i8 == 0) {
            }
            i9 = i3 & Fields.RotationX;
            if (i9 == 0) {
            }
            i10 = i3 & Fields.RotationY;
            if (i10 == 0) {
            }
            i11 = i10;
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            int i27222 = i12;
            i13 = i3 & Fields.TransformOrigin;
            if (i13 != 0) {
            }
            i15 = i3 & 8192;
            if (i15 != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i17 = i3 & Fields.CompositingStrategy;
            if (i17 == 0) {
            }
            i18 = i15;
            if ((i3 & 65536) != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 8;
        int i232 = Fields.RotationZ;
        if (i5 == 0) {
        }
        int i2422 = 8192;
        if ((i3 & 16) != 0) {
        }
        i6 = i3 & 32;
        int i25222 = Fields.RenderEffect;
        if (i6 == 0) {
        }
        i7 = i3 & 64;
        int i26222 = Fields.BlendMode;
        if (i7 == 0) {
        }
        i8 = i3 & Fields.SpotShadowColor;
        if (i8 == 0) {
        }
        i9 = i3 & Fields.RotationX;
        if (i9 == 0) {
        }
        i10 = i3 & Fields.RotationY;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        int i272222 = i12;
        i13 = i3 & Fields.TransformOrigin;
        if (i13 != 0) {
        }
        i15 = i3 & 8192;
        if (i15 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i17 = i3 & Fields.CompositingStrategy;
        if (i17 == 0) {
        }
        i18 = i15;
        if ((i3 & 65536) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i16 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013d  */
    /* renamed from: SearchBar-Y92LkZI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2323SearchBarY92LkZI(final my myVar, boolean z, final ky kyVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, final ny nyVar, Composer composer, final int i, final int i2) {
        int i3;
        ky kyVar2;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i4;
        float f3;
        int i5;
        WindowInsets windowInsets2;
        final boolean z2;
        Composer composer2;
        final float f4;
        final float f5;
        final WindowInsets windowInsets3;
        final Modifier modifier3;
        final Shape shape3;
        final SearchBarColors searchBarColors3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        Composer composer3;
        float f6;
        WindowInsets windowInsets4;
        float f7;
        SearchBarColors searchBarColors4;
        Shape shape5;
        int i6;
        int i7;
        Shape shape6;
        un unVar;
        Boolean bool;
        MutableFloatState mutableFloatState;
        Animatable animatable;
        int i8;
        Composer composer4;
        MutableFloatState mutableFloatState2;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1451547856);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            kyVar2 = kyVar;
        } else {
            kyVar2 = kyVar;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(kyVar2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i11 = Fields.Clip;
                        i3 |= i11;
                    }
                } else {
                    shape2 = shape;
                }
                i11 = 8192;
                i3 |= i11;
            } else {
                shape2 = shape;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i10 = Fields.RenderEffect;
                        i3 |= i10;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i10 = 65536;
                i3 |= i10;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                f3 = f;
                i3 |= startRestartGroup.changed(f3) ? 1048576 : Fields.BlendMode;
                i5 = i2 & Fields.SpotShadowColor;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                }
                if ((i & 100663296) == 0) {
                    if ((i2 & Fields.RotationX) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i9 = GroupFlagsKt.IsRecompositionRequiredFlag;
                            i3 |= i9;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i9 = GroupFlagsKt.HasAuxSlotFlag;
                    i3 |= i9;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i2 & Fields.RotationY) != 0) {
                    i3 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        z2 = z;
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        f4 = f;
                        f5 = f2;
                        windowInsets3 = windowInsets2;
                        modifier3 = modifier2;
                        shape3 = shape2;
                        searchBarColors3 = searchBarColors2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if ((i2 & 16) != 0) {
                                shape4 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape4 = shape2;
                            }
                            if ((i2 & 32) != 0) {
                                composer3 = startRestartGroup;
                                i3 &= -458753;
                                searchBarColors2 = SearchBarDefaults.INSTANCE.m2306colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                            } else {
                                composer3 = startRestartGroup;
                            }
                            float m2311getTonalElevationD9Ej5fM = i4 != 0 ? SearchBarDefaults.INSTANCE.m2311getTonalElevationD9Ej5fM() : f;
                            float m2310getShadowElevationD9Ej5fM = i5 != 0 ? SearchBarDefaults.INSTANCE.m2310getShadowElevationD9Ej5fM() : f2;
                            if ((i2 & Fields.RotationX) != 0) {
                                windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composer3, 6);
                                i3 &= -234881025;
                            }
                            f6 = m2311getTonalElevationD9Ej5fM;
                            windowInsets4 = windowInsets2;
                            f7 = m2310getShadowElevationD9Ej5fM;
                            searchBarColors4 = searchBarColors2;
                            shape5 = shape4;
                            i6 = i3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & Fields.RotationX) != 0) {
                                i3 &= -234881025;
                            }
                            f7 = f2;
                            windowInsets4 = windowInsets2;
                            shape5 = shape2;
                            searchBarColors4 = searchBarColors2;
                            f6 = f3;
                            composer3 = startRestartGroup;
                            i6 = i3;
                        }
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1451547856, i6, -1, "androidx.compose.material3.SearchBar (SearchBar.kt:544)");
                        }
                        Object rememberedValue = composer3.rememberedValue();
                        Composer.Companion companion = Composer.Companion;
                        if (rememberedValue == companion.getEmpty()) {
                            rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, composer3);
                            composer3.updateRememberedValue(rememberedValue);
                        }
                        un unVar2 = (un) rememberedValue;
                        Object rememberedValue2 = composer3.rememberedValue();
                        if (rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = AnimatableKt.Animatable$default(z ? 1.0f : 0.0f, 0.0f, 2, null);
                            composer3.updateRememberedValue(rememberedValue2);
                        }
                        Animatable animatable2 = (Animatable) rememberedValue2;
                        Object rememberedValue3 = composer3.rememberedValue();
                        if (rememberedValue3 == companion.getEmpty()) {
                            rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
                            composer3.updateRememberedValue(rememberedValue3);
                        }
                        MutableFloatState mutableFloatState3 = (MutableFloatState) rememberedValue3;
                        Object rememberedValue4 = composer3.rememberedValue();
                        if (rememberedValue4 == companion.getEmpty()) {
                            i7 = 2;
                            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composer3.updateRememberedValue(rememberedValue4);
                        } else {
                            i7 = 2;
                        }
                        MutableState mutableState = (MutableState) rememberedValue4;
                        Object rememberedValue5 = composer3.rememberedValue();
                        if (rememberedValue5 == companion.getEmpty()) {
                            rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i7, null);
                            composer3.updateRememberedValue(rememberedValue5);
                        }
                        MutableState mutableState2 = (MutableState) rememberedValue5;
                        Boolean valueOf = Boolean.valueOf(z);
                        boolean changedInstance = composer3.changedInstance(animatable2) | ((i6 & 112) == 32);
                        Object rememberedValue6 = composer3.rememberedValue();
                        if (changedInstance || rememberedValue6 == companion.getEmpty()) {
                            shape6 = shape5;
                            unVar = unVar2;
                            bool = valueOf;
                            mutableFloatState = mutableFloatState3;
                            z2 = z;
                            SearchBarKt$SearchBar$3$1 searchBarKt$SearchBar$3$1 = new SearchBarKt$SearchBar$3$1(animatable2, z2, mutableFloatState, mutableState, mutableState2, null);
                            composer3.updateRememberedValue(searchBarKt$SearchBar$3$1);
                            rememberedValue6 = searchBarKt$SearchBar$3$1;
                        } else {
                            mutableFloatState = mutableFloatState3;
                            shape6 = shape5;
                            unVar = unVar2;
                            z2 = z;
                            bool = valueOf;
                        }
                        int i13 = (i6 >> 3) & 14;
                        EffectsKt.LaunchedEffect(bool, (my) rememberedValue6, composer3, i13);
                        Object rememberedValue7 = composer3.rememberedValue();
                        if (rememberedValue7 == companion.getEmpty()) {
                            rememberedValue7 = new MutatorMutex();
                            composer3.updateRememberedValue(rememberedValue7);
                        }
                        MutatorMutex mutatorMutex = (MutatorMutex) rememberedValue7;
                        boolean changedInstance2 = composer3.changedInstance(animatable2) | ((i6 & 896) == 256) | composer3.changedInstance(unVar);
                        Object rememberedValue8 = composer3.rememberedValue();
                        if (changedInstance2 || rememberedValue8 == companion.getEmpty()) {
                            animatable = animatable2;
                            MutableFloatState mutableFloatState4 = mutableFloatState;
                            i8 = i6;
                            composer4 = composer3;
                            SearchBarKt$SearchBar$4$1 searchBarKt$SearchBar$4$1 = new SearchBarKt$SearchBar$4$1(mutatorMutex, mutableFloatState4, animatable, kyVar2, unVar, mutableState, mutableState2, null);
                            mutableFloatState2 = mutableFloatState4;
                            composer4.updateRememberedValue(searchBarKt$SearchBar$4$1);
                            rememberedValue8 = searchBarKt$SearchBar$4$1;
                        } else {
                            int i14 = i6;
                            mutableFloatState2 = mutableFloatState;
                            i8 = i14;
                            animatable = animatable2;
                            composer4 = composer3;
                        }
                        BackHandler_androidKt.PredictiveBackHandler(z2, (my) rememberedValue8, composer4, i13, 0);
                        int i15 = i8 << 6;
                        SearchBarColors searchBarColors5 = searchBarColors4;
                        float f8 = f7;
                        composer2 = composer4;
                        Modifier modifier4 = modifier2;
                        float f9 = f6;
                        Shape shape7 = shape6;
                        m2325SearchBarImplj1jLAyQ(animatable, mutableFloatState2, mutableState, mutableState2, modifier4, myVar, shape7, searchBarColors5, f9, f8, windowInsets4, nyVar, composer2, Animatable.$stable | 3504 | (57344 & (i8 << 3)) | ((i8 << 15) & 458752) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192), (i8 >> 24) & 126, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        shape3 = shape7;
                        searchBarColors3 = searchBarColors5;
                        f4 = f9;
                        f5 = f8;
                        windowInsets3 = windowInsets4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new my() { // from class: om0
                            @Override // defpackage.my
                            public final Object invoke(Object obj, Object obj2) {
                                w01 SearchBar_Y92LkZI$lambda$22;
                                int intValue = ((Integer) obj2).intValue();
                                SearchBar_Y92LkZI$lambda$22 = SearchBarKt.SearchBar_Y92LkZI$lambda$22(my.this, z2, kyVar, modifier3, shape3, searchBarColors3, f4, f5, windowInsets3, nyVar, i, i2, (Composer) obj, intValue);
                                return SearchBar_Y92LkZI$lambda$22;
                            }
                        });
                        return;
                    }
                    return;
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f;
            i5 = i2 & Fields.SpotShadowColor;
            if (i5 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i2 & Fields.RotationY) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & Fields.SpotShadowColor;
        if (i5 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i2 & Fields.RotationY) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b6  */
    /* renamed from: SearchBar-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2324SearchBarnbWgWpA(SearchBarState searchBarState, my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        my myVar2;
        int i4;
        Modifier modifier2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i5;
        float f3;
        int i6;
        float f4;
        float f5;
        Modifier modifier3;
        Shape shape3;
        SearchBarColors searchBarColors3;
        float f6;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        Shape shape4;
        SearchBarColors searchBarColors4;
        float m2310getShadowElevationD9Ej5fM;
        Shape shape5;
        int i7;
        SearchBarColors searchBarColors5;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1234122643);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(searchBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            myVar2 = myVar;
            i3 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i9 = Fields.CameraDistance;
                            i3 |= i9;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i9 = Fields.RotationZ;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        searchBarColors2 = searchBarColors;
                        if (startRestartGroup.changed(searchBarColors2)) {
                            i8 = Fields.Clip;
                            i3 |= i8;
                        }
                    } else {
                        searchBarColors2 = searchBarColors;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    f3 = f;
                    i3 |= startRestartGroup.changed(f3) ? Fields.RenderEffect : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        f4 = f2;
                        i3 |= startRestartGroup.changed(f4) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                modifier4 = i4 != 0 ? Modifier.Companion : modifier2;
                                if ((i2 & 8) != 0) {
                                    shape4 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                                    i3 &= -7169;
                                } else {
                                    shape4 = shape2;
                                }
                                if ((i2 & 16) != 0) {
                                    searchBarColors4 = SearchBarDefaults.INSTANCE.m2306colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                                    i3 &= -57345;
                                } else {
                                    searchBarColors4 = searchBarColors2;
                                }
                                float m2311getTonalElevationD9Ej5fM = i5 != 0 ? SearchBarDefaults.INSTANCE.m2311getTonalElevationD9Ej5fM() : f;
                                m2310getShadowElevationD9Ej5fM = i6 != 0 ? SearchBarDefaults.INSTANCE.m2310getShadowElevationD9Ej5fM() : f2;
                                f3 = m2311getTonalElevationD9Ej5fM;
                                shape5 = shape4;
                                i7 = i3;
                                searchBarColors5 = searchBarColors4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                modifier4 = modifier2;
                                m2310getShadowElevationD9Ej5fM = f4;
                                i7 = i3;
                                searchBarColors5 = searchBarColors2;
                                shape5 = shape2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1234122643, i7, -1, "androidx.compose.material3.SearchBar (SearchBar.kt:232)");
                            }
                            boolean z = (i7 & 14) == 4;
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new mb0(searchBarState, 16);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier4, (ky) rememberedValue);
                            float f7 = f3;
                            int i10 = i7 >> 3;
                            SurfaceKt.m2464SurfaceT9BRK9s(onGloballyPositioned, shape5, searchBarColors5.m2303getContainerColor0d7_KjU(), ColorSchemeKt.m1797contentColorForek8zF_U(searchBarColors5.m2303getContainerColor0d7_KjU(), startRestartGroup, 0), f7, m2310getShadowElevationD9Ej5fM, null, myVar2, startRestartGroup, ((i7 >> 6) & 112) | (i10 & 57344) | (i10 & 458752) | ((i7 << 18) & 29360128), 64);
                            startRestartGroup = startRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            searchBarColors3 = searchBarColors5;
                            modifier3 = modifier4;
                            shape3 = shape5;
                            f6 = m2310getShadowElevationD9Ej5fM;
                            f5 = f7;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            f5 = f;
                            modifier3 = modifier2;
                            shape3 = shape2;
                            searchBarColors3 = searchBarColors2;
                            f6 = f2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new rg(searchBarState, myVar, modifier3, shape3, searchBarColors3, f5, f6, i, i2));
                            return;
                        }
                        return;
                    }
                    f4 = f2;
                    if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f3 = f;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                f4 = f2;
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
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
            f3 = f;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            f4 = f2;
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        myVar2 = myVar;
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
        f3 = f;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        f4 = f2;
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018b  */
    /* renamed from: SearchBarImpl-j1jLAyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2325SearchBarImplj1jLAyQ(final Animatable<Float, AnimationVector1D> animatable, final MutableFloatState mutableFloatState, final MutableState<gc> mutableState, final MutableState<gc> mutableState2, Modifier modifier, final my myVar, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, final ny nyVar, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        MutableState<gc> mutableState3;
        int i5;
        Modifier modifier2;
        SearchBarColors searchBarColors2;
        int i6;
        int i7;
        int i8;
        int i9;
        WindowInsets windowInsets2;
        int i10;
        final Shape shape2;
        final float f3;
        final WindowInsets windowInsets3;
        Composer composer2;
        final Modifier modifier3;
        final float f4;
        final SearchBarColors searchBarColors3;
        ScopeUpdateScope endRestartGroup;
        Shape shape3;
        Modifier modifier4;
        int i11;
        SearchBarColors searchBarColors4;
        int i12;
        WindowInsets windowInsets4;
        int i13;
        final float f5;
        int i14;
        final SearchBarColors searchBarColors5;
        final float f6;
        Shape shape4;
        Modifier modifier5;
        Modifier modifier6;
        ComposableLambda composableLambda;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(501752896);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(mutableFloatState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            mutableState3 = mutableState;
        } else {
            mutableState3 = mutableState;
            if ((i & 384) == 0) {
                i4 |= startRestartGroup.changed(mutableState3) ? Fields.RotationX : Fields.SpotShadowColor;
            }
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(mutableState2) ? Fields.CameraDistance : Fields.RotationZ;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? Fields.Clip : 8192;
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= startRestartGroup.changedInstance(myVar) ? Fields.RenderEffect : 65536;
                }
                if ((i & 1572864) == 0) {
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape)) ? 1048576 : Fields.BlendMode;
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & Fields.SpotShadowColor) == 0) {
                        searchBarColors2 = searchBarColors;
                        if (startRestartGroup.changed(searchBarColors2)) {
                            i16 = GroupFlagsKt.IsNodeFlag;
                            i4 |= i16;
                        }
                    } else {
                        searchBarColors2 = searchBarColors;
                    }
                    i16 = 4194304;
                    i4 |= i16;
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i6 = i3 & Fields.RotationX;
                if (i6 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i7 = i6;
                    i4 |= startRestartGroup.changed(f) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    i8 = i3 & Fields.RotationY;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        if ((i2 & 6) == 0) {
                            if ((i3 & Fields.RotationZ) == 0) {
                                windowInsets2 = windowInsets;
                                if (startRestartGroup.changed(windowInsets2)) {
                                    i15 = 4;
                                    i10 = i2 | i15;
                                }
                            } else {
                                windowInsets2 = windowInsets;
                            }
                            i15 = 2;
                            i10 = i2 | i15;
                        } else {
                            windowInsets2 = windowInsets;
                            i10 = i2;
                        }
                        if ((i3 & Fields.CameraDistance) != 0) {
                            i10 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i10 |= startRestartGroup.changedInstance(nyVar) ? 32 : 16;
                        }
                        if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier7 = i5 != 0 ? Modifier.Companion : modifier2;
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                    shape3 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                                } else {
                                    shape3 = shape;
                                }
                                int i17 = i4;
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    modifier4 = modifier7;
                                    i11 = 6;
                                    searchBarColors4 = SearchBarDefaults.INSTANCE.m2306colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                                    i12 = i17 & (-29360129);
                                } else {
                                    modifier4 = modifier7;
                                    i11 = 6;
                                    searchBarColors4 = searchBarColors2;
                                    i12 = i17;
                                }
                                float m2311getTonalElevationD9Ej5fM = i7 != 0 ? SearchBarDefaults.INSTANCE.m2311getTonalElevationD9Ej5fM() : f;
                                float m2310getShadowElevationD9Ej5fM = i9 != 0 ? SearchBarDefaults.INSTANCE.m2310getShadowElevationD9Ej5fM() : f2;
                                if ((i3 & Fields.RotationZ) != 0) {
                                    i13 = i12;
                                    windowInsets4 = SearchBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, i11);
                                    i14 = i10 & (-15);
                                    searchBarColors5 = searchBarColors4;
                                    f5 = m2310getShadowElevationD9Ej5fM;
                                    shape4 = shape3;
                                    f6 = m2311getTonalElevationD9Ej5fM;
                                } else {
                                    windowInsets4 = windowInsets;
                                    i13 = i12;
                                    f5 = m2310getShadowElevationD9Ej5fM;
                                    i14 = i10;
                                    searchBarColors5 = searchBarColors4;
                                    f6 = m2311getTonalElevationD9Ej5fM;
                                    shape4 = shape3;
                                }
                                modifier5 = modifier4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i4 &= -29360129;
                                }
                                if ((i3 & Fields.RotationZ) != 0) {
                                    i10 &= -15;
                                }
                                f6 = f;
                                i13 = i4;
                                searchBarColors5 = searchBarColors2;
                                windowInsets4 = windowInsets2;
                                modifier5 = modifier2;
                                i14 = i10;
                                shape4 = shape;
                                f5 = f2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                modifier6 = modifier5;
                                ComposerKt.traceEventStart(501752896, i13, i14, "androidx.compose.material3.SearchBarImpl (SearchBar.kt:2093)");
                            } else {
                                modifier6 = modifier5;
                            }
                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            SearchBarDefaults searchBarDefaults = SearchBarDefaults.INSTANCE;
                            WindowInsets windowInsets5 = windowInsets4;
                            int i18 = i14;
                            Shape inputFieldShape = searchBarDefaults.getInputFieldShape(startRestartGroup, 6);
                            Shape fullScreenShape = searchBarDefaults.getFullScreenShape(startRestartGroup, 6);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.Companion;
                            if (rememberedValue == companion.getEmpty()) {
                                final int i19 = 0;
                                rememberedValue = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new iy() { // from class: em0
                                    @Override // defpackage.iy
                                    public final Object invoke() {
                                        boolean SearchBarImpl_j1jLAyQ$lambda$31$lambda$30;
                                        int i20 = i19;
                                        Animatable animatable2 = animatable;
                                        switch (i20) {
                                            case 0:
                                                SearchBarImpl_j1jLAyQ$lambda$31$lambda$30 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$31$lambda$30(animatable2);
                                                break;
                                            default:
                                                SearchBarImpl_j1jLAyQ$lambda$31$lambda$30 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$37$lambda$36(animatable2);
                                                break;
                                        }
                                        return Boolean.valueOf(SearchBarImpl_j1jLAyQ$lambda$31$lambda$30);
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            State state = (State) rememberedValue;
                            boolean changed = startRestartGroup.changed(SearchBarImpl_j1jLAyQ$lambda$32(state)) | ((((i13 & 3670016) ^ 1572864) > 1048576 && startRestartGroup.changed(shape4)) || (i13 & 1572864) == 1048576);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue2 == companion.getEmpty()) {
                                Shape genericShape = q10.b(shape4, inputFieldShape) ? new GenericShape(new xl(3, density, animatable)) : SearchBarImpl_j1jLAyQ$lambda$32(state) ? fullScreenShape : shape4;
                                startRestartGroup.updateRememberedValue(genericShape);
                                rememberedValue2 = genericShape;
                            }
                            final Shape shape5 = (Shape) rememberedValue2;
                            final int i20 = 1;
                            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1304392981, true, new my() { // from class: androidx.compose.material3.SearchBarKt$SearchBarImpl$surface$1
                                public final void invoke(Composer composer3, int i21) {
                                    if (!composer3.shouldExecute((i21 & 3) != 2, i21 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1304392981, i21, -1, "androidx.compose.material3.SearchBarImpl.<anonymous> (SearchBar.kt:2119)");
                                    }
                                    SurfaceKt.m2464SurfaceT9BRK9s(null, Shape.this, searchBarColors5.m2303getContainerColor0d7_KjU(), ColorSchemeKt.m1797contentColorForek8zF_U(searchBarColors5.m2303getContainerColor0d7_KjU(), composer3, 0), f6, f5, null, ComposableSingletons$SearchBarKt.INSTANCE.getLambda$1165377840$material3(), composer3, 12582912, 65);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == companion.getEmpty()) {
                                rememberedValue3 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new iy() { // from class: em0
                                    @Override // defpackage.iy
                                    public final Object invoke() {
                                        boolean SearchBarImpl_j1jLAyQ$lambda$31$lambda$30;
                                        int i202 = i20;
                                        Animatable animatable2 = animatable;
                                        switch (i202) {
                                            case 0:
                                                SearchBarImpl_j1jLAyQ$lambda$31$lambda$30 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$31$lambda$30(animatable2);
                                                break;
                                            default:
                                                SearchBarImpl_j1jLAyQ$lambda$31$lambda$30 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$37$lambda$36(animatable2);
                                                break;
                                        }
                                        return Boolean.valueOf(SearchBarImpl_j1jLAyQ$lambda$31$lambda$30);
                                    }
                                });
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            if (SearchBarImpl_j1jLAyQ$lambda$38((State) rememberedValue3)) {
                                startRestartGroup.startReplaceGroup(1236615731);
                                composableLambda = ComposableLambdaKt.rememberComposableLambda(1831594093, true, new SearchBarKt$SearchBarImpl$wrappedContent$1(animatable, searchBarColors5, nyVar), startRestartGroup, 54);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1236851485);
                                startRestartGroup.endReplaceGroup();
                                composableLambda = null;
                            }
                            int i21 = Animatable.$stable | 12582912 | (i13 & 14) | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | ((i18 << 15) & 458752) | ((i13 << 3) & 3670016);
                            Shape shape6 = shape4;
                            SearchBarColors searchBarColors6 = searchBarColors5;
                            float f7 = f5;
                            MutableState<gc> mutableState4 = mutableState3;
                            ComposableLambda composableLambda2 = composableLambda;
                            float f8 = f6;
                            Modifier modifier8 = modifier6;
                            SearchBarLayout(animatable, mutableFloatState, mutableState4, mutableState2, modifier8, windowInsets5, myVar, rememberComposableLambda, composableLambda2, startRestartGroup, i21);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer2 = startRestartGroup;
                            searchBarColors3 = searchBarColors6;
                            f3 = f8;
                            f4 = f7;
                            shape2 = shape6;
                            windowInsets3 = windowInsets5;
                            modifier3 = modifier8;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            shape2 = shape;
                            f3 = f;
                            windowInsets3 = windowInsets;
                            composer2 = startRestartGroup;
                            modifier3 = modifier2;
                            f4 = f2;
                            searchBarColors3 = searchBarColors2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: mm0
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 SearchBarImpl_j1jLAyQ$lambda$39;
                                    int intValue = ((Integer) obj2).intValue();
                                    SearchBarImpl_j1jLAyQ$lambda$39 = SearchBarKt.SearchBarImpl_j1jLAyQ$lambda$39(Animatable.this, mutableFloatState, mutableState, mutableState2, modifier3, myVar, shape2, searchBarColors3, f3, f4, windowInsets3, nyVar, i, i2, i3, (Composer) obj, intValue);
                                    return SearchBarImpl_j1jLAyQ$lambda$39;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i8;
                    if ((i2 & 6) == 0) {
                    }
                    if ((i3 & Fields.CameraDistance) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i6;
                i8 = i3 & Fields.RotationY;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i2 & 6) == 0) {
                }
                if ((i3 & Fields.CameraDistance) != 0) {
                }
                if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            if ((i3 & 32) != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i6 = i3 & Fields.RotationX;
            if (i6 != 0) {
            }
            i7 = i6;
            i8 = i3 & Fields.RotationY;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i2 & 6) == 0) {
            }
            if ((i3 & Fields.CameraDistance) != 0) {
            }
            if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 32) != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i6 = i3 & Fields.RotationX;
        if (i6 != 0) {
        }
        i7 = i6;
        i8 = i3 & Fields.RotationY;
        if (i8 == 0) {
        }
        i9 = i8;
        if ((i2 & 6) == 0) {
        }
        if ((i3 & Fields.CameraDistance) != 0) {
        }
        if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i10 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SearchBarImpl_j1jLAyQ$lambda$31$lambda$30(Animatable animatable) {
        return ((Number) animatable.getValue()).floatValue() == 1.0f;
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$32(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SearchBarImpl_j1jLAyQ$lambda$35$lambda$34(Density density, Animatable animatable, Path path, Size size, LayoutDirection layoutDirection) {
        float mo367toPx0680j_4 = density.mo367toPx0680j_4(Dp.m7611constructorimpl((1.0f - ((Number) animatable.getValue()).floatValue()) * SearchBarCornerRadius));
        Path.addRoundRect$default(path, RoundRectKt.m4571RoundRectsniSvfs(androidx.compose.ui.geometry.SizeKt.m4606toRectuvyYCjk(size.m4590unboximpl()), CornerRadius.m4470constructorimpl((Float.floatToRawIntBits(mo367toPx0680j_4) << 32) | (Float.floatToRawIntBits(mo367toPx0680j_4) & 4294967295L))), null, 2, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SearchBarImpl_j1jLAyQ$lambda$37$lambda$36(Animatable animatable) {
        return ((Number) animatable.getValue()).floatValue() > 0.0f;
    }

    private static final boolean SearchBarImpl_j1jLAyQ$lambda$38(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SearchBarImpl_j1jLAyQ$lambda$39(Animatable animatable, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, Modifier modifier, my myVar, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, ny nyVar, int i, int i2, int i3, Composer composer, int i4) {
        m2325SearchBarImplj1jLAyQ(animatable, mutableFloatState, mutableState, mutableState2, modifier, myVar, shape, searchBarColors, f, f2, windowInsets, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0231, code lost:
    
        if (defpackage.q10.b(r5.rememberedValue(), java.lang.Integer.valueOf(r14)) == false) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SearchBarLayout(Animatable<Float, AnimationVector1D> animatable, MutableFloatState mutableFloatState, MutableState<gc> mutableState, MutableState<gc> mutableState2, Modifier modifier, WindowInsets windowInsets, my myVar, my myVar2, my myVar3, Composer composer, int i) {
        int i2;
        MutableFloatState mutableFloatState2;
        MutableState<gc> mutableState3;
        MutableState<gc> mutableState4;
        Modifier modifier2;
        int i3;
        Alignment.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(1217602934);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(animatable) : startRestartGroup.changedInstance(animatable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            mutableFloatState2 = mutableFloatState;
            i2 |= startRestartGroup.changed(mutableFloatState2) ? 32 : 16;
        } else {
            mutableFloatState2 = mutableFloatState;
        }
        if ((i & 384) == 0) {
            mutableState3 = mutableState;
            i2 |= startRestartGroup.changed(mutableState3) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            mutableState3 = mutableState;
        }
        if ((i & 3072) == 0) {
            mutableState4 = mutableState2;
            i2 |= startRestartGroup.changed(mutableState4) ? Fields.CameraDistance : Fields.RotationZ;
        } else {
            mutableState4 = mutableState2;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(windowInsets) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        int i4 = i2;
        int i5 = 1;
        if (startRestartGroup.shouldExecute((38347923 & i4) != 38347922, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1217602934, i4, -1, "androidx.compose.material3.SearchBarLayout (SearchBar.kt:2167)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue == companion2.getEmpty()) {
                rememberedValue = new MutableWindowInsets(null, i5, null == true ? 1 : 0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) rememberedValue;
            Modifier zIndex = ZIndexModifierKt.zIndex(modifier, 1.0f);
            boolean z = (i4 & 458752) == 131072;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new ml0(mutableWindowInsets, windowInsets, 2);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier consumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(zIndex, (ky) rememberedValue2), windowInsets);
            boolean z2 = ((i4 & 7168) == 2048) | ((i4 & 14) == 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(animatable))) | ((i4 & 112) == 32) | ((i4 & 896) == 256);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == companion2.getEmpty()) {
                MutableFloatState mutableFloatState3 = mutableFloatState2;
                MutableState<gc> mutableState5 = mutableState3;
                MutableState<gc> mutableState6 = mutableState4;
                modifier2 = consumeWindowInsets;
                i3 = 0;
                SearchBarKt$SearchBarLayout$2$1 searchBarKt$SearchBarLayout$2$1 = new SearchBarKt$SearchBarLayout$2$1(animatable, mutableWindowInsets, mutableState6, mutableFloatState3, mutableState5);
                startRestartGroup.updateRememberedValue(searchBarKt$SearchBarLayout$2$1);
                rememberedValue3 = searchBarKt$SearchBarLayout$2$1;
            } else {
                modifier2 = consumeWindowInsets;
                i3 = 0;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i3);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
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
            my b = k4.b(companion3, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
            Modifier.Companion companion4 = Modifier.Companion;
            Modifier layoutId = LayoutIdKt.layoutId(companion4, LayoutIdSurface);
            Alignment.Companion companion5 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), true);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i3);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
            iy constructor2 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
            my b2 = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
            if (m3878constructorimpl2.getInserting()) {
                companion = companion5;
            } else {
                companion = companion5;
            }
            k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            myVar2.invoke(startRestartGroup, Integer.valueOf((i4 >> 21) & 14));
            startRestartGroup.endNode();
            Modifier layoutId2 = LayoutIdKt.layoutId(companion4, LayoutIdInputField);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), true);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId2);
            iy constructor3 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3878constructorimpl3 = Updater.m3878constructorimpl(startRestartGroup);
            my b3 = k4.b(companion3, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
            if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
            }
            Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion3.getSetModifier());
            myVar.invoke(startRestartGroup, Integer.valueOf((i4 >> 18) & 14));
            startRestartGroup.endNode();
            if (myVar3 == null) {
                startRestartGroup.startReplaceGroup(2058820276);
            } else {
                startRestartGroup.startReplaceGroup(2058820277);
                Modifier layoutId3 = LayoutIdKt.layoutId(companion4, LayoutIdSearchContent);
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), true);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId3);
                iy constructor4 = companion3.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3878constructorimpl4 = Updater.m3878constructorimpl(startRestartGroup);
                my b4 = k4.b(companion3, m3878constructorimpl4, maybeCachedBoxMeasurePolicy3, m3878constructorimpl4, currentCompositionLocalMap4);
                if (m3878constructorimpl4.getInserting() || !q10.b(m3878constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    k4.j(b4, currentCompositeKeyHash4, m3878constructorimpl4, currentCompositeKeyHash4);
                }
                Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, companion3.getSetModifier());
                myVar3.invoke(startRestartGroup, 0);
                startRestartGroup.endNode();
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new qk(animatable, mutableFloatState, mutableState, mutableState2, modifier, windowInsets, myVar, myVar2, myVar3, i, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SearchBarLayout$lambda$42$lambda$41(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, WindowInsets windowInsets2) {
        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SearchBarLayout$lambda$49(Animatable animatable, MutableFloatState mutableFloatState, MutableState mutableState, MutableState mutableState2, Modifier modifier, WindowInsets windowInsets, my myVar, my myVar2, my myVar3, int i, Composer composer, int i2) {
        SearchBarLayout(animatable, mutableFloatState, mutableState, mutableState2, modifier, windowInsets, myVar, myVar2, myVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SearchBar_WuY5d9Q$lambda$28(String str, ky kyVar, ky kyVar2, boolean z, ky kyVar3, Modifier modifier, boolean z2, my myVar, my myVar2, my myVar3, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, int i3, Composer composer, int i4) {
        m2322SearchBarWuY5d9Q(str, kyVar, kyVar2, z, kyVar3, modifier, z2, myVar, myVar2, myVar3, shape, searchBarColors, f, f2, windowInsets, mutableInteractionSource, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SearchBar_Y92LkZI$lambda$22(my myVar, boolean z, ky kyVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2323SearchBarY92LkZI(myVar, z, kyVar, modifier, shape, searchBarColors, f, f2, windowInsets, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SearchBar_nbWgWpA$lambda$1$lambda$0(SearchBarState searchBarState, LayoutCoordinates layoutCoordinates) {
        searchBarState.setCollapsedCoords(layoutCoordinates);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SearchBar_nbWgWpA$lambda$2(SearchBarState searchBarState, my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, int i, int i2, Composer composer, int i3) {
        m2324SearchBarnbWgWpA(searchBarState, myVar, modifier, shape, searchBarColors, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: TopSearchBar-qKj4JfE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2326TopSearchBarqKj4JfE(SearchBarState searchBarState, my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, SearchBarScrollBehavior searchBarScrollBehavior, Composer composer, int i, int i2) {
        SearchBarState searchBarState2;
        int i3;
        my myVar2;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i4;
        float f3;
        int i5;
        float f4;
        WindowInsets windowInsets2;
        int i6;
        Modifier modifier2;
        SearchBarScrollBehavior searchBarScrollBehavior2;
        Composer composer2;
        float f5;
        float f6;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        int i7;
        int i8;
        WindowInsets windowInsets3;
        float f7;
        SearchBarColors searchBarColors3;
        float f8;
        Shape shape3;
        int i9;
        boolean z;
        int i10;
        Modifier modifier4;
        SearchBarScrollBehavior searchBarScrollBehavior3;
        Modifier modifier5;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(782822734);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            searchBarState2 = searchBarState;
        } else {
            searchBarState2 = searchBarState;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(searchBarState2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            myVar2 = myVar;
        } else {
            myVar2 = myVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
            }
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i13 = Fields.CameraDistance;
                        i3 |= i13;
                    }
                } else {
                    shape2 = shape;
                }
                i13 = Fields.RotationZ;
                i3 |= i13;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    searchBarColors2 = searchBarColors;
                    if (startRestartGroup.changed(searchBarColors2)) {
                        i12 = Fields.Clip;
                        i3 |= i12;
                    }
                } else {
                    searchBarColors2 = searchBarColors;
                }
                i12 = 8192;
                i3 |= i12;
            } else {
                searchBarColors2 = searchBarColors;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
                f3 = f;
            } else {
                f3 = f;
                if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changed(f3) ? Fields.RenderEffect : 65536;
                }
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                f4 = f2;
                i3 |= startRestartGroup.changed(f4) ? 1048576 : Fields.BlendMode;
                if ((12582912 & i) == 0) {
                    if ((i2 & Fields.SpotShadowColor) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i11 = GroupFlagsKt.IsNodeFlag;
                            i3 |= i11;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i11 = 4194304;
                    i3 |= i11;
                } else {
                    windowInsets2 = windowInsets;
                }
                i6 = i2 & Fields.RotationX;
                if (i6 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i3 |= startRestartGroup.changed(searchBarScrollBehavior) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier6 = i14 != 0 ? Modifier.Companion : modifier;
                        if ((i2 & 8) != 0) {
                            shape2 = SearchBarDefaults.INSTANCE.getInputFieldShape(startRestartGroup, 6);
                            i3 &= -7169;
                        }
                        int i15 = i3;
                        Shape shape4 = shape2;
                        if ((i2 & 16) != 0) {
                            i8 = i6;
                            modifier3 = modifier6;
                            i7 = 6;
                            i15 &= -57345;
                            searchBarColors2 = SearchBarDefaults.INSTANCE.m2306colorsKlgxPg(0L, 0L, null, startRestartGroup, 3072, 7);
                        } else {
                            modifier3 = modifier6;
                            i7 = 6;
                            i8 = i6;
                        }
                        if (i4 != 0) {
                            f3 = SearchBarDefaults.INSTANCE.m2311getTonalElevationD9Ej5fM();
                        }
                        float m2310getShadowElevationD9Ej5fM = i5 != 0 ? SearchBarDefaults.INSTANCE.m2310getShadowElevationD9Ej5fM() : f2;
                        if ((i2 & Fields.SpotShadowColor) != 0) {
                            windowInsets3 = SearchBarDefaults.INSTANCE.getWindowInsets(startRestartGroup, i7);
                            i15 &= -29360129;
                        } else {
                            windowInsets3 = windowInsets;
                        }
                        windowInsets2 = windowInsets3;
                        f7 = m2310getShadowElevationD9Ej5fM;
                        searchBarColors3 = searchBarColors2;
                        f8 = f3;
                        shape3 = shape4;
                        i9 = i15;
                        if (i8 != 0) {
                            searchBarScrollBehavior3 = null;
                            z = false;
                            i10 = 782822734;
                            modifier4 = modifier3;
                        } else {
                            z = false;
                            i10 = 782822734;
                            modifier4 = modifier3;
                            searchBarScrollBehavior3 = searchBarScrollBehavior;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & Fields.SpotShadowColor) != 0) {
                            i3 &= -29360129;
                        }
                        modifier4 = modifier;
                        i9 = i3;
                        searchBarColors3 = searchBarColors2;
                        f7 = f4;
                        f8 = f3;
                        z = false;
                        searchBarScrollBehavior3 = searchBarScrollBehavior;
                        shape3 = shape2;
                        i10 = 782822734;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(i10, i9, -1, "androidx.compose.material3.TopSearchBar (SearchBar.kt:292)");
                    }
                    if (searchBarScrollBehavior3 == null || (modifier5 = searchBarScrollBehavior3.searchBarScrollBehavior(Modifier.Companion)) == null) {
                        modifier5 = Modifier.Companion;
                    }
                    m2324SearchBarnbWgWpA(searchBarState2, myVar2, SizeKt.wrapContentWidth$default(SizeKt.fillMaxWidth$default(PaddingKt.m762padding3ABfNKs(WindowInsetsPaddingKt.windowInsetsPadding(modifier4.then(modifier5), windowInsets2), SearchBarAsTopBarPadding), 0.0f, 1, null), null, z, 3, null), shape3, searchBarColors3, f8, f7, startRestartGroup, i9 & 4193406, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    searchBarScrollBehavior2 = searchBarScrollBehavior3;
                    composer2 = startRestartGroup;
                    shape2 = shape3;
                    searchBarColors2 = searchBarColors3;
                    f5 = f8;
                    f6 = f7;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    windowInsets2 = windowInsets;
                    searchBarScrollBehavior2 = searchBarScrollBehavior;
                    composer2 = startRestartGroup;
                    f5 = f3;
                    f6 = f2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new p50(searchBarState, myVar, modifier2, shape2, searchBarColors2, f5, f6, windowInsets2, searchBarScrollBehavior2, i, i2));
                    return;
                }
                return;
            }
            f4 = f2;
            if ((12582912 & i) == 0) {
            }
            i6 = i2 & Fields.RotationX;
            if (i6 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        f4 = f2;
        if ((12582912 & i) == 0) {
        }
        i6 = i2 & Fields.RotationX;
        if (i6 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TopSearchBar_qKj4JfE$lambda$5(SearchBarState searchBarState, my myVar, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f, float f2, WindowInsets windowInsets, SearchBarScrollBehavior searchBarScrollBehavior, int i, int i2, Composer composer, int i3) {
        m2326TopSearchBarqKj4JfE(searchBarState, myVar, modifier, shape, searchBarColors, f, f2, windowInsets, searchBarScrollBehavior, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackMultiplier(gc gcVar, float f, float f2) {
        if (gcVar == null) {
            return 0.0f;
        }
        if (Float.isNaN(f2)) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetX-rOvwMX4, reason: not valid java name */
    public static final int m2331calculatePredictiveBackOffsetXrOvwMX4(long j, int i, gc gcVar, LayoutDirection layoutDirection, float f, float f2) {
        if (gcVar == null || f2 == 0.0f) {
            return 0;
        }
        return y80.P((1.0f - f) * ((Constraints.m7564getMaxWidthimpl(j) * SearchBarPredictiveBackMaxOffsetXRatio) - i) * f2 * (gcVar.d == 0 ? 1 : -1) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculatePredictiveBackOffsetY-dzo92Q0, reason: not valid java name */
    public static final int m2332calculatePredictiveBackOffsetYdzo92Q0(long j, int i, gc gcVar, gc gcVar2, int i2, int i3, float f) {
        if (gcVar2 == null || gcVar == null || f == 0.0f) {
            return 0;
        }
        int min = Math.min(Math.max(0, ((Constraints.m7563getMaxHeightimpl(j) - i2) / 2) - i), i3);
        float f2 = gcVar.b - gcVar2.b;
        float abs = Math.abs(f2) / Constraints.m7563getMaxHeightimpl(j);
        return y80.P(MathHelpersKt.lerp(0, min, abs) * f * Math.signum(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect getCollapsedBounds(SearchBarState searchBarState) {
        IntRect m7772IntRectVbeCjmY;
        LayoutCoordinates collapsedCoords = searchBarState.getCollapsedCoords();
        return (collapsedCoords == null || (m7772IntRectVbeCjmY = IntRectKt.m7772IntRectVbeCjmY(IntOffsetKt.m7756roundk4lQ0M(LayoutCoordinatesKt.positionInWindow(collapsedCoords)), collapsedCoords.mo6242getSizeYbymL2g())) == null) ? IntRect.Companion.getZero() : m7772IntRectVbeCjmY;
    }

    public static final float getDockedExpandedTableMinHeight() {
        return DockedExpandedTableMinHeight;
    }

    public static final float getSearchBarAsTopBarPadding() {
        return SearchBarAsTopBarPadding;
    }

    public static final float getSearchBarMinWidth() {
        return SearchBarMinWidth;
    }

    public static final float getSearchBarVerticalPadding() {
        return SearchBarVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isExpanded(SearchBarState searchBarState) {
        return searchBarState.getCurrentValue() == SearchBarValue.Expanded;
    }

    public static final SearchBarState rememberSearchBarState(SearchBarValue searchBarValue, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            searchBarValue = SearchBarValue.Collapsed;
        }
        if ((i2 & 2) != 0) {
            animationSpec = MotionSchemeKt.value(MotionSchemeKeyTokens.SlowSpatial, composer, 6);
        }
        if ((i2 & 4) != 0) {
            animationSpec2 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-546016819, i, -1, "androidx.compose.material3.rememberSearchBarState (SearchBar.kt:819)");
        }
        Object[] objArr = {searchBarValue, animationSpec, animationSpec2};
        Saver<SearchBarState, ?> Saver = SearchBarState.Companion.Saver(animationSpec, animationSpec2);
        boolean changedInstance = ((((i & 14) ^ 6) > 4 && composer.changed(searchBarValue.ordinal())) || (i & 6) == 4) | composer.changedInstance(animationSpec) | composer.changedInstance(animationSpec2);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new p9(searchBarValue, animationSpec, animationSpec2, 11);
            composer.updateRememberedValue(rememberedValue);
        }
        SearchBarState searchBarState = (SearchBarState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) Saver, (iy) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return searchBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarState rememberSearchBarState$lambda$27$lambda$26(SearchBarValue searchBarValue, AnimationSpec animationSpec, AnimationSpec animationSpec2) {
        return new SearchBarState(searchBarValue, (AnimationSpec<Float>) animationSpec, (AnimationSpec<Float>) animationSpec2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float transform(BackEventProgress.InProgress inProgress) {
        if (inProgress == null) {
            return 0.0f;
        }
        return PredictiveBack.INSTANCE.transform$material3(inProgress.getProgress());
    }

    private static /* synthetic */ void getSearchBarCornerRadius$annotations() {
    }

    private static /* synthetic */ void getCollapsedBounds$annotations(SearchBarState searchBarState) {
    }

    private static /* synthetic */ void isExpanded$annotations(SearchBarState searchBarState) {
    }
}
