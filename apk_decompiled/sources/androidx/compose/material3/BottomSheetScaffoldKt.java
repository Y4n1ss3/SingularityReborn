package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import defpackage.af;
import defpackage.bf;
import defpackage.ed;
import defpackage.ef;
import defpackage.ff;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.p01;
import defpackage.q10;
import defpackage.st;
import defpackage.un;
import defpackage.w01;
import defpackage.xe0;
import defpackage.y80;
import defpackage.ze;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SheetValue.values().length];
            try {
                iArr[SheetValue.Hidden.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SheetValue.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023c  */
    /* renamed from: BottomSheetScaffold-sdMYb0k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1647BottomSheetScaffoldsdMYb0k(final ny nyVar, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, float f, float f2, Shape shape, long j, long j2, float f3, float f4, my myVar, boolean z, my myVar2, ny nyVar2, long j3, long j4, final ny nyVar3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        BottomSheetScaffoldState bottomSheetScaffoldState2;
        int i5;
        int i6;
        float f5;
        int i7;
        Shape shape2;
        int i8;
        long j5;
        long j6;
        int i9;
        float f6;
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
        final Shape shape3;
        final long j7;
        final Modifier modifier2;
        final boolean z2;
        final ny nyVar4;
        final long j8;
        final long j9;
        Composer composer2;
        final float f7;
        final long j10;
        final BottomSheetScaffoldState bottomSheetScaffoldState3;
        final float f8;
        final float f9;
        final float f10;
        final my myVar3;
        final my myVar4;
        ScopeUpdateScope endRestartGroup;
        BottomSheetScaffoldState bottomSheetScaffoldState4;
        float m1645getSheetPeekHeightD9Ej5fM;
        float m1642getElevationD9Ej5fM;
        my lambda$1392012807$material3;
        boolean z3;
        my myVar5;
        ny lambda$1768941633$material3;
        Modifier modifier3;
        long j11;
        long j12;
        long j13;
        Modifier modifier4;
        int i20;
        float f11;
        int i21;
        Composer startRestartGroup = composer.startRestartGroup(920075480);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(nyVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i22 = i3 & 2;
        if (i22 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i3 & 4) == 0) {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                    if (startRestartGroup.changed(bottomSheetScaffoldState2)) {
                        i21 = Fields.RotationX;
                        i4 |= i21;
                    }
                } else {
                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                }
                i21 = Fields.SpotShadowColor;
                i4 |= i21;
            } else {
                bottomSheetScaffoldState2 = bottomSheetScaffoldState;
            }
            i5 = i3 & 8;
            int i23 = Fields.RotationZ;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(f) ? 2048 : 1024;
                i6 = i3 & 16;
                int i24 = 8192;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    f5 = f2;
                    i4 |= startRestartGroup.changed(f5) ? 16384 : 8192;
                    i7 = i & 196608;
                    int i25 = Fields.RenderEffect;
                    if (i7 != 0) {
                        shape2 = shape;
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape2)) ? 131072 : 65536;
                    } else {
                        shape2 = shape;
                    }
                    i8 = i & 1572864;
                    int i26 = Fields.BlendMode;
                    if (i8 != 0) {
                        j5 = j;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j5)) ? 1048576 : 524288;
                    } else {
                        j5 = j;
                    }
                    if ((i & 12582912) != 0) {
                        j6 = j2;
                        i4 |= ((i3 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(j6)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    } else {
                        j6 = j2;
                    }
                    i9 = i3 & Fields.RotationX;
                    if (i9 == 0) {
                        i4 |= 100663296;
                        f6 = f3;
                    } else {
                        f6 = f3;
                        if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(f6) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                    }
                    i10 = i3 & Fields.RotationY;
                    if (i10 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changed(f4) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    }
                    i11 = i3 & Fields.RotationZ;
                    if (i11 == 0) {
                        i13 = i2 | 6;
                        i12 = i11;
                    } else if ((i2 & 6) == 0) {
                        i12 = i11;
                        i13 = i2 | (startRestartGroup.changedInstance(myVar) ? 4 : 2);
                    } else {
                        i12 = i11;
                        i13 = i2;
                    }
                    i14 = i3 & Fields.CameraDistance;
                    if (i14 == 0) {
                        i13 |= 48;
                        i15 = i14;
                    } else if ((i2 & 48) == 0) {
                        i15 = i14;
                        i13 |= startRestartGroup.changed(z) ? 32 : 16;
                    } else {
                        i15 = i14;
                    }
                    int i27 = i13;
                    i16 = i3 & Fields.TransformOrigin;
                    if (i16 == 0) {
                        i17 = i27 | 384;
                    } else {
                        int i28 = i27;
                        if ((i2 & 384) == 0) {
                            i28 |= startRestartGroup.changedInstance(myVar2) ? Fields.RotationX : Fields.SpotShadowColor;
                        }
                        i17 = i28;
                    }
                    i18 = i3 & 8192;
                    if (i18 == 0) {
                        i19 = i17 | 3072;
                    } else {
                        i19 = i17;
                        if ((i2 & 3072) == 0) {
                            if (startRestartGroup.changedInstance(nyVar2)) {
                                i23 = 2048;
                            }
                            i19 |= i23;
                            if ((i2 & 24576) == 0) {
                                if ((i3 & Fields.Clip) == 0 && startRestartGroup.changed(j3)) {
                                    i24 = 16384;
                                }
                                i19 |= i24;
                            }
                            if ((i2 & 196608) == 0) {
                                if ((i3 & Fields.CompositingStrategy) != 0 || !startRestartGroup.changed(j4)) {
                                    i25 = 65536;
                                }
                                i19 |= i25;
                            }
                            if ((i3 & 65536) != 0) {
                                i19 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                if (startRestartGroup.changedInstance(nyVar3)) {
                                    i26 = 1048576;
                                }
                                i19 |= i26;
                            }
                            if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i19 & 599187) != 599186, i4 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier5 = i22 != 0 ? Modifier.Companion : modifier;
                                    if ((i3 & 4) != 0) {
                                        bottomSheetScaffoldState4 = rememberBottomSheetScaffoldState(null, null, startRestartGroup, 0, 3);
                                        i4 &= -897;
                                    } else {
                                        bottomSheetScaffoldState4 = bottomSheetScaffoldState2;
                                    }
                                    m1645getSheetPeekHeightD9Ej5fM = i5 != 0 ? BottomSheetDefaults.INSTANCE.m1645getSheetPeekHeightD9Ej5fM() : f;
                                    if (i6 != 0) {
                                        f5 = BottomSheetDefaults.INSTANCE.m1644getSheetMaxWidthD9Ej5fM();
                                    }
                                    if ((i3 & 32) != 0) {
                                        shape2 = BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                        i4 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        j5 = BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & Fields.SpotShadowColor) != 0) {
                                        j6 = ColorSchemeKt.m1797contentColorForek8zF_U(j5, startRestartGroup, (i4 >> 18) & 14);
                                        i4 &= -29360129;
                                    }
                                    if (i9 != 0) {
                                        f6 = Dp.m7611constructorimpl(0.0f);
                                    }
                                    m1642getElevationD9Ej5fM = i10 != 0 ? BottomSheetDefaults.INSTANCE.m1642getElevationD9Ej5fM() : f4;
                                    lambda$1392012807$material3 = i12 != 0 ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.getLambda$1392012807$material3() : myVar;
                                    z3 = i15 != 0 ? true : z;
                                    myVar5 = i16 != 0 ? null : myVar2;
                                    lambda$1768941633$material3 = i18 != 0 ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.getLambda$1768941633$material3() : nyVar2;
                                    if ((i3 & Fields.Clip) != 0) {
                                        modifier3 = modifier5;
                                        j11 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).m1781getSurface0d7_KjU();
                                        i19 &= -57345;
                                    } else {
                                        modifier3 = modifier5;
                                        j11 = j3;
                                    }
                                    if ((i3 & Fields.CompositingStrategy) != 0) {
                                        j12 = ColorSchemeKt.m1797contentColorForek8zF_U(j11, startRestartGroup, (i19 >> 12) & 14);
                                        i19 &= -458753;
                                    } else {
                                        j12 = j4;
                                    }
                                    j13 = j11;
                                    modifier4 = modifier3;
                                    i20 = i19;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                    }
                                    if ((i3 & 32) != 0) {
                                        i4 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & Fields.SpotShadowColor) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & Fields.Clip) != 0) {
                                        i19 &= -57345;
                                    }
                                    if ((i3 & Fields.CompositingStrategy) != 0) {
                                        i19 &= -458753;
                                    }
                                    modifier4 = modifier;
                                    m1642getElevationD9Ej5fM = f4;
                                    lambda$1392012807$material3 = myVar;
                                    z3 = z;
                                    myVar5 = myVar2;
                                    lambda$1768941633$material3 = nyVar2;
                                    j12 = j4;
                                    bottomSheetScaffoldState4 = bottomSheetScaffoldState2;
                                    i20 = i19;
                                    m1645getSheetPeekHeightD9Ej5fM = f;
                                    j13 = j3;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    f11 = m1642getElevationD9Ej5fM;
                                    ComposerKt.traceEventStart(920075480, i4, i20, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                                } else {
                                    f11 = m1642getElevationD9Ej5fM;
                                }
                                Modifier m227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), j13, null, 2, null);
                                long j14 = j13;
                                Modifier modifier6 = modifier4;
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m227backgroundbw27NRU$default);
                                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                long j15 = j6;
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
                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j12)), ComposableLambdaKt.rememberComposableLambda(999829022, true, new BottomSheetScaffoldKt$BottomSheetScaffold$1$1(bottomSheetScaffoldState4, myVar5, nyVar3, m1645getSheetPeekHeightD9Ej5fM, f5, z3, shape2, j5, j15, f6, f11, lambda$1392012807$material3, nyVar, lambda$1768941633$material3), startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
                                startRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer2 = startRestartGroup;
                                bottomSheetScaffoldState3 = bottomSheetScaffoldState4;
                                f9 = m1645getSheetPeekHeightD9Ej5fM;
                                myVar3 = lambda$1392012807$material3;
                                nyVar4 = lambda$1768941633$material3;
                                modifier2 = modifier6;
                                z2 = z3;
                                j9 = j12;
                                j8 = j14;
                                long j16 = j5;
                                f10 = f11;
                                f8 = f6;
                                myVar4 = myVar5;
                                f7 = f5;
                                shape3 = shape2;
                                j10 = j16;
                                j7 = j15;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                shape3 = shape2;
                                j7 = j6;
                                modifier2 = modifier;
                                z2 = z;
                                nyVar4 = nyVar2;
                                j8 = j3;
                                j9 = j4;
                                composer2 = startRestartGroup;
                                f7 = f5;
                                j10 = j5;
                                bottomSheetScaffoldState3 = bottomSheetScaffoldState2;
                                f8 = f6;
                                f9 = f;
                                f10 = f4;
                                myVar3 = myVar;
                                myVar4 = myVar2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                                endRestartGroup.updateScope(new my() { // from class: df
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 BottomSheetScaffold_sdMYb0k$lambda$1;
                                        int intValue = ((Integer) obj2).intValue();
                                        BottomSheetScaffold_sdMYb0k$lambda$1 = BottomSheetScaffoldKt.BottomSheetScaffold_sdMYb0k$lambda$1(ny.this, modifier2, bottomSheetScaffoldState3, f9, f7, shape3, j10, j7, f8, f10, myVar3, z2, myVar4, nyVar4, j8, j9, nyVar3, i, i2, i3, (Composer) obj, intValue);
                                        return BottomSheetScaffold_sdMYb0k$lambda$1;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((i2 & 196608) == 0) {
                    }
                    if ((i3 & 65536) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i19 & 599187) != 599186, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f5 = f2;
                i7 = i & 196608;
                int i252 = Fields.RenderEffect;
                if (i7 != 0) {
                }
                i8 = i & 1572864;
                int i262 = Fields.BlendMode;
                if (i8 != 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i9 = i3 & Fields.RotationX;
                if (i9 == 0) {
                }
                i10 = i3 & Fields.RotationY;
                if (i10 == 0) {
                }
                i11 = i3 & Fields.RotationZ;
                if (i11 == 0) {
                }
                i14 = i3 & Fields.CameraDistance;
                if (i14 == 0) {
                }
                int i272 = i13;
                i16 = i3 & Fields.TransformOrigin;
                if (i16 == 0) {
                }
                i18 = i3 & 8192;
                if (i18 == 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((i2 & 196608) == 0) {
                }
                if ((i3 & 65536) != 0) {
                }
                if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i19 & 599187) != 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            int i242 = 8192;
            if (i6 != 0) {
            }
            f5 = f2;
            i7 = i & 196608;
            int i2522 = Fields.RenderEffect;
            if (i7 != 0) {
            }
            i8 = i & 1572864;
            int i2622 = Fields.BlendMode;
            if (i8 != 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i9 = i3 & Fields.RotationX;
            if (i9 == 0) {
            }
            i10 = i3 & Fields.RotationY;
            if (i10 == 0) {
            }
            i11 = i3 & Fields.RotationZ;
            if (i11 == 0) {
            }
            i14 = i3 & Fields.CameraDistance;
            if (i14 == 0) {
            }
            int i2722 = i13;
            i16 = i3 & Fields.TransformOrigin;
            if (i16 == 0) {
            }
            i18 = i3 & 8192;
            if (i18 == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((i2 & 196608) == 0) {
            }
            if ((i3 & 65536) != 0) {
            }
            if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i19 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        i5 = i3 & 8;
        int i232 = Fields.RotationZ;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        int i2422 = 8192;
        if (i6 != 0) {
        }
        f5 = f2;
        i7 = i & 196608;
        int i25222 = Fields.RenderEffect;
        if (i7 != 0) {
        }
        i8 = i & 1572864;
        int i26222 = Fields.BlendMode;
        if (i8 != 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i9 = i3 & Fields.RotationX;
        if (i9 == 0) {
        }
        i10 = i3 & Fields.RotationY;
        if (i10 == 0) {
        }
        i11 = i3 & Fields.RotationZ;
        if (i11 == 0) {
        }
        i14 = i3 & Fields.CameraDistance;
        if (i14 == 0) {
        }
        int i27222 = i13;
        i16 = i3 & Fields.TransformOrigin;
        if (i16 == 0) {
        }
        i18 = i3 & 8192;
        if (i18 == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        if ((i3 & 65536) != 0) {
        }
        if (startRestartGroup.shouldExecute((306783379 & i4) == 306783378 || (i19 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014e, code lost:
    
        if (defpackage.q10.b(r15.rememberedValue(), java.lang.Integer.valueOf(r11)) == false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BottomSheetScaffoldLayout(my myVar, my myVar2, my myVar3, my myVar4, iy iyVar, SheetState sheetState, Composer composer, int i) {
        int i2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1217723575);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar4) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(sheetState) ? 131072 : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1217723575, i2, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:413)");
            }
            List E = y80.E(myVar == null ? ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m1831getLambda$788244078$material3() : myVar, myVar2, myVar3, myVar4);
            boolean z = ((458752 & i2) == 131072) | ((i2 & 57344) == 16384);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(sheetState, iyVar);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue;
            Modifier.Companion companion = Modifier.Companion;
            my combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(E);
            boolean changed = startRestartGroup.changed(multiContentMeasurePolicy);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            my b = k4.b(companion2, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting()) {
                i3 = 0;
            } else {
                i3 = 0;
            }
            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
            combineAsVirtualLayouts.invoke(startRestartGroup, Integer.valueOf(i3));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ff(myVar, myVar2, myVar3, myVar4, iyVar, sheetState, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BottomSheetScaffoldLayout$lambda$16(my myVar, my myVar2, my myVar3, my myVar4, iy iyVar, SheetState sheetState, int i, Composer composer, int i2) {
        BottomSheetScaffoldLayout(myVar, myVar2, myVar3, myVar4, iyVar, sheetState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BottomSheetScaffold_sdMYb0k$lambda$1(ny nyVar, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, float f, float f2, Shape shape, long j, long j2, float f3, float f4, my myVar, boolean z, my myVar2, ny nyVar2, long j3, long j4, ny nyVar3, int i, int i2, int i3, Composer composer, int i4) {
        m1647BottomSheetScaffoldsdMYb0k(nyVar, modifier, bottomSheetScaffoldState, f, f2, shape, j, j2, f3, f4, myVar, z, myVar2, nyVar2, j3, j4, nyVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: StandardBottomSheet-w7I5h1o, reason: not valid java name */
    public static final void m1648StandardBottomSheetw7I5h1o(final SheetState sheetState, final float f, final float f2, final boolean z, final Shape shape, final long j, final long j2, final float f3, final float f4, final my myVar, final ny nyVar, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composer2;
        int i5;
        int i6;
        Composer.Companion companion;
        Object obj;
        Modifier.Companion companion2;
        Modifier modifier;
        Composer startRestartGroup = composer.startRestartGroup(-2108849428);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(sheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(f2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(shape) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(j) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(f3) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(f4) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(nyVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2108849428, i3, i4, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:235)");
            }
            MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
            FiniteAnimationSpec value = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
            FiniteAnimationSpec value2 = MotionSchemeKt.value(motionSchemeKeyTokens, startRestartGroup, 6);
            FiniteAnimationSpec value3 = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            int i7 = i3 & 14;
            boolean changedInstance = (i7 == 4) | startRestartGroup.changedInstance(value2) | startRestartGroup.changedInstance(value3) | startRestartGroup.changedInstance(value);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                i5 = i3;
                i6 = 0;
                af afVar = new af(sheetState, value2, value3, value, 0);
                startRestartGroup.updateRememberedValue(afVar);
                rememberedValue = afVar;
            } else {
                i5 = i3;
                i6 = 0;
            }
            EffectsKt.SideEffect((iy) rememberedValue, startRestartGroup, i6);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final un unVar = (un) rememberedValue2;
            Orientation orientation = Orientation.Vertical;
            float mo367toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo367toPx0680j_4(f);
            if (z) {
                startRestartGroup.startReplaceGroup(2049456610);
                companion2 = Modifier.Companion;
                boolean changed = startRestartGroup.changed(sheetState.getAnchoredDraggableState$material3());
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue3 == companion3.getEmpty()) {
                    rememberedValue3 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, new defpackage.g(9, unVar, sheetState));
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                companion = companion3;
                obj = null;
                modifier = NestedScrollModifierKt.nestedScroll$default(companion2, (NestedScrollConnection) rememberedValue3, null, 2, null);
                startRestartGroup.endReplaceGroup();
            } else {
                companion = companion3;
                obj = null;
                startRestartGroup.startReplaceGroup(2049851798);
                startRestartGroup.endReplaceGroup();
                companion2 = Modifier.Companion;
                modifier = companion2;
            }
            Modifier then = SizeKt.m798requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m814widthInVpY3zN4$default(companion2, 0.0f, f2, 1, obj), 0.0f, 1, obj), f, 0.0f, 2, obj).then(modifier);
            AnchoredDraggableState<SheetValue> anchoredDraggableState$material3 = sheetState.getAnchoredDraggableState$material3();
            boolean changed2 = (i7 == 4) | startRestartGroup.changed(mo367toPx0680j_4);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new bf(mo367toPx0680j_4, 0, sheetState);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            int i8 = i5 >> 9;
            SurfaceKt.m2464SurfaceT9BRK9s(verticalScaleUp(AnchoredDraggableKt.anchoredDraggable$default(AnchoredDraggableKt.draggableAnchors(then, anchoredDraggableState$material3, orientation, (my) rememberedValue4), sheetState.getAnchoredDraggableState$material3(), orientation, z, false, null, 24, null), sheetState), shape, j, j2, f3, f4, null, ComposableLambdaKt.rememberComposableLambda(1508311921, true, new my() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3
                public final void invoke(Composer composer3, int i9) {
                    if (!composer3.shouldExecute((i9 & 3) != 2, i9 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1508311921, i9, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:323)");
                    }
                    Modifier verticalScaleDown = BottomSheetScaffoldKt.verticalScaleDown(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), SheetState.this);
                    my myVar2 = myVar;
                    ny nyVar2 = nyVar;
                    SheetState sheetState2 = SheetState.this;
                    un unVar2 = unVar;
                    boolean z2 = z;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer3, 0);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, verticalScaleDown);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                    iy constructor = companion4.getConstructor();
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
                    my b = k4.b(companion4, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (myVar2 != null) {
                        composer3.startReplaceGroup(-1044068159);
                        Strings.Companion companion5 = Strings.Companion;
                        SheetDefaultsKt.DragHandleWithTooltip(columnScopeInstance, ComposableLambdaKt.rememberComposableLambda(-511691176, true, new BottomSheetScaffoldKt$StandardBottomSheet$3$1$1(sheetState2, unVar2, z2, Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_bottom_sheet_expand_description), composer3, 0), Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_bottom_sheet_collapse_description), composer3, 0), Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_bottom_sheet_dismiss_description), composer3, 0), myVar2), composer3, 54), composer3, 54);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(-1040260677);
                        composer3.endReplaceGroup();
                    }
                    nyVar2.invoke(columnScopeInstance, composer3, 6);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), startRestartGroup, (i8 & 112) | 12582912 | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 64);
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: cf
                @Override // defpackage.my
                public final Object invoke(Object obj2, Object obj3) {
                    w01 StandardBottomSheet_w7I5h1o$lambda$14;
                    int intValue = ((Integer) obj3).intValue();
                    StandardBottomSheet_w7I5h1o$lambda$14 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$14(SheetState.this, f, f2, z, shape, j, j2, f3, f4, myVar, nyVar, i, i2, (Composer) obj2, intValue);
                    return StandardBottomSheet_w7I5h1o$lambda$14;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 StandardBottomSheet_w7I5h1o$lambda$10$lambda$9(un unVar, SheetState sheetState, float f) {
        p01.t(unVar, null, null, new BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1(sheetState, f, null), 3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r5.hasAnchorFor(r6) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r5.hasAnchorFor(r6) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r5.hasAnchorFor(r6) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final xe0 StandardBottomSheet_w7I5h1o$lambda$13$lambda$12(SheetState sheetState, float f, IntSize intSize, Constraints constraints) {
        SheetValue sheetValue;
        DraggableAnchors DraggableAnchors = AnchoredDraggableKt.DraggableAnchors(new ef(sheetState, Constraints.m7563getMaxHeightimpl(constraints.m7570unboximpl()), f, (int) (intSize.m7786unboximpl() & 4294967295L)));
        SheetValue targetValue = sheetState.getAnchoredDraggableState$material3().getTargetValue();
        int i = WhenMappings.$EnumSwitchMapping$0[targetValue.ordinal()];
        if (i != 1) {
            if (i == 2) {
                sheetValue = SheetValue.PartiallyExpanded;
                if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                    sheetValue = SheetValue.Expanded;
                    if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                        sheetValue = SheetValue.Hidden;
                    }
                }
                targetValue = sheetValue;
                return new xe0(DraggableAnchors, targetValue);
            }
            if (i != 3) {
                defpackage.o.n();
                return null;
            }
            sheetValue = SheetValue.Expanded;
            if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                sheetValue = SheetValue.PartiallyExpanded;
                if (!DraggableAnchors.hasAnchorFor(sheetValue)) {
                    sheetValue = SheetValue.Hidden;
                }
            }
            targetValue = sheetValue;
            return new xe0(DraggableAnchors, targetValue);
        }
        sheetValue = SheetValue.Hidden;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 StandardBottomSheet_w7I5h1o$lambda$13$lambda$12$lambda$11(SheetState sheetState, float f, float f2, float f3, DraggableAnchorsConfig draggableAnchorsConfig) {
        if (!sheetState.getSkipPartiallyExpanded$material3()) {
            draggableAnchorsConfig.at(SheetValue.PartiallyExpanded, f - f2);
        }
        if (f3 != f2) {
            draggableAnchorsConfig.at(SheetValue.Expanded, Math.max(f - f3, 0.0f));
        }
        if (!sheetState.getSkipHiddenState$material3()) {
            draggableAnchorsConfig.at(SheetValue.Hidden, f);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 StandardBottomSheet_w7I5h1o$lambda$14(SheetState sheetState, float f, float f2, boolean z, Shape shape, long j, long j2, float f3, float f4, my myVar, ny nyVar, int i, int i2, Composer composer, int i3) {
        m1648StandardBottomSheetw7I5h1o(sheetState, f, f2, z, shape, j, j2, f3, f4, myVar, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 StandardBottomSheet_w7I5h1o$lambda$7$lambda$6(SheetState sheetState, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3) {
        sheetState.setShowMotionSpec$material3(finiteAnimationSpec);
        sheetState.setHideMotionSpec$material3(finiteAnimationSpec2);
        sheetState.setAnchoredDraggableMotionSpec$material3(finiteAnimationSpec3);
        return w01.a;
    }

    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(SheetState sheetState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        Composer composer2;
        if ((i2 & 1) != 0) {
            composer2 = composer;
            sheetState = rememberStandardBottomSheetState(null, null, false, composer2, 0, 7);
        } else {
            composer2 = composer;
        }
        if ((i2 & 2) != 0) {
            Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer2.updateRememberedValue(rememberedValue);
            }
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1474606134, i, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:191)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && composer2.changed(sheetState)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer2.changed(snackbarHostState)) || (i & 48) == 32);
        Object rememberedValue2 = composer2.rememberedValue();
        if (z || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(sheetState, snackbarHostState);
            composer2.updateRememberedValue(rememberedValue2);
        }
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bottomSheetScaffoldState;
    }

    public static final SheetState rememberStandardBottomSheetState(SheetValue sheetValue, ky kyVar, boolean z, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i2 & 2) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ed(7);
                composer.updateRememberedValue(rememberedValue);
            }
            kyVar = (ky) rememberedValue;
        }
        ky kyVar2 = kyVar;
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:215)");
        }
        SheetState m2373rememberSheetStateAGcomas = SheetDefaultsKt.m2373rememberSheetStateAGcomas(false, kyVar2, sheetValue2, z2, 0.0f, 0.0f, composer, (i & 112) | ((i << 6) & 896) | ((i << 3) & 7168), 49);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2373rememberSheetStateAGcomas;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean rememberStandardBottomSheetState$lambda$5$lambda$4(SheetValue sheetValue) {
        return true;
    }

    public static final Modifier verticalScaleDown(Modifier modifier, SheetState sheetState) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new ze(sheetState, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 verticalScaleDown$lambda$18(SheetState sheetState, GraphicsLayerScope graphicsLayerScope) {
        float offset = sheetState.getAnchoredDraggableState$material3().getOffset();
        float minAnchor = sheetState.getAnchoredDraggableState$material3().getAnchors().minAnchor();
        float f = offset < minAnchor ? minAnchor - offset : 0.0f;
        graphicsLayerScope.setScaleY(f > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() & 4294967295L)) + f) / Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() & 4294967295L))) : 1.0f);
        graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, 0.0f));
        return w01.a;
    }

    public static final Modifier verticalScaleUp(Modifier modifier, SheetState sheetState) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new ze(sheetState, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 verticalScaleUp$lambda$17(SheetState sheetState, GraphicsLayerScope graphicsLayerScope) {
        float offset = sheetState.getAnchoredDraggableState$material3().getOffset();
        float minAnchor = sheetState.getAnchoredDraggableState$material3().getAnchors().minAnchor();
        float f = offset < minAnchor ? minAnchor - offset : 0.0f;
        graphicsLayerScope.setScaleY(f > 0.0f ? (Float.intBitsToFloat((int) (graphicsLayerScope.mo4955getSizeNHjbRc() & 4294967295L)) + f) / Float.intBitsToFloat((int) (4294967295L & graphicsLayerScope.mo4955getSizeNHjbRc())) : 1.0f);
        graphicsLayerScope.mo4962setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(0.5f, 0.0f));
        return w01.a;
    }
}
