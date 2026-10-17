package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface TypefaceResult extends State<Object> {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Async implements TypefaceResult, State<Object> {
        public static final int $stable = 0;
        private final AsyncFontListLoader current;

        public Async(AsyncFontListLoader asyncFontListLoader) {
            this.current = asyncFontListLoader;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.current.getCacheable$ui_text();
        }

        public final AsyncFontListLoader getCurrent$ui_text() {
            return this.current;
        }

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.current.getValue();
        }
    }

    boolean getCacheable();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Immutable implements TypefaceResult {
        public static final int $stable = 0;
        private final boolean cacheable;
        private final Object value;

        public /* synthetic */ Immutable(Object obj, boolean z, int i, dq dqVar) {
            this(obj, (i & 2) != 0 ? true : z);
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.cacheable;
        }

        @Override // androidx.compose.runtime.State
        public Object getValue() {
            return this.value;
        }

        public Immutable(Object obj, boolean z) {
            this.value = obj;
            this.cacheable = z;
        }
    }
}
