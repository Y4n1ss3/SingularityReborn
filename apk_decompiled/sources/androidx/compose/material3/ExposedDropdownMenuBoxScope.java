package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import defpackage.dq;
import defpackage.er;
import defpackage.iy;
import defpackage.j3;
import defpackage.lu0;
import defpackage.my;
import defpackage.ny;
import defpackage.r5;
import defpackage.vh;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable = 0;

    public /* synthetic */ ExposedDropdownMenuBoxScope(dq dqVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExposedDropdownMenu$lambda$9(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, iy iyVar, Modifier modifier, ScrollState scrollState, ny nyVar, int i, int i2, Composer composer, int i3) {
        exposedDropdownMenuBoxScope.ExposedDropdownMenu(z, iyVar, modifier, scrollState, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExposedDropdownMenu_kbRbctU$lambda$8(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, iy iyVar, Modifier modifier, ScrollState scrollState, boolean z2, boolean z3, Shape shape, long j, float f, float f2, BorderStroke borderStroke, ny nyVar, int i, int i2, int i3, Composer composer, int i4) {
        exposedDropdownMenuBoxScope.m1960ExposedDropdownMenukbRbctU(z, iyVar, modifier, scrollState, z2, z3, shape, j, f, f2, borderStroke, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExposedDropdownMenu_vNxi1II$lambda$2$lambda$1(MutableState mutableState) {
        w01 w01Var = w01.a;
        mutableState.setValue(w01Var);
        return w01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExposedDropdownMenu_vNxi1II$lambda$6$lambda$5(MutableState mutableState, IntRect intRect, IntRect intRect2) {
        mutableState.setValue(TransformOrigin.m5161boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ExposedDropdownMenu_vNxi1II$lambda$7(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, iy iyVar, Modifier modifier, ScrollState scrollState, boolean z2, Shape shape, long j, float f, float f2, BorderStroke borderStroke, ny nyVar, int i, int i2, int i3, Composer composer, int i4) {
        exposedDropdownMenuBoxScope.m1961ExposedDropdownMenuvNxi1II(z, iyVar, modifier, scrollState, z2, shape, j, f, f2, borderStroke, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    public static /* synthetic */ Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
            return null;
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z);
    }

    /* renamed from: menuAnchor-2Hz36ac$default, reason: not valid java name */
    public static /* synthetic */ Modifier m1959menuAnchor2Hz36ac$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            lu0.a("Super calls with default arguments not supported in this target, function: menuAnchor-2Hz36ac");
            return null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope.mo1963menuAnchor2Hz36ac(modifier, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0075  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void ExposedDropdownMenu(boolean z, iy iyVar, Modifier modifier, ScrollState scrollState, ny nyVar, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        iy iyVar2;
        Modifier modifier2;
        ScrollState scrollState2;
        ny nyVar2;
        ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        ScrollState rememberScrollState;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1501437777);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            }
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i4 = Fields.CameraDistance;
                        i3 |= i4;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i4 = Fields.RotationZ;
                i3 |= i4;
            } else {
                scrollState2 = scrollState;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                nyVar2 = nyVar;
                i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.Clip : 8192;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    exposedDropdownMenuBoxScope = this;
                    i3 |= startRestartGroup.changed(exposedDropdownMenuBoxScope) ? Fields.RenderEffect : 65536;
                    if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i5 != 0 ? Modifier.Companion : modifier2;
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                modifier3 = modifier4;
                                rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1501437777, i3, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:430)");
                                }
                                MenuDefaults menuDefaults = MenuDefaults.INSTANCE;
                                int i6 = i3 >> 9;
                                composer2 = startRestartGroup;
                                exposedDropdownMenuBoxScope.m1960ExposedDropdownMenukbRbctU(z2, iyVar2, modifier3, rememberScrollState, false, true, menuDefaults.getShape(startRestartGroup, 6), menuDefaults.getContainerColor(startRestartGroup, 6), menuDefaults.m2130getTonalElevationD9Ej5fM(), menuDefaults.m2129getShadowElevationD9Ej5fM(), null, nyVar2, composer2, (i3 & 14) | 906166272 | (i3 & 112) | (i3 & 896) | (i3 & 7168), (i6 & 112) | 6 | (i6 & 896), 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                scrollState2 = rememberScrollState;
                            } else {
                                modifier3 = modifier4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            modifier3 = modifier2;
                        }
                        rememberScrollState = scrollState2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        MenuDefaults menuDefaults2 = MenuDefaults.INSTANCE;
                        int i62 = i3 >> 9;
                        composer2 = startRestartGroup;
                        exposedDropdownMenuBoxScope.m1960ExposedDropdownMenukbRbctU(z2, iyVar2, modifier3, rememberScrollState, false, true, menuDefaults2.getShape(startRestartGroup, 6), menuDefaults2.getContainerColor(startRestartGroup, 6), menuDefaults2.m2130getTonalElevationD9Ej5fM(), menuDefaults2.m2129getShadowElevationD9Ej5fM(), null, nyVar2, composer2, (i3 & 14) | 906166272 | (i3 & 112) | (i3 & 896) | (i3 & 7168), (i62 & 112) | 6 | (i62 & 896), 16);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier3;
                        scrollState2 = rememberScrollState;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new vh(this, z, iyVar, modifier2, scrollState2, nyVar, i, i2));
                        return;
                    }
                    return;
                }
                exposedDropdownMenuBoxScope = this;
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            nyVar2 = nyVar;
            if ((i2 & 32) != 0) {
            }
            exposedDropdownMenuBoxScope = this;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        nyVar2 = nyVar;
        if ((i2 & 32) != 0) {
        }
        exposedDropdownMenuBoxScope = this;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @er
    /* renamed from: ExposedDropdownMenu-kbRbctU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1960ExposedDropdownMenukbRbctU(final boolean z, final iy iyVar, Modifier modifier, ScrollState scrollState, boolean z2, boolean z3, Shape shape, long j, float f, float f2, BorderStroke borderStroke, final ny nyVar, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        iy iyVar2;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z4;
        Shape shape2;
        long j2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer composer2;
        final ScrollState scrollState2;
        final float f3;
        final boolean z5;
        final Shape shape3;
        final long j3;
        final Modifier modifier3;
        final boolean z6;
        final float f4;
        final BorderStroke borderStroke2;
        ScopeUpdateScope endRestartGroup;
        ScrollState scrollState3;
        boolean z7;
        Shape shape4;
        BorderStroke borderStroke3;
        ScrollState scrollState4;
        float f5;
        boolean z8;
        Shape shape5;
        float f6;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-1772805535);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            iyVar2 = iyVar;
            i4 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0 && startRestartGroup.changed(scrollState)) {
                        i14 = Fields.CameraDistance;
                        i4 |= i14;
                    }
                    i14 = Fields.RotationZ;
                    i4 |= i14;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                    z4 = z3;
                } else {
                    z4 = z3;
                    if ((i & 196608) == 0) {
                        i4 |= startRestartGroup.changed(z4) ? Fields.RenderEffect : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    shape2 = shape;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : Fields.BlendMode;
                } else {
                    shape2 = shape;
                }
                if ((i & 12582912) == 0) {
                    j2 = j;
                    i4 |= ((i3 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(j2)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                } else {
                    j2 = j;
                }
                i7 = i3 & Fields.RotationX;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(f) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                }
                i8 = i3 & Fields.RotationY;
                if (i8 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i9 = i8;
                    i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    i10 = i3 & Fields.RotationZ;
                    if (i10 == 0) {
                        i12 = i2 | 6;
                        i11 = i10;
                    } else if ((i2 & 6) == 0) {
                        i11 = i10;
                        i12 = i2 | (startRestartGroup.changed(borderStroke) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    if ((i3 & Fields.CameraDistance) == 0) {
                        i12 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i12 |= startRestartGroup.changedInstance(nyVar) ? 32 : 16;
                    }
                    i13 = i12;
                    if ((i3 & Fields.TransformOrigin) == 0) {
                        i13 |= 384;
                    } else if ((i2 & 384) == 0) {
                        i13 |= startRestartGroup.changed(this) ? Fields.RotationX : Fields.SpotShadowColor;
                        if (startRestartGroup.shouldExecute((i4 & 306775187) == 306775186 || (i13 & 147) != 146, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i5 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if ((i3 & 8) != 0) {
                                    scrollState3 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                    i4 &= -7169;
                                } else {
                                    scrollState3 = scrollState;
                                }
                                z7 = (i3 & 16) != 0 ? true : z2;
                                boolean z9 = i6 == 0 ? z4 : true;
                                if ((i3 & 64) != 0) {
                                    shape4 = MenuDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                    i4 &= -3670017;
                                } else {
                                    shape4 = shape2;
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    j2 = MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                    i4 &= -29360129;
                                }
                                float m2130getTonalElevationD9Ej5fM = i7 != 0 ? MenuDefaults.INSTANCE.m2130getTonalElevationD9Ej5fM() : f;
                                float m2129getShadowElevationD9Ej5fM = i9 != 0 ? MenuDefaults.INSTANCE.m2129getShadowElevationD9Ej5fM() : f2;
                                if (i11 != 0) {
                                    scrollState4 = scrollState3;
                                    f5 = m2130getTonalElevationD9Ej5fM;
                                    z8 = z9;
                                    shape5 = shape4;
                                    f6 = m2129getShadowElevationD9Ej5fM;
                                    borderStroke3 = null;
                                } else {
                                    borderStroke3 = borderStroke;
                                    scrollState4 = scrollState3;
                                    f5 = m2130getTonalElevationD9Ej5fM;
                                    z8 = z9;
                                    shape5 = shape4;
                                    f6 = m2129getShadowElevationD9Ej5fM;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                if ((i3 & 64) != 0) {
                                    i4 &= -3670017;
                                }
                                if ((i3 & Fields.SpotShadowColor) != 0) {
                                    i4 &= -29360129;
                                }
                                scrollState4 = scrollState;
                                z7 = z2;
                                f5 = f;
                                f6 = f2;
                                borderStroke3 = borderStroke;
                                z8 = z4;
                                shape5 = shape2;
                            }
                            long j4 = j2;
                            Modifier modifier4 = modifier2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1772805535, i4, i13, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:401)");
                            }
                            int i15 = i4 >> 3;
                            composer2 = startRestartGroup;
                            m1961ExposedDropdownMenuvNxi1II(z, iyVar2, modifier4, scrollState4, z8, shape5, j4, f5, f6, borderStroke3, nyVar, composer2, (i4 & 8190) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (i15 & 234881024) | ((i13 << 27) & 1879048192), (i13 >> 3) & 126, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z6 = z7;
                            modifier3 = modifier4;
                            scrollState2 = scrollState4;
                            z5 = z8;
                            shape3 = shape5;
                            j3 = j4;
                            f3 = f5;
                            f4 = f6;
                            borderStroke2 = borderStroke3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            scrollState2 = scrollState;
                            f3 = f;
                            z5 = z4;
                            shape3 = shape2;
                            j3 = j2;
                            modifier3 = modifier2;
                            z6 = z2;
                            f4 = f2;
                            borderStroke2 = borderStroke;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: lu
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 ExposedDropdownMenu_kbRbctU$lambda$8;
                                    int intValue = ((Integer) obj2).intValue();
                                    ExposedDropdownMenu_kbRbctU$lambda$8 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu_kbRbctU$lambda$8(ExposedDropdownMenuBoxScope.this, z, iyVar, modifier3, scrollState2, z6, z5, shape3, j3, f3, f4, borderStroke2, nyVar, i, i2, i3, (Composer) obj, intValue);
                                    return ExposedDropdownMenu_kbRbctU$lambda$8;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306775187) == 306775186 || (i13 & 147) != 146, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i9 = i8;
                i10 = i3 & Fields.RotationZ;
                if (i10 == 0) {
                }
                if ((i3 & Fields.CameraDistance) == 0) {
                }
                i13 = i12;
                if ((i3 & Fields.TransformOrigin) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306775187) == 306775186 || (i13 & 147) != 146, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            if ((i & 3072) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i3 & Fields.RotationX;
            if (i7 != 0) {
            }
            i8 = i3 & Fields.RotationY;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & Fields.RotationZ;
            if (i10 == 0) {
            }
            if ((i3 & Fields.CameraDistance) == 0) {
            }
            i13 = i12;
            if ((i3 & Fields.TransformOrigin) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306775187) == 306775186 || (i13 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        iyVar2 = iyVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i3 & Fields.RotationX;
        if (i7 != 0) {
        }
        i8 = i3 & Fields.RotationY;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & Fields.RotationZ;
        if (i10 == 0) {
        }
        if ((i3 & Fields.CameraDistance) == 0) {
        }
        i13 = i12;
        if ((i3 & Fields.TransformOrigin) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306775187) == 306775186 || (i13 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a9  */
    /* renamed from: ExposedDropdownMenu-vNxi1II, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1961ExposedDropdownMenuvNxi1II(final boolean z, final iy iyVar, Modifier modifier, ScrollState scrollState, boolean z2, Shape shape, long j, float f, float f2, BorderStroke borderStroke, final ny nyVar, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        iy iyVar2;
        int i5;
        Modifier modifier2;
        ScrollState scrollState2;
        int i6;
        boolean z3;
        final long j2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer composer2;
        final Shape shape2;
        final float f3;
        final Modifier modifier3;
        final ScrollState scrollState3;
        final boolean z4;
        final float f4;
        final BorderStroke borderStroke2;
        ScopeUpdateScope endRestartGroup;
        ScrollState scrollState4;
        Shape shape3;
        final BorderStroke borderStroke3;
        final Modifier modifier4;
        final float f5;
        final long j3;
        final Shape shape4;
        final ScrollState scrollState5;
        final float f6;
        final boolean z5;
        Object rememberedValue;
        Composer.Companion companion;
        MutableState mutableState;
        Object rememberedValue2;
        final MutableTransitionState mutableTransitionState;
        Object rememberedValue3;
        boolean changed;
        Object rememberedValue4;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-126848451);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            iyVar2 = iyVar;
            i4 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        scrollState2 = scrollState;
                        if (startRestartGroup.changed(scrollState2)) {
                            i14 = Fields.CameraDistance;
                            i4 |= i14;
                        }
                    } else {
                        scrollState2 = scrollState;
                    }
                    i14 = Fields.RotationZ;
                    i4 |= i14;
                } else {
                    scrollState2 = scrollState;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    z3 = z2;
                    i4 |= startRestartGroup.changed(z3) ? Fields.Clip : 8192;
                    if ((i & 196608) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape)) ? Fields.RenderEffect : 65536;
                    }
                    if ((i & 1572864) != 0) {
                        j2 = j;
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j2)) ? 1048576 : Fields.BlendMode;
                    } else {
                        j2 = j;
                    }
                    i7 = i3 & Fields.SpotShadowColor;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(f) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    i8 = i3 & Fields.RotationX;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i10 = i3 & Fields.RotationY;
                        if (i10 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i11 = i10;
                            i4 |= startRestartGroup.changed(borderStroke) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if ((i3 & Fields.RotationZ) == 0) {
                                i12 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i12 = i2 | (startRestartGroup.changedInstance(nyVar) ? 4 : 2);
                            } else {
                                i12 = i2;
                            }
                            if ((i3 & Fields.CameraDistance) == 0) {
                                i12 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i12 |= startRestartGroup.changed(this) ? 32 : 16;
                                i13 = i12;
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier5 = i5 != 0 ? Modifier.Companion : modifier2;
                                        if ((i3 & 8) != 0) {
                                            scrollState4 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                            i4 &= -7169;
                                        } else {
                                            scrollState4 = scrollState2;
                                        }
                                        if (i6 != 0) {
                                            z3 = true;
                                        }
                                        if ((i3 & 32) != 0) {
                                            shape3 = MenuDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                            i4 &= -458753;
                                        } else {
                                            shape3 = shape;
                                        }
                                        if ((i3 & 64) != 0) {
                                            j2 = MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                            i4 &= -3670017;
                                        }
                                        float m2130getTonalElevationD9Ej5fM = i7 != 0 ? MenuDefaults.INSTANCE.m2130getTonalElevationD9Ej5fM() : f;
                                        float m2129getShadowElevationD9Ej5fM = i9 != 0 ? MenuDefaults.INSTANCE.m2129getShadowElevationD9Ej5fM() : f2;
                                        if (i11 != 0) {
                                            modifier4 = modifier5;
                                            f5 = m2130getTonalElevationD9Ej5fM;
                                            j3 = j2;
                                            shape4 = shape3;
                                            scrollState5 = scrollState4;
                                            f6 = m2129getShadowElevationD9Ej5fM;
                                            z5 = z3;
                                            borderStroke3 = null;
                                            startRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-126848451, i4, i13, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.kt:321)");
                                            }
                                            rememberedValue = startRestartGroup.rememberedValue();
                                            companion = Composer.Companion;
                                            if (rememberedValue == companion.getEmpty()) {
                                                rememberedValue = SnapshotStateKt.mutableStateOf(w01.a, SnapshotStateKt.neverEqualPolicy());
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            mutableState = (MutableState) rememberedValue;
                                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                            int top = WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, startRestartGroup, 6).getTop(density);
                                            if (z) {
                                                startRestartGroup.startReplaceGroup(630077189);
                                                startRestartGroup.endReplaceGroup();
                                            } else {
                                                startRestartGroup.startReplaceGroup(629991660);
                                                Object rememberedValue5 = startRestartGroup.rememberedValue();
                                                if (rememberedValue5 == companion.getEmpty()) {
                                                    rememberedValue5 = new j3(mutableState, 10);
                                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                                }
                                                ExposedDropdownMenu_androidKt.OnPlatformWindowBoundsChange((iy) rememberedValue5, startRestartGroup, 6);
                                                startRestartGroup.endReplaceGroup();
                                            }
                                            rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (rememberedValue2 == companion.getEmpty()) {
                                                rememberedValue2 = new MutableTransitionState(Boolean.FALSE);
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            }
                                            mutableTransitionState = (MutableTransitionState) rememberedValue2;
                                            mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z));
                                            if (!((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                                                startRestartGroup.startReplaceGroup(630396489);
                                                rememberedValue3 = startRestartGroup.rememberedValue();
                                                if (rememberedValue3 == companion.getEmpty()) {
                                                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m5161boximpl(TransformOrigin.Companion.m5174getCenterSzJe1aQ()), null, 2, null);
                                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                                }
                                                final MutableState mutableState2 = (MutableState) rememberedValue3;
                                                changed = startRestartGroup.changed(density) | startRestartGroup.changed(top);
                                                rememberedValue4 = startRestartGroup.rememberedValue();
                                                if (!changed || rememberedValue4 == companion.getEmpty()) {
                                                    rememberedValue4 = new ExposedDropdownMenuPositionProvider(density, top, mutableState, 0, new r5(mutableState2, 3), 8, null);
                                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                                }
                                                AndroidPopup_androidKt.Popup((ExposedDropdownMenuPositionProvider) rememberedValue4, iyVar2, ExposedDropdownMenu_androidKt.m1979popupPropertiesForAnchorTypeBTG8q0(mo1962getAnchorTypeoYjWRB4$material3(), getAlwaysFocusable$material3(), startRestartGroup, 0), ComposableLambdaKt.rememberComposableLambda(2063119149, true, new my() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                                    public final void invoke(Composer composer3, int i15) {
                                                        if (!composer3.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(2063119149, i15, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:355)");
                                                        }
                                                        MenuKt.m2143DropdownMenuContentQj0Zi0g(ExposedDropdownMenuBoxScope.this.exposedDropdownSize(modifier4, z5), mutableTransitionState, mutableState2, scrollState5, shape4, j3, f5, f6, borderStroke3, nyVar, composer3, (MutableTransitionState.$stable << 3) | 384);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                }, startRestartGroup, 54), startRestartGroup, (i4 & 112) | 3072, 0);
                                                composer2 = startRestartGroup;
                                                composer2.endReplaceGroup();
                                            } else {
                                                startRestartGroup.startReplaceGroup(631807237);
                                                startRestartGroup.endReplaceGroup();
                                                composer2 = startRestartGroup;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            modifier3 = modifier4;
                                            z4 = z5;
                                            scrollState3 = scrollState5;
                                            shape2 = shape4;
                                            j2 = j3;
                                            f3 = f5;
                                            f4 = f6;
                                            borderStroke2 = borderStroke3;
                                        } else {
                                            borderStroke3 = borderStroke;
                                            modifier4 = modifier5;
                                            f5 = m2130getTonalElevationD9Ej5fM;
                                            j3 = j2;
                                            shape4 = shape3;
                                            scrollState5 = scrollState4;
                                            f6 = m2129getShadowElevationD9Ej5fM;
                                        }
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 8) != 0) {
                                            i4 &= -7169;
                                        }
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        shape4 = shape;
                                        f5 = f;
                                        f6 = f2;
                                        borderStroke3 = borderStroke;
                                        j3 = j2;
                                        modifier4 = modifier2;
                                        scrollState5 = scrollState2;
                                    }
                                    z5 = z3;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    companion = Composer.Companion;
                                    if (rememberedValue == companion.getEmpty()) {
                                    }
                                    mutableState = (MutableState) rememberedValue;
                                    Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                    int top2 = WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, startRestartGroup, 6).getTop(density2);
                                    if (z) {
                                    }
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == companion.getEmpty()) {
                                    }
                                    mutableTransitionState = (MutableTransitionState) rememberedValue2;
                                    mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z));
                                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                                    }
                                    startRestartGroup.startReplaceGroup(630396489);
                                    rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == companion.getEmpty()) {
                                    }
                                    final MutableState<TransformOrigin> mutableState22 = (MutableState) rememberedValue3;
                                    changed = startRestartGroup.changed(density2) | startRestartGroup.changed(top2);
                                    rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (!changed) {
                                    }
                                    rememberedValue4 = new ExposedDropdownMenuPositionProvider(density2, top2, mutableState, 0, new r5(mutableState22, 3), 8, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                    AndroidPopup_androidKt.Popup((ExposedDropdownMenuPositionProvider) rememberedValue4, iyVar2, ExposedDropdownMenu_androidKt.m1979popupPropertiesForAnchorTypeBTG8q0(mo1962getAnchorTypeoYjWRB4$material3(), getAlwaysFocusable$material3(), startRestartGroup, 0), ComposableLambdaKt.rememberComposableLambda(2063119149, true, new my() { // from class: androidx.compose.material3.ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2
                                        public final void invoke(Composer composer3, int i15) {
                                            if (!composer3.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2063119149, i15, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.kt:355)");
                                            }
                                            MenuKt.m2143DropdownMenuContentQj0Zi0g(ExposedDropdownMenuBoxScope.this.exposedDropdownSize(modifier4, z5), mutableTransitionState, mutableState22, scrollState5, shape4, j3, f5, f6, borderStroke3, nyVar, composer3, (MutableTransitionState.$stable << 3) | 384);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.my
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                            return w01.a;
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, (i4 & 112) | 3072, 0);
                                    composer2 = startRestartGroup;
                                    composer2.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier4;
                                    z4 = z5;
                                    scrollState3 = scrollState5;
                                    shape2 = shape4;
                                    j2 = j3;
                                    f3 = f5;
                                    f4 = f6;
                                    borderStroke2 = borderStroke3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    shape2 = shape;
                                    f3 = f;
                                    modifier3 = modifier2;
                                    scrollState3 = scrollState2;
                                    z4 = z3;
                                    f4 = f2;
                                    borderStroke2 = borderStroke;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new my() { // from class: mu
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 ExposedDropdownMenu_vNxi1II$lambda$7;
                                            int intValue = ((Integer) obj2).intValue();
                                            ExposedDropdownMenu_vNxi1II$lambda$7 = ExposedDropdownMenuBoxScope.ExposedDropdownMenu_vNxi1II$lambda$7(ExposedDropdownMenuBoxScope.this, z, iyVar, modifier3, scrollState3, z4, shape2, j2, f3, f4, borderStroke2, nyVar, i, i2, i3, (Composer) obj, intValue);
                                            return ExposedDropdownMenu_vNxi1II$lambda$7;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i13 = i12;
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i11 = i10;
                        if ((i3 & Fields.RotationZ) == 0) {
                        }
                        if ((i3 & Fields.CameraDistance) == 0) {
                        }
                        i13 = i12;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i9 = i8;
                    i10 = i3 & Fields.RotationY;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    if ((i3 & Fields.RotationZ) == 0) {
                    }
                    if ((i3 & Fields.CameraDistance) == 0) {
                    }
                    i13 = i12;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z3 = z2;
                if ((i & 196608) == 0) {
                }
                if ((i & 1572864) != 0) {
                }
                i7 = i3 & Fields.SpotShadowColor;
                if (i7 == 0) {
                }
                i8 = i3 & Fields.RotationX;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i3 & Fields.RotationY;
                if (i10 != 0) {
                }
                i11 = i10;
                if ((i3 & Fields.RotationZ) == 0) {
                }
                if ((i3 & Fields.CameraDistance) == 0) {
                }
                i13 = i12;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            if ((i & 3072) == 0) {
            }
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z3 = z2;
            if ((i & 196608) == 0) {
            }
            if ((i & 1572864) != 0) {
            }
            i7 = i3 & Fields.SpotShadowColor;
            if (i7 == 0) {
            }
            i8 = i3 & Fields.RotationX;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i3 & Fields.RotationY;
            if (i10 != 0) {
            }
            i11 = i10;
            if ((i3 & Fields.RotationZ) == 0) {
            }
            if ((i3 & Fields.CameraDistance) == 0) {
            }
            i13 = i12;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        iyVar2 = iyVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z3 = z2;
        if ((i & 196608) == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        i7 = i3 & Fields.SpotShadowColor;
        if (i7 == 0) {
        }
        i8 = i3 & Fields.RotationX;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i3 & Fields.RotationY;
        if (i10 != 0) {
        }
        i11 = i10;
        if ((i3 & Fields.RotationZ) == 0) {
        }
        if ((i3 & Fields.CameraDistance) == 0) {
        }
        i13 = i12;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public abstract Modifier exposedDropdownSize(Modifier modifier, boolean z);

    public abstract boolean getAlwaysFocusable$material3();

    /* renamed from: getAnchorType-oYjWRB4$material3, reason: not valid java name */
    public abstract String mo1962getAnchorTypeoYjWRB4$material3();

    @er
    public final Modifier menuAnchor(Modifier modifier) {
        return m1959menuAnchor2Hz36ac$default(this, modifier, ExposedDropdownMenuAnchorType.Companion.m1957getPrimaryNotEditableoYjWRB4(), false, 2, null);
    }

    /* renamed from: menuAnchor-2Hz36ac, reason: not valid java name */
    public abstract Modifier mo1963menuAnchor2Hz36ac(Modifier modifier, String str, boolean z);

    private ExposedDropdownMenuBoxScope() {
    }
}
