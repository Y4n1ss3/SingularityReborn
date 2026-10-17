package androidx.compose.foundation.text.input;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import defpackage.dq;
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface TextFieldLineLimits {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final TextFieldLineLimits Default;

        static {
            int i = 0;
            Default = new MultiLine(i, i, 3, null);
        }

        private Companion() {
        }

        public final TextFieldLineLimits getDefault() {
            return Default;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class SingleLine implements TextFieldLineLimits {
        public static final int $stable = 0;
        public static final SingleLine INSTANCE = new SingleLine();

        private SingleLine() {
        }

        public String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class MultiLine implements TextFieldLineLimits {
        public static final int $stable = 0;
        private final int maxHeightInLines;
        private final int minHeightInLines;

        public MultiLine(int i, int i2) {
            this.minHeightInLines = i;
            this.maxHeightInLines = i2;
            boolean z = false;
            if (1 <= i && i <= i2) {
                z = true;
            }
            if (z) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i + ", " + i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || MultiLine.class != obj.getClass()) {
                return false;
            }
            MultiLine multiLine = (MultiLine) obj;
            return this.minHeightInLines == multiLine.minHeightInLines && this.maxHeightInLines == multiLine.maxHeightInLines;
        }

        public final int getMaxHeightInLines() {
            return this.maxHeightInLines;
        }

        public final int getMinHeightInLines() {
            return this.minHeightInLines;
        }

        public int hashCode() {
            return (this.minHeightInLines * 31) + this.maxHeightInLines;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MultiLine(minHeightInLines=");
            sb.append(this.minHeightInLines);
            sb.append(", maxHeightInLines=");
            return fc.e(sb, this.maxHeightInLines, ')');
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public MultiLine() {
            this(r2, r2, 3, null);
            int i = 0;
        }

        public /* synthetic */ MultiLine(int i, int i2, int i3, dq dqVar) {
            this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? Integer.MAX_VALUE : i2);
        }
    }
}
