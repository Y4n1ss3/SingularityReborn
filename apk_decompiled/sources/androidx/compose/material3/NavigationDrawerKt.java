package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.internal.BackHandler_androidKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.NavigationDrawerTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ac0;
import defpackage.bc0;
import defpackage.cc0;
import defpackage.gi0;
import defpackage.hz;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.l90;
import defpackage.m90;
import defpackage.mb0;
import defpackage.my;
import defpackage.ny;
import defpackage.o9;
import defpackage.p01;
import defpackage.q10;
import defpackage.q6;
import defpackage.r9;
import defpackage.st;
import defpackage.t5;
import defpackage.tp;
import defpackage.u5;
import defpackage.ud;
import defpackage.un;
import defpackage.uq;
import defpackage.v4;
import defpackage.vq;
import defpackage.w01;
import defpackage.wd;
import defpackage.xb0;
import defpackage.y80;
import defpackage.yb0;
import defpackage.z6;
import defpackage.zb0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NavigationDrawerKt {
    private static final float DrawerPositionalThreshold = 0.5f;
    private static final float DrawerVelocityThreshold = Dp.m7611constructorimpl(400.0f);
    private static final float MinimumDrawerWidth = Dp.m7611constructorimpl(240.0f);
    private static final float PredictiveBackDrawerMaxScaleXDistanceGrow = Dp.m7611constructorimpl(12.0f);
    private static final float PredictiveBackDrawerMaxScaleXDistanceShrink = Dp.m7611constructorimpl(24.0f);
    private static final float PredictiveBackDrawerMaxScaleYDistance = Dp.m7611constructorimpl(48.0f);
    private static final TweenSpec<Float> AnchoredDraggableDefaultAnimationSpec = new TweenSpec<>(Fields.RotationX, 0, null, 6, null);

    /* JADX WARN: Removed duplicated region for block: B:101:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d3  */
    /* renamed from: DismissibleDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2178DismissibleDrawerSheetSnr_uVM(DrawerState drawerState, Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Shape shape2;
        long j3;
        long j4;
        int i5;
        float f2;
        WindowInsets windowInsets2;
        Modifier modifier3;
        Shape shape3;
        long j5;
        float f3;
        long j6;
        ScopeUpdateScope endRestartGroup;
        int i6;
        WindowInsets windowInsets3;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(496605370);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(drawerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                shape2 = shape;
                i3 |= startRestartGroup.changed(shape2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i7 = Fields.CameraDistance;
                            i3 |= i7;
                        }
                    } else {
                        j3 = j;
                    }
                    i7 = Fields.RotationZ;
                    i3 |= i7;
                } else {
                    j3 = j;
                }
                if ((i & 24576) == 0) {
                    j4 = j2;
                    i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j4)) ? Fields.Clip : 8192;
                } else {
                    j4 = j2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    f2 = f;
                    i3 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                    if ((i & 1572864) == 0) {
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(windowInsets)) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i2 & Fields.SpotShadowColor) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i8 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if (i4 != 0) {
                                    shape2 = RectangleShapeKt.getRectangleShape();
                                }
                                if ((i2 & 8) != 0) {
                                    j3 = DrawerDefaults.INSTANCE.getStandardContainerColor(startRestartGroup, 6);
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    j4 = ColorSchemeKt.m1797contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                                    i3 &= -57345;
                                }
                                if (i5 != 0) {
                                    f2 = DrawerDefaults.INSTANCE.m1942getDismissibleDrawerElevationD9Ej5fM();
                                }
                                if ((i2 & 64) != 0) {
                                    modifier3 = modifier2;
                                    shape3 = shape2;
                                    j5 = j3;
                                    f3 = f2;
                                    j6 = j4;
                                    i6 = i3 & (-3670017);
                                    windowInsets3 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(496605370, i6, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:730)");
                                    }
                                    DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(1623455535, true, new NavigationDrawerKt$DismissibleDrawerSheet$2(windowInsets3, modifier3, shape3, j5, j6, f3, drawerState, nyVar), startRestartGroup, 54), startRestartGroup, (i6 & 14) | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    windowInsets2 = windowInsets3;
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
                            }
                            modifier3 = modifier2;
                            shape3 = shape2;
                            j5 = j3;
                            f3 = f2;
                            j6 = j4;
                            i6 = i3;
                            windowInsets3 = windowInsets;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(1623455535, true, new NavigationDrawerKt$DismissibleDrawerSheet$2(windowInsets3, modifier3, shape3, j5, j6, f3, drawerState, nyVar), startRestartGroup, 54), startRestartGroup, (i6 & 14) | 48);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            windowInsets2 = windowInsets3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            windowInsets2 = windowInsets;
                            modifier3 = modifier2;
                            shape3 = shape2;
                            j5 = j3;
                            f3 = f2;
                            j6 = j4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new zb0(drawerState, modifier3, shape3, j5, j6, f3, windowInsets2, nyVar, i, i2, 1));
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f2 = f;
                if ((i & 1572864) == 0) {
                }
                if ((i2 & Fields.SpotShadowColor) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            shape2 = shape;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f2 = f;
            if ((i & 1572864) == 0) {
            }
            if ((i2 & Fields.SpotShadowColor) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        shape2 = shape;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f2 = f;
        if ((i & 1572864) == 0) {
        }
        if ((i2 & Fields.SpotShadowColor) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ba  */
    /* renamed from: DismissibleDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2179DismissibleDrawerSheetafqeVBk(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        float f2;
        WindowInsets windowInsets2;
        Composer composer2;
        Modifier modifier3;
        Shape shape3;
        long j5;
        long j6;
        float f3;
        WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        long j7;
        long j8;
        float f4;
        WindowInsets windowInsets4;
        Modifier modifier4;
        Shape shape4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1496398234);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i7 = Fields.RotationX;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = Fields.SpotShadowColor;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? Fields.Clip : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i6 = Fields.RenderEffect;
                            i3 |= i6;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        shape3 = shape2;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        windowInsets3 = windowInsets2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i8 != 0 ? Modifier.Companion : modifier2;
                            if (i9 != 0) {
                                shape2 = RectangleShapeKt.getRectangleShape();
                            }
                            if ((i2 & 4) != 0) {
                                j3 = DrawerDefaults.INSTANCE.getStandardContainerColor(startRestartGroup, 6);
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                j4 = ColorSchemeKt.m1797contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            if (i4 != 0) {
                                f2 = DrawerDefaults.INSTANCE.m1942getDismissibleDrawerElevationD9Ej5fM();
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                shape4 = shape2;
                                j7 = j3;
                                j8 = j4;
                                f4 = f2;
                                modifier4 = modifier5;
                                windowInsets4 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            } else {
                                j7 = j3;
                                j8 = j4;
                                f4 = f2;
                                windowInsets4 = windowInsets2;
                                modifier4 = modifier5;
                                shape4 = shape2;
                            }
                            i5 = -1496398234;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            j7 = j3;
                            j8 = j4;
                            f4 = f2;
                            windowInsets4 = windowInsets2;
                            i5 = -1496398234;
                            modifier4 = modifier2;
                            shape4 = shape2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i5, i3, -1, "androidx.compose.material3.DismissibleDrawerSheet (NavigationDrawer.kt:686)");
                        }
                        int i10 = i3 << 6;
                        composer2 = startRestartGroup;
                        m2180DrawerSheetcm3T3N0(null, windowInsets4, modifier4, shape4, j7, j8, f4, null, nyVar, composer2, ((i3 >> 12) & 112) | 6 | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (i10 & 234881024), Fields.SpotShadowColor);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets3 = windowInsets4;
                        modifier3 = modifier4;
                        shape3 = shape4;
                        j5 = j7;
                        j6 = j8;
                        f3 = f4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new ac0(modifier3, shape3, j5, j6, f3, windowInsets3, nyVar, i, i2, 0));
                        return;
                    }
                    return;
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        shape2 = shape;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DismissibleDrawerSheet_Snr_uVM$lambda$46(DrawerState drawerState, Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2178DismissibleDrawerSheetSnr_uVM(drawerState, modifier, shape, j, j2, f, windowInsets, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DismissibleDrawerSheet_afqeVBk$lambda$45(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2179DismissibleDrawerSheetafqeVBk(modifier, shape, j, j2, f, windowInsets, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f8, code lost:
    
        if (defpackage.q10.b(r7.rememberedValue(), java.lang.Integer.valueOf(r10)) == false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DismissibleNavigationDrawer(my myVar, Modifier modifier, DrawerState drawerState, boolean z, my myVar2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        DrawerState drawerState2;
        int i4;
        boolean z2;
        boolean z3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        Object rememberedValue;
        Composer.Companion companion;
        boolean changed;
        Object rememberedValue2;
        Object rememberedValue3;
        Composer m3878constructorimpl;
        Alignment.Companion companion2;
        boolean z4;
        Object rememberedValue4;
        int currentCompositeKeyHash;
        Composer m3878constructorimpl2;
        boolean changed2;
        Object rememberedValue5;
        int i5;
        int currentCompositeKeyHash2;
        Composer m3878constructorimpl3;
        int currentCompositeKeyHash3;
        Composer m3878constructorimpl4;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1150092038);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    drawerState2 = drawerState;
                    if (startRestartGroup.changed(drawerState2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    drawerState2 = drawerState;
                }
                i6 = Fields.SpotShadowColor;
                i3 |= i6;
            } else {
                drawerState2 = drawerState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(myVar2) ? Fields.Clip : 8192;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.Companion;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            drawerState2 = rememberDrawerState(DrawerValue.Closed, null, startRestartGroup, 6, 2);
                        }
                        if (i4 != 0) {
                            modifier3 = modifier2;
                            z2 = true;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1150092038, i3, -1, "androidx.compose.material3.DismissibleNavigationDrawer (NavigationDrawer.kt:463)");
                            }
                            rememberedValue = startRestartGroup.rememberedValue();
                            companion = Composer.Companion;
                            if (rememberedValue == companion.getEmpty()) {
                                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            MutableState mutableState = (MutableState) rememberedValue;
                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
                            FiniteAnimationSpec value2 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                            int i8 = (i3 & 896) ^ 384;
                            changed = ((i8 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changed(density) | startRestartGroup.changedInstance(value) | startRestartGroup.changedInstance(value2);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == companion.getEmpty()) {
                                rememberedValue2 = new ud(drawerState2, density, value, value2, 5);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            EffectsKt.SideEffect((iy) rememberedValue2, startRestartGroup, 0);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == companion.getEmpty()) {
                                rememberedValue3 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            un unVar = (un) rememberedValue3;
                            Strings.Companion companion3 = Strings.Companion;
                            String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
                            boolean z5 = z2;
                            Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(modifier3, drawerState2.getAnchoredDraggableState$material3(), startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) != LayoutDirection.Rtl, Orientation.Horizontal, z5, (MutableInteractionSource) null, (OverscrollEffect) null, (FlingBehavior) null, 112, (Object) null);
                            Alignment.Companion companion4 = Alignment.Companion;
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default);
                            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                            iy constructor = companion5.getConstructor();
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
                            my b = k4.b(companion5, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                            if (m3878constructorimpl.getInserting()) {
                                companion2 = companion4;
                            } else {
                                companion2 = companion4;
                            }
                            k4.j(b, currentCompositeKeyHash4, m3878constructorimpl, currentCompositeKeyHash4);
                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion5.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            z4 = (i8 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256;
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!z4 || rememberedValue4 == companion.getEmpty()) {
                                rememberedValue4 = new NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1(drawerState2, mutableState);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue4;
                            Modifier.Companion companion6 = Modifier.Companion;
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion6);
                            iy constructor2 = companion5.getConstructor();
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
                            my b2 = k4.b(companion5, m3878constructorimpl2, measurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                            if (!m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                k4.j(b2, currentCompositeKeyHash, m3878constructorimpl2, currentCompositeKeyHash);
                            }
                            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion5.getSetModifier());
                            changed2 = startRestartGroup.changed(m2983getString2EP1pXo) | ((i8 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(unVar);
                            rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue5 == companion.getEmpty()) {
                                i5 = 1;
                                rememberedValue5 = new yb0(m2983getString2EP1pXo, drawerState2, unVar, i5);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            } else {
                                i5 = 1;
                            }
                            Modifier semantics$default = SemanticsModifierKt.semantics$default(companion6, false, (ky) rememberedValue5, i5, null);
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default);
                            iy constructor3 = companion5.getConstructor();
                            if (startRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.useNode();
                            } else {
                                startRestartGroup.createNode(constructor3);
                            }
                            m3878constructorimpl3 = Updater.m3878constructorimpl(startRestartGroup);
                            my b3 = k4.b(companion5, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                            if (!m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                k4.j(b3, currentCompositeKeyHash2, m3878constructorimpl3, currentCompositeKeyHash2);
                            }
                            Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion5.getSetModifier());
                            myVar.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
                            startRestartGroup.endNode();
                            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                            currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion6);
                            iy constructor4 = companion5.getConstructor();
                            if (startRestartGroup.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.useNode();
                            } else {
                                startRestartGroup.createNode(constructor4);
                            }
                            m3878constructorimpl4 = Updater.m3878constructorimpl(startRestartGroup);
                            my b4 = k4.b(companion5, m3878constructorimpl4, maybeCachedBoxMeasurePolicy3, m3878constructorimpl4, currentCompositionLocalMap4);
                            if (!m3878constructorimpl4.getInserting() || !q10.b(m3878constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                k4.j(b4, currentCompositeKeyHash3, m3878constructorimpl4, currentCompositeKeyHash3);
                            }
                            Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, companion5.getSetModifier());
                            myVar2.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                            startRestartGroup.endNode();
                            startRestartGroup.endNode();
                            startRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            z3 = z5;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                    }
                    modifier3 = modifier2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue;
                    Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    FiniteAnimationSpec value3 = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
                    FiniteAnimationSpec value22 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                    int i82 = (i3 & 896) ^ 384;
                    changed = ((i82 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changed(density2) | startRestartGroup.changedInstance(value3) | startRestartGroup.changedInstance(value22);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new ud(drawerState2, density2, value3, value22, 5);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    EffectsKt.SideEffect((iy) rememberedValue2, startRestartGroup, 0);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == companion.getEmpty()) {
                    }
                    un unVar2 = (un) rememberedValue3;
                    Strings.Companion companion32 = Strings.Companion;
                    String m2983getString2EP1pXo2 = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
                    boolean z52 = z2;
                    Modifier anchoredDraggable$default2 = AnchoredDraggableKt.anchoredDraggable$default(modifier3, drawerState2.getAnchoredDraggableState$material3(), startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) != LayoutDirection.Rtl, Orientation.Horizontal, z52, (MutableInteractionSource) null, (OverscrollEffect) null, (FlingBehavior) null, 112, (Object) null);
                    Alignment.Companion companion42 = Alignment.Companion;
                    MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion42.getTopStart(), false);
                    int currentCompositeKeyHash42 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default2);
                    ComposeUiNode.Companion companion52 = ComposeUiNode.Companion;
                    iy constructor5 = companion52.getConstructor();
                    if (startRestartGroup.getApplier() == null) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                    my b5 = k4.b(companion52, m3878constructorimpl, maybeCachedBoxMeasurePolicy4, m3878constructorimpl, currentCompositionLocalMap5);
                    if (m3878constructorimpl.getInserting()) {
                    }
                    k4.j(b5, currentCompositeKeyHash42, m3878constructorimpl, currentCompositeKeyHash42);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier5, companion52.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    if (i82 <= 256) {
                    }
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!z4) {
                    }
                    rememberedValue4 = new NavigationDrawerKt$DismissibleNavigationDrawer$2$2$1(drawerState2, mutableState2);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    MeasurePolicy measurePolicy2 = (MeasurePolicy) rememberedValue4;
                    Modifier.Companion companion62 = Modifier.Companion;
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion62);
                    iy constructor22 = companion52.getConstructor();
                    if (startRestartGroup.getApplier() == null) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
                    my b22 = k4.b(companion52, m3878constructorimpl2, measurePolicy2, m3878constructorimpl2, currentCompositionLocalMap22);
                    if (!m3878constructorimpl2.getInserting()) {
                    }
                    k4.j(b22, currentCompositeKeyHash, m3878constructorimpl2, currentCompositeKeyHash);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier22, companion52.getSetModifier());
                    changed2 = startRestartGroup.changed(m2983getString2EP1pXo2) | ((i82 <= 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(unVar2);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changed2) {
                    }
                    i5 = 1;
                    rememberedValue5 = new yb0(m2983getString2EP1pXo2, drawerState2, unVar2, i5);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    Modifier semantics$default2 = SemanticsModifierKt.semantics$default(companion62, false, (ky) rememberedValue5, i5, null);
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default2);
                    iy constructor32 = companion52.getConstructor();
                    if (startRestartGroup.getApplier() == null) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m3878constructorimpl3 = Updater.m3878constructorimpl(startRestartGroup);
                    my b32 = k4.b(companion52, m3878constructorimpl3, maybeCachedBoxMeasurePolicy22, m3878constructorimpl3, currentCompositionLocalMap32);
                    if (!m3878constructorimpl3.getInserting()) {
                    }
                    k4.j(b32, currentCompositeKeyHash2, m3878constructorimpl3, currentCompositeKeyHash2);
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier32, companion52.getSetModifier());
                    myVar.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
                    startRestartGroup.endNode();
                    MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap42 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier42 = ComposedModifierKt.materializeModifier(startRestartGroup, companion62);
                    iy constructor42 = companion52.getConstructor();
                    if (startRestartGroup.getApplier() == null) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m3878constructorimpl4 = Updater.m3878constructorimpl(startRestartGroup);
                    my b42 = k4.b(companion52, m3878constructorimpl4, maybeCachedBoxMeasurePolicy32, m3878constructorimpl4, currentCompositionLocalMap42);
                    if (!m3878constructorimpl4.getInserting()) {
                    }
                    k4.j(b42, currentCompositeKeyHash3, m3878constructorimpl4, currentCompositeKeyHash3);
                    Updater.m3886setimpl(m3878constructorimpl4, materializeModifier42, companion52.getSetModifier());
                    myVar2.invoke(startRestartGroup, Integer.valueOf((i3 >> 12) & 14));
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    z3 = z52;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z3 = z2;
                }
                DrawerState drawerState3 = drawerState2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new tp(myVar, modifier2, drawerState3, z3, myVar2, i, i2, 2));
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            DrawerState drawerState32 = drawerState2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        DrawerState drawerState322 = drawerState2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DismissibleNavigationDrawer$lambda$27(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DismissibleNavigationDrawer$lambda$28(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DismissibleNavigationDrawer$lambda$30$lambda$29(DrawerState drawerState, Density density, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2) {
        drawerState.setDensity$material3(density);
        drawerState.setOpenDrawerMotionSpec$material3(finiteAnimationSpec);
        drawerState.setCloseDrawerMotionSpec$material3(finiteAnimationSpec2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DismissibleNavigationDrawer$lambda$38$lambda$36$lambda$33$lambda$32(String str, DrawerState drawerState, un unVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        if (drawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new xb0(drawerState, unVar, 1), 1, null);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DismissibleNavigationDrawer$lambda$38$lambda$36$lambda$33$lambda$32$lambda$31(DrawerState drawerState, un unVar) {
        if (!((Boolean) drawerState.getConfirmStateChange$material3().invoke(DrawerValue.Closed)).booleanValue()) {
            return true;
        }
        p01.t(unVar, null, null, new NavigationDrawerKt$DismissibleNavigationDrawer$2$1$1$1$1$1(drawerState, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DismissibleNavigationDrawer$lambda$39(my myVar, Modifier modifier, DrawerState drawerState, boolean z, my myVar2, int i, int i2, Composer composer, int i3) {
        DismissibleNavigationDrawer(myVar, modifier, drawerState, z, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final void DrawerPredictiveBackHandler(DrawerState drawerState, ny nyVar, Composer composer, int i) {
        int i2;
        Object navigationDrawerKt$DrawerPredictiveBackHandler$2$1;
        boolean z;
        Composer startRestartGroup = composer.startRestartGroup(-383087355);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(drawerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar) ? 32 : 16;
        }
        int i3 = i2;
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-383087355, i3, -1, "androidx.compose.material3.DrawerPredictiveBackHandler (NavigationDrawer.kt:941)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new DrawerPredictiveBackState();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DrawerPredictiveBackState drawerPredictiveBackState = (DrawerPredictiveBackState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            un unVar = (un) rememberedValue2;
            boolean z2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
            gi0 gi0Var = new gi0();
            gi0 gi0Var2 = new gi0();
            gi0 gi0Var3 = new gi0();
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            gi0Var.d = density.mo367toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceGrow);
            gi0Var2.d = density.mo367toPx0680j_4(PredictiveBackDrawerMaxScaleXDistanceShrink);
            gi0Var3.d = density.mo367toPx0680j_4(PredictiveBackDrawerMaxScaleYDistance);
            boolean isOpen = drawerState.isOpen();
            int i4 = i3 & 14;
            boolean changed = startRestartGroup.changed(z2) | startRestartGroup.changed(gi0Var.d) | startRestartGroup.changed(gi0Var2.d) | startRestartGroup.changed(gi0Var3.d) | startRestartGroup.changedInstance(unVar) | (i4 == 4);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                z = isOpen;
                navigationDrawerKt$DrawerPredictiveBackHandler$2$1 = new NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(drawerPredictiveBackState, unVar, drawerState, z2, gi0Var, gi0Var2, gi0Var3, null);
                startRestartGroup.updateRememberedValue(navigationDrawerKt$DrawerPredictiveBackHandler$2$1);
            } else {
                z = isOpen;
                navigationDrawerKt$DrawerPredictiveBackHandler$2$1 = rememberedValue3;
            }
            BackHandler_androidKt.PredictiveBackHandler(z, (my) navigationDrawerKt$DrawerPredictiveBackHandler$2$1, startRestartGroup, 0, 0);
            Boolean valueOf = Boolean.valueOf(drawerState.isClosed());
            boolean z3 = i4 == 4;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new NavigationDrawerKt$DrawerPredictiveBackHandler$3$1(drawerState, drawerPredictiveBackState, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            EffectsKt.LaunchedEffect(valueOf, (my) rememberedValue4, startRestartGroup, 0);
            nyVar.invoke(drawerPredictiveBackState, startRestartGroup, Integer.valueOf((i3 & 112) | 6));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(drawerState, nyVar, i, 24));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DrawerPredictiveBackHandler$lambda$62(DrawerState drawerState, ny nyVar, int i, Composer composer, int i2) {
        DrawerPredictiveBackHandler(drawerState, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: DrawerSheet-cm3T3N0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2180DrawerSheetcm3T3N0(final DrawerPredictiveBackState drawerPredictiveBackState, WindowInsets windowInsets, Modifier modifier, Shape shape, long j, long j2, float f, FloatProducer floatProducer, final ny nyVar, Composer composer, int i, int i2) {
        int i3;
        WindowInsets windowInsets2;
        int i4;
        Modifier modifier2;
        int i5;
        Shape shape2;
        long j3;
        long j4;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        Modifier modifier3;
        Shape shape3;
        long j5;
        long j6;
        float f2;
        FloatProducer floatProducer2;
        ScopeUpdateScope endRestartGroup;
        int i9;
        FloatProducer floatProducer3;
        float f3;
        long j7;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1560288494);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(drawerPredictiveBackState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            windowInsets2 = windowInsets;
            i3 |= startRestartGroup.changed(windowInsets2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    shape2 = shape;
                    i3 |= startRestartGroup.changed(shape2) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i13 = Fields.Clip;
                                i3 |= i13;
                            }
                        } else {
                            j3 = j;
                        }
                        i13 = 8192;
                        i3 |= i13;
                    } else {
                        j3 = j;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            j4 = j2;
                            if (startRestartGroup.changed(j4)) {
                                i12 = Fields.RenderEffect;
                                i3 |= i12;
                            }
                        } else {
                            j4 = j2;
                        }
                        i12 = 65536;
                        i3 |= i12;
                    } else {
                        j4 = j2;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(f) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & Fields.SpotShadowColor) == 0) {
                            if ((16777216 & i) == 0 ? startRestartGroup.changed(floatProducer) : startRestartGroup.changedInstance(floatProducer)) {
                                i11 = GroupFlagsKt.IsNodeFlag;
                                i3 |= i11;
                            }
                        }
                        i11 = 4194304;
                        i3 |= i11;
                    }
                    if ((i2 & Fields.RotationX) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i7 = i3 & 38347923;
                        i8 = i3;
                        int i14 = 1;
                        if (startRestartGroup.shouldExecute(i7 != 38347922, i8 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i4 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if (i5 != 0) {
                                    shape2 = RectangleShapeKt.getRectangleShape();
                                }
                                if ((i2 & 16) != 0) {
                                    j3 = DrawerDefaults.INSTANCE.getStandardContainerColor(startRestartGroup, 6);
                                    i9 = i8 & (-57345);
                                } else {
                                    i9 = i8;
                                }
                                if ((i2 & 32) != 0) {
                                    j4 = ColorSchemeKt.m1797contentColorForek8zF_U(j3, startRestartGroup, (i9 >> 12) & 14);
                                    i9 &= -458753;
                                }
                                float m1945getPermanentDrawerElevationD9Ej5fM = i6 != 0 ? DrawerDefaults.INSTANCE.m1945getPermanentDrawerElevationD9Ej5fM() : f;
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = new vq(i14);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    floatProducer3 = (FloatProducer) rememberedValue;
                                    i9 &= -29360129;
                                } else {
                                    floatProducer3 = floatProducer;
                                }
                                f3 = m1945getPermanentDrawerElevationD9Ej5fM;
                                j7 = j3;
                                i10 = 12582912;
                                z = false;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i9 = (i2 & 16) != 0 ? i8 & (-57345) : i8;
                                if ((i2 & 32) != 0) {
                                    i9 &= -458753;
                                }
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    i9 &= -29360129;
                                }
                                f3 = f;
                                j7 = j3;
                                i10 = 12582912;
                                z = false;
                                floatProducer3 = floatProducer;
                            }
                            long j8 = j4;
                            Shape shape4 = shape2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1560288494, i9, -1, "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)");
                            }
                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            final float m3443getContainerWidthD9Ej5fM = NavigationDrawerTokens.INSTANCE.m3443getContainerWidthD9Ej5fM();
                            final float mo367toPx0680j_4 = density.mo367toPx0680j_4(m3443getContainerWidthD9Ej5fM);
                            if (startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                                z = true;
                            }
                            Modifier modifier4 = modifier2;
                            final FloatProducer floatProducer4 = floatProducer3;
                            final WindowInsets windowInsets3 = windowInsets2;
                            final boolean z2 = z;
                            int i15 = i9 >> 6;
                            composer2 = startRestartGroup;
                            SurfaceKt.m2464SurfaceT9BRK9s(SizeKt.fillMaxHeight$default(horizontalScaleUp(SizeKt.m811sizeInqDBjuR0$default(modifier4, MinimumDrawerWidth, 0.0f, m3443getContainerWidthD9Ej5fM, 0.0f, 10, null), floatProducer3, mo367toPx0680j_4, z).then(drawerPredictiveBackState != null ? predictiveBackDrawerContainer(Modifier.Companion, drawerPredictiveBackState, z) : Modifier.Companion), 0.0f, 1, null), shape4, j7, j8, f3, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-315420087, true, new my() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$2
                                public final void invoke(Composer composer3, int i16) {
                                    Modifier modifier5;
                                    Modifier modifier6;
                                    float f4;
                                    Modifier horizontalScaleDown;
                                    if (!composer3.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-315420087, i16, -1, "androidx.compose.material3.DrawerSheet.<anonymous> (NavigationDrawer.kt:827)");
                                    }
                                    DrawerPredictiveBackState drawerPredictiveBackState2 = DrawerPredictiveBackState.this;
                                    if (drawerPredictiveBackState2 != null) {
                                        Modifier.Companion companion = Modifier.Companion;
                                        modifier5 = NavigationDrawerKt.predictiveBackDrawerChild(companion, drawerPredictiveBackState2, z2);
                                        modifier6 = companion;
                                    } else {
                                        modifier5 = Modifier.Companion;
                                        modifier6 = modifier5;
                                    }
                                    f4 = NavigationDrawerKt.MinimumDrawerWidth;
                                    horizontalScaleDown = NavigationDrawerKt.horizontalScaleDown(SizeKt.m811sizeInqDBjuR0$default(modifier6, f4, 0.0f, m3443getContainerWidthD9Ej5fM, 0.0f, 10, null), floatProducer4, mo367toPx0680j_4, z2);
                                    Modifier windowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(horizontalScaleDown.then(modifier5), windowInsets3);
                                    ny nyVar2 = nyVar;
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, windowInsetsPadding);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                    iy constructor = companion2.getConstructor();
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
                                    my b = k4.b(companion2, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                    }
                                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                                    nyVar2.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
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
                            }, startRestartGroup, 54), composer2, (i15 & 112) | i10 | (i15 & 896) | (i15 & 7168) | (i15 & 57344), 96);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            shape3 = shape4;
                            j5 = j7;
                            j6 = j8;
                            f2 = f3;
                            floatProducer2 = floatProducer3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            shape3 = shape2;
                            j5 = j3;
                            j6 = j4;
                            f2 = f;
                            floatProducer2 = floatProducer;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new z6(drawerPredictiveBackState, windowInsets, modifier3, shape3, j5, j6, f2, floatProducer2, nyVar, i, i2));
                            return;
                        }
                        return;
                    }
                    i7 = i3 & 38347923;
                    i8 = i3;
                    int i142 = 1;
                    if (startRestartGroup.shouldExecute(i7 != 38347922, i8 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                shape2 = shape;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i2 & Fields.RotationX) == 0) {
                }
                i7 = i3 & 38347923;
                i8 = i3;
                int i1422 = 1;
                if (startRestartGroup.shouldExecute(i7 != 38347922, i8 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            shape2 = shape;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i2 & Fields.RotationX) == 0) {
            }
            i7 = i3 & 38347923;
            i8 = i3;
            int i14222 = 1;
            if (startRestartGroup.shouldExecute(i7 != 38347922, i8 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        windowInsets2 = windowInsets;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        shape2 = shape;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i2 & Fields.RotationX) == 0) {
        }
        i7 = i3 & 38347923;
        i8 = i3;
        int i142222 = 1;
        if (startRestartGroup.shouldExecute(i7 != 38347922, i8 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float DrawerSheet_cm3T3N0$lambda$51$lambda$50() {
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DrawerSheet_cm3T3N0$lambda$53(DrawerPredictiveBackState drawerPredictiveBackState, WindowInsets windowInsets, Modifier modifier, Shape shape, long j, long j2, float f, FloatProducer floatProducer, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2180DrawerSheetcm3T3N0(drawerPredictiveBackState, windowInsets, modifier, shape, j, j2, f, floatProducer, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b6  */
    /* renamed from: ModalDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2181ModalDrawerSheetSnr_uVM(DrawerState drawerState, Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        float f2;
        WindowInsets windowInsets2;
        Modifier modifier3;
        Shape shape3;
        long j5;
        long j6;
        float f3;
        WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        int i5;
        WindowInsets windowInsets4;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1620540727);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(drawerState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (startRestartGroup.changed(shape2)) {
                        i9 = Fields.RotationX;
                        i3 |= i9;
                    }
                } else {
                    shape2 = shape;
                }
                i9 = Fields.SpotShadowColor;
                i3 |= i9;
            } else {
                shape2 = shape;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i8 = Fields.CameraDistance;
                        i3 |= i8;
                    }
                } else {
                    j3 = j;
                }
                i8 = Fields.RotationZ;
                i3 |= i8;
            } else {
                j3 = j;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i7 = Fields.Clip;
                        i3 |= i7;
                    }
                } else {
                    j4 = j2;
                }
                i7 = 8192;
                i3 |= i7;
            } else {
                j4 = j2;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i6 = 1048576;
                            i3 |= i6;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i6 = Fields.BlendMode;
                    i3 |= i6;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        shape3 = shape2;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        windowInsets3 = windowInsets2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i10 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                shape2 = DrawerDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            }
                            if ((i2 & 8) != 0) {
                                j3 = DrawerDefaults.INSTANCE.getModalContainerColor(startRestartGroup, 6);
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                j4 = ColorSchemeKt.m1797contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 9) & 14);
                                i3 &= -57345;
                            }
                            if (i4 != 0) {
                                f2 = DrawerDefaults.INSTANCE.m1944getModalDrawerElevationD9Ej5fM();
                            }
                            if ((i2 & 64) != 0) {
                                modifier3 = modifier2;
                                shape3 = shape2;
                                j5 = j3;
                                j6 = j4;
                                f3 = f2;
                                i5 = i3 & (-3670017);
                                windowInsets4 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1620540727, i5, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:641)");
                                }
                                DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(797187326, true, new NavigationDrawerKt$ModalDrawerSheet$2(windowInsets4, modifier3, shape3, j5, j6, f3, drawerState, nyVar), startRestartGroup, 54), startRestartGroup, (i5 & 14) | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                windowInsets3 = windowInsets4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                        }
                        modifier3 = modifier2;
                        shape3 = shape2;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        i5 = i3;
                        windowInsets4 = windowInsets2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        DrawerPredictiveBackHandler(drawerState, ComposableLambdaKt.rememberComposableLambda(797187326, true, new NavigationDrawerKt$ModalDrawerSheet$2(windowInsets4, modifier3, shape3, j5, j6, f3, drawerState, nyVar), startRestartGroup, 54), startRestartGroup, (i5 & 14) | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        windowInsets3 = windowInsets4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new zb0(drawerState, modifier3, shape3, j5, j6, f3, windowInsets3, nyVar, i, i2, 0));
                        return;
                    }
                    return;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            if ((1572864 & i) == 0) {
            }
            if ((i2 & Fields.SpotShadowColor) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        f2 = f;
        if ((1572864 & i) == 0) {
        }
        if ((i2 & Fields.SpotShadowColor) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d8  */
    /* renamed from: ModalDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2182ModalDrawerSheetafqeVBk(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        long j3;
        long j4;
        float f2;
        WindowInsets windowInsets2;
        Composer composer2;
        Modifier modifier3;
        Shape shape3;
        long j5;
        long j6;
        float f3;
        WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        long j7;
        float f4;
        WindowInsets windowInsets4;
        int i4;
        Modifier modifier4;
        int i5;
        long j8;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1922633461);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                shape2 = shape;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            shape2 = shape;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                if (startRestartGroup.changed(j3)) {
                    i8 = Fields.RotationX;
                    i3 |= i8;
                }
            } else {
                j3 = j;
            }
            i8 = Fields.SpotShadowColor;
            i3 |= i8;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j4 = j2;
                if (startRestartGroup.changed(j4)) {
                    i7 = Fields.CameraDistance;
                    i3 |= i7;
                }
            } else {
                j4 = j2;
            }
            i7 = Fields.RotationZ;
            i3 |= i7;
        } else {
            j4 = j2;
        }
        int i11 = i2 & 16;
        if (i11 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            f2 = f;
            i3 |= startRestartGroup.changed(f2) ? Fields.Clip : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    windowInsets2 = windowInsets;
                    if (startRestartGroup.changed(windowInsets2)) {
                        i6 = Fields.RenderEffect;
                        i3 |= i6;
                    }
                } else {
                    windowInsets2 = windowInsets;
                }
                i6 = 65536;
                i3 |= i6;
            } else {
                windowInsets2 = windowInsets;
            }
            if ((i2 & 64) == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier5 = i10 != 0 ? Modifier.Companion : modifier2;
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                            shape2 = DrawerDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            j3 = DrawerDefaults.INSTANCE.getModalContainerColor(startRestartGroup, 6);
                        }
                        if ((i2 & 8) != 0) {
                            long m1797contentColorForek8zF_U = ColorSchemeKt.m1797contentColorForek8zF_U(j3, startRestartGroup, (i3 >> 6) & 14);
                            i3 &= -7169;
                            j4 = m1797contentColorForek8zF_U;
                        }
                        if (i11 != 0) {
                            f2 = DrawerDefaults.INSTANCE.m1944getModalDrawerElevationD9Ej5fM();
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                            modifier4 = modifier5;
                            shape4 = shape2;
                            j7 = j4;
                            f4 = f2;
                            i5 = 6;
                            windowInsets4 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            j8 = j3;
                            i4 = 1922633461;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i4, i3, -1, "androidx.compose.material3.ModalDrawerSheet (NavigationDrawer.kt:597)");
                            }
                            int i12 = ((i3 >> 12) & 112) | i5;
                            int i13 = i3 << 6;
                            composer2 = startRestartGroup;
                            m2180DrawerSheetcm3T3N0(null, windowInsets4, modifier4, shape4, j8, j7, f4, null, nyVar, composer2, i12 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i13) | (i13 & 234881024), Fields.SpotShadowColor);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            windowInsets3 = windowInsets4;
                            modifier3 = modifier4;
                            shape3 = shape4;
                            j5 = j8;
                            j6 = j7;
                            f3 = f4;
                        } else {
                            shape4 = shape2;
                            j7 = j4;
                            f4 = f2;
                            windowInsets4 = windowInsets2;
                            i4 = 1922633461;
                            modifier4 = modifier5;
                            i5 = 6;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        shape4 = shape2;
                        j7 = j4;
                        f4 = f2;
                        windowInsets4 = windowInsets2;
                        i5 = 6;
                        i4 = 1922633461;
                        modifier4 = modifier2;
                    }
                    j8 = j3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i122 = ((i3 >> 12) & 112) | i5;
                    int i132 = i3 << 6;
                    composer2 = startRestartGroup;
                    m2180DrawerSheetcm3T3N0(null, windowInsets4, modifier4, shape4, j8, j7, f4, null, nyVar, composer2, i122 | (i132 & 896) | (i132 & 7168) | (57344 & i132) | (458752 & i132) | (3670016 & i132) | (i132 & 234881024), Fields.SpotShadowColor);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    windowInsets3 = windowInsets4;
                    modifier3 = modifier4;
                    shape3 = shape4;
                    j5 = j8;
                    j6 = j7;
                    f3 = f4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    shape3 = shape2;
                    j5 = j3;
                    j6 = j4;
                    f3 = f2;
                    windowInsets3 = windowInsets2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new ac0(modifier3, shape3, j5, j6, f3, windowInsets3, nyVar, i, i2, 1));
                    return;
                }
                return;
            }
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        if ((196608 & i) != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalDrawerSheet_Snr_uVM$lambda$44(DrawerState drawerState, Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2181ModalDrawerSheetSnr_uVM(drawerState, modifier, shape, j, j2, f, windowInsets, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalDrawerSheet_afqeVBk$lambda$43(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2182ModalDrawerSheetafqeVBk(modifier, shape, j, j2, f, windowInsets, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0172, code lost:
    
        if (r9 == r16.getEmpty()) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02cd, code lost:
    
        if (defpackage.q10.b(r15.rememberedValue(), java.lang.Integer.valueOf(r9)) == false) goto L156;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* renamed from: ModalNavigationDrawer-FHprtrg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2183ModalNavigationDrawerFHprtrg(my myVar, Modifier modifier, DrawerState drawerState, boolean z, long j, my myVar2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        DrawerState drawerState2;
        int i4;
        long j2;
        boolean z2;
        Modifier modifier3;
        DrawerState drawerState3;
        long j3;
        my myVar3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        boolean z3;
        long j4;
        float f;
        ComposeUiNode.Companion companion;
        boolean z4;
        int i5;
        my myVar4 = myVar;
        Composer startRestartGroup = composer.startRestartGroup(-1907430816);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(myVar4) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    drawerState2 = drawerState;
                    if (startRestartGroup.changed(drawerState2)) {
                        i5 = Fields.RotationX;
                        i3 |= i5;
                    }
                } else {
                    drawerState2 = drawerState;
                }
                i5 = Fields.SpotShadowColor;
                i3 |= i5;
            } else {
                drawerState2 = drawerState;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(z) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    j2 = j;
                    i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(j2)) ? Fields.Clip : 8192;
                } else {
                    j2 = j;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= startRestartGroup.changedInstance(myVar2) ? Fields.RenderEffect : 65536;
                }
                if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        modifier4 = i6 != 0 ? Modifier.Companion : modifier2;
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                            drawerState2 = rememberDrawerState(DrawerValue.Closed, null, startRestartGroup, 6, 2);
                        }
                        z3 = i4 != 0 ? true : z;
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            j4 = DrawerDefaults.INSTANCE.getScrimColor(startRestartGroup, 6);
                        } else {
                            j4 = j2;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        modifier4 = modifier2;
                        j4 = j2;
                        z3 = z;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1907430816, i3, -1, "androidx.compose.material3.ModalNavigationDrawer (NavigationDrawer.kt:338)");
                    }
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    Composer.Companion companion2 = Composer.Companion;
                    if (rememberedValue == companion2.getEmpty()) {
                        rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    un unVar = (un) rememberedValue;
                    Strings.Companion companion3 = Strings.Companion;
                    String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
                    Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == companion2.getEmpty()) {
                        rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState = (MutableState) rememberedValue2;
                    boolean changed = startRestartGroup.changed(density);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed) {
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                    }
                    rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue3;
                    MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
                    boolean z5 = z3;
                    FiniteAnimationSpec value = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
                    FiniteAnimationSpec value2 = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
                    FiniteAnimationSpec value3 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
                    int i7 = (i3 & 896) ^ 384;
                    long j5 = j4;
                    boolean changed2 = ((i7 > 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changed(density) | startRestartGroup.changedInstance(value2) | startRestartGroup.changedInstance(value3) | startRestartGroup.changedInstance(value);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue4 == companion2.getEmpty()) {
                        rememberedValue4 = new o9(drawerState2, density, value2, value3, value, 2);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    EffectsKt.SideEffect((iy) rememberedValue4, startRestartGroup, 0);
                    Modifier anchoredDraggable$default = AnchoredDraggableKt.anchoredDraggable$default(SizeKt.fillMaxSize$default(modifier4, f, 1, null), drawerState2.getAnchoredDraggableState$material3(), startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl, Orientation.Horizontal, z5, (MutableInteractionSource) null, (OverscrollEffect) null, (FlingBehavior) null, 112, (Object) null);
                    Alignment.Companion companion4 = Alignment.Companion;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, anchoredDraggable$default);
                    Modifier modifier5 = modifier4;
                    ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                    iy constructor = companion5.getConstructor();
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
                    my b = k4.b(companion5, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion5.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion6 = Modifier.Companion;
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion6);
                    iy constructor2 = companion5.getConstructor();
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
                    my b2 = k4.b(companion5, m3878constructorimpl2, maybeCachedBoxMeasurePolicy2, m3878constructorimpl2, currentCompositionLocalMap2);
                    if (m3878constructorimpl2.getInserting()) {
                        companion = companion5;
                    } else {
                        companion = companion5;
                    }
                    k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion.getSetModifier());
                    myVar2.invoke(startRestartGroup, Integer.valueOf((i3 >> 15) & 14));
                    startRestartGroup.endNode();
                    boolean isOpen = drawerState2.isOpen();
                    boolean changedInstance = ((i7 > 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | ((i3 & 7168) == 2048) | startRestartGroup.changedInstance(unVar);
                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue5 == companion2.getEmpty()) {
                        rememberedValue5 = new r9(z5, drawerState2, unVar);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    iy iyVar = (iy) rememberedValue5;
                    boolean changed3 = startRestartGroup.changed(mutableFloatState) | ((i7 > 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256);
                    Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (changed3 || rememberedValue6 == companion2.getEmpty()) {
                        rememberedValue6 = new v4(24, drawerState2, mutableFloatState);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    int i8 = 1;
                    m2185ScrimBx497Mc(isOpen, iyVar, (iy) rememberedValue6, j5, startRestartGroup, (i3 >> 3) & 7168);
                    boolean z6 = (i7 > 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256;
                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (z6 || rememberedValue7 == companion2.getEmpty()) {
                        rememberedValue7 = new mb0(drawerState2, i8);
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    Modifier offset = OffsetKt.offset(companion6, (ky) rememberedValue7);
                    boolean changed4 = startRestartGroup.changed(m2983getString2EP1pXo) | ((i7 > 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(unVar);
                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if (changed4 || rememberedValue8 == companion2.getEmpty()) {
                        z4 = false;
                        rememberedValue8 = new yb0(m2983getString2EP1pXo, drawerState2, unVar, false ? 1 : 0);
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    } else {
                        z4 = false;
                    }
                    Modifier semantics$default = SemanticsModifierKt.semantics$default(offset, z4, (ky) rememberedValue8, 1, null);
                    boolean changed5 = startRestartGroup.changed(mutableFloatState) | ((i7 > 256 && startRestartGroup.changed(drawerState2)) || (i3 & 384) == 256);
                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (changed5 || rememberedValue9 == companion2.getEmpty()) {
                        rememberedValue9 = new NavigationDrawerKt$ModalNavigationDrawer$2$6$1(drawerState2, mutableState, mutableFloatState, 0.0f);
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue9;
                    int i9 = i3 & 14;
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, semantics$default);
                    iy constructor3 = companion.getConstructor();
                    int i10 = ((i9 << 6) & 896) | 6;
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
                    ComposeUiNode.Companion companion7 = companion;
                    my b3 = k4.b(companion7, m3878constructorimpl3, measurePolicy, m3878constructorimpl3, currentCompositionLocalMap3);
                    if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                    }
                    Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion7.getSetModifier());
                    my myVar5 = myVar;
                    myVar5.invoke(startRestartGroup, Integer.valueOf((i10 >> 6) & 14));
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    drawerState3 = drawerState2;
                    j3 = j5;
                    modifier3 = modifier5;
                    z2 = z5;
                    myVar3 = myVar5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z2 = z;
                    modifier3 = modifier2;
                    drawerState3 = drawerState2;
                    j3 = j2;
                    myVar3 = myVar4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new u5(myVar3, modifier3, drawerState3, z2, j3, myVar2, i, i2));
                    return;
                }
                return;
            }
            if ((i & 24576) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalNavigationDrawer_FHprtrg$lambda$11$lambda$10(DrawerState drawerState, Density density, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3) {
        drawerState.setDensity$material3(density);
        drawerState.setOpenDrawerMotionSpec$material3(finiteAnimationSpec);
        drawerState.setCloseDrawerMotionSpec$material3(finiteAnimationSpec2);
        drawerState.setAnchoredDraggableMotionSpec$material3(finiteAnimationSpec3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalNavigationDrawer_FHprtrg$lambda$24$lambda$14$lambda$13(boolean z, DrawerState drawerState, un unVar) {
        if (z && ((Boolean) drawerState.getConfirmStateChange$material3().invoke(DrawerValue.Closed)).booleanValue()) {
            p01.t(unVar, null, null, new NavigationDrawerKt$ModalNavigationDrawer$2$2$1$1(drawerState, null), 3);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ModalNavigationDrawer_FHprtrg$lambda$24$lambda$16$lambda$15(float f, DrawerState drawerState, MutableFloatState mutableFloatState) {
        return calculateFraction(mutableFloatState.getFloatValue(), f, drawerState.requireOffset$material3());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset ModalNavigationDrawer_FHprtrg$lambda$24$lambda$19$lambda$18(DrawerState drawerState, Density density) {
        return IntOffset.m7730boximpl(IntOffset.m7733constructorimpl((!Float.isNaN(drawerState.getCurrentOffset()) ? y80.P(r0) : drawerState.isOpen() ? 0 : -density.mo361roundToPx0680j_4(DrawerDefaults.INSTANCE.m1943getMaximumDrawerWidthD9Ej5fM())) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21(String str, DrawerState drawerState, un unVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        if (drawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semanticsPropertyReceiver, null, new xb0(drawerState, unVar, 0), 1, null);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalNavigationDrawer_FHprtrg$lambda$24$lambda$22$lambda$21$lambda$20(DrawerState drawerState, un unVar) {
        if (!((Boolean) drawerState.getConfirmStateChange$material3().invoke(DrawerValue.Closed)).booleanValue()) {
            return true;
        }
        p01.t(unVar, null, null, new NavigationDrawerKt$ModalNavigationDrawer$2$5$1$1$1(drawerState, null), 3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ModalNavigationDrawer_FHprtrg$lambda$25(my myVar, Modifier modifier, DrawerState drawerState, boolean z, long j, my myVar2, int i, int i2, Composer composer, int i3) {
        m2183ModalNavigationDrawerFHprtrg(myVar, modifier, drawerState, z, j, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalNavigationDrawer_FHprtrg$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ModalNavigationDrawer_FHprtrg$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f6  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationDrawerItem(final my myVar, final boolean z, iy iyVar, Modifier modifier, my myVar2, my myVar3, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        my myVar4;
        int i6;
        my myVar5;
        Shape shape2;
        int i7;
        Composer composer2;
        NavigationDrawerItemColors navigationDrawerItemColors2;
        Modifier modifier3;
        my myVar6;
        my myVar7;
        Shape shape3;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        my myVar8;
        Shape shape4;
        Modifier modifier4;
        boolean z2;
        boolean z3;
        NavigationDrawerItemColors navigationDrawerItemColors3;
        MutableInteractionSource mutableInteractionSource3;
        NavigationDrawerItemColors navigationDrawerItemColors4;
        Modifier modifier5;
        ?? r2;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-583709666);
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
            i3 |= startRestartGroup.changedInstance(iyVar) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    myVar4 = myVar2;
                    i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.Clip : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        myVar5 = myVar3;
                        i3 |= startRestartGroup.changedInstance(myVar5) ? Fields.RenderEffect : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                shape2 = shape;
                                if (startRestartGroup.changed(shape2)) {
                                    i9 = 1048576;
                                    i3 |= i9;
                                }
                            } else {
                                shape2 = shape;
                            }
                            i9 = Fields.BlendMode;
                            i3 |= i9;
                        } else {
                            shape2 = shape;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(navigationDrawerItemColors)) {
                                i8 = GroupFlagsKt.IsNodeFlag;
                                i3 |= i8;
                            }
                            i8 = 4194304;
                            i3 |= i8;
                        }
                        i7 = i2 & Fields.RotationX;
                        if (i7 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier6 = i4 != 0 ? Modifier.Companion : modifier2;
                                my myVar9 = i5 != 0 ? null : myVar4;
                                myVar8 = i6 != 0 ? null : myVar5;
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    shape4 = ShapesKt.getValue(NavigationDrawerTokens.INSTANCE.getActiveIndicatorShape(), startRestartGroup, 6);
                                } else {
                                    shape4 = shape2;
                                }
                                int i10 = i3;
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    modifier4 = modifier6;
                                    z3 = false;
                                    z2 = true;
                                    navigationDrawerItemColors3 = NavigationDrawerItemDefaults.INSTANCE.m2177colorsoq7We08(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 100663296, 255);
                                    startRestartGroup = startRestartGroup;
                                    i3 = i10 & (-29360129);
                                } else {
                                    modifier4 = modifier6;
                                    z2 = true;
                                    z3 = false;
                                    navigationDrawerItemColors3 = navigationDrawerItemColors;
                                    i3 = i10;
                                }
                                mutableInteractionSource3 = i7 != 0 ? null : mutableInteractionSource;
                                navigationDrawerItemColors4 = navigationDrawerItemColors3;
                                myVar4 = myVar9;
                                modifier5 = modifier4;
                                r2 = z2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                if ((i2 & Fields.SpotShadowColor) != 0) {
                                    i3 &= -29360129;
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                r2 = 1;
                                modifier5 = modifier2;
                                myVar8 = myVar5;
                                shape4 = shape2;
                                z3 = false;
                                navigationDrawerItemColors4 = navigationDrawerItemColors;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-583709666, i3, -1, "androidx.compose.material3.NavigationDrawerItem (NavigationDrawer.kt:1077)");
                            }
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new hz(28);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            int i11 = i3 >> 3;
                            final NavigationDrawerItemColors navigationDrawerItemColors5 = navigationDrawerItemColors4;
                            final my myVar10 = myVar4;
                            final my myVar11 = myVar8;
                            Modifier modifier7 = modifier5;
                            Shape shape5 = shape4;
                            SurfaceKt.m2465Surfaced85dljk(z, iyVar, SizeKt.fillMaxWidth$default(SizeKt.m795heightInVpY3zN4$default(SemanticsModifierKt.semantics$default(modifier5, z3, (ky) rememberedValue, r2, null), NavigationDrawerTokens.INSTANCE.m3441getActiveIndicatorHeightD9Ej5fM(), 0.0f, 2, null), 0.0f, r2, null), false, shape5, navigationDrawerItemColors4.containerColor(z, startRestartGroup, (i11 & 14) | ((i3 >> 18) & 112)).getValue().m4771unboximpl(), 0L, 0.0f, 0.0f, (BorderStroke) null, mutableInteractionSource3, (my) ComposableLambdaKt.rememberComposableLambda(-1173018444, r2, new my() { // from class: androidx.compose.material3.NavigationDrawerKt$NavigationDrawerItem$2
                                public final void invoke(Composer composer3, int i12) {
                                    if (!composer3.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1173018444, i12, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:1090)");
                                    }
                                    Modifier.Companion companion = Modifier.Companion;
                                    Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(companion, Dp.m7611constructorimpl(16.0f), 0.0f, Dp.m7611constructorimpl(24.0f), 0.0f, 10, null);
                                    Alignment.Companion companion2 = Alignment.Companion;
                                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                    my myVar12 = my.this;
                                    NavigationDrawerItemColors navigationDrawerItemColors6 = navigationDrawerItemColors5;
                                    boolean z4 = z;
                                    my myVar13 = myVar11;
                                    my myVar14 = myVar;
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m766paddingqDBjuR0$default);
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
                                    my b = k4.b(companion3, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                    }
                                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    if (myVar12 != null) {
                                        composer3.startReplaceGroup(-2013920011);
                                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(navigationDrawerItemColors6.iconColor(z4, composer3, 0).getValue().m4771unboximpl())), myVar12, composer3, ProvidedValue.$stable);
                                        SpacerKt.Spacer(SizeKt.m812width3ABfNKs(companion, Dp.m7611constructorimpl(12.0f)), composer3, 6);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(-2013707630);
                                        composer3.endReplaceGroup();
                                    }
                                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, weight$default);
                                    iy constructor2 = companion3.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer3);
                                    my b2 = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                    if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                                    }
                                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    ProvidedValue<Color> provides = ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(navigationDrawerItemColors6.textColor(z4, composer3, 0).getValue().m4771unboximpl()));
                                    int i13 = ProvidedValue.$stable;
                                    CompositionLocalKt.CompositionLocalProvider(provides, myVar14, composer3, i13);
                                    composer3.endNode();
                                    if (myVar13 != null) {
                                        composer3.startReplaceGroup(-2013454639);
                                        SpacerKt.Spacer(SizeKt.m812width3ABfNKs(companion, Dp.m7611constructorimpl(12.0f)), composer3, 6);
                                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(navigationDrawerItemColors6.badgeColor(z4, composer3, 0).getValue().m4771unboximpl())), myVar13, composer3, i13);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(-2013238414);
                                        composer3.endReplaceGroup();
                                    }
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
                            }, startRestartGroup, 54), startRestartGroup, (i11 & 126) | ((i3 >> 6) & 57344), ((i3 >> 24) & 14) | 48, 968);
                            composer2 = startRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            shape3 = shape5;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            navigationDrawerItemColors2 = navigationDrawerItemColors5;
                            modifier3 = modifier7;
                            myVar6 = myVar10;
                            myVar7 = myVar8;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            navigationDrawerItemColors2 = navigationDrawerItemColors;
                            modifier3 = modifier2;
                            myVar6 = myVar4;
                            myVar7 = myVar5;
                            shape3 = shape2;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new t5(myVar, z, iyVar, modifier3, myVar6, myVar7, shape3, navigationDrawerItemColors2, mutableInteractionSource2, i, i2));
                            return;
                        }
                        return;
                    }
                    myVar5 = myVar3;
                    if ((1572864 & i) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i7 = i2 & Fields.RotationX;
                    if (i7 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar4 = myVar2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                myVar5 = myVar3;
                if ((1572864 & i) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & Fields.RotationX;
                if (i7 != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            myVar4 = myVar2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            myVar5 = myVar3;
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & Fields.RotationX;
            if (i7 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        myVar4 = myVar2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        myVar5 = myVar3;
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & Fields.RotationX;
        if (i7 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationDrawerItem$lambda$64$lambda$63(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6835getTabo7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 NavigationDrawerItem$lambda$65(my myVar, boolean z, iy iyVar, Modifier modifier, my myVar2, my myVar3, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        NavigationDrawerItem(myVar, z, iyVar, modifier, myVar2, myVar3, shape, navigationDrawerItemColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ba  */
    /* renamed from: PermanentDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2184PermanentDrawerSheetafqeVBk(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Shape shape2;
        long j3;
        long j4;
        int i4;
        float f2;
        WindowInsets windowInsets2;
        ny nyVar2;
        Composer composer2;
        Modifier modifier2;
        Shape shape3;
        long j5;
        long j6;
        float f3;
        WindowInsets windowInsets3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        long j7;
        float f4;
        long j8;
        WindowInsets windowInsets4;
        Shape shape4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1877158612);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            shape2 = shape;
            i3 |= startRestartGroup.changed(shape2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i7 = Fields.RotationX;
                        i3 |= i7;
                    }
                } else {
                    j3 = j;
                }
                i7 = Fields.SpotShadowColor;
                i3 |= i7;
            } else {
                j3 = j;
            }
            if ((i & 3072) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j4)) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                j4 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? Fields.Clip : 8192;
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        windowInsets2 = windowInsets;
                        if (startRestartGroup.changed(windowInsets2)) {
                            i6 = Fields.RenderEffect;
                            i3 |= i6;
                        }
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    windowInsets2 = windowInsets;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    nyVar2 = nyVar;
                    i3 |= startRestartGroup.changedInstance(nyVar2) ? 1048576 : Fields.BlendMode;
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier2 = modifier;
                        shape3 = shape2;
                        j5 = j3;
                        j6 = j4;
                        f3 = f2;
                        windowInsets3 = windowInsets2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i8 != 0 ? Modifier.Companion : modifier;
                            Shape rectangleShape = i9 != 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                            if ((i2 & 4) != 0) {
                                j7 = DrawerDefaults.INSTANCE.getStandardContainerColor(startRestartGroup, 6);
                                i3 &= -897;
                            } else {
                                j7 = j3;
                            }
                            if ((i2 & 8) != 0) {
                                j4 = ColorSchemeKt.m1797contentColorForek8zF_U(j7, startRestartGroup, (i3 >> 6) & 14);
                                i3 &= -7169;
                            }
                            float m1945getPermanentDrawerElevationD9Ej5fM = i4 != 0 ? DrawerDefaults.INSTANCE.m1945getPermanentDrawerElevationD9Ej5fM() : f2;
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                shape4 = rectangleShape;
                                f4 = m1945getPermanentDrawerElevationD9Ej5fM;
                                j8 = j4;
                                i5 = 1877158612;
                                windowInsets4 = DrawerDefaults.INSTANCE.getWindowInsets(startRestartGroup, 6);
                            } else {
                                f4 = m1945getPermanentDrawerElevationD9Ej5fM;
                                j8 = j4;
                                windowInsets4 = windowInsets2;
                                shape4 = rectangleShape;
                                i5 = 1877158612;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier3 = modifier;
                            j8 = j4;
                            f4 = f2;
                            windowInsets4 = windowInsets2;
                            i5 = 1877158612;
                            shape4 = shape2;
                            j7 = j3;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(i5, i3, -1, "androidx.compose.material3.PermanentDrawerSheet (NavigationDrawer.kt:771)");
                        }
                        Strings.Companion companion = Strings.Companion;
                        String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(androidx.compose.ui.R.string.navigation_menu), startRestartGroup, 0);
                        boolean changed = startRestartGroup.changed(m2983getString2EP1pXo);
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new wd(m2983getString2EP1pXo, 18);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        int i10 = i3 << 6;
                        composer2 = startRestartGroup;
                        ny nyVar3 = nyVar2;
                        long j9 = j7;
                        m2180DrawerSheetcm3T3N0(null, windowInsets4, SemanticsModifierKt.semantics$default(modifier3, false, (ky) rememberedValue, 1, null), shape4, j9, j8, f4, null, nyVar3, composer2, ((i3 >> 12) & 112) | 6 | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (i10 & 234881024), Fields.SpotShadowColor);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        windowInsets3 = windowInsets4;
                        shape3 = shape4;
                        j5 = j9;
                        j6 = j8;
                        f3 = f4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new ac0(modifier2, shape3, j5, j6, f3, windowInsets3, nyVar, i, i2, 2));
                        return;
                    }
                    return;
                }
                nyVar2 = nyVar;
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            if ((196608 & i) == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            nyVar2 = nyVar;
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        shape2 = shape;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        f2 = f;
        if ((196608 & i) == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        nyVar2 = nyVar;
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PermanentDrawerSheet_afqeVBk$lambda$48$lambda$47(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PermanentDrawerSheet_afqeVBk$lambda$49(Modifier modifier, Shape shape, long j, long j2, float f, WindowInsets windowInsets, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2184PermanentDrawerSheetafqeVBk(modifier, shape, j, j2, f, windowInsets, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final void PermanentNavigationDrawer(my myVar, Modifier modifier, my myVar2, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(89297160);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(89297160, i3, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:561)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            iy constructor = companion2.getConstructor();
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
            my b = k4.b(companion2, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            myVar.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
            Modifier.Companion companion3 = Modifier.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
            iy constructor2 = companion2.getConstructor();
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
            my b2 = k4.b(companion2, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
            }
            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            myVar2.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new defpackage.g1(myVar, modifier2, myVar2, i, i2, 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PermanentNavigationDrawer$lambda$42(my myVar, Modifier modifier, my myVar2, int i, int i2, Composer composer, int i3) {
        PermanentNavigationDrawer(myVar, modifier, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* renamed from: Scrim-Bx497Mc, reason: not valid java name */
    private static final void m2185ScrimBx497Mc(final boolean z, final iy iyVar, final iy iyVar2, final long j, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        Modifier modifier;
        Composer startRestartGroup = composer.startRestartGroup(2106487387);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(j) ? 2048 : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106487387, i2, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:1284)");
            }
            Strings.Companion companion2 = Strings.Companion;
            String m2983getString2EP1pXo = Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(androidx.compose.ui.R.string.close_drawer), startRestartGroup, 0);
            if (z) {
                startRestartGroup.startReplaceGroup(598792893);
                companion = Modifier.Companion;
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(iyVar);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, iyVar, (PointerInputEventHandler) rememberedValue);
                boolean changed = (i3 == 32) | startRestartGroup.changed(m2983getString2EP1pXo);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new l90(m2983getString2EP1pXo, iyVar, r9);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                modifier = SemanticsModifierKt.semantics(pointerInput, true, (ky) rememberedValue2);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(599116967);
                startRestartGroup.endReplaceGroup();
                companion = Modifier.Companion;
                modifier = companion;
            }
            Modifier then = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null).then(modifier);
            int i4 = ((i2 & 7168) == 2048 ? 1 : 0) | ((i2 & 896) != 256 ? 0 : 1);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (i4 != 0 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new m90(2, j, iyVar2);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            CanvasKt.Canvas(then, (ky) rememberedValue3, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: dc0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 Scrim_Bx497Mc$lambda$72;
                    int intValue = ((Integer) obj2).intValue();
                    Scrim_Bx497Mc$lambda$72 = NavigationDrawerKt.Scrim_Bx497Mc$lambda$72(z, iyVar, iyVar2, j, i, (Composer) obj, intValue);
                    return Scrim_Bx497Mc$lambda$72;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Scrim_Bx497Mc$lambda$69$lambda$68(String str, iy iyVar, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new uq(4, iyVar), 1, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Scrim_Bx497Mc$lambda$69$lambda$68$lambda$67(iy iyVar) {
        iyVar.invoke();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Scrim_Bx497Mc$lambda$71$lambda$70(long j, iy iyVar, DrawScope drawScope) {
        DrawScope.m5329drawRectnJ9OG0$default(drawScope, j, 0L, 0L, ((Number) iyVar.invoke()).floatValue(), null, null, 0, 118, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Scrim_Bx497Mc$lambda$72(boolean z, iy iyVar, iy iyVar2, long j, int i, Composer composer, int i2) {
        m2185ScrimBx497Mc(z, iyVar, iyVar2, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final float calculateFraction(float f, float f2, float f3) {
        return y80.g((f3 - f) / (f2 - f), 0.0f, 1.0f);
    }

    private static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return ((drawerPredictiveBackState.getScaleXDistance() * (drawerPredictiveBackState.getSwipeEdgeMatchesDrawer() ? 1 : -1)) / intBitsToFloat) + 1.0f;
    }

    private static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (drawerPredictiveBackState.getScaleYDistance() / intBitsToFloat);
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceGrow() {
        return PredictiveBackDrawerMaxScaleXDistanceGrow;
    }

    public static final float getPredictiveBackDrawerMaxScaleXDistanceShrink() {
        return PredictiveBackDrawerMaxScaleXDistanceShrink;
    }

    public static final float getPredictiveBackDrawerMaxScaleYDistance() {
        return PredictiveBackDrawerMaxScaleYDistance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier horizontalScaleDown(Modifier modifier, FloatProducer floatProducer, float f, boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new cc0(floatProducer, f, z, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 horizontalScaleDown$lambda$55(FloatProducer floatProducer, float f, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float invoke = floatProducer.invoke();
        graphicsLayerScope.setScaleX(invoke > 0.0f ? 1.0f / ((invoke / f) + 1.0f) : 1.0f);
        graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.0f));
        return w01.a;
    }

    private static final Modifier horizontalScaleUp(Modifier modifier, FloatProducer floatProducer, float f, boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new cc0(floatProducer, f, z, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 horizontalScaleUp$lambda$54(FloatProducer floatProducer, float f, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float invoke = floatProducer.invoke();
        graphicsLayerScope.setScaleX(invoke > 0.0f ? (invoke / f) + 1.0f : 1.0f);
        graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.5f));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier predictiveBackDrawerChild(Modifier modifier, DrawerPredictiveBackState drawerPredictiveBackState, boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new bc0(drawerPredictiveBackState, z, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 predictiveBackDrawerChild$lambda$57(DrawerPredictiveBackState drawerPredictiveBackState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        float calculatePredictiveBackScaleX = calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState);
        graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX == 0.0f ? 1.0f : calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState) / calculatePredictiveBackScaleX);
        graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.0f));
        return w01.a;
    }

    private static final Modifier predictiveBackDrawerContainer(Modifier modifier, DrawerPredictiveBackState drawerPredictiveBackState, boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new bc0(drawerPredictiveBackState, z, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 predictiveBackDrawerContainer$lambda$56(DrawerPredictiveBackState drawerPredictiveBackState, boolean z, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.setScaleX(calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState));
        graphicsLayerScope.setScaleY(calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState));
        graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 1.0f : 0.0f, 0.5f));
        return w01.a;
    }

    public static final DrawerState rememberDrawerState(DrawerValue drawerValue, ky kyVar, Composer composer, int i, int i2) {
        if ((i2 & 2) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new hz(29);
                composer.updateRememberedValue(rememberedValue);
            }
            kyVar = (ky) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098699222, i, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:305)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.Companion.Saver(kyVar);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(drawerValue.ordinal())) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(kyVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object rememberedValue2 = composer.rememberedValue();
        if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new v4(25, drawerValue, kyVar);
            composer.updateRememberedValue(rememberedValue2);
        }
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) Saver, (iy) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return drawerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberDrawerState$lambda$1$lambda$0(DrawerValue drawerValue) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawerState rememberDrawerState$lambda$3$lambda$2(DrawerValue drawerValue, ky kyVar) {
        return new DrawerState(drawerValue, kyVar);
    }
}
