package androidx.compose.foundation.text;

import android.database.ContentObserver;
import android.net.Uri;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface ContentResolverForSecureTextField {
    boolean getShowPassword();

    void registerContentObserver(Uri uri, boolean z, ContentObserver contentObserver);

    void unregisterContentObserver(ContentObserver contentObserver);
}
