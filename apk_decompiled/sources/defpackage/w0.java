package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class w0 {
    public static PackageInfo a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object b(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static Object[] c(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArray(str, cls);
    }

    public static ArrayList d(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Serializable e(Bundle bundle, String str, Class cls) {
        return bundle.getSerializable(str, cls);
    }

    public static SparseArray f(Bundle bundle, String str, Class cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}
