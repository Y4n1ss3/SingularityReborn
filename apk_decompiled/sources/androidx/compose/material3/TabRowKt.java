package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.et0;
import defpackage.ft0;
import defpackage.ht0;
import defpackage.iy;
import defpackage.jt0;
import defpackage.k4;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.st;
import defpackage.un;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabRowKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: PrimaryScrollableTabRow-cx2KkNY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2509PrimaryScrollableTabRowcx2KkNY(final int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, ny nyVar, my myVar, float f2, my myVar2, Composer composer, int i2, int i3) {
        int i4;
        ScrollState scrollState2;
        long j3;
        long j4;
        int i5;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Modifier modifier2;
        my myVar3;
        ScrollState scrollState3;
        long j5;
        long j6;
        float f4;
        ny nyVar2;
        float f5;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        ScrollState scrollState4;
        long j7;
        long j8;
        int i11;
        float f6;
        ScrollState scrollState5;
        long j9;
        float f7;
        long j10;
        Modifier modifier4;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(450849184);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i14 = Fields.RotationX;
                        i4 |= i14;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i14 = Fields.SpotShadowColor;
                i4 |= i14;
            } else {
                scrollState2 = scrollState;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i13 = Fields.CameraDistance;
                        i4 |= i13;
                    }
                } else {
                    j3 = j;
                }
                i13 = Fields.RotationZ;
                i4 |= i13;
            } else {
                j3 = j;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i12 = Fields.Clip;
                        i4 |= i12;
                    }
                } else {
                    j4 = j2;
                }
                i12 = 8192;
                i4 |= i12;
            } else {
                j4 = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i2) == 0) {
                f3 = f;
                i4 |= startRestartGroup.changed(f3) ? Fields.RenderEffect : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                }
                i7 = i3 & Fields.SpotShadowColor;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    i9 = i3 & Fields.RotationX;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i3 & Fields.RotationY) != 0) {
                            i4 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i4 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                myVar3 = myVar;
                                scrollState3 = scrollState2;
                                j5 = j3;
                                j6 = j4;
                                f4 = f3;
                                nyVar2 = nyVar;
                                f5 = f2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    modifier3 = i15 != 0 ? Modifier.Companion : modifier;
                                    if ((i3 & 4) != 0) {
                                        scrollState4 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                        i4 &= -897;
                                    } else {
                                        scrollState4 = scrollState2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        j7 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                        i4 &= -7169;
                                    } else {
                                        j7 = j3;
                                    }
                                    if ((i3 & 16) != 0) {
                                        j8 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                        i4 &= -57345;
                                    } else {
                                        j8 = j4;
                                    }
                                    float m2507getScrollableTabRowEdgeStartPaddingD9Ej5fM = i5 != 0 ? TabRowDefaults.INSTANCE.m2507getScrollableTabRowEdgeStartPaddingD9Ej5fM() : f3;
                                    nyVar2 = i6 != 0 ? ComposableLambdaKt.rememberComposableLambda(835301263, true, new ny() { // from class: androidx.compose.material3.TabRowKt$PrimaryScrollableTabRow$1
                                        public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, int i16) {
                                            int i17;
                                            if ((i16 & 6) == 0) {
                                                i17 = ((i16 & 8) == 0 ? composer2.changed(tabIndicatorScope) : composer2.changedInstance(tabIndicatorScope) ? 4 : 2) | i16;
                                            } else {
                                                i17 = i16;
                                            }
                                            if (!composer2.shouldExecute((i17 & 19) != 18, i17 & 1)) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(835301263, i17, -1, "androidx.compose.material3.PrimaryScrollableTabRow.<anonymous> (TabRow.kt:261)");
                                            }
                                            TabRowDefaults.INSTANCE.m2505PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.Companion, i, true), Dp.Companion.m7631getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer2, 196656, 28);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.ny
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            invoke((TabIndicatorScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                            return w01.a;
                                        }
                                    }, startRestartGroup, 54) : nyVar;
                                    myVar3 = i8 != 0 ? ComposableSingletons$TabRowKt.INSTANCE.m1846getLambda$773954579$material3() : myVar;
                                    if (i10 != 0) {
                                        i11 = i4;
                                        long j11 = j8;
                                        scrollState5 = scrollState4;
                                        j9 = j7;
                                        f6 = TabRowDefaults.INSTANCE.m2508getScrollableTabRowMinTabWidthD9Ej5fM();
                                        f7 = m2507getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                        j10 = j11;
                                    } else {
                                        i11 = i4;
                                        long j12 = j8;
                                        f6 = f2;
                                        scrollState5 = scrollState4;
                                        j9 = j7;
                                        f7 = m2507getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                        j10 = j12;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                    }
                                    if ((i3 & 8) != 0) {
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                    long j13 = j4;
                                    scrollState5 = scrollState2;
                                    j10 = j13;
                                    float f8 = f3;
                                    i11 = i4;
                                    j9 = j3;
                                    f7 = f8;
                                    modifier3 = modifier;
                                    nyVar2 = nyVar;
                                    myVar3 = myVar;
                                    f6 = f2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    modifier4 = modifier3;
                                    ComposerKt.traceEventStart(450849184, i11, -1, "androidx.compose.material3.PrimaryScrollableTabRow (TabRow.kt:269)");
                                } else {
                                    modifier4 = modifier3;
                                }
                                int i16 = i11 >> 3;
                                int i17 = (i11 & 126) | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | ((i11 >> 9) & 458752) | ((i11 << 12) & 3670016);
                                int i18 = i11 << 3;
                                int i19 = i17 | (29360128 & i18) | (i18 & 234881024) | (1879048192 & i11);
                                Modifier modifier5 = modifier4;
                                m2513ScrollableTabRowImplxam5sdo(i, modifier5, j9, j10, f7, f6, scrollState5, nyVar2, myVar3, myVar2, startRestartGroup, i19);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f5 = f6;
                                long j14 = j9;
                                modifier2 = modifier5;
                                scrollState3 = scrollState5;
                                f4 = f7;
                                j6 = j10;
                                j5 = j14;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new ht0(i, modifier2, scrollState3, j5, j6, f4, nyVar2, myVar3, f5, myVar2, i2, i3, 0));
                                return;
                            }
                            return;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i9;
                    if ((i3 & Fields.RotationY) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i7;
                i9 = i3 & Fields.RotationX;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i3 & Fields.RotationY) != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3 & Fields.RotationX;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i3 & Fields.RotationY) != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f3 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3 & Fields.RotationX;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i3 & Fields.RotationY) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    @er
    /* renamed from: PrimaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2510PrimaryScrollableTabRowqhFBPw4(final int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, ny nyVar, my myVar, my myVar2, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        ScrollState scrollState2;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        Modifier modifier3;
        ScrollState scrollState3;
        long j5;
        long j6;
        float f3;
        ny nyVar2;
        my myVar3;
        ScopeUpdateScope endRestartGroup;
        ScrollState scrollState4;
        my myVar4;
        int i9;
        long j7;
        float f4;
        ny nyVar3;
        Modifier modifier4;
        long j8;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1501129198);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i12 = Fields.RotationX;
                        i4 |= i12;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i12 = Fields.SpotShadowColor;
                i4 |= i12;
            } else {
                scrollState2 = scrollState;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i11 = Fields.CameraDistance;
                        i4 |= i11;
                    }
                } else {
                    j3 = j;
                }
                i11 = Fields.RotationZ;
                i4 |= i11;
            } else {
                j3 = j;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i10 = Fields.Clip;
                        i4 |= i10;
                    }
                } else {
                    j4 = j2;
                }
                i10 = 8192;
                i4 |= i10;
            } else {
                j4 = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                }
                i7 = i3 & Fields.SpotShadowColor;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    if ((i3 & Fields.RotationX) == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i13 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                }
                                if ((i3 & 8) != 0) {
                                    j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                    i4 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                    j4 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                }
                                if (i5 != 0) {
                                    f2 = TabRowDefaults.INSTANCE.m2507getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                                }
                                ny rememberComposableLambda = i6 != 0 ? ComposableLambdaKt.rememberComposableLambda(-1872002465, true, new ny() { // from class: androidx.compose.material3.TabRowKt$PrimaryScrollableTabRow$3
                                    public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, int i14) {
                                        int i15;
                                        if ((i14 & 6) == 0) {
                                            i15 = ((i14 & 8) == 0 ? composer2.changed(tabIndicatorScope) : composer2.changedInstance(tabIndicatorScope) ? 4 : 2) | i14;
                                        } else {
                                            i15 = i14;
                                        }
                                        if (!composer2.shouldExecute((i15 & 19) != 18, i15 & 1)) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1872002465, i15, -1, "androidx.compose.material3.PrimaryScrollableTabRow.<anonymous> (TabRow.kt:1197)");
                                        }
                                        TabRowDefaults.INSTANCE.m2505PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.Companion, i, true), Dp.Companion.m7631getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer2, 196656, 28);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.ny
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((TabIndicatorScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54) : nyVar;
                                if (i8 != 0) {
                                    long j9 = j3;
                                    nyVar3 = rememberComposableLambda;
                                    modifier4 = modifier2;
                                    f4 = f2;
                                    long j10 = j4;
                                    myVar4 = ComposableSingletons$TabRowKt.INSTANCE.m1843getLambda$306947391$material3();
                                    i9 = i4;
                                    scrollState4 = scrollState2;
                                    j7 = j9;
                                    j8 = j10;
                                } else {
                                    scrollState4 = scrollState2;
                                    long j11 = j4;
                                    myVar4 = myVar;
                                    i9 = i4;
                                    j7 = j3;
                                    f4 = f2;
                                    nyVar3 = rememberComposableLambda;
                                    modifier4 = modifier2;
                                    j8 = j11;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                modifier4 = modifier2;
                                scrollState4 = scrollState2;
                                j8 = j4;
                                myVar4 = myVar;
                                i9 = i4;
                                j7 = j3;
                                f4 = f2;
                                nyVar3 = nyVar;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1501129198, i9, -1, "androidx.compose.material3.PrimaryScrollableTabRow (TabRow.kt:1205)");
                            }
                            m2509PrimaryScrollableTabRowcx2KkNY(i, modifier4, scrollState4, j7, j8, f4, nyVar3, myVar4, TabRowDefaults.INSTANCE.m2508getScrollableTabRowMinTabWidthD9Ej5fM(), myVar2, startRestartGroup, (i9 & 14) | 100663296 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | ((i9 << 3) & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            myVar3 = myVar4;
                            nyVar2 = nyVar3;
                            f3 = f4;
                            j6 = j8;
                            j5 = j7;
                            scrollState3 = scrollState4;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            scrollState3 = scrollState2;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                            nyVar2 = nyVar;
                            myVar3 = myVar;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new et0(i, modifier3, scrollState3, j5, j6, f3, nyVar2, myVar3, myVar2, i2, i3, 2));
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i7;
                if ((i3 & Fields.RotationX) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i3 & Fields.RotationX) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i3 & Fields.RotationX) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PrimaryScrollableTabRow_cx2KkNY$lambda$2(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, ny nyVar, my myVar, float f2, my myVar2, int i2, int i3, Composer composer, int i4) {
        m2509PrimaryScrollableTabRowcx2KkNY(i, modifier, scrollState, j, j2, f, nyVar, myVar, f2, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PrimaryScrollableTabRow_qhFBPw4$lambda$8(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, ny nyVar, my myVar, my myVar2, int i2, int i3, Composer composer, int i4) {
        m2510PrimaryScrollableTabRowqhFBPw4(i, modifier, scrollState, j, j2, f, nyVar, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x007e  */
    /* renamed from: PrimaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2511PrimaryTabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, ny nyVar, my myVar, my myVar2, Composer composer, int i2, int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        ny nyVar2;
        int i6;
        my myVar3;
        Composer composer2;
        Modifier modifier2;
        long j5;
        long j6;
        ny nyVar3;
        my myVar4;
        ScopeUpdateScope endRestartGroup;
        long j7;
        Modifier modifier3;
        long j8;
        ny nyVar4;
        my myVar5;
        int i7;
        long j9;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1012974221);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = Fields.RotationX;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = Fields.SpotShadowColor;
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = Fields.CameraDistance;
                        i4 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = Fields.RotationZ;
                i4 |= i8;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                nyVar2 = nyVar;
                i4 |= startRestartGroup.changedInstance(nyVar2) ? Fields.Clip : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    myVar3 = myVar;
                    i4 |= startRestartGroup.changedInstance(myVar3) ? Fields.RenderEffect : 65536;
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar2) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i10 != 0 ? Modifier.Companion : modifier;
                                if ((i3 & 4) != 0) {
                                    j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    j7 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                    i4 &= -7169;
                                } else {
                                    j7 = j4;
                                }
                                ny rememberComposableLambda = i5 != 0 ? ComposableLambdaKt.rememberComposableLambda(1338273762, true, new ny() { // from class: androidx.compose.material3.TabRowKt$PrimaryTabRow$1
                                    public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, int i11) {
                                        int i12;
                                        if ((i11 & 6) == 0) {
                                            i12 = ((i11 & 8) == 0 ? composer3.changed(tabIndicatorScope) : composer3.changedInstance(tabIndicatorScope) ? 4 : 2) | i11;
                                        } else {
                                            i12 = i11;
                                        }
                                        if (!composer3.shouldExecute((i12 & 19) != 18, i12 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1338273762, i12, -1, "androidx.compose.material3.PrimaryTabRow.<anonymous> (TabRow.kt:155)");
                                        }
                                        TabRowDefaults.INSTANCE.m2505PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.Companion, i, true), Dp.Companion.m7631getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer3, 196656, 28);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.ny
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((TabIndicatorScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54) : nyVar2;
                                if (i6 != 0) {
                                    modifier3 = modifier4;
                                    j9 = j7;
                                    j8 = j3;
                                    nyVar4 = rememberComposableLambda;
                                    myVar5 = ComposableSingletons$TabRowKt.INSTANCE.m1842getLambda$1429684928$material3();
                                    i7 = -1012974221;
                                } else {
                                    modifier3 = modifier4;
                                    j8 = j3;
                                    nyVar4 = rememberComposableLambda;
                                    myVar5 = myVar3;
                                    i7 = -1012974221;
                                    j9 = j7;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                modifier3 = modifier;
                                nyVar4 = nyVar2;
                                myVar5 = myVar3;
                                i7 = -1012974221;
                                j8 = j3;
                                j9 = j4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i7, i4, -1, "androidx.compose.material3.PrimaryTabRow (TabRow.kt:162)");
                            }
                            composer2 = startRestartGroup;
                            m2519TabRowImplDTcfvLk(modifier3, j8, j9, nyVar4, myVar5, myVar2, composer2, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            j5 = j8;
                            j6 = j9;
                            nyVar3 = nyVar4;
                            myVar4 = myVar5;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            j5 = j3;
                            j6 = j4;
                            nyVar3 = nyVar2;
                            myVar4 = myVar3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new jt0(i, modifier2, j5, j6, nyVar3, myVar4, myVar2, i2, i3, 0));
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar3 = myVar;
                if ((i3 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            nyVar2 = nyVar;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            myVar3 = myVar;
            if ((i3 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        nyVar2 = nyVar;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        myVar3 = myVar;
        if ((i3 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 PrimaryTabRow_pAZo6Ak$lambda$0(int i, Modifier modifier, long j, long j2, ny nyVar, my myVar, my myVar2, int i2, int i3, Composer composer, int i4) {
        m2511PrimaryTabRowpAZo6Ak(i, modifier, j, j2, nyVar, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b9  */
    @er
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2512ScrollableTabRowsKfQg0A(final int i, Modifier modifier, long j, long j2, float f, ny nyVar, my myVar, final my myVar2, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        ny nyVar2;
        int i7;
        final Modifier modifier2;
        final my myVar3;
        final long j5;
        final long j6;
        final float f3;
        final ny nyVar3;
        ScopeUpdateScope endRestartGroup;
        long j7;
        int i8;
        ny nyVar4;
        my m1844getLambda$358046007$material3;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(847049916);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i10 = Fields.RotationX;
                        i4 |= i10;
                    }
                } else {
                    j3 = j;
                }
                i10 = Fields.SpotShadowColor;
                i4 |= i10;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i9 = Fields.CameraDistance;
                        i4 |= i9;
                    }
                } else {
                    j4 = j2;
                }
                i9 = Fields.RotationZ;
                i4 |= i9;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? Fields.Clip : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    nyVar2 = nyVar;
                    i4 |= startRestartGroup.changedInstance(nyVar2) ? Fields.RenderEffect : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i3 & Fields.SpotShadowColor) == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier3 = i11 != 0 ? Modifier.Companion : modifier;
                                if ((i3 & 4) != 0) {
                                    j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    j7 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                    i4 &= -7169;
                                } else {
                                    j7 = j4;
                                }
                                f3 = i5 != 0 ? TabRowDefaults.INSTANCE.m2507getScrollableTabRowEdgeStartPaddingD9Ej5fM() : f2;
                                ny rememberComposableLambda = i6 != 0 ? ComposableLambdaKt.rememberComposableLambda(-720441215, true, new ny() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                                    public final void invoke(List<TabPosition> list, Composer composer2, int i12) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-720441215, i12, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:1407)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                        tabRowDefaults.m2506SecondaryIndicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.Companion, list.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.ny
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((List<TabPosition>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54) : nyVar2;
                                if (i7 != 0) {
                                    int i12 = i4;
                                    modifier2 = modifier3;
                                    nyVar4 = rememberComposableLambda;
                                    m1844getLambda$358046007$material3 = ComposableSingletons$TabRowKt.INSTANCE.m1844getLambda$358046007$material3();
                                    i8 = i12;
                                    long j8 = j3;
                                    j6 = j7;
                                    j5 = j8;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(847049916, i8, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:1413)");
                                    }
                                    int i13 = i8 << 3;
                                    m2514ScrollableTabRowWithSubcomposeImplqhFBPw4(i, nyVar4, modifier2, j5, j6, f3, m1844getLambda$358046007$material3, myVar2, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), startRestartGroup, (i13 & 896) | (i8 & 14) | ((i8 >> 12) & 112) | (i13 & 7168) | (57344 & i13) | (458752 & i13) | (3670016 & i8) | (i8 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    myVar3 = m1844getLambda$358046007$material3;
                                    nyVar3 = nyVar4;
                                } else {
                                    long j9 = j3;
                                    j6 = j7;
                                    j5 = j9;
                                    i8 = i4;
                                    modifier2 = modifier3;
                                    nyVar4 = rememberComposableLambda;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                i8 = i4;
                                j5 = j3;
                                j6 = j4;
                                f3 = f2;
                                nyVar4 = nyVar2;
                                modifier2 = modifier;
                            }
                            m1844getLambda$358046007$material3 = myVar;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i132 = i8 << 3;
                            m2514ScrollableTabRowWithSubcomposeImplqhFBPw4(i, nyVar4, modifier2, j5, j6, f3, m1844getLambda$358046007$material3, myVar2, ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), startRestartGroup, (i132 & 896) | (i8 & 14) | ((i8 >> 12) & 112) | (i132 & 7168) | (57344 & i132) | (458752 & i132) | (3670016 & i8) | (i8 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            myVar3 = m1844getLambda$358046007$material3;
                            nyVar3 = nyVar4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            myVar3 = myVar;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                            nyVar3 = nyVar2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: gt0
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 ScrollableTabRow_sKfQg0A$lambda$11;
                                    int intValue = ((Integer) obj2).intValue();
                                    ScrollableTabRow_sKfQg0A$lambda$11 = TabRowKt.ScrollableTabRow_sKfQg0A$lambda$11(i, modifier2, j5, j6, f3, nyVar3, myVar3, myVar2, i2, i3, (Composer) obj, intValue);
                                    return ScrollableTabRow_sKfQg0A$lambda$11;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                nyVar2 = nyVar;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & Fields.SpotShadowColor) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            nyVar2 = nyVar;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & Fields.SpotShadowColor) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        nyVar2 = nyVar;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & Fields.SpotShadowColor) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: ScrollableTabRowImpl-xam5sdo, reason: not valid java name */
    private static final void m2513ScrollableTabRowImplxam5sdo(final int i, final Modifier modifier, final long j, final long j2, final float f, final float f2, final ScrollState scrollState, final ny nyVar, final my myVar, final my myVar2, Composer composer, final int i2) {
        int i3;
        ScrollState scrollState2;
        my myVar3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(414860860);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(j) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(j2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(f) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            scrollState2 = scrollState;
            i3 |= startRestartGroup.changed(scrollState2) ? 1048576 : Fields.BlendMode;
        } else {
            scrollState2 = scrollState;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((100663296 & i2) == 0) {
            myVar3 = myVar;
            i3 |= startRestartGroup.changedInstance(myVar3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        } else {
            myVar3 = myVar;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(414860860, i3, -1, "androidx.compose.material3.ScrollableTabRowImpl (TabRow.kt:521)");
            }
            final ScrollState scrollState3 = scrollState2;
            final my myVar4 = myVar3;
            composer2 = startRestartGroup;
            SurfaceKt.m2464SurfaceT9BRK9s(modifier, null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1878374785, true, new my() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00ee, code lost:
                
                    if (defpackage.q10.b(r8.rememberedValue(), java.lang.Integer.valueOf(r6)) == false) goto L35;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(Composer composer3, int i4) {
                    my myVar5;
                    if (!composer3.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1878374785, i4, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous> (TabRow.kt:523)");
                    }
                    Object rememberedValue = composer3.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, composer3);
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    un unVar = (un) rememberedValue;
                    MotionSchemeKeyTokens motionSchemeKeyTokens = MotionSchemeKeyTokens.DefaultSpatial;
                    FiniteAnimationSpec value = MotionSchemeKt.value(motionSchemeKeyTokens, composer3, 6);
                    FiniteAnimationSpec value2 = MotionSchemeKt.value(motionSchemeKeyTokens, composer3, 6);
                    boolean changed = composer3.changed(ScrollState.this) | composer3.changed(unVar);
                    ScrollState scrollState4 = ScrollState.this;
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (changed || rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new ScrollableTabData(scrollState4, unVar, value);
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    ScrollableTabData scrollableTabData = (ScrollableTabData) rememberedValue2;
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = new TabRowKt$ScrollableTabRowImpl$1$scope$1$1(value2);
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    final TabRowKt$ScrollableTabRowImpl$1$scope$1$1 tabRowKt$ScrollableTabRowImpl$1$scope$1$1 = (TabRowKt$ScrollableTabRowImpl$1$scope$1$1) rememberedValue3;
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment bottomStart = companion2.getBottomStart();
                    my myVar6 = myVar4;
                    my myVar7 = myVar2;
                    ScrollState scrollState5 = ScrollState.this;
                    float f3 = f;
                    float f4 = f2;
                    int i5 = i;
                    final ny nyVar2 = nyVar;
                    Modifier.Companion companion3 = Modifier.Companion;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(bottomStart, false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, companion3);
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
                    my b = k4.b(companion4, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting()) {
                        myVar5 = myVar7;
                    } else {
                        myVar5 = myVar7;
                    }
                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion4.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    myVar6.invoke(composer3, 0);
                    List E = y80.E(myVar5, ComposableLambdaKt.rememberComposableLambda(509386037, true, new my() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$1$1
                        public final void invoke(Composer composer4, int i6) {
                            if (!composer4.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(509386037, i6, -1, "androidx.compose.material3.ScrollableTabRowImpl.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:571)");
                            }
                            ny.this.invoke(tabRowKt$ScrollableTabRowImpl$1$scope$1$1, composer4, 6);
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
                    Modifier clipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), companion2.getCenterStart(), false, 2, null), scrollState5, false, null, false, 14, null)));
                    boolean changed2 = composer3.changed(f3) | composer3.changed(f4) | composer3.changed(i5) | composer3.changedInstance(scrollableTabData);
                    Object rememberedValue4 = composer3.rememberedValue();
                    if (changed2 || rememberedValue4 == companion.getEmpty()) {
                        Object tabRowKt$ScrollableTabRowImpl$1$1$2$1 = new TabRowKt$ScrollableTabRowImpl$1$1$2$1(f3, f4, tabRowKt$ScrollableTabRowImpl$1$scope$1$1, i5, scrollableTabData);
                        composer3.updateRememberedValue(tabRowKt$ScrollableTabRowImpl$1$1$2$1);
                        rememberedValue4 = tabRowKt$ScrollableTabRowImpl$1$1$2$1;
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue4;
                    my combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(E);
                    boolean changed3 = composer3.changed(multiContentMeasurePolicy);
                    Object rememberedValue5 = composer3.rememberedValue();
                    if (changed3 || rememberedValue5 == companion.getEmpty()) {
                        rememberedValue5 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                        composer3.updateRememberedValue(rememberedValue5);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue5;
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, clipToBounds);
                    iy constructor2 = companion4.getConstructor();
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
                    my b2 = k4.b(companion4, m3878constructorimpl2, measurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                    if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                    }
                    Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion4.getSetModifier());
                    combineAsVirtualLayouts.invoke(composer3, 0);
                    composer3.endNode();
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
            }, startRestartGroup, 54), composer2, ((i3 >> 3) & 14) | 12582912 | (i3 & 896) | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: it0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 ScrollableTabRowImpl_xam5sdo$lambda$5;
                    int intValue = ((Integer) obj2).intValue();
                    ScrollableTabRowImpl_xam5sdo$lambda$5 = TabRowKt.ScrollableTabRowImpl_xam5sdo$lambda$5(i, modifier, j, j2, f, f2, scrollState, nyVar, myVar, myVar2, i2, (Composer) obj, intValue);
                    return ScrollableTabRowImpl_xam5sdo$lambda$5;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ScrollableTabRowImpl_xam5sdo$lambda$5(int i, Modifier modifier, long j, long j2, float f, float f2, ScrollState scrollState, ny nyVar, my myVar, my myVar2, int i2, Composer composer, int i3) {
        m2513ScrollableTabRowImplxam5sdo(i, modifier, j, j2, f, f2, scrollState, nyVar, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00db  */
    /* renamed from: ScrollableTabRowWithSubcomposeImpl-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m2514ScrollableTabRowWithSubcomposeImplqhFBPw4(int i, ny nyVar, Modifier modifier, long j, long j2, float f, my myVar, my myVar2, ScrollState scrollState, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        long j3;
        long j4;
        int i6;
        float f2;
        int i7;
        Composer composer2;
        Modifier modifier3;
        long j5;
        long j6;
        float f3;
        my myVar3;
        ScopeUpdateScope endRestartGroup;
        my lambda$2075817209$material3;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(901781420);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(nyVar) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        j3 = j;
                        if (startRestartGroup.changed(j3)) {
                            i9 = Fields.CameraDistance;
                            i4 |= i9;
                        }
                    } else {
                        j3 = j;
                    }
                    i9 = Fields.RotationZ;
                    i4 |= i9;
                } else {
                    j3 = j;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        j4 = j2;
                        if (startRestartGroup.changed(j4)) {
                            i8 = Fields.Clip;
                            i4 |= i8;
                        }
                    } else {
                        j4 = j2;
                    }
                    i8 = 8192;
                    i4 |= i8;
                } else {
                    j4 = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    f2 = f;
                    i4 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i3 & Fields.SpotShadowColor) == 0) {
                        i4 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        if ((i3 & Fields.RotationX) != 0) {
                            i4 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i4 |= startRestartGroup.changed(scrollState) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            if (startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier3 = modifier2;
                                j5 = j3;
                                j6 = j4;
                                f3 = f2;
                                myVar3 = myVar;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i5 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if ((i3 & 8) != 0) {
                                        j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        j4 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                        i4 &= -57345;
                                    }
                                    if (i6 != 0) {
                                        f2 = TabRowDefaults.INSTANCE.m2507getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                                    }
                                    if (i7 != 0) {
                                        lambda$2075817209$material3 = ComposableSingletons$TabRowKt.INSTANCE.getLambda$2075817209$material3();
                                        long j7 = j4;
                                        float f4 = f2;
                                        Modifier modifier4 = modifier2;
                                        long j8 = j3;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(901781420, i4, -1, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl (TabRow.kt:834)");
                                        }
                                        int i10 = ((i4 >> 6) & 14) | 12582912;
                                        int i11 = i4 >> 3;
                                        composer2 = startRestartGroup;
                                        SurfaceKt.m2464SurfaceT9BRK9s(modifier4, null, j8, j7, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(2077251399, true, new TabRowKt$ScrollableTabRowWithSubcomposeImpl$1(scrollState, f4, myVar2, lambda$2075817209$material3, nyVar, i), startRestartGroup, 54), composer2, i10 | (i11 & 896) | (i11 & 7168), 114);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        f3 = f4;
                                        myVar3 = lambda$2075817209$material3;
                                        modifier3 = modifier4;
                                        j5 = j8;
                                        j6 = j7;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 8) != 0) {
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                }
                                lambda$2075817209$material3 = myVar;
                                long j72 = j4;
                                float f42 = f2;
                                Modifier modifier42 = modifier2;
                                long j82 = j3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                int i102 = ((i4 >> 6) & 14) | 12582912;
                                int i112 = i4 >> 3;
                                composer2 = startRestartGroup;
                                SurfaceKt.m2464SurfaceT9BRK9s(modifier42, null, j82, j72, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(2077251399, true, new TabRowKt$ScrollableTabRowWithSubcomposeImpl$1(scrollState, f42, myVar2, lambda$2075817209$material3, nyVar, i), startRestartGroup, 54), composer2, i102 | (i112 & 896) | (i112 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                f3 = f42;
                                myVar3 = lambda$2075817209$material3;
                                modifier3 = modifier42;
                                j5 = j82;
                                j6 = j72;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new et0(i, nyVar, modifier3, j5, j6, f3, myVar3, myVar2, scrollState, i2, i3));
                                return;
                            }
                            return;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i3 & Fields.RotationX) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                f2 = f;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & Fields.SpotShadowColor) == 0) {
                }
                if ((i3 & Fields.RotationX) != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            f2 = f;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & Fields.SpotShadowColor) == 0) {
            }
            if ((i3 & Fields.RotationX) != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        f2 = f;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & Fields.SpotShadowColor) == 0) {
        }
        if ((i3 & Fields.RotationX) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 38347923) == 38347922, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$7(int i, ny nyVar, Modifier modifier, long j, long j2, float f, my myVar, my myVar2, ScrollState scrollState, int i2, int i3, Composer composer, int i4) {
        m2514ScrollableTabRowWithSubcomposeImplqhFBPw4(i, nyVar, modifier, j, j2, f, myVar, myVar2, scrollState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ScrollableTabRow_sKfQg0A$lambda$11(int i, Modifier modifier, long j, long j2, float f, ny nyVar, my myVar, my myVar2, int i2, int i3, Composer composer, int i4) {
        m2512ScrollableTabRowsKfQg0A(i, modifier, j, j2, f, nyVar, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: SecondaryScrollableTabRow-cx2KkNY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2515SecondaryScrollableTabRowcx2KkNY(final int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, ny nyVar, my myVar, float f2, my myVar2, Composer composer, int i2, int i3) {
        int i4;
        ScrollState scrollState2;
        long j3;
        long j4;
        int i5;
        float f3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Modifier modifier2;
        my myVar3;
        ScrollState scrollState3;
        long j5;
        long j6;
        float f4;
        ny nyVar2;
        float f5;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        ScrollState scrollState4;
        long j7;
        long j8;
        int i11;
        float f6;
        ScrollState scrollState5;
        long j9;
        float f7;
        long j10;
        Modifier modifier4;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(519094802);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i14 = Fields.RotationX;
                        i4 |= i14;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i14 = Fields.SpotShadowColor;
                i4 |= i14;
            } else {
                scrollState2 = scrollState;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i13 = Fields.CameraDistance;
                        i4 |= i13;
                    }
                } else {
                    j3 = j;
                }
                i13 = Fields.RotationZ;
                i4 |= i13;
            } else {
                j3 = j;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i12 = Fields.Clip;
                        i4 |= i12;
                    }
                } else {
                    j4 = j2;
                }
                i12 = 8192;
                i4 |= i12;
            } else {
                j4 = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i2) == 0) {
                f3 = f;
                i4 |= startRestartGroup.changed(f3) ? Fields.RenderEffect : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                }
                i7 = i3 & Fields.SpotShadowColor;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    i9 = i3 & Fields.RotationX;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i10 = i9;
                        i4 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if ((i3 & Fields.RotationY) != 0) {
                            i4 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i4 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                myVar3 = myVar;
                                scrollState3 = scrollState2;
                                j5 = j3;
                                j6 = j4;
                                f4 = f3;
                                nyVar2 = nyVar;
                                f5 = f2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    modifier3 = i15 != 0 ? Modifier.Companion : modifier;
                                    if ((i3 & 4) != 0) {
                                        scrollState4 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                        i4 &= -897;
                                    } else {
                                        scrollState4 = scrollState2;
                                    }
                                    if ((i3 & 8) != 0) {
                                        j7 = TabRowDefaults.INSTANCE.getSecondaryContainerColor(startRestartGroup, 6);
                                        i4 &= -7169;
                                    } else {
                                        j7 = j3;
                                    }
                                    if ((i3 & 16) != 0) {
                                        j8 = TabRowDefaults.INSTANCE.getSecondaryContentColor(startRestartGroup, 6);
                                        i4 &= -57345;
                                    } else {
                                        j8 = j4;
                                    }
                                    float m2507getScrollableTabRowEdgeStartPaddingD9Ej5fM = i5 != 0 ? TabRowDefaults.INSTANCE.m2507getScrollableTabRowEdgeStartPaddingD9Ej5fM() : f3;
                                    nyVar2 = i6 != 0 ? ComposableLambdaKt.rememberComposableLambda(610355265, true, new ny() { // from class: androidx.compose.material3.TabRowKt$SecondaryScrollableTabRow$1
                                        public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, int i16) {
                                            if ((i16 & 6) == 0) {
                                                i16 |= (i16 & 8) == 0 ? composer2.changed(tabIndicatorScope) : composer2.changedInstance(tabIndicatorScope) ? 4 : 2;
                                            }
                                            if (!composer2.shouldExecute((i16 & 19) != 18, i16 & 1)) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(610355265, i16, -1, "androidx.compose.material3.SecondaryScrollableTabRow.<anonymous> (TabRow.kt:332)");
                                            }
                                            TabRowDefaults.INSTANCE.m2506SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.Companion, i, false), 0.0f, 0L, composer2, 3072, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.ny
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                            invoke((TabIndicatorScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                            return w01.a;
                                        }
                                    }, startRestartGroup, 54) : nyVar;
                                    myVar3 = i8 != 0 ? ComposableSingletons$TabRowKt.INSTANCE.getLambda$303717663$material3() : myVar;
                                    if (i10 != 0) {
                                        i11 = i4;
                                        long j11 = j8;
                                        scrollState5 = scrollState4;
                                        j9 = j7;
                                        f6 = TabRowDefaults.INSTANCE.m2508getScrollableTabRowMinTabWidthD9Ej5fM();
                                        f7 = m2507getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                        j10 = j11;
                                    } else {
                                        i11 = i4;
                                        long j12 = j8;
                                        f6 = f2;
                                        scrollState5 = scrollState4;
                                        j9 = j7;
                                        f7 = m2507getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                        j10 = j12;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                    }
                                    if ((i3 & 8) != 0) {
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                    long j13 = j4;
                                    scrollState5 = scrollState2;
                                    j10 = j13;
                                    float f8 = f3;
                                    i11 = i4;
                                    j9 = j3;
                                    f7 = f8;
                                    modifier3 = modifier;
                                    nyVar2 = nyVar;
                                    myVar3 = myVar;
                                    f6 = f2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    modifier4 = modifier3;
                                    ComposerKt.traceEventStart(519094802, i11, -1, "androidx.compose.material3.SecondaryScrollableTabRow (TabRow.kt:339)");
                                } else {
                                    modifier4 = modifier3;
                                }
                                int i16 = i11 >> 3;
                                int i17 = (i11 & 126) | (i16 & 896) | (i16 & 7168) | (i16 & 57344) | ((i11 >> 9) & 458752) | ((i11 << 12) & 3670016);
                                int i18 = i11 << 3;
                                int i19 = i17 | (29360128 & i18) | (i18 & 234881024) | (1879048192 & i11);
                                Modifier modifier5 = modifier4;
                                m2513ScrollableTabRowImplxam5sdo(i, modifier5, j9, j10, f7, f6, scrollState5, nyVar2, myVar3, myVar2, startRestartGroup, i19);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f5 = f6;
                                long j14 = j9;
                                modifier2 = modifier5;
                                scrollState3 = scrollState5;
                                f4 = f7;
                                j6 = j10;
                                j5 = j14;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new ht0(i, modifier2, scrollState3, j5, j6, f4, nyVar2, myVar3, f5, myVar2, i2, i3, 1));
                                return;
                            }
                            return;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i9;
                    if ((i3 & Fields.RotationY) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i7;
                i9 = i3 & Fields.RotationX;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i3 & Fields.RotationY) != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3 & Fields.RotationX;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i3 & Fields.RotationY) != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f3 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3 & Fields.RotationX;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i3 & Fields.RotationY) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    @er
    /* renamed from: SecondaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2516SecondaryScrollableTabRowqhFBPw4(final int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, ny nyVar, my myVar, my myVar2, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        ScrollState scrollState2;
        long j3;
        long j4;
        int i5;
        float f2;
        int i6;
        int i7;
        int i8;
        Modifier modifier3;
        ScrollState scrollState3;
        long j5;
        long j6;
        float f3;
        ny nyVar2;
        my myVar3;
        ScopeUpdateScope endRestartGroup;
        ScrollState scrollState4;
        my myVar4;
        int i9;
        long j7;
        float f4;
        ny nyVar3;
        Modifier modifier4;
        long j8;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-712886596);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i13 = i3 & 2;
        if (i13 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    scrollState2 = scrollState;
                    if (startRestartGroup.changed(scrollState2)) {
                        i12 = Fields.RotationX;
                        i4 |= i12;
                    }
                } else {
                    scrollState2 = scrollState;
                }
                i12 = Fields.SpotShadowColor;
                i4 |= i12;
            } else {
                scrollState2 = scrollState;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i11 = Fields.CameraDistance;
                        i4 |= i11;
                    }
                } else {
                    j3 = j;
                }
                i11 = Fields.RotationZ;
                i4 |= i11;
            } else {
                j3 = j;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i10 = Fields.Clip;
                        i4 |= i10;
                    }
                } else {
                    j4 = j2;
                }
                i10 = 8192;
                i4 |= i10;
            } else {
                j4 = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                }
                i7 = i3 & Fields.SpotShadowColor;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i8 = i7;
                    i4 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    if ((i3 & Fields.RotationX) == 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i13 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                    scrollState2 = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
                                }
                                if ((i3 & 8) != 0) {
                                    j3 = TabRowDefaults.INSTANCE.getSecondaryContainerColor(startRestartGroup, 6);
                                    i4 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                    j4 = TabRowDefaults.INSTANCE.getSecondaryContentColor(startRestartGroup, 6);
                                }
                                if (i5 != 0) {
                                    f2 = TabRowDefaults.INSTANCE.m2507getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                                }
                                ny rememberComposableLambda = i6 != 0 ? ComposableLambdaKt.rememberComposableLambda(407893741, true, new ny() { // from class: androidx.compose.material3.TabRowKt$SecondaryScrollableTabRow$3
                                    public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, int i14) {
                                        if ((i14 & 6) == 0) {
                                            i14 |= (i14 & 8) == 0 ? composer2.changed(tabIndicatorScope) : composer2.changedInstance(tabIndicatorScope) ? 4 : 2;
                                        }
                                        if (!composer2.shouldExecute((i14 & 19) != 18, i14 & 1)) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(407893741, i14, -1, "androidx.compose.material3.SecondaryScrollableTabRow.<anonymous> (TabRow.kt:1229)");
                                        }
                                        TabRowDefaults.INSTANCE.m2506SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.Companion, i, false), 0.0f, 0L, composer2, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.ny
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((TabIndicatorScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54) : nyVar;
                                if (i8 != 0) {
                                    long j9 = j3;
                                    nyVar3 = rememberComposableLambda;
                                    modifier4 = modifier2;
                                    f4 = f2;
                                    long j10 = j4;
                                    myVar4 = ComposableSingletons$TabRowKt.INSTANCE.getLambda$1187266255$material3();
                                    i9 = i4;
                                    scrollState4 = scrollState2;
                                    j7 = j9;
                                    j8 = j10;
                                } else {
                                    scrollState4 = scrollState2;
                                    long j11 = j4;
                                    myVar4 = myVar;
                                    i9 = i4;
                                    j7 = j3;
                                    f4 = f2;
                                    nyVar3 = rememberComposableLambda;
                                    modifier4 = modifier2;
                                    j8 = j11;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                modifier4 = modifier2;
                                scrollState4 = scrollState2;
                                j8 = j4;
                                myVar4 = myVar;
                                i9 = i4;
                                j7 = j3;
                                f4 = f2;
                                nyVar3 = nyVar;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-712886596, i9, -1, "androidx.compose.material3.SecondaryScrollableTabRow (TabRow.kt:1236)");
                            }
                            m2515SecondaryScrollableTabRowcx2KkNY(i, modifier4, scrollState4, j7, j8, f4, nyVar3, myVar4, TabRowDefaults.INSTANCE.m2508getScrollableTabRowMinTabWidthD9Ej5fM(), myVar2, startRestartGroup, (i9 & 14) | 100663296 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | ((i9 << 3) & 1879048192), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            myVar3 = myVar4;
                            nyVar2 = nyVar3;
                            f3 = f4;
                            j6 = j8;
                            j5 = j7;
                            scrollState3 = scrollState4;
                            modifier3 = modifier4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            scrollState3 = scrollState2;
                            j5 = j3;
                            j6 = j4;
                            f3 = f2;
                            nyVar2 = nyVar;
                            myVar3 = myVar;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new et0(i, modifier3, scrollState3, j5, j6, f3, nyVar2, myVar3, myVar2, i2, i3, 0));
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i7;
                if ((i3 & Fields.RotationX) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f2 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & Fields.SpotShadowColor;
            if (i7 != 0) {
            }
            i8 = i7;
            if ((i3 & Fields.RotationX) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & Fields.SpotShadowColor;
        if (i7 != 0) {
        }
        i8 = i7;
        if ((i3 & Fields.RotationX) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 38347923) != 38347922, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SecondaryScrollableTabRow_cx2KkNY$lambda$3(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, ny nyVar, my myVar, float f2, my myVar2, int i2, int i3, Composer composer, int i4) {
        m2515SecondaryScrollableTabRowcx2KkNY(i, modifier, scrollState, j, j2, f, nyVar, myVar, f2, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SecondaryScrollableTabRow_qhFBPw4$lambda$9(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, ny nyVar, my myVar, my myVar2, int i2, int i3, Composer composer, int i4) {
        m2516SecondaryScrollableTabRowqhFBPw4(i, modifier, scrollState, j, j2, f, nyVar, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x007e  */
    /* renamed from: SecondaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2517SecondaryTabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, ny nyVar, my myVar, my myVar2, Composer composer, int i2, int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        ny nyVar2;
        int i6;
        my myVar3;
        Composer composer2;
        Modifier modifier2;
        long j5;
        long j6;
        ny nyVar3;
        my myVar4;
        ScopeUpdateScope endRestartGroup;
        long j7;
        Modifier modifier3;
        long j8;
        ny nyVar4;
        my myVar5;
        int i7;
        long j9;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(563434725);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = Fields.RotationX;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = Fields.SpotShadowColor;
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = Fields.CameraDistance;
                        i4 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = Fields.RotationZ;
                i4 |= i8;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                nyVar2 = nyVar;
                i4 |= startRestartGroup.changedInstance(nyVar2) ? Fields.Clip : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    myVar3 = myVar;
                    i4 |= startRestartGroup.changedInstance(myVar3) ? Fields.RenderEffect : 65536;
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar2) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i10 != 0 ? Modifier.Companion : modifier;
                                if ((i3 & 4) != 0) {
                                    j3 = TabRowDefaults.INSTANCE.getSecondaryContainerColor(startRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    j7 = TabRowDefaults.INSTANCE.getSecondaryContentColor(startRestartGroup, 6);
                                    i4 &= -7169;
                                } else {
                                    j7 = j4;
                                }
                                ny rememberComposableLambda = i5 != 0 ? ComposableLambdaKt.rememberComposableLambda(959948692, true, new ny() { // from class: androidx.compose.material3.TabRowKt$SecondaryTabRow$1
                                    public final void invoke(TabIndicatorScope tabIndicatorScope, Composer composer3, int i11) {
                                        if ((i11 & 6) == 0) {
                                            i11 |= (i11 & 8) == 0 ? composer3.changed(tabIndicatorScope) : composer3.changedInstance(tabIndicatorScope) ? 4 : 2;
                                        }
                                        if (!composer3.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(959948692, i11, -1, "androidx.compose.material3.SecondaryTabRow.<anonymous> (TabRow.kt:207)");
                                        }
                                        TabRowDefaults.INSTANCE.m2506SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.Companion, i, false), 0.0f, 0L, composer3, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.ny
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((TabIndicatorScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54) : nyVar2;
                                if (i6 != 0) {
                                    modifier3 = modifier4;
                                    j9 = j7;
                                    j8 = j3;
                                    nyVar4 = rememberComposableLambda;
                                    myVar5 = ComposableSingletons$TabRowKt.INSTANCE.m1845getLambda$463596174$material3();
                                    i7 = 563434725;
                                } else {
                                    modifier3 = modifier4;
                                    j8 = j3;
                                    nyVar4 = rememberComposableLambda;
                                    myVar5 = myVar3;
                                    i7 = 563434725;
                                    j9 = j7;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                modifier3 = modifier;
                                nyVar4 = nyVar2;
                                myVar5 = myVar3;
                                i7 = 563434725;
                                j8 = j3;
                                j9 = j4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i7, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:213)");
                            }
                            composer2 = startRestartGroup;
                            m2519TabRowImplDTcfvLk(modifier3, j8, j9, nyVar4, myVar5, myVar2, composer2, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            j5 = j8;
                            j6 = j9;
                            nyVar3 = nyVar4;
                            myVar4 = myVar5;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            j5 = j3;
                            j6 = j4;
                            nyVar3 = nyVar2;
                            myVar4 = myVar3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new jt0(i, modifier2, j5, j6, nyVar3, myVar4, myVar2, i2, i3, 2));
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar3 = myVar;
                if ((i3 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            nyVar2 = nyVar;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            myVar3 = myVar;
            if ((i3 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        nyVar2 = nyVar;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        myVar3 = myVar;
        if ((i3 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SecondaryTabRow_pAZo6Ak$lambda$1(int i, Modifier modifier, long j, long j2, ny nyVar, my myVar, my myVar2, int i2, int i3, Composer composer, int i4) {
        m2517SecondaryTabRowpAZo6Ak(i, modifier, j, j2, nyVar, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x007e  */
    @er
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2518TabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, ny nyVar, my myVar, my myVar2, Composer composer, int i2, int i3) {
        int i4;
        long j3;
        long j4;
        int i5;
        ny nyVar2;
        int i6;
        my myVar3;
        Composer composer2;
        Modifier modifier2;
        long j5;
        long j6;
        ny nyVar3;
        my myVar4;
        ScopeUpdateScope endRestartGroup;
        long j7;
        Modifier modifier3;
        long j8;
        ny nyVar4;
        my myVar5;
        int i7;
        long j9;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(1445190381);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i3 & 2;
        if (i10 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    j3 = j;
                    if (startRestartGroup.changed(j3)) {
                        i9 = Fields.RotationX;
                        i4 |= i9;
                    }
                } else {
                    j3 = j;
                }
                i9 = Fields.SpotShadowColor;
                i4 |= i9;
            } else {
                j3 = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j4 = j2;
                    if (startRestartGroup.changed(j4)) {
                        i8 = Fields.CameraDistance;
                        i4 |= i8;
                    }
                } else {
                    j4 = j2;
                }
                i8 = Fields.RotationZ;
                i4 |= i8;
            } else {
                j4 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                nyVar2 = nyVar;
                i4 |= startRestartGroup.changedInstance(nyVar2) ? Fields.Clip : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    myVar3 = myVar;
                    i4 |= startRestartGroup.changedInstance(myVar3) ? Fields.RenderEffect : 65536;
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(myVar2) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i10 != 0 ? Modifier.Companion : modifier;
                                if ((i3 & 4) != 0) {
                                    j3 = TabRowDefaults.INSTANCE.getPrimaryContainerColor(startRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    j7 = TabRowDefaults.INSTANCE.getPrimaryContentColor(startRestartGroup, 6);
                                    i4 &= -7169;
                                } else {
                                    j7 = j4;
                                }
                                ny rememberComposableLambda = i5 != 0 ? ComposableLambdaKt.rememberComposableLambda(906699528, true, new ny() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    public final void invoke(List<TabPosition> list, Composer composer3, int i11) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(906699528, i11, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:1340)");
                                        }
                                        if (i < list.size()) {
                                            composer3.startReplaceGroup(436390614);
                                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                            tabRowDefaults.m2506SecondaryIndicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.Companion, list.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                            composer3.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(436548218);
                                            composer3.endReplaceGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.ny
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((List<TabPosition>) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54) : nyVar2;
                                if (i6 != 0) {
                                    modifier3 = modifier4;
                                    j9 = j7;
                                    j8 = j3;
                                    nyVar4 = rememberComposableLambda;
                                    myVar5 = ComposableSingletons$TabRowKt.INSTANCE.m1841getLambda$1132537920$material3();
                                    i7 = 1445190381;
                                } else {
                                    modifier3 = modifier4;
                                    j8 = j3;
                                    nyVar4 = rememberComposableLambda;
                                    myVar5 = myVar3;
                                    i7 = 1445190381;
                                    j9 = j7;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                modifier3 = modifier;
                                nyVar4 = nyVar2;
                                myVar5 = myVar3;
                                i7 = 1445190381;
                                j8 = j3;
                                j9 = j4;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i7, i4, -1, "androidx.compose.material3.TabRow (TabRow.kt:1348)");
                            }
                            composer2 = startRestartGroup;
                            m2520TabRowWithSubcomposeImplDTcfvLk(modifier3, j8, j9, nyVar4, myVar5, myVar2, composer2, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            j5 = j8;
                            j6 = j9;
                            nyVar3 = nyVar4;
                            myVar4 = myVar5;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            j5 = j3;
                            j6 = j4;
                            nyVar3 = nyVar2;
                            myVar4 = myVar3;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new jt0(i, modifier2, j5, j6, nyVar3, myVar4, myVar2, i2, i3, 1));
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar3 = myVar;
                if ((i3 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            nyVar2 = nyVar;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            myVar3 = myVar;
            if ((i3 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        nyVar2 = nyVar;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        myVar3 = myVar;
        if ((i3 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 599187) != 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: TabRowImpl-DTcfvLk, reason: not valid java name */
    private static final void m2519TabRowImplDTcfvLk(Modifier modifier, long j, long j2, final ny nyVar, final my myVar, final my myVar2, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1955286154);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar2) ? Fields.RenderEffect : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1955286154, i2, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:398)");
            }
            int i3 = i2 << 3;
            composer2 = startRestartGroup;
            SurfaceKt.m2464SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(830280655, true, new my() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1
                public final void invoke(Composer composer3, int i4) {
                    if (!composer3.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(830280655, i4, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:405)");
                    }
                    FiniteAnimationSpec value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer3, 6);
                    Object rememberedValue = composer3.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = new TabRowKt$TabRowImpl$1$scope$1$1(value);
                        composer3.updateRememberedValue(rememberedValue);
                    }
                    final TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = (TabRowKt$TabRowImpl$1$scope$1$1) rememberedValue;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
                    my myVar3 = my.this;
                    my myVar4 = myVar;
                    final ny nyVar2 = nyVar;
                    List E = y80.E(myVar3, myVar4, ComposableLambdaKt.rememberComposableLambda(-1333331860, true, new my() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1.1
                        public final void invoke(Composer composer4, int i5) {
                            if (!composer4.shouldExecute((i5 & 3) != 2, i5 & 1)) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1333331860, i5, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:440)");
                            }
                            ny.this.invoke(tabRowKt$TabRowImpl$1$scope$1$1, composer4, 6);
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
                    Object rememberedValue2 = composer3.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new TabRowKt$TabRowImpl$1$2$1(tabRowKt$TabRowImpl$1$scope$1$1);
                        composer3.updateRememberedValue(rememberedValue2);
                    }
                    MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) rememberedValue2;
                    my combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(E);
                    Object rememberedValue3 = composer3.rememberedValue();
                    if (rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                        composer3.updateRememberedValue(rememberedValue3);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
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
                    my b = k4.b(companion2, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
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
            }, startRestartGroup, 54), composer2, (i3 & 896) | 12582912 | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ft0(modifier2, j, j2, nyVar, myVar, myVar2, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TabRowImpl_DTcfvLk$lambda$4(Modifier modifier, long j, long j2, ny nyVar, my myVar, my myVar2, int i, Composer composer, int i2) {
        m2519TabRowImplDTcfvLk(modifier, j, j2, nyVar, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* renamed from: TabRowWithSubcomposeImpl-DTcfvLk, reason: not valid java name */
    private static final void m2520TabRowWithSubcomposeImplDTcfvLk(Modifier modifier, long j, long j2, ny nyVar, my myVar, my myVar2, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(148841506);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(nyVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar2) ? Fields.RenderEffect : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(148841506, i2, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:762)");
            }
            int i3 = i2 << 3;
            composer2 = startRestartGroup;
            SurfaceKt.m2464SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1815327065, true, new TabRowKt$TabRowWithSubcomposeImpl$1(myVar2, myVar, nyVar), startRestartGroup, 54), composer2, (i3 & 896) | 12582912 | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ft0(modifier2, j, j2, nyVar, myVar, myVar2, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TabRowWithSubcomposeImpl_DTcfvLk$lambda$6(Modifier modifier, long j, long j2, ny nyVar, my myVar, my myVar2, int i, Composer composer, int i2) {
        m2520TabRowWithSubcomposeImplDTcfvLk(modifier, j, j2, nyVar, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TabRow_pAZo6Ak$lambda$10(int i, Modifier modifier, long j, long j2, ny nyVar, my myVar, my myVar2, int i2, int i3, Composer composer, int i4) {
        m2518TabRowpAZo6Ak(i, modifier, j, j2, nyVar, myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }
}
