package androidx.compose.foundation.text.contextmenu;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.compose.ui.text.TextRange;
import defpackage.al;
import defpackage.je0;
import defpackage.ky;
import defpackage.py;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ProcessTextApi23Impl {
    public static final ProcessTextApi23Impl INSTANCE = new ProcessTextApi23Impl();
    private static ky processTextActivitiesQuery = new je0(2);
    private static py onClickProcessTextItem = new al(3);
    public static final int $stable = 8;

    private ProcessTextApi23Impl() {
    }

    private final Intent createProcessTextIntent() {
        return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
    }

    private final boolean hasPermission(ResolveInfo resolveInfo, Context context) {
        return context.getPackageName().equals(resolveInfo.activityInfo.packageName) || hasPermission(resolveInfo.activityInfo, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 onClickProcessTextItem$lambda$0(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, TextRange textRange) {
        String obj = charSequence.subSequence(TextRange.m7058getMinimpl(textRange.m7064unboximpl()), TextRange.m7057getMaximpl(textRange.m7064unboximpl())).toString();
        Intent createProcessTextIntentForResolveInfo = INSTANCE.createProcessTextIntentForResolveInfo(resolveInfo, z);
        createProcessTextIntentForResolveInfo.putExtra("android.intent.extra.PROCESS_TEXT", obj);
        context.startActivity(createProcessTextIntentForResolveInfo);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List processTextActivitiesQuery$lambda$0(Context context) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(INSTANCE.createProcessTextIntent(), 0);
        ArrayList arrayList = new ArrayList(queryIntentActivities.size());
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i);
            if (INSTANCE.hasPermission(resolveInfo, context)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    public final Intent createProcessTextIntentForResolveInfo(ResolveInfo resolveInfo, boolean z) {
        Intent putExtra = createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
    }

    public final py getOnClickProcessTextItem() {
        return onClickProcessTextItem;
    }

    public final ky getProcessTextActivitiesQuery() {
        return processTextActivitiesQuery;
    }

    public final List<ResolveInfo> queryProcessTextActivities(Context context) {
        return (List) processTextActivitiesQuery.invoke(context);
    }

    public final void setOnClickProcessTextItem(py pyVar) {
        onClickProcessTextItem = pyVar;
    }

    public final void setProcessTextActivitiesQuery(ky kyVar) {
        processTextActivitiesQuery = kyVar;
    }

    private final boolean hasPermission(ActivityInfo activityInfo, Context context) {
        if (!activityInfo.exported) {
            return false;
        }
        String str = activityInfo.permission;
        return str == null || context.checkSelfPermission(str) == 0;
    }

    public static /* synthetic */ void getOnClickProcessTextItem$annotations() {
    }

    public static /* synthetic */ void getProcessTextActivitiesQuery$annotations() {
    }
}
