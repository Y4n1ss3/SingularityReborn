package androidx.compose.foundation.text.contextmenu;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.text.contextmenu.ProcessText_androidKt;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope_androidKt;
import androidx.compose.foundation.text.contextmenu.data.ProcessTextKey;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.ui.text.TextRange;
import defpackage.ky;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ProcessText_androidKt {
    /* renamed from: addProcessedTextContextMenuItems-UAq72N0, reason: not valid java name */
    public static final void m1208addProcessedTextContextMenuItemsUAq72N0(TextContextMenuBuilderScope textContextMenuBuilderScope, Context context, final boolean z, final CharSequence charSequence, final long j) {
        if (!ComposeFoundationFlags.isSmartSelectionEnabled || TextRange.m7054getCollapsedimpl(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List<ResolveInfo> queryProcessTextActivities = ProcessTextApi23Impl.INSTANCE.queryProcessTextActivities(context2);
        if (queryProcessTextActivities.isEmpty()) {
            return;
        }
        textContextMenuBuilderScope.separator();
        int size = queryProcessTextActivities.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = queryProcessTextActivities.get(i);
            TextContextMenuBuilderScope_androidKt.item$default(textContextMenuBuilderScope, new ProcessTextKey(i), resolveInfo.loadLabel(packageManager).toString(), 0, new ky() { // from class: eg0
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 addProcessedTextContextMenuItems_UAq72N0$lambda$0$0;
                    addProcessedTextContextMenuItems_UAq72N0$lambda$0$0 = ProcessText_androidKt.addProcessedTextContextMenuItems_UAq72N0$lambda$0$0(context2, resolveInfo, z, charSequence, j, (TextContextMenuSession) obj);
                    return addProcessedTextContextMenuItems_UAq72N0$lambda$0$0;
                }
            }, 4, null);
            i++;
            context2 = context;
        }
        textContextMenuBuilderScope.separator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 addProcessedTextContextMenuItems_UAq72N0$lambda$0$0(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, long j, TextContextMenuSession textContextMenuSession) {
        ProcessTextApi23Impl.INSTANCE.getOnClickProcessTextItem().invoke(context, resolveInfo, Boolean.valueOf(z), charSequence, TextRange.m7048boximpl(j));
        textContextMenuSession.close();
        return w01.a;
    }
}
