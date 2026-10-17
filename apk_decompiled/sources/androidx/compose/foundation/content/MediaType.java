package androidx.compose.foundation.content;

import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MediaType {
    public static final int $stable = 0;
    private final String representation;
    public static final Companion Companion = new Companion(null);
    private static final MediaType Text = new MediaType("text/*");
    private static final MediaType PlainText = new MediaType("text/plain");
    private static final MediaType HtmlText = new MediaType("text/html");
    private static final MediaType Image = new MediaType("image/*");
    private static final MediaType All = new MediaType("*/*");

    public MediaType(String str) {
        this.representation = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaType) {
            return q10.b(this.representation, ((MediaType) obj).representation);
        }
        return false;
    }

    public final String getRepresentation() {
        return this.representation;
    }

    public int hashCode() {
        return this.representation.hashCode();
    }

    public String toString() {
        return "MediaType(representation='" + this.representation + "')";
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final MediaType getAll() {
            return MediaType.All;
        }

        public final MediaType getHtmlText() {
            return MediaType.HtmlText;
        }

        public final MediaType getImage() {
            return MediaType.Image;
        }

        public final MediaType getPlainText() {
            return MediaType.PlainText;
        }

        public final MediaType getText() {
            return MediaType.Text;
        }

        private Companion() {
        }
    }
}
