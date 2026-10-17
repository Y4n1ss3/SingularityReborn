package androidx.compose.foundation.text.contextmenu.internal;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TextContextMenuHelperApi28 {
    public static final TextContextMenuHelperApi28 INSTANCE = new TextContextMenuHelperApi28();

    private TextContextMenuHelperApi28() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconBox(Icon icon, Composer composer, int i) {
        int i2;
        ScopeUpdateScope endRestartGroup;
        d dVar;
        Composer startRestartGroup = composer.startRestartGroup(2116504409);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(icon) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(this) ? 32 : 16;
        }
        int i3 = 0;
        int i4 = 1;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2116504409, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:267)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean changed = startRestartGroup.changed(icon) | startRestartGroup.changed(context);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = icon.loadDrawable(context);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Drawable drawable = (Drawable) rememberedValue;
            if (drawable == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    dVar = new d(this, icon, i, i3);
                    endRestartGroup.updateScope(dVar);
                }
                return;
            }
            IconBox(drawable, startRestartGroup, i2 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            dVar = new d(this, icon, i, i4);
            endRestartGroup.updateScope(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IconBox$lambda$1(TextContextMenuHelperApi28 textContextMenuHelperApi28, Icon icon, int i, Composer composer, int i2) {
        textContextMenuHelperApi28.IconBox(icon, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IconBox$lambda$2(TextContextMenuHelperApi28 textContextMenuHelperApi28, Icon icon, int i, Composer composer, int i2) {
        textContextMenuHelperApi28.IconBox(icon, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IconBox$lambda$3$0(Drawable drawable, DrawScope drawScope) {
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() >> 32)), (int) Float.intBitsToFloat((int) (drawScope.mo5335getSizeNHjbRc() & 4294967295L)));
        drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IconBox$lambda$4(TextContextMenuHelperApi28 textContextMenuHelperApi28, Drawable drawable, int i, Composer composer, int i2) {
        textContextMenuHelperApi28.IconBox(drawable, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String textClassificationItem$lambda$0(TextClassification textClassification, Composer composer, int i) {
        composer.startReplaceGroup(950061013);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(950061013, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:246)");
        }
        String valueOf = String.valueOf(textClassification.getLabel());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return valueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 textClassificationItem$lambda$2(Context context, TextClassification textClassification) {
        TextClassificationHelperApi28.INSTANCE.sendLegacyIntent(context, textClassification);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String textClassificationItem$lambda$3(RemoteAction remoteAction, Composer composer, int i) {
        composer.startReplaceGroup(-1376593684);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1376593684, i, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:254)");
        }
        String obj = remoteAction.getTitle().toString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 textClassificationItem$lambda$4(RemoteAction remoteAction) {
        TextClassificationHelperApi28.INSTANCE.sendPendingIntent(remoteAction.getActionIntent());
        return w01.a;
    }

    public final void textClassificationItem(ContextMenuScope contextMenuScope, final Context context, TextContextMenuTextClassificationItem textContextMenuTextClassificationItem) {
        if (context == null) {
            return;
        }
        int index = textContextMenuTextClassificationItem.getIndex();
        final TextClassification textClassification = textContextMenuTextClassificationItem.getTextClassification();
        final int i = 1;
        if (index < 0) {
            my myVar = new my() { // from class: androidx.compose.foundation.text.contextmenu.internal.e
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    String textClassificationItem$lambda$0;
                    String textClassificationItem$lambda$3;
                    int i2 = r2;
                    Parcelable parcelable = textClassification;
                    switch (i2) {
                        case 0:
                            textClassificationItem$lambda$0 = TextContextMenuHelperApi28.textClassificationItem$lambda$0((TextClassification) parcelable, (Composer) obj, ((Integer) obj2).intValue());
                            return textClassificationItem$lambda$0;
                        default:
                            textClassificationItem$lambda$3 = TextContextMenuHelperApi28.textClassificationItem$lambda$3((RemoteAction) parcelable, (Composer) obj, ((Integer) obj2).intValue());
                            return textClassificationItem$lambda$3;
                    }
                }
            };
            final Drawable icon = textClassification.getIcon();
            ContextMenuScope.item$default(contextMenuScope, myVar, null, false, icon != null ? ComposableLambdaKt.composableLambdaInstance(-1123224187, true, new ny() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$textClassificationItem$2$1
                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m1219invokeek8zF_U(((Color) obj).m4771unboximpl(), (Composer) obj2, ((Number) obj3).intValue());
                    return w01.a;
                }

                /* renamed from: invoke-ek8zF_U, reason: not valid java name */
                public final void m1219invokeek8zF_U(long j, Composer composer, int i2) {
                    if (!composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1123224187, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:247)");
                    }
                    TextContextMenuHelperApi28.INSTANCE.IconBox(icon, composer, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }) : null, new iy() { // from class: androidx.compose.foundation.text.contextmenu.internal.f
                @Override // defpackage.iy
                public final Object invoke() {
                    w01 textClassificationItem$lambda$2;
                    textClassificationItem$lambda$2 = TextContextMenuHelperApi28.textClassificationItem$lambda$2(context, textClassification);
                    return textClassificationItem$lambda$2;
                }
            }, 6, null);
        } else {
            final RemoteAction remoteAction = textClassification.getActions().get(index);
            ContextMenuScope.item$default(contextMenuScope, new my() { // from class: androidx.compose.foundation.text.contextmenu.internal.e
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    String textClassificationItem$lambda$0;
                    String textClassificationItem$lambda$3;
                    int i2 = i;
                    Parcelable parcelable = remoteAction;
                    switch (i2) {
                        case 0:
                            textClassificationItem$lambda$0 = TextContextMenuHelperApi28.textClassificationItem$lambda$0((TextClassification) parcelable, (Composer) obj, ((Integer) obj2).intValue());
                            return textClassificationItem$lambda$0;
                        default:
                            textClassificationItem$lambda$3 = TextContextMenuHelperApi28.textClassificationItem$lambda$3((RemoteAction) parcelable, (Composer) obj, ((Integer) obj2).intValue());
                            return textClassificationItem$lambda$3;
                    }
                }
            }, null, false, ((index == 0 ? 1 : 0) != 0 || remoteAction.shouldShowIcon()) ? ComposableLambdaKt.composableLambdaInstance(-1261173016, true, new ny() { // from class: androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28$textClassificationItem$5
                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    m1220invokeek8zF_U(((Color) obj).m4771unboximpl(), (Composer) obj2, ((Number) obj3).intValue());
                    return w01.a;
                }

                /* renamed from: invoke-ek8zF_U, reason: not valid java name */
                public final void m1220invokeek8zF_U(long j, Composer composer, int i2) {
                    if (!composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1261173016, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:257)");
                    }
                    TextContextMenuHelperApi28.INSTANCE.IconBox(remoteAction.getIcon(), composer, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }) : null, new iy() { // from class: androidx.compose.foundation.text.contextmenu.internal.g
                @Override // defpackage.iy
                public final Object invoke() {
                    w01 textClassificationItem$lambda$4;
                    textClassificationItem$lambda$4 = TextContextMenuHelperApi28.textClassificationItem$lambda$4(remoteAction);
                    return textClassificationItem$lambda$4;
                }
            }, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconBox(final Drawable drawable, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(257732500);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(drawable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(257732500, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:274)");
            }
            Modifier m807size3ABfNKs = SizeKt.m807size3ABfNKs(Modifier.Companion, ContextMenuSpec.INSTANCE.m344getIconSizeD9Ej5fM());
            boolean changedInstance = startRestartGroup.changedInstance(drawable);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ky() { // from class: androidx.compose.foundation.text.contextmenu.internal.h
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 IconBox$lambda$3$0;
                        IconBox$lambda$3$0 = TextContextMenuHelperApi28.IconBox$lambda$3$0(drawable, (DrawScope) obj);
                        return IconBox$lambda$3$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            BoxKt.Box(DrawModifierKt.drawBehind(m807size3ABfNKs, (ky) rememberedValue), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new d(this, drawable, i, i3));
        }
    }
}
