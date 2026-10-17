package androidx.compose.foundation.content;

import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import defpackage.dq;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransferableContent {
    public static final int $stable = 8;
    private final ClipEntry clipEntry;
    private final ClipMetadata clipMetadata;
    private final PlatformTransferableContent platformTransferableContent;
    private final int source;

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i, PlatformTransferableContent platformTransferableContent, int i2, dq dqVar) {
        this(clipEntry, clipMetadata, i, (i2 & 8) != 0 ? null : platformTransferableContent, null);
    }

    public final ClipEntry getClipEntry() {
        return this.clipEntry;
    }

    public final ClipMetadata getClipMetadata() {
        return this.clipMetadata;
    }

    public final PlatformTransferableContent getPlatformTransferableContent() {
        return this.platformTransferableContent;
    }

    /* renamed from: getSource-kB6V9T0, reason: not valid java name */
    public final int m318getSourcekB6V9T0() {
        return this.source;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Source {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Keyboard = m320constructorimpl(0);
        private static final int DragAndDrop = m320constructorimpl(1);
        private static final int Clipboard = m320constructorimpl(2);

        private /* synthetic */ Source(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Source m319boximpl(int i) {
            return new Source(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m321equalsimpl(int i, Object obj) {
            return (obj instanceof Source) && i == ((Source) obj).m325unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m322equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m323hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m324toStringimpl(int i) {
            return m322equalsimpl0(i, Keyboard) ? "Source.Keyboard" : m322equalsimpl0(i, DragAndDrop) ? "Source.DragAndDrop" : m322equalsimpl0(i, Clipboard) ? "Source.Clipboard" : r6.b("Invalid (", i, ')');
        }

        public boolean equals(Object obj) {
            return m321equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m323hashCodeimpl(this.value);
        }

        public String toString() {
            return m324toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m325unboximpl() {
            return this.value;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            /* renamed from: getClipboard-kB6V9T0, reason: not valid java name */
            public final int m326getClipboardkB6V9T0() {
                return Source.Clipboard;
            }

            /* renamed from: getDragAndDrop-kB6V9T0, reason: not valid java name */
            public final int m327getDragAndDropkB6V9T0() {
                return Source.DragAndDrop;
            }

            /* renamed from: getKeyboard-kB6V9T0, reason: not valid java name */
            public final int m328getKeyboardkB6V9T0() {
                return Source.Keyboard;
            }

            private Companion() {
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m320constructorimpl(int i) {
            return i;
        }
    }

    private TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i, PlatformTransferableContent platformTransferableContent) {
        this.clipEntry = clipEntry;
        this.clipMetadata = clipMetadata;
        this.source = i;
        this.platformTransferableContent = platformTransferableContent;
    }

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i, PlatformTransferableContent platformTransferableContent, dq dqVar) {
        this(clipEntry, clipMetadata, i, platformTransferableContent);
    }
}
