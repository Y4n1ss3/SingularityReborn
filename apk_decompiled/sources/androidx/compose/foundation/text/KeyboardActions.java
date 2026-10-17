package androidx.compose.foundation.text;

import defpackage.dq;
import defpackage.ky;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyboardActions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KeyboardActions Default = new KeyboardActions(null, null, null, null, null, null, 63, null);
    private final ky onDone;
    private final ky onGo;
    private final ky onNext;
    private final ky onPrevious;
    private final ky onSearch;
    private final ky onSend;

    public /* synthetic */ KeyboardActions(ky kyVar, ky kyVar2, ky kyVar3, ky kyVar4, ky kyVar5, ky kyVar6, int i, dq dqVar) {
        this((i & 1) != 0 ? null : kyVar, (i & 2) != 0 ? null : kyVar2, (i & 4) != 0 ? null : kyVar3, (i & 8) != 0 ? null : kyVar4, (i & 16) != 0 ? null : kyVar5, (i & 32) != 0 ? null : kyVar6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardActions)) {
            return false;
        }
        KeyboardActions keyboardActions = (KeyboardActions) obj;
        return this.onDone == keyboardActions.onDone && this.onGo == keyboardActions.onGo && this.onNext == keyboardActions.onNext && this.onPrevious == keyboardActions.onPrevious && this.onSearch == keyboardActions.onSearch && this.onSend == keyboardActions.onSend;
    }

    public final ky getOnDone() {
        return this.onDone;
    }

    public final ky getOnGo() {
        return this.onGo;
    }

    public final ky getOnNext() {
        return this.onNext;
    }

    public final ky getOnPrevious() {
        return this.onPrevious;
    }

    public final ky getOnSearch() {
        return this.onSearch;
    }

    public final ky getOnSend() {
        return this.onSend;
    }

    public int hashCode() {
        ky kyVar = this.onDone;
        int hashCode = (kyVar != null ? kyVar.hashCode() : 0) * 31;
        ky kyVar2 = this.onGo;
        int hashCode2 = (hashCode + (kyVar2 != null ? kyVar2.hashCode() : 0)) * 31;
        ky kyVar3 = this.onNext;
        int hashCode3 = (hashCode2 + (kyVar3 != null ? kyVar3.hashCode() : 0)) * 31;
        ky kyVar4 = this.onPrevious;
        int hashCode4 = (hashCode3 + (kyVar4 != null ? kyVar4.hashCode() : 0)) * 31;
        ky kyVar5 = this.onSearch;
        int hashCode5 = (hashCode4 + (kyVar5 != null ? kyVar5.hashCode() : 0)) * 31;
        ky kyVar6 = this.onSend;
        return hashCode5 + (kyVar6 != null ? kyVar6.hashCode() : 0);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final KeyboardActions getDefault() {
            return KeyboardActions.Default;
        }

        private Companion() {
        }

        public static /* synthetic */ void getDefault$annotations() {
        }
    }

    public KeyboardActions(ky kyVar, ky kyVar2, ky kyVar3, ky kyVar4, ky kyVar5, ky kyVar6) {
        this.onDone = kyVar;
        this.onGo = kyVar2;
        this.onNext = kyVar3;
        this.onPrevious = kyVar4;
        this.onSearch = kyVar5;
        this.onSend = kyVar6;
    }

    public KeyboardActions() {
        this(null, null, null, null, null, null, 63, null);
    }
}
