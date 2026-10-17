package androidx.compose.foundation;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.er;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;
import defpackage.wd;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImageKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Image(final Painter painter, final String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Alignment alignment2;
        int i5;
        ContentScale contentScale2;
        int i6;
        float f2;
        int i7;
        final ColorFilter colorFilter2;
        final Modifier modifier3;
        final Alignment alignment3;
        final ContentScale contentScale3;
        final float f3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(1142754848);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(painter) : startRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                alignment2 = alignment;
                i3 |= startRestartGroup.changed(alignment2) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    contentScale2 = contentScale;
                    i3 |= startRestartGroup.changed(contentScale2) ? Fields.Clip : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? Fields.RenderEffect : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(colorFilter) ? 1048576 : Fields.BlendMode;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            Modifier modifier5 = i9 != 0 ? Modifier.Companion : modifier2;
                            Alignment center = i4 != 0 ? Alignment.Companion.getCenter() : alignment2;
                            ContentScale fit = i5 != 0 ? ContentScale.Companion.getFit() : contentScale2;
                            float f4 = i6 != 0 ? 1.0f : f2;
                            ColorFilter colorFilter3 = i7 != 0 ? null : colorFilter;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1142754848, i3, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                            }
                            if (str != null) {
                                startRestartGroup.startReplaceGroup(1899222916);
                                Modifier.Companion companion = Modifier.Companion;
                                boolean z = (i3 & 112) == 32;
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (z || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new wd(str, 16);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                i8 = 0;
                                modifier4 = SemanticsModifierKt.semantics$default(companion, false, (ky) rememberedValue, 1, null);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                i8 = 0;
                                startRestartGroup.startReplaceGroup(1899381698);
                                startRestartGroup.endReplaceGroup();
                                modifier4 = Modifier.Companion;
                            }
                            Modifier clipToBounds = ClipKt.clipToBounds(modifier5.then(modifier4));
                            Modifier modifier6 = modifier5;
                            ColorFilter colorFilter4 = colorFilter3;
                            int i10 = i8;
                            Modifier paint$default = PainterModifierKt.paint$default(clipToBounds, painter, false, center, fit, f4, colorFilter4, 2, null);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = ImageKt$Image$1$1.INSTANCE;
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i10));
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, paint$default);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
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
                            Updater.m3886setimpl(m3878constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Updater.m3884reconcileimpl(m3878constructorimpl, companion2.getApplyOnDeactivatedNodeAssertion());
                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                            Updater.m3882initimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion2.getSetCompositeKeyHash());
                            startRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            colorFilter2 = colorFilter4;
                            f3 = f4;
                            contentScale3 = fit;
                            alignment3 = center;
                            modifier3 = modifier6;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            colorFilter2 = colorFilter;
                            modifier3 = modifier2;
                            alignment3 = alignment2;
                            contentScale3 = contentScale2;
                            f3 = f2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: h00
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 Image$lambda$2;
                                    int intValue = ((Integer) obj2).intValue();
                                    Image$lambda$2 = ImageKt.Image$lambda$2(Painter.this, str, modifier3, alignment3, contentScale3, f3, colorFilter2, i, i2, (Composer) obj, intValue);
                                    return Image$lambda$2;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    f2 = f;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                contentScale2 = contentScale;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                f2 = f;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            alignment2 = alignment;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            contentScale2 = contentScale;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            f2 = f;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        alignment2 = alignment;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        contentScale2 = contentScale;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        f2 = f;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Image$lambda$0$0(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.m6847setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m6832getImageo7Vup1c());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Image$lambda$2(Painter painter, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, int i2, Composer composer, int i3) {
        Image(painter, str, modifier, alignment, contentScale, f, colorFilter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* renamed from: Image-5h-nEew, reason: not valid java name */
    public static final void m284Image5hnEew(ImageBitmap imageBitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Composer composer, int i2, int i3) {
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i3 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i3 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i3 & 32) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i3 & 64) != 0 ? null : colorFilter;
        int m5338getDefaultFilterQualityfv9h1I = (i3 & Fields.SpotShadowColor) != 0 ? DrawScope.Companion.m5338getDefaultFilterQualityfv9h1I() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1396260732, i2, -1, "androidx.compose.foundation.Image (Image.kt:156)");
        }
        boolean changed = composer.changed(imageBitmap);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = BitmapPainterKt.m5458BitmapPainterQZhYCtY$default(imageBitmap, 0L, 0L, m5338getDefaultFilterQualityfv9h1I, 6, null);
            composer.updateRememberedValue(rememberedValue);
        }
        Image((BitmapPainter) rememberedValue, str, modifier2, center, fit, f2, colorFilter2, composer, BitmapPainter.$stable | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (i2 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void Image(ImageVector imageVector, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        if ((i2 & 8) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        Alignment alignment2 = alignment;
        ContentScale fit = (i2 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i2 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1595907091, i, -1, "androidx.compose.foundation.Image (Image.kt:202)");
        }
        Image(VectorPainterKt.rememberVectorPainter(imageVector, composer, i & 14), str, modifier2, alignment2, fit, f2, colorFilter2, composer, VectorPainter.$stable | (i & 112) | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @er
    public static final /* synthetic */ void Image(ImageBitmap imageBitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        Alignment center = (i2 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i2 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i2 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2123228673, i, -1, "androidx.compose.foundation.Image (Image.kt:98)");
        }
        m284Image5hnEew(imageBitmap, str, modifier2, center, fit, f2, colorFilter2, FilterQuality.Companion.m4861getLowfv9h1I(), composer, i & 4194302, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
