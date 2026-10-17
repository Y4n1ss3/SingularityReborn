package androidx.compose.foundation.content;

import android.net.Uri;
import android.os.Bundle;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PlatformTransferableContent {
    public static final int $stable = 8;
    private final Bundle extras;
    private final Uri linkUri;

    public PlatformTransferableContent(Uri uri, Bundle bundle) {
        this.linkUri = uri;
        this.extras = bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformTransferableContent)) {
            return false;
        }
        PlatformTransferableContent platformTransferableContent = (PlatformTransferableContent) obj;
        return q10.b(this.linkUri, platformTransferableContent.linkUri) && q10.b(this.extras, platformTransferableContent.extras);
    }

    public final Bundle getExtras() {
        return this.extras;
    }

    public final Uri getLinkUri() {
        return this.linkUri;
    }

    public int hashCode() {
        Uri uri = this.linkUri;
        return this.extras.hashCode() + ((uri != null ? uri.hashCode() : 0) * 31);
    }

    public String toString() {
        return "PlatformTransferableContent(linkUri=" + this.linkUri + ", extras=" + this.extras + ')';
    }
}
