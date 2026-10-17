package androidx.compose.foundation.layout;

import defpackage.dq;
import defpackage.g30;
import defpackage.iy;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class LazyImpl implements g30 {
    public static final Companion Companion = new Companion(null);
    public static final int UNINITIALIZED_VALUE = -1;
    private int _value = -1;
    private final String errorMessage;
    private final iy initializer;

    public LazyImpl(iy iyVar, String str) {
        this.initializer = iyVar;
        this.errorMessage = str;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final iy getInitializer() {
        return this.initializer;
    }

    @Override // defpackage.g30
    public Integer getValue() {
        int i = this._value;
        if (i == -1) {
            i = ((Number) this.initializer.invoke()).intValue();
            this._value = i;
        }
        if (i != -1) {
            return Integer.valueOf(i);
        }
        o.f(this.errorMessage);
        return null;
    }

    public boolean isInitialized() {
        return this._value != -1;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue().intValue()) : this.errorMessage;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }
}
