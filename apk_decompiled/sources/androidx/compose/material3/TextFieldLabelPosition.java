package androidx.compose.material3;

import androidx.compose.ui.Alignment;
import defpackage.dq;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class TextFieldLabelPosition {
    public static final int $stable = 0;

    public /* synthetic */ TextFieldLabelPosition(dq dqVar) {
        this();
    }

    private TextFieldLabelPosition() {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Above extends TextFieldLabelPosition {
        public static final int $stable = 0;
        private final Alignment.Horizontal alignment;

        public /* synthetic */ Above(Alignment.Horizontal horizontal, int i, dq dqVar) {
            this((i & 1) != 0 ? Alignment.Companion.getStart() : horizontal);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Above) {
                return q10.b(this.alignment, ((Above) obj).alignment);
            }
            return false;
        }

        public final Alignment.Horizontal getAlignment() {
            return this.alignment;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        public String toString() {
            return "Above(alignment=" + this.alignment + ')';
        }

        public Above(Alignment.Horizontal horizontal) {
            super(null);
            this.alignment = horizontal;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Above() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Attached extends TextFieldLabelPosition {
        public static final int $stable = 0;
        private final boolean alwaysMinimize;
        private final Alignment.Horizontal expandedAlignment;
        private final Alignment.Horizontal minimizedAlignment;

        public /* synthetic */ Attached(boolean z, Alignment.Horizontal horizontal, Alignment.Horizontal horizontal2, int i, dq dqVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Alignment.Companion.getStart() : horizontal, (i & 4) != 0 ? Alignment.Companion.getStart() : horizontal2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Attached)) {
                return false;
            }
            Attached attached = (Attached) obj;
            return this.alwaysMinimize == attached.alwaysMinimize && q10.b(this.minimizedAlignment, attached.minimizedAlignment) && q10.b(this.expandedAlignment, attached.expandedAlignment);
        }

        public final boolean getAlwaysMinimize() {
            return this.alwaysMinimize;
        }

        public final Alignment.Horizontal getExpandedAlignment() {
            return this.expandedAlignment;
        }

        public final Alignment.Horizontal getMinimizedAlignment() {
            return this.minimizedAlignment;
        }

        public int hashCode() {
            return this.expandedAlignment.hashCode() + ((this.minimizedAlignment.hashCode() + (Boolean.hashCode(this.alwaysMinimize) * 31)) * 31);
        }

        public String toString() {
            return "Attached(alwaysMinimize=" + this.alwaysMinimize + ", minimizedAlignment=" + this.minimizedAlignment + ", expandedAlignment=" + this.expandedAlignment + ')';
        }

        public Attached() {
            this(false, null, null, 7, null);
        }

        public Attached(boolean z, Alignment.Horizontal horizontal, Alignment.Horizontal horizontal2) {
            super(null);
            this.alwaysMinimize = z;
            this.minimizedAlignment = horizontal;
            this.expandedAlignment = horizontal2;
        }
    }
}
