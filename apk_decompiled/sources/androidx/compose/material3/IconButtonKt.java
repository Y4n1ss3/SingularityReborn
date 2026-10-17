package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.internal.ChildParentSemanticsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.a00;
import defpackage.b00;
import defpackage.c00;
import defpackage.d00;
import defpackage.e00;
import defpackage.er;
import defpackage.f00;
import defpackage.fc;
import defpackage.hz;
import defpackage.iy;
import defpackage.k4;
import defpackage.kg;
import defpackage.ky;
import defpackage.my;
import defpackage.q10;
import defpackage.vd;
import defpackage.vh;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IconButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconButton(iy iyVar, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier3;
        boolean z3;
        Shape shape3;
        IconButtonColors iconButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        Shape shape4;
        MutableInteractionSource mutableInteractionSource4;
        IconButtonColors iconButtonColors4;
        Modifier modifier4;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(947208840);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
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
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i7 = Fields.CameraDistance;
                            i3 |= i7;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i7 = Fields.RotationZ;
                    i3 |= i7;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i6 = Fields.Clip;
                            i3 |= i6;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.RenderEffect : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i8 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape2 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    iconButtonColors2 = IconButtonDefaults.INSTANCE.filledIconButtonColors(startRestartGroup, 6);
                                }
                                if (i5 != 0) {
                                    mutableInteractionSource4 = null;
                                    z4 = z2;
                                    shape4 = shape2;
                                } else {
                                    z4 = z2;
                                    shape4 = shape2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                }
                                iconButtonColors4 = iconButtonColors2;
                                modifier4 = modifier5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                z4 = z2;
                                shape4 = shape2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                iconButtonColors4 = iconButtonColors2;
                                modifier4 = modifier2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(947208840, i3, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                            }
                            int i9 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                            int i10 = i3 << 3;
                            composer2 = startRestartGroup;
                            SurfaceIconButton(iyVar2, modifier4, z4, shape4, iconButtonColors4, null, mutableInteractionSource4, myVar, composer2, i9 | (3670016 & i10) | (i10 & 29360128));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z3 = z4;
                            shape3 = shape4;
                            iconButtonColors3 = iconButtonColors4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            shape3 = shape2;
                            iconButtonColors3 = iconButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new f00(iyVar, modifier3, z3, shape3, iconButtonColors3, mutableInteractionSource3, myVar, i, i2, 1));
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
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FilledIconButton$lambda$10(iy iyVar, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, Composer composer, int i3) {
        FilledIconButton(iyVar, modifier, z, shape, iconButtonColors, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledIconToggleButton(boolean z, ky kyVar, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, Composer composer, int i, int i2) {
        boolean z3;
        int i3;
        ky kyVar2;
        Modifier modifier2;
        int i4;
        boolean z4;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        Composer composer2;
        Modifier modifier3;
        boolean z5;
        Shape shape3;
        IconToggleButtonColors iconToggleButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        int i7;
        MutableInteractionSource mutableInteractionSource4;
        boolean z6;
        Shape shape4;
        IconToggleButtonColors iconToggleButtonColors4;
        Object rememberedValue;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-713829427);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            kyVar2 = kyVar;
        } else {
            kyVar2 = kyVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(kyVar2) ? 32 : 16;
            }
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i9 = Fields.Clip;
                            i3 |= i9;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i8 = Fields.RenderEffect;
                            i3 |= i8;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i8 = 65536;
                    i3 |= i8;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : Fields.BlendMode;
                    if ((i2 & Fields.SpotShadowColor) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        i6 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                modifier4 = i10 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    i6 &= -57345;
                                    shape2 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i7 = i6 & (-458753);
                                    iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.filledIconToggleButtonColors(startRestartGroup, 6);
                                } else {
                                    i7 = i6;
                                }
                                if (i5 != 0) {
                                    mutableInteractionSource4 = null;
                                    z6 = z4;
                                    shape4 = shape2;
                                    iconToggleButtonColors4 = iconToggleButtonColors2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-713829427, i7, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                                    }
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    int i11 = 3;
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = new hz(i11);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    int i12 = i7 << 3;
                                    composer2 = startRestartGroup;
                                    SurfaceIconToggleButton(z3, kyVar2, SemanticsModifierKt.semantics$default(modifier4, false, (ky) rememberedValue, 1, null), z6, shape4, iconToggleButtonColors4, null, mutableInteractionSource4, myVar, composer2, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (29360128 & i12) | (i12 & 234881024));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    z5 = z6;
                                    shape3 = shape4;
                                    iconToggleButtonColors3 = iconToggleButtonColors4;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                int i13 = (i2 & 16) != 0 ? i6 & (-57345) : i6;
                                if ((i2 & 32) != 0) {
                                    i13 &= -458753;
                                }
                                i7 = i13;
                                modifier4 = modifier2;
                            }
                            z6 = z4;
                            iconToggleButtonColors4 = iconToggleButtonColors2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            shape4 = shape2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            rememberedValue = startRestartGroup.rememberedValue();
                            int i112 = 3;
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                            }
                            int i122 = i7 << 3;
                            composer2 = startRestartGroup;
                            SurfaceIconToggleButton(z3, kyVar2, SemanticsModifierKt.semantics$default(modifier4, false, (ky) rememberedValue, 1, null), z6, shape4, iconToggleButtonColors4, null, mutableInteractionSource4, myVar, composer2, (i7 & 14) | 1572864 | (i7 & 112) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (29360128 & i122) | (i122 & 234881024));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            z5 = z6;
                            shape3 = shape4;
                            iconToggleButtonColors3 = iconToggleButtonColors4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z5 = z4;
                            shape3 = shape2;
                            iconToggleButtonColors3 = iconToggleButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new c00(z, kyVar, modifier3, z5, shape3, iconToggleButtonColors3, mutableInteractionSource3, myVar, i, i2, 1));
                            return;
                        }
                        return;
                    }
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & Fields.SpotShadowColor) == 0) {
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & Fields.SpotShadowColor) == 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & Fields.SpotShadowColor) == 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FilledIconToggleButton$lambda$12$lambda$11(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6830getCheckboxo7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FilledIconToggleButton$lambda$13(boolean z, ky kyVar, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, Composer composer, int i3) {
        FilledIconToggleButton(z, kyVar, modifier, z2, shape, iconToggleButtonColors, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconButton(iy iyVar, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier3;
        boolean z3;
        Shape shape3;
        IconButtonColors iconButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        Shape shape4;
        MutableInteractionSource mutableInteractionSource4;
        IconButtonColors iconButtonColors4;
        Modifier modifier4;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-399178234);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
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
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i7 = Fields.CameraDistance;
                            i3 |= i7;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i7 = Fields.RotationZ;
                    i3 |= i7;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i6 = Fields.Clip;
                            i3 |= i6;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.RenderEffect : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i8 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape2 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    iconButtonColors2 = IconButtonDefaults.INSTANCE.filledTonalIconButtonColors(startRestartGroup, 6);
                                }
                                if (i5 != 0) {
                                    mutableInteractionSource4 = null;
                                    z4 = z2;
                                    shape4 = shape2;
                                } else {
                                    z4 = z2;
                                    shape4 = shape2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                }
                                iconButtonColors4 = iconButtonColors2;
                                modifier4 = modifier5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                z4 = z2;
                                shape4 = shape2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                iconButtonColors4 = iconButtonColors2;
                                modifier4 = modifier2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-399178234, i3, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                            }
                            int i9 = (i3 & 14) | 196608 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                            int i10 = i3 << 3;
                            composer2 = startRestartGroup;
                            SurfaceIconButton(iyVar2, modifier4, z4, shape4, iconButtonColors4, null, mutableInteractionSource4, myVar, composer2, i9 | (3670016 & i10) | (i10 & 29360128));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z3 = z4;
                            shape3 = shape4;
                            iconButtonColors3 = iconButtonColors4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            shape3 = shape2;
                            iconButtonColors3 = iconButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new f00(iyVar, modifier3, z3, shape3, iconButtonColors3, mutableInteractionSource3, myVar, i, i2, 2));
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
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FilledTonalIconButton$lambda$14(iy iyVar, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, Composer composer, int i3) {
        FilledTonalIconButton(iyVar, modifier, z, shape, iconButtonColors, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilledTonalIconToggleButton(boolean z, ky kyVar, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, Composer composer, int i, int i2) {
        boolean z3;
        int i3;
        ky kyVar2;
        Modifier modifier2;
        int i4;
        boolean z4;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        Composer composer2;
        Modifier modifier3;
        boolean z5;
        Shape shape3;
        IconToggleButtonColors iconToggleButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        MutableInteractionSource mutableInteractionSource4;
        boolean z6;
        Shape shape4;
        IconToggleButtonColors iconToggleButtonColors4;
        int i10;
        int i11;
        Object rememberedValue;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-436409269);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            kyVar2 = kyVar;
        } else {
            kyVar2 = kyVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(kyVar2) ? 32 : 16;
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
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i13 = Fields.Clip;
                            i3 |= i13;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i13 = 8192;
                    i3 |= i13;
                } else {
                    shape2 = shape;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i12 = Fields.RenderEffect;
                            i3 |= i12;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i12 = 65536;
                    i3 |= i12;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    i6 = 1572864;
                    mutableInteractionSource2 = mutableInteractionSource;
                } else {
                    i6 = 1572864;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : Fields.BlendMode;
                    }
                }
                if ((i2 & Fields.SpotShadowColor) != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    i7 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i7 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z5 = z4;
                        shape3 = shape2;
                        iconToggleButtonColors3 = iconToggleButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i14 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if (i4 != 0) {
                                z4 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i8 = i7 & (-57345);
                                shape2 = IconButtonDefaults.INSTANCE.getFilledShape(startRestartGroup, 6);
                            } else {
                                i8 = i7;
                            }
                            if ((i2 & 32) != 0) {
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.filledTonalIconToggleButtonColors(startRestartGroup, 6);
                                i9 = i8 & (-458753);
                            } else {
                                i9 = i8;
                            }
                            if (i5 != 0) {
                                mutableInteractionSource4 = null;
                                z6 = z4;
                                shape4 = shape2;
                                iconToggleButtonColors4 = iconToggleButtonColors2;
                                i10 = 4;
                                i11 = -436409269;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i11, i9, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                                }
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new hz(i10);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                int i15 = (i9 & 14) | i6 | (i9 & 112) | (i9 & 7168) | (57344 & i9) | (458752 & i9);
                                int i16 = i9 << 3;
                                composer2 = startRestartGroup;
                                SurfaceIconToggleButton(z3, kyVar2, SemanticsModifierKt.semantics$default(modifier2, false, (ky) rememberedValue, 1, null), z6, shape4, iconToggleButtonColors4, null, mutableInteractionSource4, myVar, composer2, i15 | (29360128 & i16) | (i16 & 234881024));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                z5 = z6;
                                shape3 = shape4;
                                iconToggleButtonColors3 = iconToggleButtonColors4;
                                mutableInteractionSource3 = mutableInteractionSource4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i9 = (i2 & 16) != 0 ? i7 & (-57345) : i7;
                            if ((i2 & 32) != 0) {
                                i9 &= -458753;
                            }
                        }
                        z6 = z4;
                        iconToggleButtonColors4 = iconToggleButtonColors2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        i10 = 4;
                        i11 = -436409269;
                        shape4 = shape2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.Companion.getEmpty()) {
                        }
                        int i152 = (i9 & 14) | i6 | (i9 & 112) | (i9 & 7168) | (57344 & i9) | (458752 & i9);
                        int i162 = i9 << 3;
                        composer2 = startRestartGroup;
                        SurfaceIconToggleButton(z3, kyVar2, SemanticsModifierKt.semantics$default(modifier2, false, (ky) rememberedValue, 1, null), z6, shape4, iconToggleButtonColors4, null, mutableInteractionSource4, myVar, composer2, i152 | (29360128 & i162) | (i162 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                        z5 = z6;
                        shape3 = shape4;
                        iconToggleButtonColors3 = iconToggleButtonColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new c00(z, kyVar, modifier3, z5, shape3, iconToggleButtonColors3, mutableInteractionSource3, myVar, i, i2, 2));
                        return;
                    }
                    return;
                }
                i7 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            if ((i2 & Fields.SpotShadowColor) != 0) {
            }
            i7 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        if ((i2 & Fields.SpotShadowColor) != 0) {
        }
        i7 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) == 4793490, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FilledTonalIconToggleButton$lambda$16$lambda$15(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6830getCheckboxo7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FilledTonalIconToggleButton$lambda$17(boolean z, ky kyVar, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, Composer composer, int i3) {
        FilledTonalIconToggleButton(z, kyVar, modifier, z2, shape, iconToggleButtonColors, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconButton(iy iyVar, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, my myVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        my myVar2;
        Composer composer2;
        Modifier modifier3;
        boolean z3;
        IconButtonColors iconButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1413012038);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
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
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i7 = Fields.CameraDistance;
                            i3 |= i7;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i7 = Fields.RotationZ;
                    i3 |= i7;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.Clip : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i6 = Fields.RenderEffect;
                                i3 |= i6;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i6 = 65536;
                        i3 |= i6;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                        myVar2 = myVar;
                    } else {
                        myVar2 = myVar;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(myVar2) ? 1048576 : Fields.BlendMode;
                        }
                    }
                    if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i8 != 0 ? Modifier.Companion : modifier2;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                iconButtonColors2 = IconButtonDefaults.INSTANCE.iconButtonColors(startRestartGroup, 6);
                            }
                            if (i5 != 0) {
                                mutableInteractionSource2 = null;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                modifier4 = modifier5;
                                shape2 = IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6);
                            } else {
                                modifier4 = modifier5;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier4 = modifier2;
                        }
                        IconButtonColors iconButtonColors4 = iconButtonColors2;
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        boolean z4 = z2;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1413012038, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                        }
                        int i9 = i3 << 3;
                        composer2 = startRestartGroup;
                        IconButtonImpl(modifier4, iyVar2, z4, shape2, iconButtonColors4, mutableInteractionSource4, myVar2, composer2, ((i3 >> 3) & 14) | (i9 & 112) | (i3 & 896) | ((i3 >> 6) & 7168) | (57344 & i9) | (i9 & 458752) | (i3 & 3670016));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        iconButtonColors3 = iconButtonColors4;
                        mutableInteractionSource3 = mutableInteractionSource4;
                    }
                    Shape shape3 = shape2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new f00(iyVar, modifier3, z3, iconButtonColors3, mutableInteractionSource3, shape3, myVar, i, i2));
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((196608 & i) != 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                Shape shape32 = shape2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((196608 & i) != 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            Shape shape322 = shape2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((196608 & i) != 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        Shape shape3222 = shape2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IconButton$lambda$0(iy iyVar, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, Composer composer, int i3) {
        IconButton(iyVar, modifier, z, iconButtonColors, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IconButton$lambda$1(iy iyVar, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, my myVar, int i, int i2, Composer composer, int i3) {
        IconButton(iyVar, modifier, z, iconButtonColors, mutableInteractionSource, shape, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final void IconButtonImpl(Modifier modifier, iy iyVar, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, Composer composer, int i) {
        int i2;
        MutableInteractionSource mutableInteractionSource2;
        Composer startRestartGroup = composer.startRestartGroup(-1134296466);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(shape) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(iconButtonColors) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 1048576 : Fields.BlendMode;
        }
        if (startRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1134296466, i2, -1, "androidx.compose.material3.IconButtonImpl (IconButton.kt:171)");
            }
            if (mutableInteractionSource == null) {
                startRestartGroup.startReplaceGroup(977045485);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(862800938);
                startRestartGroup.endReplaceGroup();
                mutableInteractionSource2 = mutableInteractionSource;
            }
            int i3 = i2;
            Modifier childSemantics$default = ChildParentSemanticsKt.childSemantics$default(ClickableKt.m258clickableO2vRcR0$default(BackgroundKt.m226backgroundbw27NRU(ClipKt.clip(SizeKt.m808size6HolHcs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier), IconButtonDefaults.m2025smallContainerSizeNwlBFI$material3$default(IconButtonDefaults.INSTANCE, 0, 1, null)), shape), iconButtonColors.m2018containerColorvNxB06k$material3(z), shape), mutableInteractionSource2, RippleKt.m2297rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z, null, Role.m6821boximpl(Role.Companion.m6828getButtono7Vup1c()), iyVar, 8, null), null, 1, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, childSemantics$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
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
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(iconButtonColors.m2019contentColorvNxB06k$material3(z))), myVar, startRestartGroup, ProvidedValue.$stable | ((i3 >> 15) & 112));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new vd(modifier, iyVar, z, shape, iconButtonColors, mutableInteractionSource, myVar, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IconButtonImpl$lambda$4(Modifier modifier, iy iyVar, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, int i, Composer composer, int i2) {
        IconButtonImpl(modifier, iyVar, z, shape, iconButtonColors, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconToggleButton(boolean z, ky kyVar, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, my myVar, Composer composer, int i, int i2) {
        boolean z3;
        int i3;
        ky kyVar2;
        Modifier modifier2;
        int i4;
        boolean z4;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        int i6;
        Composer composer2;
        Modifier modifier3;
        boolean z5;
        IconToggleButtonColors iconToggleButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape3;
        ScopeUpdateScope endRestartGroup;
        int i7;
        IconToggleButtonColors iconToggleButtonColors4;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape4;
        int i8;
        Modifier modifier4;
        int i9;
        boolean z6;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1031402037);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            kyVar2 = kyVar;
        } else {
            kyVar2 = kyVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(kyVar2) ? 32 : 16;
            }
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i11 = Fields.Clip;
                            i3 |= i11;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i11 = 8192;
                    i3 |= i11;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.RenderEffect : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i10 = 1048576;
                                i3 |= i10;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i10 = Fields.BlendMode;
                        i3 |= i10;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & Fields.SpotShadowColor) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        i6 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i12 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    i7 = i6 & (-57345);
                                    iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.iconToggleButtonColors(startRestartGroup, 6);
                                } else {
                                    i7 = i6;
                                }
                                if (i5 != 0) {
                                    mutableInteractionSource2 = null;
                                }
                                if ((i2 & 64) != 0) {
                                    shape4 = IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6);
                                    z6 = z4;
                                    iconToggleButtonColors4 = iconToggleButtonColors2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    modifier4 = modifier5;
                                    i9 = (-3670017) & i7;
                                    i8 = -1031402037;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(i8, i9, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                                    }
                                    composer2 = startRestartGroup;
                                    IconToggleButtonImpl(z3, kyVar2, modifier4, z6, iconToggleButtonColors4, mutableInteractionSource4, shape4, myVar, composer2, i9 & 33554430, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    z5 = z6;
                                    iconToggleButtonColors3 = iconToggleButtonColors4;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                    shape3 = shape4;
                                } else {
                                    iconToggleButtonColors4 = iconToggleButtonColors2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    shape4 = shape2;
                                    i8 = -1031402037;
                                    modifier4 = modifier5;
                                    i9 = i7;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i9 = (i2 & 16) != 0 ? i6 & (-57345) : i6;
                                if ((i2 & 64) != 0) {
                                    i9 &= -3670017;
                                }
                                iconToggleButtonColors4 = iconToggleButtonColors2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                shape4 = shape2;
                                i8 = -1031402037;
                                modifier4 = modifier2;
                            }
                            z6 = z4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = startRestartGroup;
                            IconToggleButtonImpl(z3, kyVar2, modifier4, z6, iconToggleButtonColors4, mutableInteractionSource4, shape4, myVar, composer2, i9 & 33554430, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            z5 = z6;
                            iconToggleButtonColors3 = iconToggleButtonColors4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                            shape3 = shape4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z5 = z4;
                            iconToggleButtonColors3 = iconToggleButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape3 = shape2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new c00(z, kyVar, modifier3, z5, iconToggleButtonColors3, mutableInteractionSource3, shape3, myVar, i, i2, 0));
                            return;
                        }
                        return;
                    }
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((1572864 & i) != 0) {
                }
                if ((i2 & Fields.SpotShadowColor) == 0) {
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) != 0) {
            }
            if ((i2 & Fields.SpotShadowColor) == 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) != 0) {
        }
        if ((i2 & Fields.SpotShadowColor) == 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IconToggleButton$lambda$5(boolean z, ky kyVar, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, Composer composer, int i3) {
        IconToggleButton(z, kyVar, modifier, z2, iconToggleButtonColors, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IconToggleButton$lambda$6(boolean z, ky kyVar, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, my myVar, int i, int i2, Composer composer, int i3) {
        IconToggleButton(z, kyVar, modifier, z2, iconToggleButtonColors, mutableInteractionSource, shape, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0241, code lost:
    
        if (defpackage.q10.b(r10.rememberedValue(), java.lang.Integer.valueOf(r3)) == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void IconToggleButtonImpl(boolean z, ky kyVar, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, my myVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z3;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Shape shape2;
        int i6;
        Modifier modifier3;
        boolean z4;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource3;
        ComposeUiNode.Companion companion;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(1724745099);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
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
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i10 = Fields.Clip;
                            i3 |= i10;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.RenderEffect : 65536;
                    if ((1572864 & i) != 0) {
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
                    if ((i2 & Fields.SpotShadowColor) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    i6 = i3;
                    if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i6 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i11 != 0 ? Modifier.Companion : modifier2;
                            if (i4 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 16) != 0) {
                                i7 = i6 & (-57345);
                                iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.iconToggleButtonVibrantColors(startRestartGroup, 6);
                            } else {
                                i7 = i6;
                            }
                            if (i5 != 0) {
                                mutableInteractionSource2 = null;
                            }
                            if ((i2 & 64) != 0) {
                                shape2 = IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6);
                                i8 = i7 & (-3670017);
                            } else {
                                i8 = i7;
                            }
                            z4 = z3;
                            modifier4 = modifier5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            int i12 = (i2 & 16) != 0 ? i6 & (-57345) : i6;
                            if ((i2 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            boolean z5 = z3;
                            modifier4 = modifier2;
                            z4 = z5;
                            i8 = i12;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1724745099, i8, -1, "androidx.compose.material3.IconToggleButtonImpl (IconButton.kt:320)");
                        }
                        if (mutableInteractionSource2 == null) {
                            startRestartGroup.startReplaceGroup(1187972528);
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            mutableInteractionSource3 = (MutableInteractionSource) rememberedValue;
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-377320953);
                            startRestartGroup.endReplaceGroup();
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        int i13 = ((i8 >> 9) & 14) | ((i8 << 3) & 112) | ((i8 >> 6) & 896);
                        Modifier m1025toggleableO2vRcR0 = ToggleableKt.m1025toggleableO2vRcR0(BackgroundKt.m227backgroundbw27NRU$default(ClipKt.clip(SizeKt.m808size6HolHcs(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier4), IconButtonDefaults.m2025smallContainerSizeNwlBFI$material3$default(IconButtonDefaults.INSTANCE, 0, 1, null)), shape2), iconToggleButtonColors2.containerColor$material3(z4, z, startRestartGroup, i13).getValue().m4771unboximpl(), null, 2, null), z, mutableInteractionSource3, RippleKt.m2297rippleH2RKhps$default(false, 0.0f, 0L, 7, null), z4, Role.m6821boximpl(Role.Companion.m6830getCheckboxo7Vup1c()), kyVar);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1025toggleableO2vRcR0);
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
                        my b = k4.b(companion2, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        if (m3878constructorimpl.getInserting()) {
                            companion = companion2;
                        } else {
                            companion = companion2;
                        }
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(iconToggleButtonColors2.contentColor$material3(z4, z, startRestartGroup, i13).getValue().m4771unboximpl())), myVar, startRestartGroup, ProvidedValue.$stable | ((i8 >> 18) & 112));
                        startRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    }
                    IconToggleButtonColors iconToggleButtonColors3 = iconToggleButtonColors2;
                    MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                    Shape shape3 = shape2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new c00(z, kyVar, modifier3, z4, iconToggleButtonColors3, mutableInteractionSource4, shape3, myVar, i, i2, 3));
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((1572864 & i) != 0) {
                }
                if ((i2 & Fields.SpotShadowColor) == 0) {
                }
                i6 = i3;
                if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i6 & 1)) {
                }
                IconToggleButtonColors iconToggleButtonColors32 = iconToggleButtonColors2;
                MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                Shape shape32 = shape2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((1572864 & i) != 0) {
            }
            if ((i2 & Fields.SpotShadowColor) == 0) {
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i6 & 1)) {
            }
            IconToggleButtonColors iconToggleButtonColors322 = iconToggleButtonColors2;
            MutableInteractionSource mutableInteractionSource422 = mutableInteractionSource2;
            Shape shape322 = shape2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((1572864 & i) != 0) {
        }
        if ((i2 & Fields.SpotShadowColor) == 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i6 & 1)) {
        }
        IconToggleButtonColors iconToggleButtonColors3222 = iconToggleButtonColors2;
        MutableInteractionSource mutableInteractionSource4222 = mutableInteractionSource2;
        Shape shape3222 = shape2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IconToggleButtonImpl$lambda$9(boolean z, ky kyVar, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, my myVar, int i, int i2, Composer composer, int i3) {
        IconToggleButtonImpl(z, kyVar, modifier, z2, iconToggleButtonColors, mutableInteractionSource, shape, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconButton(iy iyVar, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        IconButtonColors iconButtonColors2;
        BorderStroke borderStroke2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier3;
        boolean z3;
        Shape shape3;
        IconButtonColors iconButtonColors3;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        boolean z4;
        IconButtonColors iconButtonColors4;
        BorderStroke borderStroke4;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier4;
        Shape shape4;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(-1481353380);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
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
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i8 = Fields.Clip;
                            i3 |= i8;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        borderStroke2 = borderStroke;
                        if (startRestartGroup.changed(borderStroke2)) {
                            i7 = Fields.RenderEffect;
                            i3 |= i7;
                        }
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i7 = 65536;
                    i3 |= i7;
                } else {
                    borderStroke2 = borderStroke;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : Fields.BlendMode;
                    if ((i2 & Fields.SpotShadowColor) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i10 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape2 = IconButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    iconButtonColors2 = IconButtonDefaults.INSTANCE.outlinedIconButtonColors(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    BorderStroke outlinedIconButtonBorder = IconButtonDefaults.INSTANCE.outlinedIconButtonBorder(z2, startRestartGroup, ((i3 >> 6) & 14) | 48);
                                    i3 &= -458753;
                                    borderStroke2 = outlinedIconButtonBorder;
                                }
                                if (i5 != 0) {
                                    mutableInteractionSource4 = null;
                                    z4 = z2;
                                    shape4 = shape2;
                                    iconButtonColors4 = iconButtonColors2;
                                    borderStroke4 = borderStroke2;
                                    modifier4 = modifier5;
                                } else {
                                    z4 = z2;
                                    iconButtonColors4 = iconButtonColors2;
                                    borderStroke4 = borderStroke2;
                                    mutableInteractionSource4 = mutableInteractionSource2;
                                    modifier4 = modifier5;
                                    shape4 = shape2;
                                }
                                i6 = -1481353380;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                z4 = z2;
                                iconButtonColors4 = iconButtonColors2;
                                borderStroke4 = borderStroke2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                i6 = -1481353380;
                                modifier4 = modifier2;
                                shape4 = shape2;
                            }
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(i6, i3, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                            }
                            composer2 = startRestartGroup;
                            SurfaceIconButton(iyVar2, modifier4, z4, shape4, iconButtonColors4, borderStroke4, mutableInteractionSource4, myVar, composer2, i3 & 33554430);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z3 = z4;
                            shape3 = shape4;
                            iconButtonColors3 = iconButtonColors4;
                            borderStroke3 = borderStroke4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            shape3 = shape2;
                            iconButtonColors3 = iconButtonColors2;
                            borderStroke3 = borderStroke2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kg(iyVar, modifier3, z3, shape3, iconButtonColors3, borderStroke3, mutableInteractionSource3, myVar, i, i2, 4));
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & Fields.SpotShadowColor) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & Fields.SpotShadowColor) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & Fields.SpotShadowColor) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OutlinedIconButton$lambda$18(iy iyVar, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, Composer composer, int i3) {
        OutlinedIconButton(iyVar, modifier, z, shape, iconButtonColors, borderStroke, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedIconToggleButton(boolean z, ky kyVar, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        Shape shape2;
        IconToggleButtonColors iconToggleButtonColors2;
        BorderStroke borderStroke2;
        int i6;
        int i7;
        Modifier modifier3;
        boolean z4;
        Shape shape3;
        IconToggleButtonColors iconToggleButtonColors3;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        MutableInteractionSource mutableInteractionSource3;
        Object rememberedValue;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1703707081);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
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
                    z3 = z2;
                    i3 |= startRestartGroup.changed(z3) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            shape2 = shape;
                            if (startRestartGroup.changed(shape2)) {
                                i12 = Fields.Clip;
                                i3 |= i12;
                            }
                        } else {
                            shape2 = shape;
                        }
                        i12 = 8192;
                        i3 |= i12;
                    } else {
                        shape2 = shape;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            iconToggleButtonColors2 = iconToggleButtonColors;
                            if (startRestartGroup.changed(iconToggleButtonColors2)) {
                                i11 = Fields.RenderEffect;
                                i3 |= i11;
                            }
                        } else {
                            iconToggleButtonColors2 = iconToggleButtonColors;
                        }
                        i11 = 65536;
                        i3 |= i11;
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            borderStroke2 = borderStroke;
                            if (startRestartGroup.changed(borderStroke2)) {
                                i10 = 1048576;
                                i3 |= i10;
                            }
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        i10 = Fields.BlendMode;
                        i3 |= i10;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    i6 = i2 & Fields.SpotShadowColor;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    if ((i2 & Fields.RotationX) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i7 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i7 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i4 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if (i5 != 0) {
                                    z3 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    i8 = i7 & (-57345);
                                    shape2 = IconButtonDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                                } else {
                                    i8 = i7;
                                }
                                if ((i2 & 32) != 0) {
                                    i8 &= -458753;
                                    iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonColors(startRestartGroup, 6);
                                }
                                if ((i2 & 64) != 0) {
                                    borderStroke2 = IconButtonDefaults.INSTANCE.outlinedIconToggleButtonBorder(z3, z, startRestartGroup, ((i8 >> 9) & 14) | 384 | ((i8 << 3) & 112));
                                    i9 = i8 & (-3670017);
                                } else {
                                    i9 = i8;
                                }
                                if (i6 != 0) {
                                    mutableInteractionSource3 = null;
                                    Shape shape4 = shape2;
                                    IconToggleButtonColors iconToggleButtonColors4 = iconToggleButtonColors2;
                                    Modifier modifier4 = modifier2;
                                    BorderStroke borderStroke4 = borderStroke2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1703707081, i9, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                                    }
                                    rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = new hz(2);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    boolean z5 = z3;
                                    SurfaceIconToggleButton(z, kyVar, SemanticsModifierKt.semantics$default(modifier4, false, (ky) rememberedValue, 1, null), z5, shape4, iconToggleButtonColors4, borderStroke4, mutableInteractionSource3, myVar, startRestartGroup, i9 & 268434558);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    borderStroke3 = borderStroke4;
                                    iconToggleButtonColors3 = iconToggleButtonColors4;
                                    shape3 = shape4;
                                    z4 = z5;
                                    modifier3 = modifier4;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i9 = (i2 & 16) != 0 ? i7 & (-57345) : i7;
                                if ((i2 & 32) != 0) {
                                    i9 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i9 &= -3670017;
                                }
                            }
                            mutableInteractionSource3 = mutableInteractionSource;
                            Shape shape42 = shape2;
                            IconToggleButtonColors iconToggleButtonColors42 = iconToggleButtonColors2;
                            Modifier modifier42 = modifier2;
                            BorderStroke borderStroke42 = borderStroke2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                            }
                            boolean z52 = z3;
                            SurfaceIconToggleButton(z, kyVar, SemanticsModifierKt.semantics$default(modifier42, false, (ky) rememberedValue, 1, null), z52, shape42, iconToggleButtonColors42, borderStroke42, mutableInteractionSource3, myVar, startRestartGroup, i9 & 268434558);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            mutableInteractionSource2 = mutableInteractionSource3;
                            borderStroke3 = borderStroke42;
                            iconToggleButtonColors3 = iconToggleButtonColors42;
                            shape3 = shape42;
                            z4 = z52;
                            modifier3 = modifier42;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            z4 = z3;
                            shape3 = shape2;
                            iconToggleButtonColors3 = iconToggleButtonColors2;
                            borderStroke3 = borderStroke2;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new b00(z, kyVar, modifier3, z4, shape3, iconToggleButtonColors3, borderStroke3, mutableInteractionSource2, myVar, i, i2));
                            return;
                        }
                        return;
                    }
                    i7 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i7 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z3 = z2;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & Fields.SpotShadowColor;
                if (i6 == 0) {
                }
                if ((i2 & Fields.RotationX) == 0) {
                }
                i7 = i3;
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i7 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z3 = z2;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & Fields.SpotShadowColor;
            if (i6 == 0) {
            }
            if ((i2 & Fields.RotationX) == 0) {
            }
            i7 = i3;
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i7 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z3 = z2;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & Fields.SpotShadowColor;
        if (i6 == 0) {
        }
        if ((i2 & Fields.RotationX) == 0) {
        }
        i7 = i3;
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i7 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OutlinedIconToggleButton$lambda$20$lambda$19(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6830getCheckboxo7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OutlinedIconToggleButton$lambda$21(boolean z, ky kyVar, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2, Composer composer, int i3) {
        OutlinedIconToggleButton(z, kyVar, modifier, z2, shape, iconToggleButtonColors, borderStroke, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final void SurfaceIconButton(iy iyVar, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final my myVar, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-171935091);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(shape) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(iconButtonColors) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(borderStroke) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if (startRestartGroup.shouldExecute((4793491 & i2) != 4793490, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-171935091, i2, -1, "androidx.compose.material3.SurfaceIconButton (IconButton.kt:698)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new hz(5);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int i3 = i2 << 9;
            composer2 = startRestartGroup;
            SurfaceKt.m2467Surfaceo_FOJdg(iyVar, SemanticsModifierKt.semantics$default(modifier, false, (ky) rememberedValue, 1, null), z, shape, iconButtonColors.m2018containerColorvNxB06k$material3(z), iconButtonColors.m2019contentColorvNxB06k$material3(z), 0.0f, 0.0f, borderStroke, mutableInteractionSource, ComposableLambdaKt.rememberComposableLambda(669231714, true, new my() { // from class: androidx.compose.material3.IconButtonKt$SurfaceIconButton$2
                public final void invoke(Composer composer3, int i4) {
                    if (!composer3.shouldExecute((i4 & 3) != 2, i4 & 1)) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(669231714, i4, -1, "androidx.compose.material3.SurfaceIconButton.<anonymous> (IconButton.kt:708)");
                    }
                    Modifier m808size6HolHcs = SizeKt.m808size6HolHcs(Modifier.Companion, IconButtonDefaults.m2025smallContainerSizeNwlBFI$material3$default(IconButtonDefaults.INSTANCE, 0, 1, null));
                    Alignment center = Alignment.Companion.getCenter();
                    my myVar2 = my.this;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m808size6HolHcs);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    iy constructor = companion.getConstructor();
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
                    my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (fc.l(myVar2, composer3, 0)) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), composer2, (i2 & 8078) | (234881024 & i3) | (i3 & 1879048192), 6, 192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new e00(iyVar, modifier, z, shape, iconButtonColors, borderStroke, mutableInteractionSource, myVar, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SurfaceIconButton$lambda$23$lambda$22(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6828getButtono7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SurfaceIconButton$lambda$24(iy iyVar, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, int i, Composer composer, int i2) {
        SurfaceIconButton(iyVar, modifier, z, shape, iconButtonColors, borderStroke, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    private static final void SurfaceIconToggleButton(boolean z, ky kyVar, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final my myVar, Composer composer, int i) {
        int i2;
        ky kyVar2;
        Composer startRestartGroup = composer.startRestartGroup(-1118363928);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            kyVar2 = kyVar;
            i2 |= startRestartGroup.changedInstance(kyVar2) ? 32 : 16;
        } else {
            kyVar2 = kyVar;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(shape) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(iconToggleButtonColors) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(borderStroke) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((38347923 & i2) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1118363928, i2, -1, "androidx.compose.material3.SurfaceIconToggleButton (IconButton.kt:728)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new hz(i3);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int i4 = i2 >> 9;
            int i5 = (i4 & 896) | (i4 & 14) | ((i2 << 3) & 112);
            SurfaceKt.m2466Surfaced85dljk(z, kyVar2, SemanticsModifierKt.semantics$default(modifier, false, (ky) rememberedValue, 1, null), z2, shape, iconToggleButtonColors.containerColor$material3(z2, z, startRestartGroup, i5).getValue().m4771unboximpl(), iconToggleButtonColors.contentColor$material3(z2, z, startRestartGroup, i5).getValue().m4771unboximpl(), 0.0f, 0.0f, borderStroke, mutableInteractionSource, ComposableLambdaKt.rememberComposableLambda(1492028158, true, new my() { // from class: androidx.compose.material3.IconButtonKt$SurfaceIconToggleButton$2
                public final void invoke(Composer composer2, int i6) {
                    if (!composer2.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1492028158, i6, -1, "androidx.compose.material3.SurfaceIconToggleButton.<anonymous> (IconButton.kt:740)");
                    }
                    Modifier m808size6HolHcs = SizeKt.m808size6HolHcs(Modifier.Companion, IconButtonDefaults.m2025smallContainerSizeNwlBFI$material3$default(IconButtonDefaults.INSTANCE, 0, 1, null));
                    Alignment center = Alignment.Companion.getCenter();
                    my myVar2 = my.this;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m808size6HolHcs);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    iy constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(composer2);
                    my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                    }
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (fc.l(myVar2, composer2, 0)) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), startRestartGroup, (64638 & i2) | (1879048192 & (i2 << 9)), ((i2 >> 21) & 14) | 48, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a00(z, kyVar, modifier, z2, shape, iconToggleButtonColors, borderStroke, mutableInteractionSource, myVar, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SurfaceIconToggleButton$lambda$26$lambda$25(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6830getCheckboxo7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 SurfaceIconToggleButton$lambda$27(boolean z, ky kyVar, Modifier modifier, boolean z2, Shape shape, IconToggleButtonColors iconToggleButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, int i, Composer composer, int i2) {
        SurfaceIconToggleButton(z, kyVar, modifier, z2, shape, iconToggleButtonColors, borderStroke, mutableInteractionSource, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x004a  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IconButton(iy iyVar, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        IconButtonColors iconButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        my myVar2;
        Modifier modifier3;
        boolean z3;
        IconButtonColors iconButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        IconButtonColors iconButtonColors4;
        Modifier modifier4;
        IconButtonColors iconButtonColors5;
        MutableInteractionSource mutableInteractionSource4;
        boolean z4;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-2096213317);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        iconButtonColors2 = iconButtonColors;
                        if (startRestartGroup.changed(iconButtonColors2)) {
                            i6 = Fields.CameraDistance;
                            i3 |= i6;
                        }
                    } else {
                        iconButtonColors2 = iconButtonColors;
                    }
                    i6 = Fields.RotationZ;
                    i3 |= i6;
                } else {
                    iconButtonColors2 = iconButtonColors;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.Clip : 8192;
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                        myVar2 = myVar;
                    } else {
                        myVar2 = myVar;
                        if ((i & 196608) == 0) {
                            i3 |= startRestartGroup.changedInstance(myVar2) ? Fields.RenderEffect : 65536;
                        }
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            modifier4 = modifier2;
                            iconButtonColors5 = iconButtonColors2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            z4 = z2;
                        } else {
                            Modifier modifier5 = i7 != 0 ? Modifier.Companion : modifier2;
                            boolean z5 = i4 == 0 ? z2 : true;
                            if ((i2 & 8) != 0) {
                                iconButtonColors4 = IconButtonDefaults.INSTANCE.iconButtonColors(startRestartGroup, 6);
                                i3 &= -7169;
                            } else {
                                iconButtonColors4 = iconButtonColors2;
                            }
                            if (i5 != 0) {
                                mutableInteractionSource4 = null;
                                modifier4 = modifier5;
                                iconButtonColors5 = iconButtonColors4;
                            } else {
                                modifier4 = modifier5;
                                iconButtonColors5 = iconButtonColors4;
                                mutableInteractionSource4 = mutableInteractionSource2;
                            }
                            z4 = z5;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2096213317, i3, -1, "androidx.compose.material3.IconButton (IconButton.kt:93)");
                        }
                        MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                        IconButton(iyVar2, modifier4, z4, iconButtonColors5, mutableInteractionSource5, IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6), myVar2, startRestartGroup, (65534 & i3) | ((i3 << 3) & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z4;
                        iconButtonColors3 = iconButtonColors5;
                        mutableInteractionSource3 = mutableInteractionSource5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        iconButtonColors3 = iconButtonColors2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new vh(iyVar, modifier3, z3, iconButtonColors3, mutableInteractionSource3, myVar, i, i2));
                        return;
                    }
                    return;
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 32) == 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 32) == 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 32) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0065  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void IconToggleButton(boolean z, ky kyVar, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, Composer composer, int i, int i2) {
        boolean z3;
        int i3;
        ky kyVar2;
        Modifier modifier2;
        int i4;
        boolean z4;
        IconToggleButtonColors iconToggleButtonColors2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier3;
        boolean z5;
        IconToggleButtonColors iconToggleButtonColors3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        boolean z6;
        IconToggleButtonColors iconToggleButtonColors4;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1307193856);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            kyVar2 = kyVar;
        } else {
            kyVar2 = kyVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(kyVar2) ? 32 : 16;
            }
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                        if (startRestartGroup.changed(iconToggleButtonColors2)) {
                            i6 = Fields.Clip;
                            i3 |= i6;
                        }
                    } else {
                        iconToggleButtonColors2 = iconToggleButtonColors;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    iconToggleButtonColors2 = iconToggleButtonColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? Fields.RenderEffect : 65536;
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar) ? 1048576 : Fields.BlendMode;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                modifier4 = modifier2;
                            } else {
                                Modifier modifier5 = i7 != 0 ? Modifier.Companion : modifier2;
                                if (i4 != 0) {
                                    z4 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    iconToggleButtonColors2 = IconButtonDefaults.INSTANCE.iconToggleButtonColors(startRestartGroup, 6);
                                }
                                if (i5 != 0) {
                                    modifier4 = modifier5;
                                    mutableInteractionSource4 = null;
                                    z6 = z4;
                                    iconToggleButtonColors4 = iconToggleButtonColors2;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1307193856, i3, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                                    }
                                    composer2 = startRestartGroup;
                                    IconToggleButton(z3, kyVar2, modifier4, z6, iconToggleButtonColors4, mutableInteractionSource4, IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6), myVar, composer2, (524286 & i3) | ((i3 << 3) & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    z5 = z6;
                                    iconToggleButtonColors3 = iconToggleButtonColors4;
                                    mutableInteractionSource3 = mutableInteractionSource4;
                                } else {
                                    modifier4 = modifier5;
                                }
                            }
                            iconToggleButtonColors4 = iconToggleButtonColors2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            z6 = z4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = startRestartGroup;
                            IconToggleButton(z3, kyVar2, modifier4, z6, iconToggleButtonColors4, mutableInteractionSource4, IconButtonDefaults.INSTANCE.getStandardShape(startRestartGroup, 6), myVar, composer2, (524286 & i3) | ((i3 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            z5 = z6;
                            iconToggleButtonColors3 = iconToggleButtonColors4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z5 = z4;
                            iconToggleButtonColors3 = iconToggleButtonColors2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new d00(z, kyVar, modifier3, z5, iconToggleButtonColors3, mutableInteractionSource3, myVar, i, i2));
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
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & 64) == 0) {
                }
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z4 = z2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & 64) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & 64) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
