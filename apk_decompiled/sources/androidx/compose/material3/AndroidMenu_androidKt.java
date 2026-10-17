package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.internal.DropdownMenuPositionProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import defpackage.dq;
import defpackage.er;
import defpackage.iy;
import defpackage.my;
import defpackage.ny;
import defpackage.r5;
import defpackage.t5;
import defpackage.u5;
import defpackage.v5;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidMenu_androidKt {
    private static final PopupProperties DefaultMenuProperties = new PopupProperties(true, false, false, false, 14, (dq) null);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0065  */
    @er
    /* renamed from: DropdownMenu-4kj-_NE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1601DropdownMenu4kj_NE(boolean z, iy iyVar, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, ny nyVar, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        iy iyVar2;
        Modifier modifier2;
        int i4;
        long j2;
        ScrollState scrollState2;
        int i5;
        PopupProperties popupProperties2;
        int i6;
        Composer composer2;
        Modifier modifier3;
        long j3;
        ScrollState scrollState3;
        PopupProperties popupProperties3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Modifier modifier4;
        int i8;
        ScrollState scrollState4;
        PopupProperties popupProperties4;
        int i9;
        Modifier modifier5;
        long j4;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1518067413);
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
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                j2 = j;
                i3 |= startRestartGroup.changed(j2) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        scrollState2 = scrollState;
                        if (startRestartGroup.changed(scrollState2)) {
                            i10 = Fields.Clip;
                            i3 |= i10;
                        }
                    } else {
                        scrollState2 = scrollState;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    scrollState2 = scrollState;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    popupProperties2 = popupProperties;
                    i3 |= startRestartGroup.changed(popupProperties2) ? Fields.RenderEffect : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                        i6 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i6 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if (i4 != 0) {
                                    float m7611constructorimpl = Dp.m7611constructorimpl(0.0f);
                                    float m7611constructorimpl2 = Dp.m7611constructorimpl(0.0f);
                                    long floatToRawIntBits = Float.floatToRawIntBits(m7611constructorimpl);
                                    i7 = -57345;
                                    modifier4 = modifier2;
                                    j2 = DpOffset.m7667constructorimpl((Float.floatToRawIntBits(m7611constructorimpl2) & 4294967295L) | (floatToRawIntBits << 32));
                                } else {
                                    i7 = -57345;
                                    modifier4 = modifier2;
                                }
                                if ((i2 & 16) != 0) {
                                    i8 = i6 & i7;
                                    scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                } else {
                                    i8 = i6;
                                }
                                if (i5 != 0) {
                                    j4 = j2;
                                    scrollState4 = scrollState2;
                                    popupProperties4 = new PopupProperties(true, false, false, false, 14, (dq) null);
                                    i9 = 1518067413;
                                    modifier5 = modifier4;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(i9, i8, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:123)");
                                    }
                                    MenuDefaults menuDefaults = MenuDefaults.INSTANCE;
                                    composer2 = startRestartGroup;
                                    m1603DropdownMenuIlH_yew(z2, iyVar2, modifier5, j4, scrollState4, popupProperties4, menuDefaults.getShape(startRestartGroup, 6), menuDefaults.getContainerColor(startRestartGroup, 6), menuDefaults.m2130getTonalElevationD9Ej5fM(), menuDefaults.m2129getShadowElevationD9Ej5fM(), null, nyVar, composer2, (i8 & 14) | 905969664 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8), ((i8 >> 15) & 112) | 6, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier5;
                                    j3 = j4;
                                    scrollState3 = scrollState4;
                                    popupProperties3 = popupProperties4;
                                } else {
                                    scrollState4 = scrollState2;
                                    popupProperties4 = popupProperties2;
                                    i9 = 1518067413;
                                    modifier5 = modifier4;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i8 = i6 & (-57345);
                                    scrollState4 = scrollState2;
                                    popupProperties4 = popupProperties2;
                                } else {
                                    scrollState4 = scrollState2;
                                    popupProperties4 = popupProperties2;
                                    i8 = i6;
                                }
                                i9 = 1518067413;
                                modifier5 = modifier2;
                            }
                            j4 = j2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            MenuDefaults menuDefaults2 = MenuDefaults.INSTANCE;
                            composer2 = startRestartGroup;
                            m1603DropdownMenuIlH_yew(z2, iyVar2, modifier5, j4, scrollState4, popupProperties4, menuDefaults2.getShape(startRestartGroup, 6), menuDefaults2.getContainerColor(startRestartGroup, 6), menuDefaults2.m2130getTonalElevationD9Ej5fM(), menuDefaults2.m2129getShadowElevationD9Ej5fM(), null, nyVar, composer2, (i8 & 14) | 905969664 | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8), ((i8 >> 15) & 112) | 6, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier5;
                            j3 = j4;
                            scrollState3 = scrollState4;
                            popupProperties3 = popupProperties4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            j3 = j2;
                            scrollState3 = scrollState2;
                            popupProperties3 = popupProperties2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new v5(z, iyVar, modifier3, j3, scrollState3, popupProperties3, nyVar, i, i2));
                            return;
                        }
                        return;
                    }
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                popupProperties2 = popupProperties;
                if ((i2 & 64) == 0) {
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            j2 = j;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            popupProperties2 = popupProperties;
            if ((i2 & 64) == 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        j2 = j;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        popupProperties2 = popupProperties;
        if ((i2 & 64) == 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0065  */
    @er
    /* renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1602DropdownMenuILWXrKs(boolean z, iy iyVar, Modifier modifier, long j, PopupProperties popupProperties, ny nyVar, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        iy iyVar2;
        Modifier modifier2;
        int i4;
        int i5;
        ny nyVar2;
        Composer composer2;
        PopupProperties popupProperties2;
        Modifier modifier3;
        long j2;
        ScopeUpdateScope endRestartGroup;
        Composer composer3;
        long j3;
        Composer startRestartGroup = composer.startRestartGroup(1744198621);
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
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(j) ? Fields.CameraDistance : Fields.RotationZ;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(popupProperties) ? Fields.Clip : 8192;
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    nyVar2 = nyVar;
                    i3 |= startRestartGroup.changedInstance(nyVar2) ? Fields.RenderEffect : 65536;
                    if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        popupProperties2 = popupProperties;
                        modifier3 = modifier2;
                        j2 = j;
                    } else {
                        Modifier modifier4 = i6 != 0 ? Modifier.Companion : modifier2;
                        if (i4 != 0) {
                            composer3 = startRestartGroup;
                            j3 = DpOffset.m7667constructorimpl((Float.floatToRawIntBits(Dp.m7611constructorimpl(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(Dp.m7611constructorimpl(0.0f)) << 32));
                        } else {
                            composer3 = startRestartGroup;
                            j3 = j;
                        }
                        PopupProperties popupProperties3 = i5 != 0 ? new PopupProperties(true, false, false, false, 14, (dq) null) : popupProperties;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1744198621, i3, -1, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:158)");
                        }
                        Composer composer4 = composer3;
                        composer2 = composer4;
                        m1603DropdownMenuIlH_yew(z2, iyVar2, modifier4, j3, ScrollKt.rememberScrollState(0, composer4, 0, 1), popupProperties3, null, 0L, 0.0f, 0.0f, null, nyVar2, composer2, (i3 & 8190) | ((i3 << 3) & 458752), (i3 >> 12) & 112, 1984);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        j2 = j3;
                        popupProperties2 = popupProperties3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new u5(z, iyVar, modifier3, j2, popupProperties2, nyVar, i, i2));
                        return;
                    }
                    return;
                }
                nyVar2 = nyVar;
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i2 & 32) != 0) {
            }
            nyVar2 = nyVar;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        nyVar2 = nyVar;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: DropdownMenu-IlH_yew, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1603DropdownMenuIlH_yew(final boolean z, final iy iyVar, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, Shape shape, long j2, float f, float f2, BorderStroke borderStroke, final ny nyVar, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        iy iyVar2;
        int i5;
        Modifier modifier2;
        int i6;
        long j3;
        int i7;
        int i8;
        PopupProperties popupProperties2;
        Shape shape2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        final ScrollState scrollState2;
        final float f3;
        final long j4;
        final Modifier modifier3;
        final Shape shape3;
        final long j5;
        final float f4;
        final BorderStroke borderStroke2;
        ScopeUpdateScope endRestartGroup;
        ScrollState scrollState3;
        Shape shape4;
        long j6;
        final BorderStroke borderStroke3;
        final Modifier modifier4;
        final Shape shape5;
        final ScrollState scrollState4;
        final long j7;
        final float f5;
        final float f6;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(1725609375);
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
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                    j3 = j;
                    i7 = 32;
                } else {
                    j3 = j;
                    i7 = 32;
                    if ((i & 3072) == 0) {
                        i4 |= startRestartGroup.changed(j3) ? Fields.CameraDistance : Fields.RotationZ;
                    }
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0 && startRestartGroup.changed(scrollState)) {
                        i16 = Fields.Clip;
                        i4 |= i16;
                    }
                    i16 = 8192;
                    i4 |= i16;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i4 |= 196608;
                    popupProperties2 = popupProperties;
                } else {
                    popupProperties2 = popupProperties;
                    if ((i & 196608) == 0) {
                        i4 |= startRestartGroup.changed(popupProperties2) ? Fields.RenderEffect : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    shape2 = shape;
                    i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(shape2)) ? 1048576 : Fields.BlendMode;
                } else {
                    shape2 = shape;
                }
                if ((i & 12582912) == 0) {
                    i4 |= ((i3 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(j2)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                }
                i9 = i3 & Fields.RotationX;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(f) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                }
                i10 = i3 & Fields.RotationY;
                if (i10 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i11 = i10;
                    i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    i12 = i3 & Fields.RotationZ;
                    if (i12 == 0) {
                        i14 = i2 | 6;
                        i13 = i12;
                    } else if ((i2 & 6) == 0) {
                        i13 = i12;
                        i14 = i2 | (startRestartGroup.changed(borderStroke) ? 4 : 2);
                    } else {
                        i13 = i12;
                        i14 = i2;
                    }
                    if ((i3 & Fields.CameraDistance) == 0) {
                        i14 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i14 |= startRestartGroup.changedInstance(nyVar) ? i7 : 16;
                    }
                    i15 = i14;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        scrollState2 = scrollState;
                        f3 = f2;
                        j4 = j3;
                        modifier3 = modifier2;
                        shape3 = shape2;
                        j5 = j2;
                        f4 = f;
                        borderStroke2 = borderStroke;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i5 != 0 ? Modifier.Companion : modifier2;
                            if (i6 != 0) {
                                j3 = DpOffset.m7667constructorimpl((Float.floatToRawIntBits(Dp.m7611constructorimpl(0.0f)) << i7) | (Float.floatToRawIntBits(Dp.m7611constructorimpl(0.0f)) & 4294967295L));
                            }
                            if ((i3 & 16) != 0) {
                                scrollState3 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                i4 &= -57345;
                            } else {
                                scrollState3 = scrollState;
                            }
                            if (i8 != 0) {
                                popupProperties2 = DefaultMenuProperties;
                            }
                            if ((i3 & 64) != 0) {
                                shape4 = MenuDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                i4 &= -3670017;
                            } else {
                                shape4 = shape2;
                            }
                            if ((i3 & Fields.SpotShadowColor) != 0) {
                                j6 = MenuDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                i4 &= -29360129;
                            } else {
                                j6 = j2;
                            }
                            float m2130getTonalElevationD9Ej5fM = i9 != 0 ? MenuDefaults.INSTANCE.m2130getTonalElevationD9Ej5fM() : f;
                            float m2129getShadowElevationD9Ej5fM = i11 != 0 ? MenuDefaults.INSTANCE.m2129getShadowElevationD9Ej5fM() : f2;
                            if (i13 != 0) {
                                modifier4 = modifier5;
                                borderStroke3 = null;
                            } else {
                                borderStroke3 = borderStroke;
                                modifier4 = modifier5;
                            }
                            shape5 = shape4;
                            scrollState4 = scrollState3;
                            j7 = j6;
                            f5 = m2130getTonalElevationD9Ej5fM;
                            f6 = m2129getShadowElevationD9Ej5fM;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            if ((i3 & Fields.SpotShadowColor) != 0) {
                                i4 &= -29360129;
                            }
                            scrollState4 = scrollState;
                            j7 = j2;
                            f5 = f;
                            f6 = f2;
                            borderStroke3 = borderStroke;
                            modifier4 = modifier2;
                            shape5 = shape2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1725609375, i4, i15, "androidx.compose.material3.DropdownMenu (AndroidMenu.android.kt:54)");
                        }
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        Composer.Companion companion = Composer.Companion;
                        if (rememberedValue == companion.getEmpty()) {
                            rememberedValue = new MutableTransitionState(Boolean.FALSE);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue;
                        mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(z));
                        if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                            startRestartGroup.startReplaceGroup(1165905588);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == companion.getEmpty()) {
                                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TransformOrigin.m5161boximpl(TransformOrigin.Companion.m5174getCenterSzJe1aQ()), null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final MutableState mutableState = (MutableState) rememberedValue2;
                            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            boolean changed = ((i4 & 7168) == 2048) | startRestartGroup.changed(density);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue3 == companion.getEmpty()) {
                                rememberedValue3 = new DropdownMenuPositionProvider(j3, density, 0, new r5(mutableState, 0), 4, null);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            AndroidPopup_androidKt.Popup((DropdownMenuPositionProvider) rememberedValue3, iyVar2, popupProperties2, ComposableLambdaKt.rememberComposableLambda(-917492520, true, new my() { // from class: androidx.compose.material3.AndroidMenu_androidKt$DropdownMenu$1
                                public final void invoke(Composer composer3, int i17) {
                                    if (!composer3.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-917492520, i17, -1, "androidx.compose.material3.DropdownMenu.<anonymous> (AndroidMenu.android.kt:73)");
                                    }
                                    MenuKt.m2143DropdownMenuContentQj0Zi0g(Modifier.this, mutableTransitionState, mutableState, scrollState4, shape5, j7, f5, f6, borderStroke3, nyVar, composer3, (MutableTransitionState.$stable << 3) | 384);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i4 & 112) | 3072 | ((i4 >> 9) & 896), 0);
                            composer2 = startRestartGroup;
                            composer2.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(1166965571);
                            startRestartGroup.endReplaceGroup();
                            composer2 = startRestartGroup;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j4 = j3;
                        modifier3 = modifier4;
                        scrollState2 = scrollState4;
                        shape3 = shape5;
                        j5 = j7;
                        f4 = f5;
                        f3 = f6;
                        borderStroke2 = borderStroke3;
                    }
                    final PopupProperties popupProperties3 = popupProperties2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new my() { // from class: s5
                            @Override // defpackage.my
                            public final Object invoke(Object obj, Object obj2) {
                                w01 DropdownMenu_IlH_yew$lambda$4;
                                int intValue = ((Integer) obj2).intValue();
                                DropdownMenu_IlH_yew$lambda$4 = AndroidMenu_androidKt.DropdownMenu_IlH_yew$lambda$4(z, iyVar, modifier3, j4, scrollState2, popupProperties3, shape3, j5, f4, f3, borderStroke2, nyVar, i, i2, i3, (Composer) obj, intValue);
                                return DropdownMenu_IlH_yew$lambda$4;
                            }
                        });
                        return;
                    }
                    return;
                }
                i11 = i10;
                i12 = i3 & Fields.RotationZ;
                if (i12 == 0) {
                }
                if ((i3 & Fields.CameraDistance) == 0) {
                }
                i15 = i14;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
                }
                final PopupProperties popupProperties32 = popupProperties2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            if ((i & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & Fields.RotationX;
            if (i9 != 0) {
            }
            i10 = i3 & Fields.RotationY;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & Fields.RotationZ;
            if (i12 == 0) {
            }
            if ((i3 & Fields.CameraDistance) == 0) {
            }
            i15 = i14;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
            }
            final PopupProperties popupProperties322 = popupProperties2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        iyVar2 = iyVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        if ((i & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & Fields.RotationX;
        if (i9 != 0) {
        }
        i10 = i3 & Fields.RotationY;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & Fields.RotationZ;
        if (i12 == 0) {
        }
        if ((i3 & Fields.CameraDistance) == 0) {
        }
        i15 = i14;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i15 & 19) != 18, i4 & 1)) {
        }
        final PopupProperties popupProperties3222 = popupProperties2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuItem(my myVar, iy iyVar, Modifier modifier, my myVar2, my myVar3, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        my myVar4;
        int i3;
        iy iyVar2;
        Modifier modifier2;
        int i4;
        my myVar5;
        int i5;
        my myVar6;
        int i6;
        boolean z2;
        MenuItemColors menuItemColors2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        my myVar7;
        my myVar8;
        boolean z3;
        MenuItemColors menuItemColors3;
        PaddingValues paddingValues2;
        ScopeUpdateScope endRestartGroup;
        int i12;
        MutableInteractionSource mutableInteractionSource3;
        PaddingValues paddingValues3;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-532959117);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            myVar4 = myVar;
        } else {
            myVar4 = myVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(myVar4) ? 4 : 2) | i;
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
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                myVar5 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar5) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    myVar6 = myVar3;
                    i3 |= startRestartGroup.changedInstance(myVar6) ? Fields.Clip : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? Fields.RenderEffect : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                menuItemColors2 = menuItemColors;
                                if (startRestartGroup.changed(menuItemColors2)) {
                                    i13 = 1048576;
                                    i3 |= i13;
                                }
                            } else {
                                menuItemColors2 = menuItemColors;
                            }
                            i13 = Fields.BlendMode;
                            i3 |= i13;
                        } else {
                            menuItemColors2 = menuItemColors;
                        }
                        i7 = i2 & Fields.SpotShadowColor;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i8 = i7;
                            i3 |= startRestartGroup.changed(paddingValues) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            i9 = i2 & Fields.RotationX;
                            if (i9 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i10 = i9;
                                i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                i11 = i3;
                                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i14 != 0) {
                                            modifier2 = Modifier.Companion;
                                        }
                                        if (i4 != 0) {
                                            myVar5 = null;
                                        }
                                        if (i5 != 0) {
                                            myVar6 = null;
                                        }
                                        if (i6 != 0) {
                                            z2 = true;
                                        }
                                        if ((i2 & 64) != 0) {
                                            i12 = i11 & (-3670017);
                                            menuItemColors2 = MenuDefaults.INSTANCE.itemColors(startRestartGroup, 6);
                                        } else {
                                            i12 = i11;
                                        }
                                        PaddingValues dropdownMenuItemContentPadding = i8 != 0 ? MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding() : paddingValues;
                                        mutableInteractionSource3 = i10 != 0 ? null : mutableInteractionSource;
                                        paddingValues3 = dropdownMenuItemContentPadding;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i2 & 64) != 0) {
                                            i12 = i11 & (-3670017);
                                            paddingValues3 = paddingValues;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                        } else {
                                            paddingValues3 = paddingValues;
                                            mutableInteractionSource3 = mutableInteractionSource;
                                            i12 = i11;
                                        }
                                    }
                                    my myVar9 = myVar6;
                                    boolean z4 = z2;
                                    MenuItemColors menuItemColors4 = menuItemColors2;
                                    Modifier modifier4 = modifier2;
                                    my myVar10 = myVar5;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-532959117, i12, -1, "androidx.compose.material3.DropdownMenuItem (AndroidMenu.android.kt:179)");
                                    }
                                    composer2 = startRestartGroup;
                                    MenuKt.DropdownMenuItemContent(myVar4, iyVar2, modifier4, myVar10, myVar9, z4, menuItemColors4, paddingValues3, mutableInteractionSource3, composer2, i12 & 268435454);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    myVar7 = myVar10;
                                    myVar8 = myVar9;
                                    z3 = z4;
                                    menuItemColors3 = menuItemColors4;
                                    paddingValues2 = paddingValues3;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    myVar7 = myVar5;
                                    myVar8 = myVar6;
                                    z3 = z2;
                                    menuItemColors3 = menuItemColors2;
                                    paddingValues2 = paddingValues;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new t5(myVar, iyVar, modifier3, myVar7, myVar8, z3, menuItemColors3, paddingValues2, mutableInteractionSource2, i, i2));
                                    return;
                                }
                                return;
                            }
                            i10 = i9;
                            i11 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i8 = i7;
                        i9 = i2 & Fields.RotationX;
                        if (i9 == 0) {
                        }
                        i10 = i9;
                        i11 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    z2 = z;
                    if ((1572864 & i) == 0) {
                    }
                    i7 = i2 & Fields.SpotShadowColor;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i2 & Fields.RotationX;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    i11 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar6 = myVar3;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z2 = z;
                if ((1572864 & i) == 0) {
                }
                i7 = i2 & Fields.SpotShadowColor;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i2 & Fields.RotationX;
                if (i9 == 0) {
                }
                i10 = i9;
                i11 = i3;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar5 = myVar2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            myVar6 = myVar3;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z2 = z;
            if ((1572864 & i) == 0) {
            }
            i7 = i2 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i2 & Fields.RotationX;
            if (i9 == 0) {
            }
            i10 = i9;
            i11 = i3;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        myVar5 = myVar2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        myVar6 = myVar3;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z2 = z;
        if ((1572864 & i) == 0) {
        }
        i7 = i2 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i2 & Fields.RotationX;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i3;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DropdownMenuItem$lambda$7(my myVar, iy iyVar, Modifier modifier, my myVar2, my myVar3, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        DropdownMenuItem(myVar, iyVar, modifier, myVar2, myVar3, z, menuItemColors, paddingValues, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DropdownMenu_4kj__NE$lambda$5(boolean z, iy iyVar, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, ny nyVar, int i, int i2, Composer composer, int i3) {
        m1601DropdownMenu4kj_NE(z, iyVar, modifier, j, scrollState, popupProperties, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DropdownMenu_ILWXrKs$lambda$6(boolean z, iy iyVar, Modifier modifier, long j, PopupProperties popupProperties, ny nyVar, int i, int i2, Composer composer, int i3) {
        m1602DropdownMenuILWXrKs(z, iyVar, modifier, j, popupProperties, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DropdownMenu_IlH_yew$lambda$3$lambda$2(MutableState mutableState, IntRect intRect, IntRect intRect2) {
        mutableState.setValue(TransformOrigin.m5161boximpl(MenuKt.calculateTransformOrigin(intRect, intRect2)));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DropdownMenu_IlH_yew$lambda$4(boolean z, iy iyVar, Modifier modifier, long j, ScrollState scrollState, PopupProperties popupProperties, Shape shape, long j2, float f, float f2, BorderStroke borderStroke, ny nyVar, int i, int i2, int i3, Composer composer, int i4) {
        m1603DropdownMenuIlH_yew(z, iyVar, modifier, j, scrollState, popupProperties, shape, j2, f, f2, borderStroke, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    public static final PopupProperties getDefaultMenuProperties() {
        return DefaultMenuProperties;
    }
}
