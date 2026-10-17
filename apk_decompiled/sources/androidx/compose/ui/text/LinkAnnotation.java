package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import defpackage.c21;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class LinkAnnotation implements AnnotatedString.Annotation {
    public static final int $stable = 0;

    public /* synthetic */ LinkAnnotation(dq dqVar) {
        this();
    }

    public abstract LinkInteractionListener getLinkInteractionListener();

    public abstract TextLinkStyles getStyles();

    private LinkAnnotation() {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Clickable extends LinkAnnotation {
        public static final int $stable = 8;
        private final LinkInteractionListener linkInteractionListener;
        private final TextLinkStyles styles;
        private final String tag;

        public Clickable(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            super(null);
            this.tag = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }

        public static /* synthetic */ Clickable copy$default(Clickable clickable, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clickable.tag;
            }
            if ((i & 2) != 0) {
                textLinkStyles = clickable.getStyles();
            }
            if ((i & 4) != 0) {
                linkInteractionListener = clickable.getLinkInteractionListener();
            }
            return clickable.copy(str, textLinkStyles, linkInteractionListener);
        }

        public final Clickable copy(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            return new Clickable(str, textLinkStyles, linkInteractionListener);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Clickable)) {
                return false;
            }
            Clickable clickable = (Clickable) obj;
            return q10.b(this.tag, clickable.tag) && q10.b(getStyles(), clickable.getStyles()) && q10.b(getLinkInteractionListener(), clickable.getLinkInteractionListener());
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public TextLinkStyles getStyles() {
            return this.styles;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int hashCode = this.tag.hashCode() * 31;
            TextLinkStyles styles = getStyles();
            int hashCode2 = (hashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = getLinkInteractionListener();
            return hashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public String toString() {
            return c21.a(new StringBuilder("LinkAnnotation.Clickable(tag="), this.tag, ')');
        }

        public /* synthetic */ Clickable(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i, dq dqVar) {
            this(str, (i & 2) != 0 ? null : textLinkStyles, linkInteractionListener);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Url extends LinkAnnotation {
        public static final int $stable = 8;
        private final LinkInteractionListener linkInteractionListener;
        private final TextLinkStyles styles;
        private final String url;

        public /* synthetic */ Url(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i, dq dqVar) {
            this(str, (i & 2) != 0 ? null : textLinkStyles, (i & 4) != 0 ? null : linkInteractionListener);
        }

        public static /* synthetic */ Url copy$default(Url url, String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener, int i, Object obj) {
            if ((i & 1) != 0) {
                str = url.url;
            }
            if ((i & 2) != 0) {
                textLinkStyles = url.getStyles();
            }
            if ((i & 4) != 0) {
                linkInteractionListener = url.getLinkInteractionListener();
            }
            return url.copy(str, textLinkStyles, linkInteractionListener);
        }

        public final Url copy(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            return new Url(str, textLinkStyles, linkInteractionListener);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return q10.b(this.url, url.url) && q10.b(getStyles(), url.getStyles()) && q10.b(getLinkInteractionListener(), url.getLinkInteractionListener());
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public LinkInteractionListener getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // androidx.compose.ui.text.LinkAnnotation
        public TextLinkStyles getStyles() {
            return this.styles;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            TextLinkStyles styles = getStyles();
            int hashCode2 = (hashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            LinkInteractionListener linkInteractionListener = getLinkInteractionListener();
            return hashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public String toString() {
            return c21.a(new StringBuilder("LinkAnnotation.Url(url="), this.url, ')');
        }

        public Url(String str, TextLinkStyles textLinkStyles, LinkInteractionListener linkInteractionListener) {
            super(null);
            this.url = str;
            this.styles = textLinkStyles;
            this.linkInteractionListener = linkInteractionListener;
        }
    }
}
