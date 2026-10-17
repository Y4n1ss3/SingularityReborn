package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.g00;
import defpackage.hz;
import defpackage.ky;
import defpackage.w01;
import defpackage.wd;
import defpackage.yl;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m807size3ABfNKs(Modifier.Companion, SmallIconButtonTokens.INSTANCE.m3631getIconSizeD9Ej5fM());

    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Icon(Painter painter, ColorProducer colorProducer, String str, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        String str2;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1755070997);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(colorProducer) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(str2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.CameraDistance : Fields.RotationZ;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1755070997, i3, -1, "androidx.compose.material3.Icon (Icon.kt:189)");
                }
                long m4797getUnspecified0d7_KjU = Color.Companion.m4797getUnspecified0d7_KjU();
                boolean changedInstance = startRestartGroup.changedInstance(colorProducer);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new defpackage.h(colorProducer, 19);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                m2054Iconww6aTOc(painter, str2, DrawModifierKt.drawWithCache(modifier3, (ky) rememberedValue), m4797getUnspecified0d7_KjU, startRestartGroup, (i3 & 14) | 3072 | ((i3 >> 3) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new yl(painter, colorProducer, str, modifier2, i, i2));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult Icon$lambda$12$lambda$11(ColorProducer colorProducer, CacheDrawScope cacheDrawScope) {
        GraphicsLayer obtainGraphicsLayer = cacheDrawScope.obtainGraphicsLayer();
        CacheDrawScope.m4292recordTdoYBX4$default(cacheDrawScope, obtainGraphicsLayer, null, null, 0L, new hz(6), 7, null);
        if (colorProducer != null) {
            obtainGraphicsLayer.setColorFilter(ColorFilter.Companion.m4802tintxETnrds$default(ColorFilter.Companion, colorProducer.mo1922invoke0d7_KjU(), 0, 2, null));
        }
        return cacheDrawScope.onDrawWithContent(new defpackage.h(obtainGraphicsLayer, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Icon$lambda$12$lambda$11$lambda$10(GraphicsLayer graphicsLayer, ContentDrawScope contentDrawScope) {
        GraphicsLayerKt.drawLayer(contentDrawScope, graphicsLayer);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Icon$lambda$12$lambda$11$lambda$9$lambda$7(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Icon$lambda$13(Painter painter, ColorProducer colorProducer, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Icon(painter, colorProducer, str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0071  */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2054Iconww6aTOc(Painter painter, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        long j2;
        Modifier modifier3;
        long j3;
        ScopeUpdateScope endRestartGroup;
        long j4;
        Modifier modifier4;
        long j5;
        Modifier modifier5;
        Composer startRestartGroup = composer.startRestartGroup(-2142239481);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i & 3072) != 0) {
                j2 = j;
                i3 |= ((i2 & 8) == 0 && startRestartGroup.changed(j2)) ? 2048 : Fields.RotationZ;
            } else {
                j2 = j;
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier6 = i4 != 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 8) != 0) {
                        j4 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
                        i3 &= -7169;
                    } else {
                        j4 = j2;
                    }
                    modifier4 = modifier6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    long j6 = j2;
                    modifier4 = modifier2;
                    j4 = j6;
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2142239481, i3, -1, "androidx.compose.material3.Icon (Icon.kt:142)");
                }
                boolean z = (((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(j4)) || (i3 & 3072) == 2048;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == Composer.Companion.getEmpty()) {
                    if (Color.m4762equalsimpl0(j4, Color.Companion.m4797getUnspecified0d7_KjU())) {
                        j5 = j4;
                        rememberedValue = null;
                    } else {
                        j5 = j4;
                        rememberedValue = ColorFilter.Companion.m4802tintxETnrds$default(ColorFilter.Companion, j5, 0, 2, null);
                    }
                    startRestartGroup.updateRememberedValue(rememberedValue);
                } else {
                    j5 = j4;
                }
                ColorFilter colorFilter = (ColorFilter) rememberedValue;
                if (str != null) {
                    startRestartGroup.startReplaceGroup(-536990979);
                    Modifier.Companion companion = Modifier.Companion;
                    boolean z2 = (i3 & 112) == 32;
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new wd(str, 15);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    modifier5 = SemanticsModifierKt.semantics$default(companion, false, (ky) rememberedValue2, 1, null);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-536832197);
                    startRestartGroup.endReplaceGroup();
                    modifier5 = Modifier.Companion;
                }
                BoxKt.Box(PainterModifierKt.paint$default(defaultSizeFor(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier4), painter), painter, false, null, ContentScale.Companion.getFit(), 0.0f, colorFilter, 22, null).then(modifier5), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                j3 = j5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new g00(painter, str, modifier3, j3, i, i2, 2));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Icon_ww6aTOc$lambda$0(ImageVector imageVector, String str, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m2055Iconww6aTOc(imageVector, str, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Icon_ww6aTOc$lambda$2(ImageBitmap imageBitmap, String str, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m2053Iconww6aTOc(imageBitmap, str, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Icon_ww6aTOc$lambda$5$lambda$4(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6832getImageo7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Icon_ww6aTOc$lambda$6(Painter painter, String str, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m2054Iconww6aTOc(painter, str, modifier, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        return modifier.then((Size.m4581equalsimpl0(painter.mo5455getIntrinsicSizeNHjbRc(), Size.Companion.m4593getUnspecifiedNHjbRc()) || m2056isInfiniteuvyYCjk(painter.mo5455getIntrinsicSizeNHjbRc())) ? DefaultIconSizeModifier : Modifier.Companion);
    }

    /* renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m2056isInfiniteuvyYCjk(long j) {
        return Float.isInfinite(Float.intBitsToFloat((int) (j >> 32))) && Float.isInfinite(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0073  */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2053Iconww6aTOc(ImageBitmap imageBitmap, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        int i3;
        String str2;
        Modifier modifier2;
        long j2;
        Modifier modifier3;
        long j3;
        ScopeUpdateScope endRestartGroup;
        int i4;
        Modifier modifier4;
        long m4771unboximpl;
        boolean changed;
        Object rememberedValue;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1092052280);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(imageBitmap) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            }
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i5 = Fields.CameraDistance;
                        i3 |= i5;
                    }
                } else {
                    j2 = j;
                }
                i5 = Fields.RotationZ;
                i3 |= i5;
            } else {
                j2 = j;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier4 = modifier2;
                } else {
                    Modifier modifier5 = i6 != 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 8) != 0) {
                        i4 = i3 & (-7169);
                        modifier4 = modifier5;
                        m4771unboximpl = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1092052280, i4, -1, "androidx.compose.material3.Icon (Icon.kt:105)");
                        }
                        changed = startRestartGroup.changed(imageBitmap);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                            BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, 0L, 0L, 6, null);
                            startRestartGroup.updateRememberedValue(bitmapPainter);
                            rememberedValue = bitmapPainter;
                        }
                        m2054Iconww6aTOc((BitmapPainter) rememberedValue, str2, modifier4, m4771unboximpl, startRestartGroup, i4 & 8176, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        j3 = m4771unboximpl;
                    } else {
                        i4 = i3;
                        modifier4 = modifier5;
                    }
                }
                m4771unboximpl = j2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                changed = startRestartGroup.changed(imageBitmap);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                BitmapPainter bitmapPainter2 = new BitmapPainter(imageBitmap, 0L, 0L, 6, null);
                startRestartGroup.updateRememberedValue(bitmapPainter2);
                rememberedValue = bitmapPainter2;
                m2054Iconww6aTOc((BitmapPainter) rememberedValue, str2, modifier4, m4771unboximpl, startRestartGroup, i4 & 8176, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                j3 = m4771unboximpl;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new g00(imageBitmap, str, modifier3, j3, i, i2, 1));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0071  */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2055Iconww6aTOc(ImageVector imageVector, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        int i3;
        String str2;
        Modifier modifier2;
        long j2;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        long m4771unboximpl;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-126890956);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(imageVector) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changed(str2) ? 32 : 16;
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
                    j2 = j;
                    if (startRestartGroup.changed(j2)) {
                        i4 = Fields.CameraDistance;
                        i3 |= i4;
                    }
                } else {
                    j2 = j;
                }
                i4 = Fields.RotationZ;
                i3 |= i4;
            } else {
                j2 = j;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i5 != 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        modifier3 = modifier4;
                        m4771unboximpl = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-126890956, i3, -1, "androidx.compose.material3.Icon (Icon.kt:69)");
                        }
                        m2054Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, startRestartGroup, i3 & 14), str2, modifier3, m4771unboximpl, startRestartGroup, VectorPainter.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j2 = m4771unboximpl;
                    } else {
                        modifier3 = modifier4;
                    }
                }
                m4771unboximpl = j2;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                m2054Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, startRestartGroup, i3 & 14), str2, modifier3, m4771unboximpl, startRestartGroup, VectorPainter.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
                j2 = m4771unboximpl;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new g00(imageVector, str, modifier2, j2, i, i2, 0));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
