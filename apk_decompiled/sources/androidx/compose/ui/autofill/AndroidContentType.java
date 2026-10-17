package androidx.compose.ui.autofill;

import defpackage.dj;
import defpackage.p80;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AndroidContentType implements ContentType {
    private final Set<String> androidAutofillHints;

    public AndroidContentType(Set<String> set) {
        this.androidAutofillHints = set;
    }

    public final Set<String> getAndroidAutofillHints() {
        return this.androidAutofillHints;
    }

    @Override // androidx.compose.ui.autofill.ContentType
    public ContentType plus(ContentType contentType) {
        contentType.getClass();
        Set<String> set = this.androidAutofillHints;
        Set<String> set2 = ((AndroidContentType) contentType).androidAutofillHints;
        set.getClass();
        set2.getClass();
        Integer valueOf = set2 instanceof Collection ? Integer.valueOf(set2.size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(p80.L(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        dj.d0(linkedHashSet, set2);
        return new AndroidContentType(linkedHashSet);
    }
}
