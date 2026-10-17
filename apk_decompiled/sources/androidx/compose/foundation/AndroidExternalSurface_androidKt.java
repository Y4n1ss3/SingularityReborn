package androidx.compose.foundation;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.compose.foundation.AndroidExternalSurfaceZOrder;
import androidx.compose.foundation.AndroidExternalSurface_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import defpackage.d1;
import defpackage.ky;
import defpackage.my;
import defpackage.st;
import defpackage.un;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidExternalSurface_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0065  */
    /* renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m221AndroidEmbeddedExternalSurfacesv6N_fY(Modifier modifier, boolean z, long j, float[] fArr, final ky kyVar, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        long j2;
        int i4;
        ky kyVar2;
        final float[] fArr2;
        final Modifier modifier3;
        final boolean z3;
        final long j3;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        final float[] fArr3;
        final boolean z4;
        Object rememberedValue;
        Composer.Companion companion;
        Object rememberedValue2;
        boolean changedInstance;
        Object rememberedValue3;
        final long j4;
        Composer startRestartGroup = composer.startRestartGroup(217541314);
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
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            if ((i & 384) != 0) {
                j2 = j;
                i3 |= ((i2 & 4) == 0 && startRestartGroup.changed(j2)) ? 256 : Fields.SpotShadowColor;
            } else {
                j2 = j;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(fArr != null ? Matrix.m5003boximpl(fArr) : null) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if ((i & 24576) != 0) {
                kyVar2 = kyVar;
                i3 |= startRestartGroup.changedInstance(kyVar2) ? Fields.Clip : 8192;
            } else {
                kyVar2 = kyVar;
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                fArr2 = fArr;
                modifier3 = modifier2;
                z3 = z2;
                j3 = j2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier4 = i5 != 0 ? Modifier.Companion : modifier2;
                    if (i6 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        j2 = IntSize.Companion.m7787getZeroYbymL2g();
                    }
                    if (i4 != 0) {
                        z4 = z2;
                        fArr3 = null;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(217541314, i3, -1, "androidx.compose.foundation.AndroidEmbeddedExternalSurface (AndroidExternalSurface.android.kt:432)");
                        }
                        final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState = rememberAndroidEmbeddedExternalSurfaceState(startRestartGroup, 0);
                        rememberedValue = startRestartGroup.rememberedValue();
                        companion = Composer.Companion;
                        if (rememberedValue == companion.getEmpty()) {
                            rememberedValue = new d1(17);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ky kyVar3 = (ky) rememberedValue;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = new d1(18);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ky kyVar4 = (ky) rememberedValue2;
                        changedInstance = ((((i3 & 896) ^ 384) <= 256 && startRestartGroup.changed(j2)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(rememberAndroidEmbeddedExternalSurfaceState) | ((57344 & i3) != 16384) | ((i3 & 112) == 32) | startRestartGroup.changedInstance(fArr3 == null ? Matrix.m5003boximpl(fArr3) : null);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance || rememberedValue3 == companion.getEmpty()) {
                            j4 = j2;
                            final ky kyVar5 = kyVar2;
                            rememberedValue3 = new ky() { // from class: androidx.compose.foundation.b
                                @Override // defpackage.ky
                                public final Object invoke(Object obj) {
                                    w01 AndroidEmbeddedExternalSurface_sv6N_fY$lambda$2$0;
                                    AndroidEmbeddedExternalSurface_sv6N_fY$lambda$2$0 = AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$2$0(j4, rememberAndroidEmbeddedExternalSurfaceState, kyVar5, z4, fArr3, (TextureView) obj);
                                    return AndroidEmbeddedExternalSurface_sv6N_fY$lambda$2$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        } else {
                            j4 = j2;
                        }
                        Modifier modifier5 = modifier4;
                        AndroidView_androidKt.AndroidView(kyVar3, modifier5, kyVar4, null, (ky) rememberedValue3, startRestartGroup, ((i3 << 3) & 112) | 390, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        j3 = j4;
                        z3 = z4;
                        fArr2 = fArr3;
                    } else {
                        fArr3 = fArr;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    fArr3 = fArr;
                    modifier4 = modifier2;
                }
                z4 = z2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState2 = rememberAndroidEmbeddedExternalSurfaceState(startRestartGroup, 0);
                rememberedValue = startRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                }
                ky kyVar32 = (ky) rememberedValue;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                }
                ky kyVar42 = (ky) rememberedValue2;
                changedInstance = ((((i3 & 896) ^ 384) <= 256 && startRestartGroup.changed(j2)) || (i3 & 384) == 256) | startRestartGroup.changedInstance(rememberAndroidEmbeddedExternalSurfaceState2) | ((57344 & i3) != 16384) | ((i3 & 112) == 32) | startRestartGroup.changedInstance(fArr3 == null ? Matrix.m5003boximpl(fArr3) : null);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance) {
                }
                j4 = j2;
                final ky kyVar52 = kyVar2;
                rememberedValue3 = new ky() { // from class: androidx.compose.foundation.b
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 AndroidEmbeddedExternalSurface_sv6N_fY$lambda$2$0;
                        AndroidEmbeddedExternalSurface_sv6N_fY$lambda$2$0 = AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$2$0(j4, rememberAndroidEmbeddedExternalSurfaceState2, kyVar52, z4, fArr3, (TextureView) obj);
                        return AndroidEmbeddedExternalSurface_sv6N_fY$lambda$2$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                Modifier modifier52 = modifier4;
                AndroidView_androidKt.AndroidView(kyVar32, modifier52, kyVar42, null, (ky) rememberedValue3, startRestartGroup, ((i3 << 3) & 112) | 390, 8);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                j3 = j4;
                z3 = z4;
                fArr2 = fArr3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new my() { // from class: o5
                    @Override // defpackage.my
                    public final Object invoke(Object obj, Object obj2) {
                        w01 AndroidEmbeddedExternalSurface_sv6N_fY$lambda$3;
                        int intValue = ((Integer) obj2).intValue();
                        AndroidEmbeddedExternalSurface_sv6N_fY$lambda$3 = AndroidExternalSurface_androidKt.AndroidEmbeddedExternalSurface_sv6N_fY$lambda$3(Modifier.this, z3, j3, fArr2, kyVar, i, i2, (Composer) obj, intValue);
                        return AndroidEmbeddedExternalSurface_sv6N_fY$lambda$3;
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextureView AndroidEmbeddedExternalSurface_sv6N_fY$lambda$0$0(Context context) {
        return new TextureView(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AndroidEmbeddedExternalSurface_sv6N_fY$lambda$1$0(TextureView textureView) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AndroidEmbeddedExternalSurface_sv6N_fY$lambda$2$0(long j, AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState, ky kyVar, boolean z, float[] fArr, TextureView textureView) {
        android.graphics.Matrix matrix;
        SurfaceTexture surfaceTexture;
        if (!IntSize.m7780equalsimpl0(j, IntSize.Companion.m7787getZeroYbymL2g()) && (surfaceTexture = textureView.getSurfaceTexture()) != null) {
            surfaceTexture.setDefaultBufferSize((int) (j >> 32), (int) (4294967295L & j));
        }
        androidEmbeddedExternalSurfaceState.m210setSurfaceSizeozmzZPI(j);
        if (textureView.getSurfaceTextureListener() != androidEmbeddedExternalSurfaceState) {
            kyVar.invoke(androidEmbeddedExternalSurfaceState);
            textureView.setSurfaceTextureListener(androidEmbeddedExternalSurfaceState);
        }
        textureView.setOpaque(z);
        if (fArr != null) {
            matrix = androidEmbeddedExternalSurfaceState.getMatrix();
            AndroidMatrixConversions_androidKt.m4628setFromEL8BTi8(matrix, fArr);
        } else {
            matrix = null;
        }
        textureView.setTransform(matrix);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AndroidEmbeddedExternalSurface_sv6N_fY$lambda$3(Modifier modifier, boolean z, long j, float[] fArr, ky kyVar, int i, int i2, Composer composer, int i3) {
        m221AndroidEmbeddedExternalSurfacesv6N_fY(modifier, z, j, fArr, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m222AndroidExternalSurface58FFMhA(Modifier modifier, boolean z, long j, int i, boolean z2, final ky kyVar, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z3;
        long j2;
        int i5;
        int i6;
        int i7;
        final boolean z4;
        final Modifier modifier3;
        final boolean z5;
        final long j3;
        final int i8;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier4;
        long j4;
        boolean z6;
        int i9;
        boolean z7;
        Composer startRestartGroup = composer.startRestartGroup(640888974);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            z3 = z;
            i4 |= startRestartGroup.changed(z3) ? 32 : 16;
            if ((i2 & 384) != 0) {
                j2 = j;
                i4 |= ((i3 & 4) == 0 && startRestartGroup.changed(j2)) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                j2 = j;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? Fields.CameraDistance : Fields.RotationZ;
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    z4 = z2;
                    i4 |= startRestartGroup.changed(z4) ? Fields.Clip : 8192;
                    if ((i2 & 196608) == 0) {
                        i4 |= startRestartGroup.changedInstance(kyVar) ? Fields.RenderEffect : 65536;
                    }
                    if (startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z5 = z3;
                        j3 = j2;
                        i8 = i6;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i10 != 0 ? Modifier.Companion : modifier2;
                            if (i11 != 0) {
                                z3 = true;
                            }
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                                j2 = IntSize.Companion.m7787getZeroYbymL2g();
                            }
                            if (i5 != 0) {
                                i6 = AndroidExternalSurfaceZOrder.Companion.m218getBehindB_4ceCc();
                            }
                            if (i7 != 0) {
                                z4 = false;
                            }
                            modifier4 = modifier5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            modifier4 = modifier2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(640888974, i4, -1, "androidx.compose.foundation.AndroidExternalSurface (AndroidExternalSurface.android.kt:274)");
                        }
                        final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState = rememberAndroidExternalSurfaceState(startRestartGroup, 0);
                        boolean changedInstance = ((458752 & i4) == 131072) | startRestartGroup.changedInstance(rememberAndroidExternalSurfaceState);
                        Object rememberedValue = startRestartGroup.rememberedValue();
                        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                            rememberedValue = new ky() { // from class: androidx.compose.foundation.a
                                @Override // defpackage.ky
                                public final Object invoke(Object obj) {
                                    SurfaceView AndroidExternalSurface_58FFMhA$lambda$0$0;
                                    AndroidExternalSurface_58FFMhA$lambda$0$0 = AndroidExternalSurface_androidKt.AndroidExternalSurface_58FFMhA$lambda$0$0(ky.this, rememberAndroidExternalSurfaceState, (Context) obj);
                                    return AndroidExternalSurface_58FFMhA$lambda$0$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ky kyVar2 = (ky) rememberedValue;
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        Composer.Companion companion = Composer.Companion;
                        if (rememberedValue2 == companion.getEmpty()) {
                            rememberedValue2 = new d1(16);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ky kyVar3 = (ky) rememberedValue2;
                        boolean z8 = ((i4 & 112) == 32) | ((((i4 & 896) ^ 384) > 256 && startRestartGroup.changed(j2)) || (i4 & 384) == 256) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384);
                        Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z8 || rememberedValue3 == companion.getEmpty()) {
                            final boolean z9 = z4;
                            final boolean z10 = z3;
                            final long j5 = j2;
                            final int i12 = i6;
                            rememberedValue3 = new ky() { // from class: m5
                                @Override // defpackage.ky
                                public final Object invoke(Object obj) {
                                    w01 AndroidExternalSurface_58FFMhA$lambda$2$0;
                                    AndroidExternalSurface_58FFMhA$lambda$2$0 = AndroidExternalSurface_androidKt.AndroidExternalSurface_58FFMhA$lambda$2$0(j5, z10, i12, z9, (SurfaceView) obj);
                                    return AndroidExternalSurface_58FFMhA$lambda$2$0;
                                }
                            };
                            j4 = j5;
                            z6 = z10;
                            i9 = i12;
                            z7 = z9;
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        } else {
                            z7 = z4;
                            z6 = z3;
                            j4 = j2;
                            i9 = i6;
                        }
                        AndroidView_androidKt.AndroidView(kyVar2, modifier4, kyVar3, null, (ky) rememberedValue3, startRestartGroup, ((i4 << 3) & 112) | 384, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j3 = j4;
                        modifier3 = modifier4;
                        z4 = z7;
                        i8 = i9;
                        z5 = z6;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new my() { // from class: n5
                            @Override // defpackage.my
                            public final Object invoke(Object obj, Object obj2) {
                                w01 AndroidExternalSurface_58FFMhA$lambda$3;
                                int intValue = ((Integer) obj2).intValue();
                                AndroidExternalSurface_58FFMhA$lambda$3 = AndroidExternalSurface_androidKt.AndroidExternalSurface_58FFMhA$lambda$3(Modifier.this, z5, j3, i8, z4, kyVar, i2, i3, (Composer) obj, intValue);
                                return AndroidExternalSurface_58FFMhA$lambda$3;
                            }
                        });
                        return;
                    }
                    return;
                }
                z4 = z2;
                if ((i2 & 196608) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i6 = i;
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            z4 = z2;
            if ((i2 & 196608) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z3 = z;
        if ((i2 & 384) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i;
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        z4 = z2;
        if ((i2 & 196608) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SurfaceView AndroidExternalSurface_58FFMhA$lambda$0$0(ky kyVar, AndroidExternalSurfaceState androidExternalSurfaceState, Context context) {
        SurfaceView surfaceView = new SurfaceView(context);
        kyVar.invoke(androidExternalSurfaceState);
        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
        return surfaceView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AndroidExternalSurface_58FFMhA$lambda$1$0(SurfaceView surfaceView) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AndroidExternalSurface_58FFMhA$lambda$2$0(long j, boolean z, int i, boolean z2, SurfaceView surfaceView) {
        if (IntSize.m7780equalsimpl0(j, IntSize.Companion.m7787getZeroYbymL2g())) {
            surfaceView.getHolder().setSizeFromLayout();
        } else {
            surfaceView.getHolder().setFixedSize((int) (j >> 32), (int) (j & 4294967295L));
        }
        surfaceView.getHolder().setFormat(z ? -1 : -3);
        AndroidExternalSurfaceZOrder.Companion companion = AndroidExternalSurfaceZOrder.Companion;
        if (AndroidExternalSurfaceZOrder.m214equalsimpl0(i, companion.m218getBehindB_4ceCc())) {
            surfaceView.setZOrderOnTop(false);
        } else if (AndroidExternalSurfaceZOrder.m214equalsimpl0(i, companion.m219getMediaOverlayB_4ceCc())) {
            surfaceView.setZOrderMediaOverlay(true);
        } else if (AndroidExternalSurfaceZOrder.m214equalsimpl0(i, companion.m220getOnTopB_4ceCc())) {
            surfaceView.setZOrderOnTop(true);
        }
        surfaceView.setSecure(z2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AndroidExternalSurface_58FFMhA$lambda$3(Modifier modifier, boolean z, long j, int i, boolean z2, ky kyVar, int i2, int i3, Composer composer, int i4) {
        m222AndroidExternalSurface58FFMhA(modifier, z, j, i, z2, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    private static final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1057437053, i, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:370)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        un unVar = (un) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new AndroidEmbeddedExternalSurfaceState(unVar);
            composer.updateRememberedValue(rememberedValue2);
        }
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = (AndroidEmbeddedExternalSurfaceState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidEmbeddedExternalSurfaceState;
    }

    private static final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-873615933, i, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:187)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        un unVar = (un) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new AndroidExternalSurfaceState(unVar);
            composer.updateRememberedValue(rememberedValue2);
        }
        AndroidExternalSurfaceState androidExternalSurfaceState = (AndroidExternalSurfaceState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidExternalSurfaceState;
    }
}
