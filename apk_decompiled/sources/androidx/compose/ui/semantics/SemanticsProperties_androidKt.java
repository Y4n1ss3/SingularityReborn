package androidx.compose.ui.semantics;

import defpackage.db0;
import defpackage.my;
import defpackage.z20;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SemanticsProperties_androidKt {
    static final /* synthetic */ z20[] $$delegatedProperties = {new db0(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z"), new db0(SemanticsProperties_androidKt.class, "accessibilityClassName", "getAccessibilityClassName(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;")};

    static {
        SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
        semanticsPropertiesAndroid.getTestTagsAsResourceId();
        semanticsPropertiesAndroid.getAccessibilityClassName();
    }

    public static final <T> SemanticsPropertyKey<T> SemanticsPropertyKey(String str, String str2, my myVar) {
        return new SemanticsPropertyKey<>(str, false, myVar, str2);
    }

    public static /* synthetic */ SemanticsPropertyKey SemanticsPropertyKey$default(String str, String str2, my myVar, int i, Object obj) {
        if ((i & 4) != 0) {
            myVar = SemanticsProperties_androidKt$SemanticsPropertyKey$1.INSTANCE;
        }
        return SemanticsPropertyKey(str, str2, myVar);
    }

    public static final String getAccessibilityClassName(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName().getValue(semanticsPropertyReceiver, $$delegatedProperties[1]);
    }

    public static final boolean getTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]).booleanValue();
    }

    public static final void setAccessibilityClassName(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsPropertiesAndroid.INSTANCE.getAccessibilityClassName().setValue(semanticsPropertyReceiver, $$delegatedProperties[1], str);
    }

    public static final void setTestTagsAsResourceId(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], Boolean.valueOf(z));
    }
}
